package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\b��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n��\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n��\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "()V", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "defaultKeyboardAction", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "defaultKeyboardAction-KlQnJC8", "(I)V", "runAction", "runAction-KlQnJC8", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/KeyboardActionRunner.class */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8  reason: not valid java name */
    public void mo922defaultKeyboardActionKlQnJC8(int i2) {
        FocusManager focusManager;
        int m2102getPreviousdhqQ8s;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4559equalsimpl0(i2, companion.m4566getNexteUduSuo())) {
            focusManager = getFocusManager();
            m2102getPreviousdhqQ8s = FocusDirection.Companion.m2100getNextdhqQ8s();
        } else if (!ImeAction.m4559equalsimpl0(i2, companion.m4568getPreviouseUduSuo())) {
            if (ImeAction.m4559equalsimpl0(i2, companion.m4564getDoneeUduSuo()) ? true : ImeAction.m4559equalsimpl0(i2, companion.m4565getGoeUduSuo()) ? true : ImeAction.m4559equalsimpl0(i2, companion.m4569getSearcheUduSuo()) ? true : ImeAction.m4559equalsimpl0(i2, companion.m4570getSendeUduSuo()) ? true : ImeAction.m4559equalsimpl0(i2, companion.m4563getDefaulteUduSuo())) {
                return;
            }
            ImeAction.m4559equalsimpl0(i2, companion.m4567getNoneeUduSuo());
            return;
        } else {
            focusManager = getFocusManager();
            m2102getPreviousdhqQ8s = FocusDirection.Companion.m2102getPreviousdhqQ8s();
        }
        focusManager.mo2105moveFocus3ESFkO8(m2102getPreviousdhqQ8s);
    }

    @NotNull
    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    @NotNull
    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8  reason: not valid java name */
    public final void m923runActionKlQnJC8(int i2) {
        Function1<KeyboardActionScope, Unit> function1;
        Unit unit;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4559equalsimpl0(i2, companion.m4564getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (ImeAction.m4559equalsimpl0(i2, companion.m4565getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (ImeAction.m4559equalsimpl0(i2, companion.m4566getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (ImeAction.m4559equalsimpl0(i2, companion.m4568getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m4559equalsimpl0(i2, companion.m4569getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m4559equalsimpl0(i2, companion.m4570getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (!(ImeAction.m4559equalsimpl0(i2, companion.m4563getDefaulteUduSuo()) ? true : ImeAction.m4559equalsimpl0(i2, companion.m4567getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            function1 = null;
        }
        if (function1 == null) {
            unit = null;
        } else {
            function1.invoke(this);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            mo922defaultKeyboardActionKlQnJC8(i2);
        }
    }

    public final void setFocusManager(@NotNull FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(@NotNull KeyboardActions keyboardActions) {
        Intrinsics.checkNotNullParameter(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }
}
