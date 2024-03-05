package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\f\u001a\f\u0010��\u001a\u00020\u0001*\u00020\u0002H��\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H��\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H��\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H��\u001a\f\u0010\t\u001a\u00020\u0004*\u00020\u0002H��\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0002H��\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0004*\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {"activateNode", "", "Landroidx/compose/ui/node/ModifiedFocusNode;", "captureFocus", "", "clearChildFocus", "clearFocus", "forcedClear", "deactivateNode", "freeFocus", "grantFocus", "grantFocusToChild", "childNode", "requestFocus", "requestFocusForChild", "requestFocusForOwner", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusTransactionsKt.class */
public final class FocusTransactionsKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusTransactionsKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void activateNode(@NotNull ModifiedFocusNode modifiedFocusNode) {
        FocusStateImpl focusStateImpl;
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i2 == 3) {
            focusStateImpl = FocusStateImpl.Inactive;
        } else if (i2 != 4) {
            return;
        } else {
            focusStateImpl = FocusStateImpl.ActiveParent;
        }
        modifiedFocusNode.setFocusState(focusStateImpl);
    }

    public static final boolean captureFocus(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        boolean z = true;
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
                modifiedFocusNode.setFocusState(FocusStateImpl.Captured);
                z = true;
                break;
            case 2:
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                z = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return z;
    }

    private static final boolean clearChildFocus(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
        if (focusedChild != null) {
            boolean z = false;
            if (clearFocus$default(focusedChild, false, 1, null)) {
                modifiedFocusNode.setFocusedChild(null);
                z = true;
            }
            return z;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (clearChildFocus(r3) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean clearFocus(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.ModifiedFocusNode r3, boolean r4) {
        /*
            r0 = r3
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r3
            androidx.compose.ui.focus.FocusStateImpl r0 = r0.getFocusState()
            r5 = r0
            int[] r0 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0
            r1 = r5
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L6f;
                case 2: goto L5d;
                case 3: goto L78;
                case 4: goto L4a;
                case 5: goto L40;
                case 6: goto L78;
                default: goto L38;
            }
        L38:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L40:
            r0 = r3
            boolean r0 = clearChildFocus(r0)
            if (r0 == 0) goto L58
            goto L6f
        L4a:
            r0 = r3
            boolean r0 = clearChildFocus(r0)
            if (r0 == 0) goto L58
            androidx.compose.ui.focus.FocusStateImpl r0 = androidx.compose.ui.focus.FocusStateImpl.Deactivated
            r5 = r0
            goto L73
        L58:
            r0 = 0
            r6 = r0
            goto L7a
        L5d:
            r0 = r4
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L7a
            r0 = r3
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r0.setFocusState(r1)
            r0 = r4
            r6 = r0
            goto L7a
        L6f:
            androidx.compose.ui.focus.FocusStateImpl r0 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r5 = r0
        L73:
            r0 = r3
            r1 = r5
            r0.setFocusState(r1)
        L78:
            r0 = 1
            r6 = r0
        L7a:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(androidx.compose.ui.node.ModifiedFocusNode, boolean):boolean");
    }

    public static /* synthetic */ boolean clearFocus$default(ModifiedFocusNode modifiedFocusNode, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return clearFocus(modifiedFocusNode, z);
    }

    public static final void deactivateNode(@NotNull ModifiedFocusNode modifiedFocusNode) {
        FocusManager focusManager;
        FocusStateImpl focusStateImpl;
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i2 == 1 || i2 == 2) {
            Owner owner$ui_release = modifiedFocusNode.getLayoutNode$ui_release().getOwner$ui_release();
            if (owner$ui_release != null && (focusManager = owner$ui_release.getFocusManager()) != null) {
                focusManager.clearFocus(true);
            }
        } else if (i2 == 5) {
            focusStateImpl = FocusStateImpl.DeactivatedParent;
            modifiedFocusNode.setFocusState(focusStateImpl);
        } else if (i2 != 6) {
            return;
        }
        focusStateImpl = FocusStateImpl.Deactivated;
        modifiedFocusNode.setFocusState(focusStateImpl);
    }

    public static final boolean freeFocus(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        boolean z = true;
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
                break;
            case 2:
                modifiedFocusNode.setFocusState(FocusStateImpl.Active);
                z = true;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                z = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return z;
    }

    private static final void grantFocus(ModifiedFocusNode modifiedFocusNode) {
        FocusStateImpl focusStateImpl;
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 5:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        modifiedFocusNode.setFocusState(focusStateImpl);
    }

    private static final boolean grantFocusToChild(ModifiedFocusNode modifiedFocusNode, ModifiedFocusNode modifiedFocusNode2) {
        grantFocus(modifiedFocusNode2);
        modifiedFocusNode.setFocusedChild(modifiedFocusNode2);
        return true;
    }

    public static final void requestFocus(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                modifiedFocusNode.sendOnFocusEvent(modifiedFocusNode.getFocusState());
                return;
            case 5:
                if (!clearChildFocus(modifiedFocusNode)) {
                    return;
                }
                break;
            case 6:
                ModifiedFocusNode findParentFocusNode$ui_release = modifiedFocusNode.findParentFocusNode$ui_release();
                if (findParentFocusNode$ui_release != null) {
                    requestFocusForChild(findParentFocusNode$ui_release, modifiedFocusNode);
                    return;
                } else if (!requestFocusForOwner(modifiedFocusNode)) {
                    return;
                }
                break;
            default:
                return;
        }
        grantFocus(modifiedFocusNode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
        if (requestFocusForChild(r0, r4) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (clearChildFocus(r4) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (clearChildFocus(r4) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean requestFocusForChild(androidx.compose.ui.node.ModifiedFocusNode r4, androidx.compose.ui.node.ModifiedFocusNode r5) {
        /*
            r0 = 0
            r6 = r0
            r0 = r4
            r1 = 0
            java.util.List r0 = r0.focusableChildren(r1)
            r1 = r5
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lcd
            r0 = r4
            androidx.compose.ui.focus.FocusStateImpl r0 = r0.getFocusState()
            r7 = r0
            r0 = r6
            r8 = r0
            int[] r0 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0
            r1 = r7
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Lbc;
                case 2: goto Lca;
                case 3: goto Laa;
                case 4: goto L93;
                case 5: goto L86;
                case 6: goto L50;
                default: goto L48;
            }
        L48:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L50:
            r0 = r4
            androidx.compose.ui.node.ModifiedFocusNode r0 = r0.findParentFocusNode$ui_release()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L71
            r0 = r4
            boolean r0 = requestFocusForOwner(r0)
            if (r0 == 0) goto L71
            r0 = r4
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Active
            r0.setFocusState(r1)
        L67:
            r0 = r4
            r1 = r5
            boolean r0 = requestFocusForChild(r0, r1)
            r8 = r0
            goto Lca
        L71:
            r0 = r6
            r8 = r0
            r0 = r7
            if (r0 == 0) goto Lca
            r0 = r6
            r8 = r0
            r0 = r7
            r1 = r4
            boolean r0 = requestFocusForChild(r0, r1)
            if (r0 == 0) goto Lca
            goto L67
        L86:
            r0 = r6
            r8 = r0
            r0 = r4
            boolean r0 = clearChildFocus(r0)
            if (r0 == 0) goto Lca
            goto L9a
        L93:
            r0 = r4
            androidx.compose.ui.node.ModifiedFocusNode r0 = r0.getFocusedChild()
            if (r0 != 0) goto L9d
        L9a:
            goto Lc3
        L9d:
            r0 = r6
            r8 = r0
            r0 = r4
            boolean r0 = clearChildFocus(r0)
            if (r0 == 0) goto Lca
            goto L9a
        Laa:
            r0 = r4
            activateNode(r0)
            r0 = r4
            r1 = r5
            boolean r0 = requestFocusForChild(r0, r1)
            r8 = r0
            r0 = r4
            deactivateNode(r0)
            goto Lca
        Lbc:
            r0 = r4
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent
            r0.setFocusState(r1)
        Lc3:
            r0 = r4
            r1 = r5
            boolean r0 = grantFocusToChild(r0, r1)
            r8 = r0
        Lca:
            r0 = r8
            return r0
        Lcd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Non child node cannot request focus."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.requestFocusForChild(androidx.compose.ui.node.ModifiedFocusNode, androidx.compose.ui.node.ModifiedFocusNode):boolean");
    }

    private static final boolean requestFocusForOwner(ModifiedFocusNode modifiedFocusNode) {
        Owner owner$ui_release = modifiedFocusNode.getLayoutNode$ui_release().getOwner$ui_release();
        Boolean valueOf = owner$ui_release == null ? null : Boolean.valueOf(owner$ui_release.requestFocus());
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
