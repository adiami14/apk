package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/RootTelemetryConfigManager.class */
public final class RootTelemetryConfigManager {
    @Nullable
    private static RootTelemetryConfigManager zza;
    private static final RootTelemetryConfiguration zzb = new RootTelemetryConfiguration(0, false, false, 0, 0);
    @Nullable
    private RootTelemetryConfiguration zzc;

    private RootTelemetryConfigManager() {
    }

    @NonNull
    @KeepForSdk
    public static RootTelemetryConfigManager getInstance() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            try {
                if (zza == null) {
                    zza = new RootTelemetryConfigManager();
                }
                rootTelemetryConfigManager = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rootTelemetryConfigManager;
    }

    @Nullable
    @KeepForSdk
    public RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    @VisibleForTesting
    public final void zza(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration) {
        synchronized (this) {
            if (rootTelemetryConfiguration == null) {
                this.zzc = zzb;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.zzc;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
                this.zzc = rootTelemetryConfiguration;
            }
        }
    }
}
