package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: ItsOnFire.jar:androidx/core/content/PermissionChecker.class */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: ItsOnFire.jar:androidx/core/content/PermissionChecker$PermissionResult.class */
    public @interface PermissionResult {
    }

    private PermissionChecker() {
    }

    public static int checkCallingOrSelfPermission(@NonNull Context context, @NonNull String str) {
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int checkCallingPermission(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int checkPermission(@NonNull Context context, @NonNull String str, int i2, int i3, @Nullable String str2) {
        if (context.checkPermission(str, i2, i3) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManagerCompat.permissionToOp(str);
        if (permissionToOp == null) {
            return 0;
        }
        String str3 = str2;
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str3 = packagesForUid[0];
        }
        return (Process.myUid() == i3 && ObjectsCompat.equals(context.getPackageName(), str3) ? AppOpsManagerCompat.checkOrNoteProxyOp(context, i3, permissionToOp, str3) : AppOpsManagerCompat.noteProxyOpNoThrow(context, permissionToOp, str3)) == 0 ? 0 : -2;
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        return checkPermission(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
