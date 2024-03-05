package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/util/WorkSourceUtil.class */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|2|3|4|(21:55|56|7|8|9|10|11|12|13|(12:45|46|16|(9:40|41|19|(6:35|36|22|(6:24|25|26|27|28|29)|32|33)|21|22|(0)|32|33)|18|19|(0)|21|22|(0)|32|33)|15|16|(0)|18|19|(0)|21|22|(0)|32|33)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.m5395clinit():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@NonNull WorkSource workSource, int i2, @NonNull String str) {
        Method method = zzc;
        if (method != null) {
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i2), str2);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackage(@NonNull Context context, @NonNull String str) {
        String str2;
        ApplicationInfo applicationInfo;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            str2 = "Could not find package: ";
        }
        if (applicationInfo == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i2 = applicationInfo.uid;
        WorkSource workSource = new WorkSource();
        add(workSource, i2, str);
        return workSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.fromPackageAndModuleExperimentalPi(android.content.Context, java.lang.String, java.lang.String):android.os.WorkSource");
    }

    @KeepForSdk
    public static int get(@NonNull WorkSource workSource, int i2) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i2));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return 0;
            }
        }
        return 0;
    }

    @NonNull
    @KeepForSdk
    public static String getName(@NonNull WorkSource workSource, int i2) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return null;
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static List<String> getNames(@NonNull WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i2 = 0; i2 < size; i2++) {
                String name = getName(workSource, i2);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(@NonNull Context context) {
        return (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    @KeepForSdk
    public static boolean isEmpty(@NonNull WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e2) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e2);
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(@NonNull WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return 0;
            }
        }
        return 0;
    }
}
