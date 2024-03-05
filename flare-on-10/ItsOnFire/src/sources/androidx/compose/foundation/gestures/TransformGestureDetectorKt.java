package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��4\n��\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010��\u001a\u00020\u0001*\u00020\u0002H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bø\u0001��¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\u0002*\u00020\u0006ø\u0001��¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a\u0084\u0001\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0014H\u0086@ø\u0001��ø\u0001��¢\u0006\u0002\u0010\u001b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"angle", "", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "calculateCentroid", "Landroidx/compose/ui/input/pointer/PointerEvent;", "useCurrent", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "calculateCentroidSize", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "calculateRotation", "calculateZoom", "detectTransformGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "onGesture", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "centroid", "pan", "zoom", "rotation", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TransformGestureDetectorKt.class */
public final class TransformGestureDetectorKt {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ((androidx.compose.ui.geometry.Offset.m2168getYimpl(r5) == 0.0f) != false) goto L11;
     */
    /* renamed from: angle-k-4lQ0M  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float m547anglek4lQ0M(long r5) {
        /*
            r0 = r5
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L16
            r0 = 1
            r10 = r0
            goto L19
        L16:
            r0 = 0
            r10 = r0
        L19:
            r0 = r10
            if (r0 == 0) goto L39
            r0 = r5
            float r0 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
            r0 = r9
            r10 = r0
            goto L31
        L2e:
            r0 = 0
            r10 = r0
        L31:
            r0 = r10
            if (r0 == 0) goto L39
            goto L4f
        L39:
            r0 = r5
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            double r0 = (double) r0
            r1 = r5
            float r1 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r1)
            double r1 = (double) r1
            double r0 = java.lang.Math.atan2(r0, r1)
            float r0 = (float) r0
            float r0 = -r0
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 * r1
            r1 = 1078530011(0x40490fdb, float:3.1415927)
            float r0 = r0 / r1
            r8 = r0
        L4f:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.m547anglek4lQ0M(long):float");
    }

    public static final long calculateCentroid(@NotNull PointerEvent pointerEvent, boolean z) {
        int i2;
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long m2183getZeroF1C5BW0 = Offset.Companion.m2183getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = i4;
            if (i3 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i3);
            long j2 = m2183getZeroF1C5BW0;
            int i5 = i2;
            if (pointerInputChange.getPressed()) {
                j2 = m2183getZeroF1C5BW0;
                i5 = i2;
                if (pointerInputChange.getPreviousPressed()) {
                    j2 = Offset.m2172plusMKHz9U(m2183getZeroF1C5BW0, z ? pointerInputChange.m3794getPositionF1C5BW0() : pointerInputChange.m3795getPreviousPositionF1C5BW0());
                    i5 = i2 + 1;
                }
            }
            i3++;
            m2183getZeroF1C5BW0 = j2;
            i4 = i5;
        }
        return i2 == 0 ? Offset.Companion.m2182getUnspecifiedF1C5BW0() : Offset.m2162divtuRUvjQ(m2183getZeroF1C5BW0, i2);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return calculateCentroid(pointerEvent, z);
    }

    public static final float calculateCentroidSize(@NotNull PointerEvent pointerEvent, boolean z) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long calculateCentroid = calculateCentroid(pointerEvent, z);
        float f2 = 0.0f;
        if (Offset.m2164equalsimpl0(calculateCentroid, Offset.Companion.m2182getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i2 >= size) {
                return f2 / i4;
            }
            PointerInputChange pointerInputChange = changes.get(i2);
            float f3 = f2;
            int i5 = i4;
            if (pointerInputChange.getPressed()) {
                f3 = f2;
                i5 = i4;
                if (pointerInputChange.getPreviousPressed()) {
                    f3 = f2 + Offset.m2165getDistanceimpl(Offset.m2171minusMKHz9U(z ? pointerInputChange.m3794getPositionF1C5BW0() : pointerInputChange.m3795getPreviousPositionF1C5BW0(), calculateCentroid));
                    i5 = i4 + 1;
                }
            }
            i2++;
            f2 = f3;
            i3 = i5;
        }
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(pointerEvent, z);
    }

    public static final long calculatePan(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        return Offset.m2164equalsimpl0(calculateCentroid, companion.m2182getUnspecifiedF1C5BW0()) ? companion.m2183getZeroF1C5BW0() : Offset.m2171minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(@NotNull PointerEvent pointerEvent) {
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i2);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i4 = 0;
            }
            i3 += i4;
            i2++;
        }
        if (i3 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i5 = 0;
        while (true) {
            f2 = 0.0f;
            if (i5 >= size2) {
                break;
            }
            PointerInputChange pointerInputChange2 = changes2.get(i5);
            float f6 = f4;
            float f7 = f5;
            if (pointerInputChange2.getPressed()) {
                f6 = f4;
                f7 = f5;
                if (pointerInputChange2.getPreviousPressed()) {
                    long m3794getPositionF1C5BW0 = pointerInputChange2.m3794getPositionF1C5BW0();
                    long m2171minusMKHz9U = Offset.m2171minusMKHz9U(pointerInputChange2.m3795getPreviousPositionF1C5BW0(), calculateCentroid2);
                    long m2171minusMKHz9U2 = Offset.m2171minusMKHz9U(m3794getPositionF1C5BW0, calculateCentroid);
                    float m547anglek4lQ0M = m547anglek4lQ0M(m2171minusMKHz9U2) - m547anglek4lQ0M(m2171minusMKHz9U);
                    float m2165getDistanceimpl = Offset.m2165getDistanceimpl(Offset.m2172plusMKHz9U(m2171minusMKHz9U2, m2171minusMKHz9U)) / 2.0f;
                    if (m547anglek4lQ0M > 180.0f) {
                        f3 = m547anglek4lQ0M - 360.0f;
                    } else {
                        f3 = m547anglek4lQ0M;
                        if (m547anglek4lQ0M < -180.0f) {
                            f3 = m547anglek4lQ0M + 360.0f;
                        }
                    }
                    f7 = f5 + (f3 * m2165getDistanceimpl);
                    f6 = f4 + m2165getDistanceimpl;
                }
            }
            i5++;
            f4 = f6;
            f5 = f7;
        }
        if (!(f4 == 0.0f)) {
            f2 = f5 / f4;
        }
        return f2;
    }

    public static final float calculateZoom(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f) {
            return 1.0f;
        }
        if (calculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    @Nullable
    public static final Object detectTransformGestures(@NotNull PointerInputScope pointerInputScope, boolean z, @NotNull Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new TransformGestureDetectorKt$detectTransformGestures$2(z, function4, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return forEachGesture == coroutine_suspended ? forEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z, Function4 function4, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(pointerInputScope, z, function4, continuation);
    }
}
