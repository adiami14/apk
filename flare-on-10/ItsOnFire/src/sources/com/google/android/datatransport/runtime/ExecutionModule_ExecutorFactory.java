package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/ExecutionModule_ExecutorFactory.class */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/ExecutionModule_ExecutorFactory$InstanceHolder.class */
    public static final class InstanceHolder {
        private static final ExecutionModule_ExecutorFactory INSTANCE = new ExecutionModule_ExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static ExecutionModule_ExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNull(ExecutionModule.executor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.c
    public Executor get() {
        return executor();
    }
}
