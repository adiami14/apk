package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/zzr.class */
public final class zzr extends GmsClientSupervisor {
    @GuardedBy("connectionStatus")
    private final HashMap zzb = new HashMap();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzq zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    public zzr(Context context, Looper looper) {
        zzq zzqVar = new zzq(this, null);
        this.zze = zzqVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzi(looper, zzqVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zza(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzo zzoVar = (zzo) this.zzb.get(zznVar);
            if (zzoVar == null) {
                String obj = zznVar.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (!zzoVar.zzh(serviceConnection)) {
                String obj2 = zznVar.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            } else {
                zzoVar.zzf(serviceConnection, str);
                if (zzoVar.zzi()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zznVar), this.zzg);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        zzo zzoVar;
        boolean zzj;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzo zzoVar2 = (zzo) this.zzb.get(zznVar);
            if (zzoVar2 == null) {
                zzo zzoVar3 = new zzo(this, zznVar);
                zzoVar3.zzd(serviceConnection, serviceConnection, str);
                zzoVar3.zze(str, executor);
                this.zzb.put(zznVar, zzoVar3);
                zzoVar = zzoVar3;
            } else {
                this.zzd.removeMessages(0, zznVar);
                if (zzoVar2.zzh(serviceConnection)) {
                    String obj = zznVar.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
                zzoVar2.zzd(serviceConnection, serviceConnection, str);
                int zza = zzoVar2.zza();
                if (zza == 1) {
                    serviceConnection.onServiceConnected(zzoVar2.zzb(), zzoVar2.zzc());
                    zzoVar = zzoVar2;
                } else if (zza != 2) {
                    zzoVar = zzoVar2;
                } else {
                    zzoVar2.zze(str, executor);
                    zzoVar = zzoVar2;
                }
            }
            zzj = zzoVar.zzj();
        }
        return zzj;
    }

    public final void zzi(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzi(looper, this.zze);
        }
    }
}
