package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/tasks/CancellationToken.class */
public abstract class CancellationToken {
    public abstract boolean isCancellationRequested();

    @NonNull
    public abstract CancellationToken onCanceledRequested(@NonNull OnTokenCanceledListener onTokenCanceledListener);
}
