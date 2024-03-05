package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzlg.class */
public final class zzlg {
    public final String zza;
    public long zzb;

    private zzlg(zzlh zzlhVar, String str) {
        this.zza = str;
        this.zzb = zzlhVar.zzax().elapsedRealtime();
    }
}
