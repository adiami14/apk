package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018��2\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0019\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001c\u0010\"\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0015H\u0016J)\u0010$\u001a\u00020%*\u00020&2\u0006\u0010\u001f\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001aH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001c\u0010+\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001c\u0010,\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0015H\u0016J#\u0010-\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b2\u00100J#\u00103\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b4\u00100J#\u00105\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b6\u00100R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FZLkotlin/jvm/functions/Function1;)V", "getAspectRatio", "()F", "getMatchHeightConstraintsFirst", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/AspectRatioModifier.class */
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f2, boolean z, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.aspectRatio = f2;
        this.matchHeightConstraintsFirst = z;
        if (f2 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + getAspectRatio() + " must be > 0").toString());
    }

    /* renamed from: findSize-ToXhtMw  reason: not valid java name */
    private final long m597findSizeToXhtMw(long j2) {
        if (this.matchHeightConstraintsFirst) {
            long m599tryMaxHeightJN0ABg$default = m599tryMaxHeightJN0ABg$default(this, j2, false, 1, null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m4949equalsimpl0(m599tryMaxHeightJN0ABg$default, companion.m4956getZeroYbymL2g())) {
                return m599tryMaxHeightJN0ABg$default;
            }
            long m601tryMaxWidthJN0ABg$default = m601tryMaxWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m4949equalsimpl0(m601tryMaxWidthJN0ABg$default, companion.m4956getZeroYbymL2g())) {
                return m601tryMaxWidthJN0ABg$default;
            }
            long m603tryMinHeightJN0ABg$default = m603tryMinHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m4949equalsimpl0(m603tryMinHeightJN0ABg$default, companion.m4956getZeroYbymL2g())) {
                return m603tryMinHeightJN0ABg$default;
            }
            long m605tryMinWidthJN0ABg$default = m605tryMinWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m4949equalsimpl0(m605tryMinWidthJN0ABg$default, companion.m4956getZeroYbymL2g())) {
                return m605tryMinWidthJN0ABg$default;
            }
            long m598tryMaxHeightJN0ABg = m598tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m4949equalsimpl0(m598tryMaxHeightJN0ABg, companion.m4956getZeroYbymL2g())) {
                return m598tryMaxHeightJN0ABg;
            }
            long m600tryMaxWidthJN0ABg = m600tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m4949equalsimpl0(m600tryMaxWidthJN0ABg, companion.m4956getZeroYbymL2g())) {
                return m600tryMaxWidthJN0ABg;
            }
            long m602tryMinHeightJN0ABg = m602tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m4949equalsimpl0(m602tryMinHeightJN0ABg, companion.m4956getZeroYbymL2g())) {
                return m602tryMinHeightJN0ABg;
            }
            long m604tryMinWidthJN0ABg = m604tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m4949equalsimpl0(m604tryMinWidthJN0ABg, companion.m4956getZeroYbymL2g())) {
                return m604tryMinWidthJN0ABg;
            }
        } else {
            long m601tryMaxWidthJN0ABg$default2 = m601tryMaxWidthJN0ABg$default(this, j2, false, 1, null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m4949equalsimpl0(m601tryMaxWidthJN0ABg$default2, companion2.m4956getZeroYbymL2g())) {
                return m601tryMaxWidthJN0ABg$default2;
            }
            long m599tryMaxHeightJN0ABg$default2 = m599tryMaxHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m4949equalsimpl0(m599tryMaxHeightJN0ABg$default2, companion2.m4956getZeroYbymL2g())) {
                return m599tryMaxHeightJN0ABg$default2;
            }
            long m605tryMinWidthJN0ABg$default2 = m605tryMinWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m4949equalsimpl0(m605tryMinWidthJN0ABg$default2, companion2.m4956getZeroYbymL2g())) {
                return m605tryMinWidthJN0ABg$default2;
            }
            long m603tryMinHeightJN0ABg$default2 = m603tryMinHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m4949equalsimpl0(m603tryMinHeightJN0ABg$default2, companion2.m4956getZeroYbymL2g())) {
                return m603tryMinHeightJN0ABg$default2;
            }
            long m600tryMaxWidthJN0ABg2 = m600tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m4949equalsimpl0(m600tryMaxWidthJN0ABg2, companion2.m4956getZeroYbymL2g())) {
                return m600tryMaxWidthJN0ABg2;
            }
            long m598tryMaxHeightJN0ABg2 = m598tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m4949equalsimpl0(m598tryMaxHeightJN0ABg2, companion2.m4956getZeroYbymL2g())) {
                return m598tryMaxHeightJN0ABg2;
            }
            long m604tryMinWidthJN0ABg2 = m604tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m4949equalsimpl0(m604tryMinWidthJN0ABg2, companion2.m4956getZeroYbymL2g())) {
                return m604tryMinWidthJN0ABg2;
            }
            long m602tryMinHeightJN0ABg2 = m602tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m4949equalsimpl0(m602tryMinHeightJN0ABg2, companion2.m4956getZeroYbymL2g())) {
                return m602tryMinHeightJN0ABg2;
            }
        }
        return IntSize.Companion.m4956getZeroYbymL2g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = kotlin.math.MathKt__MathJVMKt.roundToInt(r0 * r5.aspectRatio);
     */
    /* renamed from: tryMaxHeight-JN-0ABg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m598tryMaxHeightJN0ABg(long r6, boolean r8) {
        /*
            r5 = this;
            r0 = r6
            int r0 = androidx.compose.ui.unit.Constraints.m4751getMaxHeightimpl(r0)
            r9 = r0
            r0 = r9
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L38
            r0 = r9
            float r0 = (float) r0
            r1 = r5
            float r1 = r1.aspectRatio
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            r10 = r0
            r0 = r10
            if (r0 <= 0) goto L38
            r0 = r10
            r1 = r9
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r0, r1)
            r11 = r0
            r0 = r8
            if (r0 == 0) goto L35
            r0 = r6
            r1 = r11
            boolean r0 = androidx.compose.ui.unit.ConstraintsKt.m4767isSatisfiedBy4WqzIAM(r0, r1)
            if (r0 == 0) goto L38
        L35:
            r0 = r11
            return r0
        L38:
            androidx.compose.ui.unit.IntSize$Companion r0 = androidx.compose.ui.unit.IntSize.Companion
            long r0 = r0.m4956getZeroYbymL2g()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioModifier.m598tryMaxHeightJN0ABg(long, boolean):long");
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default  reason: not valid java name */
    public static /* synthetic */ long m599tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m598tryMaxHeightJN0ABg(j2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = kotlin.math.MathKt__MathJVMKt.roundToInt(r0 / r5.aspectRatio);
     */
    /* renamed from: tryMaxWidth-JN-0ABg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m600tryMaxWidthJN0ABg(long r6, boolean r8) {
        /*
            r5 = this;
            r0 = r6
            int r0 = androidx.compose.ui.unit.Constraints.m4752getMaxWidthimpl(r0)
            r9 = r0
            r0 = r9
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L38
            r0 = r9
            float r0 = (float) r0
            r1 = r5
            float r1 = r1.aspectRatio
            float r0 = r0 / r1
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            r10 = r0
            r0 = r10
            if (r0 <= 0) goto L38
            r0 = r9
            r1 = r10
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r0, r1)
            r11 = r0
            r0 = r8
            if (r0 == 0) goto L35
            r0 = r6
            r1 = r11
            boolean r0 = androidx.compose.ui.unit.ConstraintsKt.m4767isSatisfiedBy4WqzIAM(r0, r1)
            if (r0 == 0) goto L38
        L35:
            r0 = r11
            return r0
        L38:
            androidx.compose.ui.unit.IntSize$Companion r0 = androidx.compose.ui.unit.IntSize.Companion
            long r0 = r0.m4956getZeroYbymL2g()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioModifier.m600tryMaxWidthJN0ABg(long, boolean):long");
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default  reason: not valid java name */
    public static /* synthetic */ long m601tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m600tryMaxWidthJN0ABg(j2, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg  reason: not valid java name */
    private final long m602tryMinHeightJN0ABg(long j2, boolean z) {
        int roundToInt;
        int m4753getMinHeightimpl = Constraints.m4753getMinHeightimpl(j2);
        roundToInt = MathKt__MathJVMKt.roundToInt(m4753getMinHeightimpl * this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m4753getMinHeightimpl);
            if (!z || ConstraintsKt.m4767isSatisfiedBy4WqzIAM(j2, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m4956getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default  reason: not valid java name */
    public static /* synthetic */ long m603tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m602tryMinHeightJN0ABg(j2, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg  reason: not valid java name */
    private final long m604tryMinWidthJN0ABg(long j2, boolean z) {
        int roundToInt;
        int m4754getMinWidthimpl = Constraints.m4754getMinWidthimpl(j2);
        roundToInt = MathKt__MathJVMKt.roundToInt(m4754getMinWidthimpl / this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(m4754getMinWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m4767isSatisfiedBy4WqzIAM(j2, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m4956getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default  reason: not valid java name */
    public static /* synthetic */ long m605tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m604tryMinWidthJN0ABg(j2, z);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = obj instanceof AspectRatioModifier ? (AspectRatioModifier) obj : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        if (!(this.aspectRatio == aspectRatioModifier.aspectRatio) || this.matchHeightConstraintsFirst != ((AspectRatioModifier) obj).matchHeightConstraintsFirst) {
            z = false;
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

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int maxIntrinsicHeight;
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i2 != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(i2 / this.aspectRatio);
            maxIntrinsicHeight = roundToInt;
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
        if (i2 != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(i2 * this.aspectRatio);
            maxIntrinsicWidth = roundToInt;
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
        long m597findSizeToXhtMw = m597findSizeToXhtMw(j2);
        if (!IntSize.m4949equalsimpl0(m597findSizeToXhtMw, IntSize.Companion.m4956getZeroYbymL2g())) {
            j2 = Constraints.Companion.m4760fixedJhjzzOo(IntSize.m4951getWidthimpl(m597findSizeToXhtMw), IntSize.m4950getHeightimpl(m597findSizeToXhtMw));
        }
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(j2);
        return MeasureScope.DefaultImpls.layout$default(receiver, mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
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
        if (i2 != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(i2 / this.aspectRatio);
            minIntrinsicHeight = roundToInt;
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
        if (i2 != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(i2 * this.aspectRatio);
            minIntrinsicWidth = roundToInt;
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
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
