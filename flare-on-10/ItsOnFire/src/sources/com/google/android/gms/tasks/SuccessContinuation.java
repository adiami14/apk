package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/tasks/SuccessContinuation.class */
public interface SuccessContinuation<TResult, TContinuationResult> {
    @NonNull
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
