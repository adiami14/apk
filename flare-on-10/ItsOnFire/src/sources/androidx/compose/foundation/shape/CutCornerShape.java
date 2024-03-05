package androidx.compose.foundation.shape;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020��2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016JE\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/shape/CutCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "copy", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/shape/CutCornerShape.class */
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutCornerShape(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    public CutCornerShape copy(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        return new CutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @NotNull
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo849createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, @NotNull LayoutDirection layoutDirection) {
        Outline generic;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (((f2 + f3) + f5) + f4 == 0.0f) {
            generic = new Outline.Rectangle(SizeKt.m2260toRectuvyYCjk(j2));
        } else {
            Path Path = AndroidPath_androidKt.Path();
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            float f6 = layoutDirection == layoutDirection2 ? f2 : f3;
            Path.moveTo(0.0f, f6);
            Path.lineTo(f6, 0.0f);
            if (layoutDirection == layoutDirection2) {
                f2 = f3;
            }
            Path.lineTo(Size.m2239getWidthimpl(j2) - f2, 0.0f);
            Path.lineTo(Size.m2239getWidthimpl(j2), f2);
            float f7 = layoutDirection == layoutDirection2 ? f4 : f5;
            Path.lineTo(Size.m2239getWidthimpl(j2), Size.m2236getHeightimpl(j2) - f7);
            Path.lineTo(Size.m2239getWidthimpl(j2) - f7, Size.m2236getHeightimpl(j2));
            if (layoutDirection == layoutDirection2) {
                f4 = f5;
            }
            Path.lineTo(f4, Size.m2236getHeightimpl(j2));
            Path.lineTo(0.0f, Size.m2236getHeightimpl(j2) - f4);
            Path.close();
            generic = new Outline.Generic(Path);
        }
        return generic;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CutCornerShape) {
            CutCornerShape cutCornerShape = (CutCornerShape) obj;
            return Intrinsics.areEqual(getTopStart(), cutCornerShape.getTopStart()) && Intrinsics.areEqual(getTopEnd(), cutCornerShape.getTopEnd()) && Intrinsics.areEqual(getBottomEnd(), cutCornerShape.getBottomEnd()) && Intrinsics.areEqual(getBottomStart(), cutCornerShape.getBottomStart());
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @NotNull
    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
