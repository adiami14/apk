package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/tasks/zzv.class */
final class zzv extends LifecycleCallback {
    private final List zza;

    private zzv(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zza = new ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zzv zzvVar = (zzv) fragment.getCallbackOrNull("TaskOnStopCallback", zzv.class);
        zzv zzvVar2 = zzvVar;
        if (zzvVar == null) {
            zzvVar2 = new zzv(fragment);
        }
        return zzvVar2;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    public final void onStop() {
        synchronized (this.zza) {
            for (WeakReference weakReference : this.zza) {
                zzq zzqVar = (zzq) weakReference.get();
                if (zzqVar != null) {
                    zzqVar.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}
