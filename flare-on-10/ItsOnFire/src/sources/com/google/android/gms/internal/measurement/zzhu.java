package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhu.class */
public final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l2, boolean z) {
        super(zzhyVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        Long l2;
        try {
            l2 = Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException e2) {
            String str = this.zzb;
            Log.e("PhenotypeFlag", "Invalid long value for " + str + ": " + ((String) obj));
            l2 = null;
        }
        return l2;
    }
}
