package androidx.compose.ui.focus;

import androidx.appcompat.R;
import kotlin.Metadata;
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018��2\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/focus/FocusManager;", "", "clearFocus", "", "force", "", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusManager.class */
public interface FocusManager {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusManager$DefaultImpls.class */
    public static final class DefaultImpls {
        public static /* synthetic */ void clearFocus$default(FocusManager focusManager, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
            }
            if ((i2 & 1) != 0) {
                z = false;
            }
            focusManager.clearFocus(z);
        }
    }

    void clearFocus(boolean z);

    /* renamed from: moveFocus-3ESFkO8  reason: not valid java name */
    boolean mo2105moveFocus3ESFkO8(int i2);
}
