package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzhn.class */
public final class zzhn implements Runnable {
    public final /* synthetic */ zzik zza;

    public zzhn(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzb();
    }
}
