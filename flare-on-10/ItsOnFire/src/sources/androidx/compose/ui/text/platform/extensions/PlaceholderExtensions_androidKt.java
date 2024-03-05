package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��:\n��\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n��\u001a,\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a(\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0015H��\"!\u0010��\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001a\u00020\u0001*\u00020\b8BX\u0082\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"spanUnit", "", "Landroidx/compose/ui/unit/TextUnit;", "getSpanUnit--R2X_6o$annotations", "(J)V", "getSpanUnit--R2X_6o", "(J)I", "spanVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "getSpanVerticalAlign-do9X-Gg", "(I)I", "setPlaceholder", "", "Landroid/text/Spannable;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "start", "end", "density", "Landroidx/compose/ui/unit/Density;", "setPlaceholders", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt.class */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o  reason: not valid java name */
    private static final int m4663getSpanUnitR2X_6o(long j2) {
        long m4973getTypeUIouoOA = TextUnit.m4973getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5008getSpUIouoOA()) ? 0 : TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5007getEmUIouoOA()) ? 1 : 2;
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations  reason: not valid java name */
    private static /* synthetic */ void m4664getSpanUnitR2X_6o$annotations(long j2) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg  reason: not valid java name */
    private static final int m4665getSpanVerticalAligndo9XGg(int i2) {
        int i3;
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m4379equalsimpl0(i2, companion.m4383getAboveBaselineJ6kI3mc())) {
            i3 = 0;
        } else if (PlaceholderVerticalAlign.m4379equalsimpl0(i2, companion.m4389getTopJ6kI3mc())) {
            i3 = 1;
        } else if (PlaceholderVerticalAlign.m4379equalsimpl0(i2, companion.m4384getBottomJ6kI3mc())) {
            i3 = 2;
        } else if (PlaceholderVerticalAlign.m4379equalsimpl0(i2, companion.m4385getCenterJ6kI3mc())) {
            i3 = 3;
        } else if (PlaceholderVerticalAlign.m4379equalsimpl0(i2, companion.m4388getTextTopJ6kI3mc())) {
            i3 = 4;
        } else if (PlaceholderVerticalAlign.m4379equalsimpl0(i2, companion.m4386getTextBottomJ6kI3mc())) {
            i3 = 5;
        } else if (!PlaceholderVerticalAlign.m4379equalsimpl0(i2, companion.m4387getTextCenterJ6kI3mc())) {
            throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
        } else {
            i3 = 6;
        }
        return i3;
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations  reason: not valid java name */
    private static /* synthetic */ void m4666getSpanVerticalAligndo9XGg$annotations(int i2) {
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i2, int i3, Density density) {
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m4974getValueimpl(placeholder.m4374getWidthXSAIIZE()), m4663getSpanUnitR2X_6o(placeholder.m4374getWidthXSAIIZE()), TextUnit.m4974getValueimpl(placeholder.m4372getHeightXSAIIZE()), m4663getSpanUnitR2X_6o(placeholder.m4372getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m4665getSpanVerticalAligndo9XGg(placeholder.m4373getPlaceholderVerticalAlignJ6kI3mc())), i2, i3);
    }

    public static final void setPlaceholders(@NotNull Spannable spannable, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        int size = placeholders.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<Placeholder> range = placeholders.get(i2);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }
}
