package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��6\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u001a\u001c\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H��\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H��\u001a:\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH��¨\u0006\u0011"}, d2 = {"longPressDragGestureFilter", "Landroidx/compose/ui/Modifier;", "observer", "Landroidx/compose/foundation/text/TextDragObserver;", "enabled", "", "mouseDragGestureDetector", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "textFieldFocusModifier", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onFocusChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldGestureModifiersKt.class */
public final class TextFieldGestureModifiersKt {
    @NotNull
    public static final Modifier longPressDragGestureFilter(@NotNull Modifier modifier, @NotNull TextDragObserver observer, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Modifier modifier2 = modifier;
        if (z) {
            modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier, observer, new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(observer, null));
        }
        return modifier2;
    }

    @NotNull
    public static final Modifier mouseDragGestureDetector(@NotNull Modifier modifier, @NotNull MouseSelectionObserver observer, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (z) {
            modifier = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, observer, new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(observer, null));
        }
        return modifier;
    }

    @NotNull
    public static final Modifier textFieldFocusModifier(@NotNull Modifier modifier, boolean z, @NotNull FocusRequester focusRequester, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function1<? super FocusState, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        return FocusableKt.focusable(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), onFocusChanged), z, mutableInteractionSource);
    }
}