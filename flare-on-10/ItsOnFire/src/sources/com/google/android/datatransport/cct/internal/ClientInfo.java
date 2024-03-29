package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/cct/internal/ClientInfo.class */
public abstract class ClientInfo {

    @AutoValue.Builder
    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/cct/internal/ClientInfo$Builder.class */
    public static abstract class Builder {
        @NonNull
        public abstract ClientInfo build();

        @NonNull
        public abstract Builder setAndroidClientInfo(@Nullable AndroidClientInfo androidClientInfo);

        @NonNull
        public abstract Builder setClientType(@Nullable ClientType clientType);
    }

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/cct/internal/ClientInfo$ClientType.class */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        ClientType(int i2) {
            this.value = i2;
        }
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ClientInfo.Builder();
    }

    @Nullable
    public abstract AndroidClientInfo getAndroidClientInfo();

    @Nullable
    public abstract ClientType getClientType();
}
