package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;
import javax.annotation.Nullable;
@CheckReturnValue
@ShowFirstParty
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/GoogleSignatureVerifier.class */
public class GoogleSignatureVerifier {
    @Nullable
    private static GoogleSignatureVerifier zza;
    @Nullable
    private static volatile Set zzb;
    private final Context zzc;
    private volatile String zzd;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.zzc = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzn.zze(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    @Nullable
    public static final zzj zza(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < zzjVarArr.length; i2++) {
            if (zzjVarArr[i2].equals(zzkVar)) {
                return zzjVarArr[i2];
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ("com.google.android.gms".equals(r7.packageName) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzb(@androidx.annotation.NonNull android.content.pm.PackageInfo r7, boolean r8) {
        /*
            r0 = r8
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L41
            r0 = r8
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L41
            java.lang.String r0 = "com.android.vending"
            r1 = r7
            java.lang.String r1 = r1.packageName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            r0 = r8
            r9 = r0
            java.lang.String r0 = "com.google.android.gms"
            r1 = r7
            java.lang.String r1 = r1.packageName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
        L26:
            r0 = r7
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L34
        L2f:
            r0 = 0
            r9 = r0
            goto L41
        L34:
            r0 = r10
            int r0 = r0.flags
            r1 = 129(0x81, float:1.81E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = 1
            r9 = r0
        L41:
            r0 = r7
            if (r0 == 0) goto L72
            r0 = r7
            android.content.pm.Signature[] r0 = r0.signatures
            if (r0 == 0) goto L72
            r0 = r9
            if (r0 == 0) goto L5b
            r0 = r7
            com.google.android.gms.common.zzj[] r1 = com.google.android.gms.common.zzm.zza
            com.google.android.gms.common.zzj r0 = zza(r0, r1)
            r7 = r0
            goto L6c
        L5b:
            r0 = r7
            r1 = 1
            com.google.android.gms.common.zzj[] r1 = new com.google.android.gms.common.zzj[r1]
            r2 = r1
            r3 = 0
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            r5 = 0
            r4 = r4[r5]
            r2[r3] = r4
            com.google.android.gms.common.zzj r0 = zza(r0, r1)
            r7 = r0
        L6c:
            r0 = r7
            if (r0 == 0) goto L72
            r0 = 1
            return r0
        L72:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzx zzc(String str, boolean z, boolean z2) {
        zzx zza2;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return zzx.zzc("null pkg");
        }
        if (str.equals(this.zzd)) {
            return zzx.zzb();
        }
        if (zzn.zzg()) {
            zza2 = zzn.zzb(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.zzc.getPackageManager().getPackageInfo(str, 64);
                boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        zza2 = zzn.zza(str3, zzkVar, honorsDebugCertificates, false);
                        if (zza2.zza && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && zzn.zza(str3, zzkVar, false, true).zza) {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                zza2 = zzx.zzc(str2);
            } catch (PackageManager.NameNotFoundException e2) {
                return zzx.zzd("no pkg ".concat(str), e2);
            }
        }
        if (zza2.zza) {
            this.zzd = str;
        }
        return zza2;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return false;
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@NonNull String str) {
        zzx zzc = zzc(str, false, false);
        zzc.zze();
        return zzc.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i2) {
        zzx zzc;
        int length;
        String[] packagesForUid = this.zzc.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzc(packagesForUid[i3], false, false);
                if (zzc.zza) {
                    break;
                }
                i3++;
            }
        } else {
            zzc = zzx.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}
