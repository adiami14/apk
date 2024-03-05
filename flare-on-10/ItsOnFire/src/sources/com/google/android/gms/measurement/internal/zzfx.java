package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzfx.class */
public final class zzfx implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzga zza;
    private final String zzb;

    public zzfx(zzga zzgaVar, String str) {
        this.zza = zzgaVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (this) {
            this.zza.zzt.zzaA().zzd().zzb(this.zzb, th);
        }
    }
}
