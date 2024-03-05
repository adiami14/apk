package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzef.class */
public final class zzef {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzec zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    @GuardedBy("overrideLock")
    private volatile Object zzg = null;
    @GuardedBy("cachingLock")
    private volatile Object zzh = null;

    public /* synthetic */ zzef(String str, Object obj, Object obj2, zzec zzecVar, zzee zzeeVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzecVar;
    }

    public final Object zza(Object obj) {
        List<zzef> list;
        Object obj2;
        synchronized (this.zzf) {
        }
        if (obj != null) {
            return obj;
        }
        if (zzed.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzab.zza()) {
                return this.zzh == null ? this.zzd : this.zzh;
            }
            try {
                list = zzeg.zzaJ;
                for (zzef zzefVar : list) {
                    if (zzab.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    try {
                        zzec zzecVar = zzefVar.zzc;
                        obj2 = null;
                        if (zzecVar != null) {
                            obj2 = zzecVar.zza();
                        }
                    } catch (IllegalStateException e2) {
                        obj2 = null;
                    }
                    synchronized (zza) {
                        zzefVar.zzh = obj2;
                    }
                }
            } catch (SecurityException e3) {
            }
            zzec zzecVar2 = this.zzc;
            if (zzecVar2 == null) {
                return this.zzd;
            }
            try {
                return zzecVar2.zza();
            } catch (IllegalStateException e4) {
                return this.zzd;
            } catch (SecurityException e5) {
                return this.zzd;
            }
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
