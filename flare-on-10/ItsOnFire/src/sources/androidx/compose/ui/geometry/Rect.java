package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018�� U2\u00020\u0001:\u0001UB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u001b\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020\rø\u0001��ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ1\u0010D\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0010\u0010E\u001a\u00020��2\u0006\u0010F\u001a\u00020\u0003H\u0007J\u0013\u0010G\u001a\u00020\u001e2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\u0010\u0010K\u001a\u00020��2\u0006\u0010F\u001a\u00020\u0003H\u0007J\u0010\u0010L\u001a\u00020��2\u0006\u0010H\u001a\u00020��H\u0007J\u000e\u0010M\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020��J\b\u0010N\u001a\u00020OH\u0016J\u001d\u0010P\u001a\u00020��2\u0006\u0010A\u001a\u00020\rH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJ\u0018\u0010P\u001a\u00020��2\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\u0003H\u0007R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\t\u001a\u0004\b\u001d\u0010 R\u001a\u0010!\u001a\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\t\u001a\u0004\b!\u0010 R\u001a\u0010#\u001a\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\t\u001a\u0004\b#\u0010 R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b%\u0010\t\u001a\u0004\b&\u0010\u000bR\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u000bR\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u000bR#\u0010-\u001a\u00020.8FX\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b1\u0010\t\u001a\u0004\b2\u0010\u000bR\u001a\u00103\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b4\u0010\u000fR\u001a\u00105\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b6\u0010\u000fR\u001a\u00107\u001a\u00020\r8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b8\u0010\u000fR\u001a\u00109\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010\t\u001a\u0004\b;\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom$annotations", "()V", "getBottom", "()F", "bottomCenter", "Landroidx/compose/ui/geometry/Offset;", "getBottomCenter-F1C5BW0", "()J", "bottomLeft", "getBottomLeft-F1C5BW0", "bottomRight", "getBottomRight-F1C5BW0", "center", "getCenter-F1C5BW0", "centerLeft", "getCenterLeft-F1C5BW0", "centerRight", "getCenterRight-F1C5BW0", "height", "getHeight$annotations", "getHeight", "isEmpty", "", "isEmpty$annotations", "()Z", "isFinite", "isFinite$annotations", "isInfinite", "isInfinite$annotations", "getLeft$annotations", "getLeft", "maxDimension", "getMaxDimension", "minDimension", "getMinDimension", "getRight$annotations", "getRight", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc$annotations", "getSize-NH-jbRc", "getTop$annotations", "getTop", "topCenter", "getTopCenter-F1C5BW0", "topLeft", "getTopLeft-F1C5BW0", "topRight", "getTopRight-F1C5BW0", "width", "getWidth$annotations", "getWidth", "component1", "component2", "component3", "component4", "contains", "offset", "contains-k-4lQ0M", "(J)Z", "copy", "deflate", "delta", "equals", "other", "hashCode", "", "inflate", "intersect", "overlaps", "toString", "", "translate", "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translateX", "translateY", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/Rect.class */
public final class Rect {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/Rect$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final Rect getZero() {
            return Rect.Zero;
        }
    }

    public Rect(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = rect.left;
        }
        if ((i2 & 2) != 0) {
            f3 = rect.top;
        }
        if ((i2 & 4) != 0) {
            f4 = rect.right;
        }
        if ((i2 & 8) != 0) {
            f5 = rect.bottom;
        }
        return rect.copy(f2, f3, f4, f5);
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* renamed from: getSize-NH-jbRc$annotations  reason: not valid java name */
    public static /* synthetic */ void m2193getSizeNHjbRc$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m2194containsk4lQ0M(long j2) {
        return Offset.m2167getXimpl(j2) >= this.left && Offset.m2167getXimpl(j2) < this.right && Offset.m2168getYimpl(j2) >= this.top && Offset.m2168getYimpl(j2) < this.bottom;
    }

    @NotNull
    public final Rect copy(float f2, float f3, float f4, float f5) {
        return new Rect(f2, f3, f4, f5);
    }

    @Stable
    @NotNull
    public final Rect deflate(float f2) {
        return inflate(-f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rect) {
            Rect rect = (Rect) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.left), (Object) Float.valueOf(rect.left)) && Intrinsics.areEqual((Object) Float.valueOf(this.top), (Object) Float.valueOf(rect.top)) && Intrinsics.areEqual((Object) Float.valueOf(this.right), (Object) Float.valueOf(rect.right)) && Intrinsics.areEqual((Object) Float.valueOf(this.bottom), (Object) Float.valueOf(rect.bottom));
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0  reason: not valid java name */
    public final long m2195getBottomCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.bottom);
    }

    /* renamed from: getBottomLeft-F1C5BW0  reason: not valid java name */
    public final long m2196getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    /* renamed from: getBottomRight-F1C5BW0  reason: not valid java name */
    public final long m2197getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    public final long m2198getCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterLeft-F1C5BW0  reason: not valid java name */
    public final long m2199getCenterLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterRight-F1C5BW0  reason: not valid java name */
    public final long m2200getCenterRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top + (getHeight() / 2.0f));
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m2201getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0  reason: not valid java name */
    public final long m2202getTopCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top);
    }

    /* renamed from: getTopLeft-F1C5BW0  reason: not valid java name */
    public final long m2203getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    /* renamed from: getTopRight-F1C5BW0  reason: not valid java name */
    public final long m2204getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    @Stable
    @NotNull
    public final Rect inflate(float f2) {
        return new Rect(this.left - f2, this.top - f2, this.right + f2, this.bottom + f2);
    }

    @Stable
    @NotNull
    public final Rect intersect(@NotNull Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Rect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        if (((java.lang.Float.isInfinite(r0) || java.lang.Float.isNaN(r0)) ? false : true) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isFinite() {
        /*
            r2 = this;
            r0 = r2
            float r0 = r0.left
            r3 = r0
            r0 = r3
            boolean r0 = java.lang.Float.isInfinite(r0)
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L1d
            r0 = r3
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1d
            r0 = 1
            r6 = r0
            goto L20
        L1d:
            r0 = 0
            r6 = r0
        L20:
            r0 = r6
            if (r0 == 0) goto L8b
            r0 = r2
            float r0 = r0.top
            r3 = r0
            r0 = r3
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L3e
            r0 = r3
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3e
            r0 = 1
            r6 = r0
            goto L41
        L3e:
            r0 = 0
            r6 = r0
        L41:
            r0 = r6
            if (r0 == 0) goto L8b
            r0 = r2
            float r0 = r0.right
            r3 = r0
            r0 = r3
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L5f
            r0 = r3
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5f
            r0 = 1
            r6 = r0
            goto L62
        L5f:
            r0 = 0
            r6 = r0
        L62:
            r0 = r6
            if (r0 == 0) goto L8b
            r0 = r2
            float r0 = r0.bottom
            r3 = r0
            r0 = r3
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L80
            r0 = r3
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L80
            r0 = 1
            r6 = r0
            goto L83
        L80:
            r0 = 0
            r6 = r0
        L83:
            r0 = r6
            if (r0 == 0) goto L8b
            goto L8d
        L8b:
            r0 = 0
            r5 = r0
        L8d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.Rect.isFinite():boolean");
    }

    public final boolean isInfinite() {
        return this.left >= Float.POSITIVE_INFINITY || this.top >= Float.POSITIVE_INFINITY || this.right >= Float.POSITIVE_INFINITY || this.bottom >= Float.POSITIVE_INFINITY;
    }

    public final boolean overlaps(@NotNull Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    @NotNull
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    @Stable
    @NotNull
    public final Rect translate(float f2, float f3) {
        return new Rect(this.left + f2, this.top + f3, this.right + f2, this.bottom + f3);
    }

    @Stable
    @NotNull
    /* renamed from: translate-k-4lQ0M  reason: not valid java name */
    public final Rect m2205translatek4lQ0M(long j2) {
        return new Rect(this.left + Offset.m2167getXimpl(j2), this.top + Offset.m2168getYimpl(j2), this.right + Offset.m2167getXimpl(j2), this.bottom + Offset.m2168getYimpl(j2));
    }
}
