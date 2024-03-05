package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
@WorkerThread
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzin.class */
public final class zzin implements Runnable {
    public final /* synthetic */ zzio zza;
    private final URL zzb;
    private final String zzc;
    private final zzgb zzd;

    public zzin(zzio zzioVar, String str, URL url, byte[] bArr, Map map, zzgb zzgbVar) {
        this.zza = zzioVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgbVar);
        this.zzb = url;
        this.zzd = zzgbVar;
        this.zzc = str;
    }

    private final void zzb(final int i2, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzim
            @Override // java.lang.Runnable
            public final void run() {
                zzin.this.zza(i2, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzin.run():void");
    }

    public final /* synthetic */ void zza(int i2, Exception exc, byte[] bArr, Map map) {
        zzgb zzgbVar = this.zzd;
        zzgbVar.zza.zzC(this.zzc, i2, exc, bArr, map);
    }
}
