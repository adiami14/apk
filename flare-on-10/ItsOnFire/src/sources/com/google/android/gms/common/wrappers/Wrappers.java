package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/wrappers/Wrappers.class */
public class Wrappers {
    private static Wrappers zza = new Wrappers();
    @Nullable
    private PackageManagerWrapper zzb = null;

    @NonNull
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@NonNull Context context) {
        return zza.zza(context);
    }

    @NonNull
    @VisibleForTesting
    public final PackageManagerWrapper zza(@NonNull Context context) {
        PackageManagerWrapper packageManagerWrapper;
        synchronized (this) {
            if (this.zzb == null) {
                Context context2 = context;
                if (context.getApplicationContext() != null) {
                    context2 = context.getApplicationContext();
                }
                this.zzb = new PackageManagerWrapper(context2);
            }
            packageManagerWrapper = this.zzb;
        }
        return packageManagerWrapper;
    }
}
