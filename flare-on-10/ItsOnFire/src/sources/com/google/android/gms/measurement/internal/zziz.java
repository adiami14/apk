package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zziz.class */
public final class zziz extends zzf {
    @VisibleForTesting
    public zzir zza;
    private volatile zzir zzb;
    private volatile zzir zzc;
    private final Map zzd;
    @GuardedBy("activityLock")
    private Activity zze;
    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzir zzg;
    private zzir zzh;
    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zziz(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0129, code lost:
        if (r0 == 0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.os.Bundle, com.google.android.gms.measurement.internal.zzik] */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.measurement.internal.zzkn, long] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.os.Bundle, com.google.android.gms.measurement.internal.zzlp, long] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.String, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.String, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzA(com.google.android.gms.measurement.internal.zzir r8, com.google.android.gms.measurement.internal.zzir r9, long r10, boolean r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzA(com.google.android.gms.measurement.internal.zzir, com.google.android.gms.measurement.internal.zzir, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzB(zzir zzirVar, boolean z, long j2) {
        this.zzt.zzd().zzf(this.zzt.zzax().elapsedRealtime());
        if (!this.zzt.zzu().zzb.zzd(zzirVar != null && zzirVar.zzd, z, j2) || zzirVar == null) {
            return;
        }
        zzirVar.zzd = false;
    }

    public static /* bridge */ /* synthetic */ void zzp(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j2) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzizVar.zzA(zzirVar, zzirVar2, j2, true, zzizVar.zzt.zzv().zzu(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    @MainThread
    private final zzir zzy(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzir zzirVar = (zzir) this.zzd.get(activity);
        zzir zzirVar2 = zzirVar;
        if (zzirVar == null) {
            zzirVar2 = new zzir(null, zzl(activity.getClass(), "Activity"), this.zzt.zzv().zzq());
            this.zzd.put(activity, zzirVar2);
        }
        return this.zzg != null ? this.zzg : zzirVar2;
    }

    @MainThread
    private final void zzz(Activity activity, zzir zzirVar, boolean z) {
        zzir zzirVar2;
        zzir zzirVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzirVar.zzb == null) {
            zzirVar2 = new zzir(zzirVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzirVar.zzc, zzirVar.zze, zzirVar.zzf);
        } else {
            zzirVar2 = zzirVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzirVar2;
        this.zzt.zzaB().zzp(new zziu(this, zzirVar2, zzirVar3, this.zzt.zzax().elapsedRealtime(), z));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final zzir zzi() {
        return this.zzb;
    }

    @WorkerThread
    public final zzir zzj(boolean z) {
        zza();
        zzg();
        if (z) {
            zzir zzirVar = this.zza;
            return zzirVar != null ? zzirVar : this.zzh;
        }
        return this.zza;
    }

    @VisibleForTesting
    public final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzt.zzf();
        if (length2 > 100) {
            this.zzt.zzf();
            return str2.substring(0, 100);
        }
        return str2;
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzt.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzir(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (this.zzt.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        if (!this.zzt.zzf().zzu()) {
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziw(this, elapsedRealtime));
            return;
        }
        zzir zzy = zzy(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        this.zzt.zzaB().zzp(new zzix(this, zzy, elapsedRealtime));
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzt.zzf().zzu()) {
                    this.zzg = null;
                    this.zzt.zzaB().zzp(new zziy(this));
                }
            }
        }
        if (!this.zzt.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzt.zzaB().zzp(new zziv(this));
            return;
        }
        zzz(activity, zzy(activity), false);
        zzd zzd = this.zzt.zzd();
        zzd.zzt.zzaB().zzp(new zzc(zzd, zzd.zzt.zzax().elapsedRealtime()));
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zzir zzirVar;
        if (!this.zzt.zzf().zzu() || bundle == null || (zzirVar = (zzir) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzirVar.zzc);
        bundle2.putString("name", zzirVar.zza);
        bundle2.putString("referrer_name", zzirVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
        if (r0 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
        if (r0 <= 100) goto L39;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzw(@androidx.annotation.NonNull android.app.Activity r8, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r9, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r0 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r0 > 100) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzx(android.os.Bundle r11, long r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzx(android.os.Bundle, long):void");
    }
}
