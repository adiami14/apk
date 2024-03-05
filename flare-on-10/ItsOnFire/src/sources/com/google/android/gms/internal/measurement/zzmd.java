package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzmd.class */
final class zzmd {
    public static final int zza(int i2, Object obj, Object obj2) {
        zzmc zzmcVar = (zzmc) obj;
        zzmb zzmbVar = (zzmb) obj2;
        if (zzmcVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzmcVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzmc zzmcVar = (zzmc) obj;
        zzmc zzmcVar2 = (zzmc) obj2;
        zzmc zzmcVar3 = zzmcVar;
        if (!zzmcVar2.isEmpty()) {
            zzmcVar3 = zzmcVar;
            if (!zzmcVar.zze()) {
                zzmcVar3 = zzmcVar.zzb();
            }
            zzmcVar3.zzd(zzmcVar2);
        }
        return zzmcVar3;
    }
}
