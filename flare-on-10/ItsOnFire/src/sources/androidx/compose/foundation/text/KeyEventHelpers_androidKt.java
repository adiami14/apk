package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.appcompat.R;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010��\u001a\u00020\u0001H��\u001a\u0019\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"showCharacterPalette", "", "cancelsTextSelection", "", "Landroidx/compose/ui/input/key/KeyEvent;", "cancelsTextSelection-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/KeyEventHelpers_androidKt.class */
public final class KeyEventHelpers_androidKt {
    /* renamed from: cancelsTextSelection-ZmokQxo  reason: not valid java name */
    public static final boolean m917cancelsTextSelectionZmokQxo(@NotNull KeyEvent cancelsTextSelection) {
        Intrinsics.checkNotNullParameter(cancelsTextSelection, "$this$cancelsTextSelection");
        return cancelsTextSelection.getKeyCode() == 4 && KeyEventType.m3665equalsimpl0(KeyEvent_androidKt.m3673getTypeZmokQxo(cancelsTextSelection), KeyEventType.Companion.m3670getKeyUpCS__XNY());
    }

    public static final void showCharacterPalette() {
    }
}
