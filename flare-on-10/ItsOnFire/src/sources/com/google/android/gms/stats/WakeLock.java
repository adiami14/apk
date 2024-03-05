package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
@ShowFirstParty
@ThreadSafe
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/stats/WakeLock.class */
public class WakeLock {
    private static final long zzb = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService zzc = null;
    private static final Object zzd = new Object();
    private static volatile zzd zze = new zzb();
    @GuardedBy("acquireReleaseLock")
    public com.google.android.gms.internal.stats.zzb zza;
    private final Object zzf;
    @GuardedBy("acquireReleaseLock")
    private final PowerManager.WakeLock zzg;
    @GuardedBy("acquireReleaseLock")
    private int zzh;
    @GuardedBy("acquireReleaseLock")
    private Future<?> zzi;
    @GuardedBy("acquireReleaseLock")
    private long zzj;
    @GuardedBy("acquireReleaseLock")
    private final Set<zze> zzk;
    @GuardedBy("acquireReleaseLock")
    private boolean zzl;
    @GuardedBy("acquireReleaseLock")
    private int zzm;
    private Clock zzn;
    private WorkSource zzo;
    private final String zzp;
    private final String zzq;
    private final Context zzr;
    @GuardedBy("acquireReleaseLock")
    private final Map<String, zzc> zzs;
    private AtomicInteger zzt;
    private final ScheduledExecutorService zzu;

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i2, @NonNull String str) {
        String packageName = context.getPackageName();
        this.zzf = new Object();
        this.zzh = 0;
        this.zzk = new HashSet();
        this.zzl = true;
        this.zzn = DefaultClock.getInstance();
        this.zzs = new HashMap();
        this.zzt = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.zzr = context.getApplicationContext();
        this.zzq = str;
        this.zza = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.zzp = str;
        } else {
            String valueOf = String.valueOf(str);
            this.zzp = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i2, str);
        this.zzg = newWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.zzo = fromPackage;
            if (fromPackage != null) {
                zze(newWakeLock, fromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorService = zzc;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        if (scheduledExecutorService == null) {
            synchronized (zzd) {
                ScheduledExecutorService scheduledExecutorService3 = zzc;
                scheduledExecutorService2 = scheduledExecutorService3;
                if (scheduledExecutorService3 == null) {
                    zzh.zza();
                    scheduledExecutorService2 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    zzc = scheduledExecutorService2;
                }
            }
        }
        this.zzu = scheduledExecutorService2;
    }

    public static /* synthetic */ void zza(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.zzf) {
            if (wakeLock.isHeld()) {
                Log.e("WakeLock", String.valueOf(wakeLock.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.zzc();
                if (wakeLock.isHeld()) {
                    wakeLock.zzh = 1;
                    wakeLock.zzd(0);
                }
            }
        }
    }

    @GuardedBy("acquireReleaseLock")
    private final String zzb(String str) {
        if (this.zzl) {
            TextUtils.isEmpty(null);
            return null;
        }
        return null;
    }

    @GuardedBy("acquireReleaseLock")
    private final void zzc() {
        if (this.zzk.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.zzk);
        this.zzk.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        zze zzeVar = (zze) arrayList.get(0);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
        if (r4.zza != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
        r4.zza = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
        if (r4.zza != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzd(int r5) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.zzd(int):void");
    }

    private static void zze(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
            Log.wtf("WakeLock", e2.toString());
        }
    }

    @KeepForSdk
    public void acquire(long j2) {
        this.zzt.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, zzb), 1L);
        long j3 = max;
        if (j2 > 0) {
            j3 = Math.min(j2, max);
        }
        synchronized (this.zzf) {
            if (!isHeld()) {
                this.zza = com.google.android.gms.internal.stats.zzb.zza(false, null);
                this.zzg.acquire();
                this.zzn.elapsedRealtime();
            }
            this.zzh++;
            this.zzm++;
            zzb(null);
            zzc zzcVar = this.zzs.get(null);
            zzc zzcVar2 = zzcVar;
            if (zzcVar == null) {
                zzcVar2 = new zzc(null);
                this.zzs.put(null, zzcVar2);
            }
            zzcVar2.zza++;
            long elapsedRealtime = this.zzn.elapsedRealtime();
            long j4 = Long.MAX_VALUE;
            if (Long.MAX_VALUE - elapsedRealtime > j3) {
                j4 = elapsedRealtime + j3;
            }
            if (j4 > this.zzj) {
                this.zzj = j4;
                Future<?> future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzi = this.zzu.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        WakeLock.zza(WakeLock.this);
                    }
                }, j3, TimeUnit.MILLISECONDS);
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzh > 0;
        }
        return z;
    }

    @KeepForSdk
    public void release() {
        if (this.zzt.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.zzp).concat(" release without a matched acquire!"));
        }
        synchronized (this.zzf) {
            zzb(null);
            if (this.zzs.containsKey(null)) {
                zzc zzcVar = this.zzs.get(null);
                if (zzcVar != null) {
                    int i2 = zzcVar.zza - 1;
                    zzcVar.zza = i2;
                    if (i2 == 0) {
                        this.zzs.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.zzp).concat(" counter does not exist"));
            }
            zzd(0);
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        synchronized (this.zzf) {
            this.zzl = z;
        }
    }
}
