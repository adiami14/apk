package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��.\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a#\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aC\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001��ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a;\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001��ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001f\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001��ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u0015\u0010��\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/RoundRectKt.class */
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f2, float f3, float f4, float f5, float f6, float f7) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f6, f7);
        return new RoundRect(f2, f3, f4, f5, CornerRadius, CornerRadius, CornerRadius, CornerRadius, null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f2, float f3) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f2, f3);
    }

    @NotNull
    /* renamed from: RoundRect-ZAM2FJo  reason: not valid java name */
    public static final RoundRect m2221RoundRectZAM2FJo(@NotNull Rect rect, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j2, j3, j4, j5, null);
    }

    /* renamed from: RoundRect-ZAM2FJo$default  reason: not valid java name */
    public static /* synthetic */ RoundRect m2222RoundRectZAM2FJo$default(Rect rect, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = CornerRadius.Companion.m2151getZerokKHJgLs();
        }
        if ((i2 & 4) != 0) {
            j3 = CornerRadius.Companion.m2151getZerokKHJgLs();
        }
        if ((i2 & 8) != 0) {
            j4 = CornerRadius.Companion.m2151getZerokKHJgLs();
        }
        if ((i2 & 16) != 0) {
            j5 = CornerRadius.Companion.m2151getZerokKHJgLs();
        }
        return m2221RoundRectZAM2FJo(rect, j2, j3, j4, j5);
    }

    @NotNull
    /* renamed from: RoundRect-gG7oq9Y  reason: not valid java name */
    public static final RoundRect m2223RoundRectgG7oq9Y(float f2, float f3, float f4, float f5, long j2) {
        return RoundRect(f2, f3, f4, f5, CornerRadius.m2141getXimpl(j2), CornerRadius.m2142getYimpl(j2));
    }

    @NotNull
    /* renamed from: RoundRect-sniSvfs  reason: not valid java name */
    public static final RoundRect m2224RoundRectsniSvfs(@NotNull Rect rect, long j2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect, CornerRadius.m2141getXimpl(j2), CornerRadius.m2142getYimpl(j2));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m2141getXimpl(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m2141getXimpl(roundRect.m2219getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m2142getYimpl(roundRect.m2219getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m2142getYimpl(roundRect.m2220getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m2141getXimpl(roundRect.m2220getTopRightCornerRadiuskKHJgLs()), CornerRadius.m2141getXimpl(roundRect.m2218getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m2142getYimpl(roundRect.m2218getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m2142getYimpl(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        boolean z = true;
        if (!(roundRect.getWidth() == roundRect.getHeight()) || !isEllipse(roundRect)) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
        if (r7.getHeight() <= (androidx.compose.ui.geometry.CornerRadius.m2142getYimpl(r7.m2219getTopLeftCornerRadiuskKHJgLs()) * 2.0d)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isEllipse(@org.jetbrains.annotations.NotNull androidx.compose.ui.geometry.RoundRect r7) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRectKt.isEllipse(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
        if (((java.lang.Float.isInfinite(r0) || java.lang.Float.isNaN(r0)) ? false : true) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isFinite(@org.jetbrains.annotations.NotNull androidx.compose.ui.geometry.RoundRect r3) {
        /*
            r0 = r3
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r3
            float r0 = r0.getLeft()
            r4 = r0
            r0 = r4
            boolean r0 = java.lang.Float.isInfinite(r0)
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L23
            r0 = r4
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L23
            r0 = 1
            r7 = r0
            goto L26
        L23:
            r0 = 0
            r7 = r0
        L26:
            r0 = r7
            if (r0 == 0) goto L91
            r0 = r3
            float r0 = r0.getTop()
            r4 = r0
            r0 = r4
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L44
            r0 = r4
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = 1
            r7 = r0
            goto L47
        L44:
            r0 = 0
            r7 = r0
        L47:
            r0 = r7
            if (r0 == 0) goto L91
            r0 = r3
            float r0 = r0.getRight()
            r4 = r0
            r0 = r4
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L65
            r0 = r4
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L65
            r0 = 1
            r7 = r0
            goto L68
        L65:
            r0 = 0
            r7 = r0
        L68:
            r0 = r7
            if (r0 == 0) goto L91
            r0 = r3
            float r0 = r0.getBottom()
            r4 = r0
            r0 = r4
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto L86
            r0 = r4
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L86
            r0 = 1
            r7 = r0
            goto L89
        L86:
            r0 = 0
            r7 = r0
        L89:
            r0 = r7
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = 0
            r6 = r0
        L93:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRectKt.isFinite(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if ((androidx.compose.ui.geometry.CornerRadius.m2142getYimpl(r3.m2219getTopLeftCornerRadiuskKHJgLs()) == 0.0f) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if ((androidx.compose.ui.geometry.CornerRadius.m2142getYimpl(r3.m2220getTopRightCornerRadiuskKHJgLs()) == 0.0f) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
        if ((androidx.compose.ui.geometry.CornerRadius.m2142getYimpl(r3.m2217getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isRect(@org.jetbrains.annotations.NotNull androidx.compose.ui.geometry.RoundRect r3) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRectKt.isRect(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
        if ((androidx.compose.ui.geometry.CornerRadius.m2141getXimpl(r4.m2219getTopLeftCornerRadiuskKHJgLs()) == androidx.compose.ui.geometry.CornerRadius.m2142getYimpl(r4.m2217getBottomLeftCornerRadiuskKHJgLs())) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isSimple(@org.jetbrains.annotations.NotNull androidx.compose.ui.geometry.RoundRect r4) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRectKt.isSimple(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect start, @NotNull RoundRect stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new RoundRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f2), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f2), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f2), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f2), CornerRadiusKt.m2152lerp3Ry4LBc(start.m2219getTopLeftCornerRadiuskKHJgLs(), stop.m2219getTopLeftCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m2152lerp3Ry4LBc(start.m2220getTopRightCornerRadiuskKHJgLs(), stop.m2220getTopRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m2152lerp3Ry4LBc(start.m2218getBottomRightCornerRadiuskKHJgLs(), stop.m2218getBottomRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m2152lerp3Ry4LBc(start.m2217getBottomLeftCornerRadiuskKHJgLs(), stop.m2217getBottomLeftCornerRadiuskKHJgLs(), f2), null);
    }

    @NotNull
    /* renamed from: translate-Uv8p0NA  reason: not valid java name */
    public static final RoundRect m2225translateUv8p0NA(@NotNull RoundRect translate, long j2) {
        Intrinsics.checkNotNullParameter(translate, "$this$translate");
        return new RoundRect(translate.getLeft() + Offset.m2167getXimpl(j2), translate.getTop() + Offset.m2168getYimpl(j2), translate.getRight() + Offset.m2167getXimpl(j2), translate.getBottom() + Offset.m2168getYimpl(j2), translate.m2219getTopLeftCornerRadiuskKHJgLs(), translate.m2220getTopRightCornerRadiuskKHJgLs(), translate.m2218getBottomRightCornerRadiuskKHJgLs(), translate.m2217getBottomLeftCornerRadiuskKHJgLs(), null);
    }
}
