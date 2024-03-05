package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u009c\u0001\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÖ\u0001\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b2\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0002\b\b2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0017H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0087\u0002\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020'2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u00105\u001a\u000206H\u0007¢\u0006\u0002\u00107\u001a\u0087\u0002\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u0002082\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020'2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u00105\u001a\u000206H\u0007¢\u0006\u0002\u00109\u001a\u009d\u0002\u0010:\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010&\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u0002022\u0006\u0010+\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0019\u0010;\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0002\b\b2\u0013\u0010<\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001aM\u0010D\u001a\u0002022\u0006\u0010E\u001a\u0002022\u0006\u0010F\u001a\u0002022\u0006\u0010G\u001a\u0002022\u0006\u0010H\u001a\u0002022\u0006\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0015H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bM\u0010N\u001aE\u0010O\u001a\u0002022\u0006\u0010P\u001a\u0002022\u0006\u0010Q\u001a\u0002022\u0006\u0010R\u001a\u0002022\u0006\u0010S\u001a\u0002022\u0006\u0010T\u001a\u0002022\u0006\u0010J\u001a\u00020KH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bU\u0010V\u001a!\u0010W\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bX\u0010Y\u001a9\u0010Z\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0017H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b[\u0010\\\u001al\u0010]\u001a\u00020\u0005*\u00020^2\u0006\u0010_\u001a\u0002022\u0006\u0010`\u001a\u0002022\b\u0010a\u001a\u0004\u0018\u00010b2\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010d\u001a\u00020b2\b\u0010e\u001a\u0004\u0018\u00010b2\b\u0010f\u001a\u0004\u0018\u00010b2\u0006\u0010g\u001a\u00020b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0015H\u0002\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "IconsWithTextFieldLayout", "", "textField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", Constants.ScionAnalytics.PARAM_LABEL, "leading", "trailing", "singleLine", "", "leadingColor", "Landroidx/compose/ui/graphics/Color;", "trailingColor", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "shape", "Landroidx/compose/ui/graphics/Shape;", "borderWidth", "borderColor", "labelSize", "IconsWithTextFieldLayout-T2E5_Oc", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/runtime/Composer;II)V", "OutlinedTextField", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "modifier", "enabled", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "decoratedPlaceholder", "decoratedLabel", "labelProgress", "indicatorWidth", "indicatorColor", "cursorColor", "backgroundColor", "OutlinedTextFieldLayout-uBqXD2s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-MK6IjOU", "(IIIIIJF)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "outlineCutout", "outlineCutout-d16Qtg0", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "outlinedBorder", "outlinedBorder-gLEpSso", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJ)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/OutlinedTextFieldKt.class */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m4785constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m4785constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f1, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L167;
     */
    @androidx.compose.runtime.Composable
    /* renamed from: IconsWithTextFieldLayout-T2E5_Oc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1433IconsWithTextFieldLayoutT2E5_Oc(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, final boolean r29, final long r30, final long r32, final float r34, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Size, kotlin.Unit> r35, final androidx.compose.ui.graphics.Shape r36, final float r37, final long r38, final long r40, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 2737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.m1433IconsWithTextFieldLayoutT2E5_Oc(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, long, long, float, kotlin.jvm.functions.Function1, androidx.compose.ui.graphics.Shape, float, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0279  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r49, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r51, boolean r52, boolean r53, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, boolean r59, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r60, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r61, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r62, boolean r63, int r64, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r65, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r66, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r67, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 2413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x0873, code lost:
        if (r0 == r0.getEmpty()) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0279  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull final java.lang.String r49, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r51, boolean r52, boolean r53, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, boolean r59, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r60, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r61, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r62, boolean r63, int r64, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r65, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r66, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r67, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 2471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: OutlinedTextField$lambda-2  reason: not valid java name */
    private static final TextFieldValue m1434OutlinedTextField$lambda2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ac  */
    @androidx.compose.runtime.Composable
    /* renamed from: OutlinedTextFieldLayout-uBqXD2s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1436OutlinedTextFieldLayoutuBqXD2s(@org.jetbrains.annotations.NotNull final androidx.compose.ui.Modifier r37, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r38, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r39, final boolean r40, final boolean r41, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.KeyboardOptions r42, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.KeyboardActions r43, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.TextStyle r44, final boolean r45, int r46, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r47, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.MutableInteractionSource r48, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, final long r53, final long r55, final float r57, final float r58, final long r59, final long r61, final long r63, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.Shape r65, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r66, final int r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 2107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.m1436OutlinedTextFieldLayoutuBqXD2s(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, boolean, boolean, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.ui.text.TextStyle, boolean, int, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, long, long, float, float, long, long, long, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-MK6IjOU  reason: not valid java name */
    public static final int m1441calculateHeightMK6IjOU(int i2, int i3, int i4, int i5, int i6, long j2, float f2) {
        int roundToInt;
        int max = Math.max(i4, i6);
        float textFieldPadding = TextFieldImplKt.getTextFieldPadding() * f2;
        float f3 = max;
        float max2 = Math.max(textFieldPadding, i5 / 2.0f);
        int m4753getMinHeightimpl = Constraints.m4753getMinHeightimpl(j2);
        roundToInt = MathKt__MathJVMKt.roundToInt(f3 + textFieldPadding + max2);
        return Math.max(m4753getMinHeightimpl, Math.max(i2, Math.max(i3, roundToInt)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek  reason: not valid java name */
    public static final int m1442calculateWidthVsPV1Ek(int i2, int i3, int i4, int i5, int i6, long j2) {
        return Math.max(i2 + Math.max(i4, Math.max(i5, i6)) + i3, Constraints.m4754getMinWidthimpl(j2));
    }

    /* renamed from: outlineCutout-d16Qtg0  reason: not valid java name */
    private static final Modifier m1443outlineCutoutd16Qtg0(Modifier modifier, final long j2) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            /* loaded from: ItsOnFire.jar:androidx/compose/material/OutlinedTextFieldKt$outlineCutout$1$WhenMappings.class */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Ltr.ordinal()] = 1;
                    iArr[LayoutDirection.Rtl.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
                float f2;
                float f3;
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                float m2239getWidthimpl = Size.m2239getWidthimpl(j2);
                if (m2239getWidthimpl <= 0.0f) {
                    drawWithContent.drawContent();
                    return;
                }
                f2 = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
                float mo524toPx0680j_4 = drawWithContent.mo524toPx0680j_4(f2);
                float mo524toPx0680j_42 = drawWithContent.mo524toPx0680j_4(TextFieldImplKt.getTextFieldPadding()) - mo524toPx0680j_4;
                float f4 = 2;
                float f5 = m2239getWidthimpl + mo524toPx0680j_42 + (mo524toPx0680j_4 * f4);
                LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i2 = iArr[layoutDirection.ordinal()];
                if (i2 == 1) {
                    f3 = mo524toPx0680j_42;
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    f3 = Size.m2239getWidthimpl(drawWithContent.mo2841getSizeNHjbRc()) - f5;
                }
                int i3 = iArr[drawWithContent.getLayoutDirection().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f5 = Size.m2239getWidthimpl(drawWithContent.mo2841getSizeNHjbRc()) - mo524toPx0680j_42;
                }
                float m2236getHeightimpl = Size.m2236getHeightimpl(j2);
                float f6 = (-m2236getHeightimpl) / f4;
                float f7 = m2236getHeightimpl / f4;
                int m2401getDifferencertfAjoo = ClipOp.Companion.m2401getDifferencertfAjoo();
                DrawContext drawContext = drawWithContent.getDrawContext();
                long mo2847getSizeNHjbRc = drawContext.mo2847getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2851clipRectN_I0leg(f3, f6, f5, f7, m2401getDifferencertfAjoo);
                drawWithContent.drawContent();
                drawContext.getCanvas().restore();
                drawContext.mo2848setSizeuvyYCjk(mo2847getSizeNHjbRc);
            }
        });
    }

    /* renamed from: outlinedBorder-gLEpSso  reason: not valid java name */
    private static final Modifier m1444outlinedBordergLEpSso(Modifier modifier, Shape shape, float f2, long j2, long j3) {
        return BorderKt.m354borderxT4_qwU(m1443outlineCutoutd16Qtg0(modifier, j3), f2, j2, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f2, boolean z, float f3) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        roundToInt = MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f3);
        int i4 = roundToInt;
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding();
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            float align = z ? Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i2) : i4;
            float f4 = 1 - f2;
            float height = placeable4.getHeight() / 2;
            roundToInt2 = MathKt__MathJVMKt.roundToInt(placeable == null ? 0.0f : f4 * (TextFieldImplKt.widthOrZero(placeable) - (horizontalIconPadding * f3)));
            roundToInt3 = MathKt__MathJVMKt.roundToInt((align * f4) - (height * f2));
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, roundToInt2 + i4, roundToInt3, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), z ? Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i2) : i4, 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                i4 = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), i4, 0.0f, 4, null);
        }
        Placeable.PlacementScope.m3962place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m4917getZeronOccac(), 0.0f, 2, null);
    }
}
