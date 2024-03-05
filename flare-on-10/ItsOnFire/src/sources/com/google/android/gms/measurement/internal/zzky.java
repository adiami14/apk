package com.google.android.gms.measurement.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzky.class */
public final class zzky implements zzev {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzlh zzb;

    public zzky(zzlh zzlhVar, String str) {
        this.zzb = zzlhVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzev
    public final void zza(String str, int i2, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i2, th, bArr, this.zza);
    }
}
