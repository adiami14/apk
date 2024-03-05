package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzih.class */
public final class zzih extends zzif {
    public static boolean zza(@CheckForNull Object obj, @CheckForNull Object obj2) {
        boolean z = false;
        if (obj != obj2) {
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }
}
