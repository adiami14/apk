package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018��2\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", "value", "", "constructor-impl", "(I)I", "anyMovementConsumed", "", "getAnyMovementConsumed-impl", "(I)Z", "dispatchedToAPointerInputModifier", "getDispatchedToAPointerInputModifier-impl", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/ProcessResult.class */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ProcessResult m3866boximpl(int i2) {
        return new ProcessResult(i2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m3867constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3868equalsimpl(int i2, Object obj) {
        return (obj instanceof ProcessResult) && i2 == ((ProcessResult) obj).m3874unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3869equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getAnyMovementConsumed-impl  reason: not valid java name */
    public static final boolean m3870getAnyMovementConsumedimpl(int i2) {
        return (i2 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl  reason: not valid java name */
    public static final boolean m3871getDispatchedToAPointerInputModifierimpl(int i2) {
        boolean z = true;
        if ((i2 & 1) == 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3872hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3873toStringimpl(int i2) {
        return "ProcessResult(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3868equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3872hashCodeimpl(this.value);
    }

    public String toString() {
        return m3873toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m3874unboximpl() {
        return this.value;
    }
}
