package com.google.android.datatransport.runtime.time;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/time/WallTimeClock.class */
public class WallTimeClock implements Clock {
    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return System.currentTimeMillis();
    }
}
