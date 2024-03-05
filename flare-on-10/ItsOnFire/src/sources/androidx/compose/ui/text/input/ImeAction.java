package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/ImeAction.class */
public final class ImeAction {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Default = m4557constructorimpl(1);
    private static final int None = m4557constructorimpl(0);
    private static final int Go = m4557constructorimpl(2);
    private static final int Search = m4557constructorimpl(3);
    private static final int Send = m4557constructorimpl(4);
    private static final int Previous = m4557constructorimpl(5);
    private static final int Next = m4557constructorimpl(6);
    private static final int Done = m4557constructorimpl(7);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/input/ImeAction;", "getDefault-eUduSuo", "()I", "I", "Done", "getDone-eUduSuo", "Go", "getGo-eUduSuo", "Next", "getNext-eUduSuo", "None", "getNone-eUduSuo", "Previous", "getPrevious-eUduSuo", "Search", "getSearch-eUduSuo", "Send", "getSend-eUduSuo", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/ImeAction$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefault-eUduSuo  reason: not valid java name */
        public final int m4563getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo  reason: not valid java name */
        public final int m4564getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo  reason: not valid java name */
        public final int m4565getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getNext-eUduSuo  reason: not valid java name */
        public final int m4566getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo  reason: not valid java name */
        public final int m4567getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo  reason: not valid java name */
        public final int m4568getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo  reason: not valid java name */
        public final int m4569getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo  reason: not valid java name */
        public final int m4570getSendeUduSuo() {
            return ImeAction.Send;
        }
    }

    private /* synthetic */ ImeAction(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImeAction m4556boximpl(int i2) {
        return new ImeAction(i2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m4557constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m4558equalsimpl(int i2, Object obj) {
        return (obj instanceof ImeAction) && i2 == ((ImeAction) obj).m4562unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m4559equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m4560hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m4561toStringimpl(int i2) {
        return m4559equalsimpl0(i2, None) ? "None" : m4559equalsimpl0(i2, Default) ? "Default" : m4559equalsimpl0(i2, Go) ? "Go" : m4559equalsimpl0(i2, Search) ? "Search" : m4559equalsimpl0(i2, Send) ? "Send" : m4559equalsimpl0(i2, Previous) ? "Previous" : m4559equalsimpl0(i2, Next) ? "Next" : m4559equalsimpl0(i2, Done) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4558equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4560hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m4561toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m4562unboximpl() {
        return this.value;
    }
}
