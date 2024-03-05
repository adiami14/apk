package androidx.core.app;

import android.app.Dialog;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
/* loaded from: ItsOnFire.jar:androidx/core/app/DialogCompat.class */
public class DialogCompat {

    @RequiresApi(28)
    /* loaded from: ItsOnFire.jar:androidx/core/app/DialogCompat$Api28Impl.class */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static <T> T requireViewById(Dialog dialog, int i2) {
            return (T) dialog.requireViewById(i2);
        }
    }

    private DialogCompat() {
    }

    @NonNull
    public static View requireViewById(@NonNull Dialog dialog, int i2) {
        return (View) Api28Impl.requireViewById(dialog, i2);
    }
}
