package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/cct/internal/AutoValue_ClientInfo.class */
final class AutoValue_ClientInfo extends ClientInfo {
    private final AndroidClientInfo androidClientInfo;
    private final ClientInfo.ClientType clientType;

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/cct/internal/AutoValue_ClientInfo$Builder.class */
    public static final class Builder extends ClientInfo.Builder {
        private AndroidClientInfo androidClientInfo;
        private ClientInfo.ClientType clientType;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo build() {
            return new AutoValue_ClientInfo(this.clientType, this.androidClientInfo);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setAndroidClientInfo(@Nullable AndroidClientInfo androidClientInfo) {
            this.androidClientInfo = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setClientType(@Nullable ClientInfo.ClientType clientType) {
            this.clientType = clientType;
            return this;
        }
    }

    private AutoValue_ClientInfo(@Nullable ClientInfo.ClientType clientType, @Nullable AndroidClientInfo androidClientInfo) {
        this.clientType = clientType;
        this.androidClientInfo = androidClientInfo;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientInfo) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ClientInfo.ClientType clientType = this.clientType;
            if (clientType != null ? clientType.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
                AndroidClientInfo androidClientInfo = this.androidClientInfo;
                if (androidClientInfo != null) {
                }
            }
            z = false;
            return z;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public AndroidClientInfo getAndroidClientInfo() {
        return this.androidClientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public ClientInfo.ClientType getClientType() {
        return this.clientType;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.clientType;
        int i2 = 0;
        int hashCode = clientType == null ? 0 : clientType.hashCode();
        AndroidClientInfo androidClientInfo = this.androidClientInfo;
        if (androidClientInfo != null) {
            i2 = androidClientInfo.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.clientType + ", androidClientInfo=" + this.androidClientInfo + "}";
    }
}
