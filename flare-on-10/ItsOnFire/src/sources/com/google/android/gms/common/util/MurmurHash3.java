package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/util/MurmurHash3.class */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@NonNull byte[] bArr, int i2, int i3, int i4) {
        int i5 = (i3 & (-4)) + i2;
        while (i2 < i5) {
            int i6 = ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24)) * (-862048943);
            int i7 = i4 ^ (((i6 << 15) | (i6 >>> 17)) * 461845907);
            i4 = (((i7 >>> 19) | (i7 << 13)) * 5) - 430675100;
            i2 += 4;
        }
        int i8 = i3 & 3;
        int i9 = 0;
        if (i8 != 1) {
            int i10 = 0;
            if (i8 != 2) {
                if (i8 == 3) {
                    i10 = (bArr[i5 + 2] & 255) << 16;
                }
                int i11 = i4 ^ i3;
                int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
                int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
                return i13 ^ (i13 >>> 16);
            }
            i9 = i10 | ((bArr[i5 + 1] & 255) << 8);
        }
        int i14 = ((bArr[i5] & 255) | i9) * (-862048943);
        i4 ^= ((i14 >>> 17) | (i14 << 15)) * 461845907;
        int i112 = i4 ^ i3;
        int i122 = (i112 ^ (i112 >>> 16)) * (-2048144789);
        int i132 = (i122 ^ (i122 >>> 13)) * (-1028477387);
        return i132 ^ (i132 >>> 16);
    }
}
