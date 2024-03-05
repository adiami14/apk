package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzip.class */
final class zzip implements zzim {
    private static final zzim zza = new zzim() { // from class: com.google.android.gms.internal.measurement.zzio
        @Override // com.google.android.gms.internal.measurement.zzim
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzim zzb;
    @CheckForNull
    private Object zzc;

    public zzip(zzim zzimVar) {
        zzimVar.getClass();
        this.zzb = zzimVar;
    }

    public final String toString() {
        zzim zzimVar = this.zzb;
        String str = zzimVar;
        if (zzimVar == zza) {
            str = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(str) + ")";
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        zzim zzimVar = this.zzb;
        zzim zzimVar2 = zza;
        if (zzimVar != zzimVar2) {
            synchronized (this) {
                if (this.zzb != zzimVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzimVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
