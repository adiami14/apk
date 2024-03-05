package com.google.android.gms.internal.common;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzae.class */
final class zzae extends zzz {
    private final zzag zza;

    public zzae(zzag zzagVar, int i2) {
        super(zzagVar.size(), i2);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
