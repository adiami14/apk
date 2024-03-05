package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��B\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a3\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a;\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a3\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a9\u00100\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b9\u00107\u001aA\u0010:\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001a9\u0010=\u001a\u00020\u001f*\u0002012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b@\u0010A\u001a)\u0010B\u001a\u00020\u001f*\u0002012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bC\u0010D\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u0013\u0010\u0012\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0013\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_PROGRESS, "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "backgroundColor", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ProgressIndicatorKt.class */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1452getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m4785constructorimpl(240);
    private static final float CircularIndicatorDiameter = Dp.m4785constructorimpl(40);
    @NotNull
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    @NotNull
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    @NotNull
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    @NotNull
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    @NotNull
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-MBs18nI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1454CircularProgressIndicatorMBs18nI(final float r11, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r12, long r13, float r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1454CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    /* renamed from: CircularProgressIndicator-aM-cp0Q  reason: not valid java name */
    public static final void m1455CircularProgressIndicatoraMcp0Q(@Nullable Modifier modifier, long j2, float f2, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        long j3;
        Composer startRestartGroup = composer.startRestartGroup(1769711363);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i5 = i4 | 384;
        } else {
            i5 = i4;
            if ((i2 & 896) == 0) {
                i5 = i4 | (startRestartGroup.changed(f2) ? 256 : 128);
            }
        }
        if (((i5 & 731) ^ 146) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    modifier = Modifier.Companion;
                }
                if ((i3 & 2) != 0) {
                    j2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1228getPrimary0d7_KjU();
                }
                modifier2 = modifier;
                j3 = j2;
                if (i7 != 0) {
                    f2 = ProgressIndicatorDefaults.INSTANCE.m1452getStrokeWidthD9Ej5fM();
                    startRestartGroup.endDefaults();
                    final Stroke stroke = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo524toPx0680j_4(f2), 0.0f, StrokeCap.Companion.m2713getSquareKaPHkGw(), 0, null, 26, null);
                    InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                    TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    InfiniteRepeatableSpec m236infiniteRepeatable9IiC70o$default = AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i8 = InfiniteTransition.$stable;
                    int i9 = InfiniteRepeatableSpec.$stable;
                    final State animateValue = InfiniteTransitionKt.animateValue(rememberInfiniteTransition, 0, 5, vectorConverter, m236infiniteRepeatable9IiC70o$default, startRestartGroup, i8 | 4528 | (i9 << 12));
                    final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, i8 | 432 | (i9 << 9));
                    final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                            CubicBezierEasing cubicBezierEasing;
                            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                            keyframes.setDurationMillis(1332);
                            KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
                            cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                            keyframes.with(at, cubicBezierEasing);
                            keyframes.at(Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), startRestartGroup, i8 | 432 | (i9 << 9));
                    final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                            CubicBezierEasing cubicBezierEasing;
                            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                            keyframes.setDurationMillis(1332);
                            KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 666);
                            cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                            keyframes.with(at, cubicBezierEasing);
                            keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                        }
                    }), null, 0L, 6, null), startRestartGroup, i8 | 432 | (i9 << 9));
                    final float f3 = f2;
                    final long j4 = j2;
                    CanvasKt.Canvas(SizeKt.m726size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            int m1458CircularProgressIndicator_aM_cp0Q$lambda8;
                            float m1456CircularProgressIndicator_aM_cp0Q$lambda10;
                            float m1457CircularProgressIndicator_aM_cp0Q$lambda11;
                            float m1459CircularProgressIndicator_aM_cp0Q$lambda9;
                            float m1457CircularProgressIndicator_aM_cp0Q$lambda112;
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            m1458CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m1458CircularProgressIndicator_aM_cp0Q$lambda8(animateValue);
                            float f4 = m1458CircularProgressIndicator_aM_cp0Q$lambda8;
                            m1456CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m1456CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat2);
                            m1457CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m1457CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                            float abs = Math.abs(m1456CircularProgressIndicator_aM_cp0Q$lambda10 - m1457CircularProgressIndicator_aM_cp0Q$lambda11);
                            m1459CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m1459CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat);
                            m1457CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m1457CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                            ProgressIndicatorKt.m1480drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1457CircularProgressIndicator_aM_cp0Q$lambda112 + (((f4 * 216.0f) % 360.0f) - 90.0f) + m1459CircularProgressIndicator_aM_cp0Q$lambda9, f3, abs, j4, stroke);
                        }
                    }, startRestartGroup, 0);
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                j3 = j2;
                modifier2 = modifier;
            }
            modifier = modifier2;
            j2 = j3;
            startRestartGroup.endDefaults();
            final Stroke stroke2 = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo524toPx0680j_4(f2), 0.0f, StrokeCap.Companion.m2713getSquareKaPHkGw(), 0, null, 26, null);
            InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            InfiniteRepeatableSpec m236infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i82 = InfiniteTransition.$stable;
            int i92 = InfiniteRepeatableSpec.$stable;
            final State<Integer> animateValue2 = InfiniteTransitionKt.animateValue(rememberInfiniteTransition2, 0, 5, vectorConverter2, m236infiniteRepeatable9IiC70o$default2, startRestartGroup, i82 | 4528 | (i92 << 12));
            final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, i82 | 432 | (i92 << 9));
            final State<Float> animateFloat22 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1332);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
                    cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(290.0f), 666);
                }
            }), null, 0L, 6, null), startRestartGroup, i82 | 432 | (i92 << 9));
            final State<Float> animateFloat32 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1332);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 666);
                    cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                }
            }), null, 0L, 6, null), startRestartGroup, i82 | 432 | (i92 << 9));
            final float f32 = f2;
            final long j42 = j2;
            CanvasKt.Canvas(SizeKt.m726size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope Canvas) {
                    int m1458CircularProgressIndicator_aM_cp0Q$lambda8;
                    float m1456CircularProgressIndicator_aM_cp0Q$lambda10;
                    float m1457CircularProgressIndicator_aM_cp0Q$lambda11;
                    float m1459CircularProgressIndicator_aM_cp0Q$lambda9;
                    float m1457CircularProgressIndicator_aM_cp0Q$lambda112;
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    m1458CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m1458CircularProgressIndicator_aM_cp0Q$lambda8(animateValue2);
                    float f4 = m1458CircularProgressIndicator_aM_cp0Q$lambda8;
                    m1456CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m1456CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat22);
                    m1457CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m1457CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                    float abs = Math.abs(m1456CircularProgressIndicator_aM_cp0Q$lambda10 - m1457CircularProgressIndicator_aM_cp0Q$lambda11);
                    m1459CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m1459CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat4);
                    m1457CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m1457CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                    ProgressIndicatorKt.m1480drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1457CircularProgressIndicator_aM_cp0Q$lambda112 + (((f4 * 216.0f) % 360.0f) - 90.0f) + m1459CircularProgressIndicator_aM_cp0Q$lambda9, f32, abs, j42, stroke2);
                }
            }, startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier;
        final long j5 = j2;
        final float f4 = f2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i10) {
                ProgressIndicatorKt.m1455CircularProgressIndicatoraMcp0Q(Modifier.this, j5, f4, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-10  reason: not valid java name */
    public static final float m1456CircularProgressIndicator_aM_cp0Q$lambda10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-11  reason: not valid java name */
    public static final float m1457CircularProgressIndicator_aM_cp0Q$lambda11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-8  reason: not valid java name */
    public static final int m1458CircularProgressIndicator_aM_cp0Q$lambda8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-9  reason: not valid java name */
    public static final float m1459CircularProgressIndicator_aM_cp0Q$lambda9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x027b, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L48;
     */
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-RIQooxk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1460LinearProgressIndicatorRIQooxk(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r11, long r12, long r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1460LinearProgressIndicatorRIQooxk(androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0203, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-eaDK9VM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1461LinearProgressIndicatoreaDK9VM(final float r12, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r13, long r14, long r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1461LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-1  reason: not valid java name */
    public static final float m1462LinearProgressIndicator_RIQooxk$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-2  reason: not valid java name */
    public static final float m1463LinearProgressIndicator_RIQooxk$lambda2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-3  reason: not valid java name */
    public static final float m1464LinearProgressIndicator_RIQooxk$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-4  reason: not valid java name */
    public static final float m1465LinearProgressIndicator_RIQooxk$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: drawCircularIndicator-42QJj7c  reason: not valid java name */
    private static final void m1478drawCircularIndicator42QJj7c(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        float f4 = 2;
        float width = stroke.getWidth() / f4;
        float m2239getWidthimpl = Size.m2239getWidthimpl(drawScope.mo2841getSizeNHjbRc()) - (f4 * width);
        DrawScope.DefaultImpls.m2877drawArcyD3GUKo$default(drawScope, j2, f2, f3, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(m2239getWidthimpl, m2239getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c  reason: not valid java name */
    public static final void m1479drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        m1478drawCircularIndicator42QJj7c(drawScope, f2, f3, j2, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI  reason: not valid java name */
    public static final void m1480drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f2, float f3, float f4, long j2, Stroke stroke) {
        m1478drawCircularIndicator42QJj7c(drawScope, f2 + (((f3 / Dp.m4785constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f4, 0.1f), j2, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-42QJj7c  reason: not valid java name */
    public static final void m1481drawLinearIndicator42QJj7c(DrawScope drawScope, float f2, float f3, long j2, float f4) {
        float m2239getWidthimpl = Size.m2239getWidthimpl(drawScope.mo2841getSizeNHjbRc());
        float m2236getHeightimpl = Size.m2236getHeightimpl(drawScope.mo2841getSizeNHjbRc()) / 2;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f5 = z ? f2 : 1.0f - f3;
        if (!z) {
            f3 = 1.0f - f2;
        }
        DrawScope.DefaultImpls.m2885drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(f5 * m2239getWidthimpl, m2236getHeightimpl), OffsetKt.Offset(f3 * m2239getWidthimpl, m2236getHeightimpl), f4, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-bw27NRU  reason: not valid java name */
    public static final void m1482drawLinearIndicatorBackgroundbw27NRU(DrawScope drawScope, long j2, float f2) {
        m1481drawLinearIndicator42QJj7c(drawScope, 0.0f, 1.0f, j2, f2);
    }
}
