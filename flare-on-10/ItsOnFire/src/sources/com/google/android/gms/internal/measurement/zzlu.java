package com.google.android.gms.internal.measurement;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzlu.class */
final class zzlu extends zzlw {
    private zzlu() {
        super(null);
    }

    public /* synthetic */ zzlu(zzlt zzltVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zza(Object obj, long j2) {
        ((zzli) zznu.zzf(obj, j2)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzb(Object obj, Object obj2, long j2) {
        zzli zzliVar = (zzli) zznu.zzf(obj, j2);
        zzli zzliVar2 = (zzli) zznu.zzf(obj2, j2);
        int size = zzliVar.size();
        int size2 = zzliVar2.size();
        zzli zzliVar3 = zzliVar;
        if (size > 0) {
            zzliVar3 = zzliVar;
            if (size2 > 0) {
                zzliVar3 = zzliVar;
                if (!zzliVar.zzc()) {
                    zzliVar3 = zzliVar.zzd(size2 + size);
                }
                zzliVar3.addAll(zzliVar2);
            }
        }
        if (size <= 0) {
            zzliVar3 = zzliVar2;
        }
        zznu.zzs(obj, j2, zzliVar3);
    }
}
