package com.google.android.gms.common;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/zzy.class */
final class zzy {
    public static int zza(int i2) {
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = new int[]{1, 2, 3, 4, 5, 6}[i3];
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
