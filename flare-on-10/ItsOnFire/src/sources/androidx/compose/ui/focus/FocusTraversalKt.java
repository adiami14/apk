package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u001e\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0003H��\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0003H��\u001a+\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"invalidFocusDirection", "", "findActiveFocusNode", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findActiveParent", "focusSearch", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "focusSearch--OM-vw8", "(Landroidx/compose/ui/node/ModifiedFocusNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/node/ModifiedFocusNode;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusTraversalKt.class */
public final class FocusTraversalKt {
    @NotNull
    private static final String invalidFocusDirection = "Invalid FocusDirection";

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusTraversalKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Nullable
    public static final ModifiedFocusNode findActiveFocusNode(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        ModifiedFocusNode modifiedFocusNode2 = modifiedFocusNode;
        switch (WhenMappings.$EnumSwitchMapping$1[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
                ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
                if (focusedChild != null) {
                    modifiedFocusNode2 = findActiveFocusNode(focusedChild);
                    break;
                }
            case 5:
            case 6:
                modifiedFocusNode2 = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return modifiedFocusNode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public static final ModifiedFocusNode findActiveParent(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        ModifiedFocusNode findParentFocusNode$ui_release = modifiedFocusNode.findParentFocusNode$ui_release();
        if (findParentFocusNode$ui_release == null) {
            modifiedFocusNode = null;
        } else {
            switch (WhenMappings.$EnumSwitchMapping$1[modifiedFocusNode.getFocusState().ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    modifiedFocusNode = findActiveParent(findParentFocusNode$ui_release);
                    break;
                case 3:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return modifiedFocusNode;
    }

    @Nullable
    /* renamed from: focusSearch--OM-vw8  reason: not valid java name */
    public static final ModifiedFocusNode m2121focusSearchOMvw8(@NotNull ModifiedFocusNode focusSearch, int i2, @NotNull LayoutDirection layoutDirection) {
        ModifiedFocusNode modifiedFocusNode;
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2091equalsimpl0(i2, companion.m2100getNextdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2102getPreviousdhqQ8s())) {
            modifiedFocusNode = OneDimensionalFocusSearchKt.m2123oneDimensionalFocusSearchMxy_nc0(focusSearch, i2);
        } else {
            if (!(FocusDirection.m2091equalsimpl0(i2, companion.m2099getLeftdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2103getRightdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2104getUpdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2097getDowndhqQ8s()))) {
                if (FocusDirection.m2091equalsimpl0(i2, companion.m2098getIndhqQ8s())) {
                    int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                    if (i3 == 1) {
                        i2 = companion.m2099getLeftdhqQ8s();
                    } else if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        i2 = companion.m2103getRightdhqQ8s();
                    }
                    ModifiedFocusNode findActiveFocusNode = findActiveFocusNode(focusSearch);
                    focusSearch = findActiveFocusNode;
                    if (findActiveFocusNode == null) {
                        modifiedFocusNode = null;
                    }
                } else if (!FocusDirection.m2091equalsimpl0(i2, companion.m2101getOutdhqQ8s())) {
                    throw new IllegalStateException(invalidFocusDirection.toString());
                } else {
                    ModifiedFocusNode findActiveFocusNode2 = findActiveFocusNode(focusSearch);
                    ModifiedFocusNode findActiveParent = findActiveFocusNode2 == null ? null : findActiveParent(findActiveFocusNode2);
                    modifiedFocusNode = Intrinsics.areEqual(findActiveParent, focusSearch) ? null : findActiveParent;
                }
            }
            modifiedFocusNode = TwoDimensionalFocusSearchKt.m2129twoDimensionalFocusSearchMxy_nc0(focusSearch, i2);
        }
        return modifiedFocusNode;
    }
}
