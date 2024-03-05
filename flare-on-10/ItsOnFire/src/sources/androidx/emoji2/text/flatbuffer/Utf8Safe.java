package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import java.nio.ByteBuffer;
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/Utf8Safe.class */
public final class Utf8Safe extends Utf8 {

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/Utf8Safe$UnpairedSurrogateException.class */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int i2;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            i2 = i4;
            if (i3 < length) {
                char charAt = charSequence.charAt(i3);
                if (charAt >= 2048) {
                    i2 = i4 + encodedLengthGeneral(charSequence, i3);
                    break;
                }
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    public static String decodeUtf8Array(byte[] bArr, int i2, int i3) {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (!Utf8.DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            int i7 = i2;
            int i8 = i6;
            while (i7 < i4) {
                int i9 = i7 + 1;
                byte b3 = bArr[i7];
                if (Utf8.DecodeUtil.isOneByte(b3)) {
                    Utf8.DecodeUtil.handleOneByte(b3, cArr, i8);
                    i8++;
                    i7 = i9;
                    while (i7 < i4) {
                        byte b4 = bArr[i7];
                        if (!Utf8.DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i7++;
                        Utf8.DecodeUtil.handleOneByte(b4, cArr, i8);
                        i8++;
                    }
                } else if (Utf8.DecodeUtil.isTwoBytes(b3)) {
                    if (i9 >= i4) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    Utf8.DecodeUtil.handleTwoBytes(b3, bArr[i9], cArr, i8);
                    i7 = i9 + 1;
                    i8++;
                } else if (Utf8.DecodeUtil.isThreeBytes(b3)) {
                    if (i9 >= i4 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i10 = i9 + 1;
                    Utf8.DecodeUtil.handleThreeBytes(b3, bArr[i9], bArr[i10], cArr, i8);
                    i7 = i10 + 1;
                    i8++;
                } else if (i9 >= i4 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                } else {
                    int i11 = i9 + 1;
                    byte b5 = bArr[i9];
                    int i12 = i11 + 1;
                    Utf8.DecodeUtil.handleFourBytes(b3, b5, bArr[i11], bArr[i12], cArr, i8);
                    i7 = i12 + 1;
                    i8 = i8 + 1 + 1;
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i2, int i3) {
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = byteBuffer.get(i2);
                if (!Utf8.DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            int i7 = i2;
            int i8 = i6;
            while (i7 < i4) {
                int i9 = i7 + 1;
                byte b3 = byteBuffer.get(i7);
                if (Utf8.DecodeUtil.isOneByte(b3)) {
                    Utf8.DecodeUtil.handleOneByte(b3, cArr, i8);
                    i8++;
                    i7 = i9;
                    while (i7 < i4) {
                        byte b4 = byteBuffer.get(i7);
                        if (!Utf8.DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i7++;
                        Utf8.DecodeUtil.handleOneByte(b4, cArr, i8);
                        i8++;
                    }
                } else if (Utf8.DecodeUtil.isTwoBytes(b3)) {
                    if (i9 >= i4) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    Utf8.DecodeUtil.handleTwoBytes(b3, byteBuffer.get(i9), cArr, i8);
                    i7 = i9 + 1;
                    i8++;
                } else if (Utf8.DecodeUtil.isThreeBytes(b3)) {
                    if (i9 >= i4 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i10 = i9 + 1;
                    Utf8.DecodeUtil.handleThreeBytes(b3, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i8);
                    i7 = i10 + 1;
                    i8++;
                } else if (i9 >= i4 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                } else {
                    int i11 = i9 + 1;
                    byte b5 = byteBuffer.get(i9);
                    int i12 = i11 + 1;
                    Utf8.DecodeUtil.handleFourBytes(b3, b5, byteBuffer.get(i11), byteBuffer.get(i12), cArr, i8);
                    i7 = i12 + 1;
                    i8 = i8 + 1 + 1;
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char charAt;
        int length = charSequence.length();
        int i7 = i3 + i2;
        int i8 = 0;
        while (i8 < length && (i6 = i8 + i2) < i7 && (charAt = charSequence.charAt(i8)) < 128) {
            bArr[i6] = (byte) charAt;
            i8++;
        }
        if (i8 == length) {
            return i2 + length;
        }
        int i9 = i2 + i8;
        int i10 = i8;
        while (i10 < length) {
            char charAt2 = charSequence.charAt(i10);
            if (charAt2 < 128 && i9 < i7) {
                i4 = i9 + 1;
                bArr[i9] = (byte) charAt2;
            } else if (charAt2 < 2048 && i9 <= i7 - 2) {
                int i11 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 >= 55296 && 57343 >= charAt2) || i9 > i7 - 3) {
                if (i9 > i7 - 4) {
                    if (55296 > charAt2 || charAt2 > 57343 || ((i5 = i10 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i5)))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i9);
                    }
                    throw new UnpairedSurrogateException(i10, length);
                }
                int i12 = i10 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i9 + 1;
                        bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i10 = i12;
                        i4 = i15 + 1;
                    } else {
                        i10 = i12;
                    }
                }
                throw new UnpairedSurrogateException(i10 - 1, length);
            } else {
                int i16 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 >>> '\f') | 480);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 & '?') | 128);
            }
            i10++;
            i9 = i4;
        }
        return i9;
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i2;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i3 = 0;
        while (i3 < length) {
            i2 = position;
            try {
                char charAt = charSequence.charAt(i3);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i3, (byte) charAt);
                i3++;
            } catch (IndexOutOfBoundsException e2) {
                i3 = i3;
                int position2 = byteBuffer.position();
                int max = Math.max(i3, (i2 - byteBuffer.position()) + 1);
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (position2 + max));
            }
        }
        if (i3 == length) {
            byteBuffer.position(position + i3);
            return;
        }
        int i4 = position + i3;
        while (i3 < length) {
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < 128) {
                byteBuffer.put(i4, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i5 = i4 + 1;
                try {
                    byteBuffer.put(i4, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i5, (byte) ((charAt2 & '?') | 128));
                    i4 = i5;
                } catch (IndexOutOfBoundsException e3) {
                    i2 = i5;
                    int position22 = byteBuffer.position();
                    int max2 = Math.max(i3, (i2 - byteBuffer.position()) + 1);
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (position22 + max2));
                }
            } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                int i6 = i3 + 1;
                if (i6 != length) {
                    int i7 = i4;
                    try {
                        char charAt3 = charSequence.charAt(i6);
                        int i8 = i4;
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i9 = i4;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i10 = i4 + 1;
                            i7 = i10;
                            try {
                                byteBuffer.put(i4, (byte) ((codePoint >>> 18) | 240));
                                int i11 = i10 + 1;
                                byteBuffer.put(i10, (byte) (((codePoint >>> 12) & 63) | 128));
                                i4 = i11 + 1;
                                byteBuffer.put(i11, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                i3 = i6;
                            } catch (IndexOutOfBoundsException e4) {
                                i2 = i7;
                                i3 = i6;
                                int position222 = byteBuffer.position();
                                int max22 = Math.max(i3, (i2 - byteBuffer.position()) + 1);
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i3) + " at index " + (position222 + max22));
                            }
                        } else {
                            i3 = i6;
                        }
                    } catch (IndexOutOfBoundsException e5) {
                    }
                }
                int i12 = i4;
                UnpairedSurrogateException unpairedSurrogateException = new UnpairedSurrogateException(i3, length);
                int i13 = i4;
                throw unpairedSurrogateException;
            } else {
                int i14 = i4 + 1;
                byteBuffer.put(i4, (byte) ((charAt2 >>> '\f') | 224));
                i4 = i14 + 1;
                byteBuffer.put(i14, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(i4, (byte) ((charAt2 & '?') | 128));
            }
            i3++;
            i4++;
        }
        byteBuffer.position(i4);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3 = i2;
            } else {
                int i5 = i4 + 2;
                i4 = i5;
                i3 = i2;
                if (55296 <= charAt) {
                    i4 = i5;
                    i3 = i2;
                    if (charAt > 57343) {
                        continue;
                    } else if (Character.codePointAt(charSequence, i2) < 65536) {
                        throw new UnpairedSurrogateException(i2, length);
                    } else {
                        i3 = i2 + 1;
                        i4 = i5;
                    }
                } else {
                    continue;
                }
            }
            i2 = i3 + 1;
        }
        return i4;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3) : decodeUtf8Buffer(byteBuffer, i2, i3);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            encodeUtf8Buffer(charSequence, byteBuffer);
            return;
        }
        int arrayOffset = byteBuffer.arrayOffset();
        byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
