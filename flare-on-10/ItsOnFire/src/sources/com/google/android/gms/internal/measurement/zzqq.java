package com.google.android.gms.internal.measurement;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzqq.class */
public final class zzqq implements zzqp {
    public static final zzib zza;
    public static final zzib zzb;

    static {
        zzhy zza2 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zzf("measurement.remove_app_background.client", false);
        zzb = zza2.zzd("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }
}
