package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzdx.class */
final class zzdx extends zzdu {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ zzee zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzee zzeeVar, Bundle bundle, Activity activity) {
        super(zzeeVar.zza, true);
        this.zzc = zzeeVar;
        this.zza = bundle;
        this.zzb = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        Bundle bundle;
        zzcc zzccVar;
        if (this.zza != null) {
            Bundle bundle2 = new Bundle();
            bundle = bundle2;
            if (this.zza.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zza.get("com.google.app_measurement.screen_service");
                bundle = bundle2;
                if (obj instanceof Bundle) {
                    bundle2.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                    bundle = bundle2;
                }
            }
        } else {
            bundle = null;
        }
        zzccVar = this.zzc.zza.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).onActivityCreated(ObjectWrapper.wrap(this.zzb), bundle, this.zzi);
    }
}
