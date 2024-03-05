package androidx.compose.ui.text.platform;

import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��V\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH��\u001ah\u0010��\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H��\u001a\u001d\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u001b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"ActualParagraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "maxLines", "", "ellipsis", "", "width", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "toLayoutAlign", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-AMY3VfE", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/platform/AndroidParagraph_androidKt.class */
public final class AndroidParagraph_androidKt {
    @NotNull
    public static final Paragraph ActualParagraph(@NotNull ParagraphIntrinsics paragraphIntrinsics, int i2, boolean z, float f2) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i2, z, f2);
    }

    @NotNull
    public static final Paragraph ActualParagraph(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i2, boolean z, float f2, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, new TypefaceAdapter(null, resourceLoader, 1, null), density), i2, z, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-AMY3VfE  reason: not valid java name */
    public static final int m4641toLayoutAlignAMY3VfE(TextAlign textAlign) {
        TextAlign.Companion companion = TextAlign.Companion;
        int i2 = 0;
        if (textAlign == null ? false : TextAlign.m4693equalsimpl0(textAlign.m4696unboximpl(), companion.m4700getLefte0LSkKk())) {
            i2 = 3;
        } else {
            if (textAlign == null ? false : TextAlign.m4693equalsimpl0(textAlign.m4696unboximpl(), companion.m4701getRighte0LSkKk())) {
                i2 = 4;
            } else {
                if (textAlign == null ? false : TextAlign.m4693equalsimpl0(textAlign.m4696unboximpl(), companion.m4697getCentere0LSkKk())) {
                    i2 = 2;
                } else {
                    if (!(textAlign == null ? false : TextAlign.m4693equalsimpl0(textAlign.m4696unboximpl(), companion.m4702getStarte0LSkKk()))) {
                        if (textAlign == null ? false : TextAlign.m4693equalsimpl0(textAlign.m4696unboximpl(), companion.m4698getEnde0LSkKk())) {
                            i2 = 1;
                        }
                    }
                }
            }
        }
        return i2;
    }
}
