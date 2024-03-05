package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/scheduling/persistence/EventStoreModule_StoreConfigFactory.class */
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/scheduling/persistence/EventStoreModule_StoreConfigFactory$InstanceHolder.class */
    public static final class InstanceHolder {
        private static final EventStoreModule_StoreConfigFactory INSTANCE = new EventStoreModule_StoreConfigFactory();

        private InstanceHolder() {
        }
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventStoreConfig storeConfig() {
        return (EventStoreConfig) Preconditions.checkNotNull(EventStoreModule.storeConfig(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.c
    public EventStoreConfig get() {
        return storeConfig();
    }
}
