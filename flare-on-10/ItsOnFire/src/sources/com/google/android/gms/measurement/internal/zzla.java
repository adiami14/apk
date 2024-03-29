package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzla.class */
public final class zzla implements Callable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzlh zzb;

    public zzla(zzlh zzlhVar, zzq zzqVar) {
        this.zzb = zzlhVar;
        this.zza = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        String str;
        zzhb zzq = this.zzb.zzq((String) Preconditions.checkNotNull(this.zza.zza));
        zzha zzhaVar = zzha.ANALYTICS_STORAGE;
        if (zzq.zzj(zzhaVar) && zzhb.zzc(this.zza.zzv, 100).zzj(zzhaVar)) {
            str = this.zzb.zzd(this.zza).zzw();
        } else {
            this.zzb.zzaA().zzj().zza("Analytics storage consent denied. Returning null app instance id");
            str = null;
        }
        return str;
    }
}
