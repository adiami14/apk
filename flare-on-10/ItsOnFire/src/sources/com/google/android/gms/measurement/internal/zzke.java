package com.google.android.gms.measurement.internal;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzke.class */
final class zzke implements Runnable {
    public final /* synthetic */ zzlh zza;
    public final /* synthetic */ Runnable zzb;

    public zzke(zzkg zzkgVar, zzlh zzlhVar, Runnable runnable) {
        this.zza = zzlhVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzX();
    }
}
