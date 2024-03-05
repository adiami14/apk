package com.google.android.gms.internal.measurement;

import android.os.UserManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhb.class */
public final class zzhb {
    @GuardedBy("DirectBootUtils.class")
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzhb() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r0.isUserRunning(android.os.Process.myUserHandle()) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r5 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        com.google.android.gms.internal.measurement.zzhb.zza = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        r7 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(android.content.Context r4) {
        /*
            boolean r0 = zzb()
            if (r0 == 0) goto L97
            boolean r0 = com.google.android.gms.internal.measurement.zzhb.zzb
            if (r0 == 0) goto Lf
            goto L97
        Lf:
            java.lang.Class<com.google.android.gms.internal.measurement.zzhb> r0 = com.google.android.gms.internal.measurement.zzhb.class
            monitor-enter(r0)
            boolean r0 = com.google.android.gms.internal.measurement.zzhb.zzb     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L1e
            java.lang.Class<com.google.android.gms.internal.measurement.zzhb> r0 = com.google.android.gms.internal.measurement.zzhb.class
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            goto L97
        L1e:
            r0 = 1
            r5 = r0
        L20:
            r0 = r5
            r1 = 2
            if (r0 > r1) goto L72
            android.os.UserManager r0 = com.google.android.gms.internal.measurement.zzhb.zza     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L37
            r0 = r4
            java.lang.Class<android.os.UserManager> r1 = android.os.UserManager.class
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L91
            android.os.UserManager r0 = (android.os.UserManager) r0     // Catch: java.lang.Throwable -> L91
            com.google.android.gms.internal.measurement.zzhb.zza = r0     // Catch: java.lang.Throwable -> L91
        L37:
            android.os.UserManager r0 = com.google.android.gms.internal.measurement.zzhb.zza     // Catch: java.lang.Throwable -> L91 java.lang.Throwable -> L91
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L44
            r0 = 1
            r7 = r0
            goto L80
        L44:
            r0 = r6
            boolean r0 = r0.isUserUnlocked()     // Catch: java.lang.NullPointerException -> L5e java.lang.Throwable -> L91
            if (r0 != 0) goto L59
            r0 = r6
            android.os.UserHandle r1 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L5e java.lang.Throwable -> L91
            boolean r0 = r0.isUserRunning(r1)     // Catch: java.lang.NullPointerException -> L5e java.lang.Throwable -> L91
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L72
        L59:
            r0 = 1
            r5 = r0
            goto L74
        L5e:
            r6 = move-exception
            java.lang.String r0 = "DirectBootUtils"
            java.lang.String r1 = "Failed to check if user is unlocked."
            r2 = r6
            int r0 = android.util.Log.w(r0, r1, r2)     // Catch: java.lang.Throwable -> L91
            r0 = 0
            com.google.android.gms.internal.measurement.zzhb.zza = r0     // Catch: java.lang.Throwable -> L91
            int r5 = r5 + 1
            goto L20
        L72:
            r0 = 0
            r5 = r0
        L74:
            r0 = r5
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L80
            r0 = 0
            com.google.android.gms.internal.measurement.zzhb.zza = r0     // Catch: java.lang.Throwable -> L91
            r0 = r5
            r7 = r0
        L80:
            r0 = r7
            if (r0 == 0) goto L88
            r0 = 1
            com.google.android.gms.internal.measurement.zzhb.zzb = r0     // Catch: java.lang.Throwable -> L91
        L88:
            java.lang.Class<com.google.android.gms.internal.measurement.zzhb> r0 = com.google.android.gms.internal.measurement.zzhb.class
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r7
            if (r0 != 0) goto L97
            r0 = 1
            return r0
        L91:
            r4 = move-exception
            java.lang.Class<com.google.android.gms.internal.measurement.zzhb> r0 = com.google.android.gms.internal.measurement.zzhb.class
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r4
            throw r0
        L97:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhb.zza(android.content.Context):boolean");
    }

    @ChecksSdkIntAtLeast(api = 24)
    public static boolean zzb() {
        return true;
    }
}
