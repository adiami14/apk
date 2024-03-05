package com.google.firebase.concurrent;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/firebase/concurrent/SequentialExecutor.class */
public final class SequentialExecutor implements Executor {
    private static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    @GuardedBy("queue")
    private final Deque<Runnable> queue = new ArrayDeque();
    @GuardedBy("queue")
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;
    @GuardedBy("queue")
    private long workerRunCount = 0;
    private final QueueWorker worker = new QueueWorker();

    /* loaded from: ItsOnFire.jar:com/google/firebase/concurrent/SequentialExecutor$QueueWorker.class */
    public final class QueueWorker implements Runnable {
        @CheckForNull
        public Runnable task;

        private QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
            if (r7 == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
            r0 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
            r7 = r7 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
            r5.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
            r12 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
            com.google.firebase.concurrent.SequentialExecutor.log.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r5.task, (java.lang.Throwable) r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void workOnQueue() {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e2) {
                synchronized (SequentialExecutor.this.queue) {
                    SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e2;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.task;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.workerRunningState + "}";
        }
    }

    /* loaded from: ItsOnFire.jar:com/google/firebase/concurrent/SequentialExecutor$WorkerRunningState.class */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j2 = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j2;
        return j2;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            WorkerRunningState workerRunningState = this.workerRunningState;
            if (workerRunningState != WorkerRunningState.RUNNING) {
                WorkerRunningState workerRunningState2 = WorkerRunningState.QUEUED;
                if (workerRunningState != workerRunningState2) {
                    long j2 = this.workerRunCount;
                    Runnable runnable2 = new Runnable() { // from class: com.google.firebase.concurrent.SequentialExecutor.1
                        @Override // java.lang.Runnable
                        public void run() {
                            runnable.run();
                        }

                        public String toString() {
                            return runnable.toString();
                        }
                    };
                    this.queue.add(runnable2);
                    WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                    this.workerRunningState = workerRunningState3;
                    boolean z = true;
                    try {
                        this.executor.execute(this.worker);
                        if (this.workerRunningState == workerRunningState3) {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                        synchronized (this.queue) {
                            if (this.workerRunCount == j2 && this.workerRunningState == workerRunningState3) {
                                this.workerRunningState = workerRunningState2;
                            }
                        }
                        return;
                    } catch (Error | RuntimeException e2) {
                        synchronized (this.queue) {
                            WorkerRunningState workerRunningState4 = this.workerRunningState;
                            boolean z2 = (workerRunningState4 == WorkerRunningState.IDLE || workerRunningState4 == WorkerRunningState.QUEUING) && this.queue.removeLastOccurrence(runnable2);
                            if (!(e2 instanceof RejectedExecutionException) || z2) {
                                throw e2;
                            }
                            return;
                        }
                    }
                }
            }
            this.queue.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.executor + "}";
    }
}
