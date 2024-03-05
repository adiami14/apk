package com.google.android.datatransport.cct.internal;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/cct/internal/AutoValue_LogResponse.class */
final class AutoValue_LogResponse extends LogResponse {
    private final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long j2) {
        this.nextRequestWaitMillis = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogResponse) {
            if (this.nextRequestWaitMillis != ((LogResponse) obj).getNextRequestWaitMillis()) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public int hashCode() {
        long j2 = this.nextRequestWaitMillis;
        return ((int) (j2 ^ (j2 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.nextRequestWaitMillis + "}";
    }
}
