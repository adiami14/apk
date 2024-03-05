package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhc.class */
final class zzhc extends zzhz {
    private final Context zza;
    private final zzim zzb;

    public zzhc(Context context, @Nullable zzim zzimVar) {
        this.zza = context;
        this.zzb = zzimVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhz) {
            zzhz zzhzVar = (zzhz) obj;
            if (this.zza.equals(zzhzVar.zza())) {
                zzim zzimVar = this.zzb;
                return zzimVar == null ? zzhzVar.zzb() == null : zzimVar.equals(zzhzVar.zzb());
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        zzim zzimVar = this.zzb;
        return (zzimVar == null ? 0 : zzimVar.hashCode()) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    @Nullable
    public final zzim zzb() {
        return this.zzb;
    }
}
