package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001B6\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001��¢\u0006\u0002\u0010\nJA\u0010\u0014\u001a\u00020��2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020��2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010��H\u0007J\u0011\u0010\u001d\u001a\u00020��2\u0006\u0010\u0019\u001a\u00020��H\u0087\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLineHeight-XSAIIZE", "()J", "J", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "copy", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/ParagraphStyle.class */
public final class ParagraphStyle {
    private final long lineHeight;
    @Nullable
    private final TextAlign textAlign;
    @Nullable
    private final TextDirection textDirection;
    @Nullable
    private final TextIndent textIndent;

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent) {
        this.textAlign = textAlign;
        this.textDirection = textDirection;
        this.lineHeight = j2;
        this.textIndent = textIndent;
        if (TextUnit.m4971equalsimpl0(m4367getLineHeightXSAIIZE(), TextUnit.Companion.m4985getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m4974getValueimpl(m4367getLineHeightXSAIIZE()) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m4974getValueimpl(m4367getLineHeightXSAIIZE()) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textAlign, (i2 & 2) != 0 ? null : textDirection, (i2 & 4) != 0 ? TextUnit.Companion.m4985getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : textIndent, null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent);
    }

    /* renamed from: copy-Elsmlbk$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4365copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = paragraphStyle.m4368getTextAlignbuA522U();
        }
        if ((i2 & 2) != 0) {
            textDirection = paragraphStyle.m4369getTextDirectionmmuk1to();
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.m4367getLineHeightXSAIIZE();
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m4366copyElsmlbk(textAlign, textDirection, j2, textIndent);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @NotNull
    /* renamed from: copy-Elsmlbk  reason: not valid java name */
    public final ParagraphStyle m4366copyElsmlbk(@Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j2, @Nullable TextIndent textIndent) {
        return new ParagraphStyle(textAlign, textDirection, j2, textIndent, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphStyle) {
            ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
            return Intrinsics.areEqual(m4368getTextAlignbuA522U(), paragraphStyle.m4368getTextAlignbuA522U()) && Intrinsics.areEqual(m4369getTextDirectionmmuk1to(), paragraphStyle.m4369getTextDirectionmmuk1to()) && TextUnit.m4971equalsimpl0(m4367getLineHeightXSAIIZE(), paragraphStyle.m4367getLineHeightXSAIIZE()) && Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent);
        }
        return false;
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m4367getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    @Nullable
    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final TextAlign m4368getTextAlignbuA522U() {
        return this.textAlign;
    }

    @Nullable
    /* renamed from: getTextDirection-mmuk1to  reason: not valid java name */
    public final TextDirection m4369getTextDirectionmmuk1to() {
        return this.textDirection;
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public int hashCode() {
        TextAlign m4368getTextAlignbuA522U = m4368getTextAlignbuA522U();
        int i2 = 0;
        int m4694hashCodeimpl = m4368getTextAlignbuA522U == null ? 0 : TextAlign.m4694hashCodeimpl(m4368getTextAlignbuA522U.m4696unboximpl());
        TextDirection m4369getTextDirectionmmuk1to = m4369getTextDirectionmmuk1to();
        int m4709hashCodeimpl = m4369getTextDirectionmmuk1to == null ? 0 : TextDirection.m4709hashCodeimpl(m4369getTextDirectionmmuk1to.m4711unboximpl());
        int m4975hashCodeimpl = TextUnit.m4975hashCodeimpl(m4367getLineHeightXSAIIZE());
        TextIndent textIndent = this.textIndent;
        if (textIndent != null) {
            i2 = textIndent.hashCode();
        }
        return (((((m4694hashCodeimpl * 31) + m4709hashCodeimpl) * 31) + m4975hashCodeimpl) * 31) + i2;
    }

    @Stable
    @NotNull
    public final ParagraphStyle merge(@Nullable ParagraphStyle paragraphStyle) {
        if (paragraphStyle == null) {
            return this;
        }
        long m4367getLineHeightXSAIIZE = TextUnitKt.m4992isUnspecifiedR2X_6o(paragraphStyle.m4367getLineHeightXSAIIZE()) ? m4367getLineHeightXSAIIZE() : paragraphStyle.m4367getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.textIndent;
        TextIndent textIndent2 = textIndent;
        if (textIndent == null) {
            textIndent2 = this.textIndent;
        }
        TextAlign m4368getTextAlignbuA522U = paragraphStyle.m4368getTextAlignbuA522U();
        TextAlign textAlign = m4368getTextAlignbuA522U;
        if (m4368getTextAlignbuA522U == null) {
            textAlign = m4368getTextAlignbuA522U();
        }
        TextDirection m4369getTextDirectionmmuk1to = paragraphStyle.m4369getTextDirectionmmuk1to();
        if (m4369getTextDirectionmmuk1to == null) {
            m4369getTextDirectionmmuk1to = m4369getTextDirectionmmuk1to();
        }
        return new ParagraphStyle(textAlign, m4369getTextDirectionmmuk1to, m4367getLineHeightXSAIIZE, textIndent2, null);
    }

    @Stable
    @NotNull
    public final ParagraphStyle plus(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @NotNull
    public String toString() {
        return "ParagraphStyle(textAlign=" + m4368getTextAlignbuA522U() + ", textDirection=" + m4369getTextDirectionmmuk1to() + ", lineHeight=" + ((Object) TextUnit.m4981toStringimpl(m4367getLineHeightXSAIIZE())) + ", textIndent=" + this.textIndent + ')';
    }
}
