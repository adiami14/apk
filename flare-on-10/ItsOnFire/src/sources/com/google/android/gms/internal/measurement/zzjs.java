package com.google.android.gms.internal.measurement;

import java.util.Comparator;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzjs.class */
final class zzjs implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int compareTo;
        zzka zzkaVar = (zzka) obj;
        zzka zzkaVar2 = (zzka) obj2;
        zzjr zzjrVar = new zzjr(zzkaVar);
        zzjr zzjrVar2 = new zzjr(zzkaVar2);
        while (zzjrVar.hasNext() && zzjrVar2.hasNext()) {
            compareTo = Integer.valueOf(zzjrVar.zza() & 255).compareTo(Integer.valueOf(zzjrVar2.zza() & 255));
            if (compareTo != 0) {
                break;
            }
        }
        compareTo = Integer.valueOf(zzkaVar.zzd()).compareTo(Integer.valueOf(zzkaVar2.zzd()));
        return compareTo;
    }
}
