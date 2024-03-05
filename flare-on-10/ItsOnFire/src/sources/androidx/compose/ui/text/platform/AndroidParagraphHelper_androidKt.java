package androidx.compose.ui.text.platform;

import android.text.SpannableString;
import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��:\n��\n\u0002\u0010\r\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001aX\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H��¨\u0006\u0012"}, d2 = {"createCharSequence", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "contextFontSize", "", "contextTextStyle", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt.class */
public final class AndroidParagraphHelper_androidKt {
    @NotNull
    public static final CharSequence createCharSequence(@NotNull String text, float f2, @NotNull TextStyle contextTextStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull TypefaceAdapter typefaceAdapter) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(typefaceAdapter, "typefaceAdapter");
        if (spanStyles.isEmpty() && placeholders.isEmpty() && Intrinsics.areEqual(contextTextStyle.getTextIndent(), TextIndent.Companion.getNone()) && TextUnitKt.m4992isUnspecifiedR2X_6o(contextTextStyle.m4493getLineHeightXSAIIZE())) {
            return text;
        }
        SpannableString spannableString = new SpannableString(text);
        SpannableExtensions_androidKt.m4672setLineHeightr9BaKPg(spannableString, contextTextStyle.m4493getLineHeightXSAIIZE(), f2, density);
        SpannableExtensions_androidKt.setTextIndent(spannableString, contextTextStyle.getTextIndent(), f2, density);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, contextTextStyle, spanStyles, density, typefaceAdapter);
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, placeholders, density);
        return spannableString;
    }
}
