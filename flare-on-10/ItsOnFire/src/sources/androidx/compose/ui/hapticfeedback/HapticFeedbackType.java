package androidx.compose.ui.hapticfeedback;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/hapticfeedback/HapticFeedbackType.class */
public final class HapticFeedbackType {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n��\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nø\u0001��R\u001a\u0010\u0003\u001a\u00020\u00048Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "()V", "LongPress", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getLongPress-5zf0vsI", "()I", "TextHandleMove", "getTextHandleMove-5zf0vsI", "values", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getLongPress-5zf0vsI  reason: not valid java name */
        public final int m3054getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3057getLongPress5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI  reason: not valid java name */
        public final int m3055getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3058getTextHandleMove5zf0vsI();
        }

        @NotNull
        public final List<HapticFeedbackType> values() {
            List<HapticFeedbackType> listOf;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new HapticFeedbackType[]{HapticFeedbackType.m3047boximpl(m3054getLongPress5zf0vsI()), HapticFeedbackType.m3047boximpl(m3055getTextHandleMove5zf0vsI())});
            return listOf;
        }
    }

    private /* synthetic */ HapticFeedbackType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m3047boximpl(int i2) {
        return new HapticFeedbackType(i2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m3048constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3049equalsimpl(int i2, Object obj) {
        return (obj instanceof HapticFeedbackType) && i2 == ((HapticFeedbackType) obj).m3053unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3050equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3051hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3052toStringimpl(int i2) {
        Companion companion = Companion;
        return m3050equalsimpl0(i2, companion.m3054getLongPress5zf0vsI()) ? "LongPress" : m3050equalsimpl0(i2, companion.m3055getTextHandleMove5zf0vsI()) ? "TextHandleMove" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3049equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3051hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m3052toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m3053unboximpl() {
        return this.value;
    }
}
