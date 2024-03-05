package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
@WorkerThread
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzey.class */
public final class zzey implements Runnable {
    public final /* synthetic */ zzez zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzev zzd;
    private final String zze;
    private final Map zzf;

    public zzey(zzez zzezVar, String str, URL url, byte[] bArr, Map map, zzev zzevVar) {
        this.zza = zzezVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzevVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzevVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzey.run():void");
    }
}
