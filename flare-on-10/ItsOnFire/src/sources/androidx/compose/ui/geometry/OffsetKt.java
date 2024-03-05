package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001e\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001��¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0086\bø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\"!\u0010��\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"!\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"isFinite", "", "Landroidx/compose/ui/geometry/Offset;", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite-k-4lQ0M", "(J)Z", "isSpecified", "isSpecified-k-4lQ0M$annotations", "isSpecified-k-4lQ0M", "isUnspecified", "isUnspecified-k-4lQ0M$annotations", "isUnspecified-k-4lQ0M", "Offset", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/OffsetKt.class */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f2, float f3) {
        return Offset.m2159constructorimpl((Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (((java.lang.Float.isInfinite(r0) || java.lang.Float.isNaN(r0)) ? false : true) != false) goto L15;
     */
    /* renamed from: isFinite-k-4lQ0M  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m2184isFinitek4lQ0M(long r3) {
        /*
            r0 = r3
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            r5 = r0
            r0 = r5
            boolean r0 = java.lang.Float.isInfinite(r0)
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L1e
            r0 = r5
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1e
            r0 = 1
            r8 = r0
            goto L21
        L1e:
            r0 = 0
            r8 = r0
        L21:
            r0 = r8
            if (r0 == 0) goto L4a
            r0 = r3
            float r0 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r0)
            r5 = r0
            r0 = r5
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L3f
            r0 = r5
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3f
            r0 = 1
            r8 = r0
            goto L42
        L3f:
            r0 = 0
            r8 = r0
        L42:
            r0 = r8
            if (r0 == 0) goto L4a
            goto L4d
        L4a:
            r0 = 0
            r7 = r0
        L4d:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.OffsetKt.m2184isFinitek4lQ0M(long):boolean");
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m2185isFinitek4lQ0M$annotations(long j2) {
    }

    /* renamed from: isSpecified-k-4lQ0M  reason: not valid java name */
    public static final boolean m2186isSpecifiedk4lQ0M(long j2) {
        return j2 != Offset.Companion.m2182getUnspecifiedF1C5BW0();
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m2187isSpecifiedk4lQ0M$annotations(long j2) {
    }

    /* renamed from: isUnspecified-k-4lQ0M  reason: not valid java name */
    public static final boolean m2188isUnspecifiedk4lQ0M(long j2) {
        return j2 == Offset.Companion.m2182getUnspecifiedF1C5BW0();
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m2189isUnspecifiedk4lQ0M$annotations(long j2) {
    }

    @Stable
    /* renamed from: lerp-Wko1d7g  reason: not valid java name */
    public static final long m2190lerpWko1d7g(long j2, long j3, float f2) {
        return Offset(MathHelpersKt.lerp(Offset.m2167getXimpl(j2), Offset.m2167getXimpl(j3), f2), MathHelpersKt.lerp(Offset.m2168getYimpl(j2), Offset.m2168getYimpl(j3), f2));
    }

    /* renamed from: takeOrElse-3MmeM6k  reason: not valid java name */
    public static final long m2191takeOrElse3MmeM6k(long j2, @NotNull Function0<Offset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!m2186isSpecifiedk4lQ0M(j2)) {
            j2 = block.invoke().m2177unboximpl();
        }
        return j2;
    }
}
