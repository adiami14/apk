package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzy.class */
public abstract class zzy {
    public final String zzb;
    public final int zzc;
    public Boolean zzd;
    public Boolean zze;
    public Long zzf;
    public Long zzg;

    public zzy(String str, int i2) {
        this.zzb = str;
        this.zzc = i2;
    }

    private static Boolean zzd(String str, int i2, boolean z, String str2, List list, String str3, zzet zzetVar) {
        boolean startsWith;
        if (i2 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        Object obj = str;
        if (!z) {
            obj = str;
            if (i2 != 2) {
                obj = str.toUpperCase(Locale.ENGLISH);
            }
        }
        switch (i2 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(obj).matches());
                } catch (PatternSyntaxException e2) {
                    if (zzetVar != null) {
                        zzetVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                        return null;
                    }
                    return null;
                }
            case 2:
                startsWith = obj.startsWith(str2);
                break;
            case 3:
                startsWith = obj.endsWith(str2);
                break;
            case 4:
                startsWith = obj.contains(str2);
                break;
            case 5:
                startsWith = obj.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(obj);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
        if (r8 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
        if (r7.compareTo(r17) <= 0) goto L42;
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean zze(java.math.BigDecimal r7, com.google.android.gms.internal.measurement.zzer r8, double r9) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzy.zze(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzer, double):java.lang.Boolean");
    }

    @VisibleForTesting
    public static Boolean zzf(String str, com.google.android.gms.internal.measurement.zzey zzeyVar, zzet zzetVar) {
        List list;
        Preconditions.checkNotNull(zzeyVar);
        if (str == null || !zzeyVar.zzi() || zzeyVar.zzj() == 1) {
            return null;
        }
        if (zzeyVar.zzj() == 7) {
            if (zzeyVar.zza() == 0) {
                return null;
            }
        } else if (!zzeyVar.zzh()) {
            return null;
        }
        int zzj = zzeyVar.zzj();
        boolean zzf = zzeyVar.zzf();
        String zzd = (zzf || zzj == 2 || zzj == 7) ? zzeyVar.zzd() : zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
        if (zzeyVar.zza() == 0) {
            list = null;
        } else {
            List<String> zze = zzeyVar.zze();
            list = zze;
            if (!zzf) {
                ArrayList arrayList = new ArrayList(zze.size());
                for (String str2 : zze) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        return zzd(str, zzj, zzf, zzd, list, zzj == 2 ? zzd : null, zzetVar);
    }

    public static Boolean zzg(double d2, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(d2), zzerVar, Math.ulp(d2));
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    public static Boolean zzh(long j2, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(j2), zzerVar, 0.0d);
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    public static Boolean zzi(String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (zzlj.zzy(str)) {
            try {
                return zze(new BigDecimal(str), zzerVar, 0.0d);
            } catch (NumberFormatException e2) {
                return null;
            }
        }
        return null;
    }

    @VisibleForTesting
    public static Boolean zzj(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();
}
