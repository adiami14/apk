package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
/* loaded from: ItsOnFire.jar:androidx/core/database/sqlite/SQLiteCursorCompat.class */
public final class SQLiteCursorCompat {

    @RequiresApi(28)
    /* loaded from: ItsOnFire.jar:androidx/core/database/sqlite/SQLiteCursorCompat$Api28Impl.class */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static void setFillWindowForwardOnly(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    private SQLiteCursorCompat() {
    }

    public static void setFillWindowForwardOnly(@NonNull SQLiteCursor sQLiteCursor, boolean z) {
        Api28Impl.setFillWindowForwardOnly(sQLiteCursor, z);
    }
}
