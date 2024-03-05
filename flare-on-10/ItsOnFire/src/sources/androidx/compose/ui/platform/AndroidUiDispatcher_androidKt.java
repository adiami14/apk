package androidx.compose.ui.platform;

import android.os.Looper;
import androidx.appcompat.R;
import kotlin.Metadata;
@Metadata(d1 = {"��\b\n��\n\u0002\u0010\u000b\n��\u001a\b\u0010��\u001a\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"isMainThread", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidUiDispatcher_androidKt.class */
public final class AndroidUiDispatcher_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
