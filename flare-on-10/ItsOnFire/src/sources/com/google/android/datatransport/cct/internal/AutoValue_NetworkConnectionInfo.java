package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/cct/internal/AutoValue_NetworkConnectionInfo.class */
final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {
    private final NetworkConnectionInfo.MobileSubtype mobileSubtype;
    private final NetworkConnectionInfo.NetworkType networkType;

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/cct/internal/AutoValue_NetworkConnectionInfo$Builder.class */
    public static final class Builder extends NetworkConnectionInfo.Builder {
        private NetworkConnectionInfo.MobileSubtype mobileSubtype;
        private NetworkConnectionInfo.NetworkType networkType;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo build() {
            return new AutoValue_NetworkConnectionInfo(this.networkType, this.mobileSubtype);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo.Builder setMobileSubtype(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.mobileSubtype = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo.Builder setNetworkType(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.networkType = networkType;
            return this;
        }
    }

    private AutoValue_NetworkConnectionInfo(@Nullable NetworkConnectionInfo.NetworkType networkType, @Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.networkType = networkType;
        this.mobileSubtype = mobileSubtype;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkConnectionInfo) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            NetworkConnectionInfo.NetworkType networkType = this.networkType;
            if (networkType != null ? networkType.equals(networkConnectionInfo.getNetworkType()) : networkConnectionInfo.getNetworkType() == null) {
                NetworkConnectionInfo.MobileSubtype mobileSubtype = this.mobileSubtype;
                if (mobileSubtype != null) {
                }
            }
            z = false;
            return z;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
        return this.mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public NetworkConnectionInfo.NetworkType getNetworkType() {
        return this.networkType;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.networkType;
        int i2 = 0;
        int hashCode = networkType == null ? 0 : networkType.hashCode();
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.mobileSubtype;
        if (mobileSubtype != null) {
            i2 = mobileSubtype.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.networkType + ", mobileSubtype=" + this.mobileSubtype + "}";
    }
}
