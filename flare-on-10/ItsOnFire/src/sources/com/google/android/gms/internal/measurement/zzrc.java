package com.google.android.gms.internal.measurement;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzrc.class */
public final class zzrc implements zzrb {
    public static final zzib zza;
    public static final zzib zzb;

    static {
        zzhy zza2 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zzf("measurement.sfmc.client", true);
        zzb = zza2.zzf("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}