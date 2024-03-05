package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/zal.class */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }

    public final int zaa(Context context, int i2) {
        return this.zaa.get(i2, -1);
    }

    public final int zab(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        if (client.requiresGooglePlayServices()) {
            int minApkVersion = client.getMinApkVersion();
            int zaa = zaa(context, minApkVersion);
            if (zaa == -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.zaa.size()) {
                        zaa = -1;
                        break;
                    }
                    int keyAt = this.zaa.keyAt(i2);
                    if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                        zaa = 0;
                        break;
                    }
                    i2++;
                }
                if (zaa == -1) {
                    zaa = this.zab.isGooglePlayServicesAvailable(context, minApkVersion);
                }
                this.zaa.put(minApkVersion, zaa);
            }
            return zaa;
        }
        return 0;
    }

    public final void zac() {
        this.zaa.clear();
    }
}
