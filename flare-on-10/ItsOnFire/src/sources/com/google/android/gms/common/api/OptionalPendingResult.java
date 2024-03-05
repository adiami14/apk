package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/OptionalPendingResult.class */
public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    @NonNull
    public abstract R get();

    public abstract boolean isDone();
}
