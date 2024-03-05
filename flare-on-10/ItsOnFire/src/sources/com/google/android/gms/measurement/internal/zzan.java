package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzan.class */
public abstract class zzan {
    private static volatile Handler zza;
    private final zzgy zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzan(zzgy zzgyVar) {
        Preconditions.checkNotNull(zzgyVar);
        this.zzb = zzgyVar;
        this.zzc = new zzam(this, zzgyVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzan.class) {
            try {
                if (zza == null) {
                    zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzaw().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j2) {
        zzb();
        if (j2 >= 0) {
            this.zzd = this.zzb.zzax().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j2)) {
                return;
            }
            this.zzb.zzaA().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j2));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
