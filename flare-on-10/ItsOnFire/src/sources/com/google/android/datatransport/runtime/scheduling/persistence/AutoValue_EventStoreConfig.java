package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/scheduling/persistence/AutoValue_EventStoreConfig.class */
final class AutoValue_EventStoreConfig extends EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/scheduling/persistence/AutoValue_EventStoreConfig$Builder.class */
    public static final class Builder extends EventStoreConfig.Builder {
        private Integer criticalSectionEnterTimeoutMs;
        private Long eventCleanUpAge;
        private Integer loadBatchSize;
        private Integer maxBlobByteSizePerRow;
        private Long maxStorageSizeInBytes;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig build() {
            String str = "";
            if (this.maxStorageSizeInBytes == null) {
                str = " maxStorageSizeInBytes";
            }
            String str2 = str;
            if (this.loadBatchSize == null) {
                str2 = str + " loadBatchSize";
            }
            String str3 = str2;
            if (this.criticalSectionEnterTimeoutMs == null) {
                str3 = str2 + " criticalSectionEnterTimeoutMs";
            }
            String str4 = str3;
            if (this.eventCleanUpAge == null) {
                str4 = str3 + " eventCleanUpAge";
            }
            String str5 = str4;
            if (this.maxBlobByteSizePerRow == null) {
                str5 = str4 + " maxBlobByteSizePerRow";
            }
            if (str5.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str5);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int i2) {
            this.criticalSectionEnterTimeoutMs = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setEventCleanUpAge(long j2) {
            this.eventCleanUpAge = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setLoadBatchSize(int i2) {
            this.loadBatchSize = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxBlobByteSizePerRow(int i2) {
            this.maxBlobByteSizePerRow = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxStorageSizeInBytes(long j2) {
            this.maxStorageSizeInBytes = Long.valueOf(j2);
            return this;
        }
    }

    private AutoValue_EventStoreConfig(long j2, int i2, int i3, long j3, int i4) {
        this.maxStorageSizeInBytes = j2;
        this.loadBatchSize = i2;
        this.criticalSectionEnterTimeoutMs = i3;
        this.eventCleanUpAge = j3;
        this.maxBlobByteSizePerRow = i4;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventStoreConfig) {
            EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
            if (this.maxStorageSizeInBytes != eventStoreConfig.getMaxStorageSizeInBytes() || this.loadBatchSize != eventStoreConfig.getLoadBatchSize() || this.criticalSectionEnterTimeoutMs != eventStoreConfig.getCriticalSectionEnterTimeoutMs() || this.eventCleanUpAge != eventStoreConfig.getEventCleanUpAge() || this.maxBlobByteSizePerRow != eventStoreConfig.getMaxBlobByteSizePerRow()) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    public int hashCode() {
        long j2 = this.maxStorageSizeInBytes;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int i3 = this.loadBatchSize;
        int i4 = this.criticalSectionEnterTimeoutMs;
        long j3 = this.eventCleanUpAge;
        return this.maxBlobByteSizePerRow ^ ((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.maxStorageSizeInBytes + ", loadBatchSize=" + this.loadBatchSize + ", criticalSectionEnterTimeoutMs=" + this.criticalSectionEnterTimeoutMs + ", eventCleanUpAge=" + this.eventCleanUpAge + ", maxBlobByteSizePerRow=" + this.maxBlobByteSizePerRow + "}";
    }
}
