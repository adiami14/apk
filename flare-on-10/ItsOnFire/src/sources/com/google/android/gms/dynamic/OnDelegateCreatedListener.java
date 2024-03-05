package com.google.android.gms.dynamic;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.LifecycleDelegate;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/dynamic/OnDelegateCreatedListener.class */
public interface OnDelegateCreatedListener<T extends LifecycleDelegate> {
    @KeepForSdk
    void onDelegateCreated(@NonNull T t2);
}
