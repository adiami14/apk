package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzkj.class */
final class zzkj implements zzoc {
    private final zzki zza;

    private zzkj(zzki zzkiVar) {
        byte[] bArr = zzlj.zzd;
        this.zza = zzkiVar;
        zzkiVar.zza = this;
    }

    public static zzkj zza(zzki zzkiVar) {
        zzkj zzkjVar = zzkiVar.zza;
        return zzkjVar != null ? zzkjVar : new zzkj(zzkiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzA(int i2, int i3) throws IOException {
        this.zza.zzp(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzB(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzki zzkiVar = this.zza;
                int intValue = ((Integer) list.get(i3)).intValue();
                zzkiVar.zzp(i2, (intValue >> 31) ^ (intValue + intValue));
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = ((Integer) list.get(i5)).intValue();
            i4 += zzki.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzki zzkiVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i6)).intValue();
            zzkiVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzC(int i2, long j2) throws IOException {
        this.zza.zzr(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzD(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzki zzkiVar = this.zza;
                long longValue = ((Long) list.get(i3)).longValue();
                zzkiVar.zzr(i2, (longValue >> 63) ^ (longValue + longValue));
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = ((Long) list.get(i5)).longValue();
            i4 += zzki.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzki zzkiVar2 = this.zza;
            long longValue3 = ((Long) list.get(i6)).longValue();
            zzkiVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzE(int i2) throws IOException {
        this.zza.zzo(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzF(int i2, String str) throws IOException {
        this.zza.zzm(i2, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzG(int i2, List list) throws IOException {
        if (!(list instanceof zzlq)) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzm(i2, (String) list.get(i3));
            }
            return;
        }
        zzlq zzlqVar = (zzlq) list;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object zzf = zzlqVar.zzf(i4);
            if (zzf instanceof String) {
                this.zza.zzm(i2, (String) zzf);
            } else {
                this.zza.zze(i2, (zzka) zzf);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzH(int i2, int i3) throws IOException {
        this.zza.zzp(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzI(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzp(i2, ((Integer) list.get(i3)).intValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzki.zzx(((Integer) list.get(i5)).intValue());
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzq(((Integer) list.get(i6)).intValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzJ(int i2, long j2) throws IOException {
        this.zza.zzr(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzK(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzr(i2, ((Long) list.get(i3)).longValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzki.zzy(((Long) list.get(i5)).longValue());
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzs(((Long) list.get(i6)).longValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzb(int i2, boolean z) throws IOException {
        this.zza.zzd(i2, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzc(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzd(i2, ((Boolean) list.get(i3)).booleanValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).booleanValue();
            i4++;
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzb(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzd(int i2, zzka zzkaVar) throws IOException {
        this.zza.zze(i2, zzkaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zze(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zze(i2, (zzka) list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzg(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).doubleValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzo(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzj(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzki.zzu(((Integer) list.get(i5)).intValue());
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzk(((Integer) list.get(i6)).intValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzl(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzg(((Integer) list.get(i6)).intValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzm(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzn(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzi(((Long) list.get(i6)).longValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzo(int i2, float f2) throws IOException {
        this.zza.zzf(i2, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzp(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzf(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).floatValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzq(int i2, Object obj, zzmt zzmtVar) throws IOException {
        zzki zzkiVar = this.zza;
        zzkiVar.zzo(i2, 3);
        zzmtVar.zzi((zzmi) obj, zzkiVar.zza);
        zzkiVar.zzo(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzs(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzki.zzu(((Integer) list.get(i5)).intValue());
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzk(((Integer) list.get(i6)).intValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzt(int i2, long j2) throws IOException {
        this.zza.zzr(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzu(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzr(i2, ((Long) list.get(i3)).longValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzki.zzy(((Long) list.get(i5)).longValue());
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzs(((Long) list.get(i6)).longValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzv(int i2, Object obj, zzmt zzmtVar) throws IOException {
        zzmi zzmiVar = (zzmi) obj;
        zzkf zzkfVar = (zzkf) this.zza;
        zzkfVar.zzq((i2 << 3) | 2);
        zzkfVar.zzq(((zzjk) zzmiVar).zzbu(zzmtVar));
        zzmtVar.zzi(zzmiVar, zzkfVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzw(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzx(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzg(((Integer) list.get(i6)).intValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzy(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzz(int i2, List list, boolean z) throws IOException {
        if (!z) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zzi(((Long) list.get(i6)).longValue());
        }
    }
}
