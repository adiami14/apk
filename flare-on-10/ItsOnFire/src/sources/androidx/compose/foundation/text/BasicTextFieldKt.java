package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
@Metadata(d1 = {"��l\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aâ\u0001\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010\"\u001aâ\u0001\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020#2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010$¨\u0006%"}, d2 = {"BasicTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/BasicTextFieldKt.class */
public final class BasicTextFieldKt {
    /* JADX WARN: Code restructure failed: missing block: B:229:0x068c, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0281  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r22, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, boolean r25, boolean r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r29, boolean r30, int r31, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r32, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r34, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r35, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 1929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x06e1, code lost:
        if (r0 == r0.getEmpty()) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@org.jetbrains.annotations.NotNull final java.lang.String r22, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, boolean r25, boolean r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r29, boolean r30, int r31, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r32, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r34, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r35, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 2009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: BasicTextField$lambda-2  reason: not valid java name */
    private static final TextFieldValue m879BasicTextField$lambda2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }
}
