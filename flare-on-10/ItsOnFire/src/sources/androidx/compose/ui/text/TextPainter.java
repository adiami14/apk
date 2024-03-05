package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\bÆ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/TextPainter.class */
public final class TextPainter {
    @NotNull
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        boolean z = textLayoutResult.getHasVisualOverflow() && TextOverflow.m4727equalsimpl0(textLayoutResult.getLayoutInput().m4453getOverflowgIe3tQ8(), TextOverflow.Companion.m4734getClipgIe3tQ8());
        if (z) {
            Rect m2208Recttz77jQw = RectKt.m2208Recttz77jQw(Offset.Companion.m2183getZeroF1C5BW0(), SizeKt.Size(IntSize.m4951getWidthimpl(textLayoutResult.m4457getSizeYbymL2g()), IntSize.m4950getHeightimpl(textLayoutResult.m4457getSizeYbymL2g())));
            canvas.save();
            Canvas.DefaultImpls.m2389clipRectmtrdDE$default(canvas, m2208Recttz77jQw, 0, 2, null);
        }
        try {
            textLayoutResult.getMultiParagraph().m4358paintRPmYEkk(canvas, textLayoutResult.getLayoutInput().getStyle().m4488getColor0d7_KjU(), textLayoutResult.getLayoutInput().getStyle().getShadow(), textLayoutResult.getLayoutInput().getStyle().getTextDecoration());
            if (z) {
                canvas.restore();
            }
        } catch (Throwable th) {
            if (z) {
                canvas.restore();
            }
            throw th;
        }
    }
}
