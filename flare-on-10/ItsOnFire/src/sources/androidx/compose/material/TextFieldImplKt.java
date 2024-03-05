package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��¤\u0001\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\"0*¢\u0006\u0002\b+H\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001añ\u0001\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\"072\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020&2\u0013\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010*¢\u0006\u0002\b+2\u0013\u0010<\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010*¢\u0006\u0002\b+2\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010*¢\u0006\u0002\b+2\u0013\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010*¢\u0006\u0002\b+2\u0006\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\b\b\u0002\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0001¢\u0006\u0002\u0010M\u001a\u0012\u0010N\u001a\u00020\u00012\b\u0010O\u001a\u0004\u0018\u00010PH��\u001a\u0012\u0010Q\u001a\u00020\u00012\b\u0010O\u001a\u0004\u0018\u00010PH��\"\u000e\u0010��\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n��\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\t\u0010\n\"\u0013\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\r\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n��\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n��\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0012\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n��\"\u000e\u0010\u0013\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n��\"\u0019\u0010\u0014\u001a\u00020\u0003X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0015\u0010\u0005\"\u000e\u0010\u0016\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n��\"\u0019\u0010\u0017\u001a\u00020\u0018X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "IndicatorFocusedWidth", "IndicatorUnfocusedWidth", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "Decoration", "", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TextFieldImpl", "type", "Landroidx/compose/material/TextFieldType;", "enabled", "", "readOnly", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "singleLine", "textStyle", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leading", "trailing", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "maxLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/TextFieldImplKt.class */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    @NotNull
    private static final Modifier IconDefaultSizeModifier;
    @NotNull
    public static final String LabelId = "Label";
    @NotNull
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    @NotNull
    public static final String PlaceholderId = "Hint";
    @NotNull
    public static final String TextFieldId = "TextField";
    @NotNull
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float IndicatorUnfocusedWidth = Dp.m4785constructorimpl(1);
    private static final float IndicatorFocusedWidth = Dp.m4785constructorimpl(2);
    private static final float TextFieldPadding = Dp.m4785constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m4785constructorimpl(12);

    static {
        float f2 = 48;
        IconDefaultSizeModifier = SizeKt.m710defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m4785constructorimpl(f2), Dp.m4785constructorimpl(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /* renamed from: Decoration-euL9pac  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1593DecorationeuL9pac(final long r11, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r13, @org.jetbrains.annotations.Nullable java.lang.Float r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.m1593DecorationeuL9pac(long, androidx.compose.ui.text.TextStyle, java.lang.Float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x0718, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c5  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextFieldImpl(@org.jetbrains.annotations.NotNull final androidx.compose.material.TextFieldType r29, final boolean r30, final boolean r31, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r32, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r33, @org.jetbrains.annotations.NotNull final androidx.compose.ui.Modifier r34, final boolean r35, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.TextStyle r36, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, final boolean r41, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r42, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r43, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.KeyboardActions r44, int r45, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.MutableInteractionSource r46, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.Shape r47, @org.jetbrains.annotations.NotNull final androidx.compose.material.TextFieldColors r48, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 2398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.TextFieldImpl(androidx.compose.material.TextFieldType, boolean, boolean, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        return layoutIdParentData == null ? null : layoutIdParentData.getLayoutId();
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(@Nullable Placeable placeable) {
        return placeable == null ? 0 : placeable.getHeight();
    }

    public static final int widthOrZero(@Nullable Placeable placeable) {
        return placeable == null ? 0 : placeable.getWidth();
    }
}
