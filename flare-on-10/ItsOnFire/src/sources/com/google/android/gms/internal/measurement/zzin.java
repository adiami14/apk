package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import javax.annotation.CheckForNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzin.class */
final class zzin implements Serializable, zzim {
    public final zzim zza;
    public volatile transient boolean zzb;
    @CheckForNull
    public transient Object zzc;

    public zzin(zzim zzimVar) {
        zzimVar.getClass();
        this.zza = zzimVar;
    }

    public final String toString() {
        String str;
        if (this.zzb) {
            str = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        } else {
            str = this.zza;
        }
        return "Suppliers.memoize(" + str.toString() + ")";
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
