package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException.class */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GooglePlayServicesIncorrectManifestValueException(int r5) {
        /*
            r4 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = " but found "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r5
            r2 = r7
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException.<init>(int):void");
    }
}
