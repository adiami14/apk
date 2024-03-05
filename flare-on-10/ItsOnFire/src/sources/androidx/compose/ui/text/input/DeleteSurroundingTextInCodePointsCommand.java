package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u000e\n��\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "lengthBeforeCursor", "", "lengthAfterCursor", "(II)V", "getLengthAfterCursor", "()I", "getLengthBeforeCursor", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand.class */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i2, int i3) {
        this.lengthBeforeCursor = i2;
        this.lengthAfterCursor = i3;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        int i2;
        int i3;
        boolean isSurrogatePair;
        boolean isSurrogatePair2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i4 = this.lengthBeforeCursor;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i2 = i6;
            if (i5 >= i4) {
                break;
            }
            i5++;
            int i7 = i6 + 1;
            int i8 = i7;
            if (buffer.getSelectionStart$ui_text_release() > i7) {
                i8 = i7;
                isSurrogatePair2 = EditCommandKt.isSurrogatePair(buffer.get$ui_text_release((buffer.getSelectionStart$ui_text_release() - i7) - 1), buffer.get$ui_text_release(buffer.getSelectionStart$ui_text_release() - i7));
                if (isSurrogatePair2) {
                    i8 = i7 + 1;
                }
            }
            i6 = i8;
            if (i8 == buffer.getSelectionStart$ui_text_release()) {
                i2 = i8;
                break;
            }
        }
        int i9 = this.lengthAfterCursor;
        int i10 = 0;
        int i11 = 0;
        do {
            i3 = i10;
            if (i11 >= i9) {
                break;
            }
            i11++;
            int i12 = i10 + 1;
            i3 = i12;
            if (buffer.getSelectionEnd$ui_text_release() + i12 < buffer.getLength$ui_text_release()) {
                i3 = i12;
                isSurrogatePair = EditCommandKt.isSurrogatePair(buffer.get$ui_text_release((buffer.getSelectionEnd$ui_text_release() + i12) - 1), buffer.get$ui_text_release(buffer.getSelectionEnd$ui_text_release() + i12));
                if (isSurrogatePair) {
                    i3 = i12 + 1;
                }
            }
            i10 = i3;
        } while (buffer.getSelectionEnd$ui_text_release() + i3 != buffer.getLength$ui_text_release());
        buffer.delete$ui_text_release(buffer.getSelectionEnd$ui_text_release(), buffer.getSelectionEnd$ui_text_release() + i3);
        buffer.delete$ui_text_release(buffer.getSelectionStart$ui_text_release() - i2, buffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeleteSurroundingTextInCodePointsCommand) {
            DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
            return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
        }
        return false;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    @NotNull
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
