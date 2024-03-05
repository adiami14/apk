package com.google.android.datatransport.runtime.retries;

import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/retries/RetryStrategy.class */
public interface RetryStrategy<TInput, TResult> {
    @Nullable
    TInput shouldRetry(TInput tinput, TResult tresult);
}
