package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzjf.class */
public final class zzjf implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    public final /* synthetic */ zzjz zzc;

    public zzjf(zzjz zzjzVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjzVar;
        this.zza = zzqVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        String str = null;
        try {
            try {
                if (this.zzc.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
                    zzjz zzjzVar = this.zzc;
                    zzejVar = zzjzVar.zzb;
                    if (zzejVar == null) {
                        zzjzVar.zzt.zzaA().zzd().zza("Failed to get app instance id");
                        str = null;
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        String zzd = zzejVar.zzd(this.zza);
                        if (zzd != null) {
                            this.zzc.zzt.zzq().zzO(zzd);
                            this.zzc.zzt.zzm().zze.zzb(zzd);
                        }
                        this.zzc.zzQ();
                        str = zzd;
                    }
                } else {
                    this.zzc.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzt.zzq().zzO(null);
                    this.zzc.zzt.zzm().zze.zzb(null);
                    str = null;
                }
            } catch (RemoteException e2) {
                this.zzc.zzt.zzaA().zzd().zzb("Failed to get app instance id", e2);
            }
            this.zzc.zzt.zzv().zzW(this.zzb, str);
        } catch (Throwable th) {
            this.zzc.zzt.zzv().zzW(this.zzb, null);
            throw th;
        }
    }
}
