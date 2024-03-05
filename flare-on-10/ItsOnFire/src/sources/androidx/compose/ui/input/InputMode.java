package androidx.compose.ui.input;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/InputMode;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/InputMode.class */
public final class InputMode {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m3061constructorimpl(1);
    private static final int Keyboard = m3061constructorimpl(2);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/input/InputMode$Companion;", "", "()V", "Keyboard", "Landroidx/compose/ui/input/InputMode;", "getKeyboard-aOaMEAU", "()I", "I", "Touch", "getTouch-aOaMEAU", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/input/InputMode$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getKeyboard-aOaMEAU  reason: not valid java name */
        public final int m3067getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU  reason: not valid java name */
        public final int m3068getTouchaOaMEAU() {
            return InputMode.Touch;
        }
    }

    private /* synthetic */ InputMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ InputMode m3060boximpl(int i2) {
        return new InputMode(i2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m3061constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3062equalsimpl(int i2, Object obj) {
        return (obj instanceof InputMode) && i2 == ((InputMode) obj).m3066unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3063equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3064hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3065toStringimpl(int i2) {
        return m3063equalsimpl0(i2, Touch) ? "Touch" : m3063equalsimpl0(i2, Keyboard) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m3062equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3064hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m3065toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m3066unboximpl() {
        return this.value;
    }
}
