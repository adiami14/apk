package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzoy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzu.class */
public final class zzu {
    public final /* synthetic */ zzaa zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzgi zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    public /* synthetic */ zzu(zzaa zzaaVar, String str, com.google.android.gms.internal.measurement.zzgi zzgiVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzt zztVar) {
        this.zza = zzaaVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzgiVar;
    }

    public /* synthetic */ zzu(zzaa zzaaVar, String str, zzt zztVar) {
        this.zza = zzaaVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new ArrayMap();
        this.zzh = new ArrayMap();
    }

    public static /* bridge */ /* synthetic */ BitSet zzb(zzu zzuVar) {
        return zzuVar.zze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
    @NonNull
    public final com.google.android.gms.internal.measurement.zzfp zza(int i2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        com.google.android.gms.internal.measurement.zzfo zzb = com.google.android.gms.internal.measurement.zzfp.zzb();
        zzb.zza(i2);
        zzb.zzc(this.zzc);
        com.google.android.gms.internal.measurement.zzgi zzgiVar = this.zzd;
        if (zzgiVar != null) {
            zzb.zzd(zzgiVar);
        }
        com.google.android.gms.internal.measurement.zzgh zze = com.google.android.gms.internal.measurement.zzgi.zze();
        zze.zzb(zzlj.zzs(this.zze));
        zze.zzd(zzlj.zzs(this.zzf));
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer num : this.zzg.keySet()) {
                int intValue = num.intValue();
                Long l2 = (Long) this.zzg.get(Integer.valueOf(intValue));
                if (l2 != null) {
                    com.google.android.gms.internal.measurement.zzfq zzc = com.google.android.gms.internal.measurement.zzfr.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l2.longValue());
                    arrayList.add((com.google.android.gms.internal.measurement.zzfr) zzc.zzaD());
                }
            }
        }
        if (arrayList != null) {
            zze.zza(arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(map2.size());
            for (Integer num2 : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzgj zzd = com.google.android.gms.internal.measurement.zzgk.zzd();
                zzd.zzb(num2.intValue());
                List list = (List) this.zzh.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    zzd.zza(list);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.zzgk) zzd.zzaD());
            }
        }
        zze.zzc(arrayList2);
        zzb.zzb(zze);
        return (com.google.android.gms.internal.measurement.zzfp) zzb.zzaD();
    }

    public final void zzc(@NonNull zzy zzyVar) {
        int zza = zzyVar.zza();
        Boolean bool = zzyVar.zzd;
        if (bool != null) {
            BitSet bitSet = this.zzf;
            bool.booleanValue();
            bitSet.set(zza, true);
        }
        Boolean bool2 = zzyVar.zze;
        if (bool2 != null) {
            this.zze.set(zza, bool2.booleanValue());
        }
        if (zzyVar.zzf != null) {
            Map map = this.zzg;
            Integer valueOf = Integer.valueOf(zza);
            Long l2 = (Long) map.get(valueOf);
            long longValue = zzyVar.zzf.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                this.zzg.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzyVar.zzg != null) {
            Map map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza);
            List list = (List) map2.get(valueOf2);
            ArrayList arrayList = list;
            if (list == null) {
                arrayList = new ArrayList();
                this.zzh.put(valueOf2, arrayList);
            }
            if (zzyVar.zzc()) {
                arrayList.clear();
            }
            zzoy.zzc();
            zzag zzf = this.zza.zzt.zzf();
            String str = this.zzb;
            zzef zzefVar = zzeg.zzY;
            if (zzf.zzs(str, zzefVar) && zzyVar.zzb()) {
                arrayList.clear();
            }
            zzoy.zzc();
            if (!this.zza.zzt.zzf().zzs(this.zzb, zzefVar)) {
                arrayList.add(Long.valueOf(zzyVar.zzg.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(zzyVar.zzg.longValue() / 1000);
            if (arrayList.contains(valueOf3)) {
                return;
            }
            arrayList.add(valueOf3);
        }
    }
}
