package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzu.class */
public final class zzu extends zzai {
    private final Callable zza;

    public zzu(String str, Callable callable) {
        super("internal.appMetadata");
        this.zza = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        try {
            return zzi.zzb(this.zza.call());
        } catch (Exception e2) {
            return zzap.zzf;
        }
    }
}
