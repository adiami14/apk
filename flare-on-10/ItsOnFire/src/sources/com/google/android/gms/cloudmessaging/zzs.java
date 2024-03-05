package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: ItsOnFire.jar:com/google/android/gms/cloudmessaging/zzs.class */
public final class zzs {
    @Nullable
    @GuardedBy("MessengerIpcClient.class")
    private static zzs zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    @GuardedBy("this")
    private zzm zzd = new zzm(this, null);
    @GuardedBy("this")
    private int zze = 1;

    @VisibleForTesting
    public zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context zza(zzs zzsVar) {
        return zzsVar.zzb;
    }

    public static zzs zzb(Context context) {
        zzs zzsVar;
        synchronized (zzs.class) {
            try {
                if (zza == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    zza = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
                }
                zzsVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzsVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService zze(zzs zzsVar) {
        return zzsVar.zzc;
    }

    private final int zzf() {
        int i2;
        synchronized (this) {
            i2 = this.zze;
            this.zze = i2 + 1;
        }
        return i2;
    }

    private final <T> Task<T> zzg(zzp<T> zzpVar) {
        Task<T> task;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(zzpVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.zzd.zzg(zzpVar)) {
                zzm zzmVar = new zzm(this, null);
                this.zzd = zzmVar;
                zzmVar.zzg(zzpVar);
            }
            task = zzpVar.zzb.getTask();
        }
        return task;
    }

    public final Task<Void> zzc(int i2, Bundle bundle) {
        return zzg(new zzo(zzf(), 2, bundle));
    }

    public final Task<Bundle> zzd(int i2, Bundle bundle) {
        return zzg(new zzr(zzf(), 1, bundle));
    }
}
