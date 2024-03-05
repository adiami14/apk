package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zznz.class */
public final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zznw zzb;

    static {
        if (zznu.zzx() && zznu.zzy()) {
            int i2 = zzjm.zza;
        }
        zzb = new zznx();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r0 > (-12)) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ int zza(byte[] r4, int r5, int r6) {
        /*
            r0 = r6
            r1 = r5
            int r0 = r0 - r1
            r7 = r0
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L6b
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L4e
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L46
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r7 = r0
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r5 = r0
            r0 = r6
            r1 = -12
            if (r0 > r1) goto L73
            r0 = r7
            r1 = -65
            if (r0 > r1) goto L73
            r0 = r5
            r1 = -65
            if (r0 <= r1) goto L37
            goto L73
        L37:
            r0 = r7
            r1 = 8
            int r0 = r0 << r1
            r1 = r6
            r0 = r0 ^ r1
            r1 = r5
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r5 = r0
            goto L75
        L46:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L4e:
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r5 = r0
            r0 = r6
            r1 = -12
            if (r0 > r1) goto L73
            r0 = r5
            r1 = -65
            if (r0 <= r1) goto L61
            goto L73
        L61:
            r0 = r6
            r1 = r5
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r5 = r0
            goto L75
        L6b:
            r0 = r6
            r5 = r0
            r0 = r6
            r1 = -12
            if (r0 <= r1) goto L75
        L73:
            r0 = -1
            r5 = r0
        L75:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznz.zza(byte[], int, int):int");
    }

    public static int zzb(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt;
        int length = charSequence.length();
        int i8 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i8 >= length || (i7 = i8 + i2) >= i4 || (charAt = charSequence.charAt(i8)) >= 128) {
                break;
            }
            bArr[i7] = (byte) charAt;
            i8++;
        }
        if (i8 != length) {
            int i9 = i2 + i8;
            int i10 = i8;
            while (true) {
                i5 = i9;
                if (i10 >= length) {
                    break;
                }
                char charAt2 = charSequence.charAt(i10);
                if (charAt2 < 128 && i9 < i4) {
                    bArr[i9] = (byte) charAt2;
                    i9++;
                } else if (charAt2 < 2048 && i9 <= i4 - 2) {
                    int i11 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                    i9 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 < 55296 || charAt2 > 57343) && i9 <= i4 - 3) {
                    int i12 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 >>> '\f') | 480);
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i9 = i13 + 1;
                    bArr[i13] = (byte) ((charAt2 & '?') | 128);
                } else if (i9 > i4 - 4) {
                    if (charAt2 < 55296 || charAt2 > 57343 || ((i6 = i10 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i6)))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i9);
                    }
                    throw new zzny(i10, length);
                } else {
                    int i14 = i10 + 1;
                    if (i14 == charSequence.length()) {
                        break;
                    }
                    char charAt3 = charSequence.charAt(i14);
                    if (!Character.isSurrogatePair(charAt2, charAt3)) {
                        i10 = i14;
                        break;
                    }
                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                    int i15 = i9 + 1;
                    bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((codePoint >>> 12) & 63) | 128);
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) (((codePoint >>> 6) & 63) | 128);
                    i9 = i17 + 1;
                    bArr[i17] = (byte) ((codePoint & 63) | 128);
                    i10 = i14;
                }
                i10++;
            }
            throw new zzny(i10 - 1, length);
        }
        i5 = i2 + length;
        return i5;
    }

    public static int zzc(CharSequence charSequence) {
        int i2;
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            i2 = i5;
            if (i4 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                int length2 = charSequence.length();
                int i6 = 0;
                while (i4 < length2) {
                    char charAt2 = charSequence.charAt(i4);
                    if (charAt2 < 2048) {
                        i6 += (127 - charAt2) >>> 31;
                        i3 = i4;
                    } else {
                        int i7 = i6 + 2;
                        i6 = i7;
                        i3 = i4;
                        if (charAt2 >= 55296) {
                            i6 = i7;
                            i3 = i4;
                            if (charAt2 > 57343) {
                                continue;
                            } else if (Character.codePointAt(charSequence, i4) < 65536) {
                                throw new zzny(i4, length2);
                            } else {
                                i3 = i4 + 1;
                                i6 = i7;
                            }
                        } else {
                            continue;
                        }
                    }
                    i4 = i3 + 1;
                }
                i2 = i5 + i6;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    public static boolean zzd(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zze(byte[] bArr, int i2, int i3) {
        return zzb.zzb(bArr, i2, i3);
    }
}
