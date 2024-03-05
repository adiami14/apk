package androidx.compose.ui.graphics;

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
@Metadata(d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001BD\b��\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001��¢\u0006\u0002\u0010\fJ!\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001��¢\u0006\u0002\n��R\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/RadialGradient.class */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    @NotNull
    private final List<Color> colors;
    private final float radius;
    @Nullable
    private final List<Float> stops;
    private final int tileMode;

    private RadialGradient(List<Color> list, List<Float> list2, long j2, float f2, int i2) {
        this.colors = list;
        this.stops = list2;
        this.center = j2;
        this.radius = f2;
        this.tileMode = i2;
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? null : list2, j2, f2, (i3 & 16) != 0 ? TileMode.Companion.m2733getClamp3opZhB0() : i2, null);
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j2, f2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    @Override // androidx.compose.ui.graphics.ShaderBrush
    @org.jetbrains.annotations.NotNull
    /* renamed from: createShader-uvyYCjk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Shader mo2385createShaderuvyYCjk(long r8) {
        /*
            r7 = this;
            r0 = r7
            long r0 = r0.center
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.m2188isUnspecifiedk4lQ0M(r0)
            r10 = r0
            r0 = 1
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L26
            r0 = r8
            long r0 = androidx.compose.ui.geometry.SizeKt.m2249getCenteruvyYCjk(r0)
            r12 = r0
            r0 = r12
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            r14 = r0
        L1c:
            r0 = r12
            float r0 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r0)
            r15 = r0
            goto L80
        L26:
            r0 = r7
            long r0 = r0.center
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            r1 = 2139095040(0x7f800000, float:Infinity)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L39
            r0 = 1
            r16 = r0
            goto L3c
        L39:
            r0 = 0
            r16 = r0
        L3c:
            r0 = r16
            if (r0 == 0) goto L4a
            r0 = r8
            float r0 = androidx.compose.ui.geometry.Size.m2239getWidthimpl(r0)
            r14 = r0
            goto L53
        L4a:
            r0 = r7
            long r0 = r0.center
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            r14 = r0
        L53:
            r0 = r7
            long r0 = r0.center
            float r0 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r0)
            r1 = 2139095040(0x7f800000, float:Infinity)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L66
            r0 = 1
            r16 = r0
            goto L69
        L66:
            r0 = 0
            r16 = r0
        L69:
            r0 = r16
            if (r0 == 0) goto L77
            r0 = r8
            float r0 = androidx.compose.ui.geometry.Size.m2236getHeightimpl(r0)
            r15 = r0
            goto L80
        L77:
            r0 = r7
            long r0 = r0.center
            r12 = r0
            goto L1c
        L80:
            r0 = r7
            java.util.List<androidx.compose.ui.graphics.Color> r0 = r0.colors
            r17 = r0
            r0 = r7
            java.util.List<java.lang.Float> r0 = r0.stops
            r18 = r0
            r0 = r14
            r1 = r15
            long r0 = androidx.compose.ui.geometry.OffsetKt.Offset(r0, r1)
            r12 = r0
            r0 = r7
            float r0 = r0.radius
            r14 = r0
            r0 = r14
            r1 = 2139095040(0x7f800000, float:Infinity)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Laa
            r0 = r11
            r16 = r0
            goto Lad
        Laa:
            r0 = 0
            r16 = r0
        Lad:
            r0 = r16
            if (r0 == 0) goto Lbe
            r0 = r8
            float r0 = androidx.compose.ui.geometry.Size.m2238getMinDimensionimpl(r0)
            r1 = 2
            float r1 = (float) r1
            float r0 = r0 / r1
            r14 = r0
            goto Lbe
        Lbe:
            r0 = r12
            r1 = r14
            r2 = r17
            r3 = r18
            r4 = r7
            int r4 = r4.tileMode
            android.graphics.Shader r0 = androidx.compose.ui.graphics.ShaderKt.m2680RadialGradientShader8uybcMk(r0, r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.RadialGradient.mo2385createShaderuvyYCjk(long):android.graphics.Shader");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadialGradient) {
            RadialGradient radialGradient = (RadialGradient) obj;
            if (Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.stops, radialGradient.stops) && Offset.m2164equalsimpl0(this.center, radialGradient.center)) {
                return ((this.radius > radialGradient.radius ? 1 : (this.radius == radialGradient.radius ? 0 : -1)) == 0) && TileMode.m2729equalsimpl0(this.tileMode, radialGradient.tileMode);
            }
            return false;
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2364getIntrinsicSizeNHjbRc() {
        long m2247getUnspecifiedNHjbRc;
        float f2 = this.radius;
        if ((Float.isInfinite(f2) || Float.isNaN(f2)) ? false : true) {
            float f3 = this.radius;
            float f4 = 2;
            m2247getUnspecifiedNHjbRc = SizeKt.Size(f3 * f4, f3 * f4);
        } else {
            m2247getUnspecifiedNHjbRc = Size.Companion.m2247getUnspecifiedNHjbRc();
        }
        return m2247getUnspecifiedNHjbRc;
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode();
        List<Float> list = this.stops;
        return (((((((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + Offset.m2169hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m2730hashCodeimpl(this.tileMode);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m2186isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m2175toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        float f2 = this.radius;
        if ((Float.isInfinite(f2) || Float.isNaN(f2)) ? false : true) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m2731toStringimpl(this.tileMode)) + ')';
    }
}
