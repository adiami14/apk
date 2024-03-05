package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010��2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020��H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\"R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0004\u0018\u00010��2\b\u0010\u0007\u001a\u0004\u0018\u00010��8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusModifier;)V", "value", "Landroidx/compose/ui/focus/FocusStateImpl;", "focusState", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "focusedChild", "getFocusedChild", "()Landroidx/compose/ui/node/ModifiedFocusNode;", "setFocusedChild", "(Landroidx/compose/ui/node/ModifiedFocusNode;)V", "attach", "", "detach", "findNextFocusWrapper", "excludeDeactivated", "", "findPreviousFocusWrapper", "focusRect", "Landroidx/compose/ui/geometry/Rect;", "onInitialize", "onModifierChanged", "populateFocusOrder", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "propagateFocusEvent", "Landroidx/compose/ui/focus/FocusState;", "sendOnFocusEvent", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/ModifiedFocusNode.class */
public final class ModifiedFocusNode extends DelegatingLayoutNodeWrapper<FocusModifier> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/node/ModifiedFocusNode$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedFocusNode(@NotNull LayoutNodeWrapper wrapped, @NotNull FocusModifier modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void attach() {
        super.attach();
        sendOnFocusEvent(getFocusState());
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        FocusManager focusManager;
        FocusStateImpl focusState = getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusState.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Owner owner$ui_release = getLayoutNode$ui_release().getOwner$ui_release();
            if (owner$ui_release != null && (focusManager = owner$ui_release.getFocusManager()) != null) {
                focusManager.clearFocus(true);
            }
        } else if (i2 == 3 || i2 == 4) {
            ModifiedFocusNode findNextFocusWrapper = getWrapped$ui_release().findNextFocusWrapper(false);
            ModifiedFocusNode modifiedFocusNode = findNextFocusWrapper;
            if (findNextFocusWrapper == null) {
                modifiedFocusNode = FocusNodeUtilsKt.searchChildrenForFocusNode$default(getLayoutNode$ui_release(), null, false, 1, null);
            }
            ModifiedFocusNode findParentFocusNode$ui_release = findParentFocusNode$ui_release();
            if (findParentFocusNode$ui_release != null) {
                findParentFocusNode$ui_release.getModifier().setFocusedChild(modifiedFocusNode);
                if (modifiedFocusNode != null) {
                    sendOnFocusEvent(modifiedFocusNode.getFocusState());
                } else {
                    int i3 = iArr[findParentFocusNode$ui_release.getFocusState().ordinal()];
                    findParentFocusNode$ui_release.setFocusState(i3 != 3 ? i3 != 4 ? findParentFocusNode$ui_release.getFocusState() : FocusStateImpl.Deactivated : FocusStateImpl.Inactive);
                }
            }
        } else if (i2 == 5) {
            ModifiedFocusNode findNextFocusWrapper2 = getWrapped$ui_release().findNextFocusWrapper(false);
            ModifiedFocusNode modifiedFocusNode2 = findNextFocusWrapper2;
            if (findNextFocusWrapper2 == null) {
                modifiedFocusNode2 = FocusNodeUtilsKt.searchChildrenForFocusNode$default(getLayoutNode$ui_release(), null, false, 1, null);
            }
            FocusStateImpl focusState2 = modifiedFocusNode2 == null ? null : modifiedFocusNode2.getFocusState();
            FocusStateImpl focusStateImpl = focusState2;
            if (focusState2 == null) {
                focusStateImpl = FocusStateImpl.Inactive;
            }
            sendOnFocusEvent(focusStateImpl);
        }
        super.detach();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findNextFocusWrapper(boolean z) {
        ModifiedFocusNode modifiedFocusNode = this;
        if (getModifier().getFocusState().isDeactivated()) {
            modifiedFocusNode = this;
            if (z) {
                modifiedFocusNode = super.findNextFocusWrapper(z);
            }
        }
        return modifiedFocusNode;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public ModifiedFocusNode findPreviousFocusWrapper() {
        return this;
    }

    @NotNull
    public final Rect focusRect() {
        return LayoutCoordinatesKt.findRoot(this).localBoundingBoxOf(this, false);
    }

    @NotNull
    public final FocusStateImpl getFocusState() {
        return getModifier().getFocusState();
    }

    @Nullable
    public final ModifiedFocusNode getFocusedChild() {
        return getModifier().getFocusedChild();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    public void onInitialize() {
        super.onInitialize();
        getModifier().setFocusNode(this);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        sendOnFocusEvent(getFocusState());
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void populateFocusOrder(@NotNull FocusOrder focusOrder) {
        Intrinsics.checkNotNullParameter(focusOrder, "focusOrder");
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void propagateFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
    }

    public final void sendOnFocusEvent(@NotNull FocusState focusState) {
        LayoutNodeWrapper wrappedBy$ui_release;
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (isAttached() && getModifier().getHasFocusListeners() && (wrappedBy$ui_release = getWrappedBy$ui_release()) != null) {
            wrappedBy$ui_release.propagateFocusEvent(focusState);
        }
    }

    public final void setFocusState(@NotNull FocusStateImpl value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getModifier().setFocusState(value);
        sendOnFocusEvent(value);
    }

    public final void setFocusedChild(@Nullable ModifiedFocusNode modifiedFocusNode) {
        getModifier().setFocusedChild(modifiedFocusNode);
    }
}
