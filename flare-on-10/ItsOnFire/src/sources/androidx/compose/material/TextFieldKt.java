package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0098\u0001\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a¢\u0001\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\t2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\t2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0087\u0002\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020!2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00103\u001a\u0087\u0002\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u0002042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020!2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00105\u001a\u009d\u0002\u00106\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020.2\u0019\u00107\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\t2\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00132\u0006\u0010/\u001a\u000200H\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b>\u0010?\u001aU\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0016H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001aE\u0010L\u001a\u00020,2\u0006\u0010M\u001a\u00020,2\u0006\u0010N\u001a\u00020,2\u0006\u0010O\u001a\u00020,2\u0006\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u00020,2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bR\u0010S\u001a)\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u0013H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\bW\u0010X\u001at\u0010Y\u001a\u00020\u0006*\u00020Z2\u0006\u0010[\u001a\u00020,2\u0006\u0010\\\u001a\u00020,2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010`\u001a\u0004\u0018\u00010^2\b\u0010a\u001a\u0004\u0018\u00010^2\b\u0010b\u001a\u0004\u0018\u00010^2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010c\u001a\u00020,2\u0006\u0010d\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u0016H\u0002\u001aR\u0010e\u001a\u00020\u0006*\u00020Z2\u0006\u0010[\u001a\u00020,2\u0006\u0010\\\u001a\u00020,2\u0006\u0010f\u001a\u00020^2\b\u0010`\u001a\u0004\u0018\u00010^2\b\u0010a\u001a\u0004\u0018\u00010^2\b\u0010b\u001a\u0004\u0018\u00010^2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u0016H\u0002\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "F", "LastBaselineOffset", "TextFieldTopPadding", "IconsWithTextFieldLayout", "", "textField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "leading", "trailing", "singleLine", "", "leadingColor", "Landroidx/compose/ui/graphics/Color;", "trailingColor", "animationProgress", "", "IconsWithTextFieldLayout-SxpAMN0", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLandroidx/compose/runtime/Composer;I)V", TextFieldImplKt.TextFieldId, "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "modifier", "enabled", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "decoratedPlaceholder", "decoratedLabel", "labelProgress", "indicatorWidth", "indicatorColor", "backgroundColor", "cursorColor", "TextFieldLayout-uBqXD2s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-YbqEFUw", "(IZIIIIJF)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "lineWidth", "color", "drawIndicatorLine-H2RKhps", "(Landroidx/compose/ui/Modifier;FJ)Landroidx/compose/ui/Modifier;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/TextFieldKt.class */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m4785constructorimpl(20);
    private static final float LastBaselineOffset = Dp.m4785constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m4785constructorimpl(4);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ee, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L133;
     */
    @androidx.compose.runtime.Composable
    /* renamed from: IconsWithTextFieldLayout-SxpAMN0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1598IconsWithTextFieldLayoutSxpAMN0(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r16, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r17, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r18, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, final boolean r21, final long r22, final long r24, final float r26, androidx.compose.runtime.Composer r27, final int r28) {
        /*
            Method dump skipped, instructions count: 2466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.m1598IconsWithTextFieldLayoutSxpAMN0(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, long, long, float, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
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
    public static final void TextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r49, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r51, boolean r52, boolean r53, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, boolean r59, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r60, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r61, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r62, boolean r63, int r64, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r65, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r66, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r67, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 2459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x08a2, code lost:
        if (r0 == r0.getEmpty()) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
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
    public static final void TextField(@org.jetbrains.annotations.NotNull final java.lang.String r49, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r51, boolean r52, boolean r53, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, boolean r59, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r60, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r61, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r62, boolean r63, int r64, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r65, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r66, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r67, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 2523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: TextField$lambda-2  reason: not valid java name */
    private static final TextFieldValue m1599TextField$lambda2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ac  */
    @androidx.compose.runtime.Composable
    /* renamed from: TextFieldLayout-uBqXD2s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1601TextFieldLayoutuBqXD2s(@org.jetbrains.annotations.NotNull final androidx.compose.ui.Modifier r37, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r38, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r39, final boolean r40, final boolean r41, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.KeyboardOptions r42, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.KeyboardActions r43, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.TextStyle r44, final boolean r45, int r46, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r47, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.MutableInteractionSource r48, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, final long r53, final long r55, final float r57, final float r58, final long r59, final long r61, final long r63, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.Shape r65, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r66, final int r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 2001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.m1601TextFieldLayoutuBqXD2s(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, boolean, boolean, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.ui.text.TextStyle, boolean, int, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, long, long, float, float, long, long, long, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-YbqEFUw  reason: not valid java name */
    public static final int m1606calculateHeightYbqEFUw(int i2, boolean z, int i3, int i4, int i5, int i6, long j2, float f2) {
        int roundToInt;
        float f3 = LastBaselineOffset;
        float f4 = TextFieldTopPadding;
        float textFieldPadding = TextFieldImplKt.getTextFieldPadding();
        int max = Math.max(i2, i6);
        roundToInt = MathKt__MathJVMKt.roundToInt(z ? i3 + (f4 * f2) + max + (f3 * f2) : (textFieldPadding * f2 * 2) + max);
        return Math.max(roundToInt, Math.max(Math.max(i4, i5), Constraints.m4753getMinHeightimpl(j2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek  reason: not valid java name */
    public static final int m1607calculateWidthVsPV1Ek(int i2, int i3, int i4, int i5, int i6, long j2) {
        return Math.max(i2 + Math.max(i4, Math.max(i5, i6)) + i3, Constraints.m4754getMinWidthimpl(j2));
    }

    @NotNull
    /* renamed from: drawIndicatorLine-H2RKhps  reason: not valid java name */
    public static final Modifier m1608drawIndicatorLineH2RKhps(@NotNull Modifier drawIndicatorLine, final float f2, final long j2) {
        Intrinsics.checkNotNullParameter(drawIndicatorLine, "$this$drawIndicatorLine");
        return DrawModifierKt.drawBehind(drawIndicatorLine, new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawBehind) {
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                float density = f2 * drawBehind.getDensity();
                float m2236getHeightimpl = Size.m2236getHeightimpl(drawBehind.mo2841getSizeNHjbRc()) - (density / 2);
                DrawScope.DefaultImpls.m2885drawLineNGM6Ib0$default(drawBehind, j2, OffsetKt.Offset(0.0f, m2236getHeightimpl), OffsetKt.Offset(Size.m2239getWidthimpl(drawBehind.mo2841getSizeNHjbRc()), m2236getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i4, int i5, float f2, float f3) {
        int roundToInt;
        int roundToInt2;
        roundToInt = MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f3);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            int i6 = roundToInt;
            if (z) {
                i6 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i3);
            }
            roundToInt2 = MathKt__MathJVMKt.roundToInt((i6 - i4) * f2);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), i6 - roundToInt2, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
        if (placeable3 == null) {
            return;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f2) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
        int i4 = roundToInt;
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i2 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i3) : i4, 0.0f, 4, null);
        if (placeable2 == null) {
            return;
        }
        if (z) {
            i4 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i3);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), i4, 0.0f, 4, null);
    }
}
