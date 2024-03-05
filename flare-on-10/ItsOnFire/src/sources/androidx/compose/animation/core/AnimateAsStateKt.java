package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import l.n;
import l.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��^\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aM\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u001d\u001aC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u001f\u001aK\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001aK\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b$\u0010\"\u001aK\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b&\u0010\"\u001aC\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010(\u001aK\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b*\u0010\"\u001as\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0\u0012\"\u0004\b��\u0010,\"\b\b\u0001\u0010-*\u00020.2\u0006\u0010\u0013\u001a\u0002H,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H-002\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H,0\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u0001H,2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00101\"\u0014\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "", "dpDefaultSpring", "Landroidx/compose/ui/unit/Dp;", "intDefaultSpring", "", "intOffsetDefaultSpring", "Landroidx/compose/ui/unit/IntOffset;", "intSizeDefaultSpring", "Landroidx/compose/ui/unit/IntSize;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Offset;", "rectDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "sizeDefaultSpring", "Landroidx/compose/ui/geometry/Size;", "animateDpAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloatAsState", "visibilityThreshold", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState", "animateIntOffsetAsState-8f6pmRE", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntSizeAsState", "animateIntSizeAsState-zTRF_AQ", "animateOffsetAsState", "animateOffsetAsState-N6fFfp4", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "animateSizeAsState-LjSzlW0", "animateValueAsState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/AnimateAsStateKt.class */
public final class AnimateAsStateKt {
    @NotNull
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    @NotNull
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m4783boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
    @NotNull
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2227boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
    @NotNull
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2156boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
    @NotNull
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
    @NotNull
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 3, null);
    @NotNull
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    @NotNull
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    @Composable
    @NotNull
    /* renamed from: animateDpAsState-Kz89ssw  reason: not valid java name */
    public static final State<Dp> m222animateDpAsStateKz89ssw(float f2, @Nullable AnimationSpec<Dp> animationSpec, @Nullable Function1<? super Dp, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1364859110);
        if ((i3 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Dp> animateValueAsState = animateValueAsState(Dp.m4783boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L17;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState(float r10, @org.jetbrains.annotations.Nullable androidx.compose.animation.core.AnimationSpec<java.lang.Float> r11, float r12, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r13, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, int r15, int r16) {
        /*
            r0 = r14
            r1 = 841393235(0x3226a453, float:9.699835E-9)
            r0.startReplaceableGroup(r1)
            r0 = r16
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L14
            androidx.compose.animation.core.SpringSpec<java.lang.Float> r0 = androidx.compose.animation.core.AnimateAsStateKt.defaultAnimation
            r11 = r0
        L14:
            r0 = r16
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L1e
            r0 = 1008981770(0x3c23d70a, float:0.01)
            r12 = r0
        L1e:
            r0 = r16
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = 0
            r13 = r0
            goto L2b
        L2b:
            r0 = r14
            r1 = 841393485(0x3226a54d, float:9.700057E-9)
            r0.startReplaceableGroup(r1)
            r0 = r11
            r17 = r0
            r0 = r11
            androidx.compose.animation.core.SpringSpec<java.lang.Float> r1 = androidx.compose.animation.core.AnimateAsStateKt.defaultAnimation
            if (r0 != r1) goto L91
            r0 = r14
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r14
            r1 = r12
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            boolean r0 = r0.changed(r1)
            r18 = r0
            r0 = r14
            java.lang.Object r0 = r0.rememberedValue()
            r17 = r0
            r0 = r18
            if (r0 != 0) goto L70
            r0 = r17
            r11 = r0
            r0 = r17
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L84
        L70:
            r0 = 0
            r1 = 0
            r2 = r12
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = 3
            r4 = 0
            androidx.compose.animation.core.SpringSpec r0 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r0, r1, r2, r3, r4)
            r11 = r0
            r0 = r14
            r1 = r11
            r0.updateRememberedValue(r1)
        L84:
            r0 = r14
            r0.endReplaceableGroup()
            r0 = r11
            androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
            r17 = r0
        L91:
            r0 = r14
            r0.endReplaceableGroup()
            kotlin.jvm.internal.FloatCompanionObject r0 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r0 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(r0)
            r11 = r0
            r0 = r15
            r1 = 3
            int r0 = r0 << r1
            r16 = r0
            r0 = r10
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = r11
            r2 = r17
            r3 = r12
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = 14
            r6 = r6 & r7
            r7 = r16
            r8 = 7168(0x1c00, float:1.0045E-41)
            r7 = r7 & r8
            r6 = r6 | r7
            r7 = r16
            r8 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r8
            r6 = r6 | r7
            r7 = 0
            androidx.compose.runtime.State r0 = animateValueAsState(r0, r1, r2, r3, r4, r5, r6, r7)
            r11 = r0
            r0 = r14
            r0.endReplaceableGroup()
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(float, androidx.compose.animation.core.AnimationSpec, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    @Composable
    @NotNull
    public static final State<Integer> animateIntAsState(int i2, @Nullable AnimationSpec<Integer> animationSpec, @Nullable Function1<? super Integer, Unit> function1, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-887370562);
        if ((i4 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        if ((i4 & 4) != 0) {
            function1 = null;
        }
        State<Integer> animateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec, null, function1, composer, (i3 & 14) | ((i3 << 3) & 896) | (57344 & (i3 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    /* renamed from: animateIntOffsetAsState-8f6pmRE  reason: not valid java name */
    public static final State<IntOffset> m223animateIntOffsetAsState8f6pmRE(long j2, @Nullable AnimationSpec<IntOffset> animationSpec, @Nullable Function1<? super IntOffset, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1370676387);
        if ((i3 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<IntOffset> animateValueAsState = animateValueAsState(IntOffset.m4898boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    /* renamed from: animateIntSizeAsState-zTRF_AQ  reason: not valid java name */
    public static final State<IntSize> m224animateIntSizeAsStatezTRF_AQ(long j2, @Nullable AnimationSpec<IntSize> animationSpec, @Nullable Function1<? super IntSize, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1724517475);
        if ((i3 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<IntSize> animateValueAsState = animateValueAsState(IntSize.m4943boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    /* renamed from: animateOffsetAsState-N6fFfp4  reason: not valid java name */
    public static final State<Offset> m225animateOffsetAsStateN6fFfp4(long j2, @Nullable AnimationSpec<Offset> animationSpec, @Nullable Function1<? super Offset, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-200212809);
        if ((i3 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Offset> animateValueAsState = animateValueAsState(Offset.m2156boximpl(j2), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Rect> animateRectAsState(@NotNull Rect targetValue, @Nullable AnimationSpec<Rect> animationSpec, @Nullable Function1<? super Rect, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        composer.startReplaceableGroup(231660788);
        if ((i3 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Rect> animateValueAsState = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    /* renamed from: animateSizeAsState-LjSzlW0  reason: not valid java name */
    public static final State<Size> m226animateSizeAsStateLjSzlW0(long j2, @Nullable AnimationSpec<Size> animationSpec, @Nullable Function1<? super Size, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1414928158);
        if ((i3 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Size> animateValueAsState = animateValueAsState(Size.m2227boximpl(j2), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T t2, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable AnimationSpec<T> animationSpec, @Nullable T t3, @Nullable Function1<? super T, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        composer.startReplaceableGroup(1824613323);
        if ((i3 & 4) != 0) {
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            SpringSpec springSpec = rememberedValue;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                springSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, t3, 3, null);
                composer.updateRememberedValue(springSpec);
            }
            composer.endReplaceableGroup();
            animationSpec = (AnimationSpec) springSpec;
        }
        Function1<? super T, Unit> function12 = (i3 & 16) != 0 ? null : function1;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Animatable animatable = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Animatable animatable2 = new Animatable(t2, typeConverter, null, 4, null);
            animatable = animatable2;
            composer.updateRememberedValue(animatable2);
        }
        composer.endReplaceableGroup();
        Animatable animatable3 = (Animatable) animatable;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function12, composer, (i2 >> 12) & 14);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpec, composer, (i2 >> 6) & 14);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        n nVar = rememberedValue3;
        if (rememberedValue3 == companion.getEmpty()) {
            nVar = q.d(-1, null, null, 6, null);
            composer.updateRememberedValue(nVar);
        }
        composer.endReplaceableGroup();
        final n nVar2 = (n) nVar;
        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                nVar2.T(t2);
            }
        }, composer, 0);
        EffectsKt.LaunchedEffect(nVar2, new AnimateAsStateKt$animateValueAsState$3(nVar2, animatable3, rememberUpdatedState2, rememberUpdatedState, null), composer, 8);
        State<T> asState = animatable3.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateValueAsState$lambda-3  reason: not valid java name */
    public static final <T> Function1<T, Unit> m227animateValueAsState$lambda3(State<? extends Function1<? super T, Unit>> state) {
        return (Function1) ((Function1<? super T, Unit>) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateValueAsState$lambda-4  reason: not valid java name */
    public static final <T> AnimationSpec<T> m228animateValueAsState$lambda4(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }
}
