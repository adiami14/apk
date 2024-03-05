package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* loaded from: ItsOnFire.jar:com/google/android/gms/tasks/TaskExecutors.class */
public final class TaskExecutors {
    @NonNull
    public static final Executor MAIN_THREAD = new zzu();
    public static final Executor zza = new zzt();

    private TaskExecutors() {
    }
}
