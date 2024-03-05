package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/KeyboardType.class */
public final class KeyboardType {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Text = m4593constructorimpl(1);
    private static final int Ascii = m4593constructorimpl(2);
    private static final int Number = m4593constructorimpl(3);
    private static final int Phone = m4593constructorimpl(4);
    private static final int Uri = m4593constructorimpl(5);
    private static final int Email = m4593constructorimpl(6);
    private static final int Password = m4593constructorimpl(7);
    private static final int NumberPassword = m4593constructorimpl(8);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "()V", "Ascii", "Landroidx/compose/ui/text/input/KeyboardType;", "getAscii-PjHm6EE", "()I", "I", "Email", "getEmail-PjHm6EE", "Number", "getNumber-PjHm6EE", "NumberPassword", "getNumberPassword-PjHm6EE", "Password", "getPassword-PjHm6EE", "Phone", "getPhone-PjHm6EE", "Text", "getText-PjHm6EE", "Uri", "getUri-PjHm6EE", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/KeyboardType$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAscii-PjHm6EE  reason: not valid java name */
        public final int m4599getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getEmail-PjHm6EE  reason: not valid java name */
        public final int m4600getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE  reason: not valid java name */
        public final int m4601getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE  reason: not valid java name */
        public final int m4602getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE  reason: not valid java name */
        public final int m4603getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE  reason: not valid java name */
        public final int m4604getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE  reason: not valid java name */
        public final int m4605getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUri-PjHm6EE  reason: not valid java name */
        public final int m4606getUriPjHm6EE() {
            return KeyboardType.Uri;
        }
    }

    private /* synthetic */ KeyboardType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyboardType m4592boximpl(int i2) {
        return new KeyboardType(i2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m4593constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m4594equalsimpl(int i2, Object obj) {
        return (obj instanceof KeyboardType) && i2 == ((KeyboardType) obj).m4598unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m4595equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m4596hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m4597toStringimpl(int i2) {
        return m4595equalsimpl0(i2, Text) ? "Text" : m4595equalsimpl0(i2, Ascii) ? "Ascii" : m4595equalsimpl0(i2, Number) ? "Number" : m4595equalsimpl0(i2, Phone) ? "Phone" : m4595equalsimpl0(i2, Uri) ? "Uri" : m4595equalsimpl0(i2, Email) ? "Email" : m4595equalsimpl0(i2, Password) ? "Password" : m4595equalsimpl0(i2, NumberPassword) ? "NumberPassword" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4594equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4596hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m4597toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m4598unboximpl() {
        return this.value;
    }
}
