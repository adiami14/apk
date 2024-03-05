package com.google.android.gms.internal.measurement;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzkm.class */
final class zzkm {
    private final Object zza;
    private final int zzb;

    public zzkm(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkm) {
            zzkm zzkmVar = (zzkm) obj;
            return this.zza == zzkmVar.zza && this.zzb == zzkmVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
