package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: ItsOnFire.jar:com/google/android/gms/tasks/zzh.class */
final class zzh implements zzq {
    private final Executor zza;
    private final Object zzb = new Object();
    @GuardedBy("mLock")
    @Nullable
    private OnCanceledListener zzc;

    public zzh(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.zza = executor;
        this.zzc = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        if (task.isCanceled()) {
            synchronized (this.zzb) {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new zzg(this));
            }
        }
    }
}
