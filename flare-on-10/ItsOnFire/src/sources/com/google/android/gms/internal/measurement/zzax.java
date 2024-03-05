package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzax.class */
public final class zzax {
    public final Map zza = new HashMap();
    public final zzbj zzb = new zzbj();

    public zzax() {
        zzb(new zzav());
        zzb(new zzay());
        zzb(new zzaz());
        zzb(new zzbc());
        zzb(new zzbh());
        zzb(new zzbi());
        zzb(new zzbk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.android.gms.internal.measurement.zzaw] */
    public final zzap zza(zzg zzgVar, zzap zzapVar) {
        zzh.zzc(zzgVar);
        if (zzapVar instanceof zzaq) {
            zzaq zzaqVar = (zzaq) zzapVar;
            ArrayList zzc = zzaqVar.zzc();
            String zzb = zzaqVar.zzb();
            return (this.zza.containsKey(zzb) ? (zzaw) this.zza.get(zzb) : this.zzb).zza(zzb, zzgVar, zzc);
        }
        return zzapVar;
    }

    public final void zzb(zzaw zzawVar) {
        for (zzbl zzblVar : zzawVar.zza) {
            this.zza.put(zzblVar.zzb().toString(), zzawVar);
        }
    }
}
