package com.google.android.gms.internal.measurement;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzme.class */
final class zzme {
    private static final zzmd zza;
    private static final zzmd zzb;

    static {
        zzmd zzmdVar;
        try {
            zzmdVar = (zzmd) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            zzmdVar = null;
        }
        zza = zzmdVar;
        zzb = new zzmd();
    }

    public static zzmd zza() {
        return zza;
    }

    public static zzmd zzb() {
        return zzb;
    }
}
