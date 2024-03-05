package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhw.class */
public final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d2, boolean z) {
        super(zzhyVar, "measurement.test.double_flag", d2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        Double d2;
        try {
            d2 = Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException e2) {
            String str = this.zzb;
            Log.e("PhenotypeFlag", "Invalid double value for " + str + ": " + ((String) obj));
            d2 = null;
        }
        return d2;
    }
}
