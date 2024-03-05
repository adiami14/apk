package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/time/TimeModule_UptimeClockFactory.class */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/time/TimeModule_UptimeClockFactory$InstanceHolder.class */
    public static final class InstanceHolder {
        private static final TimeModule_UptimeClockFactory INSTANCE = new TimeModule_UptimeClockFactory();

        private InstanceHolder() {
        }
    }

    public static TimeModule_UptimeClockFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNull(TimeModule.uptimeClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.c
    public Clock get() {
        return uptimeClock();
    }
}
