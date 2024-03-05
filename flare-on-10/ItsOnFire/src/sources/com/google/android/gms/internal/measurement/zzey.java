package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzey.class */
public final class zzey extends zzlb implements zzmj {
    private static final zzey zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zzli zzh = zzlb.zzbH();

    static {
        zzey zzeyVar = new zzey();
        zza = zzeyVar;
        zzlb.zzbO(zzey.class, zzeyVar);
    }

    private zzey() {
    }

    public static zzey zzc() {
        return zza;
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final String zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    public final int zzj() {
        int zza2 = zzex.zza(this.zze);
        int i2 = zza2;
        if (zza2 == 0) {
            i2 = 1;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return zzlb.zzbL(zza, "\u0001\u0004��\u0001\u0001\u0004\u0004��\u0001��\u0001ဌ��\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", zzew.zza, "zzf", "zzg", "zzh"});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zza;
                }
                return new zzeu(null);
            } else {
                return new zzey();
            }
        }
        return (byte) 1;
    }
}
