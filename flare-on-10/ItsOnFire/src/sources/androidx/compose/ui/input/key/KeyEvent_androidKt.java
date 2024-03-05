package androidx.compose.ui.input.key;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��,\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\"\u0018\u0010��\u001a\u00020\u0001*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012*\n\u0010\u0016\"\u00020\u00172\u00020\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"isAltPressed", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isAltPressed-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isCtrlPressed", "isCtrlPressed-ZmokQxo", "isMetaPressed", "isMetaPressed-ZmokQxo", "isShiftPressed", "isShiftPressed-ZmokQxo", "key", "Landroidx/compose/ui/input/key/Key;", "getKey-ZmokQxo", "(Landroid/view/KeyEvent;)J", "type", "Landroidx/compose/ui/input/key/KeyEventType;", "getType-ZmokQxo", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "", "getUtf16CodePoint-ZmokQxo", "NativeKeyEvent", "Landroid/view/KeyEvent;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/key/KeyEvent_androidKt.class */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo  reason: not valid java name */
    public static final long m3672getKeyZmokQxo(@NotNull android.view.KeyEvent key) {
        Intrinsics.checkNotNullParameter(key, "$this$key");
        return Key_androidKt.Key(key.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo  reason: not valid java name */
    public static final int m3673getTypeZmokQxo(@NotNull android.view.KeyEvent type) {
        Intrinsics.checkNotNullParameter(type, "$this$type");
        int action = type.getAction();
        return action != 0 ? action != 1 ? KeyEventType.Companion.m3671getUnknownCS__XNY() : KeyEventType.Companion.m3670getKeyUpCS__XNY() : KeyEventType.Companion.m3669getKeyDownCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo  reason: not valid java name */
    public static final int m3674getUtf16CodePointZmokQxo(@NotNull android.view.KeyEvent utf16CodePoint) {
        Intrinsics.checkNotNullParameter(utf16CodePoint, "$this$utf16CodePoint");
        return utf16CodePoint.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m3675isAltPressedZmokQxo(@NotNull android.view.KeyEvent isAltPressed) {
        Intrinsics.checkNotNullParameter(isAltPressed, "$this$isAltPressed");
        return isAltPressed.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m3676isCtrlPressedZmokQxo(@NotNull android.view.KeyEvent isCtrlPressed) {
        Intrinsics.checkNotNullParameter(isCtrlPressed, "$this$isCtrlPressed");
        return isCtrlPressed.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m3677isMetaPressedZmokQxo(@NotNull android.view.KeyEvent isMetaPressed) {
        Intrinsics.checkNotNullParameter(isMetaPressed, "$this$isMetaPressed");
        return isMetaPressed.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m3678isShiftPressedZmokQxo(@NotNull android.view.KeyEvent isShiftPressed) {
        Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
        return isShiftPressed.isShiftPressed();
    }
}
