package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/zag.class */
final class zag<R extends Result> extends BasePendingResult<R> {
    private final R zae;

    public zag(GoogleApiClient googleApiClient, R r2) {
        super(googleApiClient);
        this.zae = r2;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.zae;
    }
}
