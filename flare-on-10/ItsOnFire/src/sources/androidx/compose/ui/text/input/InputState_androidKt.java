package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.appcompat.R;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\u001a\f\u0010��\u001a\u00020\u0001*\u00020\u0002H��¨\u0006\u0003"}, d2 = {"toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/ui/text/input/TextFieldValue;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/InputState_androidKt.class */
public final class InputState_androidKt {
    @NotNull
    public static final ExtractedText toExtractedText(@NotNull TextFieldValue textFieldValue) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m4473getMinimpl(textFieldValue.m4616getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m4472getMaximpl(textFieldValue.m4616getSelectiond9O1mEE());
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) textFieldValue.getText(), '\n', false, 2, (Object) null);
        extractedText.flags = !contains$default ? 1 : 0;
        return extractedText;
    }
}
