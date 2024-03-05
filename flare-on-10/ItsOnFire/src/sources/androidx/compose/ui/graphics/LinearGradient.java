package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001BD\b��\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001��¢\u0006\u0002\u0010\fJ!\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001��¢\u0006\u0002\n��R\u0019\u0010\t\u001a\u00020\bX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/LinearGradient.class */
public final class LinearGradient extends ShaderBrush {
    @NotNull
    private final List<Color> colors;
    private final long end;
    private final long start;
    @Nullable
    private final List<Float> stops;
    private final int tileMode;

    private LinearGradient(List<Color> list, List<Float> list2, long j2, long j3, int i2) {
        this.colors = list;
        this.stops = list2;
        this.start = j2;
        this.end = j3;
        this.tileMode = i2;
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j2, long j3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? null : list2, j2, j3, (i3 & 16) != 0 ? TileMode.Companion.m2733getClamp3opZhB0() : i2, null);
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j2, j3, i2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2385createShaderuvyYCjk(long j2) {
        return ShaderKt.m2678LinearGradientShaderVjE6UOU(OffsetKt.Offset((Offset.m2167getXimpl(this.start) > Float.POSITIVE_INFINITY ? 1 : (Offset.m2167getXimpl(this.start) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m2239getWidthimpl(j2) : Offset.m2167getXimpl(this.start), (Offset.m2168getYimpl(this.start) > Float.POSITIVE_INFINITY ? 1 : (Offset.m2168getYimpl(this.start) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m2236getHeightimpl(j2) : Offset.m2168getYimpl(this.start)), OffsetKt.Offset((Offset.m2167getXimpl(this.end) > Float.POSITIVE_INFINITY ? 1 : (Offset.m2167getXimpl(this.end) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m2239getWidthimpl(j2) : Offset.m2167getXimpl(this.end), (Offset.m2168getYimpl(this.end) > Float.POSITIVE_INFINITY ? 1 : (Offset.m2168getYimpl(this.end) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m2236getHeightimpl(j2) : Offset.m2168getYimpl(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinearGradient) {
            LinearGradient linearGradient = (LinearGradient) obj;
            return Intrinsics.areEqual(this.colors, linearGradient.colors) && Intrinsics.areEqual(this.stops, linearGradient.stops) && Offset.m2164equalsimpl0(this.start, linearGradient.start) && Offset.m2164equalsimpl0(this.end, linearGradient.end) && TileMode.m2729equalsimpl0(this.tileMode, linearGradient.tileMode);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo2364getIntrinsicSizeNHjbRc() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.LinearGradient.mo2364getIntrinsicSizeNHjbRc():long");
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode();
        List<Float> list = this.stops;
        return (((((((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + Offset.m2169hashCodeimpl(this.start)) * 31) + Offset.m2169hashCodeimpl(this.end)) * 31) + TileMode.m2730hashCodeimpl(this.tileMode);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m2184isFinitek4lQ0M(this.start)) {
            str = "start=" + ((Object) Offset.m2175toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if (OffsetKt.m2184isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((Object) Offset.m2175toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m2731toStringimpl(this.tileMode)) + ')';
    }
}
