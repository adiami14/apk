package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
@CheckReturnValue
@ShowFirstParty
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/PackageSignatureVerifier.class */
public class PackageSignatureVerifier {
    @Nullable
    private static zzad zza;
    private volatile zzac zzb;

    private static zzad zza() {
        zzad zzadVar;
        synchronized (zzad.class) {
            try {
                if (zza == null) {
                    zza = new zzad();
                }
                zzadVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r0.equals(r0) != false) goto L10;
     */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull java.lang.String r9) {
        /*
            r7 = this;
            r0 = r8
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r0)
            r10 = r0
            com.google.android.gms.common.zzad r0 = zza()
            boolean r0 = com.google.android.gms.common.zzn.zzf()
            if (r0 == 0) goto L8d
            r0 = 1
            r1 = r10
            if (r0 == r1) goto L1a
            java.lang.String r0 = "-0"
            r8 = r0
            goto L1d
        L1a:
            java.lang.String r0 = "-1"
            r8 = r0
        L1d:
            r0 = r9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = r8
            java.lang.String r0 = r0.concat(r1)
            r8 = r0
            r0 = r7
            com.google.android.gms.common.zzac r0 = r0.zzb
            if (r0 == 0) goto L3e
            r0 = r7
            com.google.android.gms.common.zzac r0 = r0.zzb
            java.lang.String r0 = com.google.android.gms.common.zzac.zzb(r0)
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            goto L68
        L3e:
            com.google.android.gms.common.zzad r0 = zza()
            r0 = r9
            r1 = r10
            r2 = 0
            r3 = 0
            com.google.android.gms.common.zzx r0 = com.google.android.gms.common.zzn.zzc(r0, r1, r2, r3)
            r11 = r0
            r0 = r11
            boolean r0 = r0.zza
            if (r0 == 0) goto L73
            r0 = r7
            com.google.android.gms.common.zzac r1 = new com.google.android.gms.common.zzac
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r11
            int r5 = r5.zzd
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.PackageVerificationResult.zzd(r4, r5)
            r2.<init>(r3, r4)
            r0.zzb = r1
        L68:
            r0 = r7
            com.google.android.gms.common.zzac r0 = r0.zzb
            com.google.android.gms.common.PackageVerificationResult r0 = com.google.android.gms.common.zzac.zza(r0)
            r8 = r0
            goto L8b
        L73:
            r0 = r11
            java.lang.String r0 = r0.zzb
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r0 = r9
            r1 = r11
            java.lang.String r1 = r1.zzb
            r2 = r11
            java.lang.Throwable r2 = r2.zzc
            com.google.android.gms.common.PackageVerificationResult r0 = com.google.android.gms.common.PackageVerificationResult.zza(r0, r1, r2)
            r8 = r0
        L8b:
            r0 = r8
            return r0
        L8d:
            com.google.android.gms.common.zzae r0 = new com.google.android.gms.common.zzae
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.PackageSignatureVerifier.queryPackageSignatureVerified(android.content.Context, java.lang.String):com.google.android.gms.common.PackageVerificationResult");
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        PackageVerificationResult queryPackageSignatureVerified;
        try {
            PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified2.zzb();
            queryPackageSignatureVerified = queryPackageSignatureVerified2;
        } catch (SecurityException e2) {
            queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            if (queryPackageSignatureVerified.zzc()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e2);
                return queryPackageSignatureVerified;
            }
        }
        return queryPackageSignatureVerified;
    }
}
