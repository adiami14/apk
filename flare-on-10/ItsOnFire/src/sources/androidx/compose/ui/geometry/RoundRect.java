package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018�� >2\u00020\u0001:\u0001>BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\bø\u0001��¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u00020\bHÆ\u0003ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010#\u001a\u00020\bHÆ\u0003ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010%\u001a\u00020\bHÆ\u0003ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0011J\u0019\u0010'\u001a\u00020\bHÆ\u0003ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0011J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,ø\u0001��ø\u0001\u0001¢\u0006\u0004\b-\u0010.Jf\u0010/\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020��H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010��X\u0082\u000e¢\u0006\u0002\n��R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u00020\bø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u00020\bø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\bø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u00020\bø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/RoundRect.class */
public final class RoundRect {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final RoundRect Zero = RoundRectKt.m2223RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m2151getZerokKHJgLs());
    @Nullable
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/RoundRect$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }

    private RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
        this.topLeftCornerRadius = j2;
        this.topRightCornerRadius = j3;
        this.bottomRightCornerRadius = j4;
        this.bottomLeftCornerRadius = j5;
    }

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, (i2 & 16) != 0 ? CornerRadius.Companion.m2151getZerokKHJgLs() : j2, (i2 & 32) != 0 ? CornerRadius.Companion.m2151getZerokKHJgLs() : j3, (i2 & 64) != 0 ? CornerRadius.Companion.m2151getZerokKHJgLs() : j4, (i2 & 128) != 0 ? CornerRadius.Companion.m2151getZerokKHJgLs() : j5, null);
    }

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, j2, j3, j4, j5);
    }

    /* renamed from: copy-MDFrsts$default  reason: not valid java name */
    public static /* synthetic */ RoundRect m2210copyMDFrsts$default(RoundRect roundRect, float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = roundRect.left;
        }
        if ((i2 & 2) != 0) {
            f3 = roundRect.top;
        }
        if ((i2 & 4) != 0) {
            f4 = roundRect.right;
        }
        if ((i2 & 8) != 0) {
            f5 = roundRect.bottom;
        }
        if ((i2 & 16) != 0) {
            j2 = roundRect.topLeftCornerRadius;
        }
        if ((i2 & 32) != 0) {
            j3 = roundRect.topRightCornerRadius;
        }
        if ((i2 & 64) != 0) {
            j4 = roundRect.bottomRightCornerRadius;
        }
        if ((i2 & 128) != 0) {
            j5 = roundRect.bottomLeftCornerRadius;
        }
        return roundRect.m2216copyMDFrsts(f2, f3, f4, f5, j2, j3, j4, j5);
    }

    @NotNull
    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f2, float f3, float f4, float f5) {
        float f6 = f3 + f4;
        float f7 = f2;
        if (f6 > f5) {
            f7 = f2;
            if (!(f6 == 0.0f)) {
                f7 = Math.min(f2, f5 / f6);
            }
        }
        return f7;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        RoundRect roundRect2 = roundRect;
        if (roundRect == null) {
            float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m2142getYimpl(m2217getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m2142getYimpl(m2219getTopLeftCornerRadiuskKHJgLs()), getHeight()), CornerRadius.m2141getXimpl(m2219getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m2141getXimpl(m2220getTopRightCornerRadiuskKHJgLs()), getWidth()), CornerRadius.m2142getYimpl(m2220getTopRightCornerRadiuskKHJgLs()), CornerRadius.m2142getYimpl(m2218getBottomRightCornerRadiuskKHJgLs()), getHeight()), CornerRadius.m2141getXimpl(m2218getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m2141getXimpl(m2217getBottomLeftCornerRadiuskKHJgLs()), getWidth());
            roundRect2 = new RoundRect(getLeft() * minRadius, getTop() * minRadius, getRight() * minRadius, getBottom() * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m2141getXimpl(m2219getTopLeftCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m2142getYimpl(m2219getTopLeftCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2141getXimpl(m2220getTopRightCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m2142getYimpl(m2220getTopRightCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2141getXimpl(m2218getBottomRightCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m2142getYimpl(m2218getBottomRightCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2141getXimpl(m2217getBottomLeftCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m2142getYimpl(m2217getBottomLeftCornerRadiuskKHJgLs()) * minRadius), null);
            this._scaledRadiiRect = roundRect2;
        }
        return roundRect2;
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

    /* renamed from: component5-kKHJgLs  reason: not valid java name */
    public final long m2211component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs  reason: not valid java name */
    public final long m2212component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs  reason: not valid java name */
    public final long m2213component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs  reason: not valid java name */
    public final long m2214component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m2215containsk4lQ0M(long j2) {
        float m2167getXimpl;
        float m2168getYimpl;
        float m2141getXimpl;
        long m2217getBottomLeftCornerRadiuskKHJgLs;
        boolean z = false;
        if (Offset.m2167getXimpl(j2) < this.left || Offset.m2167getXimpl(j2) >= this.right || Offset.m2168getYimpl(j2) < this.top || Offset.m2168getYimpl(j2) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m2167getXimpl(j2) < this.left + CornerRadius.m2141getXimpl(scaledRadiiRect.m2219getTopLeftCornerRadiuskKHJgLs()) && Offset.m2168getYimpl(j2) < this.top + CornerRadius.m2142getYimpl(scaledRadiiRect.m2219getTopLeftCornerRadiuskKHJgLs())) {
            m2167getXimpl = (Offset.m2167getXimpl(j2) - this.left) - CornerRadius.m2141getXimpl(scaledRadiiRect.m2219getTopLeftCornerRadiuskKHJgLs());
            m2168getYimpl = (Offset.m2168getYimpl(j2) - this.top) - CornerRadius.m2142getYimpl(scaledRadiiRect.m2219getTopLeftCornerRadiuskKHJgLs());
            m2141getXimpl = CornerRadius.m2141getXimpl(scaledRadiiRect.m2219getTopLeftCornerRadiuskKHJgLs());
            m2217getBottomLeftCornerRadiuskKHJgLs = scaledRadiiRect.m2219getTopLeftCornerRadiuskKHJgLs();
        } else if (Offset.m2167getXimpl(j2) > this.right - CornerRadius.m2141getXimpl(scaledRadiiRect.m2220getTopRightCornerRadiuskKHJgLs()) && Offset.m2168getYimpl(j2) < this.top + CornerRadius.m2142getYimpl(scaledRadiiRect.m2220getTopRightCornerRadiuskKHJgLs())) {
            m2167getXimpl = (Offset.m2167getXimpl(j2) - this.right) + CornerRadius.m2141getXimpl(scaledRadiiRect.m2220getTopRightCornerRadiuskKHJgLs());
            m2168getYimpl = (Offset.m2168getYimpl(j2) - this.top) - CornerRadius.m2142getYimpl(scaledRadiiRect.m2220getTopRightCornerRadiuskKHJgLs());
            m2141getXimpl = CornerRadius.m2141getXimpl(scaledRadiiRect.m2220getTopRightCornerRadiuskKHJgLs());
            m2217getBottomLeftCornerRadiuskKHJgLs = scaledRadiiRect.m2220getTopRightCornerRadiuskKHJgLs();
        } else if (Offset.m2167getXimpl(j2) > this.right - CornerRadius.m2141getXimpl(scaledRadiiRect.m2218getBottomRightCornerRadiuskKHJgLs()) && Offset.m2168getYimpl(j2) > this.bottom - CornerRadius.m2142getYimpl(scaledRadiiRect.m2218getBottomRightCornerRadiuskKHJgLs())) {
            m2167getXimpl = (Offset.m2167getXimpl(j2) - this.right) + CornerRadius.m2141getXimpl(scaledRadiiRect.m2218getBottomRightCornerRadiuskKHJgLs());
            m2168getYimpl = (Offset.m2168getYimpl(j2) - this.bottom) + CornerRadius.m2142getYimpl(scaledRadiiRect.m2218getBottomRightCornerRadiuskKHJgLs());
            m2141getXimpl = CornerRadius.m2141getXimpl(scaledRadiiRect.m2218getBottomRightCornerRadiuskKHJgLs());
            m2217getBottomLeftCornerRadiuskKHJgLs = scaledRadiiRect.m2218getBottomRightCornerRadiuskKHJgLs();
        } else if (Offset.m2167getXimpl(j2) >= this.left + CornerRadius.m2141getXimpl(scaledRadiiRect.m2217getBottomLeftCornerRadiuskKHJgLs()) || Offset.m2168getYimpl(j2) <= this.bottom - CornerRadius.m2142getYimpl(scaledRadiiRect.m2217getBottomLeftCornerRadiuskKHJgLs())) {
            return true;
        } else {
            m2167getXimpl = (Offset.m2167getXimpl(j2) - this.left) - CornerRadius.m2141getXimpl(scaledRadiiRect.m2217getBottomLeftCornerRadiuskKHJgLs());
            m2168getYimpl = (Offset.m2168getYimpl(j2) - this.bottom) + CornerRadius.m2142getYimpl(scaledRadiiRect.m2217getBottomLeftCornerRadiuskKHJgLs());
            m2141getXimpl = CornerRadius.m2141getXimpl(scaledRadiiRect.m2217getBottomLeftCornerRadiuskKHJgLs());
            m2217getBottomLeftCornerRadiuskKHJgLs = scaledRadiiRect.m2217getBottomLeftCornerRadiuskKHJgLs();
        }
        float f2 = m2167getXimpl / m2141getXimpl;
        float m2142getYimpl = m2168getYimpl / CornerRadius.m2142getYimpl(m2217getBottomLeftCornerRadiuskKHJgLs);
        if ((f2 * f2) + (m2142getYimpl * m2142getYimpl) <= 1.0f) {
            z = true;
        }
        return z;
    }

    @NotNull
    /* renamed from: copy-MDFrsts  reason: not valid java name */
    public final RoundRect m2216copyMDFrsts(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        return new RoundRect(f2, f3, f4, f5, j2, j3, j4, j5, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundRect) {
            RoundRect roundRect = (RoundRect) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.left), (Object) Float.valueOf(roundRect.left)) && Intrinsics.areEqual((Object) Float.valueOf(this.top), (Object) Float.valueOf(roundRect.top)) && Intrinsics.areEqual((Object) Float.valueOf(this.right), (Object) Float.valueOf(roundRect.right)) && Intrinsics.areEqual((Object) Float.valueOf(this.bottom), (Object) Float.valueOf(roundRect.bottom)) && CornerRadius.m2140equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m2140equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m2140equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m2140equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m2217getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m2218getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m2219getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m2220getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m2143hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m2143hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m2143hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m2143hashCodeimpl(this.bottomLeftCornerRadius);
    }

    @NotNull
    public String toString() {
        long m2219getTopLeftCornerRadiuskKHJgLs = m2219getTopLeftCornerRadiuskKHJgLs();
        long m2220getTopRightCornerRadiuskKHJgLs = m2220getTopRightCornerRadiuskKHJgLs();
        long m2218getBottomRightCornerRadiuskKHJgLs = m2218getBottomRightCornerRadiuskKHJgLs();
        long m2217getBottomLeftCornerRadiuskKHJgLs = m2217getBottomLeftCornerRadiuskKHJgLs();
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m2140equalsimpl0(m2219getTopLeftCornerRadiuskKHJgLs, m2220getTopRightCornerRadiuskKHJgLs) || !CornerRadius.m2140equalsimpl0(m2220getTopRightCornerRadiuskKHJgLs, m2218getBottomRightCornerRadiuskKHJgLs) || !CornerRadius.m2140equalsimpl0(m2218getBottomRightCornerRadiuskKHJgLs, m2217getBottomLeftCornerRadiuskKHJgLs)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m2147toStringimpl(m2219getTopLeftCornerRadiuskKHJgLs)) + ", topRight=" + ((Object) CornerRadius.m2147toStringimpl(m2220getTopRightCornerRadiuskKHJgLs)) + ", bottomRight=" + ((Object) CornerRadius.m2147toStringimpl(m2218getBottomRightCornerRadiuskKHJgLs)) + ", bottomLeft=" + ((Object) CornerRadius.m2147toStringimpl(m2217getBottomLeftCornerRadiuskKHJgLs)) + ')';
        }
        if (CornerRadius.m2141getXimpl(m2219getTopLeftCornerRadiuskKHJgLs) == CornerRadius.m2142getYimpl(m2219getTopLeftCornerRadiuskKHJgLs)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2141getXimpl(m2219getTopLeftCornerRadiuskKHJgLs), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2141getXimpl(m2219getTopLeftCornerRadiuskKHJgLs), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2142getYimpl(m2219getTopLeftCornerRadiuskKHJgLs), 1) + ')';
    }
}
