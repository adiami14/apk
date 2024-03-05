package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��:\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\u001a8\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH��\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u001a=\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", "path", "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/ShapeContainingUtilKt.class */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        return CornerRadius.m2141getXimpl(roundRect.m2219getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m2141getXimpl(roundRect.m2220getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m2141getXimpl(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m2141getXimpl(roundRect.m2218getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m2142getYimpl(roundRect.m2219getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m2142getYimpl(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && CornerRadius.m2142getYimpl(roundRect.m2220getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m2142getYimpl(roundRect.m2218getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight();
    }

    public static final boolean isInOutline(@NotNull Outline outline, float f2, float f3, @Nullable Path path, @Nullable Path path2) {
        boolean isInPath;
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            isInPath = isInRectangle(((Outline.Rectangle) outline).getRect(), f2, f3);
        } else if (outline instanceof Outline.Rounded) {
            isInPath = isInRoundedRect((Outline.Rounded) outline, f2, f3, path, path2);
        } else if (!(outline instanceof Outline.Generic)) {
            throw new NoWhenBranchMatchedException();
        } else {
            isInPath = isInPath(((Outline.Generic) outline).getPath(), f2, f3, path, path2);
        }
        return isInPath;
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f2, float f3, Path path, Path path2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            path = null;
        }
        if ((i2 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f2, f3, path, path2);
    }

    private static final boolean isInPath(Path path, float f2, float f3, Path path2, Path path3) {
        Rect rect = new Rect(f2 - 0.005f, f3 - 0.005f, f2 + 0.005f, f3 + 0.005f);
        Path path4 = path2;
        if (path2 == null) {
            path4 = AndroidPath_androidKt.Path();
        }
        path4.addRect(rect);
        Path path5 = path3;
        if (path3 == null) {
            path5 = AndroidPath_androidKt.Path();
        }
        path5.mo2308opN5in7k0(path, path4, PathOperation.Companion.m2654getIntersectb3I0S0c());
        boolean isEmpty = path5.isEmpty();
        path5.reset();
        path4.reset();
        return !isEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f2, float f3) {
        return rect.getLeft() <= f2 && f2 < rect.getRight() && rect.getTop() <= f3 && f3 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f2, float f3, Path path, Path path2) {
        boolean z;
        long m2218getBottomRightCornerRadiuskKHJgLs;
        RoundRect roundRect = rounded.getRoundRect();
        if (f2 < roundRect.getLeft() || f2 >= roundRect.getRight() || f3 < roundRect.getTop() || f3 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect(roundRect);
            return isInPath(Path, f2, f3, path, path2);
        }
        float m2141getXimpl = CornerRadius.m2141getXimpl(roundRect.m2219getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        float m2142getYimpl = CornerRadius.m2142getYimpl(roundRect.m2219getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right = roundRect.getRight() - CornerRadius.m2141getXimpl(roundRect.m2220getTopRightCornerRadiuskKHJgLs());
        float m2142getYimpl2 = CornerRadius.m2142getYimpl(roundRect.m2220getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right2 = roundRect.getRight() - CornerRadius.m2141getXimpl(roundRect.m2218getBottomRightCornerRadiuskKHJgLs());
        float bottom = roundRect.getBottom() - CornerRadius.m2142getYimpl(roundRect.m2218getBottomRightCornerRadiuskKHJgLs());
        float bottom2 = roundRect.getBottom() - CornerRadius.m2142getYimpl(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs());
        float m2141getXimpl2 = CornerRadius.m2141getXimpl(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        if (f2 < m2141getXimpl && f3 < m2142getYimpl) {
            m2218getBottomRightCornerRadiuskKHJgLs = roundRect.m2219getTopLeftCornerRadiuskKHJgLs();
            bottom2 = m2142getYimpl;
        } else if (f2 < m2141getXimpl2 && f3 > bottom2) {
            m2218getBottomRightCornerRadiuskKHJgLs = roundRect.m2217getBottomLeftCornerRadiuskKHJgLs();
            m2141getXimpl = m2141getXimpl2;
        } else if (f2 > right && f3 < m2142getYimpl2) {
            m2218getBottomRightCornerRadiuskKHJgLs = roundRect.m2220getTopRightCornerRadiuskKHJgLs();
            m2141getXimpl = right;
            bottom2 = m2142getYimpl2;
        } else if (f2 <= right2 || f3 <= bottom) {
            z = true;
            return z;
        } else {
            m2218getBottomRightCornerRadiuskKHJgLs = roundRect.m2218getBottomRightCornerRadiuskKHJgLs();
            m2141getXimpl = right2;
            bottom2 = bottom;
        }
        z = m4256isWithinEllipseVE1yxkc(f2, f3, m2218getBottomRightCornerRadiuskKHJgLs, m2141getXimpl, bottom2);
        return z;
    }

    /* renamed from: isWithinEllipse-VE1yxkc  reason: not valid java name */
    private static final boolean m4256isWithinEllipseVE1yxkc(float f2, float f3, long j2, float f4, float f5) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float m2141getXimpl = CornerRadius.m2141getXimpl(j2);
        float m2142getYimpl = CornerRadius.m2142getYimpl(j2);
        return ((f6 * f6) / (m2141getXimpl * m2141getXimpl)) + ((f7 * f7) / (m2142getYimpl * m2142getYimpl)) <= 1.0f;
    }
}
