package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��b\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\u001a\u008c\u0001\u0010��\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0005H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u0003H\u0007¢\u0006\u0002\u0010%\u001a,\u0010&\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010'\u001a\u00020#2\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0)H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"ModalBottomSheetLayout", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "ModalBottomSheetLayout-BzaUkTc", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "color", "onDismiss", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "bottomSheetSwipeable", "fullHeight", "sheetHeightState", "Landroidx/compose/runtime/State;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ModalBottomSheetKt.class */
public final class ModalBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: ModalBottomSheetLayout-BzaUkTc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1406ModalBottomSheetLayoutBzaUkTc(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r23, @org.jetbrains.annotations.Nullable androidx.compose.material.ModalBottomSheetState r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r25, float r26, long r27, long r29, long r31, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m1406ModalBottomSheetLayoutBzaUkTc(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
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
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1407Scrim3JVO9M(final long r9, final kotlin.jvm.functions.Function0<kotlin.Unit> r11, final boolean r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m1407Scrim3JVO9M(long, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim_3J_VO9M$lambda-0  reason: not valid java name */
    public static final float m1408Scrim_3J_VO9M$lambda0(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier bottomSheetSwipeable(Modifier modifier, ModalBottomSheetState modalBottomSheetState, float f2, State<Float> state) {
        Modifier.Companion companion;
        Map mapOf;
        Map map;
        Map mapOf2;
        Float value = state.getValue();
        if (value != null) {
            float floatValue = value.floatValue();
            float f3 = f2 / 2;
            if (floatValue < f3) {
                mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.to(Float.valueOf(f2), ModalBottomSheetValue.Hidden), TuplesKt.to(Float.valueOf(f2 - value.floatValue()), ModalBottomSheetValue.Expanded));
                map = mapOf2;
            } else {
                mapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(Float.valueOf(f2), ModalBottomSheetValue.Hidden), TuplesKt.to(Float.valueOf(f3), ModalBottomSheetValue.HalfExpanded), TuplesKt.to(Float.valueOf(Math.max(0.0f, f2 - value.floatValue())), ModalBottomSheetValue.Expanded));
                map = mapOf;
            }
            companion = SwipeableKt.m1543swipeablepPrIpRY$default(Modifier.Companion, modalBottomSheetState, map, Orientation.Vertical, modalBottomSheetState.getCurrentValue() != ModalBottomSheetValue.Hidden, false, null, null, null, 0.0f, 368, null);
        } else {
            companion = Modifier.Companion;
        }
        return modifier.then(companion);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull final ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super ModalBottomSheetValue, Boolean> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(170040195);
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        final Function1<? super ModalBottomSheetValue, Boolean> function12 = function1;
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m2016rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) ModalBottomSheetState.Companion.Saver(animationSpec, function1), (String) null, (Function0<? extends Object>) new Function0<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModalBottomSheetState invoke() {
                return new ModalBottomSheetState(ModalBottomSheetValue.this, animationSpec2, function12);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }
}
