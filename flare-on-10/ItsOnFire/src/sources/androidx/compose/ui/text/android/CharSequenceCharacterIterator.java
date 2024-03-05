package androidx.compose.ui.text.android;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\r\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010��\n��\n\u0002\u0010\f\n\u0002\b\n\b��\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\t\u0010\u0012\u001a\u00020\fH\u0096\u0002J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/text/CharacterIterator;", "charSequence", "", "start", "", "end", "(Ljava/lang/CharSequence;II)V", FirebaseAnalytics.Param.INDEX, "clone", "", "current", "", "first", "getBeginIndex", "getEndIndex", "getIndex", "last", "next", "previous", "setIndex", "position", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/CharSequenceCharacterIterator.class */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    @NotNull
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(@NotNull CharSequence charSequence, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.charSequence = charSequence;
        this.start = i2;
        this.end = i3;
        this.index = i2;
    }

    @Override // java.text.CharacterIterator
    @NotNull
    public Object clone() {
        try {
            Object clone = super.clone();
            Intrinsics.checkNotNullExpressionValue(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException e2) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i2 = this.index;
        return i2 == this.end ? (char) 65535 : this.charSequence.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        char charAt;
        int i2 = this.start;
        int i3 = this.end;
        if (i2 == i3) {
            this.index = i3;
            charAt = 65535;
        } else {
            int i4 = i3 - 1;
            this.index = i4;
            charAt = this.charSequence.charAt(i4);
        }
        return charAt;
    }

    @Override // java.text.CharacterIterator
    public char next() {
        char charAt;
        int i2 = this.index + 1;
        this.index = i2;
        int i3 = this.end;
        if (i2 >= i3) {
            this.index = i3;
            charAt = 65535;
        } else {
            charAt = this.charSequence.charAt(i2);
        }
        return charAt;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        char charAt;
        int i2 = this.index;
        if (i2 <= this.start) {
            charAt = 65535;
        } else {
            int i3 = i2 - 1;
            this.index = i3;
            charAt = this.charSequence.charAt(i3);
        }
        return charAt;
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i2) {
        int i3 = this.start;
        boolean z = false;
        if (i2 <= this.end) {
            z = false;
            if (i3 <= i2) {
                z = true;
            }
        }
        if (z) {
            this.index = i2;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}