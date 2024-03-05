package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhv.class */
public final class zzhv extends zzib {
    public zzhv(zzhy zzhyVar, String str, Boolean bool, boolean z) {
        super(zzhyVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        Boolean bool;
        if (zzha.zzc.matcher(obj).matches()) {
            bool = Boolean.TRUE;
        } else if (zzha.zzd.matcher(obj).matches()) {
            bool = Boolean.FALSE;
        } else {
            String str = this.zzb;
            Log.e("PhenotypeFlag", "Invalid boolean value for " + str + ": " + ((String) obj));
            bool = null;
        }
        return bool;
    }
}
