package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(d1 = {"�� \n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010��\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001��¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/ConstraintsKt.class */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i2, int i3, int i4, int i5) {
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("maxWidth(" + i3 + ") must be >= than minWidth(" + i2 + ')').toString());
        }
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(("maxHeight(" + i5 + ") must be >= than minHeight(" + i4 + ')').toString());
        }
        if (i2 >= 0 && i4 >= 0) {
            return Constraints.Companion.m4759createConstraintsZbe2FdA$ui_unit_release(i2, i3, i4, i5);
        }
        throw new IllegalArgumentException(("minWidth(" + i2 + ") and minHeight(" + i4 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long Constraints$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return Constraints(i2, i3, i4, i5);
    }

    private static final int addMaxWithMinimum(int i2, int i3) {
        int coerceAtLeast;
        if (i2 != Integer.MAX_VALUE) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i2 + i3, 0);
            i2 = coerceAtLeast;
        }
        return i2;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM  reason: not valid java name */
    public static final long m4763constrain4WqzIAM(long j2, long j3) {
        int coerceIn;
        int coerceIn2;
        coerceIn = RangesKt___RangesKt.coerceIn(IntSize.m4951getWidthimpl(j3), Constraints.m4754getMinWidthimpl(j2), Constraints.m4752getMaxWidthimpl(j2));
        coerceIn2 = RangesKt___RangesKt.coerceIn(IntSize.m4950getHeightimpl(j3), Constraints.m4753getMinHeightimpl(j2), Constraints.m4751getMaxHeightimpl(j2));
        return IntSizeKt.IntSize(coerceIn, coerceIn2);
    }

    /* renamed from: constrain-N9IONVI  reason: not valid java name */
    public static final long m4764constrainN9IONVI(long j2, long j3) {
        int coerceIn;
        int coerceIn2;
        int coerceIn3;
        int coerceIn4;
        coerceIn = RangesKt___RangesKt.coerceIn(Constraints.m4754getMinWidthimpl(j3), Constraints.m4754getMinWidthimpl(j2), Constraints.m4752getMaxWidthimpl(j2));
        coerceIn2 = RangesKt___RangesKt.coerceIn(Constraints.m4752getMaxWidthimpl(j3), Constraints.m4754getMinWidthimpl(j2), Constraints.m4752getMaxWidthimpl(j2));
        coerceIn3 = RangesKt___RangesKt.coerceIn(Constraints.m4753getMinHeightimpl(j3), Constraints.m4753getMinHeightimpl(j2), Constraints.m4751getMaxHeightimpl(j2));
        coerceIn4 = RangesKt___RangesKt.coerceIn(Constraints.m4751getMaxHeightimpl(j3), Constraints.m4753getMinHeightimpl(j2), Constraints.m4751getMaxHeightimpl(j2));
        return Constraints(coerceIn, coerceIn2, coerceIn3, coerceIn4);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA  reason: not valid java name */
    public static final int m4765constrainHeightK40F9xA(long j2, int i2) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i2, Constraints.m4753getMinHeightimpl(j2), Constraints.m4751getMaxHeightimpl(j2));
        return coerceIn;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA  reason: not valid java name */
    public static final int m4766constrainWidthK40F9xA(long j2, int i2) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i2, Constraints.m4754getMinWidthimpl(j2), Constraints.m4752getMaxWidthimpl(j2));
        return coerceIn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        if ((r0 <= r0 && r0 <= r0) != false) goto L15;
     */
    @androidx.compose.runtime.Stable
    /* renamed from: isSatisfiedBy-4WqzIAM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m4767isSatisfiedBy4WqzIAM(long r3, long r5) {
        /*
            r0 = r3
            int r0 = androidx.compose.ui.unit.Constraints.m4754getMinWidthimpl(r0)
            r7 = r0
            r0 = r3
            int r0 = androidx.compose.ui.unit.Constraints.m4752getMaxWidthimpl(r0)
            r8 = r0
            r0 = r5
            int r0 = androidx.compose.ui.unit.IntSize.m4951getWidthimpl(r0)
            r9 = r0
            r0 = 1
            r10 = r0
            r0 = r7
            r1 = r9
            if (r0 > r1) goto L29
            r0 = r9
            r1 = r8
            if (r0 > r1) goto L29
            r0 = 1
            r8 = r0
            goto L2c
        L29:
            r0 = 0
            r8 = r0
        L2c:
            r0 = r8
            if (r0 == 0) goto L62
            r0 = r3
            int r0 = androidx.compose.ui.unit.Constraints.m4753getMinHeightimpl(r0)
            r9 = r0
            r0 = r3
            int r0 = androidx.compose.ui.unit.Constraints.m4751getMaxHeightimpl(r0)
            r7 = r0
            r0 = r5
            int r0 = androidx.compose.ui.unit.IntSize.m4950getHeightimpl(r0)
            r8 = r0
            r0 = r9
            r1 = r8
            if (r0 > r1) goto L57
            r0 = r8
            r1 = r7
            if (r0 > r1) goto L57
            r0 = 1
            r8 = r0
            goto L5a
        L57:
            r0 = 0
            r8 = r0
        L5a:
            r0 = r8
            if (r0 == 0) goto L62
            goto L65
        L62:
            r0 = 0
            r10 = r0
        L65:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.unit.ConstraintsKt.m4767isSatisfiedBy4WqzIAM(long, long):boolean");
    }

    @Stable
    /* renamed from: offset-NN6Ew-U  reason: not valid java name */
    public static final long m4768offsetNN6EwU(long j2, int i2, int i3) {
        int coerceAtLeast;
        int coerceAtLeast2;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Constraints.m4754getMinWidthimpl(j2) + i2, 0);
        int addMaxWithMinimum = addMaxWithMinimum(Constraints.m4752getMaxWidthimpl(j2), i2);
        coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(Constraints.m4753getMinHeightimpl(j2) + i3, 0);
        return Constraints(coerceAtLeast, addMaxWithMinimum, coerceAtLeast2, addMaxWithMinimum(Constraints.m4751getMaxHeightimpl(j2), i3));
    }

    /* renamed from: offset-NN6Ew-U$default  reason: not valid java name */
    public static /* synthetic */ long m4769offsetNN6EwU$default(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return m4768offsetNN6EwU(j2, i2, i3);
    }
}
