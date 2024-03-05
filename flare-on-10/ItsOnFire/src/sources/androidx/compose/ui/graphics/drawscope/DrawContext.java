package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018��2\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R!\u0010\u0006\u001a\u00020\u0007X¦\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawContext;", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "transform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "getTransform", "()Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/drawscope/DrawContext.class */
public interface DrawContext {
    @NotNull
    Canvas getCanvas();

    /* renamed from: getSize-NH-jbRc */
    long mo2847getSizeNHjbRc();

    @NotNull
    DrawTransform getTransform();

    /* renamed from: setSize-uvyYCjk */
    void mo2848setSizeuvyYCjk(long j2);
}
