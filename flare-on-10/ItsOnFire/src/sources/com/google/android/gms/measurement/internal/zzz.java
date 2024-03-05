package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzz.class */
public final class zzz extends zzy {
    public final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzet zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, String str, int i2, com.google.android.gms.internal.measurement.zzet zzetVar) {
        super(str, i2);
        this.zza = zzaaVar;
        this.zzh = zzetVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return true;
    }

    public final boolean zzd(Long l2, Long l3, com.google.android.gms.internal.measurement.zzgm zzgmVar, boolean z) {
        zzer zzk;
        String zzf;
        String str;
        Boolean zzf2;
        Boolean bool;
        zzoy.zzc();
        boolean zzs = this.zza.zzt.zzf().zzs(this.zzb, zzeg.zzW);
        boolean zzg = this.zzh.zzg();
        boolean zzh = this.zzh.zzh();
        boolean zzi = this.zzh.zzi();
        boolean z2 = zzg || zzh || zzi;
        if (z && !z2) {
            zzer zzj = this.zza.zzt.zzaA().zzj();
            int i2 = this.zzc;
            Integer num = null;
            if (this.zzh.zzj()) {
                num = Integer.valueOf(this.zzh.zza());
            }
            zzj.zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i2), num);
            return true;
        }
        com.google.android.gms.internal.measurement.zzem zzb = this.zzh.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzgmVar.zzr()) {
            if (zzb.zzi()) {
                zzf2 = zzy.zzh(zzgmVar.zzb(), zzb.zzc());
                bool = zzy.zzj(zzf2, zzg2);
            } else {
                zzk = this.zza.zzt.zzaA().zzk();
                zzf = this.zza.zzt.zzj().zzf(zzgmVar.zzf());
                str = "No number filter for long property. property";
                zzk.zzb(str, zzf);
                bool = null;
            }
        } else if (!zzgmVar.zzq()) {
            if (zzgmVar.zzt()) {
                if (zzb.zzk()) {
                    zzf2 = zzy.zzf(zzgmVar.zzg(), zzb.zzd(), this.zza.zzt.zzaA());
                } else if (!zzb.zzi()) {
                    zzk = this.zza.zzt.zzaA().zzk();
                    zzf = this.zza.zzt.zzj().zzf(zzgmVar.zzf());
                    str = "No string or number filter defined. property";
                } else if (zzlj.zzy(zzgmVar.zzg())) {
                    zzf2 = zzy.zzi(zzgmVar.zzg(), zzb.zzc());
                } else {
                    this.zza.zzt.zzaA().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzt.zzj().zzf(zzgmVar.zzf()), zzgmVar.zzg());
                    bool = null;
                }
                bool = zzy.zzj(zzf2, zzg2);
            } else {
                zzk = this.zza.zzt.zzaA().zzk();
                zzf = this.zza.zzt.zzj().zzf(zzgmVar.zzf());
                str = "User property has no value, property";
            }
            zzk.zzb(str, zzf);
            bool = null;
        } else if (zzb.zzi()) {
            zzf2 = zzy.zzg(zzgmVar.zza(), zzb.zzc());
            bool = zzy.zzj(zzf2, zzg2);
        } else {
            zzk = this.zza.zzt.zzaA().zzk();
            zzf = this.zza.zzt.zzj().zzf(zzgmVar.zzf());
            str = "No number filter for double property. property";
            zzk.zzb(str, zzf);
            bool = null;
        }
        this.zza.zzt.zzaA().zzj().zzb("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (!zzi || bool.booleanValue()) {
            if (!z || this.zzh.zzg()) {
                this.zze = bool;
            }
            if (bool.booleanValue() && z2 && zzgmVar.zzs()) {
                long zzc = zzgmVar.zzc();
                if (l2 != null) {
                    zzc = l2.longValue();
                }
                long j2 = zzc;
                if (zzs) {
                    j2 = zzc;
                    if (this.zzh.zzg()) {
                        j2 = zzc;
                        if (!this.zzh.zzh()) {
                            j2 = zzc;
                            if (l3 != null) {
                                j2 = l3.longValue();
                            }
                        }
                    }
                }
                if (this.zzh.zzh()) {
                    this.zzg = Long.valueOf(j2);
                    return true;
                }
                this.zzf = Long.valueOf(j2);
                return true;
            }
            return true;
        }
        return true;
    }
}
