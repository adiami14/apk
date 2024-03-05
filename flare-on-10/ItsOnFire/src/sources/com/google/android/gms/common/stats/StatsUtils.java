package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
@Deprecated
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/stats/StatsUtils.class */
public class StatsUtils {
    @NonNull
    @KeepForSdk
    public static String getEventKey(@NonNull PowerManager.WakeLock wakeLock, @NonNull String str) {
        long myPid = Process.myPid();
        long identityHashCode = System.identityHashCode(wakeLock);
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(String.valueOf((myPid << 32) | identityHashCode)).concat(String.valueOf(str));
    }
}
