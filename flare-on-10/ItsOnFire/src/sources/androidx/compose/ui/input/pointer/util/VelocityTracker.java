package androidx.compose.ui.input.pointer.util;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.VelocityKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u0012ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n��R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "()V", FirebaseAnalytics.Param.INDEX, "", "samples", "", "Landroidx/compose/ui/input/pointer/util/PointAtTime;", "[Landroidx/compose/ui/input/pointer/util/PointAtTime;", "addPosition", "", "timeMillis", "", "position", "Landroidx/compose/ui/geometry/Offset;", "addPosition-Uv8p0NA", "(JJ)V", "calculateVelocity", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "getVelocityEstimate", "Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "resetTracking", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/util/VelocityTracker.class */
public final class VelocityTracker {
    public static final int $stable = 8;
    private int index;
    @NotNull
    private final PointAtTime[] samples;

    public VelocityTracker() {
        PointAtTime[] pointAtTimeArr = new PointAtTime[20];
        for (int i2 = 0; i2 < 20; i2++) {
            pointAtTimeArr[i2] = null;
        }
        this.samples = pointAtTimeArr;
    }

    private final VelocityEstimate getVelocityEstimate() {
        int i2;
        PointAtTime pointAtTime;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i3 = this.index;
        PointAtTime pointAtTime2 = this.samples[i3];
        if (pointAtTime2 == null) {
            return VelocityEstimate.Companion.getNone();
        }
        int i4 = 0;
        PointAtTime pointAtTime3 = pointAtTime2;
        while (true) {
            PointAtTime pointAtTime4 = pointAtTime3;
            PointAtTime pointAtTime5 = this.samples[i3];
            if (pointAtTime5 == null) {
                i2 = i4;
                pointAtTime = pointAtTime4;
                break;
            }
            float time = (float) (pointAtTime2.getTime() - pointAtTime5.getTime());
            float abs = (float) Math.abs(pointAtTime5.getTime() - pointAtTime4.getTime());
            i2 = i4;
            pointAtTime = pointAtTime4;
            if (time > 100.0f) {
                break;
            } else if (abs > 40.0f) {
                i2 = i4;
                pointAtTime = pointAtTime4;
                break;
            } else {
                long m3881getPointF1C5BW0 = pointAtTime5.m3881getPointF1C5BW0();
                arrayList.add(Float.valueOf(Offset.m2167getXimpl(m3881getPointF1C5BW0)));
                arrayList2.add(Float.valueOf(Offset.m2168getYimpl(m3881getPointF1C5BW0)));
                arrayList3.add(Float.valueOf(-time));
                int i5 = i3;
                if (i3 == 0) {
                    i5 = 20;
                }
                i3 = i5 - 1;
                i4++;
                if (i4 >= 20) {
                    pointAtTime = pointAtTime5;
                    i2 = i4;
                    break;
                }
                pointAtTime3 = pointAtTime5;
            }
        }
        if (i2 >= 3) {
            try {
                PolynomialFit polyFitLeastSquares = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList, 2);
                PolynomialFit polyFitLeastSquares2 = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList2, 2);
                float floatValue = polyFitLeastSquares.getCoefficients().get(1).floatValue();
                float floatValue2 = polyFitLeastSquares2.getCoefficients().get(1).floatValue();
                float f2 = 1000;
                return new VelocityEstimate(OffsetKt.Offset(floatValue * f2, floatValue2 * f2), polyFitLeastSquares.getConfidence() * polyFitLeastSquares2.getConfidence(), pointAtTime2.getTime() - pointAtTime.getTime(), Offset.m2171minusMKHz9U(pointAtTime2.m3881getPointF1C5BW0(), pointAtTime.m3881getPointF1C5BW0()), null);
            } catch (IllegalArgumentException e2) {
                return VelocityEstimate.Companion.getNone();
            }
        }
        return new VelocityEstimate(Offset.Companion.m2183getZeroF1C5BW0(), 1.0f, pointAtTime2.getTime() - pointAtTime.getTime(), Offset.m2171minusMKHz9U(pointAtTime2.m3881getPointF1C5BW0(), pointAtTime.m3881getPointF1C5BW0()), null);
    }

    /* renamed from: addPosition-Uv8p0NA  reason: not valid java name */
    public final void m3890addPositionUv8p0NA(long j2, long j3) {
        int i2 = (this.index + 1) % 20;
        this.index = i2;
        this.samples[i2] = new PointAtTime(j3, j2, null);
    }

    /* renamed from: calculateVelocity-9UxMQ8M  reason: not valid java name */
    public final long m3891calculateVelocity9UxMQ8M() {
        long m3888getPixelsPerSecondF1C5BW0 = getVelocityEstimate().m3888getPixelsPerSecondF1C5BW0();
        return VelocityKt.Velocity(Offset.m2167getXimpl(m3888getPixelsPerSecondF1C5BW0), Offset.m2168getYimpl(m3888getPixelsPerSecondF1C5BW0));
    }

    public final void resetTracking() {
        ArraysKt___ArraysJvmKt.fill$default(this.samples, (Object) null, 0, 0, 6, (Object) null);
    }
}
