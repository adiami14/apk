package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��0\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u000e\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\"\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a&\u0010\n\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a,\u0010\f\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a\u001e\u0010\u000f\u001a\u00020\u0005*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086\bø\u0001��\u001a.\u0010\u0012\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086\bø\u0001��\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Canvas", "Landroidx/compose/ui/graphics/Canvas;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "rotate", "", "degrees", "", "pivotX", "pivotY", "rotateRad", "radians", "scale", "sx", "sy", "withSave", "block", "Lkotlin/Function0;", "withSaveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "paint", "Landroidx/compose/ui/graphics/Paint;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/CanvasKt.class */
public final class CanvasKt {
    @NotNull
    public static final Canvas Canvas(@NotNull ImageBitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return AndroidCanvas_androidKt.ActualCanvas(image);
    }

    public static final void rotate(@NotNull Canvas canvas, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        if (f2 == 0.0f) {
            return;
        }
        canvas.translate(f3, f4);
        canvas.rotate(f2);
        canvas.translate(-f3, -f4);
    }

    public static final void rotateRad(@NotNull Canvas canvas, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        rotate(canvas, DegreesKt.degrees(f2), f3, f4);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        rotateRad(canvas, f2, f3, f4);
    }

    public static final void scale(@NotNull Canvas canvas, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        if (f2 == 1.0f) {
            if (f3 == 1.0f) {
                return;
            }
        }
        canvas.translate(f4, f5);
        canvas.scale(f2, f3);
        canvas.translate(-f4, -f5);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        scale(canvas, f2, f3, f4, f5);
    }

    public static final void withSave(@NotNull Canvas canvas, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            canvas.save();
            block.invoke();
            InlineMarker.finallyStart(1);
            canvas.restore();
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            canvas.restore();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final void withSaveLayer(@NotNull Canvas canvas, @NotNull Rect bounds, @NotNull Paint paint, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            canvas.saveLayer(bounds, paint);
            block.invoke();
            InlineMarker.finallyStart(1);
            canvas.restore();
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            canvas.restore();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
