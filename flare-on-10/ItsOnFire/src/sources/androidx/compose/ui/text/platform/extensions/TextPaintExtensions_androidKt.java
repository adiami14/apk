package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.appcompat.R;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��&\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\u001a\u0018\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a$\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH��\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0003H��¨\u0006\f"}, d2 = {"createTypeface", "Landroid/graphics/Typeface;", "style", "Landroidx/compose/ui/text/SpanStyle;", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/platform/extensions/TextPaintExtensions_androidKt.class */
public final class TextPaintExtensions_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c4  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.SpanStyle applySpanStyle(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.platform.AndroidTextPaint r23, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.SpanStyle r24, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.platform.TypefaceAdapter r25, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.Density r26) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt.applySpanStyle(androidx.compose.ui.text.platform.AndroidTextPaint, androidx.compose.ui.text.SpanStyle, androidx.compose.ui.text.platform.TypefaceAdapter, androidx.compose.ui.unit.Density):androidx.compose.ui.text.SpanStyle");
    }

    private static final Typeface createTypeface(SpanStyle spanStyle, TypefaceAdapter typefaceAdapter) {
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        FontWeight fontWeight2 = fontWeight;
        if (fontWeight == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontStyle m4445getFontStyle4Lr2A7w = spanStyle.m4445getFontStyle4Lr2A7w();
        int m4535getNormal_LCdwA = m4445getFontStyle4Lr2A7w == null ? FontStyle.Companion.m4535getNormal_LCdwA() : m4445getFontStyle4Lr2A7w.m4533unboximpl();
        FontSynthesis m4446getFontSynthesisZQGJjVo = spanStyle.m4446getFontSynthesisZQGJjVo();
        return typefaceAdapter.m4652createDPcqOEQ(fontFamily, fontWeight2, m4535getNormal_LCdwA, m4446getFontSynthesisZQGJjVo == null ? FontSynthesis.Companion.m4546getAllGVVA2EU() : m4446getFontSynthesisZQGJjVo.m4545unboximpl());
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.m4445getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
