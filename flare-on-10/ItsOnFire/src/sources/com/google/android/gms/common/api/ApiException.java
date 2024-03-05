package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/ApiException.class */
public class ApiException extends Exception {
    @NonNull
    @Deprecated
    public final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ApiException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            r0 = r4
            int r0 = r0.getStatusCode()
            r5 = r0
            r0 = r4
            java.lang.String r0 = r0.getStatusMessage()
            if (r0 == 0) goto L14
            r0 = r4
            java.lang.String r0 = r0.getStatusMessage()
            r6 = r0
            goto L17
        L14:
            java.lang.String r0 = ""
            r6 = r0
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = r7
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.mStatus = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    @NonNull
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Nullable
    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
