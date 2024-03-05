package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
@RequiresApi(19)
/* loaded from: ItsOnFire.jar:androidx/profileinstaller/ProfileTranscoder.class */
class ProfileTranscoder {
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    public static final byte[] MAGIC_PROF = {112, 114, 111, 0};
    public static final byte[] MAGIC_PROFM = {112, 114, 109, 0};
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    private ProfileTranscoder() {
    }

    @NonNull
    private static byte[] createCompressibleBody(@NonNull DexProfileData[] dexProfileDataArr, @NonNull byte[] bArr) throws IOException {
        int i2 = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            i2 += Encoding.utf8Length(generateDexKey(dexProfileData.apkName, dexProfileData.dexName, bArr)) + 16 + (dexProfileData.classSetSize * 2) + dexProfileData.hotMethodRegionSize + getMethodBitmapStorageSize(dexProfileData.numMethodIds);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, ProfileVersion.V009_O_MR1)) {
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                writeLineHeader(byteArrayOutputStream, dexProfileData2, generateDexKey(dexProfileData2.apkName, dexProfileData2.dexName, bArr));
                writeLineData(byteArrayOutputStream, dexProfileData2);
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                writeLineHeader(byteArrayOutputStream, dexProfileData3, generateDexKey(dexProfileData3.apkName, dexProfileData3.dexName, bArr));
            }
            for (DexProfileData dexProfileData4 : dexProfileDataArr) {
                writeLineData(byteArrayOutputStream, dexProfileData4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw Encoding.error("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    @NonNull
    private static String generateDexKey(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        if (str2.equals("classes.dex")) {
            return str;
        }
        return str + ProfileVersion.dexKeySeparator(bArr) + str2;
    }

    private static int getMethodBitmapStorageSize(int i2) {
        return roundUpToByte(i2 * 2) / 8;
    }

    private static int methodFlagBitmapIndex(int i2, int i3, int i4) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 4) {
                    return i3 + i4;
                }
                throw Encoding.error("Unexpected flag: " + i2);
            }
            return i3;
        }
        throw Encoding.error("HOT methods are not stored in the bitmap");
    }

    private static void readClasses(@NonNull InputStream inputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        int i2 = 0;
        for (int i3 = 0; i3 < dexProfileData.classSetSize; i3++) {
            i2 += Encoding.readUInt16(inputStream);
            dexProfileData.classes[i3] = i2;
        }
    }

    private static int readFlagsFromBitmap(@NonNull BitSet bitSet, int i2, int i3) {
        int i4 = 2;
        if (!bitSet.get(methodFlagBitmapIndex(2, i2, i3))) {
            i4 = 0;
        }
        int i5 = i4;
        if (bitSet.get(methodFlagBitmapIndex(4, i2, i3))) {
            i5 = i4 | 4;
        }
        return i5;
    }

    public static byte[] readHeader(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, Encoding.read(inputStream, bArr.length))) {
            return Encoding.read(inputStream, ProfileVersion.V010_P.length);
        }
        throw Encoding.error("Invalid magic");
    }

    private static void readHotMethodRegion(@NonNull InputStream inputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        int available = inputStream.available() - dexProfileData.hotMethodRegionSize;
        int i2 = 0;
        while (inputStream.available() > available) {
            int readUInt16 = i2 + Encoding.readUInt16(inputStream);
            dexProfileData.methods.put(Integer.valueOf(readUInt16), 1);
            int readUInt162 = Encoding.readUInt16(inputStream);
            while (true) {
                i2 = readUInt16;
                if (readUInt162 > 0) {
                    skipInlineCache(inputStream);
                    readUInt162--;
                }
            }
        }
        if (inputStream.available() != available) {
            throw Encoding.error("Read too much data during profile line parse");
        }
    }

    @NonNull
    public static DexProfileData[] readMeta(@NonNull InputStream inputStream, @NonNull byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.METADATA_V001_N)) {
            int readUInt8 = Encoding.readUInt8(inputStream);
            byte[] readCompressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
                try {
                    DexProfileData[] readMetadataForNBody = readMetadataForNBody(byteArrayInputStream, readUInt8, dexProfileDataArr);
                    byteArrayInputStream.close();
                    return readMetadataForNBody;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw Encoding.error("Content found after the end of file");
        }
        throw Encoding.error("Unsupported meta version");
    }

    @NonNull
    private static DexProfileData[] readMetadataForNBody(@NonNull InputStream inputStream, int i2, DexProfileData[] dexProfileDataArr) throws IOException {
        int i3;
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 == dexProfileDataArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    break;
                }
                int readUInt16 = Encoding.readUInt16(inputStream);
                iArr[i4] = Encoding.readUInt16(inputStream);
                strArr[i4] = Encoding.readString(inputStream, readUInt16);
                i4++;
            }
            for (i3 = 0; i3 < i2; i3++) {
                DexProfileData dexProfileData = dexProfileDataArr[i3];
                if (!dexProfileData.dexName.equals(strArr[i3])) {
                    throw Encoding.error("Order of dexfiles in metadata did not match baseline");
                }
                int i5 = iArr[i3];
                dexProfileData.classSetSize = i5;
                dexProfileData.classes = new int[i5];
                readClasses(inputStream, dexProfileData);
            }
            return dexProfileDataArr;
        }
        throw Encoding.error("Mismatched number of dex files found in metadata");
    }

    private static void readMethodBitmap(@NonNull InputStream inputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        BitSet valueOf = BitSet.valueOf(Encoding.read(inputStream, Encoding.bitsToBytes(dexProfileData.numMethodIds * 2)));
        int i2 = 0;
        while (true) {
            int i3 = dexProfileData.numMethodIds;
            if (i2 >= i3) {
                return;
            }
            int readFlagsFromBitmap = readFlagsFromBitmap(valueOf, i2, i3);
            if (readFlagsFromBitmap != 0) {
                Integer num = dexProfileData.methods.get(Integer.valueOf(i2));
                Integer num2 = num;
                if (num == null) {
                    num2 = 0;
                }
                dexProfileData.methods.put(Integer.valueOf(i2), Integer.valueOf(readFlagsFromBitmap | num2.intValue()));
            }
            i2++;
        }
    }

    @NonNull
    public static DexProfileData[] readProfile(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.V010_P)) {
            int readUInt8 = Encoding.readUInt8(inputStream);
            byte[] readCompressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
                try {
                    DexProfileData[] readUncompressedBody = readUncompressedBody(byteArrayInputStream, str, readUInt8);
                    byteArrayInputStream.close();
                    return readUncompressedBody;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw Encoding.error("Content found after the end of file");
        }
        throw Encoding.error("Unsupported version");
    }

    @NonNull
    private static DexProfileData[] readUncompressedBody(@NonNull InputStream inputStream, @NonNull String str, int i2) throws IOException {
        int i3;
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i2];
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            int readUInt16 = Encoding.readUInt16(inputStream);
            int readUInt162 = Encoding.readUInt16(inputStream);
            dexProfileDataArr[i4] = new DexProfileData(str, Encoding.readString(inputStream, readUInt16), Encoding.readUInt32(inputStream), readUInt162, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream), new int[readUInt162], new TreeMap());
            i4++;
        }
        for (i3 = 0; i3 < i2; i3++) {
            DexProfileData dexProfileData = dexProfileDataArr[i3];
            readHotMethodRegion(inputStream, dexProfileData);
            readClasses(inputStream, dexProfileData);
            readMethodBitmap(inputStream, dexProfileData);
        }
        return dexProfileDataArr;
    }

    private static int roundUpToByte(int i2) {
        return ((i2 + 8) - 1) & (-8);
    }

    private static void setMethodBitmapBit(@NonNull byte[] bArr, int i2, int i3, @NonNull DexProfileData dexProfileData) {
        int methodFlagBitmapIndex = methodFlagBitmapIndex(i2, i3, dexProfileData.numMethodIds);
        int i4 = methodFlagBitmapIndex / 8;
        bArr[i4] = (byte) ((1 << (methodFlagBitmapIndex % 8)) | bArr[i4]);
    }

    private static void skipInlineCache(@NonNull InputStream inputStream) throws IOException {
        Encoding.readUInt16(inputStream);
        int readUInt8 = Encoding.readUInt8(inputStream);
        if (readUInt8 == 6) {
            return;
        }
        if (readUInt8 == 7) {
            return;
        }
        for (int i2 = readUInt8; i2 > 0; i2--) {
            Encoding.readUInt8(inputStream);
            for (int readUInt82 = Encoding.readUInt8(inputStream); readUInt82 > 0; readUInt82--) {
                Encoding.readUInt16(inputStream);
            }
        }
    }

    public static boolean transcodeAndWriteBody(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.V010_P)) {
            writeProfileForP(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.V005_O)) {
            writeProfileForO(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.V009_O_MR1)) {
            writeProfileForO_MR1(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.V001_N)) {
            writeProfileForN(outputStream, dexProfileDataArr);
            return true;
        } else {
            return false;
        }
    }

    private static void writeClasses(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        int i2 = 0;
        for (int i3 : dexProfileData.classes) {
            Integer valueOf = Integer.valueOf(i3);
            Encoding.writeUInt16(outputStream, valueOf.intValue() - i2);
            i2 = valueOf.intValue();
        }
    }

    public static void writeHeader(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(MAGIC_PROF);
        outputStream.write(bArr);
    }

    private static void writeLineData(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        writeMethodsWithInlineCaches(outputStream, dexProfileData);
        writeClasses(outputStream, dexProfileData);
        writeMethodBitmap(outputStream, dexProfileData);
    }

    private static void writeLineHeader(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData, @NonNull String str) throws IOException {
        Encoding.writeUInt16(outputStream, Encoding.utf8Length(str));
        Encoding.writeUInt16(outputStream, dexProfileData.classSetSize);
        Encoding.writeUInt32(outputStream, dexProfileData.hotMethodRegionSize);
        Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
        Encoding.writeUInt32(outputStream, dexProfileData.numMethodIds);
        Encoding.writeString(outputStream, str);
    }

    private static void writeMethodBitmap(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        byte[] bArr = new byte[getMethodBitmapStorageSize(dexProfileData.numMethodIds)];
        for (Map.Entry<Integer, Integer> entry : dexProfileData.methods.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                setMethodBitmapBit(bArr, 2, intValue, dexProfileData);
            }
            if ((intValue2 & 4) != 0) {
                setMethodBitmapBit(bArr, 4, intValue, dexProfileData);
            }
        }
        outputStream.write(bArr);
    }

    private static void writeMethodsWithInlineCaches(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        int i2 = 0;
        for (Map.Entry<Integer, Integer> entry : dexProfileData.methods.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                Encoding.writeUInt16(outputStream, intValue - i2);
                Encoding.writeUInt16(outputStream, 0);
                i2 = intValue;
            }
        }
    }

    private static void writeProfileForN(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        Encoding.writeUInt16(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V001_N);
            Encoding.writeUInt16(outputStream, Encoding.utf8Length(generateDexKey));
            Encoding.writeUInt16(outputStream, dexProfileData.methods.size());
            Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            Encoding.writeString(outputStream, generateDexKey);
            for (Integer num : dexProfileData.methods.keySet()) {
                Encoding.writeUInt16(outputStream, num.intValue());
            }
            for (int i2 : dexProfileData.classes) {
                Encoding.writeUInt16(outputStream, i2);
            }
        }
    }

    private static void writeProfileForO(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            int size = dexProfileData.methods.size();
            String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V005_O);
            Encoding.writeUInt16(outputStream, Encoding.utf8Length(generateDexKey));
            Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            Encoding.writeUInt32(outputStream, size * 4);
            Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            Encoding.writeString(outputStream, generateDexKey);
            for (Integer num : dexProfileData.methods.keySet()) {
                Encoding.writeUInt16(outputStream, num.intValue());
                Encoding.writeUInt16(outputStream, 0);
            }
            for (int i2 : dexProfileData.classes) {
                Encoding.writeUInt16(outputStream, i2);
            }
        }
    }

    private static void writeProfileForO_MR1(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, ProfileVersion.V009_O_MR1);
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        Encoding.writeCompressed(outputStream, createCompressibleBody);
    }

    private static void writeProfileForP(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, ProfileVersion.V010_P);
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        Encoding.writeCompressed(outputStream, createCompressibleBody);
    }
}
