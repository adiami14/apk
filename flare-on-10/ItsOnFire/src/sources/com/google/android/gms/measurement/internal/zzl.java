package com.google.android.gms.measurement.internal;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzl.class */
final class zzl implements Runnable {
    public final /* synthetic */ zzo zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, zzo zzoVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzq().zzT(this.zza);
    }
}
