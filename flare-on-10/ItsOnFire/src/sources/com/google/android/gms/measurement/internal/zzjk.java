package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzjk.class */
public final class zzjk implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    public final /* synthetic */ zzjz zzd;

    public zzjk(zzjz zzjzVar, zzau zzauVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjzVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        byte[] bArr = null;
        byte[] bArr2 = null;
        try {
            try {
                zzjz zzjzVar = this.zzd;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    bArr = null;
                    zzjzVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    bArr2 = null;
                } else {
                    byte[] zzu = zzejVar.zzu(this.zza, this.zzb);
                    bArr = zzu;
                    this.zzd.zzQ();
                    bArr2 = zzu;
                }
            } catch (RemoteException e2) {
                bArr = bArr2;
                this.zzd.zzt.zzaA().zzd().zzb("Failed to send event to the service to bundle", e2);
            }
            this.zzd.zzt.zzv().zzT(this.zzc, bArr2);
        } catch (Throwable th) {
            this.zzd.zzt.zzv().zzT(this.zzc, bArr);
            throw th;
        }
    }
}
