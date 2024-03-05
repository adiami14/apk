package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@AutoValue
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/EventInternal.class */
public abstract class EventInternal {

    @AutoValue.Builder
    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/EventInternal$Builder.class */
    public static abstract class Builder {
        public final Builder addMetadata(String str, int i2) {
            getAutoMetadata().put(str, String.valueOf(i2));
            return this;
        }

        public final Builder addMetadata(String str, long j2) {
            getAutoMetadata().put(str, String.valueOf(j2));
            return this;
        }

        public final Builder addMetadata(String str, String str2) {
            getAutoMetadata().put(str, str2);
            return this;
        }

        public abstract EventInternal build();

        public abstract Map<String, String> getAutoMetadata();

        public abstract Builder setAutoMetadata(Map<String, String> map);

        public abstract Builder setCode(Integer num);

        public abstract Builder setEncodedPayload(EncodedPayload encodedPayload);

        public abstract Builder setEventMillis(long j2);

        public abstract Builder setTransportName(String str);

        public abstract Builder setUptimeMillis(long j2);
    }

    public static Builder builder() {
        return new AutoValue_EventInternal.Builder().setAutoMetadata(new HashMap());
    }

    public final String get(String str) {
        String str2 = getAutoMetadata().get(str);
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        return str3;
    }

    public abstract Map<String, String> getAutoMetadata();

    @Nullable
    public abstract Integer getCode();

    public abstract EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    public final int getInteger(String str) {
        String str2 = getAutoMetadata().get(str);
        return str2 == null ? 0 : Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = getAutoMetadata().get(str);
        return str2 == null ? 0L : Long.valueOf(str2).longValue();
    }

    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(getAutoMetadata());
    }

    public final String getOrDefault(String str, String str2) {
        String str3 = getAutoMetadata().get(str);
        if (str3 == null) {
            str3 = str2;
        }
        return str3;
    }

    @Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().getBytes();
    }

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public Builder toBuilder() {
        return new AutoValue_EventInternal.Builder().setTransportName(getTransportName()).setCode(getCode()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).setAutoMetadata(new HashMap(getAutoMetadata()));
    }
}
