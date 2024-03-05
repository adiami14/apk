package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��.\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001aD\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH��¨\u0006\u000f"}, d2 = {"textFieldKeyInput", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "editable", "", "singleLine", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldKeyInputKt.class */
public final class TextFieldKeyInputKt {
    @NotNull
    public static final Modifier textFieldKeyInput(@NotNull Modifier modifier, @NotNull final TextFieldState state, @NotNull final TextFieldSelectionManager manager, @NotNull final TextFieldValue value, final boolean z, final boolean z2, @NotNull final OffsetMapping offsetMapping, @NotNull final UndoManager undoManager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(undoManager, "undoManager");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$1

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$1$1  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$1$1.class */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<KeyEvent, Boolean> {
                public AnonymousClass1(Object obj) {
                    super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m992invokeZmokQxo(keyEvent.m3660unboximpl());
                }

                @NotNull
                /* renamed from: invoke-ZmokQxo  reason: not valid java name */
                public final Boolean m992invokeZmokQxo(@NotNull android.view.KeyEvent p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m982processZmokQxo(p0));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1205064668);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                TextPreparedSelectionState textPreparedSelectionState = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    textPreparedSelectionState = new TextPreparedSelectionState();
                    composer.updateRememberedValue(textPreparedSelectionState);
                }
                composer.endReplaceableGroup();
                Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.Companion, new AnonymousClass1(new TextFieldKeyInput(TextFieldState.this, manager, value, z, z2, (TextPreparedSelectionState) textPreparedSelectionState, offsetMapping, undoManager, null, 256, null)));
                composer.endReplaceableGroup();
                return onKeyEvent;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }
}
