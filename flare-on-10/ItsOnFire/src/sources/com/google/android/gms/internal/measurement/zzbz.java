package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzbz.class */
public final class zzbz extends zzce {
    private final AtomicReference zza = new AtomicReference();
    private boolean zzb;

    public static final Object zzf(Bundle bundle, Class cls) {
        Object obj = null;
        if (bundle != null) {
            Object obj2 = bundle.get("r");
            obj = null;
            if (obj2 != null) {
                try {
                    obj = cls.cast(obj2);
                } catch (ClassCastException e2) {
                    Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj2.getClass().getCanonicalName()), e2);
                    throw e2;
                }
            }
        }
        return obj;
    }

    public final Bundle zzb(long j2) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j2);
                } catch (InterruptedException e2) {
                    return null;
                }
            }
            bundle = (Bundle) this.zza.get();
        }
        return bundle;
    }

    public final Long zzc(long j2) {
        return (Long) zzf(zzb(j2), Long.class);
    }

    public final String zzd(long j2) {
        return (String) zzf(zzb(j2), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zze(Bundle bundle) {
        synchronized (this.zza) {
            this.zza.set(bundle);
            this.zzb = true;
            this.zza.notify();
        }
    }
}
