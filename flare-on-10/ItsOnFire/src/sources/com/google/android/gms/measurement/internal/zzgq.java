package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import j.y0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzgq.class */
final class zzgq implements Callable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzgv zzc;

    public zzgq(zzgv zzgvVar, zzau zzauVar, String str) {
        this.zzc = zzgvVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlm zzlmVar;
        long j2;
        zzaq zzc;
        zzlhVar = this.zzc.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzc.zza;
        zzip zzr = zzlhVar2.zzr();
        zzau zzauVar = this.zza;
        String str = this.zzb;
        zzr.zzg();
        zzgd.zzO();
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str);
        byte[] bArr = null;
        if (!zzr.zzt.zzf().zzs(str, zzeg.zzU)) {
            zzr.zzt.zzaA().zzc().zzb("Generating ScionPayload disabled. packageName", str);
            bArr = new byte[0];
        } else if ("_iap".equals(zzauVar.zza) || "_iapx".equals(zzauVar.zza)) {
            com.google.android.gms.internal.measurement.zzga zza = com.google.android.gms.internal.measurement.zzgb.zza();
            zzr.zzf.zzh().zzw();
            try {
                zzh zzj = zzr.zzf.zzh().zzj(str);
                if (zzj == null) {
                    zzr.zzt.zzaA().zzc().zzb("Log and bundle not available. package_name", str);
                } else if (zzj.zzan()) {
                    com.google.android.gms.internal.measurement.zzgc zzu = com.google.android.gms.internal.measurement.zzgd.zzu();
                    zzu.zzad(1);
                    zzu.zzZ("android");
                    if (!TextUtils.isEmpty(zzj.zzv())) {
                        zzu.zzD(zzj.zzv());
                    }
                    if (!TextUtils.isEmpty(zzj.zzx())) {
                        zzu.zzF((String) Preconditions.checkNotNull(zzj.zzx()));
                    }
                    if (!TextUtils.isEmpty(zzj.zzy())) {
                        zzu.zzG((String) Preconditions.checkNotNull(zzj.zzy()));
                    }
                    if (zzj.zzb() != -2147483648L) {
                        zzu.zzH((int) zzj.zzb());
                    }
                    zzu.zzV(zzj.zzm());
                    zzu.zzP(zzj.zzk());
                    String zzA = zzj.zzA();
                    String zzt = zzj.zzt();
                    if (!TextUtils.isEmpty(zzA)) {
                        zzu.zzU(zzA);
                    } else if (!TextUtils.isEmpty(zzt)) {
                        zzu.zzC(zzt);
                    }
                    zzpz.zzc();
                    if (zzr.zzt.zzf().zzs(null, zzeg.zzaE)) {
                        zzu.zzaj(zzj.zzr());
                    }
                    zzhb zzq = zzr.zzf.zzq(str);
                    zzu.zzM(zzj.zzj());
                    if (zzr.zzt.zzJ() && zzr.zzt.zzf().zzt(zzu.zzaq()) && zzq.zzj(zzha.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzu.zzO(null);
                    }
                    zzu.zzL(zzq.zzi());
                    if (zzq.zzj(zzha.AD_STORAGE) && zzj.zzam()) {
                        Pair zzd = zzr.zzf.zzs().zzd(zzj.zzv(), zzq);
                        if (zzj.zzam() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                            try {
                                zzu.zzae(zzip.zza((String) zzd.first, Long.toString(zzauVar.zzd)));
                                Object obj = zzd.second;
                                if (obj != null) {
                                    zzu.zzX(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e2) {
                                zzr.zzt.zzaA().zzc().zzb("Resettable device id encryption failed", e2.getMessage());
                            }
                        }
                    }
                    zzr.zzt.zzg().zzv();
                    zzu.zzN(Build.MODEL);
                    zzr.zzt.zzg().zzv();
                    zzu.zzY(Build.VERSION.RELEASE);
                    zzu.zzak((int) zzr.zzt.zzg().zzb());
                    zzu.zzao(zzr.zzt.zzg().zzc());
                    try {
                        if (zzq.zzj(zzha.ANALYTICS_STORAGE) && zzj.zzw() != null) {
                            zzu.zzE(zzip.zza((String) Preconditions.checkNotNull(zzj.zzw()), Long.toString(zzauVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzj.zzz())) {
                            zzu.zzT((String) Preconditions.checkNotNull(zzj.zzz()));
                        }
                        String zzv = zzj.zzv();
                        List zzu2 = zzr.zzf.zzh().zzu(zzv);
                        Iterator it = zzu2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zzlmVar = null;
                                break;
                            }
                            zzlmVar = (zzlm) it.next();
                            if ("_lte".equals(zzlmVar.zzc)) {
                                break;
                            }
                        }
                        if (zzlmVar == null || zzlmVar.zze == null) {
                            zzlm zzlmVar2 = new zzlm(zzv, y0.f624c, "_lte", zzr.zzt.zzax().currentTimeMillis(), 0L);
                            zzu2.add(zzlmVar2);
                            zzr.zzf.zzh().zzL(zzlmVar2);
                        }
                        zzlj zzu3 = zzr.zzf.zzu();
                        zzu3.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu3.zzt.zzg().zze()) {
                            String zzv2 = zzj.zzv();
                            Preconditions.checkNotNull(zzv2);
                            if (zzj.zzam() && zzu3.zzf.zzm().zzn(zzv2)) {
                                zzu3.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = zzu2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if ("_npa".equals(((zzlm) it2.next()).zzc)) {
                                            it2.remove();
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                zzu2.add(new zzlm(zzv2, y0.f624c, "_npa", zzu3.zzt.zzax().currentTimeMillis(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgm[] zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[zzu2.size()];
                        for (int i2 = 0; i2 < zzu2.size(); i2++) {
                            com.google.android.gms.internal.measurement.zzgl zzd2 = com.google.android.gms.internal.measurement.zzgm.zzd();
                            zzd2.zzf(((zzlm) zzu2.get(i2)).zzc);
                            zzd2.zzg(((zzlm) zzu2.get(i2)).zzd);
                            zzr.zzf.zzu().zzv(zzd2, ((zzlm) zzu2.get(i2)).zze);
                            zzgmVarArr[i2] = (com.google.android.gms.internal.measurement.zzgm) zzd2.zzaD();
                        }
                        zzu.zzj(Arrays.asList(zzgmVarArr));
                        zzeu zzb = zzeu.zzb(zzauVar);
                        zzr.zzt.zzv().zzL(zzb.zzd, zzr.zzf.zzh().zzi(str));
                        zzr.zzt.zzv().zzN(zzb, zzr.zzt.zzf().zzd(str));
                        Bundle bundle = zzb.zzd;
                        bundle.putLong("_c", 1L);
                        zzr.zzt.zzaA().zzc().zza("Marking in-app purchase as real-time");
                        bundle.putLong("_r", 1L);
                        bundle.putString("_o", zzauVar.zzc);
                        if (zzr.zzt.zzv().zzaf(zzu.zzaq())) {
                            zzr.zzt.zzv().zzP(bundle, "_dbg", 1L);
                            zzr.zzt.zzv().zzP(bundle, "_r", 1L);
                        }
                        zzaq zzn = zzr.zzf.zzh().zzn(str, zzauVar.zza);
                        if (zzn == null) {
                            zzc = new zzaq(str, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                            j2 = 0;
                        } else {
                            j2 = zzn.zzf;
                            zzc = zzn.zzc(zzauVar.zzd);
                        }
                        zzr.zzf.zzh().zzE(zzc);
                        zzap zzapVar = new zzap(zzr.zzt, zzauVar.zzc, str, zzauVar.zza, zzauVar.zzd, j2, bundle);
                        com.google.android.gms.internal.measurement.zzfs zze = com.google.android.gms.internal.measurement.zzft.zze();
                        zze.zzm(zzapVar.zzd);
                        zze.zzi(zzapVar.zzb);
                        zze.zzl(zzapVar.zze);
                        zzar zzarVar = new zzar(zzapVar.zzf);
                        while (zzarVar.hasNext()) {
                            String next = zzarVar.next();
                            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze2.zzj(next);
                            Object zzf = zzapVar.zzf.zzf(next);
                            if (zzf != null) {
                                zzr.zzf.zzu().zzu(zze2, zzf);
                                zze.zze(zze2);
                            }
                        }
                        zzu.zzk(zze);
                        com.google.android.gms.internal.measurement.zzge zza2 = com.google.android.gms.internal.measurement.zzgg.zza();
                        com.google.android.gms.internal.measurement.zzfu zza3 = com.google.android.gms.internal.measurement.zzfv.zza();
                        zza3.zza(zzc.zzc);
                        zza3.zzb(zzauVar.zza);
                        zza2.zza(zza3);
                        zzu.zzaa(zza2);
                        zzu.zzf(zzr.zzf.zzf().zza(zzj.zzv(), Collections.emptyList(), zzu.zzau(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzu.zzai(zze.zzc());
                            zzu.zzQ(zze.zzc());
                        }
                        long zzn2 = zzj.zzn();
                        int i3 = (zzn2 > 0L ? 1 : (zzn2 == 0L ? 0 : -1));
                        if (i3 != 0) {
                            zzu.zzab(zzn2);
                        }
                        long zzp = zzj.zzp();
                        if (zzp != 0) {
                            zzu.zzac(zzp);
                        } else if (i3 != 0) {
                            zzu.zzac(zzn2);
                        }
                        String zzD = zzj.zzD();
                        zzqu.zzc();
                        if (zzr.zzt.zzf().zzs(str, zzeg.zzao) && zzD != null) {
                            zzu.zzah(zzD);
                        }
                        zzj.zzG();
                        zzu.zzI((int) zzj.zzo());
                        zzr.zzt.zzf().zzh();
                        zzu.zzam(79000L);
                        zzu.zzal(zzr.zzt.zzax().currentTimeMillis());
                        zzu.zzag(true);
                        if (zzr.zzt.zzf().zzs(null, zzeg.zzas)) {
                            zzr.zzf.zzC(zzu.zzaq(), zzu);
                        }
                        zza.zza(zzu);
                        zzj.zzad(zzu.zzd());
                        zzj.zzab(zzu.zzc());
                        zzr.zzf.zzh().zzD(zzj);
                        zzr.zzf.zzh().zzC();
                        zzr.zzf.zzh().zzx();
                        try {
                            bArr = zzr.zzf.zzu().zzz(((com.google.android.gms.internal.measurement.zzgb) zza.zzaD()).zzbx());
                        } catch (IOException e3) {
                            zzr.zzt.zzaA().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzet.zzn(str), e3);
                            bArr = null;
                        }
                    } catch (SecurityException e4) {
                        zzr.zzt.zzaA().zzc().zzb("app instance id encryption failed", e4.getMessage());
                    }
                } else {
                    zzr.zzt.zzaA().zzc().zzb("Log and bundle disabled. package_name", str);
                }
                bArr = new byte[0];
            } finally {
                zzr.zzf.zzh().zzx();
            }
        } else {
            zzr.zzt.zzaA().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str, zzauVar.zza);
        }
        return bArr;
    }
}
