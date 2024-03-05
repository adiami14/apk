package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/internal/ConnectionCallbacks.class */
public interface ConnectionCallbacks {
    @ShowFirstParty
    @KeepForSdk
    void onConnected(@Nullable Bundle bundle);

    @ShowFirstParty
    @KeepForSdk
    void onConnectionSuspended(int i2);
}
