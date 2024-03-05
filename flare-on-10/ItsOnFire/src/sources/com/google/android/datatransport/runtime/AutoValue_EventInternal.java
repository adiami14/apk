package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Map;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/AutoValue_EventInternal.class */
final class AutoValue_EventInternal extends EventInternal {
    private final Map<String, String> autoMetadata;
    private final Integer code;
    private final EncodedPayload encodedPayload;
    private final long eventMillis;
    private final String transportName;
    private final long uptimeMillis;

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/AutoValue_EventInternal$Builder.class */
    public static final class Builder extends EventInternal.Builder {
        private Map<String, String> autoMetadata;
        private Integer code;
        private EncodedPayload encodedPayload;
        private Long eventMillis;
        private String transportName;
        private Long uptimeMillis;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal build() {
            String str = "";
            if (this.transportName == null) {
                str = " transportName";
            }
            String str2 = str;
            if (this.encodedPayload == null) {
                str2 = str + " encodedPayload";
            }
            String str3 = str2;
            if (this.eventMillis == null) {
                str3 = str2 + " eventMillis";
            }
            String str4 = str3;
            if (this.uptimeMillis == null) {
                str4 = str3 + " uptimeMillis";
            }
            String str5 = str4;
            if (this.autoMetadata == null) {
                str5 = str4 + " autoMetadata";
            }
            if (str5.isEmpty()) {
                return new AutoValue_EventInternal(this.transportName, this.code, this.encodedPayload, this.eventMillis.longValue(), this.uptimeMillis.longValue(), this.autoMetadata);
            }
            throw new IllegalStateException("Missing required properties:" + str5);
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public Map<String, String> getAutoMetadata() {
            Map<String, String> map = this.autoMetadata;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setAutoMetadata(Map<String, String> map) {
            if (map != null) {
                this.autoMetadata = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setCode(Integer num) {
            this.code = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
            if (encodedPayload != null) {
                this.encodedPayload = encodedPayload;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEventMillis(long j2) {
            this.eventMillis = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setTransportName(String str) {
            if (str != null) {
                this.transportName = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setUptimeMillis(long j2) {
            this.uptimeMillis = Long.valueOf(j2);
            return this;
        }
    }

    private AutoValue_EventInternal(String str, @Nullable Integer num, EncodedPayload encodedPayload, long j2, long j3, Map<String, String> map) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = encodedPayload;
        this.eventMillis = j2;
        this.uptimeMillis = j3;
        this.autoMetadata = map;
    }

    public boolean equals(Object obj) {
        Integer num;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventInternal) {
            EventInternal eventInternal = (EventInternal) obj;
            if (!this.transportName.equals(eventInternal.getTransportName()) || ((num = this.code) != null ? !num.equals(eventInternal.getCode()) : eventInternal.getCode() != null) || !this.encodedPayload.equals(eventInternal.getEncodedPayload()) || this.eventMillis != eventInternal.getEventMillis() || this.uptimeMillis != eventInternal.getUptimeMillis() || !this.autoMetadata.equals(eventInternal.getAutoMetadata())) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Map<String, String> getAutoMetadata() {
        return this.autoMetadata;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public EncodedPayload getEncodedPayload() {
        return this.encodedPayload;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.eventMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getTransportName() {
        return this.transportName;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        int hashCode = this.transportName.hashCode();
        Integer num = this.code;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.encodedPayload.hashCode();
        long j2 = this.eventMillis;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.uptimeMillis;
        return this.autoMetadata.hashCode() ^ ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventInternal{transportName=" + this.transportName + ", code=" + this.code + ", encodedPayload=" + this.encodedPayload + ", eventMillis=" + this.eventMillis + ", uptimeMillis=" + this.uptimeMillis + ", autoMetadata=" + this.autoMetadata + "}";
    }
}
