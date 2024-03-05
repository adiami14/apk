package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018��2\u00020\u00012\u00020\u00022\u00020\u0003BX\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\u0010\u0015J\u001d\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u001d\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b1\u0010(J\b\u00102\u001a\u000203H\u0016J\f\u00104\u001a\u00020\u0013*\u000205H\u0016J\u0019\u00106\u001a\u00020\u0007*\u00020%H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u0007*\u00020%H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b:\u00108J\u001c\u0010;\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-H\u0016J\u001c\u0010@\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010A\u001a\u00020-H\u0016J)\u0010B\u001a\u00020C*\u00020D2\u0006\u0010=\u001a\u00020E2\u0006\u00100\u001a\u00020/H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bF\u0010GJ\u001c\u0010H\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-H\u0016J\u001c\u0010I\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010A\u001a\u00020-H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/ui/draw/PainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/functions/Function1;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getAlpha", "()F", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getSizeToIntrinsics", "()Z", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "equals", "other", "", "hashCode", "", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/draw/PainterModifier.class */
final class PainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {
    @NotNull
    private final Alignment alignment;
    private final float alpha;
    @Nullable
    private final ColorFilter colorFilter;
    @NotNull
    private final ContentScale contentScale;
    @NotNull
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifier(@NotNull Painter painter, boolean z, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f2, @Nullable ColorFilter colorFilter, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f2;
        this.colorFilter = colorFilter;
    }

    public /* synthetic */ PainterModifier(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i2 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i2 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i2 & 16) != 0 ? 1.0f : f2, (i2 & 32) != 0 ? null : colorFilter, function1);
    }

    /* renamed from: calculateScaledSize-E7KxVPU  reason: not valid java name */
    private final long m2080calculateScaledSizeE7KxVPU(long j2) {
        if (getUseIntrinsicSize()) {
            long Size = SizeKt.Size(!m2082hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo2940getIntrinsicSizeNHjbRc()) ? Size.m2239getWidthimpl(j2) : Size.m2239getWidthimpl(this.painter.mo2940getIntrinsicSizeNHjbRc()), !m2081hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo2940getIntrinsicSizeNHjbRc()) ? Size.m2236getHeightimpl(j2) : Size.m2236getHeightimpl(this.painter.mo2940getIntrinsicSizeNHjbRc()));
            if (!(Size.m2239getWidthimpl(j2) == 0.0f)) {
                if (!(Size.m2236getHeightimpl(j2) == 0.0f)) {
                    j2 = ScaleFactorKt.m4002timesUQTWf7w(Size, this.contentScale.mo3900computeScaleFactorH7hwNQA(Size, j2));
                }
            }
            j2 = Size.Companion.m2248getZeroNHjbRc();
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r5.painter.mo2940getIntrinsicSizeNHjbRc() != androidx.compose.ui.geometry.Size.Companion.m2247getUnspecifiedNHjbRc()) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean getUseIntrinsicSize() {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.sizeToIntrinsics
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L2a
            r0 = r5
            androidx.compose.ui.graphics.painter.Painter r0 = r0.painter
            long r0 = r0.mo2940getIntrinsicSizeNHjbRc()
            androidx.compose.ui.geometry.Size$Companion r1 = androidx.compose.ui.geometry.Size.Companion
            long r1 = r1.m2247getUnspecifiedNHjbRc()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L21
            r0 = 1
            r8 = r0
            goto L23
        L21:
            r0 = 0
            r8 = r0
        L23:
            r0 = r8
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r0 = 0
            r7 = r0
        L2c:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.PainterModifier.getUseIntrinsicSize():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (((java.lang.Float.isInfinite(r0) || java.lang.Float.isNaN(r0)) ? false : true) != false) goto L10;
     */
    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m2081hasSpecifiedAndFiniteHeightuvyYCjk(long r6) {
        /*
            r5 = this;
            r0 = r6
            androidx.compose.ui.geometry.Size$Companion r1 = androidx.compose.ui.geometry.Size.Companion
            long r1 = r1.m2247getUnspecifiedNHjbRc()
            boolean r0 = androidx.compose.ui.geometry.Size.m2235equalsimpl0(r0, r1)
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L39
            r0 = r6
            float r0 = androidx.compose.ui.geometry.Size.m2236getHeightimpl(r0)
            r10 = r0
            r0 = r10
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L2e
            r0 = r10
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2e
            r0 = 1
            r11 = r0
            goto L31
        L2e:
            r0 = 0
            r11 = r0
        L31:
            r0 = r11
            if (r0 == 0) goto L39
            goto L3c
        L39:
            r0 = 0
            r9 = r0
        L3c:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.PainterModifier.m2081hasSpecifiedAndFiniteHeightuvyYCjk(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (((java.lang.Float.isInfinite(r0) || java.lang.Float.isNaN(r0)) ? false : true) != false) goto L10;
     */
    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m2082hasSpecifiedAndFiniteWidthuvyYCjk(long r6) {
        /*
            r5 = this;
            r0 = r6
            androidx.compose.ui.geometry.Size$Companion r1 = androidx.compose.ui.geometry.Size.Companion
            long r1 = r1.m2247getUnspecifiedNHjbRc()
            boolean r0 = androidx.compose.ui.geometry.Size.m2235equalsimpl0(r0, r1)
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L39
            r0 = r6
            float r0 = androidx.compose.ui.geometry.Size.m2239getWidthimpl(r0)
            r10 = r0
            r0 = r10
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L2e
            r0 = r10
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2e
            r0 = 1
            r11 = r0
            goto L31
        L2e:
            r0 = 0
            r11 = r0
        L31:
            r0 = r11
            if (r0 == 0) goto L39
            goto L3c
        L39:
            r0 = 0
            r9 = r0
        L3c:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.PainterModifier.m2082hasSpecifiedAndFiniteWidthuvyYCjk(long):boolean");
    }

    /* renamed from: modifyConstraints-ZezNO4M  reason: not valid java name */
    private final long m2083modifyConstraintsZezNO4M(long j2) {
        int m4754getMinWidthimpl;
        int m4753getMinHeightimpl;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        boolean z = true;
        boolean z2 = Constraints.m4748getHasBoundedWidthimpl(j2) && Constraints.m4747getHasBoundedHeightimpl(j2);
        if (!Constraints.m4750getHasFixedWidthimpl(j2) || !Constraints.m4749getHasFixedHeightimpl(j2)) {
            z = false;
        }
        if ((getUseIntrinsicSize() || !z2) && !z) {
            long mo2940getIntrinsicSizeNHjbRc = this.painter.mo2940getIntrinsicSizeNHjbRc();
            if (m2082hasSpecifiedAndFiniteWidthuvyYCjk(mo2940getIntrinsicSizeNHjbRc)) {
                roundToInt4 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(mo2940getIntrinsicSizeNHjbRc));
                m4754getMinWidthimpl = roundToInt4;
            } else {
                m4754getMinWidthimpl = Constraints.m4754getMinWidthimpl(j2);
            }
            if (m2081hasSpecifiedAndFiniteHeightuvyYCjk(mo2940getIntrinsicSizeNHjbRc)) {
                roundToInt3 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(mo2940getIntrinsicSizeNHjbRc));
                m4753getMinHeightimpl = roundToInt3;
            } else {
                m4753getMinHeightimpl = Constraints.m4753getMinHeightimpl(j2);
            }
            long m2080calculateScaledSizeE7KxVPU = m2080calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m4766constrainWidthK40F9xA(j2, m4754getMinWidthimpl), ConstraintsKt.m4765constrainHeightK40F9xA(j2, m4753getMinHeightimpl)));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(m2080calculateScaledSizeE7KxVPU));
            int m4766constrainWidthK40F9xA = ConstraintsKt.m4766constrainWidthK40F9xA(j2, roundToInt);
            roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(m2080calculateScaledSizeE7KxVPU));
            return Constraints.m4743copyZbe2FdA$default(j2, m4766constrainWidthK40F9xA, 0, ConstraintsKt.m4765constrainHeightK40F9xA(j2, roundToInt2), 0, 10, null);
        }
        return Constraints.m4743copyZbe2FdA$default(j2, Constraints.m4752getMaxWidthimpl(j2), 0, Constraints.m4751getMaxHeightimpl(j2), 0, 10, null);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        long m2248getZeroNHjbRc;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long mo2940getIntrinsicSizeNHjbRc = this.painter.mo2940getIntrinsicSizeNHjbRc();
        float m2239getWidthimpl = m2082hasSpecifiedAndFiniteWidthuvyYCjk(mo2940getIntrinsicSizeNHjbRc) ? Size.m2239getWidthimpl(mo2940getIntrinsicSizeNHjbRc) : Size.m2239getWidthimpl(contentDrawScope.mo2841getSizeNHjbRc());
        if (!m2081hasSpecifiedAndFiniteHeightuvyYCjk(mo2940getIntrinsicSizeNHjbRc)) {
            mo2940getIntrinsicSizeNHjbRc = contentDrawScope.mo2841getSizeNHjbRc();
        }
        long Size = SizeKt.Size(m2239getWidthimpl, Size.m2236getHeightimpl(mo2940getIntrinsicSizeNHjbRc));
        if (!(Size.m2239getWidthimpl(contentDrawScope.mo2841getSizeNHjbRc()) == 0.0f)) {
            if (!(Size.m2236getHeightimpl(contentDrawScope.mo2841getSizeNHjbRc()) == 0.0f)) {
                m2248getZeroNHjbRc = ScaleFactorKt.m4002timesUQTWf7w(Size, this.contentScale.mo3900computeScaleFactorH7hwNQA(Size, contentDrawScope.mo2841getSizeNHjbRc()));
                Alignment alignment = this.alignment;
                roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(m2248getZeroNHjbRc));
                roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(m2248getZeroNHjbRc));
                long IntSize = IntSizeKt.IntSize(roundToInt, roundToInt2);
                roundToInt3 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(contentDrawScope.mo2841getSizeNHjbRc()));
                roundToInt4 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(contentDrawScope.mo2841getSizeNHjbRc()));
                long mo2047alignKFBX0sM = alignment.mo2047alignKFBX0sM(IntSize, IntSizeKt.IntSize(roundToInt3, roundToInt4), contentDrawScope.getLayoutDirection());
                float m4907getXimpl = IntOffset.m4907getXimpl(mo2047alignKFBX0sM);
                float m4908getYimpl = IntOffset.m4908getYimpl(mo2047alignKFBX0sM);
                contentDrawScope.getDrawContext().getTransform().translate(m4907getXimpl, m4908getYimpl);
                getPainter().m2946drawx_KDEd0(contentDrawScope, m2248getZeroNHjbRc, getAlpha(), getColorFilter());
                contentDrawScope.getDrawContext().getTransform().translate(-m4907getXimpl, -m4908getYimpl);
                contentDrawScope.drawContent();
            }
        }
        m2248getZeroNHjbRc = Size.Companion.m2248getZeroNHjbRc();
        Alignment alignment2 = this.alignment;
        roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(m2248getZeroNHjbRc));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(m2248getZeroNHjbRc));
        long IntSize2 = IntSizeKt.IntSize(roundToInt, roundToInt2);
        roundToInt3 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(contentDrawScope.mo2841getSizeNHjbRc()));
        roundToInt4 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(contentDrawScope.mo2841getSizeNHjbRc()));
        long mo2047alignKFBX0sM2 = alignment2.mo2047alignKFBX0sM(IntSize2, IntSizeKt.IntSize(roundToInt3, roundToInt4), contentDrawScope.getLayoutDirection());
        float m4907getXimpl2 = IntOffset.m4907getXimpl(mo2047alignKFBX0sM2);
        float m4908getYimpl2 = IntOffset.m4908getYimpl(mo2047alignKFBX0sM2);
        contentDrawScope.getDrawContext().getTransform().translate(m4907getXimpl2, m4908getYimpl2);
        getPainter().m2946drawx_KDEd0(contentDrawScope, m2248getZeroNHjbRc, getAlpha(), getColorFilter());
        contentDrawScope.getDrawContext().getTransform().translate(-m4907getXimpl2, -m4908getYimpl2);
        contentDrawScope.drawContent();
    }

    public boolean equals(@Nullable Object obj) {
        PainterModifier painterModifier = obj instanceof PainterModifier ? (PainterModifier) obj : null;
        if (painterModifier == null) {
            return false;
        }
        boolean z = false;
        if (Intrinsics.areEqual(this.painter, painterModifier.painter)) {
            z = false;
            if (this.sizeToIntrinsics == painterModifier.sizeToIntrinsics) {
                z = false;
                if (Intrinsics.areEqual(this.alignment, painterModifier.alignment)) {
                    z = false;
                    if (Intrinsics.areEqual(this.contentScale, painterModifier.contentScale)) {
                        z = false;
                        if (this.alpha == painterModifier.alpha) {
                            z = false;
                            if (Intrinsics.areEqual(this.colorFilter, painterModifier.colorFilter)) {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldOut(this, r2, function2);
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @NotNull
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @NotNull
    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public int hashCode() {
        int hashCode = this.painter.hashCode();
        int hashCode2 = Boolean.hashCode(this.sizeToIntrinsics);
        int hashCode3 = this.alignment.hashCode();
        int hashCode4 = this.contentScale.hashCode();
        int hashCode5 = Float.hashCode(this.alpha);
        ColorFilter colorFilter = this.colorFilter;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int maxIntrinsicHeight;
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            int maxIntrinsicHeight2 = measurable.maxIntrinsicHeight(Constraints.m4752getMaxWidthimpl(m2083modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(m2080calculateScaledSizeE7KxVPU(SizeKt.Size(i2, maxIntrinsicHeight2))));
            maxIntrinsicHeight = Math.max(roundToInt, maxIntrinsicHeight2);
        } else {
            maxIntrinsicHeight = measurable.maxIntrinsicHeight(i2);
        }
        return maxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int maxIntrinsicWidth;
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            int maxIntrinsicWidth2 = measurable.maxIntrinsicWidth(Constraints.m4751getMaxHeightimpl(m2083modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(m2080calculateScaledSizeE7KxVPU(SizeKt.Size(maxIntrinsicWidth2, i2))));
            maxIntrinsicWidth = Math.max(roundToInt, maxIntrinsicWidth2);
        } else {
            maxIntrinsicWidth = measurable.maxIntrinsicWidth(i2);
        }
        return maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(m2083modifyConstraintsZezNO4M(j2));
        return MeasureScope.DefaultImpls.layout$default(receiver, mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int minIntrinsicHeight;
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            int minIntrinsicHeight2 = measurable.minIntrinsicHeight(Constraints.m4752getMaxWidthimpl(m2083modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(m2080calculateScaledSizeE7KxVPU(SizeKt.Size(i2, minIntrinsicHeight2))));
            minIntrinsicHeight = Math.max(roundToInt, minIntrinsicHeight2);
        } else {
            minIntrinsicHeight = measurable.minIntrinsicHeight(i2);
        }
        return minIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int minIntrinsicWidth;
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            int minIntrinsicWidth2 = measurable.minIntrinsicWidth(Constraints.m4751getMaxHeightimpl(m2083modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(m2080calculateScaledSizeE7KxVPU(SizeKt.Size(minIntrinsicWidth2, i2))));
            minIntrinsicWidth = Math.max(roundToInt, minIntrinsicWidth2);
        } else {
            minIntrinsicWidth = measurable.minIntrinsicWidth(i2);
        }
        return minIntrinsicWidth;
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }

    @NotNull
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
