package com.google.android.gms.internal.measurement;

import android.os.Binder;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhi.class */
public final /* synthetic */ class zzhi {
    public static Object zza(zzhj zzhjVar) {
        Object zza;
        try {
            zza = zzhjVar.zza();
        } catch (SecurityException e2) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                zza = zzhjVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return zza;
    }
}
