package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��H\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\"\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0081\u0001\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\u001a\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u001a-\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00142\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\nH\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"SwipeToDismiss", "", "state", "Landroidx/compose/material/DismissState;", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", "background", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", Constants.MessagePayloadKeys.FROM, "Landroidx/compose/material/DismissValue;", "to", "rememberDismissState", "initialValue", "confirmStateChange", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeToDismissKt.class */
public final class SwipeToDismissKt {
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SwipeToDismiss(@org.jetbrains.annotations.NotNull final androidx.compose.material.DismissState r15, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r16, @org.jetbrains.annotations.Nullable java.util.Set<? extends androidx.compose.material.DismissDirection> r17, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss(androidx.compose.material.DismissState, androidx.compose.ui.Modifier, java.util.Set, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r4 == r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.material.DismissDirection getDismissDirection(androidx.compose.material.DismissValue r3, androidx.compose.material.DismissValue r4) {
        /*
            r0 = 0
            r5 = r0
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L13
            r0 = r3
            androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.Default
            if (r0 != r1) goto L13
            r0 = r5
            r6 = r0
            goto L82
        L13:
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L26
            r0 = r3
            androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.DismissedToEnd
            if (r0 != r1) goto L26
        L1f:
            androidx.compose.material.DismissDirection r0 = androidx.compose.material.DismissDirection.StartToEnd
            r6 = r0
            goto L82
        L26:
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L39
            r0 = r3
            androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.DismissedToStart
            if (r0 != r1) goto L39
        L32:
            androidx.compose.material.DismissDirection r0 = androidx.compose.material.DismissDirection.EndToStart
            r6 = r0
            goto L82
        L39:
            androidx.compose.material.DismissValue r0 = androidx.compose.material.DismissValue.Default
            r7 = r0
            r0 = r3
            r1 = r7
            if (r0 != r1) goto L4e
            r0 = r4
            androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.DismissedToEnd
            if (r0 != r1) goto L4e
            goto L1f
        L4e:
            r0 = r3
            r1 = r7
            if (r0 != r1) goto L5e
            r0 = r4
            androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.DismissedToStart
            if (r0 != r1) goto L5e
            goto L32
        L5e:
            r0 = r3
            androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.DismissedToEnd
            if (r0 != r1) goto L6e
            r0 = r4
            r1 = r7
            if (r0 != r1) goto L6e
            goto L1f
        L6e:
            r0 = r5
            r6 = r0
            r0 = r3
            androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.DismissedToStart
            if (r0 != r1) goto L82
            r0 = r5
            r6 = r0
            r0 = r4
            r1 = r7
            if (r0 != r1) goto L82
            goto L32
        L82:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt.getDismissDirection(androidx.compose.material.DismissValue, androidx.compose.material.DismissValue):androidx.compose.material.DismissDirection");
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final DismissState rememberDismissState(@Nullable DismissValue dismissValue, @Nullable Function1<? super DismissValue, Boolean> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1491560617);
        if ((i3 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i3 & 2) != 0) {
            function1 = new Function1<DismissValue, Boolean>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DismissValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        final DismissValue dismissValue2 = dismissValue;
        final Function1<? super DismissValue, Boolean> function12 = function1;
        DismissState dismissState = (DismissState) RememberSaveableKt.m2016rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) DismissState.Companion.Saver(function1), (String) null, (Function0<? extends Object>) new Function0<DismissState>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DismissState invoke() {
                return new DismissState(DismissValue.this, function12);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return dismissState;
    }
}
