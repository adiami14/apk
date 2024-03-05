package com.google.android.gms.common;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/zzd.class */
final class zzd {
    public static int zza(int i2) {
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = new int[]{1, 2, 3}[i3];
            if (i4 == 0) {
                throw null;
            }
            if (i4 - 1 == i2) {
                return i4;
            }
        }
        return 1;
    }
}
