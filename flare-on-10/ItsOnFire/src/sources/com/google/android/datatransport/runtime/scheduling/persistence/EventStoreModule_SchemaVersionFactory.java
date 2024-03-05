package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/scheduling/persistence/EventStoreModule_SchemaVersionFactory.class */
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/scheduling/persistence/EventStoreModule_SchemaVersionFactory$InstanceHolder.class */
    public static final class InstanceHolder {
        private static final EventStoreModule_SchemaVersionFactory INSTANCE = new EventStoreModule_SchemaVersionFactory();

        private InstanceHolder() {
        }
    }

    public static EventStoreModule_SchemaVersionFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static int schemaVersion() {
        return EventStoreModule.schemaVersion();
    }

    @Override // h.c
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}
