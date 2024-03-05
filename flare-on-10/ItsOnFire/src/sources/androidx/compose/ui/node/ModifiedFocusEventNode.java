package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\b��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusEventNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusEventModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusEventModifier;)V", "onModifierChanged", "", "propagateFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/ModifiedFocusEventNode.class */
public final class ModifiedFocusEventNode extends DelegatingLayoutNodeWrapper<FocusEventModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedFocusEventNode(@NotNull LayoutNodeWrapper wrapped, @NotNull FocusEventModifier modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        FocusStateImpl focusState;
        super.onModifierChanged();
        ModifiedFocusNode findNextFocusWrapper = getWrapped$ui_release().findNextFocusWrapper(false);
        ModifiedFocusNode modifiedFocusNode = findNextFocusWrapper;
        if (findNextFocusWrapper == null) {
            modifiedFocusNode = FocusNodeUtilsKt.searchChildrenForFocusNode$default(getLayoutNode$ui_release(), null, false, 1, null);
        }
        FocusEventModifier modifier = getModifier();
        if (modifiedFocusNode == null) {
            focusState = null;
        } else {
            FocusModifier modifier2 = modifiedFocusNode.getModifier();
            focusState = modifier2 == null ? null : modifier2.getFocusState();
        }
        FocusStateImpl focusStateImpl = focusState;
        if (focusState == null) {
            focusStateImpl = FocusStateImpl.Inactive;
        }
        modifier.onFocusEvent(focusStateImpl);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void propagateFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        getModifier().onFocusEvent(focusState);
        if (((Boolean) onModifierLocalRead(FocusModifierKt.getModifierLocalHasFocusEventListener())).booleanValue()) {
            super.propagateFocusEvent(focusState);
        }
    }
}
