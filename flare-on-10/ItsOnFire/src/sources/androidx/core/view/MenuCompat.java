package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;
/* loaded from: ItsOnFire.jar:androidx/core/view/MenuCompat.class */
public final class MenuCompat {

    @RequiresApi(28)
    /* loaded from: ItsOnFire.jar:androidx/core/view/MenuCompat$Api28Impl.class */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static void setGroupDividerEnabled(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    private MenuCompat() {
    }

    public static void setGroupDividerEnabled(@NonNull Menu menu, boolean z) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z);
        } else {
            Api28Impl.setGroupDividerEnabled(menu, z);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i2) {
        menuItem.setShowAsAction(i2);
    }
}
