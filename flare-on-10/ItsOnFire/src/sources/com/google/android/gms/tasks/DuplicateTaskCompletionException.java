package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/tasks/DuplicateTaskCompletionException.class */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @Nullable Throwable th) {
        super(str, th);
    }

    @NonNull
    public static IllegalStateException of(@NonNull Task<?> task) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            return new DuplicateTaskCompletionException("Complete with: ".concat(exception != null ? "failure" : task.isSuccessful() ? "result ".concat(String.valueOf(task.getResult())) : task.isCanceled() ? "cancellation" : "unknown issue"), exception);
        }
        return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
}
