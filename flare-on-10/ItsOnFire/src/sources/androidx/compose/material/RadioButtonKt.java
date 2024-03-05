package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
@Metadata(d1 = {"��8\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/RadioButtonKt.class */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m4785constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    static {
        float f2 = 2;
        RadioButtonPadding = Dp.m4785constructorimpl(f2);
        float m4785constructorimpl = Dp.m4785constructorimpl(20);
        RadioButtonSize = m4785constructorimpl;
        RadioRadius = Dp.m4785constructorimpl(m4785constructorimpl / f2);
        RadioButtonDotSize = Dp.m4785constructorimpl(12);
        RadioStrokeWidth = Dp.m4785constructorimpl(f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x03b3, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a9  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RadioButton(final boolean r12, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<kotlin.Unit> r13, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r14, boolean r15, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r16, @org.jetbrains.annotations.Nullable androidx.compose.material.RadioButtonColors r17, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonKt.RadioButton(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.RadioButtonColors, androidx.compose.runtime.Composer, int, int):void");
    }
}
