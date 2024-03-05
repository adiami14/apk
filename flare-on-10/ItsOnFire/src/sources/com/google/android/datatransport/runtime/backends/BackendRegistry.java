package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/backends/BackendRegistry.class */
public interface BackendRegistry {
    @Nullable
    TransportBackend get(String str);
}
