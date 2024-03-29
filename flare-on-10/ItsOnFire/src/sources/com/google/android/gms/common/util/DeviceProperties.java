package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/util/DeviceProperties.class */
public final class DeviceProperties {
    @Nullable
    private static Boolean zza;
    @Nullable
    private static Boolean zzb;
    @Nullable
    private static Boolean zzc;
    @Nullable
    private static Boolean zzd;
    @Nullable
    private static Boolean zze;
    @Nullable
    private static Boolean zzf;
    @Nullable
    private static Boolean zzg;
    @Nullable
    private static Boolean zzh;
    @Nullable
    private static Boolean zzi;
    @Nullable
    private static Boolean zzj;
    @Nullable
    private static Boolean zzk;
    @Nullable
    private static Boolean zzl;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzi == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastO()) {
                z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                    z = true;
                }
            }
            zzi = Boolean.valueOf(z);
        }
        return zzi.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(@NonNull Context context) {
        if (zzl == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastR()) {
                z = false;
                if (context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                    z = true;
                }
            }
            zzl = Boolean.valueOf(z);
        }
        return zzl.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@NonNull Context context) {
        if (zzf == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater")) {
                z = false;
                if (packageManager.hasSystemFeature("cn.google.services")) {
                    z = true;
                }
            }
            zzf = Boolean.valueOf(z);
        }
        return zzf.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(@NonNull Context context) {
        if (zza == null) {
            boolean z = false;
            if (!isTablet(context)) {
                z = false;
                if (!isWearable(context)) {
                    z = false;
                    if (!zzb(context)) {
                        if (zzh == null) {
                            zzh = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                        }
                        z = false;
                        if (!zzh.booleanValue()) {
                            z = false;
                            if (!isAuto(context)) {
                                z = false;
                                if (!isTv(context)) {
                                    if (zzk == null) {
                                        zzk = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                                    }
                                    z = false;
                                    if (!zzk.booleanValue()) {
                                        z = false;
                                        if (!isBstar(context)) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            zza = Boolean.valueOf(z);
        }
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@NonNull Context context) {
        return zzc(context.getResources());
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean isSidewinder(@NonNull Context context) {
        return zza(context);
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Context context) {
        return isTablet(context.getResources());
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources)) {
                z = true;
            }
            zzb = Boolean.valueOf(z);
        }
        return zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv")) {
                z = true;
                if (!packageManager.hasSystemFeature("android.hardware.type.television")) {
                    z = packageManager.hasSystemFeature("android.software.leanback");
                }
            }
            zzj = Boolean.valueOf(z);
        }
        return zzj.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i2 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @KeepForSdk
    @TargetApi(20)
    public static boolean isWearable(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzd == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastKitKatWatch()) {
                z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    z = true;
                }
            }
            zzd = Boolean.valueOf(z);
        }
        return zzd.booleanValue();
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(@NonNull Context context) {
        if (!isWearable(context) || PlatformVersion.isAtLeastN()) {
            if (zza(context)) {
                return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
            }
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static boolean zza(@NonNull Context context) {
        if (zze == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastLollipop()) {
                z = false;
                if (context.getPackageManager().hasSystemFeature("cn.google")) {
                    z = true;
                }
            }
            zze = Boolean.valueOf(z);
        }
        return zze.booleanValue();
    }

    public static boolean zzb(@NonNull Context context) {
        if (zzg == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot")) {
                z = context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
            }
            zzg = Boolean.valueOf(z);
        }
        return zzg.booleanValue();
    }

    public static boolean zzc(@NonNull Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            Configuration configuration = resources.getConfiguration();
            boolean z = false;
            if ((configuration.screenLayout & 15) <= 3) {
                z = false;
                if (configuration.smallestScreenWidthDp >= 600) {
                    z = true;
                }
            }
            zzc = Boolean.valueOf(z);
        }
        return zzc.booleanValue();
    }
}
