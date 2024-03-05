package androidx.core.app;

import android.app.ActivityManager;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/core/app/ActivityManagerCompat.class */
public final class ActivityManagerCompat {
    private ActivityManagerCompat() {
    }

    public static boolean isLowRamDevice(@NonNull ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
