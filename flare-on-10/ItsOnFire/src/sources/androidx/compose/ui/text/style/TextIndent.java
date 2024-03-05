package androidx.compose.ui.text.style;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018�� \u00142\u00020\u0001:\u0001\u0014B\u001c\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001��¢\u0006\u0002\u0010\u0005J'\u0010\n\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "firstLine", "Landroidx/compose/ui/unit/TextUnit;", "restLine", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFirstLine-XSAIIZE", "()J", "J", "getRestLine-XSAIIZE", "copy", "copy-NB67dxo", "(JJ)Landroidx/compose/ui/text/style/TextIndent;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/style/TextIndent.class */
public final class TextIndent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextIndent;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/style/TextIndent$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @NotNull
        public final TextIndent getNone() {
            return TextIndent.None;
        }
    }

    private TextIndent(long j2, long j3) {
        this.firstLine = j2;
        this.restLine = j3;
    }

    public /* synthetic */ TextIndent(long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TextUnitKt.getSp(0) : j2, (i2 & 2) != 0 ? TextUnitKt.getSp(0) : j3, null);
    }

    public /* synthetic */ TextIndent(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    /* renamed from: copy-NB67dxo$default  reason: not valid java name */
    public static /* synthetic */ TextIndent m4719copyNB67dxo$default(TextIndent textIndent, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = textIndent.m4721getFirstLineXSAIIZE();
        }
        if ((i2 & 2) != 0) {
            j3 = textIndent.m4722getRestLineXSAIIZE();
        }
        return textIndent.m4720copyNB67dxo(j2, j3);
    }

    @NotNull
    /* renamed from: copy-NB67dxo  reason: not valid java name */
    public final TextIndent m4720copyNB67dxo(long j2, long j3) {
        return new TextIndent(j2, j3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextIndent) {
            TextIndent textIndent = (TextIndent) obj;
            return TextUnit.m4971equalsimpl0(m4721getFirstLineXSAIIZE(), textIndent.m4721getFirstLineXSAIIZE()) && TextUnit.m4971equalsimpl0(m4722getRestLineXSAIIZE(), textIndent.m4722getRestLineXSAIIZE());
        }
        return false;
    }

    /* renamed from: getFirstLine-XSAIIZE  reason: not valid java name */
    public final long m4721getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE  reason: not valid java name */
    public final long m4722getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return (TextUnit.m4975hashCodeimpl(m4721getFirstLineXSAIIZE()) * 31) + TextUnit.m4975hashCodeimpl(m4722getRestLineXSAIIZE());
    }

    @NotNull
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m4981toStringimpl(m4721getFirstLineXSAIIZE())) + ", restLine=" + ((Object) TextUnit.m4981toStringimpl(m4722getRestLineXSAIIZE())) + ')';
    }
}
