package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001B2\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005ø\u0001��¢\u0006\u0002\u0010\tJ!\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004ø\u0001��¢\u0006\u0002\n��R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "center", "Landroidx/compose/ui/geometry/Offset;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "Landroidx/compose/ui/geometry/Size;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/SweepGradient.class */
public final class SweepGradient extends ShaderBrush {
    private final long center;
    @NotNull
    private final List<Color> colors;
    @Nullable
    private final List<Float> stops;

    private SweepGradient(long j2, List<Color> list, List<Float> list2) {
        this.center = j2;
        this.colors = list;
        this.stops = list2;
    }

    public /* synthetic */ SweepGradient(long j2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, list, (i2 & 4) != 0 ? null : list2, null);
    }

    public /* synthetic */ SweepGradient(long j2, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, list, list2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2385createShaderuvyYCjk(long j2) {
        long Offset;
        if (OffsetKt.m2188isUnspecifiedk4lQ0M(this.center)) {
            Offset = SizeKt.m2249getCenteruvyYCjk(j2);
        } else {
            Offset = OffsetKt.Offset((Offset.m2167getXimpl(this.center) > Float.POSITIVE_INFINITY ? 1 : (Offset.m2167getXimpl(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m2239getWidthimpl(j2) : Offset.m2167getXimpl(this.center), (Offset.m2168getYimpl(this.center) > Float.POSITIVE_INFINITY ? 1 : (Offset.m2168getYimpl(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m2236getHeightimpl(j2) : Offset.m2168getYimpl(this.center));
        }
        return ShaderKt.m2682SweepGradientShader9KIMszo(Offset, this.colors, this.stops);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SweepGradient) {
            SweepGradient sweepGradient = (SweepGradient) obj;
            return Offset.m2164equalsimpl0(this.center, sweepGradient.center) && Intrinsics.areEqual(this.colors, sweepGradient.colors) && Intrinsics.areEqual(this.stops, sweepGradient.stops);
        }
        return false;
    }

    public int hashCode() {
        int m2169hashCodeimpl = Offset.m2169hashCodeimpl(this.center);
        int hashCode = this.colors.hashCode();
        List<Float> list = this.stops;
        return (((m2169hashCodeimpl * 31) + hashCode) * 31) + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str;
        if (OffsetKt.m2186isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m2175toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }
}
