package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/backends/AutoValue_BackendResponse.class */
final class AutoValue_BackendResponse extends BackendResponse {
    private final long nextRequestWaitMillis;
    private final BackendResponse.Status status;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j2) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.status = status;
        this.nextRequestWaitMillis = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            if (!this.status.equals(backendResponse.getStatus()) || this.nextRequestWaitMillis != backendResponse.getNextRequestWaitMillis()) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode();
        long j2 = this.nextRequestWaitMillis;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public String toString() {
        return "BackendResponse{status=" + this.status + ", nextRequestWaitMillis=" + this.nextRequestWaitMillis + "}";
    }
}
