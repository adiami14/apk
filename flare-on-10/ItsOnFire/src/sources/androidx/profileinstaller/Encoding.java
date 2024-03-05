package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
@RequiresApi(19)
/* loaded from: ItsOnFire.jar:androidx/profileinstaller/Encoding.class */
class Encoding {
    public static final int SIZEOF_BYTE = 8;
    public static final int UINT_16_SIZE = 2;
    public static final int UINT_32_SIZE = 4;
    public static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    public static int bitsToBytes(int i2) {
        return (((i2 + 8) - 1) & (-8)) / 8;
    }

    @NonNull
    public static RuntimeException error(@Nullable String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    public static byte[] read(@NonNull InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                return bArr;
            }
            int read = inputStream.read(bArr, i4, i2 - i4);
            if (read < 0) {
                throw error("Not enough bytes to read: " + i2);
            }
            i3 = i4 + read;
        }
    }

    @NonNull
    public static byte[] readCompressed(@NonNull InputStream inputStream, int i2, int i3) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = inputStream.read(bArr2);
                if (read < 0) {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw error(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw error("Inflater did not finish");
            }
            throw error("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    @NonNull
    public static String readString(InputStream inputStream, int i2) throws IOException {
        return new String(read(inputStream, i2), StandardCharsets.UTF_8);
    }

    public static long readUInt(@NonNull InputStream inputStream, int i2) throws IOException {
        byte[] read = read(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (read[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static int readUInt16(@NonNull InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 2);
    }

    public static long readUInt32(@NonNull InputStream inputStream) throws IOException {
        return readUInt(inputStream, 4);
    }

    public static int readUInt8(@NonNull InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 1);
    }

    public static int utf8Length(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void writeAll(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static void writeCompressed(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        writeUInt32(outputStream, bArr.length);
        Deflater deflater = new Deflater(1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            writeUInt32(outputStream, byteArray.length);
            outputStream.write(byteArray);
        } finally {
            deflater.end();
        }
    }

    public static void writeString(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void writeUInt(@NonNull OutputStream outputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void writeUInt16(@NonNull OutputStream outputStream, int i2) throws IOException {
        writeUInt(outputStream, i2, 2);
    }

    public static void writeUInt32(@NonNull OutputStream outputStream, long j2) throws IOException {
        writeUInt(outputStream, j2, 4);
    }

    public static void writeUInt8(@NonNull OutputStream outputStream, int i2) throws IOException {
        writeUInt(outputStream, i2, 1);
    }
}
