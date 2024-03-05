package androidx.core.database;

import android.database.CursorWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
/* loaded from: ItsOnFire.jar:androidx/core/database/CursorWindowCompat.class */
public final class CursorWindowCompat {

    @RequiresApi(15)
    /* loaded from: ItsOnFire.jar:androidx/core/database/CursorWindowCompat$Api15Impl.class */
    public static class Api15Impl {
        private Api15Impl() {
        }

        @DoNotInline
        public static CursorWindow createCursorWindow(String str) {
            return new CursorWindow(str);
        }
    }

    @RequiresApi(28)
    /* loaded from: ItsOnFire.jar:androidx/core/database/CursorWindowCompat$Api28Impl.class */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static CursorWindow createCursorWindow(String str, long j2) {
            return new CursorWindow(str, j2);
        }
    }

    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j2) {
        return Api28Impl.createCursorWindow(str, j2);
    }
}
