package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.text.TextRangeKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H��\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H��\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H��ø\u0001��¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"findParagraphEnd", "", "", "startIndex", "findParagraphStart", "getParagraphBoundary", "Landroidx/compose/ui/text/TextRange;", FirebaseAnalytics.Param.INDEX, "(Ljava/lang/CharSequence;I)J", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/StringHelpersKt.class */
public final class StringHelpersKt {
    public static final int findParagraphEnd(@NotNull CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i3 = i2 + 1; i3 < length; i3++) {
            if (charSequence.charAt(i3) == '\n') {
                return i3;
            }
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(@NotNull CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int i3 = i2 - 1;
        if (1 > i3) {
            return 0;
        }
        while (true) {
            int i4 = i3 - 1;
            if (charSequence.charAt(i3 - 1) == '\n') {
                return i3;
            }
            if (1 > i4) {
                return 0;
            }
            i3 = i4;
        }
    }

    public static final long getParagraphBoundary(@NotNull CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i2), findParagraphEnd(charSequence, i2));
    }
}
