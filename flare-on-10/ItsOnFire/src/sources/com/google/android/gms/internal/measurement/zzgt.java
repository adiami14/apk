package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzgt.class */
public final class zzgt extends zzlb implements zzmj {
    private static final zzgt zza;
    private int zzd;
    private zzli zze = zzlb.zzbH();
    private zzgp zzf;

    static {
        zzgt zzgtVar = new zzgt();
        zza = zzgtVar;
        zzlb.zzbO(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public final zzgp zza() {
        zzgp zzgpVar = this.zzf;
        zzgp zzgpVar2 = zzgpVar;
        if (zzgpVar == null) {
            zzgpVar2 = zzgp.zzc();
        }
        return zzgpVar2;
    }

    public final List zzc() {
        return this.zze;
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
                    return new zzgs(null);
                }
                return new zzgt();
            }
            return zzlb.zzbL(zza, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001\u001b\u0002ဉ��", new Object[]{"zzd", "zze", zzgy.class, "zzf"});
        }
        return (byte) 1;
    }
}
