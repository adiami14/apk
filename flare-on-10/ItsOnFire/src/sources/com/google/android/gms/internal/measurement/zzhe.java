package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhe.class */
final class zzhe extends ContentObserver {
    public final /* synthetic */ zzhf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhe(zzhf zzhfVar, Handler handler) {
        super(null);
        this.zza = zzhfVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzf();
    }
}
