package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018�� \u001d2\u00020\u0001:\u0001\u001dB:\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001��¢\u0006\u0002\u0010\u000bJE\u0010\u0014\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\u00020\nø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\bø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "singleLine", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "autoCorrect", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoCorrect", "()Z", "getCapitalization-IUNYP9k", "()I", "I", "getImeAction-eUduSuo", "getKeyboardType-PjHm6EE", "getSingleLine", "copy", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/ImeOptions.class */
public final class ImeOptions {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, 31, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;
    private final boolean singleLine;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/ImeOptions$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }
    }

    private ImeOptions(boolean z, int i2, boolean z2, int i3, int i4) {
        this.singleLine = z;
        this.capitalization = i2;
        this.autoCorrect = z2;
        this.keyboardType = i3;
        this.imeAction = i4;
    }

    public /* synthetic */ ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? KeyboardCapitalization.Companion.m4588getNoneIUNYP9k() : i2, (i5 & 4) != 0 ? true : z2, (i5 & 8) != 0 ? KeyboardType.Companion.m4605getTextPjHm6EE() : i3, (i5 & 16) != 0 ? ImeAction.Companion.m4563getDefaulteUduSuo() : i4, null);
    }

    public /* synthetic */ ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i2, z2, i3, i4);
    }

    /* renamed from: copy-uxg59PA$default  reason: not valid java name */
    public static /* synthetic */ ImeOptions m4572copyuxg59PA$default(ImeOptions imeOptions, boolean z, int i2, boolean z2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i5 & 2) != 0) {
            i2 = imeOptions.m4574getCapitalizationIUNYP9k();
        }
        if ((i5 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        if ((i5 & 8) != 0) {
            i3 = imeOptions.m4576getKeyboardTypePjHm6EE();
        }
        if ((i5 & 16) != 0) {
            i4 = imeOptions.m4575getImeActioneUduSuo();
        }
        return imeOptions.m4573copyuxg59PA(z, i2, z2, i3, i4);
    }

    @NotNull
    /* renamed from: copy-uxg59PA  reason: not valid java name */
    public final ImeOptions m4573copyuxg59PA(boolean z, int i2, boolean z2, int i3, int i4) {
        return new ImeOptions(z, i2, z2, i3, i4, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImeOptions) {
            ImeOptions imeOptions = (ImeOptions) obj;
            return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m4583equalsimpl0(m4574getCapitalizationIUNYP9k(), imeOptions.m4574getCapitalizationIUNYP9k()) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m4595equalsimpl0(m4576getKeyboardTypePjHm6EE(), imeOptions.m4576getKeyboardTypePjHm6EE()) && ImeAction.m4559equalsimpl0(m4575getImeActioneUduSuo(), imeOptions.m4575getImeActioneUduSuo());
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public final int m4574getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo  reason: not valid java name */
    public final int m4575getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE  reason: not valid java name */
    public final int m4576getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.singleLine) * 31) + KeyboardCapitalization.m4584hashCodeimpl(m4574getCapitalizationIUNYP9k())) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m4596hashCodeimpl(m4576getKeyboardTypePjHm6EE())) * 31) + ImeAction.m4560hashCodeimpl(m4575getImeActioneUduSuo());
    }

    @NotNull
    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m4585toStringimpl(m4574getCapitalizationIUNYP9k())) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m4597toStringimpl(m4576getKeyboardTypePjHm6EE())) + ", imeAction=" + ((Object) ImeAction.m4561toStringimpl(m4575getImeActioneUduSuo())) + ')';
    }
}
