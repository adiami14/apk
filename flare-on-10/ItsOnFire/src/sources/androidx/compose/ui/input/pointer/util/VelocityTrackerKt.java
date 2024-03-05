package androidx.compose.ui.input.pointer.util;

import androidx.appcompat.R;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��.\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a,\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\f\u001a\u00020\u0001H��\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��¨\u0006\u0012"}, d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "MinSampleSize", "polyFitLeastSquares", "Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "x", "", "y", "degree", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/util/VelocityTrackerKt.class */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static final int MinSampleSize = 3;

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange event) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        List<HistoricalChange> historical = event.getHistorical();
        int size = historical.size();
        for (int i2 = 0; i2 < size; i2++) {
            HistoricalChange historicalChange = historical.get(i2);
            velocityTracker.m3890addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m3719getPositionF1C5BW0());
        }
        velocityTracker.m3890addPositionUv8p0NA(event.getUptimeMillis(), event.m3794getPositionF1C5BW0());
    }

    @NotNull
    public static final PolynomialFit polyFitLeastSquares(@NotNull List<Float> x, @NotNull List<Float> y, int i2) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        if (i2 >= 1) {
            if (x.size() == y.size()) {
                if (x.isEmpty()) {
                    throw new IllegalArgumentException("At least one point must be provided");
                }
                int size = i2 >= x.size() ? x.size() - 1 : i2;
                int i3 = i2 + 1;
                ArrayList arrayList = new ArrayList(i3);
                int i4 = 0;
                while (i4 < i3) {
                    i4++;
                    arrayList.add(Float.valueOf(0.0f));
                }
                int size2 = x.size();
                int i5 = size + 1;
                Matrix matrix = new Matrix(i5, size2);
                for (int i6 = 0; i6 < size2; i6++) {
                    matrix.set(0, i6, 1.0f);
                    for (int i7 = 1; i7 < i5; i7++) {
                        matrix.set(i7, i6, matrix.get(i7 - 1, i6) * x.get(i6).floatValue());
                    }
                }
                Matrix matrix2 = new Matrix(i5, size2);
                Matrix matrix3 = new Matrix(i5, i5);
                int i8 = 0;
                while (i8 < i5) {
                    for (int i9 = 0; i9 < size2; i9++) {
                        matrix2.set(i8, i9, matrix.get(i8, i9));
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < i8; i11++) {
                        float times = matrix2.getRow(i8).times(matrix2.getRow(i11));
                        int i12 = i10;
                        while (i12 < size2) {
                            matrix2.set(i8, i12, matrix2.get(i8, i12) - (matrix2.get(i11, i12) * times));
                            i12++;
                            i10 = 0;
                        }
                    }
                    float norm = matrix2.getRow(i8).norm();
                    if (norm < 1.0E-6d) {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                    float f2 = 1.0f / norm;
                    for (int i13 = 0; i13 < size2; i13++) {
                        matrix2.set(i8, i13, matrix2.get(i8, i13) * f2);
                    }
                    int i14 = 0;
                    while (i14 < i5) {
                        matrix3.set(i8, i14, i14 < i8 ? 0.0f : matrix2.getRow(i8).times(matrix.getRow(i14)));
                        i14++;
                    }
                    i8++;
                }
                Vector vector = new Vector(size2);
                for (int i15 = 0; i15 < size2; i15++) {
                    vector.set(i15, y.get(i15).floatValue() * 1.0f);
                }
                int i16 = i5 - 1;
                if (i16 >= 0) {
                    int i17 = i16;
                    while (true) {
                        int i18 = i17;
                        int i19 = i18 - 1;
                        arrayList.set(i18, Float.valueOf(matrix2.getRow(i18).times(vector)));
                        int i20 = i18 + 1;
                        if (i20 <= i16) {
                            int i21 = i16;
                            while (true) {
                                arrayList.set(i18, Float.valueOf(((Number) arrayList.get(i18)).floatValue() - (matrix3.get(i18, i21) * ((Number) arrayList.get(i21)).floatValue())));
                                if (i21 == i20) {
                                    break;
                                }
                                i21--;
                            }
                        }
                        arrayList.set(i18, Float.valueOf(((Number) arrayList.get(i18)).floatValue() / matrix3.get(i18, i18)));
                        if (i19 < 0) {
                            break;
                        }
                        i17 = i19;
                    }
                }
                float f3 = 0.0f;
                for (int i22 = 0; i22 < size2; i22++) {
                    f3 += y.get(i22).floatValue();
                }
                float f4 = f3 / size2;
                float f5 = 0.0f;
                float f6 = 0.0f;
                for (int i23 = 0; i23 < size2; i23++) {
                    float floatValue = y.get(i23).floatValue() - ((Number) arrayList.get(0)).floatValue();
                    float f7 = 1.0f;
                    for (int i24 = 1; i24 < i5; i24++) {
                        f7 *= x.get(i23).floatValue();
                        floatValue -= ((Number) arrayList.get(i24)).floatValue() * f7;
                    }
                    f5 += floatValue * 1.0f * floatValue;
                    float floatValue2 = y.get(i23).floatValue() - f4;
                    f6 += floatValue2 * 1.0f * floatValue2;
                }
                return new PolynomialFit(arrayList, f6 <= 1.0E-6f ? 1.0f : 1.0f - (f5 / f6));
            }
            throw new IllegalArgumentException("x and y must be the same length");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }
}
