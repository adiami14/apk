package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
@TargetApi(24)
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzbt.class */
public final class zzbt {
    @Nullable
    private static final Method zza;
    @Nullable
    private static final Method zzb;

    static {
        Method method;
        Method method2;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException e2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        zza = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException e3) {
            method2 = null;
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
                method2 = null;
            }
        }
        zzb = method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r7, android.app.job.JobInfo r8, java.lang.String r9, java.lang.String r10) {
        /*
            r0 = r7
            java.lang.String r1 = "jobscheduler"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r9 = r0
            r0 = r9
            java.lang.Class r0 = r0.getClass()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.zza
            if (r0 == 0) goto Lae
            r0 = r7
            java.lang.String r1 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r0.checkSelfPermission(r1)
            if (r0 == 0) goto L21
            goto Lae
        L21:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.zzb
            r7 = r0
            r0 = 0
            r11 = r0
            r0 = r7
            if (r0 == 0) goto L5b
            r0 = r7
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L47
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5b
            r0 = r7
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L47
            r12 = r0
            goto L5e
        L47:
            r7 = move-exception
            java.lang.String r0 = "JobSchedulerCompat"
            r1 = 6
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L5b
            java.lang.String r0 = "JobSchedulerCompat"
            java.lang.String r1 = "myUserId invocation illegal"
            r2 = r7
            int r0 = android.util.Log.e(r0, r1, r2)
        L5b:
            r0 = 0
            r12 = r0
        L5e:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.zza
            r7 = r0
            r0 = r7
            if (r0 == 0) goto La4
            r0 = r7
            r1 = r9
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9a
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.Throwable -> L9a
            r3 = r2
            r4 = 1
            java.lang.String r5 = "com.google.android.gms"
            r3[r4] = r5     // Catch: java.lang.Throwable -> L9a
            r3 = r2
            r4 = 2
            r5 = r12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L9a
            r3[r4] = r5     // Catch: java.lang.Throwable -> L9a
            r3 = r2
            r4 = 3
            java.lang.String r5 = "UploadAlarm"
            r3[r4] = r5     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L9a
            r7 = r0
            r0 = r11
            r12 = r0
            r0 = r7
            if (r0 == 0) goto Lab
            r0 = r7
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L9a
            r12 = r0
            goto Lab
        L9a:
            r7 = move-exception
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "error calling scheduleAsPackage"
            r2 = r7
            int r0 = android.util.Log.e(r0, r1, r2)
        La4:
            r0 = r9
            r1 = r8
            int r0 = r0.schedule(r1)
            r12 = r0
        Lab:
            r0 = r12
            return r0
        Lae:
            r0 = r9
            r1 = r8
            int r0 = r0.schedule(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
