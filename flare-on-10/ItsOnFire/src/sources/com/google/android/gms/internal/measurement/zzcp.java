package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzcp.class */
public final class zzcp extends zzdu {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbz zzc;
    public final /* synthetic */ zzef zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(zzef zzefVar, String str, String str2, zzbz zzbzVar) {
        super(zzefVar, true);
        this.zzd = zzefVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzd.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zzb() {
        this.zzc.zze(null);
    }
}
