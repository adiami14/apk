package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzc.class */
public final class zzc implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, long j2) {
        this.zzb = zzdVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzj(this.zza);
    }
}
