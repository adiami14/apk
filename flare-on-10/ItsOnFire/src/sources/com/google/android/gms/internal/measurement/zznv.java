package com.google.android.gms.internal.measurement;

import androidx.appcompat.R;
import kotlin.jvm.internal.CharCompanionObject;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zznv.class */
final class zznv {
    public static /* bridge */ /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (zze(b3) || (((b2 << 28) + (b3 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)) >> 30) != 0 || zze(b4) || zze(b5)) {
            throw zzll.zzc();
        }
        int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i2] = (char) ((i3 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((i3 & 1023) + CharCompanionObject.MIN_LOW_SURROGATE);
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!zze(b3)) {
            byte b5 = b2;
            if (b2 == -32) {
                if (b3 >= -96) {
                    b5 = -32;
                }
            }
            byte b6 = b5;
            if (b5 == -19) {
                if (b3 < -96) {
                    b6 = -19;
                }
            }
            if (!zze(b4)) {
                cArr[i2] = (char) (((b6 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw zzll.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 < -62 || zze(b3)) {
            throw zzll.zzc();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }
}
