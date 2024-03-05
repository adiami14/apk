package com.google.android.gms.tasks;
/* loaded from: ItsOnFire.jar:com/google/android/gms/tasks/zza.class */
final class zza implements OnSuccessListener {
    public final /* synthetic */ OnTokenCanceledListener zza;

    public zza(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Void r0 = (Void) obj;
        this.zza.onCanceled();
    }
}
