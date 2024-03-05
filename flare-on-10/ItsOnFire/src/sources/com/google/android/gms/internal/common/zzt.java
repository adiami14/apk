package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzt.class */
final class zzt extends zzw {
    public final /* synthetic */ zzu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzu zzuVar, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int zzc(int i2) {
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int zzd(int i2) {
        int i3;
        zzo zzoVar = this.zza.zza;
        CharSequence charSequence = ((zzw) this).zzb;
        int length = charSequence.length();
        zzs.zzb(i2, length, FirebaseAnalytics.Param.INDEX);
        while (true) {
            if (i2 >= length) {
                i3 = -1;
                break;
            }
            i3 = i2;
            if (zzoVar.zza(charSequence.charAt(i2))) {
                break;
            }
            i2++;
        }
        return i3;
    }
}
