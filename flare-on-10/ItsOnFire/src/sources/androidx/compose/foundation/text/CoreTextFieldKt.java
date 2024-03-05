package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u008c\u0001\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aä\u0001\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001323\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0001¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010)\u001a[\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u00101\u001a\u000202H\u0002ø\u0001��\u001a \u00103\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0013H\u0002\u001a\u001c\u00107\u001a\u00020\u0007*\u00020\u00072\u0006\u0010-\u001a\u00020.2\u0006\u0010$\u001a\u00020%H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SelectionToolbarAndHandles", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyTextInputServiceOnFocusChange", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "previewKeyEventToDeselectOnBack", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/CoreTextFieldKt.class */
public final class CoreTextFieldKt {
    /* JADX WARN: Code restructure failed: missing block: B:240:0x06d2, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0749, code lost:
        if (r37 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0785, code lost:
        if (r0 == null) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0276  */
    /* JADX WARN: Type inference failed for: r0v442, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CoreTextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r22, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r26, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r28, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r29, boolean r30, int r31, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.ImeOptions r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r33, boolean r34, boolean r35, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 3307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SelectionToolbarAndHandles(final androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, final boolean r8, androidx.compose.runtime.Composer r9, final int r10) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(androidx.compose.foundation.text.selection.TextFieldSelectionManager, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L20;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextFieldCursorHandle(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.selection.TextFieldSelectionManager r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, final int r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyTextInputServiceOnFocusChange(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> function1, Function1<? super ImeAction, Unit> function12, OffsetMapping offsetMapping) {
        TextInputSession textInputSession;
        TextLayoutResultProxy layoutResult;
        if (textFieldState.getHasFocus()) {
            TextFieldDelegate.Companion companion = TextFieldDelegate.Companion;
            textInputSession = companion.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, function1, function12);
            LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
            if (layoutCoordinates != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
                companion.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, textInputSession, textFieldState.getHasFocus(), offsetMapping);
            }
        } else {
            TextInputSession inputSession = textFieldState.getInputSession();
            if (inputSession != null) {
                TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), function1);
            }
            textInputSession = null;
        }
        textFieldState.setInputSession(textInputSession);
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m907invokeZmokQxo(keyEvent.m3660unboximpl());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo  reason: not valid java name */
            public final Boolean m907invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                boolean z = true;
                if (TextFieldState.this.getHandleState() == HandleState.None || !KeyEventHelpers_androidKt.m917cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = false;
                } else {
                    TextFieldSelectionManager.m1102deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else if (!z || (inputSession = textFieldState.getInputSession()) == null) {
        } else {
            inputSession.showSoftwareKeyboard();
        }
    }
}
