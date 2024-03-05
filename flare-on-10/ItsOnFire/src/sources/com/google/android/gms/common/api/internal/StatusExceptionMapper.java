package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/internal/StatusExceptionMapper.class */
public interface StatusExceptionMapper {
    @NonNull
    @KeepForSdk
    Exception getException(@NonNull Status status);
}
