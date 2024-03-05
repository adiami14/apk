package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/firebase/messaging/TopicsSubscriber.class */
public class TopicsSubscriber {
    public static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static final long MIN_DELAY_SEC = 30;
    private static final long RPC_TIMEOUT_SEC = 30;
    private final Context context;
    private final FirebaseMessaging firebaseMessaging;
    private final Metadata metadata;
    private final GmsRpc rpc;
    private final TopicsStore store;
    private final ScheduledExecutorService syncExecutor;
    @GuardedBy("pendingOperations")
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> pendingOperations = new ArrayMap();
    @GuardedBy("this")
    private boolean syncScheduledOrRunning = false;

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.firebaseMessaging = firebaseMessaging;
        this.metadata = metadata;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context;
        this.syncExecutor = scheduledExecutorService;
    }

    private void addToPendingOperations(TopicOperation topicOperation, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.pendingOperations) {
            String serialize = topicOperation.serialize();
            if (this.pendingOperations.containsKey(serialize)) {
                arrayDeque = this.pendingOperations.get(serialize);
            } else {
                arrayDeque = new ArrayDeque<>();
                this.pendingOperations.put(serialize, arrayDeque);
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    @WorkerThread
    private static <T> void awaitTask(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e3);
            }
            throw ((RuntimeException) cause);
        }
    }

    @WorkerThread
    private void blockingSubscribeToTopic(String str) throws IOException {
        awaitTask(this.rpc.subscribeToTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    @WorkerThread
    private void blockingUnsubscribeFromTopic(String str) throws IOException {
        awaitTask(this.rpc.unsubscribeFromTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    @VisibleForTesting
    public static Task<TopicsSubscriber> createInstance(final FirebaseMessaging firebaseMessaging, final Metadata metadata, final GmsRpc gmsRpc, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TopicsSubscriber lambda$createInstance$0;
                lambda$createInstance$0 = TopicsSubscriber.lambda$createInstance$0(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
                return lambda$createInstance$0;
            }
        });
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TopicsSubscriber lambda$createInstance$0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) throws Exception {
        return new TopicsSubscriber(firebaseMessaging, metadata, TopicsStore.getInstance(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    private void markCompletePendingOperation(TopicOperation topicOperation) {
        synchronized (this.pendingOperations) {
            String serialize = topicOperation.serialize();
            if (this.pendingOperations.containsKey(serialize)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.pendingOperations.get(serialize);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.pendingOperations.remove(serialize);
                }
            }
        }
    }

    private void startSync() {
        if (isSyncScheduledOrRunning()) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    @VisibleForTesting
    public TopicsStore getStore() {
        return this.store;
    }

    public boolean hasPendingOperation() {
        return this.store.getNextTopicOperation() != null;
    }

    public boolean isSyncScheduledOrRunning() {
        boolean z;
        synchronized (this) {
            z = this.syncScheduledOrRunning;
        }
        return z;
    }

    @WorkerThread
    public boolean performTopicOperation(TopicOperation topicOperation) throws IOException {
        String str;
        String str2;
        try {
            String operation = topicOperation.getOperation();
            boolean z = true;
            int hashCode = operation.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && operation.equals("U")) {
                    z = true;
                }
            } else if (operation.equals("S")) {
                z = false;
            }
            if (!z) {
                blockingSubscribeToTopic(topicOperation.getTopic());
                if (!isDebugLogEnabled()) {
                    return true;
                }
                str2 = "Subscribe to topic: " + topicOperation.getTopic() + " succeeded.";
            } else if (z) {
                blockingUnsubscribeFromTopic(topicOperation.getTopic());
                if (!isDebugLogEnabled()) {
                    return true;
                }
                str2 = "Unsubscribe from topic: " + topicOperation.getTopic() + " succeeded.";
            } else if (!isDebugLogEnabled()) {
                return true;
            } else {
                str2 = "Unknown topic operation" + topicOperation + ".";
            }
            Log.d("FirebaseMessaging", str2);
            return true;
        } catch (IOException e2) {
            if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                str = "Topic operation failed: " + e2.getMessage() + ". Will retry Topic operation.";
            } else if (e2.getMessage() != null) {
                throw e2;
            } else {
                str = "Topic operation failed without exception message. Will retry Topic operation.";
            }
            Log.e("FirebaseMessaging", str);
            return false;
        }
    }

    public void scheduleSyncTaskWithDelaySeconds(Runnable runnable, long j2) {
        this.syncExecutor.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    @VisibleForTesting
    public Task<Void> scheduleTopicOperation(TopicOperation topicOperation) {
        this.store.addTopicOperation(topicOperation);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        addToPendingOperations(topicOperation, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public void setSyncScheduledOrRunning(boolean z) {
        synchronized (this) {
            this.syncScheduledOrRunning = z;
        }
    }

    public void startTopicsSyncIfNecessary() {
        if (hasPendingOperation()) {
            startSync();
        }
    }

    public Task<Void> subscribeToTopic(String str) {
        Task<Void> scheduleTopicOperation = scheduleTopicOperation(TopicOperation.subscribe(str));
        startTopicsSyncIfNecessary();
        return scheduleTopicOperation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (isDebugLogEnabled() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean syncTopics() throws java.io.IOException {
        /*
            r3 = this;
        L0:
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            com.google.firebase.messaging.TopicsStore r0 = r0.store     // Catch: java.lang.Throwable -> L3e
            com.google.firebase.messaging.TopicOperation r0 = r0.getNextTopicOperation()     // Catch: java.lang.Throwable -> L3e
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L21
            boolean r0 = isDebugLogEnabled()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L1d
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            int r0 = android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L3e
        L1d:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = 1
            return r0
        L21:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
            r1 = r4
            boolean r0 = r0.performTopicOperation(r1)
            if (r0 != 0) goto L2d
            r0 = 0
            return r0
        L2d:
            r0 = r3
            com.google.firebase.messaging.TopicsStore r0 = r0.store
            r1 = r4
            boolean r0 = r0.removeTopicOperation(r1)
            r0 = r3
            r1 = r4
            r0.markCompletePendingOperation(r1)
            goto L0
        L3e:
            r4 = move-exception
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.syncTopics():boolean");
    }

    public void syncWithDelaySecondsInternal(long j2) {
        scheduleSyncTaskWithDelaySeconds(new TopicsSyncTask(this, this.context, this.metadata, Math.min(Math.max(30L, 2 * j2), MAX_DELAY_SEC)), j2);
        setSyncScheduledOrRunning(true);
    }

    public Task<Void> unsubscribeFromTopic(String str) {
        Task<Void> scheduleTopicOperation = scheduleTopicOperation(TopicOperation.unsubscribe(str));
        startTopicsSyncIfNecessary();
        return scheduleTopicOperation;
    }
}
