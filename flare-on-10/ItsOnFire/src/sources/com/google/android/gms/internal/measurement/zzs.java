package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzs.class */
public final class zzs extends zzai {
    public final boolean zza;
    public final boolean zzb;
    public final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.zzc = zztVar;
        this.zza = z;
        this.zzb = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzr zzrVar;
        zzr zzrVar2;
        ArrayList arrayList;
        zzr zzrVar3;
        zzr zzrVar4;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            zzrVar4 = this.zzc.zza;
            zzrVar4.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
        } else {
            int zzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
            int i2 = 3;
            if (zzb == 2) {
                i2 = 4;
            } else if (zzb == 3) {
                i2 = 1;
            } else if (zzb == 5) {
                i2 = 5;
            } else if (zzb == 6) {
                i2 = 2;
            }
            String zzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() == 2) {
                zzrVar3 = this.zzc.zza;
                zzrVar2 = zzrVar3;
                arrayList = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                    arrayList2.add(zzgVar.zzb((zzap) list.get(i3)).zzi());
                }
                zzrVar = this.zzc.zza;
                zzrVar2 = zzrVar;
                arrayList = arrayList2;
            }
            zzrVar2.zza(i2, zzi, arrayList, this.zza, this.zzb);
        }
        return zzap.zzf;
    }
}
