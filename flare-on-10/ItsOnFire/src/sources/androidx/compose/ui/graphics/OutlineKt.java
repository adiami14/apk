package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��|\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\u001a\u0012\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001aQ\u0010\u0005\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aQ\u0010\u0005\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u009f\u0001\u0010\u001a\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!2,\u0010\"\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!2,\u0010%\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!H\u0082\b\u001a\f\u0010'\u001a\u00020(*\u00020#H\u0002\u001a\u0014\u0010)\u001a\u00020**\u00020\u001dH\u0002ø\u0001��¢\u0006\u0002\u0010+\u001a\u0014\u0010)\u001a\u00020**\u00020#H\u0002ø\u0001��¢\u0006\u0002\u0010,\u001a\u0014\u0010-\u001a\u00020.*\u00020\u001dH\u0002ø\u0001��¢\u0006\u0002\u0010+\u001a\u0014\u0010-\u001a\u00020.*\u00020#H\u0002ø\u0001��¢\u0006\u0002\u0010,\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"addOutline", "", "Landroidx/compose/ui/graphics/Path;", "outline", "Landroidx/compose/ui/graphics/Outline;", "drawOutline", "Landroidx/compose/ui/graphics/Canvas;", "paint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutlineHelper", "drawRectBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "rect", "Lkotlin/ExtensionFunctionType;", "drawRoundedRectBlock", "Landroidx/compose/ui/geometry/RoundRect;", "rrect", "drawPathBlock", "path", "hasSameCornerRadius", "", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Rect;)J", "(Landroidx/compose/ui/geometry/RoundRect;)J", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/OutlineKt.class */
public final class OutlineKt {
    public static final void addOutline(@NotNull Path path, @NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            path.addRect(((Outline.Rectangle) outline).getRect());
        } else if (outline instanceof Outline.Rounded) {
            path.addRoundRect(((Outline.Rounded) outline).getRoundRect());
        } else if (!(outline instanceof Outline.Generic)) {
            throw new NoWhenBranchMatchedException();
        } else {
            Path.DefaultImpls.m2631addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    public static final void drawOutline(@NotNull Canvas canvas, @NotNull Outline outline, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
        } else if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                canvas.drawPath(roundRectPath$ui_graphics_release, paint);
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), CornerRadius.m2141getXimpl(rounded.getRoundRect().m2217getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m2142getYimpl(rounded.getRoundRect().m2217getBottomLeftCornerRadiuskKHJgLs()), paint);
            }
        }
    }

    /* renamed from: drawOutline-hn5TExg */
    public static final void m2614drawOutlinehn5TExg(@NotNull DrawScope drawOutline, @NotNull Outline outline, @NotNull Brush brush, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Path path;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawOutline.mo2836drawRectAsUm42w(brush, topLeft(rect), size(rect), f2, style, colorFilter, i2);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawOutline.mo2838drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m2141getXimpl(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f2, style, colorFilter, i2);
                return;
            }
        } else if (!(outline instanceof Outline.Generic)) {
            throw new NoWhenBranchMatchedException();
        } else {
            path = ((Outline.Generic) outline).getPath();
        }
        drawOutline.mo2832drawPathGBMwjPU(path, brush, f2, style, colorFilter, i2);
    }

    /* renamed from: drawOutline-hn5TExg$default */
    public static /* synthetic */ void m2615drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f2 = 1.0f;
        }
        if ((i3 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        if ((i3 & 32) != 0) {
            i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
        }
        m2614drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle, colorFilter, i2);
    }

    /* renamed from: drawOutline-wDX37Ww */
    public static final void m2616drawOutlinewDX37Ww(@NotNull DrawScope drawOutline, @NotNull Outline outline, long j2, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Path path;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawOutline.mo2837drawRectnJ9OG0(j2, topLeft(rect), size(rect), f2, style, colorFilter, i2);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawOutline.mo2839drawRoundRectuAw5IA(j2, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m2141getXimpl(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), style, f2, colorFilter, i2);
                return;
            }
        } else if (!(outline instanceof Outline.Generic)) {
            throw new NoWhenBranchMatchedException();
        } else {
            path = ((Outline.Generic) outline).getPath();
        }
        drawOutline.mo2833drawPathLG529CI(path, j2, f2, style, colorFilter, i2);
    }

    /* renamed from: drawOutline-wDX37Ww$default */
    public static /* synthetic */ void m2617drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f2 = 1.0f;
        }
        if ((i3 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        if ((i3 & 32) != 0) {
            i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
        }
        m2616drawOutlinewDX37Ww(drawScope, outline, j2, f2, drawStyle, colorFilter, i2);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, Function2<? super DrawScope, ? super Rect, Unit> function2, Function2<? super DrawScope, ? super RoundRect, Unit> function22, Function2<? super DrawScope, ? super Path, Unit> function23) {
        if (outline instanceof Outline.Rectangle) {
            function2.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
        } else if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            function23.invoke(drawScope, ((Outline.Generic) outline).getPath());
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                function23.invoke(drawScope, roundRectPath$ui_graphics_release);
            } else {
                function22.invoke(drawScope, rounded.getRoundRect());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean hasSameCornerRadius(androidx.compose.ui.geometry.RoundRect r4) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.OutlineKt.hasSameCornerRadius(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    private static final long size(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long size(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    private static final long topLeft(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long topLeft(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }
}
