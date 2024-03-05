package com.google.android.gms.internal.common;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzw.class */
public abstract class zzw extends zzj {
    public final CharSequence zzb;
    public final zzo zzc;
    public final boolean zzd;
    public int zze = 0;
    public int zzf;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar;
        boolean z;
        zzoVar = zzxVar.zza;
        this.zzc = zzoVar;
        z = zzxVar.zzb;
        this.zzd = z;
        this.zzf = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r0 >= r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        r4.zzb.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r0 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        r4.zzb.charAt(r6 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (r4.zzd == false) goto L38;
     */
    @Override // com.google.android.gms.internal.common.zzj
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.common.zzw.zza():java.lang.Object");
    }

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);
}
