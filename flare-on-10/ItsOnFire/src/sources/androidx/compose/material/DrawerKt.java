package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��p\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0096\u0001\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\rH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0006\u0010#\u001a\u00020\u0014H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0096\u0001\u0010&\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020'2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\rH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001aA\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010!\u001a\u00020\u0019H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a \u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002H\u0002\u001a+\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00140\u000bH\u0007¢\u0006\u0002\u00108\u001a+\u00109\u001a\u00020'2\u0006\u00105\u001a\u00020:2\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00140\u000bH\u0007¢\u0006\u0002\u0010;\"\u0014\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n��\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BottomDrawerOpenFraction", "DrawerVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "EndDrawerPadding", "BottomDrawer", "", "drawerContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerState", "Landroidx/compose/material/BottomDrawerState;", "gesturesEnabled", "", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "scrimColor", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawerScrim", "color", "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ModalDrawer", "Landroidx/compose/material/DrawerState;", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberBottomDrawerState", "initialValue", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "rememberDrawerState", "Landroidx/compose/material/DrawerValue;", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/DrawerKt.class */
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float EndDrawerPadding = Dp.m4785constructorimpl(56);
    private static final float DrawerVelocityThreshold = Dp.m4785constructorimpl(400);
    @NotNull
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0236  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BottomDrawer-Gs3lGvM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1307BottomDrawerGs3lGvM(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r20, @org.jetbrains.annotations.Nullable androidx.compose.material.BottomDrawerState r21, boolean r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r23, float r24, long r25, long r27, long r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1307BottomDrawerGs3lGvM(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0140, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a7, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0237, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.Composable
    /* renamed from: BottomDrawerScrim-3J-VO9M  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1308BottomDrawerScrim3JVO9M(final long r9, final kotlin.jvm.functions.Function0<kotlin.Unit> r11, final boolean r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1308BottomDrawerScrim3JVO9M(long, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomDrawerScrim_3J_VO9M$lambda-0  reason: not valid java name */
    public static final float m1309BottomDrawerScrim_3J_VO9M$lambda0(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    @androidx.compose.runtime.Composable
    /* renamed from: ModalDrawer-Gs3lGvM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1310ModalDrawerGs3lGvM(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r20, @org.jetbrains.annotations.Nullable androidx.compose.material.DrawerState r21, boolean r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r23, float r24, long r25, long r27, long r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1310ModalDrawerGs3lGvM(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012b, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0192, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0221, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.Composable
    /* renamed from: Scrim-Bx497Mc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1311ScrimBx497Mc(final boolean r10, final kotlin.jvm.functions.Function0<kotlin.Unit> r11, final kotlin.jvm.functions.Function0<java.lang.Float> r12, final long r13, androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1311ScrimBx497Mc(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, long, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f2, float f3, float f4) {
        float coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn((f4 - f2) / (f3 - f2), 0.0f, 1.0f);
        return coerceIn;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomDrawerState rememberBottomDrawerState(@NotNull final BottomDrawerValue initialValue, @Nullable Function1<? super BottomDrawerValue, Boolean> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1588068481);
        if ((i3 & 2) != 0) {
            function1 = new Function1<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BottomDrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        final Function1<? super BottomDrawerValue, Boolean> function12 = function1;
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m2016rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) BottomDrawerState.Companion.Saver(function1), (String) null, (Function0<? extends Object>) new Function0<BottomDrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BottomDrawerState invoke() {
                return new BottomDrawerState(BottomDrawerValue.this, function12);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull final DrawerValue initialValue, @Nullable Function1<? super DrawerValue, Boolean> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1540949526);
        if ((i3 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        final Function1<? super DrawerValue, Boolean> function12 = function1;
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m2016rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) DrawerState.Companion.Saver(function1), (String) null, (Function0<? extends Object>) new Function0<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DrawerState invoke() {
                return new DrawerState(DrawerValue.this, function12);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return drawerState;
    }
}
