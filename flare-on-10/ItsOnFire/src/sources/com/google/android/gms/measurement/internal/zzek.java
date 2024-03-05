package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzek.class */
public final class zzek extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzek(zzgd zzgdVar, long j2) {
        super(zzgdVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(9:70|71|72|73|(1:75)(2:96|(1:98))|76|77|78|(25:80|(1:82)(1:93)|83|84|85|86|87|5|(1:69)(1:9)|10|11|13|(1:15)|16|17|(2:19|20)(1:58)|21|(4:23|(1:25)(1:28)|26|27)|29|(4:31|(1:33)(1:37)|34|35)|38|(4:40|(1:42)(3:50|(3:53|(1:55)|51)|56)|43|(2:45|46)(2:48|49))|57|43|(0)(0)))|4|5|(1:7)|69|10|11|13|(0)|16|17|(0)(0)|21|(0)|29|(0)|38|(0)|57|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02f2, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02f4, code lost:
        r5.zzt.zzaA().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzet.zzn(r0), r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027c A[Catch: IllegalStateException -> 0x02f2, TryCatch #0 {IllegalStateException -> 0x02f2, blocks: (B:52:0x0246, B:57:0x026e, B:59:0x027c, B:64:0x02aa, B:62:0x02a3, B:67:0x02bb, B:69:0x02d6, B:72:0x02e6, B:70:0x02df), top: B:94:0x0246 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02bb A[Catch: IllegalStateException -> 0x02f2, TRY_ENTER, TryCatch #0 {IllegalStateException -> 0x02f2, blocks: (B:52:0x0246, B:57:0x026e, B:59:0x027c, B:64:0x02aa, B:62:0x02a3, B:67:0x02bb, B:69:0x02d6, B:72:0x02e6, B:70:0x02df), top: B:94:0x0246 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0391  */
    @Override // com.google.android.gms.measurement.internal.zzf
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzek.zzd():void");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    @WorkerThread
    public final int zzh() {
        zza();
        return this.zzj;
    }

    @WorkerThread
    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x040e  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzq zzj(java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzek.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    @WorkerThread
    public final String zzk() {
        zza();
        return this.zzl;
    }

    @WorkerThread
    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    @WorkerThread
    public final List zzn() {
        return this.zzh;
    }

    @WorkerThread
    public final void zzo() {
        String format;
        zzg();
        if (this.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzaA().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        }
        this.zzt.zzaA().zzc().zza(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.zzm = format;
        this.zzn = this.zzt.zzax().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null) {
            z = false;
            if (!str2.equals(str)) {
                z = true;
            }
        }
        this.zzo = str;
        return z;
    }
}
