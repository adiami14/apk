package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��6\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0002\u001aE\u0010\u0005\u001a\u00020\u0006\"\u0004\b��\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000bH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\f\u001aE\u0010\r\u001a\u00020\u0006\"\u0004\b��\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000bH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\f\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0004H\u0002\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "backwardFocusSearch", "Landroidx/compose/ui/node/ModifiedFocusNode;", "forEachItemAfter", "", "T", "", "item", "action", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachItemBefore", "forwardFocusSearch", "isRoot", "", "oneDimensionalFocusSearch", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "oneDimensionalFocusSearch-Mxy_nc0", "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/OneDimensionalFocusSearchKt.class */
public final class OneDimensionalFocusSearchKt {
    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/OneDimensionalFocusSearchKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final ModifiedFocusNode backwardFocusSearch(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode backwardFocusSearch;
        ModifiedFocusNode backwardFocusSearch2;
        ModifiedFocusNode backwardFocusSearch3;
        ModifiedFocusNode backwardFocusSearch4;
        Object lastOrNull;
        ModifiedFocusNode backwardFocusSearch5;
        Object lastOrNull2;
        FocusStateImpl focusState = modifiedFocusNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        boolean z = false;
        boolean z2 = false;
        switch (iArr[focusState.ordinal()]) {
            case 1:
                ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
                if (focusedChild != null) {
                    switch (iArr[focusedChild.getFocusState().ordinal()]) {
                        case 1:
                            ModifiedFocusNode backwardFocusSearch6 = backwardFocusSearch(focusedChild);
                            if (backwardFocusSearch6 == null) {
                                backwardFocusSearch6 = focusedChild;
                            }
                            return backwardFocusSearch6;
                        case 2:
                            ModifiedFocusNode backwardFocusSearch7 = backwardFocusSearch(focusedChild);
                            if (backwardFocusSearch7 == null) {
                                List<ModifiedFocusNode> focusableChildren = modifiedFocusNode.focusableChildren(false);
                                int size = focusableChildren.size() - 1;
                                if (size >= 0) {
                                    boolean z3 = false;
                                    while (true) {
                                        int i2 = size - 1;
                                        if (z3 && (backwardFocusSearch = backwardFocusSearch(focusableChildren.get(size))) != null) {
                                            return backwardFocusSearch;
                                        }
                                        if (Intrinsics.areEqual(focusableChildren.get(size), focusedChild)) {
                                            z3 = true;
                                        }
                                        if (i2 >= 0) {
                                            size = i2;
                                        }
                                    }
                                }
                                ModifiedFocusNode modifiedFocusNode2 = modifiedFocusNode;
                                if (isRoot(modifiedFocusNode)) {
                                    modifiedFocusNode2 = null;
                                }
                                return modifiedFocusNode2;
                            }
                            return backwardFocusSearch7;
                        case 3:
                        case 4:
                            List<ModifiedFocusNode> focusableChildren2 = modifiedFocusNode.focusableChildren(false);
                            int size2 = focusableChildren2.size() - 1;
                            if (size2 >= 0) {
                                boolean z4 = false;
                                while (true) {
                                    int i3 = size2 - 1;
                                    if (z4 && (backwardFocusSearch2 = backwardFocusSearch(focusableChildren2.get(size2))) != null) {
                                        return backwardFocusSearch2;
                                    }
                                    if (Intrinsics.areEqual(focusableChildren2.get(size2), focusedChild)) {
                                        z4 = true;
                                    }
                                    if (i3 >= 0) {
                                        size2 = i3;
                                    }
                                }
                            }
                            ModifiedFocusNode modifiedFocusNode3 = modifiedFocusNode;
                            if (isRoot(modifiedFocusNode)) {
                                modifiedFocusNode3 = null;
                            }
                            return modifiedFocusNode3;
                        case 5:
                        case 6:
                            throw new IllegalStateException(NoActiveChild.toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalStateException(NoActiveChild.toString());
            case 2:
                ModifiedFocusNode focusedChild2 = modifiedFocusNode.getFocusedChild();
                if (focusedChild2 != null) {
                    switch (iArr[focusedChild2.getFocusState().ordinal()]) {
                        case 1:
                            ModifiedFocusNode backwardFocusSearch8 = backwardFocusSearch(focusedChild2);
                            if (backwardFocusSearch8 == null) {
                                backwardFocusSearch8 = focusedChild2;
                            }
                            return backwardFocusSearch8;
                        case 2:
                            ModifiedFocusNode backwardFocusSearch9 = backwardFocusSearch(focusedChild2);
                            if (backwardFocusSearch9 != null) {
                                return backwardFocusSearch9;
                            }
                            List<ModifiedFocusNode> focusableChildren3 = modifiedFocusNode.focusableChildren(false);
                            int size3 = focusableChildren3.size() - 1;
                            if (size3 < 0) {
                                return null;
                            }
                            while (true) {
                                int i4 = size3 - 1;
                                if (z && (backwardFocusSearch3 = backwardFocusSearch(focusableChildren3.get(size3))) != null) {
                                    return backwardFocusSearch3;
                                }
                                if (Intrinsics.areEqual(focusableChildren3.get(size3), focusedChild2)) {
                                    z = true;
                                }
                                if (i4 < 0) {
                                    return null;
                                }
                                size3 = i4;
                            }
                            break;
                        case 3:
                        case 4:
                            List<ModifiedFocusNode> focusableChildren4 = modifiedFocusNode.focusableChildren(false);
                            int size4 = focusableChildren4.size() - 1;
                            if (size4 < 0) {
                                return null;
                            }
                            while (true) {
                                int i5 = size4 - 1;
                                if (z2 && (backwardFocusSearch4 = backwardFocusSearch(focusableChildren4.get(size4))) != null) {
                                    return backwardFocusSearch4;
                                }
                                if (Intrinsics.areEqual(focusableChildren4.get(size4), focusedChild2)) {
                                    z2 = true;
                                }
                                if (i5 < 0) {
                                    return null;
                                }
                                size4 = i5;
                            }
                            break;
                        case 5:
                        case 6:
                            throw new IllegalStateException(NoActiveChild.toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    throw new IllegalStateException(NoActiveChild.toString());
                }
            case 3:
            case 4:
            case 6:
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) modifiedFocusNode.focusableChildren(true));
                ModifiedFocusNode modifiedFocusNode4 = (ModifiedFocusNode) lastOrNull;
                if (modifiedFocusNode4 != null && (backwardFocusSearch5 = backwardFocusSearch(modifiedFocusNode4)) != null) {
                    modifiedFocusNode = backwardFocusSearch5;
                }
                return modifiedFocusNode;
            case 5:
                lastOrNull2 = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) modifiedFocusNode.focusableChildren(true));
                ModifiedFocusNode modifiedFocusNode5 = (ModifiedFocusNode) lastOrNull2;
                return modifiedFocusNode5 == null ? null : backwardFocusSearch(modifiedFocusNode5);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final <T> void forEachItemAfter(List<? extends T> list, T t2, Function1<? super T, Unit> function1) {
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (z) {
                function1.invoke((T) list.get(i2));
            }
            if (Intrinsics.areEqual(list.get(i2), t2)) {
                z = true;
            }
        }
    }

    private static final <T> void forEachItemBefore(List<? extends T> list, T t2, Function1<? super T, Unit> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = size - 1;
            if (z) {
                function1.invoke((T) list.get(size));
            }
            if (Intrinsics.areEqual(list.get(size), t2)) {
                z = true;
            }
            if (i2 < 0) {
                return;
            }
            size = i2;
        }
    }

    private static final ModifiedFocusNode forwardFocusSearch(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode forwardFocusSearch;
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 2:
                ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
                if (focusedChild != null) {
                    ModifiedFocusNode forwardFocusSearch2 = forwardFocusSearch(focusedChild);
                    if (forwardFocusSearch2 == null) {
                        List<ModifiedFocusNode> focusableChildren = modifiedFocusNode.focusableChildren(false);
                        int size = focusableChildren.size();
                        boolean z = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            if (z && (forwardFocusSearch = forwardFocusSearch(focusableChildren.get(i2))) != null) {
                                return forwardFocusSearch;
                            }
                            if (Intrinsics.areEqual(focusableChildren.get(i2), focusedChild)) {
                                z = true;
                            }
                        }
                        return null;
                    }
                    return forwardFocusSearch2;
                }
                throw new IllegalStateException(NoActiveChild.toString());
            case 3:
            case 4:
            case 5:
                List<ModifiedFocusNode> focusableChildren2 = modifiedFocusNode.focusableChildren(false);
                int size2 = focusableChildren2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ModifiedFocusNode forwardFocusSearch3 = forwardFocusSearch(focusableChildren2.get(i3));
                    if (forwardFocusSearch3 != null) {
                        return forwardFocusSearch3;
                    }
                }
                return null;
            case 6:
                return modifiedFocusNode;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean isRoot(ModifiedFocusNode modifiedFocusNode) {
        return modifiedFocusNode.findParentFocusNode$ui_release() == null;
    }

    @Nullable
    /* renamed from: oneDimensionalFocusSearch-Mxy_nc0  reason: not valid java name */
    public static final ModifiedFocusNode m2123oneDimensionalFocusSearchMxy_nc0(@NotNull ModifiedFocusNode oneDimensionalFocusSearch, int i2) {
        ModifiedFocusNode backwardFocusSearch;
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2091equalsimpl0(i2, companion.m2100getNextdhqQ8s())) {
            backwardFocusSearch = forwardFocusSearch(oneDimensionalFocusSearch);
        } else if (!FocusDirection.m2091equalsimpl0(i2, companion.m2102getPreviousdhqQ8s())) {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        } else {
            backwardFocusSearch = backwardFocusSearch(oneDimensionalFocusSearch);
        }
        return backwardFocusSearch;
    }
}
