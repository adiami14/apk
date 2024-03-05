package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerEventType.class */
public final class PointerEventType {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3744constructorimpl(0);
    private static final int Press = m3744constructorimpl(1);
    private static final int Release = m3744constructorimpl(2);
    private static final int Move = m3744constructorimpl(3);
    private static final int Enter = m3744constructorimpl(4);
    private static final int Exit = m3744constructorimpl(5);
    private static final int Scroll = m3744constructorimpl(6);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R'\u0010\u0010\u001a\u00020\u00048GX\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType$Companion;", "", "()V", "Enter", "Landroidx/compose/ui/input/pointer/PointerEventType;", "getEnter-7fucELk", "()I", "I", "Exit", "getExit-7fucELk", "Move", "getMove-7fucELk", "Press", "getPress-7fucELk", "Release", "getRelease-7fucELk", "Scroll", "getScroll-7fucELk$annotations", "getScroll-7fucELk", "Unknown", "getUnknown-7fucELk", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerEventType$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        /* renamed from: getScroll-7fucELk$annotations  reason: not valid java name */
        public static /* synthetic */ void m3750getScroll7fucELk$annotations() {
        }

        /* renamed from: getEnter-7fucELk  reason: not valid java name */
        public final int m3751getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk  reason: not valid java name */
        public final int m3752getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk  reason: not valid java name */
        public final int m3753getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk  reason: not valid java name */
        public final int m3754getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk  reason: not valid java name */
        public final int m3755getRelease7fucELk() {
            return PointerEventType.Release;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getScroll-7fucELk  reason: not valid java name */
        public final int m3756getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk  reason: not valid java name */
        public final int m3757getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }
    }

    private /* synthetic */ PointerEventType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerEventType m3743boximpl(int i2) {
        return new PointerEventType(i2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m3744constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3745equalsimpl(int i2, Object obj) {
        return (obj instanceof PointerEventType) && i2 == ((PointerEventType) obj).m3749unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3746equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3747hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3748toStringimpl(int i2) {
        return m3746equalsimpl0(i2, Press) ? "Press" : m3746equalsimpl0(i2, Release) ? "Release" : m3746equalsimpl0(i2, Move) ? "Move" : m3746equalsimpl0(i2, Enter) ? "Enter" : m3746equalsimpl0(i2, Exit) ? "Exit" : m3746equalsimpl0(i2, Scroll) ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m3745equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3747hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m3748toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m3749unboximpl() {
        return this.value;
    }
}
