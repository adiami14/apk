package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzmq.class */
public final class zzmq {
    private static final zzmq zza = new zzmq();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzmu zzb = new zzma();

    private zzmq() {
    }

    public static zzmq zza() {
        return zza;
    }

    public final zzmt zzb(Class cls) {
        zzlj.zzc(cls, "messageType");
        zzmt zzmtVar = (zzmt) this.zzc.get(cls);
        zzmt zzmtVar2 = zzmtVar;
        if (zzmtVar == null) {
            zzmtVar2 = this.zzb.zza(cls);
            zzlj.zzc(cls, "messageType");
            zzlj.zzc(zzmtVar2, "schema");
            zzmt zzmtVar3 = (zzmt) this.zzc.putIfAbsent(cls, zzmtVar2);
            if (zzmtVar3 != null) {
                return zzmtVar3;
            }
        }
        return zzmtVar2;
    }
}
