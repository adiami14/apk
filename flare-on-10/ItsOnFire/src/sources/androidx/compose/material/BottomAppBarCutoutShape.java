package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\b\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0001HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J-\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J4\u0010\"\u001a\u00020 *\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0002R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/material/BottomAppBarCutoutShape;", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "fabPlacement", "Landroidx/compose/material/FabPlacement;", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/FabPlacement;)V", "getCutoutShape", "()Landroidx/compose/ui/graphics/Shape;", "getFabPlacement", "()Landroidx/compose/material/FabPlacement;", "component1", "component2", "copy", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", "hashCode", "", "toString", "", "addCutoutShape", "", "Landroidx/compose/ui/graphics/Path;", "addRoundedEdges", "cutoutStartPosition", "", "cutoutEndPosition", "cutoutRadius", "roundedEdgeRadius", "verticalOffset", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/BottomAppBarCutoutShape.class */
public final class BottomAppBarCutoutShape implements Shape {
    @NotNull
    private final Shape cutoutShape;
    @NotNull
    private final FabPlacement fabPlacement;

    public BottomAppBarCutoutShape(@NotNull Shape cutoutShape, @NotNull FabPlacement fabPlacement) {
        Intrinsics.checkNotNullParameter(cutoutShape, "cutoutShape");
        Intrinsics.checkNotNullParameter(fabPlacement, "fabPlacement");
        this.cutoutShape = cutoutShape;
        this.fabPlacement = fabPlacement;
    }

    private final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float f2;
        float f3;
        f2 = AppBarKt.BottomAppBarCutoutOffset;
        float mo524toPx0680j_4 = density.mo524toPx0680j_4(f2);
        float f4 = 2 * mo524toPx0680j_4;
        long Size = SizeKt.Size(this.fabPlacement.getWidth() + f4, this.fabPlacement.getHeight() + f4);
        float left = this.fabPlacement.getLeft() - mo524toPx0680j_4;
        float m2239getWidthimpl = Size.m2239getWidthimpl(Size);
        float m2236getHeightimpl = Size.m2236getHeightimpl(Size) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.mo426createOutlinePq9zytI(Size, layoutDirection, density));
        path.mo2310translatek4lQ0M(OffsetKt.Offset(left, -m2236getHeightimpl));
        if (Intrinsics.areEqual(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            f3 = AppBarKt.BottomAppBarRoundedEdgeRadius;
            addRoundedEdges(path, left, left + m2239getWidthimpl, m2236getHeightimpl, density.mo524toPx0680j_4(f3), 0.0f);
        }
    }

    private final void addRoundedEdges(Path path, float f2, float f3, float f4, float f5, float f6) {
        float f7 = -((float) Math.sqrt((f4 * f4) - (f6 * f6)));
        float f8 = f4 + f7;
        float f9 = f2 + f8;
        float f10 = f3 - f8;
        Pair<Float, Float> calculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f7 - 1.0f, f6, f4);
        float floatValue = calculateRoundedEdgeIntercept.component1().floatValue();
        float floatValue2 = calculateRoundedEdgeIntercept.component2().floatValue();
        float f11 = floatValue + f4;
        float f12 = floatValue2 - f6;
        path.moveTo(f9 - f5, 0.0f);
        path.quadraticBezierTo(f9 - 1.0f, 0.0f, f2 + f11, f12);
        path.lineTo(f3 - f11, f12);
        path.quadraticBezierTo(f10 + 1.0f, 0.0f, f5 + f10, 0.0f);
        path.close();
    }

    public static /* synthetic */ BottomAppBarCutoutShape copy$default(BottomAppBarCutoutShape bottomAppBarCutoutShape, Shape shape, FabPlacement fabPlacement, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i2 & 2) != 0) {
            fabPlacement = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement);
    }

    @NotNull
    public final Shape component1() {
        return this.cutoutShape;
    }

    @NotNull
    public final FabPlacement component2() {
        return this.fabPlacement;
    }

    @NotNull
    public final BottomAppBarCutoutShape copy(@NotNull Shape cutoutShape, @NotNull FabPlacement fabPlacement) {
        Intrinsics.checkNotNullParameter(cutoutShape, "cutoutShape");
        Intrinsics.checkNotNullParameter(fabPlacement, "fabPlacement");
        return new BottomAppBarCutoutShape(cutoutShape, fabPlacement);
    }

    @Override // androidx.compose.ui.graphics.Shape
    @NotNull
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo426createOutlinePq9zytI(long j2, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m2239getWidthimpl(j2), Size.m2236getHeightimpl(j2)));
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo2308opN5in7k0(Path, Path2, PathOperation.Companion.m2653getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BottomAppBarCutoutShape) {
            BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) obj;
            return Intrinsics.areEqual(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && Intrinsics.areEqual(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
        }
        return false;
    }

    @NotNull
    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    @NotNull
    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    @NotNull
    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }
}
