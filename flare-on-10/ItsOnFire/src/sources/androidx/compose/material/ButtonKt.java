package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
@Metadata(d1 = {"��R\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008d\u0001\u0010��\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", "border", "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ButtonKt.class */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025c  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Button(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r21, boolean r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r23, @org.jetbrains.annotations.Nullable androidx.compose.material.ButtonElevation r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r26, @org.jetbrains.annotations.Nullable androidx.compose.material.ButtonColors r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r28, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.Button(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Button$lambda-1  reason: not valid java name */
    public static final long m1195Button$lambda1(State<Color> state) {
        return state.getValue().m2424unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0269  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedButton(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, boolean r18, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r19, @org.jetbrains.annotations.Nullable androidx.compose.material.ButtonElevation r20, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r21, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r22, @org.jetbrains.annotations.Nullable androidx.compose.material.ButtonColors r23, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r24, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.OutlinedButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0274  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextButton(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, boolean r18, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r19, @org.jetbrains.annotations.Nullable androidx.compose.material.ButtonElevation r20, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r21, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r22, @org.jetbrains.annotations.Nullable androidx.compose.material.ButtonColors r23, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r24, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.TextButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
