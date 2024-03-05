package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
@Metadata(d1 = {"��h\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u001c\u001aM\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010!\u001a9\u0010\"\u001a\u00020\f*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aA\u0010,\u001a\u00020\f*\u00020#2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\b\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\t\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\n\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxRippleRadius", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/CheckboxKt.class */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m4785constructorimpl(24);
    private static final float CheckboxSize = Dp.m4785constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/material/CheckboxKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f2 = 2;
        CheckboxDefaultPadding = Dp.m4785constructorimpl(f2);
        StrokeWidth = Dp.m4785constructorimpl(f2);
        RadiusSize = Dp.m4785constructorimpl(f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ee, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Checkbox(final boolean r15, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, boolean r18, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r19, @org.jetbrains.annotations.Nullable androidx.compose.material.CheckboxColors r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.Checkbox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03f0, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039a A[LOOP:0: B:82:0x0393->B:84:0x039a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e4  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckboxImpl(final boolean r9, final androidx.compose.ui.state.ToggleableState r10, final androidx.compose.ui.Modifier r11, final androidx.compose.material.CheckboxColors r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-10  reason: not valid java name */
    public static final long m1202CheckboxImpl$lambda10(State<Color> state) {
        return state.getValue().m2424unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-4  reason: not valid java name */
    public static final float m1203CheckboxImpl$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-6  reason: not valid java name */
    public static final float m1204CheckboxImpl$lambda6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-8  reason: not valid java name */
    public static final long m1205CheckboxImpl$lambda8(State<Color> state) {
        return state.getValue().m2424unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CheckboxImpl$lambda-9  reason: not valid java name */
    public static final long m1206CheckboxImpl$lambda9(State<Color> state) {
        return state.getValue().m2424unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c4  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TriStateCheckbox(@org.jetbrains.annotations.NotNull final androidx.compose.ui.state.ToggleableState r15, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, boolean r18, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r19, @org.jetbrains.annotations.Nullable androidx.compose.material.CheckboxColors r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs  reason: not valid java name */
    public static final void m1214drawBox1wkBAMs(DrawScope drawScope, long j2, long j3, float f2, float f3) {
        float f4 = f3 / 2.0f;
        Stroke stroke = new Stroke(f3, 0.0f, 0, 0, null, 30, null);
        float m2239getWidthimpl = Size.m2239getWidthimpl(drawScope.mo2841getSizeNHjbRc());
        if (Color.m2415equalsimpl0(j2, j3)) {
            DrawScope.DefaultImpls.m2895drawRoundRectuAw5IA$default(drawScope, j2, 0L, SizeKt.Size(m2239getWidthimpl, m2239getWidthimpl), CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float f5 = m2239getWidthimpl - (2 * f3);
        DrawScope.DefaultImpls.m2895drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(f3, f3), SizeKt.Size(f5, f5), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f2 - f3), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        long Offset = OffsetKt.Offset(f4, f4);
        float f6 = m2239getWidthimpl - f3;
        DrawScope.DefaultImpls.m2895drawRoundRectuAw5IA$default(drawScope, j3, Offset, SizeKt.Size(f6, f6), CornerRadiusKt.CornerRadius$default(f2 - f4, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak  reason: not valid java name */
    public static final void m1215drawCheck3IgeMak(DrawScope drawScope, long j2, float f2, float f3, float f4, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f4, 0.0f, StrokeCap.Companion.m2713getSquareKaPHkGw(), 0, null, 26, null);
        float m2239getWidthimpl = Size.m2239getWidthimpl(drawScope.mo2841getSizeNHjbRc());
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f3);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f3);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f3);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f3);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * m2239getWidthimpl, lerp3 * m2239getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(lerp * m2239getWidthimpl, lerp2 * m2239getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * m2239getWidthimpl, m2239getWidthimpl * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f2, checkDrawingCache.getPathToDraw(), true);
        DrawScope.DefaultImpls.m2889drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j2, 0.0f, stroke, null, 0, 52, null);
    }
}
