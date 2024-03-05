package com.google.android.gms.measurement.internal;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzgu.class */
final class zzgu implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzgv zze;

    public zzgu(zzgv zzgvVar, String str, String str2, String str3, long j2) {
        this.zze = zzgvVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzir zzirVar;
        zzlh zzlhVar;
        zzlh zzlhVar2;
        String str;
        zzlh zzlhVar3;
        String str2 = this.zza;
        if (str2 == null) {
            zzlhVar3 = this.zze.zza;
            zzlhVar2 = zzlhVar3;
            str = this.zzb;
            zzirVar = null;
        } else {
            zzirVar = new zzir(this.zzc, str2, this.zzd);
            zzlhVar = this.zze.zza;
            zzlhVar2 = zzlhVar;
            str = this.zzb;
        }
        zzlhVar2.zzR(str, zzirVar);
    }
}
