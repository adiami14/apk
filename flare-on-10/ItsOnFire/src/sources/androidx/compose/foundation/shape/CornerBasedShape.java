package androidx.compose.foundation.shape;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b'\u0018��2\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020��2\u0006\u0010\u000e\u001a\u00020\u0003J0\u0010\r\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&J+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "getBottomEnd", "()Landroidx/compose/foundation/shape/CornerSize;", "getBottomStart", "getTopEnd", "getTopStart", "copy", "all", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/shape/CornerBasedShape.class */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    @NotNull
    private final CornerSize bottomEnd;
    @NotNull
    private final CornerSize bottomStart;
    @NotNull
    private final CornerSize topEnd;
    @NotNull
    private final CornerSize topStart;

    public CornerBasedShape(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        this.topStart = topStart;
        this.topEnd = topEnd;
        this.bottomEnd = bottomEnd;
        this.bottomStart = bottomStart;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                cornerSize = cornerBasedShape.topStart;
            }
            if ((i2 & 2) != 0) {
                cornerSize2 = cornerBasedShape.topEnd;
            }
            if ((i2 & 4) != 0) {
                cornerSize3 = cornerBasedShape.bottomEnd;
            }
            if ((i2 & 8) != 0) {
                cornerSize4 = cornerBasedShape.bottomStart;
            }
            return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @NotNull
    public final CornerBasedShape copy(@NotNull CornerSize all) {
        Intrinsics.checkNotNullParameter(all, "all");
        return copy(all, all, all, all);
    }

    @NotNull
    public abstract CornerBasedShape copy(@NotNull CornerSize cornerSize, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3, @NotNull CornerSize cornerSize4);

    @NotNull
    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo849createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, @NotNull LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    @NotNull
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo426createOutlinePq9zytI(long j2, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float mo859toPxTmRCtEA = this.topStart.mo859toPxTmRCtEA(j2, density);
        float mo859toPxTmRCtEA2 = this.topEnd.mo859toPxTmRCtEA(j2, density);
        float mo859toPxTmRCtEA3 = this.bottomEnd.mo859toPxTmRCtEA(j2, density);
        float mo859toPxTmRCtEA4 = this.bottomStart.mo859toPxTmRCtEA(j2, density);
        float m2238getMinDimensionimpl = Size.m2238getMinDimensionimpl(j2);
        float f2 = mo859toPxTmRCtEA + mo859toPxTmRCtEA4;
        float f3 = mo859toPxTmRCtEA4;
        float f4 = mo859toPxTmRCtEA;
        if (f2 > m2238getMinDimensionimpl) {
            float f5 = m2238getMinDimensionimpl / f2;
            f4 = mo859toPxTmRCtEA * f5;
            f3 = mo859toPxTmRCtEA4 * f5;
        }
        float f6 = mo859toPxTmRCtEA2 + mo859toPxTmRCtEA3;
        float f7 = mo859toPxTmRCtEA2;
        float f8 = mo859toPxTmRCtEA3;
        if (f6 > m2238getMinDimensionimpl) {
            float f9 = m2238getMinDimensionimpl / f6;
            f7 = mo859toPxTmRCtEA2 * f9;
            f8 = mo859toPxTmRCtEA3 * f9;
        }
        if (f4 >= 0.0f && f7 >= 0.0f && f8 >= 0.0f && f3 >= 0.0f) {
            return mo849createOutlineLjSzlW0(j2, f4, f7, f8, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + f4 + ", topEnd = " + f7 + ", bottomEnd = " + f8 + ", bottomStart = " + f3 + ")!").toString());
    }

    @NotNull
    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    @NotNull
    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @NotNull
    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    @NotNull
    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
