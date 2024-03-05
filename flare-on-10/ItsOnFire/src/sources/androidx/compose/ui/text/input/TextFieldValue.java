package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018�� \u001e2\u00020\u0001:\u0001\u001eB*\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001��¢\u0006\u0002\u0010\u0007B&\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001��¢\u0006\u0002\u0010\nJ3\u0010\u0014\u001a\u00020��2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0014\u001a\u00020��2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "J", "getText", "()Ljava/lang/String;", "copy", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "equals", "", "other", "hashCode", "", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/TextFieldValue.class */
public final class TextFieldValue {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new Function2<SaverScope, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver2, @NotNull TextFieldValue it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(it.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), Saver2), SaversKt.save(TextRange.m4463boximpl(it.m4616getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), Saver2));
            return arrayListOf;
        }
    }, new Function1<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextFieldValue invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRange = null;
            AnnotatedString restore = Intrinsics.areEqual(obj, bool) ? null : obj == null ? null : annotatedStringSaver.restore(obj);
            Intrinsics.checkNotNull(restore);
            Object obj2 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
            if (!Intrinsics.areEqual(obj2, bool) && obj2 != null) {
                textRange = saver.restore(obj2);
            }
            Intrinsics.checkNotNull(textRange);
            return new TextFieldValue(restore, textRange.m4479unboximpl(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
    });
    @NotNull
    private final AnnotatedString annotatedString;
    @Nullable
    private final TextRange composition;
    private final long selection;

    @Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/TextFieldValue$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }
    }

    private TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m4481constrain8ffj60Q(j2, 0, getText().length());
        this.composition = textRange == null ? null : TextRange.m4463boximpl(TextRangeKt.m4481constrain8ffj60Q(textRange.m4479unboximpl(), 0, getText().length()));
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i2 & 2) != 0 ? TextRange.Companion.m4480getZerod9O1mEE() : j2, (i2 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2, textRange);
    }

    private TextFieldValue(String str, long j2, TextRange textRange) {
        this(new AnnotatedString(str, null, null, 6, null), j2, textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j2, TextRange textRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? TextRange.Companion.m4480getZerod9O1mEE() : j2, (i2 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j2, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default  reason: not valid java name */
    public static /* synthetic */ TextFieldValue m4611copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j2, TextRange textRange, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i2 & 2) != 0) {
            j2 = textFieldValue.m4616getSelectiond9O1mEE();
        }
        if ((i2 & 4) != 0) {
            textRange = textFieldValue.m4615getCompositionMzsxiRA();
        }
        return textFieldValue.m4613copy3r_uNRQ(annotatedString, j2, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default  reason: not valid java name */
    public static /* synthetic */ TextFieldValue m4612copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j2, TextRange textRange, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = textFieldValue.m4616getSelectiond9O1mEE();
        }
        if ((i2 & 4) != 0) {
            textRange = textFieldValue.m4615getCompositionMzsxiRA();
        }
        return textFieldValue.m4614copy3r_uNRQ(str, j2, textRange);
    }

    @NotNull
    /* renamed from: copy-3r_uNRQ  reason: not valid java name */
    public final TextFieldValue m4613copy3r_uNRQ(@NotNull AnnotatedString annotatedString, long j2, @Nullable TextRange textRange) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        return new TextFieldValue(annotatedString, j2, textRange, (DefaultConstructorMarker) null);
    }

    @NotNull
    /* renamed from: copy-3r_uNRQ  reason: not valid java name */
    public final TextFieldValue m4614copy3r_uNRQ(@NotNull String text, long j2, @Nullable TextRange textRange) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextFieldValue(new AnnotatedString(text, null, null, 6, null), j2, textRange, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextFieldValue) {
            TextFieldValue textFieldValue = (TextFieldValue) obj;
            if (!TextRange.m4468equalsimpl0(m4616getSelectiond9O1mEE(), textFieldValue.m4616getSelectiond9O1mEE()) || !Intrinsics.areEqual(m4615getCompositionMzsxiRA(), textFieldValue.m4615getCompositionMzsxiRA()) || !Intrinsics.areEqual(this.annotatedString, textFieldValue.annotatedString)) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA  reason: not valid java name */
    public final TextRange m4615getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE  reason: not valid java name */
    public final long m4616getSelectiond9O1mEE() {
        return this.selection;
    }

    @NotNull
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int hashCode = this.annotatedString.hashCode();
        int m4476hashCodeimpl = TextRange.m4476hashCodeimpl(m4616getSelectiond9O1mEE());
        TextRange m4615getCompositionMzsxiRA = m4615getCompositionMzsxiRA();
        return (((hashCode * 31) + m4476hashCodeimpl) * 31) + (m4615getCompositionMzsxiRA == null ? 0 : TextRange.m4476hashCodeimpl(m4615getCompositionMzsxiRA.m4479unboximpl()));
    }

    @NotNull
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m4478toStringimpl(m4616getSelectiond9O1mEE())) + ", composition=" + m4615getCompositionMzsxiRA() + ')';
    }
}
