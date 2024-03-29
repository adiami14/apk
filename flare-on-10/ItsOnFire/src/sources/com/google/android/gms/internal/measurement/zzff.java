package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzff.class */
public final class zzff extends zzlb implements zzmj {
    private static final zzff zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private zzli zzh = zzlb.zzbH();
    private zzli zzi = zzlb.zzbH();
    private zzli zzj = zzlb.zzbH();
    private String zzk = "";
    private zzli zzm = zzlb.zzbH();
    private zzli zzn = zzlb.zzbH();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        zzff zzffVar = new zzff();
        zza = zzffVar;
        zzlb.zzbO(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe zze() {
        return (zzfe) zza.zzbA();
    }

    public static zzff zzg() {
        return zza;
    }

    public static /* synthetic */ void zzq(zzff zzffVar, int i2, zzfd zzfdVar) {
        zzfdVar.getClass();
        zzli zzliVar = zzffVar.zzi;
        if (!zzliVar.zzc()) {
            zzffVar.zzi = zzlb.zzbI(zzliVar);
        }
        zzffVar.zzi.set(i2, zzfdVar);
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final int zzb() {
        return this.zzi.size();
    }

    public final long zzc() {
        return this.zze;
    }

    public final zzfd zzd(int i2) {
        return (zzfd) this.zzi.get(i2);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzq;
    }

    public final String zzj() {
        return this.zzp;
    }

    public final String zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfe(null);
                }
                return new zzff();
            }
            return zzlb.zzbL(zza, "\u0001\u000e��\u0001\u0001\u000e\u000e��\u0005��\u0001ဂ��\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzfj.class, "zzi", zzfd.class, "zzj", zzei.class, "zzk", "zzl", "zzm", zzgt.class, "zzn", zzfb.class, "zzo", "zzp", "zzq", "zzr"});
        }
        return (byte) 1;
    }

    public final List zzm() {
        return this.zzj;
    }

    public final List zzn() {
        return this.zzn;
    }

    public final List zzo() {
        return this.zzm;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final boolean zzs() {
        return this.zzl;
    }

    public final boolean zzt() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 1) != 0;
    }
}
