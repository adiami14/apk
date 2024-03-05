package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/tasks/Continuation.class */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(@NonNull Task<TResult> task) throws Exception;
}
