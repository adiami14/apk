package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: ItsOnFire.jar:androidx/core/content/pm/PermissionInfoCompat.class */
public final class PermissionInfoCompat {

    @RequiresApi(28)
    /* loaded from: ItsOnFire.jar:androidx/core/content/pm/PermissionInfoCompat$Api28Impl.class */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static int getProtection(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @DoNotInline
        public static int getProtectionFlags(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: ItsOnFire.jar:androidx/core/content/pm/PermissionInfoCompat$Protection.class */
    public @interface Protection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @SuppressLint({"UniqueConstants"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: ItsOnFire.jar:androidx/core/content/pm/PermissionInfoCompat$ProtectionFlags.class */
    public @interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
    }

    @SuppressLint({"WrongConstant"})
    public static int getProtection(@NonNull PermissionInfo permissionInfo) {
        return Api28Impl.getProtection(permissionInfo);
    }

    @SuppressLint({"WrongConstant"})
    public static int getProtectionFlags(@NonNull PermissionInfo permissionInfo) {
        return Api28Impl.getProtectionFlags(permissionInfo);
    }
}
