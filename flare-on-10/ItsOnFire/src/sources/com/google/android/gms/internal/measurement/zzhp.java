package com.google.android.gms.internal.measurement;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhp.class */
public final class zzhp {
    public static volatile zzii zza = zzii.zzc();
    private static final Object zzb = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(13:19|(6:21|22|(2:24|25)|27|28|29)|30|31|32|33|34|35|36|(2:38|39)|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(android.content.Context r4, android.net.Uri r5) {
        /*
            r0 = r5
            java.lang.String r0 = r0.getAuthority()
            r5 = r0
            java.lang.String r0 = "com.google.android.gms.phenotype"
            r1 = r5
            boolean r0 = r0.equals(r1)
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L23
            java.lang.String r0 = "PhenotypeClientHelper"
            r1 = r5
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r1 = r1.concat(r2)
            int r0 = android.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L23:
            com.google.android.gms.internal.measurement.zzii r0 = com.google.android.gms.internal.measurement.zzhp.zza
            boolean r0 = r0.zzb()
            if (r0 == 0) goto L39
        L2c:
            com.google.android.gms.internal.measurement.zzii r0 = com.google.android.gms.internal.measurement.zzhp.zza
            java.lang.Object r0 = r0.zza()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L39:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzhp.zzb
            r5 = r0
            r0 = r5
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzii r0 = com.google.android.gms.internal.measurement.zzhp.zza     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r0.zzb()     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L59
            com.google.android.gms.internal.measurement.zzii r0 = com.google.android.gms.internal.measurement.zzhp.zza     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb3
            r6 = r0
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            r0 = r6
            return r0
        L59:
            java.lang.String r0 = "com.google.android.gms"
            r1 = r4
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto L88
            r0 = r4
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "com.google.android.gms.phenotype"
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            if (r0 == 0) goto La4
            r0 = r7
            r6 = r0
            java.lang.String r0 = "com.google.android.gms"
            r1 = r8
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto La4
        L88:
            r0 = r4
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Lb3
            r4 = r0
            r0 = r4
            java.lang.String r1 = "com.google.android.gms"
            r2 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: java.lang.Throwable -> Lb3 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r4 = r0
            r0 = r7
            r6 = r0
            r0 = r4
            int r0 = r0.flags     // Catch: java.lang.Throwable -> Lb3
            r1 = 129(0x81, float:1.81E-43)
            r0 = r0 & r1
            if (r0 == 0) goto La4
            r0 = 1
            r6 = r0
        La4:
            r0 = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.internal.measurement.zzii r0 = com.google.android.gms.internal.measurement.zzii.zzd(r0)     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.internal.measurement.zzhp.zza = r0     // Catch: java.lang.Throwable -> Lb3
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            goto L2c
        Lb3:
            r4 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            r0 = r4
            throw r0
        Lb8:
            r4 = move-exception
            r0 = r7
            r6 = r0
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhp.zza(android.content.Context, android.net.Uri):boolean");
    }
}
