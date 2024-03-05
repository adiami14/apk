package com.google.firebase.heartbeatinfo;
/* loaded from: ItsOnFire.jar:com/google/firebase/heartbeatinfo/AutoValue_SdkHeartBeatResult.class */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String str, long j2) {
        if (str == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.sdkName = str;
        this.millis = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            if (!this.sdkName.equals(sdkHeartBeatResult.getSdkName()) || this.millis != sdkHeartBeatResult.getMillis()) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.millis;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        int hashCode = this.sdkName.hashCode();
        long j2 = this.millis;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.sdkName + ", millis=" + this.millis + "}";
    }
}
