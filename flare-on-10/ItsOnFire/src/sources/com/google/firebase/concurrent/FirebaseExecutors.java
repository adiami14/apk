package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
/* loaded from: ItsOnFire.jar:com/google/firebase/concurrent/FirebaseExecutors.class */
public class FirebaseExecutors {

    /* loaded from: ItsOnFire.jar:com/google/firebase/concurrent/FirebaseExecutors$DirectExecutor.class */
    public enum DirectExecutor implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private FirebaseExecutors() {
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
