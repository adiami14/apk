package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/semantics/LiveRegionMode;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/semantics/LiveRegionMode.class */
public final class LiveRegionMode {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m4295constructorimpl(0);
    private static final int Assertive = m4295constructorimpl(1);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/semantics/LiveRegionMode$Companion;", "", "()V", "Assertive", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getAssertive-0phEisY", "()I", "I", "Polite", "getPolite-0phEisY", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/semantics/LiveRegionMode$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAssertive-0phEisY  reason: not valid java name */
        public final int m4301getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY  reason: not valid java name */
        public final int m4302getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }
    }

    private /* synthetic */ LiveRegionMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m4294boximpl(int i2) {
        return new LiveRegionMode(i2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m4295constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m4296equalsimpl(int i2, Object obj) {
        return (obj instanceof LiveRegionMode) && i2 == ((LiveRegionMode) obj).m4300unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m4297equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m4298hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m4299toStringimpl(int i2) {
        return m4297equalsimpl0(i2, Polite) ? "Polite" : m4297equalsimpl0(i2, Assertive) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4296equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4298hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m4299toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m4300unboximpl() {
        return this.value;
    }
}