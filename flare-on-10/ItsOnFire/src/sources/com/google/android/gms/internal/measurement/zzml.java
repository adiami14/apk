package com.google.android.gms.internal.measurement;

import androidx.appcompat.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzml.class */
public final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i2, int i3, zzmi zzmiVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = z;
        boolean z3 = false;
        if (zzkoVar != null) {
            z3 = false;
            if (zzkoVar.zzc(zzmiVar)) {
                z3 = true;
            }
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i2) {
        int i3 = i2 / 3;
        return (zzlf) this.zzd[i3 + i3 + 1];
    }

    private final zzmt zzB(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzmt zzmtVar = (zzmt) this.zzd[i4];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final Object zzD(Object obj, int i2) {
        zzmt zzB = zzB(i2);
        int zzy = zzy(i2);
        if (zzP(obj, i2)) {
            Object object = zzb.getObject(obj, zzy & 1048575);
            if (zzS(object)) {
                return object;
            }
            Object zze = zzB.zze();
            if (object != null) {
                zzB.zzg(zze, object);
            }
            return zze;
        }
        return zzB.zze();
    }

    private final Object zzE(Object obj, int i2, int i3) {
        zzmt zzB = zzB(i3);
        if (zzT(obj, i2, i3)) {
            Object object = zzb.getObject(obj, zzy(i3) & 1048575);
            if (zzS(object)) {
                return object;
            }
            Object zze = zzB.zze();
            if (object != null) {
                zzB.zzg(zze, object);
            }
            return zze;
        }
        return zzB.zze();
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i2) {
        if (zzP(obj2, i2)) {
            int zzy = zzy(i2);
            Unsafe unsafe = zzb;
            long j2 = zzy & 1048575;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i2);
            if (!zzP(obj, i2)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j2, zze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzJ(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            Object obj3 = object2;
            if (!zzS(object2)) {
                obj3 = zzB.zze();
                zzB.zzg(obj3, object2);
                unsafe.putObject(obj, j2, obj3);
            }
            zzB.zzg(obj3, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzT(obj2, i3, i2)) {
            int zzy = zzy(i2);
            Unsafe unsafe = zzb;
            long j2 = zzy & 1048575;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i2);
            if (!zzT(obj, i3, i2)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j2, zze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzK(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            Object obj3 = object2;
            if (!zzS(object2)) {
                obj3 = zzB.zze();
                zzB.zzg(obj3, object2);
                unsafe.putObject(obj, j2, obj3);
            }
            zzB.zzg(obj3, object);
        }
    }

    private final void zzJ(Object obj, int i2) {
        int zzv = zzv(i2);
        long j2 = 1048575 & zzv;
        if (j2 == 1048575) {
            return;
        }
        zznu.zzq(obj, j2, (1 << (zzv >>> 20)) | zznu.zzc(obj, j2));
    }

    private final void zzK(Object obj, int i2, int i3) {
        zznu.zzq(obj, zzv(i3) & 1048575, i2);
    }

    private final void zzL(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzJ(obj, i2);
    }

    private final void zzM(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzy(i3) & 1048575, obj2);
        zzK(obj, i2, i3);
    }

    private final void zzN(zzoc zzocVar, int i2, Object obj, int i3) throws IOException {
        if (obj == null) {
            return;
        }
        zzmb zzmbVar = (zzmb) zzC(i3);
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i2) {
        return zzP(obj, i2) == zzP(obj2, i2);
    }

    private final boolean zzP(Object obj, int i2) {
        int zzv = zzv(i2);
        long j2 = zzv & 1048575;
        if (j2 != 1048575) {
            return ((1 << (zzv >>> 20)) & zznu.zzc(obj, j2)) != 0;
        }
        int zzy = zzy(i2);
        int zzx = zzx(zzy);
        long j3 = zzy & 1048575;
        switch (zzx) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j3)) != 0;
            case 2:
                return zznu.zzd(obj, j3) != 0;
            case 3:
                return zznu.zzd(obj, j3) != 0;
            case 4:
                return zznu.zzc(obj, j3) != 0;
            case 5:
                return zznu.zzd(obj, j3) != 0;
            case 6:
                return zznu.zzc(obj, j3) != 0;
            case 7:
                return zznu.zzw(obj, j3);
            case 8:
                Object zzf = zznu.zzf(obj, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzka) {
                    return !zzka.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zznu.zzf(obj, j3) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j3));
            case 11:
                return zznu.zzc(obj, j3) != 0;
            case 12:
                return zznu.zzc(obj, j3) != 0;
            case 13:
                return zznu.zzc(obj, j3) != 0;
            case 14:
                return zznu.zzd(obj, j3) != 0;
            case 15:
                return zznu.zzc(obj, j3) != 0;
            case 16:
                return zznu.zzd(obj, j3) != 0;
            case 17:
                return zznu.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzP(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean zzR(Object obj, int i2, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i2 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i2, int i3) {
        return zznu.zzc(obj, (long) (zzv(i3) & 1048575)) == i2;
    }

    private static boolean zzU(Object obj, long j2) {
        return ((Boolean) zznu.zzf(obj, j2)).booleanValue();
    }

    private static final void zzV(int i2, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i2, (String) obj);
        } else {
            zzocVar.zzd(i2, (zzka) obj);
        }
    }

    public static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        zznl zznlVar2 = zznlVar;
        if (zznlVar == zznl.zzc()) {
            zznlVar2 = zznl.zzf();
            zzlbVar.zzc = zznlVar2;
        }
        return zznlVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0732  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r18, com.google.android.gms.internal.measurement.zzmf r19, com.google.android.gms.internal.measurement.zzmn r20, com.google.android.gms.internal.measurement.zzlw r21, com.google.android.gms.internal.measurement.zznk r22, com.google.android.gms.internal.measurement.zzko r23, com.google.android.gms.internal.measurement.zzmd r24) {
        /*
            Method dump skipped, instructions count: 2625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j2) {
        return ((Double) zznu.zzf(obj, j2)).doubleValue();
    }

    private static float zzn(Object obj, long j2) {
        return ((Float) zznu.zzf(obj, j2)).floatValue();
    }

    private final int zzo(Object obj) {
        int i2;
        int i3;
        int i4;
        int i5;
        int zzy;
        int zzx;
        int zzx2;
        Object object;
        int i6;
        int zzt;
        int zzc;
        int i7;
        int zzx3;
        Object object2;
        int i8;
        Unsafe unsafe = zzb;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i10 >= this.zzc.length) {
                zznk zznkVar = this.zzn;
                int zza2 = zznkVar.zza(zznkVar.zzd(obj));
                if (this.zzh) {
                    this.zzo.zza(obj);
                    throw null;
                }
                return i11 + zza2;
            }
            int zzy2 = zzy(i10);
            int[] iArr = this.zzc;
            int i14 = iArr[i10];
            int zzx4 = zzx(zzy2);
            if (zzx4 <= 17) {
                int i15 = iArr[i10 + 2];
                int i16 = i15 & 1048575;
                i4 = i9;
                if (i16 != i9) {
                    i13 = unsafe.getInt(obj, i16);
                    i4 = i16;
                }
                i2 = 1 << (i15 >>> 20);
                i3 = i13;
            } else {
                i2 = 0;
                i3 = i13;
                i4 = i9;
            }
            long j2 = zzy2 & 1048575;
            switch (zzx4) {
                case 0:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    zzx2 = zzki.zzx(i14 << 3) + 8;
                    i5 = i11 + zzx2;
                    break;
                case 1:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    zzx2 = zzki.zzx(i14 << 3) + 4;
                    i5 = i11 + zzx2;
                    break;
                case 2:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    zzy = zzki.zzy(unsafe.getLong(obj, j2));
                    zzx = zzki.zzx(i14 << 3);
                    i5 = i11 + zzx + zzy;
                    break;
                case 3:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    zzy = zzki.zzy(unsafe.getLong(obj, j2));
                    zzx = zzki.zzx(i14 << 3);
                    i5 = i11 + zzx + zzy;
                    break;
                case 4:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    i6 = i14 << 3;
                    zzy = zzki.zzu(unsafe.getInt(obj, j2));
                    zzx = zzki.zzx(i6);
                    i5 = i11 + zzx + zzy;
                    break;
                case 5:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    zzx2 = zzki.zzx(i14 << 3) + 8;
                    i5 = i11 + zzx2;
                    break;
                case 6:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    zzx2 = zzki.zzx(i14 << 3) + 4;
                    i5 = i11 + zzx2;
                    break;
                case 7:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i14 << 3) + 1;
                        i5 = i11 + zzx2;
                        break;
                    }
                case 8:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j2);
                        if (!(object instanceof zzka)) {
                            i6 = i14 << 3;
                            zzy = zzki.zzw((String) object);
                            zzx = zzki.zzx(i6);
                            i5 = i11 + zzx + zzy;
                            break;
                        }
                        int i17 = zzki.zzb;
                        int zzd = ((zzka) object).zzd();
                        zzx2 = zzki.zzx(i14 << 3) + zzki.zzx(zzd) + zzd;
                        i5 = i11 + zzx2;
                        break;
                    }
                case 9:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    } else {
                        zzx2 = zzmv.zzn(i14, unsafe.getObject(obj, j2), zzB(i10));
                        i5 = i11 + zzx2;
                        break;
                    }
                case 10:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j2);
                        int i172 = zzki.zzb;
                        int zzd2 = ((zzka) object).zzd();
                        zzx2 = zzki.zzx(i14 << 3) + zzki.zzx(zzd2) + zzd2;
                        i5 = i11 + zzx2;
                        break;
                    }
                case 11:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    } else {
                        i6 = i14 << 3;
                        zzy = zzki.zzx(unsafe.getInt(obj, j2));
                        zzx = zzki.zzx(i6);
                        i5 = i11 + zzx + zzy;
                        break;
                    }
                case 12:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    i6 = i14 << 3;
                    zzy = zzki.zzu(unsafe.getInt(obj, j2));
                    zzx = zzki.zzx(i6);
                    i5 = i11 + zzx + zzy;
                    break;
                case 13:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    zzx2 = zzki.zzx(i14 << 3) + 4;
                    i5 = i11 + zzx2;
                    break;
                case 14:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    }
                    zzx2 = zzki.zzx(i14 << 3) + 8;
                    i5 = i11 + zzx2;
                    break;
                case 15:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    } else {
                        int i18 = unsafe.getInt(obj, j2);
                        zzx = zzki.zzx(i14 << 3);
                        zzy = zzki.zzx((i18 >> 31) ^ (i18 + i18));
                        i5 = i11 + zzx + zzy;
                        break;
                    }
                case 16:
                    i5 = i11;
                    if ((i2 & i3) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j2);
                        i5 = i11 + zzki.zzx(i14 << 3) + zzki.zzy((j3 >> 63) ^ (j3 + j3));
                        break;
                    }
                case 17:
                    i5 = i11;
                    if ((i3 & i2) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzt(i14, (zzmi) unsafe.getObject(obj, j2), zzB(i10));
                        i5 = i11 + zzx2;
                        break;
                    }
                case 18:
                case 23:
                    zzx2 = zzmv.zzg(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzx2;
                    break;
                case 19:
                case 24:
                    zzx2 = zzmv.zze(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzx2;
                    break;
                case 20:
                    zzx2 = zzmv.zzl(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzx2;
                    break;
                case 21:
                    zzx2 = zzmv.zzw(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzx2;
                    break;
                case 22:
                    zzx2 = zzmv.zzj(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzx2;
                    break;
                case 25:
                    zzx2 = zzmv.zza(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzx2;
                    break;
                case 26:
                    zzt = zzmv.zzt(i14, (List) unsafe.getObject(obj, j2));
                    i5 = i11 + zzt;
                    break;
                case 27:
                    zzt = zzmv.zzo(i14, (List) unsafe.getObject(obj, j2), zzB(i10));
                    i5 = i11 + zzt;
                    break;
                case 28:
                    zzt = zzmv.zzb(i14, (List) unsafe.getObject(obj, j2));
                    i5 = i11 + zzt;
                    break;
                case 29:
                    zzt = zzmv.zzu(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzt;
                    break;
                case 30:
                    zzc = zzmv.zzc(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzc;
                    break;
                case 31:
                    zzc = zzmv.zze(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzc;
                    break;
                case 32:
                    zzc = zzmv.zzg(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzc;
                    break;
                case 33:
                    zzc = zzmv.zzp(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzc;
                    break;
                case 34:
                    zzc = zzmv.zzr(i14, (List) unsafe.getObject(obj, j2), false);
                    i5 = i11 + zzc;
                    break;
                case 35:
                    int zzh = zzmv.zzh((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzh <= 0) {
                        break;
                    } else {
                        i7 = zzh;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 36:
                    int zzf = zzmv.zzf((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzf <= 0) {
                        break;
                    } else {
                        i7 = zzf;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 37:
                    int zzm = zzmv.zzm((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzm <= 0) {
                        break;
                    } else {
                        i7 = zzm;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 38:
                    int zzx5 = zzmv.zzx((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzx5 <= 0) {
                        break;
                    } else {
                        i7 = zzx5;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 39:
                    int zzk = zzmv.zzk((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzk <= 0) {
                        break;
                    } else {
                        i7 = zzk;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 40:
                    int zzh2 = zzmv.zzh((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzh2 <= 0) {
                        break;
                    } else {
                        i7 = zzh2;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 41:
                    int zzf2 = zzmv.zzf((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzf2 <= 0) {
                        break;
                    } else {
                        i7 = zzf2;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j2);
                    int i19 = zzmv.zza;
                    int size = list.size();
                    i5 = i11;
                    if (size <= 0) {
                        break;
                    } else {
                        i7 = size;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 43:
                    int zzv = zzmv.zzv((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzv <= 0) {
                        break;
                    } else {
                        i7 = zzv;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 44:
                    int zzd3 = zzmv.zzd((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzd3 <= 0) {
                        break;
                    } else {
                        i7 = zzd3;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 45:
                    int zzf3 = zzmv.zzf((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzf3 <= 0) {
                        break;
                    } else {
                        i7 = zzf3;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 46:
                    int zzh3 = zzmv.zzh((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzh3 <= 0) {
                        break;
                    } else {
                        i7 = zzh3;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 47:
                    int zzq = zzmv.zzq((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzq <= 0) {
                        break;
                    } else {
                        i7 = zzq;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    int zzs = zzmv.zzs((List) unsafe.getObject(obj, j2));
                    i5 = i11;
                    if (zzs <= 0) {
                        break;
                    } else {
                        i7 = zzs;
                        zzx3 = zzki.zzx(i14 << 3) + zzki.zzx(i7);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    zzt = zzmv.zzi(i14, (List) unsafe.getObject(obj, j2), zzB(i10));
                    i5 = i11 + zzt;
                    break;
                case 50:
                    zzmd.zza(i14, unsafe.getObject(obj, j2), zzC(i10));
                    i5 = i11;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    zzt = zzki.zzx(i14 << 3) + 8;
                    i5 = i11 + zzt;
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    zzt = zzki.zzx(i14 << 3) + 4;
                    i5 = i11 + zzt;
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    i7 = zzki.zzy(zzz(obj, j2));
                    zzx3 = zzki.zzx(i14 << 3);
                    i5 = i11 + zzx3 + i7;
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    i7 = zzki.zzy(zzz(obj, j2));
                    zzx3 = zzki.zzx(i14 << 3);
                    i5 = i11 + zzx3 + i7;
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    i8 = i14 << 3;
                    i7 = zzki.zzu(zzp(obj, j2));
                    zzx3 = zzki.zzx(i8);
                    i5 = i11 + zzx3 + i7;
                    break;
                case 56:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    zzt = zzki.zzx(i14 << 3) + 8;
                    i5 = i11 + zzt;
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    zzt = zzki.zzx(i14 << 3) + 4;
                    i5 = i11 + zzt;
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    } else {
                        zzt = zzki.zzx(i14 << 3) + 1;
                        i5 = i11 + zzt;
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    } else {
                        object2 = unsafe.getObject(obj, j2);
                        if (!(object2 instanceof zzka)) {
                            i8 = i14 << 3;
                            i7 = zzki.zzw((String) object2);
                            zzx3 = zzki.zzx(i8);
                            i5 = i11 + zzx3 + i7;
                            break;
                        }
                        int i20 = zzki.zzb;
                        int zzd4 = ((zzka) object2).zzd();
                        zzt = zzki.zzx(i14 << 3) + zzki.zzx(zzd4) + zzd4;
                        i5 = i11 + zzt;
                        break;
                    }
                case 60:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    } else {
                        zzt = zzmv.zzn(i14, unsafe.getObject(obj, j2), zzB(i10));
                        i5 = i11 + zzt;
                        break;
                    }
                case 61:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    } else {
                        object2 = unsafe.getObject(obj, j2);
                        int i202 = zzki.zzb;
                        int zzd42 = ((zzka) object2).zzd();
                        zzt = zzki.zzx(i14 << 3) + zzki.zzx(zzd42) + zzd42;
                        i5 = i11 + zzt;
                        break;
                    }
                case 62:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    } else {
                        i8 = i14 << 3;
                        i7 = zzki.zzx(zzp(obj, j2));
                        zzx3 = zzki.zzx(i8);
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case 63:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    i8 = i14 << 3;
                    i7 = zzki.zzu(zzp(obj, j2));
                    zzx3 = zzki.zzx(i8);
                    i5 = i11 + zzx3 + i7;
                    break;
                case 64:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    zzt = zzki.zzx(i14 << 3) + 4;
                    i5 = i11 + zzt;
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    }
                    zzt = zzki.zzx(i14 << 3) + 8;
                    i5 = i11 + zzt;
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    } else {
                        int zzp = zzp(obj, j2);
                        zzx3 = zzki.zzx(i14 << 3);
                        i7 = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        i5 = i11 + zzx3 + i7;
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    } else {
                        long zzz = zzz(obj, j2);
                        i5 = i11 + zzki.zzx(i14 << 3) + zzki.zzy((zzz >> 63) ^ (zzz + zzz));
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    i5 = i11;
                    if (!zzT(obj, i14, i10)) {
                        break;
                    } else {
                        zzt = zzki.zzt(i14, (zzmi) unsafe.getObject(obj, j2), zzB(i10));
                        i5 = i11 + zzt;
                        break;
                    }
                default:
                    i5 = i11;
                    break;
            }
            i10 += 3;
            i11 = i5;
            i9 = i4;
            i12 = i3;
        }
    }

    private static int zzp(Object obj, long j2) {
        return ((Integer) zznu.zzf(obj, j2)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i2, int i3, int i4, long j2, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i4);
        Object object = unsafe.getObject(obj, j2);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j2, zzb2);
        }
        zzmb zzmbVar = (zzmb) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzjn zzjnVar) throws IOException {
        Object valueOf;
        Object valueOf2;
        int zzm;
        long j3;
        int i10;
        Object valueOf3;
        int zzo;
        Object obj2;
        Unsafe unsafe = zzb;
        long j4 = this.zzc[i9 + 2] & 1048575;
        switch (i8) {
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (i6 == 1) {
                    valueOf = Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i2)));
                    unsafe.putObject(obj, j2, valueOf);
                    zzm = i2 + 8;
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (i6 == 5) {
                    valueOf2 = Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i2)));
                    unsafe.putObject(obj, j2, valueOf2);
                    zzm = i2 + 4;
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (i6 == 0) {
                    zzm = zzjo.zzm(bArr, i2, zzjnVar);
                    j3 = zzjnVar.zzb;
                    valueOf3 = Long.valueOf(j3);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case 62:
                if (i6 == 0) {
                    zzm = zzjo.zzj(bArr, i2, zzjnVar);
                    i10 = zzjnVar.zza;
                    valueOf3 = Integer.valueOf(i10);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case 56:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i6 == 1) {
                    valueOf = Long.valueOf(zzjo.zzp(bArr, i2));
                    unsafe.putObject(obj, j2, valueOf);
                    zzm = i2 + 8;
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case 64:
                if (i6 == 5) {
                    valueOf2 = Integer.valueOf(zzjo.zzb(bArr, i2));
                    unsafe.putObject(obj, j2, valueOf2);
                    zzm = i2 + 4;
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                if (i6 == 0) {
                    zzm = zzjo.zzm(bArr, i2, zzjnVar);
                    valueOf3 = Boolean.valueOf(zzjnVar.zzb != 0);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i6 == 2) {
                    i2 = zzjo.zzj(bArr, i2, zzjnVar);
                    int i11 = zzjnVar.zza;
                    if (i11 == 0) {
                        unsafe.putObject(obj, j2, "");
                    } else if ((i7 & 536870912) != 0 && !zznz.zze(bArr, i2, i2 + i11)) {
                        throw zzll.zzc();
                    } else {
                        unsafe.putObject(obj, j2, new String(bArr, i2, i11, zzlj.zzb));
                        i2 += i11;
                    }
                    unsafe.putInt(obj, j4, i5);
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    Object zzE = zzE(obj, i5, i9);
                    zzo = zzjo.zzo(zzE, zzB(i9), bArr, i2, i3, zzjnVar);
                    obj2 = zzE;
                    zzM(obj, i5, i9, obj2);
                    return zzo;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    zzm = zzjo.zza(bArr, i2, zzjnVar);
                    valueOf3 = zzjnVar.zzc;
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    i2 = zzjo.zzj(bArr, i2, zzjnVar);
                    int i12 = zzjnVar.zza;
                    zzlf zzA = zzA(i9);
                    if (zzA == null || zzA.zza(i12)) {
                        unsafe.putObject(obj, j2, Integer.valueOf(i12));
                        unsafe.putInt(obj, j4, i5);
                    } else {
                        zzd(obj).zzj(i4, Long.valueOf(i12));
                    }
                }
                return i2;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i6 == 0) {
                    zzm = zzjo.zzj(bArr, i2, zzjnVar);
                    i10 = zzke.zzb(zzjnVar.zza);
                    valueOf3 = Integer.valueOf(i10);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i6 == 0) {
                    zzm = zzjo.zzm(bArr, i2, zzjnVar);
                    j3 = zzke.zzc(zzjnVar.zzb);
                    valueOf3 = Long.valueOf(j3);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i6 == 3) {
                    Object zzE2 = zzE(obj, i5, i9);
                    zzo = zzjo.zzn(zzE2, zzB(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzjnVar);
                    obj2 = zzE2;
                    zzM(obj, i5, i9, obj2);
                    return zzo;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0636  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0387 -> B:102:0x039d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x03e8 -> B:100:0x0379). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x046e -> B:140:0x047d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x04b8 -> B:137:0x044a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x0627 -> B:205:0x062a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x0663 -> B:203:0x0621). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzs(java.lang.Object r9, byte[] r10, int r11, int r12, int r13, int r14, int r15, int r16, long r17, int r19, long r20, com.google.android.gms.internal.measurement.zzjn r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzjn):int");
    }

    private final int zzt(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzw(i2, 0);
    }

    private final int zzu(int i2, int i3) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzw(i2, i3);
    }

    private final int zzv(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzw(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.zzc[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzy(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzz(Object obj, long j2) {
        return ((Long) zznu.zzf(obj, j2)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int zzo;
        int i2;
        long zzd;
        Object obj2;
        Object obj3;
        int zzc;
        int zzc2;
        int zzc3;
        long zzd2;
        int zzg;
        int i3;
        int zzx;
        int i4;
        if (this.zzi) {
            Unsafe unsafe = zzb;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i5 < this.zzc.length) {
                    int zzy = zzy(i5);
                    int zzx2 = zzx(zzy);
                    int i8 = this.zzc[i5];
                    if (zzx2 >= zzkt.zzJ.zza() && zzx2 <= zzkt.zzW.zza()) {
                        int i9 = this.zzc[i5 + 2];
                    }
                    long j2 = zzy & 1048575;
                    switch (zzx2) {
                        case 0:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 8;
                            break;
                        case 1:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 4;
                            break;
                        case 2:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzd = zznu.zzd(obj, j2);
                            i3 = zzki.zzy(zzd);
                            zzx = zzki.zzx(i8 << 3);
                            i2 = i7 + zzx + i3;
                            i5 += 3;
                            i6 = i2;
                        case 3:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzd = zznu.zzd(obj, j2);
                            i3 = zzki.zzy(zzd);
                            zzx = zzki.zzx(i8 << 3);
                            i2 = i7 + zzx + i3;
                            i5 += 3;
                            i6 = i2;
                        case 4:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzc2 = zznu.zzc(obj, j2);
                            i4 = i8 << 3;
                            i3 = zzki.zzu(zzc2);
                            zzx = zzki.zzx(i4);
                            i2 = i7 + zzx + i3;
                            i5 += 3;
                            i6 = i2;
                        case 5:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 8;
                            break;
                        case 6:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 4;
                            break;
                        case 7:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 1;
                            break;
                        case 8:
                            i2 = i7;
                            if (zzP(obj, i5)) {
                                Object zzf = zznu.zzf(obj, j2);
                                obj2 = zzf;
                                if (zzf instanceof zzka) {
                                    obj3 = zzf;
                                    int i10 = zzki.zzb;
                                    int zzd3 = ((zzka) obj3).zzd();
                                    zzg = zzki.zzx(i8 << 3) + zzki.zzx(zzd3) + zzd3;
                                    break;
                                }
                                i4 = i8 << 3;
                                i3 = zzki.zzw((String) obj2);
                                zzx = zzki.zzx(i4);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 9:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzmv.zzn(i8, zznu.zzf(obj, j2), zzB(i5));
                            break;
                        case 10:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            obj3 = zznu.zzf(obj, j2);
                            int i102 = zzki.zzb;
                            int zzd32 = ((zzka) obj3).zzd();
                            zzg = zzki.zzx(i8 << 3) + zzki.zzx(zzd32) + zzd32;
                            break;
                        case 11:
                            i2 = i7;
                            if (zzP(obj, i5)) {
                                zzc = zznu.zzc(obj, j2);
                                i4 = i8 << 3;
                                i3 = zzki.zzx(zzc);
                                zzx = zzki.zzx(i4);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 12:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzc2 = zznu.zzc(obj, j2);
                            i4 = i8 << 3;
                            i3 = zzki.zzu(zzc2);
                            zzx = zzki.zzx(i4);
                            i2 = i7 + zzx + i3;
                            i5 += 3;
                            i6 = i2;
                        case 13:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 4;
                            break;
                        case 14:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 8;
                            break;
                        case 15:
                            i2 = i7;
                            if (zzP(obj, i5)) {
                                zzc3 = zznu.zzc(obj, j2);
                                zzx = zzki.zzx(i8 << 3);
                                i3 = zzki.zzx((zzc3 >> 31) ^ (zzc3 + zzc3));
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 16:
                            i2 = i7;
                            if (zzP(obj, i5)) {
                                zzd2 = zznu.zzd(obj, j2);
                                zzg = zzki.zzx(i8 << 3) + zzki.zzy((zzd2 + zzd2) ^ (zzd2 >> 63));
                                break;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 17:
                            i2 = i7;
                            if (!zzP(obj, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzt(i8, (zzmi) zznu.zzf(obj, j2), zzB(i5));
                            break;
                        case 18:
                        case 23:
                        case 32:
                            zzg = zzmv.zzg(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 19:
                        case 24:
                        case 31:
                            zzg = zzmv.zze(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 20:
                            zzg = zzmv.zzl(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 21:
                            zzg = zzmv.zzw(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 22:
                            zzg = zzmv.zzj(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 25:
                            zzg = zzmv.zza(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 26:
                            zzg = zzmv.zzt(i8, (List) zznu.zzf(obj, j2));
                            break;
                        case 27:
                            zzg = zzmv.zzo(i8, (List) zznu.zzf(obj, j2), zzB(i5));
                            break;
                        case 28:
                            zzg = zzmv.zzb(i8, (List) zznu.zzf(obj, j2));
                            break;
                        case 29:
                            zzg = zzmv.zzu(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 30:
                            zzg = zzmv.zzc(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 33:
                            zzg = zzmv.zzp(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 34:
                            zzg = zzmv.zzr(i8, (List) zznu.zzf(obj, j2), false);
                            break;
                        case 35:
                            int zzh = zzmv.zzh((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzh > 0) {
                                i3 = zzh;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 36:
                            int zzf2 = zzmv.zzf((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzf2 > 0) {
                                i3 = zzf2;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 37:
                            int zzm = zzmv.zzm((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzm > 0) {
                                i3 = zzm;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 38:
                            int zzx3 = zzmv.zzx((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzx3 > 0) {
                                i3 = zzx3;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 39:
                            int zzk = zzmv.zzk((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzk > 0) {
                                i3 = zzk;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 40:
                            int zzh2 = zzmv.zzh((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzh2 > 0) {
                                i3 = zzh2;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 41:
                            int zzf3 = zzmv.zzf((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzf3 > 0) {
                                i3 = zzf3;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 42:
                            List list = (List) unsafe.getObject(obj, j2);
                            int i11 = zzmv.zza;
                            int size = list.size();
                            i2 = i7;
                            if (size > 0) {
                                i3 = size;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 43:
                            int zzv = zzmv.zzv((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzv > 0) {
                                i3 = zzv;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 44:
                            int zzd4 = zzmv.zzd((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzd4 > 0) {
                                i3 = zzd4;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 45:
                            int zzf4 = zzmv.zzf((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzf4 > 0) {
                                i3 = zzf4;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 46:
                            int zzh3 = zzmv.zzh((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzh3 > 0) {
                                i3 = zzh3;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 47:
                            int zzq = zzmv.zzq((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzq > 0) {
                                i3 = zzq;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            int zzs = zzmv.zzs((List) unsafe.getObject(obj, j2));
                            i2 = i7;
                            if (zzs > 0) {
                                i3 = zzs;
                                zzx = zzki.zzx(i8 << 3) + zzki.zzx(i3);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            zzg = zzmv.zzi(i8, (List) zznu.zzf(obj, j2), zzB(i5));
                            break;
                        case 50:
                            zzmd.zza(i8, zznu.zzf(obj, j2), zzC(i5));
                            i2 = i7;
                            continue;
                            i5 += 3;
                            i6 = i2;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 8;
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 4;
                            break;
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzd = zzz(obj, j2);
                            i3 = zzki.zzy(zzd);
                            zzx = zzki.zzx(i8 << 3);
                            i2 = i7 + zzx + i3;
                            i5 += 3;
                            i6 = i2;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzd = zzz(obj, j2);
                            i3 = zzki.zzy(zzd);
                            zzx = zzki.zzx(i8 << 3);
                            i2 = i7 + zzx + i3;
                            i5 += 3;
                            i6 = i2;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzc2 = zzp(obj, j2);
                            i4 = i8 << 3;
                            i3 = zzki.zzu(zzc2);
                            zzx = zzki.zzx(i4);
                            i2 = i7 + zzx + i3;
                            i5 += 3;
                            i6 = i2;
                        case 56:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 8;
                            break;
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 4;
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 1;
                            break;
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            i2 = i7;
                            if (zzT(obj, i8, i5)) {
                                Object zzf5 = zznu.zzf(obj, j2);
                                obj2 = zzf5;
                                if (zzf5 instanceof zzka) {
                                    obj3 = zzf5;
                                    int i1022 = zzki.zzb;
                                    int zzd322 = ((zzka) obj3).zzd();
                                    zzg = zzki.zzx(i8 << 3) + zzki.zzx(zzd322) + zzd322;
                                    break;
                                }
                                i4 = i8 << 3;
                                i3 = zzki.zzw((String) obj2);
                                zzx = zzki.zzx(i4);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 60:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzmv.zzn(i8, zznu.zzf(obj, j2), zzB(i5));
                            break;
                        case 61:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            obj3 = zznu.zzf(obj, j2);
                            int i10222 = zzki.zzb;
                            int zzd3222 = ((zzka) obj3).zzd();
                            zzg = zzki.zzx(i8 << 3) + zzki.zzx(zzd3222) + zzd3222;
                            break;
                        case 62:
                            i2 = i7;
                            if (zzT(obj, i8, i5)) {
                                zzc = zzp(obj, j2);
                                i4 = i8 << 3;
                                i3 = zzki.zzx(zzc);
                                zzx = zzki.zzx(i4);
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case 63:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzc2 = zzp(obj, j2);
                            i4 = i8 << 3;
                            i3 = zzki.zzu(zzc2);
                            zzx = zzki.zzx(i4);
                            i2 = i7 + zzx + i3;
                            i5 += 3;
                            i6 = i2;
                        case 64:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 4;
                            break;
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzx(i8 << 3) + 8;
                            break;
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            i2 = i7;
                            if (zzT(obj, i8, i5)) {
                                zzc3 = zzp(obj, j2);
                                zzx = zzki.zzx(i8 << 3);
                                i3 = zzki.zzx((zzc3 >> 31) ^ (zzc3 + zzc3));
                                i2 = i7 + zzx + i3;
                                i5 += 3;
                                i6 = i2;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            i2 = i7;
                            if (zzT(obj, i8, i5)) {
                                zzd2 = zzz(obj, j2);
                                zzg = zzki.zzx(i8 << 3) + zzki.zzy((zzd2 + zzd2) ^ (zzd2 >> 63));
                                break;
                            } else {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            i2 = i7;
                            if (!zzT(obj, i8, i5)) {
                                continue;
                                i5 += 3;
                                i6 = i2;
                            }
                            zzg = zzki.zzt(i8, (zzmi) zznu.zzf(obj, j2), zzB(i5));
                            break;
                        default:
                            i2 = i7;
                            continue;
                            i5 += 3;
                            i6 = i2;
                    }
                    i2 = i7 + zzg;
                    i5 += 3;
                    i6 = i2;
                } else {
                    zznk zznkVar = this.zzn;
                    zzo = i7 + zznkVar.zza(zznkVar.zzd(obj));
                }
            }
        } else {
            zzo = zzo(obj);
        }
        return zzo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0307, code lost:
        if (r16 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0330, code lost:
        if (r16 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0333, code lost:
        r11 = r16.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x033a, code lost:
        r11 = (r10 * 53) + r11;
     */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x064c, code lost:
        if (r31 != r0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x069a, code lost:
        if (r31 != r0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x074c, code lost:
        if (r33 == 1048575) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x074f, code lost:
        r0.putInt(r18, r33, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x075a, code lost:
        r36 = r17.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0766, code lost:
        if (r36 >= r17.zzl) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0769, code lost:
        r0 = r17.zzj[r36];
        r0 = r17.zzc[r0];
        r0 = com.google.android.gms.internal.measurement.zznu.zzf(r18, r17.zzy(r0) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x078d, code lost:
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0799, code lost:
        if (r17.zzA(r0) != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x079c, code lost:
        r36 = r36 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x07a2, code lost:
        r0 = (com.google.android.gms.internal.measurement.zzmc) r0;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r17.zzC(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x07b3, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x07b6, code lost:
        if (r21 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x07bc, code lost:
        if (r19 != r20) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x07c5, code lost:
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x07c9, code lost:
        if (r19 > r20) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x07d0, code lost:
        if (r31 != r21) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x07d4, code lost:
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x07d8, code lost:
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, com.google.android.gms.internal.measurement.zzjn r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        int i2;
        if (zzS(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.zzbP(Integer.MAX_VALUE);
                zzlbVar.zzb = 0;
                zzlbVar.zzbN();
            }
            int length = this.zzc.length;
            for (i2 = 0; i2 < length; i2 = i2 + 3) {
                int zzy = zzy(i2);
                int zzx = zzx(zzy);
                long j2 = 1048575 & zzy;
                if (zzx != 9) {
                    if (zzx != 60 && zzx != 68) {
                        switch (zzx) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                this.zzm.zza(obj, j2);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        if (!zzT(obj, this.zzc[i2], i2)) {
                        }
                        zzB(i2).zzf(zzb.getObject(obj, j2));
                    }
                }
                i2 = zzP(obj, i2) ? 0 : i2 + 3;
                zzB(i2).zzf(zzb.getObject(obj, j2));
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzy = zzy(i2);
            int i3 = this.zzc[i2];
            int zzx = zzx(zzy);
            long j2 = 1048575 & zzy;
            switch (zzx) {
                case 0:
                    if (zzP(obj2, i2)) {
                        zznu.zzo(obj, j2, zznu.zza(obj2, j2));
                        zzJ(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i2)) {
                        zznu.zzp(obj, j2, zznu.zzb(obj2, j2));
                        zzJ(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 3:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 4:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 5:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 6:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 7:
                    if (zzP(obj2, i2)) {
                        zznu.zzm(obj, j2, zznu.zzw(obj2, j2));
                        zzJ(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzs(obj, j2, zznu.zzf(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 9:
                case 17:
                    zzH(obj, obj2, i2);
                    break;
                case 10:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzs(obj, j2, zznu.zzf(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 11:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 12:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 13:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 14:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 15:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 16:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    this.zzm.zzb(obj, obj2, j2);
                    break;
                case 50:
                    int i4 = zzmv.zza;
                    zznu.zzs(obj, j2, zzmd.zzb(zznu.zzf(obj, j2), zznu.zzf(obj2, j2)));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case 56:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (!zzT(obj2, i3, i2)) {
                        break;
                    }
                    zznu.zzs(obj, j2, zznu.zzf(obj2, j2));
                    zzK(obj, i3, i2);
                    break;
                case 60:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zzI(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!zzT(obj2, i3, i2)) {
                        break;
                    }
                    zznu.zzs(obj, j2, zznu.zzf(obj2, j2));
                    zzK(obj, i3, i2);
                    break;
            }
        }
        zzmv.zzB(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x04d8, code lost:
        if (r29 != r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x050c, code lost:
        if (r29 != r0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v234, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.android.gms.internal.measurement.zzjn r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i2;
        int i3;
        double zza2;
        float zzb2;
        long zzd;
        long zzd2;
        int zzc;
        long zzd3;
        int zzc2;
        boolean zzw;
        int zzc3;
        int zzc4;
        int zzc5;
        long zzd4;
        int zzc6;
        long zzd5;
        int i4 = 0;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i5 = 0; i5 < length; i5 += 3) {
                int zzy = zzy(i5);
                int i6 = this.zzc[i5];
                switch (zzx(zzy)) {
                    case 0:
                        if (zzP(obj, i5)) {
                            zza2 = zznu.zza(obj, zzy & 1048575);
                            zzocVar.zzf(i6, zza2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i5)) {
                            zzb2 = zznu.zzb(obj, zzy & 1048575);
                            zzocVar.zzo(i6, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i5)) {
                            zzd = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzt(i6, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i5)) {
                            zzd2 = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzJ(i6, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i5)) {
                            zzc = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzr(i6, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i5)) {
                            zzd3 = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzm(i6, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i5)) {
                            zzc2 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzk(i6, zzc2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i5)) {
                            zzw = zznu.zzw(obj, zzy & 1048575);
                            zzocVar.zzb(i6, zzw);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!zzP(obj, i5)) {
                            break;
                        }
                        zzV(i6, zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 9:
                        if (!zzP(obj, i5)) {
                            break;
                        }
                        zzocVar.zzv(i6, zznu.zzf(obj, zzy & 1048575), zzB(i5));
                        break;
                    case 10:
                        if (!zzP(obj, i5)) {
                            break;
                        }
                        zzocVar.zzd(i6, (zzka) zznu.zzf(obj, zzy & 1048575));
                        break;
                    case 11:
                        if (zzP(obj, i5)) {
                            zzc3 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzH(i6, zzc3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i5)) {
                            zzc4 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzi(i6, zzc4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i5)) {
                            zzc5 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzw(i6, zzc5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i5)) {
                            zzd4 = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzy(i6, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i5)) {
                            zzc6 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzA(i6, zzc6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i5)) {
                            zzd5 = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzC(i6, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!zzP(obj, i5)) {
                            break;
                        }
                        zzocVar.zzq(i6, zznu.zzf(obj, zzy & 1048575), zzB(i5));
                        break;
                    case 18:
                        zzmv.zzF(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 19:
                        zzmv.zzJ(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 20:
                        zzmv.zzM(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 21:
                        zzmv.zzU(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 22:
                        zzmv.zzL(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 23:
                        zzmv.zzI(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 24:
                        zzmv.zzH(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 25:
                        zzmv.zzD(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 27:
                        zzmv.zzN(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i5));
                        break;
                    case 28:
                        zzmv.zzE(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 29:
                        zzmv.zzT(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzG(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzO(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 32:
                        zzmv.zzP(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzQ(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzR(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzF(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzJ(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzM(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzU(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzL(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzI(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzH(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzD(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzT(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzG(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzO(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzP(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzQ(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        zzmv.zzR(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        zzmv.zzK(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i5));
                        break;
                    case 50:
                        zzN(zzocVar, i6, zznu.zzf(obj, zzy & 1048575), i5);
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (zzT(obj, i6, i5)) {
                            zza2 = zzm(obj, zzy & 1048575);
                            zzocVar.zzf(i6, zza2);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (zzT(obj, i6, i5)) {
                            zzb2 = zzn(obj, zzy & 1048575);
                            zzocVar.zzo(i6, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (zzT(obj, i6, i5)) {
                            zzd = zzz(obj, zzy & 1048575);
                            zzocVar.zzt(i6, zzd);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (zzT(obj, i6, i5)) {
                            zzd2 = zzz(obj, zzy & 1048575);
                            zzocVar.zzJ(i6, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (zzT(obj, i6, i5)) {
                            zzc = zzp(obj, zzy & 1048575);
                            zzocVar.zzr(i6, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i6, i5)) {
                            zzd3 = zzz(obj, zzy & 1048575);
                            zzocVar.zzm(i6, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (zzT(obj, i6, i5)) {
                            zzc2 = zzp(obj, zzy & 1048575);
                            zzocVar.zzk(i6, zzc2);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (zzT(obj, i6, i5)) {
                            zzw = zzU(obj, zzy & 1048575);
                            zzocVar.zzb(i6, zzw);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!zzT(obj, i6, i5)) {
                            break;
                        }
                        zzV(i6, zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 60:
                        if (!zzT(obj, i6, i5)) {
                            break;
                        }
                        zzocVar.zzv(i6, zznu.zzf(obj, zzy & 1048575), zzB(i5));
                        break;
                    case 61:
                        if (!zzT(obj, i6, i5)) {
                            break;
                        }
                        zzocVar.zzd(i6, (zzka) zznu.zzf(obj, zzy & 1048575));
                        break;
                    case 62:
                        if (zzT(obj, i6, i5)) {
                            zzc3 = zzp(obj, zzy & 1048575);
                            zzocVar.zzH(i6, zzc3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i6, i5)) {
                            zzc4 = zzp(obj, zzy & 1048575);
                            zzocVar.zzi(i6, zzc4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i6, i5)) {
                            zzc5 = zzp(obj, zzy & 1048575);
                            zzocVar.zzw(i6, zzc5);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (zzT(obj, i6, i5)) {
                            zzd4 = zzz(obj, zzy & 1048575);
                            zzocVar.zzy(i6, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (zzT(obj, i6, i5)) {
                            zzc6 = zzp(obj, zzy & 1048575);
                            zzocVar.zzA(i6, zzc6);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (zzT(obj, i6, i5)) {
                            zzd5 = zzz(obj, zzy & 1048575);
                            zzocVar.zzC(i6, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (!zzT(obj, i6, i5)) {
                            break;
                        }
                        zzocVar.zzq(i6, zznu.zzf(obj, zzy & 1048575), zzB(i5));
                        break;
                }
            }
        } else if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        } else {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i7 = 0;
            int i8 = 0;
            int i9 = 1048575;
            while (true) {
                int i10 = i9;
                if (i7 < length2) {
                    int zzy2 = zzy(i7);
                    int[] iArr = this.zzc;
                    int i11 = iArr[i7];
                    int zzx = zzx(zzy2);
                    if (zzx <= 17) {
                        int i12 = iArr[i7 + 2];
                        int i13 = i12 & 1048575;
                        int i14 = i10;
                        if (i13 != i10) {
                            i8 = unsafe.getInt(obj, i13);
                            i14 = i13;
                        }
                        i2 = i14;
                        i4 = 1 << (i12 >>> 20);
                    } else {
                        i2 = i10;
                    }
                    long j2 = zzy2 & 1048575;
                    switch (zzx) {
                        case 0:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzf(i11, zznu.zza(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzo(i11, zznu.zzb(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzt(i11, unsafe.getLong(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzJ(i11, unsafe.getLong(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzr(i11, unsafe.getInt(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzm(i11, unsafe.getLong(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzk(i11, unsafe.getInt(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzb(i11, zznu.zzw(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzV(i11, unsafe.getObject(obj, j2), zzocVar);
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzv(i11, unsafe.getObject(obj, j2), zzB(i7));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzd(i11, (zzka) unsafe.getObject(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzH(i11, unsafe.getInt(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzi(i11, unsafe.getInt(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzw(i11, unsafe.getInt(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzy(i11, unsafe.getLong(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzA(i11, unsafe.getInt(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzC(i11, unsafe.getLong(obj, j2));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            i3 = 0;
                            if ((i8 & i4) != 0) {
                                zzocVar.zzq(i11, unsafe.getObject(obj, j2), zzB(i7));
                                i3 = 0;
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i3 = 0;
                            zzmv.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            break;
                        case 19:
                            i3 = 0;
                            zzmv.zzJ(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            break;
                        case 20:
                            i3 = 0;
                            zzmv.zzM(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            break;
                        case 21:
                            i3 = 0;
                            zzmv.zzU(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            break;
                        case 22:
                            i3 = 0;
                            zzmv.zzL(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            break;
                        case 23:
                            i3 = 0;
                            zzmv.zzI(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            break;
                        case 24:
                            i3 = 0;
                            zzmv.zzH(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            break;
                        case 25:
                            i3 = 0;
                            zzmv.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            break;
                        case 26:
                            zzmv.zzS(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar);
                            i3 = 0;
                            break;
                        case 27:
                            zzmv.zzN(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, zzB(i7));
                            i3 = 0;
                            break;
                        case 28:
                            zzmv.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar);
                            i3 = 0;
                            break;
                        case 29:
                            zzmv.zzT(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            i3 = 0;
                            break;
                        case 30:
                            zzmv.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            i3 = 0;
                            break;
                        case 31:
                            zzmv.zzO(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            i3 = 0;
                            break;
                        case 32:
                            zzmv.zzP(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            i3 = 0;
                            break;
                        case 33:
                            zzmv.zzQ(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            i3 = 0;
                            break;
                        case 34:
                            zzmv.zzR(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, false);
                            i3 = 0;
                            break;
                        case 35:
                            zzmv.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 36:
                            zzmv.zzJ(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 37:
                            zzmv.zzM(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 38:
                            zzmv.zzU(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 39:
                            zzmv.zzL(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 40:
                            zzmv.zzI(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 41:
                            zzmv.zzH(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 42:
                            zzmv.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 43:
                            zzmv.zzT(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 44:
                            zzmv.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 45:
                            zzmv.zzO(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 46:
                            zzmv.zzP(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case 47:
                            zzmv.zzQ(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            zzmv.zzR(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, true);
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            zzmv.zzK(this.zzc[i7], (List) unsafe.getObject(obj, j2), zzocVar, zzB(i7));
                            i3 = 0;
                            break;
                        case 50:
                            zzN(zzocVar, i11, unsafe.getObject(obj, j2), i7);
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzf(i11, zzm(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzo(i11, zzn(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzt(i11, zzz(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzJ(i11, zzz(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzr(i11, zzp(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case 56:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzm(i11, zzz(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzk(i11, zzp(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzb(i11, zzU(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            if (zzT(obj, i11, i7)) {
                                zzV(i11, unsafe.getObject(obj, j2), zzocVar);
                            }
                            i3 = 0;
                            break;
                        case 60:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzv(i11, unsafe.getObject(obj, j2), zzB(i7));
                            }
                            i3 = 0;
                            break;
                        case 61:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzd(i11, (zzka) unsafe.getObject(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case 62:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzH(i11, zzp(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case 63:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzi(i11, zzp(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case 64:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzw(i11, zzp(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzy(i11, zzz(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzA(i11, zzp(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzC(i11, zzz(obj, j2));
                            }
                            i3 = 0;
                            break;
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            if (zzT(obj, i11, i7)) {
                                zzocVar.zzq(i11, unsafe.getObject(obj, j2), zzB(i7));
                            }
                            i3 = 0;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    i7 += 3;
                    i4 = i3;
                    i9 = i2;
                }
            }
        }
        zznk zznkVar = this.zzn;
        zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzy = zzy(i2);
            int zzx = zzx(zzy);
            long j2 = zzy & 1048575;
            switch (zzx) {
                case 0:
                    if (zzO(obj, obj2, i2) && Double.doubleToLongBits(zznu.zza(obj, j2)) == Double.doubleToLongBits(zznu.zza(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (zzO(obj, obj2, i2) && Float.floatToIntBits(zznu.zzb(obj, j2)) == Float.floatToIntBits(zznu.zzb(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                case 3:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 4:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 5:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 6:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 7:
                    if (zzO(obj, obj2, i2) && zznu.zzw(obj, j2) == zznu.zzw(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 8:
                    if (zzO(obj, obj2, i2) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 9:
                    if (zzO(obj, obj2, i2) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 10:
                    if (zzO(obj, obj2, i2) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 11:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                case 12:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 13:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 14:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 15:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 16:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 17:
                    if (zzO(obj, obj2, i2) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                    if (zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case 56:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long zzv = zzv(i2) & 1048575;
                    if (zznu.zzc(obj, zzv) == zznu.zzc(obj2, zzv) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        if (this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i2 = 1048575;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzk; i4++) {
            int i5 = this.zzj[i4];
            int i6 = this.zzc[i5];
            int zzy = zzy(i5);
            int i7 = this.zzc[i5 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i2) {
                if (i8 != 1048575) {
                    i3 = zzb.getInt(obj, i8);
                }
                i2 = i8;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i5, i2, i3, i9)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i6, i5) && !zzR(obj, zzy, zzB(i5))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                            zzmb zzmbVar = (zzmb) zzC(i5);
                            throw null;
                        }
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i5);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzB.zzk(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzQ(obj, i5, i2, i3, i9) && !zzR(obj, zzy, zzB(i5))) {
                return false;
            }
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }
}
