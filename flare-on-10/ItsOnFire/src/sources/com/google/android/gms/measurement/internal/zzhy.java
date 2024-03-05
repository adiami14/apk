package com.google.android.gms.measurement.internal;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzhy.class */
final class zzhy implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    public final /* synthetic */ zzik zzb;

    public zzhy(zzik zzikVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zzikVar;
        this.zza = zzcfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            r0 = r5
            com.google.android.gms.measurement.internal.zzik r0 = r0.zzb
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzkp r0 = r0.zzu()
            r6 = r0
            boolean r0 = com.google.android.gms.internal.measurement.zzqr.zzc()
            r0 = r6
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            r1 = 0
            com.google.android.gms.measurement.internal.zzef r2 = com.google.android.gms.measurement.internal.zzeg.zzau
            boolean r0 = r0.zzs(r1, r2)
            if (r0 == 0) goto L86
            r0 = r6
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhb r0 = r0.zzc()
            com.google.android.gms.measurement.internal.zzha r1 = com.google.android.gms.measurement.internal.zzha.ANALYTICS_STORAGE
            boolean r0 = r0.zzj(r1)
            if (r0 != 0) goto L44
            r0 = r6
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzl()
            r6 = r0
            java.lang.String r0 = "Analytics storage consent denied; will not get session id"
            r7 = r0
            goto L94
        L44:
            r0 = r6
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzm()
            r1 = r6
            com.google.android.gms.measurement.internal.zzgd r1 = r1.zzt
            com.google.android.gms.common.util.Clock r1 = r1.zzax()
            long r1 = r1.currentTimeMillis()
            boolean r0 = r0.zzk(r1)
            if (r0 != 0) goto L99
            r0 = r6
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzfe r0 = r0.zzk
            long r0 = r0.zza()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L72
            goto L99
        L72:
            r0 = r6
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzfe r0 = r0.zzk
            long r0 = r0.zza()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6 = r0
            goto L9b
        L86:
            r0 = r6
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzl()
            r6 = r0
            java.lang.String r0 = "getSessionId has been disabled."
            r7 = r0
        L94:
            r0 = r6
            r1 = r7
            r0.zza(r1)
        L99:
            r0 = 0
            r6 = r0
        L9b:
            r0 = r6
            if (r0 == 0) goto Lb5
            r0 = r5
            com.google.android.gms.measurement.internal.zzik r0 = r0.zzb
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzlp r0 = r0.zzv()
            r1 = r5
            com.google.android.gms.internal.measurement.zzcf r1 = r1.zza
            r2 = r6
            long r2 = r2.longValue()
            r0.zzV(r1, r2)
            return
        Lb5:
            r0 = r5
            com.google.android.gms.internal.measurement.zzcf r0 = r0.zza     // Catch: android.os.RemoteException -> Lc0
            r1 = 0
            r0.zze(r1)     // Catch: android.os.RemoteException -> Lc0
            return
        Lc0:
            r6 = move-exception
            r0 = r5
            com.google.android.gms.measurement.internal.zzik r0 = r0.zzb
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzd()
            java.lang.String r1 = "getSessionId failed with exception"
            r2 = r6
            r0.zzb(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhy.run():void");
    }
}
