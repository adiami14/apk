package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\\\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a?\u0010!\u001a\u00020\u0014*\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010\u001c\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a1\u0010'\u001a\u00020\u0014*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b-\u0010.\"\u0014\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\t\u001a\u00020\u0004X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\n\u0010\u000b\"\u0013\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u000f\u001a\u00020\u0004X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0010\u0010\u000b\"\u0019\u0010\u0011\u001a\u00020\u0004X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SwitchKt.class */
public final class SwitchKt {
    @NotNull
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    static {
        float m4785constructorimpl = Dp.m4785constructorimpl(34);
        TrackWidth = m4785constructorimpl;
        TrackStrokeWidth = Dp.m4785constructorimpl(14);
        float m4785constructorimpl2 = Dp.m4785constructorimpl(20);
        ThumbDiameter = m4785constructorimpl2;
        ThumbRippleRadius = Dp.m4785constructorimpl(24);
        DefaultSwitchPadding = Dp.m4785constructorimpl(2);
        SwitchWidth = m4785constructorimpl;
        SwitchHeight = m4785constructorimpl2;
        ThumbPathLength = Dp.m4785constructorimpl(m4785constructorimpl - m4785constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m4785constructorimpl(1);
        ThumbPressedElevation = Dp.m4785constructorimpl(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bb  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Switch(final boolean r24, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, boolean r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r28, @org.jetbrains.annotations.Nullable androidx.compose.material.SwitchColors r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 1391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ac, code lost:
        if (r0 == r0.getEmpty()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026e, code lost:
        if (r0 == r0.getEmpty()) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0356, code lost:
        if (r0 == r0.getEmpty()) goto L77;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SwitchImpl(final androidx.compose.foundation.layout.BoxScope r11, final boolean r12, final boolean r13, final androidx.compose.material.SwitchColors r14, final androidx.compose.runtime.State<java.lang.Float> r15, final androidx.compose.foundation.interaction.InteractionSource r16, androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.SwitchImpl(androidx.compose.foundation.layout.BoxScope, boolean, boolean, androidx.compose.material.SwitchColors, androidx.compose.runtime.State, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchImpl$lambda-5  reason: not valid java name */
    public static final long m1554SwitchImpl$lambda5(State<Color> state) {
        return state.getValue().m2424unboximpl();
    }

    /* renamed from: SwitchImpl$lambda-7  reason: not valid java name */
    private static final long m1555SwitchImpl$lambda7(State<Color> state) {
        return state.getValue().m2424unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk  reason: not valid java name */
    public static final void m1558drawTrackRPmYEkk(DrawScope drawScope, long j2, float f2, float f3) {
        float f4 = f3 / 2;
        DrawScope.DefaultImpls.m2885drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(f4, Offset.m2168getYimpl(drawScope.mo2840getCenterF1C5BW0())), OffsetKt.Offset(f2 - f4, Offset.m2168getYimpl(drawScope.mo2840getCenterF1C5BW0())), f3, StrokeCap.Companion.m2712getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }
}
