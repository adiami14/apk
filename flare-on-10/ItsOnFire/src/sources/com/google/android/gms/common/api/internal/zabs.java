package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/internal/zabs.class */
public final class zabs {
    private final ApiKey<?> zaa;
    private final Feature zab;

    public /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof zabs)) {
            return false;
        }
        zabs zabsVar = (zabs) obj;
        return Objects.equal(this.zaa, zabsVar.zaa) && Objects.equal(this.zab, zabsVar.zab);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa, this.zab);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
    }
}
