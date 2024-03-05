package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/backends/AutoValue_CreationContext.class */
final class AutoValue_CreationContext extends CreationContext {
    private final Context applicationContext;
    private final String backendName;
    private final Clock monotonicClock;
    private final Clock wallClock;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.applicationContext = context;
        if (clock == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.wallClock = clock;
        if (clock2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.monotonicClock = clock2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.backendName = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreationContext) {
            CreationContext creationContext = (CreationContext) obj;
            if (!this.applicationContext.equals(creationContext.getApplicationContext()) || !this.wallClock.equals(creationContext.getWallClock()) || !this.monotonicClock.equals(creationContext.getMonotonicClock()) || !this.backendName.equals(creationContext.getBackendName())) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    @NonNull
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.monotonicClock;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.wallClock;
    }

    public int hashCode() {
        int hashCode = this.applicationContext.hashCode();
        int hashCode2 = this.wallClock.hashCode();
        return this.backendName.hashCode() ^ ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.monotonicClock.hashCode()) * 1000003);
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.applicationContext + ", wallClock=" + this.wallClock + ", monotonicClock=" + this.monotonicClock + ", backendName=" + this.backendName + "}";
    }
}
