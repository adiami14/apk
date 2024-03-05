package androidx.compose.ui.input.key;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018��2\u00020\u0001B\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "nativeKeyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "constructor-impl", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "equals", "", "other", "equals-impl", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/view/KeyEvent;)I", "toString", "", "toString-impl", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/key/KeyEvent.class */
public final class KeyEvent {
    @NotNull
    private final android.view.KeyEvent nativeKeyEvent;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyEvent m3654boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static android.view.KeyEvent m3655constructorimpl(@NotNull android.view.KeyEvent nativeKeyEvent) {
        Intrinsics.checkNotNullParameter(nativeKeyEvent, "nativeKeyEvent");
        return nativeKeyEvent;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3656equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && Intrinsics.areEqual(keyEvent, ((KeyEvent) obj).m3660unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3657equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return Intrinsics.areEqual(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3658hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3659toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m3656equalsimpl(this.nativeKeyEvent, obj);
    }

    @NotNull
    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m3658hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m3659toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m3660unboximpl() {
        return this.nativeKeyEvent;
    }
}
