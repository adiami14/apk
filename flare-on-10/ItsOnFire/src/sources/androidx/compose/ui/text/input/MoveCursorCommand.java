package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u000e\n��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "amount", "", "(I)V", "getAmount", "()I", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/MoveCursorCommand.class */
public final class MoveCursorCommand implements EditCommand {
    private final int amount;

    public MoveCursorCommand(int i2) {
        this.amount = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        int i2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.getCursor$ui_text_release() == -1) {
            buffer.setCursor$ui_text_release(buffer.getSelectionStart$ui_text_release());
        }
        int selectionStart$ui_text_release = buffer.getSelectionStart$ui_text_release();
        String editingBuffer = buffer.toString();
        int i3 = this.amount;
        int i4 = 0;
        if (i3 <= 0) {
            int i5 = -i3;
            while (true) {
                i2 = selectionStart$ui_text_release;
                if (i4 >= i5) {
                    break;
                }
                i4++;
                int findPrecedingBreak = JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer, selectionStart$ui_text_release);
                if (findPrecedingBreak == -1) {
                    i2 = selectionStart$ui_text_release;
                    break;
                }
                selectionStart$ui_text_release = findPrecedingBreak;
            }
        } else {
            int i6 = 0;
            while (true) {
                i2 = selectionStart$ui_text_release;
                if (i6 >= i3) {
                    break;
                }
                i6++;
                int findFollowingBreak = JvmCharHelpers_androidKt.findFollowingBreak(editingBuffer, selectionStart$ui_text_release);
                if (findFollowingBreak == -1) {
                    i2 = selectionStart$ui_text_release;
                    break;
                }
                selectionStart$ui_text_release = findFollowingBreak;
            }
        }
        buffer.setCursor$ui_text_release(i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    @NotNull
    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
