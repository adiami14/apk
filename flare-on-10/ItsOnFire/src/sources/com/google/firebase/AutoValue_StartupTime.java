package com.google.firebase;
/* loaded from: ItsOnFire.jar:com/google/firebase/AutoValue_StartupTime.class */
final class AutoValue_StartupTime extends StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    public AutoValue_StartupTime(long j2, long j3, long j4) {
        this.epochMillis = j2;
        this.elapsedRealtime = j3;
        this.uptimeMillis = j4;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartupTime) {
            StartupTime startupTime = (StartupTime) obj;
            if (this.epochMillis != startupTime.getEpochMillis() || this.elapsedRealtime != startupTime.getElapsedRealtime() || this.uptimeMillis != startupTime.getUptimeMillis()) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.epochMillis;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        long j2 = this.epochMillis;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.elapsedRealtime;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        long j4 = this.uptimeMillis;
        return ((int) ((j4 >>> 32) ^ j4)) ^ ((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.epochMillis + ", elapsedRealtime=" + this.elapsedRealtime + ", uptimeMillis=" + this.uptimeMillis + "}";
    }
}
