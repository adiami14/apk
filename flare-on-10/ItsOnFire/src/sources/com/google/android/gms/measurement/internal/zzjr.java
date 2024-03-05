package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzjr.class */
public final class zzjr implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzq zzc;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    public final /* synthetic */ zzjz zze;

    public zzjr(zzjz zzjzVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzjzVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = arrayList;
        try {
            try {
                zzjz zzjzVar = this.zze;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    arrayList2 = arrayList;
                    zzjzVar.zzt.zzaA().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    arrayList3 = arrayList;
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    ArrayList zzH = zzlp.zzH(zzejVar.zzf(this.zza, this.zzb, this.zzc));
                    arrayList2 = zzH;
                    this.zze.zzQ();
                    arrayList3 = zzH;
                }
            } catch (RemoteException e2) {
                arrayList2 = arrayList3;
                this.zze.zzt.zzaA().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e2);
            }
            this.zze.zzt.zzv().zzR(this.zzd, arrayList3);
        } catch (Throwable th) {
            this.zze.zzt.zzv().zzR(this.zzd, arrayList2);
            throw th;
        }
    }
}
