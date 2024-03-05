package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;
@WorkerThread
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/synchronization/SynchronizationGuard.class */
public interface SynchronizationGuard {

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/synchronization/SynchronizationGuard$CriticalSection.class */
    public interface CriticalSection<T> {
        T execute();
    }

    <T> T runCriticalSection(CriticalSection<T> criticalSection);
}
