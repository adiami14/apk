package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/internal/RemoteCall.class */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@NonNull T t2, @NonNull U u2) throws RemoteException;
}