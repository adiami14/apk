package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/firebase/messaging/TopicsStore.class */
public final class TopicsStore {
    private static final String DIVIDER_QUEUE_OPERATIONS = ",";
    @VisibleForTesting
    public static final String KEY_TOPIC_OPERATIONS_QUEUE = "topic_operation_queue";
    @VisibleForTesting
    public static final String PREFERENCES = "com.google.android.gms.appid";
    @GuardedBy("TopicsStore.class")
    private static WeakReference<TopicsStore> topicsStoreWeakReference;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;
    private SharedPreferencesQueue topicOperationsQueue;

    private TopicsStore(SharedPreferences sharedPreferences, Executor executor) {
        this.syncExecutor = executor;
        this.sharedPreferences = sharedPreferences;
    }

    @VisibleForTesting
    public static void clearCaches() {
        synchronized (TopicsStore.class) {
            try {
                WeakReference<TopicsStore> weakReference = topicsStoreWeakReference;
                if (weakReference != null) {
                    weakReference.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public static TopicsStore getInstance(Context context, Executor executor) {
        TopicsStore topicsStore;
        synchronized (TopicsStore.class) {
            TopicsStore topicsStore2 = null;
            try {
                WeakReference<TopicsStore> weakReference = topicsStoreWeakReference;
                if (weakReference != null) {
                    topicsStore2 = weakReference.get();
                }
                topicsStore = topicsStore2;
                if (topicsStore2 == null) {
                    topicsStore = new TopicsStore(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    topicsStore.initStore();
                    topicsStoreWeakReference = new WeakReference<>(topicsStore);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return topicsStore;
    }

    @WorkerThread
    private void initStore() {
        synchronized (this) {
            this.topicOperationsQueue = SharedPreferencesQueue.createInstance(this.sharedPreferences, KEY_TOPIC_OPERATIONS_QUEUE, DIVIDER_QUEUE_OPERATIONS, this.syncExecutor);
        }
    }

    public boolean addTopicOperation(TopicOperation topicOperation) {
        boolean add;
        synchronized (this) {
            add = this.topicOperationsQueue.add(topicOperation.serialize());
        }
        return add;
    }

    public void clearTopicOperations() {
        synchronized (this) {
            this.topicOperationsQueue.clear();
        }
    }

    @Nullable
    public TopicOperation getNextTopicOperation() {
        TopicOperation from;
        synchronized (this) {
            from = TopicOperation.from(this.topicOperationsQueue.peek());
        }
        return from;
    }

    @NonNull
    public List<TopicOperation> getOperations() {
        ArrayList arrayList;
        synchronized (this) {
            List<String> list = this.topicOperationsQueue.toList();
            arrayList = new ArrayList(list.size());
            for (String str : list) {
                arrayList.add(TopicOperation.from(str));
            }
        }
        return arrayList;
    }

    @Nullable
    public TopicOperation pollTopicOperation() {
        TopicOperation from;
        synchronized (this) {
            try {
                from = TopicOperation.from(this.topicOperationsQueue.remove());
            } catch (NoSuchElementException e2) {
                Log.e("FirebaseMessaging", "Polling operation queue failed");
                return null;
            }
        }
        return from;
    }

    public boolean removeTopicOperation(TopicOperation topicOperation) {
        boolean remove;
        synchronized (this) {
            remove = this.topicOperationsQueue.remove(topicOperation.serialize());
        }
        return remove;
    }
}
