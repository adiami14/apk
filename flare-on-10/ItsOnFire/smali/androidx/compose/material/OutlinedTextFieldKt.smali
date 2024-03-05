.class public final Landroidx/compose/material/OutlinedTextFieldKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u00d6\u0001\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0008\u00082\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u00a2\u0006\u0002\u0008\u00082\u0013\u0010\u000c\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0017H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u0087\u0002\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\n2\u0008\u0008\u0002\u0010#\u001a\u00020\u000b2\u0008\u0008\u0002\u0010$\u001a\u00020\u00102\u0008\u0008\u0002\u0010%\u001a\u00020\u00102\u0008\u0008\u0002\u0010&\u001a\u00020\'2\u0015\u0008\u0002\u0010\u000c\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0015\u0008\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0015\u0008\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0015\u0008\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0008\u0008\u0002\u0010*\u001a\u00020\u00102\u0008\u0008\u0002\u0010+\u001a\u00020,2\u0008\u0008\u0002\u0010-\u001a\u00020.2\u0008\u0008\u0002\u0010/\u001a\u0002002\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u00101\u001a\u0002022\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u00105\u001a\u000206H\u0007\u00a2\u0006\u0002\u00107\u001a\u0087\u0002\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u0002082\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00050\n2\u0008\u0008\u0002\u0010#\u001a\u00020\u000b2\u0008\u0008\u0002\u0010$\u001a\u00020\u00102\u0008\u0008\u0002\u0010%\u001a\u00020\u00102\u0008\u0008\u0002\u0010&\u001a\u00020\'2\u0015\u0008\u0002\u0010\u000c\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0015\u0008\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0015\u0008\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0015\u0008\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0008\u0008\u0002\u0010*\u001a\u00020\u00102\u0008\u0008\u0002\u0010+\u001a\u00020,2\u0008\u0008\u0002\u0010-\u001a\u00020.2\u0008\u0008\u0002\u0010/\u001a\u0002002\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u00101\u001a\u0002022\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u00105\u001a\u000206H\u0007\u00a2\u0006\u0002\u00109\u001a\u009d\u0002\u0010:\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u00101\u001a\u0002022\u0006\u0010+\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0019\u0010;\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u00a2\u0006\u0002\u0008\u00082\u0013\u0010<\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0008\u00082\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008B\u0010C\u001aM\u0010D\u001a\u0002022\u0006\u0010E\u001a\u0002022\u0006\u0010F\u001a\u0002022\u0006\u0010G\u001a\u0002022\u0006\u0010H\u001a\u0002022\u0006\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0015H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008M\u0010N\u001aE\u0010O\u001a\u0002022\u0006\u0010P\u001a\u0002022\u0006\u0010Q\u001a\u0002022\u0006\u0010R\u001a\u0002022\u0006\u0010S\u001a\u0002022\u0006\u0010T\u001a\u0002022\u0006\u0010J\u001a\u00020KH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008U\u0010V\u001a!\u0010W\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008X\u0010Y\u001a9\u0010Z\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0017H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008[\u0010\\\u001al\u0010]\u001a\u00020\u0005*\u00020^2\u0006\u0010_\u001a\u0002022\u0006\u0010`\u001a\u0002022\u0008\u0010a\u001a\u0004\u0018\u00010b2\u0008\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010d\u001a\u00020b2\u0008\u0010e\u001a\u0004\u0018\u00010b2\u0008\u0010f\u001a\u0004\u0018\u00010b2\u0006\u0010g\u001a\u00020b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0015H\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006h"
    }
    d2 = {
        "OutlinedTextFieldInnerPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "OutlinedTextFieldTopPadding",
        "IconsWithTextFieldLayout",
        "",
        "textField",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "placeholder",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/Modifier;",
        "label",
        "leading",
        "trailing",
        "singleLine",
        "",
        "leadingColor",
        "Landroidx/compose/ui/graphics/Color;",
        "trailingColor",
        "animationProgress",
        "",
        "onLabelMeasured",
        "Landroidx/compose/ui/geometry/Size;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "borderWidth",
        "borderColor",
        "labelSize",
        "IconsWithTextFieldLayout-T2E5_Oc",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/runtime/Composer;II)V",
        "OutlinedTextField",
        "value",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "onValueChange",
        "modifier",
        "enabled",
        "readOnly",
        "textStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "leadingIcon",
        "trailingIcon",
        "isError",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "keyboardActions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "maxLines",
        "",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "colors",
        "Landroidx/compose/material/TextFieldColors;",
        "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V",
        "",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V",
        "OutlinedTextFieldLayout",
        "decoratedPlaceholder",
        "decoratedLabel",
        "labelProgress",
        "indicatorWidth",
        "indicatorColor",
        "cursorColor",
        "backgroundColor",
        "OutlinedTextFieldLayout-uBqXD2s",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V",
        "calculateHeight",
        "leadingPlaceableHeight",
        "trailingPlaceableHeight",
        "textFieldPlaceableHeight",
        "labelPlaceableHeight",
        "placeholderPlaceableHeight",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "density",
        "calculateHeight-MK6IjOU",
        "(IIIIIJF)I",
        "calculateWidth",
        "leadingPlaceableWidth",
        "trailingPlaceableWidth",
        "textFieldPlaceableWidth",
        "labelPlaceableWidth",
        "placeholderPlaceableWidth",
        "calculateWidth-VsPV1Ek",
        "(IIIIIJ)I",
        "outlineCutout",
        "outlineCutout-d16Qtg0",
        "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;",
        "outlinedBorder",
        "outlinedBorder-gLEpSso",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJ)Landroidx/compose/ui/Modifier;",
        "place",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "height",
        "width",
        "leadingPlaceable",
        "Landroidx/compose/ui/layout/Placeable;",
        "trailingPlaceable",
        "textFieldPlaceable",
        "labelPlaceable",
        "placeholderPlaceable",
        "borderPlaceable",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final OutlinedTextFieldInnerPadding:F

.field private static final OutlinedTextFieldTopPadding:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    sput v0, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextFieldInnerPadding:F

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    sput v0, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextFieldTopPadding:F

    return-void
.end method

.method private static final IconsWithTextFieldLayout-T2E5_Oc(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/Modifier;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;ZJJF",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/geometry/Size;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "FJJ",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move/from16 v14, p5

    move/from16 v15, p10

    move-object/from16 v0, p11

    move/from16 v11, p19

    move/from16 v10, p20

    const v4, 0xaa3bc53

    move-object/from16 v5, p18

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    and-int/lit8 v4, v11, 0xe

    const/4 v5, 0x4

    const/4 v6, 0x2

    if-nez v4, :cond_1

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    or-int/2addr v4, v11

    goto :goto_1

    :cond_1
    move v4, v11

    :goto_1
    and-int/lit8 v7, v11, 0x70

    const/16 v16, 0x10

    if-nez v7, :cond_3

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move/from16 v7, v16

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v11, 0x380

    const/16 v17, 0x100

    const/16 v18, 0x80

    if-nez v7, :cond_5

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move/from16 v7, v17

    goto :goto_3

    :cond_4
    move/from16 v7, v18

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit16 v7, v11, 0x1c00

    const/16 v19, 0x800

    const/16 v20, 0x400

    if-nez v7, :cond_7

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move/from16 v7, v19

    goto :goto_4

    :cond_6
    move/from16 v7, v20

    :goto_4
    or-int/2addr v4, v7

    :cond_7
    const v7, 0xe000

    and-int/2addr v7, v11

    if-nez v7, :cond_9

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v4, v7

    :cond_9
    const/high16 v7, 0x70000

    and-int/2addr v7, v11

    if-nez v7, :cond_b

    invoke-interface {v9, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_a

    const/high16 v7, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v7, 0x10000

    :goto_6
    or-int/2addr v4, v7

    :cond_b
    const/high16 v7, 0x380000

    and-int/2addr v7, v11

    if-nez v7, :cond_d

    move-wide/from16 v7, p6

    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v21

    if-eqz v21, :cond_c

    const/high16 v21, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v21, 0x80000

    :goto_7
    or-int v4, v4, v21

    goto :goto_8

    :cond_d
    move-wide/from16 v7, p6

    :goto_8
    const/high16 v21, 0x1c00000

    and-int v21, v11, v21

    move-wide/from16 v7, p8

    if-nez v21, :cond_f

    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v21

    if-eqz v21, :cond_e

    const/high16 v21, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v21, 0x400000

    :goto_9
    or-int v4, v4, v21

    :cond_f
    const/high16 v21, 0xe000000

    and-int v21, v11, v21

    if-nez v21, :cond_11

    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v21

    if-eqz v21, :cond_10

    const/high16 v21, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v21, 0x2000000

    :goto_a
    or-int v4, v4, v21

    :cond_11
    const/high16 v21, 0x70000000

    and-int v21, v11, v21

    if-nez v21, :cond_13

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_12

    const/high16 v21, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v21, 0x10000000

    :goto_b
    or-int v4, v4, v21

    :cond_13
    and-int/lit8 v21, v10, 0xe

    move-object/from16 v11, p12

    if-nez v21, :cond_15

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_14

    goto :goto_c

    :cond_14
    move v5, v6

    :goto_c
    or-int/2addr v5, v10

    goto :goto_d

    :cond_15
    move v5, v10

    :goto_d
    and-int/lit8 v6, v10, 0x70

    if-nez v6, :cond_17

    move/from16 v6, p13

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v21

    if-eqz v21, :cond_16

    const/16 v16, 0x20

    :cond_16
    or-int v5, v5, v16

    goto :goto_e

    :cond_17
    move/from16 v6, p13

    :goto_e
    and-int/lit16 v6, v10, 0x380

    move-wide/from16 v7, p14

    if-nez v6, :cond_19

    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v6

    if-eqz v6, :cond_18

    goto :goto_f

    :cond_18
    move/from16 v17, v18

    :goto_f
    or-int v5, v5, v17

    :cond_19
    and-int/lit16 v6, v10, 0x1c00

    move-wide/from16 v7, p16

    if-nez v6, :cond_1b

    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v6

    if-eqz v6, :cond_1a

    goto :goto_10

    :cond_1a
    move/from16 v19, v20

    :goto_10
    or-int v5, v5, v19

    :cond_1b
    const v6, 0x5b6db6db

    and-int/2addr v6, v4

    const v16, 0x12492492

    xor-int v6, v6, v16

    if-nez v6, :cond_1d

    and-int/lit16 v5, v5, 0x16db

    xor-int/lit16 v5, v5, 0x492

    if-nez v5, :cond_1d

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v5

    if-nez v5, :cond_1c

    goto :goto_11

    :cond_1c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v6, v9

    goto/16 :goto_1b

    :cond_1d
    :goto_11
    invoke-static/range {p5 .. p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static/range {p10 .. p10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    shr-int/lit8 v16, v4, 0x12

    const v7, -0x383ecf

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v7

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1e

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_1f

    :cond_1e
    new-instance v6, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    invoke-direct {v6, v0, v14, v15}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;-><init>(Lkotlin/jvm/functions/Function1;ZF)V

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_1f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v6, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    const v8, 0x52057532

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/ui/unit/Density;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/unit/LayoutDirection;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/ViewConfiguration;

    sget-object v29, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    move-result-object v11

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v14

    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    if-nez v14, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    :cond_20
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v14

    if-eqz v14, :cond_21

    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_12

    :cond_21
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    :goto_12
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->disableReusing()V

    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v10

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v10, v6, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v10, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v8, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v0, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->enableReusing()V

    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v0

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v11, v0, v9, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v5, -0x2fed69a7

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v5, "border"

    invoke-static {v7, v5}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    move-object/from16 v23, p12

    move/from16 v24, p13

    move-wide/from16 v25, p14

    move-wide/from16 v27, p16

    invoke-static/range {v22 .. v28}, Landroidx/compose/material/OutlinedTextFieldKt;->outlinedBorder-gLEpSso(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJ)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v9, v14}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v5, -0x2fed68f6

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v11, 0x6

    const v8, -0x76a43a57

    if-eqz v12, :cond_24

    const-string v5, "Leading"

    invoke-static {v7, v5}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v6

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {v6, v14, v9, v11}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v6

    const v8, 0x52057532

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/unit/Density;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v11

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/ui/unit/LayoutDirection;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v10

    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/platform/ViewConfiguration;

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-static {v5}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    move-result-object v5

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v14

    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    if-nez v14, :cond_22

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    :cond_22
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v14

    if-eqz v14, :cond_23

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_13

    :cond_23
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    :goto_13
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->disableReusing()V

    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v0, v6, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v0, v8, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v0, v11, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v0, v10, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->enableReusing()V

    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v5, v0, v9, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v0, -0x4ab8dd79

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    const v5, -0x1aaefbee

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    and-int/lit8 v5, v16, 0xe

    and-int/lit16 v10, v4, 0x1c00

    or-int/2addr v10, v5

    const/4 v11, 0x6

    move v14, v4

    move-wide/from16 v4, p6

    move-object v0, v7

    move-object v7, v8

    move-object/from16 v8, p3

    move-object/from16 p18, v9

    const/4 v15, 0x6

    invoke-static/range {v4 .. v11}, Landroidx/compose/material/TextFieldImplKt;->Decoration-euL9pac(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endNode()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto :goto_14

    :cond_24
    move v14, v4

    move-object v0, v7

    move-object/from16 p18, v9

    move v15, v11

    :goto_14
    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const v4, -0x2fed6762

    move-object/from16 v11, p18

    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-eqz v13, :cond_27

    const-string v4, "Trailing"

    invoke-static {v0, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-interface {v4, v5}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v5

    const v10, -0x76a43a57

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v6, 0x0

    invoke-static {v5, v6, v11, v15}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v5

    const v9, 0x52057532

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/unit/Density;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v7

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/unit/LayoutDirection;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/platform/ViewConfiguration;

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v4}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v10

    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    if-nez v10, :cond_25

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    :cond_25
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v10

    if-eqz v10, :cond_26

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_15

    :cond_26
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    :goto_15
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->disableReusing()V

    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v9

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v5, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v7, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v8, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->enableReusing()V

    invoke-static {v11}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v5, v11, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v10, -0x4ab8dd79

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    sget-object v4, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    const v4, -0x1aaefa58

    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    shr-int/lit8 v4, v14, 0x15

    and-int/lit8 v4, v4, 0xe

    shr-int/lit8 v5, v14, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int v16, v4, v5

    const/16 v17, 0x6

    move-wide/from16 v4, p8

    move-object/from16 v8, p4

    const v15, 0x52057532

    move-object v9, v11

    const v15, -0x76a43a57

    move/from16 v10, v16

    move-object/from16 p18, v11

    move/from16 v11, v17

    invoke-static/range {v4 .. v11}, Landroidx/compose/material/TextFieldImplKt;->Decoration-euL9pac(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endNode()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto :goto_16

    :cond_27
    move-object/from16 p18, v11

    const v15, -0x76a43a57

    :goto_16
    invoke-interface/range {p18 .. p18}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getTextFieldPadding()F

    move-result v4

    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getHorizontalIconPadding()F

    move-result v5

    sub-float/2addr v4, v5

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    if-eqz v12, :cond_28

    move/from16 v18, v4

    goto :goto_17

    :cond_28
    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getTextFieldPadding()F

    move-result v5

    move/from16 v18, v5

    :goto_17
    const/16 v19, 0x0

    if-eqz v13, :cond_29

    goto :goto_18

    :cond_29
    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getTextFieldPadding()F

    move-result v4

    :goto_18
    move/from16 v20, v4

    const/16 v21, 0x0

    const/16 v22, 0xa

    const/16 v23, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v5, -0x2fed64a5

    move-object/from16 v6, p18

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-eqz v2, :cond_2a

    const-string v5, "Hint"

    invoke-static {v0, v5}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-interface {v5, v4}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit8 v7, v14, 0x70

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v5, v6, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const-string v5, "TextField"

    invoke-static {v0, v5}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-interface {v5, v4}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x1

    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v8

    const/16 v9, 0x30

    invoke-static {v8, v5, v6, v9}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v5

    const v8, 0x52057532

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/unit/Density;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/ui/unit/LayoutDirection;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v10

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/platform/ViewConfiguration;

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v4}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v15

    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    if-nez v15, :cond_2b

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    :cond_2b
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v15

    if-eqz v15, :cond_2c

    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_19

    :cond_2c
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    :goto_19
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->disableReusing()V

    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v11

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v11, v5, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v11, v8, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v11, v9, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v11, v10, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->enableReusing()V

    invoke-static {v6}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v5

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v5, v6, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v4, -0x4ab8dd79

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    const v5, -0x1aaef765

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 v5, v14, 0xe

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v6, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    if-eqz v3, :cond_2f

    const-string v5, "Label"

    invoke-static {v0, v5}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v5, -0x76a43a57

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v5, v7, v6, v7}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v5

    const v7, 0x52057532

    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v7

    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/unit/Density;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/unit/LayoutDirection;

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/ui/platform/ViewConfiguration;

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v11

    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    if-nez v11, :cond_2d

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    :cond_2d
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v11

    if-eqz v11, :cond_2e

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1a

    :cond_2e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    :goto_1a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->disableReusing()V

    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v10

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v5, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v7, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v8, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v9, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->enableReusing()V

    invoke-static {v6}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v5, v6, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v0, -0x1aaef6ec

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v0, 0x6

    shr-int/lit8 v0, v14, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v6, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    :cond_2f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    :goto_1b
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_30

    goto :goto_1c

    :cond_30
    new-instance v14, Landroidx/compose/material/OutlinedTextFieldKt$IconsWithTextFieldLayout$2;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v30, v14

    move/from16 v14, p13

    move-object/from16 v31, v15

    move-wide/from16 v15, p14

    move-wide/from16 v17, p16

    move/from16 v19, p19

    move/from16 v20, p20

    invoke-direct/range {v0 .. v20}, Landroidx/compose/material/OutlinedTextFieldKt$IconsWithTextFieldLayout$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJII)V

    move-object/from16 v1, v30

    move-object/from16 v0, v31

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1c
    return-void
.end method

.method public static final OutlinedTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
    .locals 74
    .param p0    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Landroidx/compose/material/TextFieldColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZI",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move/from16 v13, p20

    move/from16 v12, p21

    move/from16 v11, p22

    const-string v0, "value"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onValueChange"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x74e897fe

    move-object/from16 v1, p19

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v0, v11, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v0, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v13, 0xe

    if-nez v0, :cond_2

    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v13

    goto :goto_1

    :cond_2
    move v0, v13

    :goto_1
    and-int/lit8 v3, v11, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v13, 0x70

    if-nez v3, :cond_5

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v11, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v13, 0x380

    if-nez v8, :cond_8

    move-object/from16 v8, p2

    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v8, p2

    :goto_6
    and-int/lit8 v9, v11, 0x8

    const/16 v16, 0x800

    const/16 v17, 0x400

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v1, v13, 0x1c00

    if-nez v1, :cond_b

    move/from16 v1, p3

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v18, v16

    goto :goto_7

    :cond_a
    move/from16 v18, v17

    :goto_7
    or-int v0, v0, v18

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v1, p3

    :goto_9
    and-int/lit8 v18, v11, 0x10

    const v64, 0xe000

    const/16 v19, 0x2000

    if-eqz v18, :cond_c

    or-int/lit16 v0, v0, 0x6000

    move/from16 v2, p4

    goto :goto_b

    :cond_c
    and-int v20, v13, v64

    move/from16 v2, p4

    if-nez v20, :cond_e

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v21

    if-eqz v21, :cond_d

    const/16 v21, 0x4000

    goto :goto_a

    :cond_d
    move/from16 v21, v19

    :goto_a
    or-int v0, v0, v21

    :cond_e
    :goto_b
    const/high16 v65, 0x70000

    and-int v21, v13, v65

    const/high16 v22, 0x20000

    if-nez v21, :cond_10

    and-int/lit8 v21, v11, 0x20

    move-object/from16 v4, p5

    if-nez v21, :cond_f

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_f

    move/from16 v23, v22

    goto :goto_c

    :cond_f
    const/high16 v23, 0x10000

    :goto_c
    or-int v0, v0, v23

    goto :goto_d

    :cond_10
    move-object/from16 v4, p5

    :goto_d
    and-int/lit8 v23, v11, 0x40

    const/high16 v66, 0x380000

    if-eqz v23, :cond_11

    const/high16 v24, 0x180000

    or-int v0, v0, v24

    move-object/from16 v5, p6

    goto :goto_f

    :cond_11
    and-int v24, v13, v66

    move-object/from16 v5, p6

    if-nez v24, :cond_13

    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_12

    const/high16 v25, 0x100000

    goto :goto_e

    :cond_12
    const/high16 v25, 0x80000

    :goto_e
    or-int v0, v0, v25

    :cond_13
    :goto_f
    and-int/lit16 v6, v11, 0x80

    const/high16 v67, 0x1c00000

    if-eqz v6, :cond_14

    const/high16 v26, 0xc00000

    or-int v0, v0, v26

    move-object/from16 v7, p7

    goto :goto_11

    :cond_14
    and-int v26, v13, v67

    move-object/from16 v7, p7

    if-nez v26, :cond_16

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_15

    const/high16 v27, 0x800000

    goto :goto_10

    :cond_15
    const/high16 v27, 0x400000

    :goto_10
    or-int v0, v0, v27

    :cond_16
    :goto_11
    and-int/lit16 v1, v11, 0x100

    const/high16 v68, 0xe000000

    if-eqz v1, :cond_17

    const/high16 v27, 0x6000000

    or-int v0, v0, v27

    move-object/from16 v2, p8

    goto :goto_13

    :cond_17
    and-int v27, v13, v68

    move-object/from16 v2, p8

    if-nez v27, :cond_19

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_18

    const/high16 v27, 0x4000000

    goto :goto_12

    :cond_18
    const/high16 v27, 0x2000000

    :goto_12
    or-int v0, v0, v27

    :cond_19
    :goto_13
    and-int/lit16 v2, v11, 0x200

    if-eqz v2, :cond_1a

    const/high16 v27, 0x30000000

    or-int v0, v0, v27

    move-object/from16 v4, p9

    goto :goto_15

    :cond_1a
    const/high16 v27, 0x70000000

    and-int v27, v13, v27

    move-object/from16 v4, p9

    if-nez v27, :cond_1c

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_1b

    const/high16 v27, 0x20000000

    goto :goto_14

    :cond_1b
    const/high16 v27, 0x10000000

    :goto_14
    or-int v0, v0, v27

    :cond_1c
    :goto_15
    and-int/lit16 v4, v11, 0x400

    if-eqz v4, :cond_1d

    or-int/lit8 v20, v12, 0x6

    move/from16 v5, p10

    goto :goto_17

    :cond_1d
    and-int/lit8 v27, v12, 0xe

    move/from16 v5, p10

    if-nez v27, :cond_1f

    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v27

    if-eqz v27, :cond_1e

    const/16 v20, 0x4

    goto :goto_16

    :cond_1e
    const/16 v20, 0x2

    :goto_16
    or-int v20, v12, v20

    goto :goto_17

    :cond_1f
    move/from16 v20, v12

    :goto_17
    and-int/lit16 v5, v11, 0x800

    if-eqz v5, :cond_20

    or-int/lit8 v20, v20, 0x30

    move-object/from16 v7, p11

    goto :goto_19

    :cond_20
    and-int/lit8 v27, v12, 0x70

    move-object/from16 v7, p11

    if-nez v27, :cond_22

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_21

    const/16 v21, 0x20

    goto :goto_18

    :cond_21
    const/16 v21, 0x10

    :goto_18
    or-int v20, v20, v21

    :cond_22
    :goto_19
    and-int/lit16 v7, v12, 0x380

    if-nez v7, :cond_25

    and-int/lit16 v7, v11, 0x1000

    if-nez v7, :cond_23

    move-object/from16 v7, p12

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_24

    const/16 v25, 0x100

    goto :goto_1a

    :cond_23
    move-object/from16 v7, p12

    :cond_24
    const/16 v25, 0x80

    :goto_1a
    or-int v20, v20, v25

    goto :goto_1b

    :cond_25
    move-object/from16 v7, p12

    :goto_1b
    and-int/lit16 v7, v12, 0x1c00

    if-nez v7, :cond_28

    and-int/lit16 v7, v11, 0x2000

    if-nez v7, :cond_26

    move-object/from16 v7, p13

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_27

    goto :goto_1c

    :cond_26
    move-object/from16 v7, p13

    :cond_27
    move/from16 v16, v17

    :goto_1c
    or-int v20, v20, v16

    goto :goto_1d

    :cond_28
    move-object/from16 v7, p13

    :goto_1d
    move/from16 v7, v20

    and-int/lit16 v8, v11, 0x4000

    if-eqz v8, :cond_29

    or-int/lit16 v7, v7, 0x6000

    move/from16 v14, p14

    goto :goto_1e

    :cond_29
    and-int v16, v12, v64

    move/from16 v14, p14

    if-nez v16, :cond_2b

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_2a

    const/16 v19, 0x4000

    :cond_2a
    or-int v7, v7, v19

    :cond_2b
    :goto_1e
    const v16, 0x8000

    and-int v16, v11, v16

    if-eqz v16, :cond_2c

    const/high16 v17, 0x30000

    or-int v7, v7, v17

    move/from16 v14, p15

    goto :goto_20

    :cond_2c
    and-int v17, v12, v65

    move/from16 v14, p15

    if-nez v17, :cond_2e

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_2d

    move/from16 v17, v22

    goto :goto_1f

    :cond_2d
    const/high16 v17, 0x10000

    :goto_1f
    or-int v7, v7, v17

    :cond_2e
    :goto_20
    const/high16 v17, 0x10000

    and-int v17, v11, v17

    if-eqz v17, :cond_2f

    const/high16 v19, 0x180000

    or-int v7, v7, v19

    move-object/from16 v14, p16

    goto :goto_22

    :cond_2f
    and-int v19, v12, v66

    move-object/from16 v14, p16

    if-nez v19, :cond_31

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_30

    const/high16 v19, 0x100000

    goto :goto_21

    :cond_30
    const/high16 v19, 0x80000

    :goto_21
    or-int v7, v7, v19

    :cond_31
    :goto_22
    and-int v19, v12, v67

    if-nez v19, :cond_33

    and-int v19, v11, v22

    move-object/from16 v14, p17

    if-nez v19, :cond_32

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_32

    const/high16 v19, 0x800000

    goto :goto_23

    :cond_32
    const/high16 v19, 0x400000

    :goto_23
    or-int v7, v7, v19

    goto :goto_24

    :cond_33
    move-object/from16 v14, p17

    :goto_24
    and-int v19, v12, v68

    if-nez v19, :cond_35

    const/high16 v19, 0x40000

    and-int v19, v11, v19

    move-object/from16 v12, p18

    if-nez v19, :cond_34

    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_34

    const/high16 v19, 0x4000000

    goto :goto_25

    :cond_34
    const/high16 v19, 0x2000000

    :goto_25
    or-int v7, v7, v19

    goto :goto_26

    :cond_35
    move-object/from16 v12, p18

    :goto_26
    const v19, 0x5b6db6db

    and-int v19, v0, v19

    const v20, 0x12492492

    xor-int v19, v19, v20

    if-nez v19, :cond_37

    const v19, 0xb6db6db

    and-int v19, v7, v19

    const v20, 0x2492492

    xor-int v19, v19, v20

    if-nez v19, :cond_37

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v19

    if-nez v19, :cond_36

    goto :goto_27

    :cond_36
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v38, v10

    move-object/from16 v19, v12

    move-object/from16 v18, v14

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    goto/16 :goto_3a

    :cond_37
    :goto_27
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v19, v13, 0x1

    if-eqz v19, :cond_3e

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v19

    if-eqz v19, :cond_38

    goto :goto_29

    :cond_38
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v11, 0x20

    if-eqz v1, :cond_39

    const v1, -0x70001

    and-int/2addr v0, v1

    :cond_39
    and-int/lit16 v1, v11, 0x1000

    if-eqz v1, :cond_3a

    and-int/lit16 v7, v7, -0x381

    :cond_3a
    and-int/lit16 v1, v11, 0x2000

    if-eqz v1, :cond_3b

    and-int/lit16 v7, v7, -0x1c01

    :cond_3b
    and-int v1, v11, v22

    if-eqz v1, :cond_3c

    const v1, -0x1c00001

    and-int/2addr v7, v1

    :cond_3c
    const/high16 v1, 0x40000

    and-int/2addr v1, v11

    if-eqz v1, :cond_3d

    const v1, -0xe000001

    and-int/2addr v7, v1

    :cond_3d
    move-object/from16 v24, p2

    move/from16 v25, p3

    move/from16 v69, p4

    move-object/from16 v26, p5

    move-object/from16 v70, p6

    move-object/from16 v27, p7

    move-object/from16 v28, p8

    move-object/from16 v29, p9

    move/from16 v30, p10

    move-object/from16 v31, p11

    move-object/from16 v32, p12

    move-object/from16 v33, p13

    move/from16 v34, p14

    move/from16 v71, p15

    move-object/from16 v35, p16

    move-object/from16 v37, p18

    move v1, v0

    :goto_28
    move-object/from16 v36, v14

    goto/16 :goto_39

    :cond_3e
    :goto_29
    if-eqz v3, :cond_3f

    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_2a

    :cond_3f
    move-object/from16 v3, p2

    :goto_2a
    if-eqz v9, :cond_40

    const/4 v9, 0x1

    goto :goto_2b

    :cond_40
    move/from16 v9, p3

    :goto_2b
    if-eqz v18, :cond_41

    const/16 v18, 0x0

    move/from16 v69, v18

    goto :goto_2c

    :cond_41
    move/from16 v69, p4

    :goto_2c
    and-int/lit8 v18, v11, 0x20

    if-eqz v18, :cond_42

    invoke-static {}, Landroidx/compose/material/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/text/TextStyle;

    const v18, -0x70001

    and-int v0, v0, v18

    goto :goto_2d

    :cond_42
    move-object/from16 v12, p5

    :goto_2d
    const/16 v18, 0x0

    if-eqz v23, :cond_43

    move-object/from16 v70, v18

    goto :goto_2e

    :cond_43
    move-object/from16 v70, p6

    :goto_2e
    if-eqz v6, :cond_44

    move-object/from16 v6, v18

    goto :goto_2f

    :cond_44
    move-object/from16 v6, p7

    :goto_2f
    if-eqz v1, :cond_45

    move-object/from16 v1, v18

    goto :goto_30

    :cond_45
    move-object/from16 v1, p8

    :goto_30
    if-eqz v2, :cond_46

    move-object/from16 v2, v18

    goto :goto_31

    :cond_46
    move-object/from16 v2, p9

    :goto_31
    if-eqz v4, :cond_47

    const/4 v4, 0x0

    goto :goto_32

    :cond_47
    move/from16 v4, p10

    :goto_32
    if-eqz v5, :cond_48

    sget-object v5, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v5

    goto :goto_33

    :cond_48
    move-object/from16 v5, p11

    :goto_33
    move/from16 p2, v0

    and-int/lit16 v0, v11, 0x1000

    if-eqz v0, :cond_49

    sget-object v0, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v0

    and-int/lit16 v7, v7, -0x381

    goto :goto_34

    :cond_49
    move-object/from16 v0, p12

    :goto_34
    move-object/from16 p3, v0

    and-int/lit16 v0, v11, 0x2000

    if-eqz v0, :cond_4a

    new-instance v0, Landroidx/compose/foundation/text/KeyboardActions;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x3f

    const/16 v26, 0x0

    move-object/from16 p4, v0

    move-object/from16 p5, v18

    move-object/from16 p6, v19

    move-object/from16 p7, v20

    move-object/from16 p8, v21

    move-object/from16 p9, v23

    move-object/from16 p10, v24

    move/from16 p11, v25

    move-object/from16 p12, v26

    invoke-direct/range {p4 .. p12}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v7, v7, -0x1c01

    goto :goto_35

    :cond_4a
    move-object/from16 v0, p13

    :goto_35
    if-eqz v8, :cond_4b

    const/4 v8, 0x0

    goto :goto_36

    :cond_4b
    move/from16 v8, p14

    :goto_36
    if-eqz v16, :cond_4c

    const v16, 0x7fffffff

    move/from16 v71, v16

    goto :goto_37

    :cond_4c
    move/from16 v71, p15

    :goto_37
    move-object/from16 p4, v0

    if-eqz v17, :cond_4e

    const v0, -0x384349

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p5, v1

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_4d

    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v0

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_4d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_38

    :cond_4e
    move-object/from16 p5, v1

    move-object/from16 v0, p16

    :goto_38
    and-int v1, v11, v22

    if-eqz v1, :cond_4f

    sget-object v1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    const/4 v14, 0x6

    invoke-virtual {v1, v10, v14}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material/Shapes;->getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v1

    const v14, -0x1c00001

    and-int/2addr v7, v14

    move-object v14, v1

    :cond_4f
    const/high16 v1, 0x40000

    and-int/2addr v1, v11

    if-eqz v1, :cond_50

    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x30

    const v63, 0x1fffff

    move-object/from16 v59, v10

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->outlinedTextFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v1

    const v16, -0xe000001

    and-int v7, v7, v16

    move-object/from16 v32, p3

    move-object/from16 v33, p4

    move-object/from16 v28, p5

    move-object/from16 v35, v0

    move-object/from16 v37, v1

    move-object/from16 v29, v2

    move-object/from16 v24, v3

    move/from16 v30, v4

    move-object/from16 v31, v5

    move-object/from16 v27, v6

    move/from16 v34, v8

    move/from16 v25, v9

    move-object/from16 v26, v12

    move-object/from16 v36, v14

    move/from16 v1, p2

    goto :goto_39

    :cond_50
    move/from16 v1, p2

    move-object/from16 v32, p3

    move-object/from16 v33, p4

    move-object/from16 v28, p5

    move-object/from16 v37, p18

    move-object/from16 v35, v0

    move-object/from16 v29, v2

    move-object/from16 v24, v3

    move/from16 v30, v4

    move-object/from16 v31, v5

    move-object/from16 v27, v6

    move/from16 v34, v8

    move/from16 v25, v9

    move-object/from16 v26, v12

    goto/16 :goto_28

    :goto_39
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endDefaults()V

    sget-object v0, Landroidx/compose/material/TextFieldType;->Outlined:Landroidx/compose/material/TextFieldType;

    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v3, v2, 0x70

    const/4 v4, 0x6

    or-int/2addr v3, v4

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x9

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v2, v4

    and-int v4, v3, v64

    or-int/2addr v2, v4

    and-int v3, v3, v65

    or-int/2addr v2, v3

    shl-int/lit8 v3, v7, 0x6

    and-int v4, v3, v66

    or-int/2addr v2, v4

    shl-int/lit8 v4, v1, 0x6

    and-int v5, v4, v67

    or-int/2addr v2, v5

    and-int v5, v4, v68

    or-int/2addr v2, v5

    const/high16 v5, 0x70000000

    and-int/2addr v4, v5

    or-int v21, v2, v4

    shr-int/lit8 v1, v1, 0x18

    and-int/lit8 v2, v1, 0xe

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v3, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v3, 0x1c00

    or-int/2addr v1, v2

    and-int v2, v3, v64

    or-int/2addr v1, v2

    sget v2, Landroidx/compose/foundation/text/KeyboardActions;->$stable:I

    shl-int/lit8 v2, v2, 0xf

    or-int/2addr v1, v2

    and-int v2, v3, v65

    or-int/2addr v1, v2

    shl-int/lit8 v2, v7, 0x3

    and-int v3, v2, v66

    or-int/2addr v1, v3

    and-int v3, v2, v67

    or-int/2addr v1, v3

    and-int v3, v2, v68

    or-int/2addr v1, v3

    const/high16 v3, 0x70000000

    and-int/2addr v2, v3

    or-int v22, v1, v2

    const/16 v23, 0x0

    move/from16 v1, v25

    move/from16 v2, v69

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, v24

    move/from16 v6, v34

    move-object/from16 v7, v26

    move-object/from16 v8, v70

    move-object/from16 v9, v27

    move-object/from16 v38, v10

    move-object/from16 v10, v28

    move-object/from16 v11, v29

    move/from16 v12, v30

    move-object/from16 v13, v31

    move-object/from16 v14, v32

    move-object/from16 v15, v33

    move/from16 v16, v71

    move-object/from16 v17, v35

    move-object/from16 v18, v36

    move-object/from16 v19, v37

    move-object/from16 v20, v38

    invoke-static/range {v0 .. v23}, Landroidx/compose/material/TextFieldImplKt;->TextFieldImpl(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v24

    move/from16 v4, v25

    move-object/from16 v6, v26

    move-object/from16 v8, v27

    move-object/from16 v9, v28

    move-object/from16 v10, v29

    move/from16 v11, v30

    move-object/from16 v12, v31

    move-object/from16 v13, v32

    move-object/from16 v14, v33

    move/from16 v15, v34

    move/from16 v5, v69

    move-object/from16 v7, v70

    :goto_3a
    invoke-interface/range {v38 .. v38}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-nez v2, :cond_51

    goto :goto_3b

    :cond_51
    new-instance v1, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextField$5;

    move-object v0, v1

    move-object/from16 v72, v1

    move-object/from16 v1, p0

    move-object/from16 v73, v2

    move-object/from16 v2, p1

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    invoke-direct/range {v0 .. v22}, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextField$5;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;III)V

    move-object/from16 v1, v72

    move-object/from16 v0, v73

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_3b
    return-void
.end method

.method public static final OutlinedTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
    .locals 73
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Landroidx/compose/material/TextFieldColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZI",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v15, p20

    move/from16 v14, p21

    move/from16 v13, p22

    const-string v0, "value"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onValueChange"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x74e87efe

    move-object/from16 v3, p19

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v0

    and-int/lit8 v3, v13, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v15, 0xe

    if-nez v3, :cond_2

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v15

    goto :goto_1

    :cond_2
    move v3, v15

    :goto_1
    and-int/lit8 v6, v13, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v15, 0x70

    if-nez v6, :cond_5

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v13, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v15, 0x380

    if-nez v11, :cond_8

    move-object/from16 v11, p2

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v3, v12

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v11, p2

    :goto_6
    and-int/lit8 v12, v13, 0x8

    const/16 v16, 0x800

    const/16 v17, 0x400

    if-eqz v12, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v4, v15, 0x1c00

    if-nez v4, :cond_b

    move/from16 v4, p3

    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v18, v16

    goto :goto_7

    :cond_a
    move/from16 v18, v17

    :goto_7
    or-int v3, v3, v18

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v4, p3

    :goto_9
    and-int/lit8 v18, v13, 0x10

    const v64, 0xe000

    const/16 v19, 0x2000

    if-eqz v18, :cond_c

    or-int/lit16 v3, v3, 0x6000

    move/from16 v7, p4

    goto :goto_b

    :cond_c
    and-int v20, v15, v64

    move/from16 v7, p4

    if-nez v20, :cond_e

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v21

    if-eqz v21, :cond_d

    const/16 v21, 0x4000

    goto :goto_a

    :cond_d
    move/from16 v21, v19

    :goto_a
    or-int v3, v3, v21

    :cond_e
    :goto_b
    const/high16 v65, 0x70000

    and-int v21, v15, v65

    const/high16 v22, 0x20000

    if-nez v21, :cond_10

    and-int/lit8 v21, v13, 0x20

    move-object/from16 v8, p5

    if-nez v21, :cond_f

    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_f

    move/from16 v23, v22

    goto :goto_c

    :cond_f
    const/high16 v23, 0x10000

    :goto_c
    or-int v3, v3, v23

    goto :goto_d

    :cond_10
    move-object/from16 v8, p5

    :goto_d
    and-int/lit8 v23, v13, 0x40

    const/high16 v66, 0x380000

    if-eqz v23, :cond_11

    const/high16 v24, 0x180000

    or-int v3, v3, v24

    move-object/from16 v9, p6

    goto :goto_f

    :cond_11
    and-int v24, v15, v66

    move-object/from16 v9, p6

    if-nez v24, :cond_13

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_12

    const/high16 v25, 0x100000

    goto :goto_e

    :cond_12
    const/high16 v25, 0x80000

    :goto_e
    or-int v3, v3, v25

    :cond_13
    :goto_f
    and-int/lit16 v10, v13, 0x80

    const/high16 v67, 0x1c00000

    if-eqz v10, :cond_14

    const/high16 v26, 0xc00000

    or-int v3, v3, v26

    move-object/from16 v5, p7

    goto :goto_11

    :cond_14
    and-int v26, v15, v67

    move-object/from16 v5, p7

    if-nez v26, :cond_16

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_15

    const/high16 v26, 0x800000

    goto :goto_10

    :cond_15
    const/high16 v26, 0x400000

    :goto_10
    or-int v3, v3, v26

    :cond_16
    :goto_11
    and-int/lit16 v4, v13, 0x100

    const/high16 v68, 0xe000000

    if-eqz v4, :cond_17

    const/high16 v26, 0x6000000

    or-int v3, v3, v26

    move-object/from16 v5, p8

    goto :goto_13

    :cond_17
    and-int v26, v15, v68

    move-object/from16 v5, p8

    if-nez v26, :cond_19

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_18

    const/high16 v26, 0x4000000

    goto :goto_12

    :cond_18
    const/high16 v26, 0x2000000

    :goto_12
    or-int v3, v3, v26

    :cond_19
    :goto_13
    and-int/lit16 v5, v13, 0x200

    if-eqz v5, :cond_1a

    const/high16 v26, 0x30000000

    or-int v3, v3, v26

    move-object/from16 v7, p9

    goto :goto_15

    :cond_1a
    const/high16 v26, 0x70000000

    and-int v26, v15, v26

    move-object/from16 v7, p9

    if-nez v26, :cond_1c

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1b

    const/high16 v26, 0x20000000

    goto :goto_14

    :cond_1b
    const/high16 v26, 0x10000000

    :goto_14
    or-int v3, v3, v26

    :cond_1c
    :goto_15
    and-int/lit16 v7, v13, 0x400

    if-eqz v7, :cond_1d

    or-int/lit8 v26, v14, 0x6

    move/from16 v8, p10

    goto :goto_17

    :cond_1d
    and-int/lit8 v26, v14, 0xe

    move/from16 v8, p10

    if-nez v26, :cond_1f

    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v26

    if-eqz v26, :cond_1e

    const/16 v26, 0x4

    goto :goto_16

    :cond_1e
    const/16 v26, 0x2

    :goto_16
    or-int v26, v14, v26

    goto :goto_17

    :cond_1f
    move/from16 v26, v14

    :goto_17
    and-int/lit16 v8, v13, 0x800

    if-eqz v8, :cond_20

    or-int/lit8 v26, v26, 0x30

    move-object/from16 v9, p11

    goto :goto_19

    :cond_20
    and-int/lit8 v27, v14, 0x70

    move-object/from16 v9, p11

    if-nez v27, :cond_22

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_21

    const/16 v20, 0x20

    goto :goto_18

    :cond_21
    const/16 v20, 0x10

    :goto_18
    or-int v26, v26, v20

    :cond_22
    :goto_19
    and-int/lit16 v9, v14, 0x380

    if-nez v9, :cond_25

    and-int/lit16 v9, v13, 0x1000

    if-nez v9, :cond_23

    move-object/from16 v9, p12

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_24

    const/16 v25, 0x100

    goto :goto_1a

    :cond_23
    move-object/from16 v9, p12

    :cond_24
    const/16 v25, 0x80

    :goto_1a
    or-int v26, v26, v25

    goto :goto_1b

    :cond_25
    move-object/from16 v9, p12

    :goto_1b
    and-int/lit16 v9, v14, 0x1c00

    if-nez v9, :cond_28

    and-int/lit16 v9, v13, 0x2000

    if-nez v9, :cond_26

    move-object/from16 v9, p13

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_27

    goto :goto_1c

    :cond_26
    move-object/from16 v9, p13

    :cond_27
    move/from16 v16, v17

    :goto_1c
    or-int v26, v26, v16

    goto :goto_1d

    :cond_28
    move-object/from16 v9, p13

    :goto_1d
    move/from16 v9, v26

    and-int/lit16 v11, v13, 0x4000

    if-eqz v11, :cond_29

    or-int/lit16 v9, v9, 0x6000

    move/from16 v2, p14

    goto :goto_1e

    :cond_29
    and-int v16, v14, v64

    move/from16 v2, p14

    if-nez v16, :cond_2b

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_2a

    const/16 v19, 0x4000

    :cond_2a
    or-int v9, v9, v19

    :cond_2b
    :goto_1e
    const v16, 0x8000

    and-int v16, v13, v16

    if-eqz v16, :cond_2c

    const/high16 v17, 0x30000

    or-int v9, v9, v17

    move/from16 v2, p15

    goto :goto_20

    :cond_2c
    and-int v17, v14, v65

    move/from16 v2, p15

    if-nez v17, :cond_2e

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_2d

    move/from16 v17, v22

    goto :goto_1f

    :cond_2d
    const/high16 v17, 0x10000

    :goto_1f
    or-int v9, v9, v17

    :cond_2e
    :goto_20
    const/high16 v17, 0x10000

    and-int v17, v13, v17

    if-eqz v17, :cond_2f

    const/high16 v19, 0x180000

    or-int v9, v9, v19

    move-object/from16 v2, p16

    goto :goto_22

    :cond_2f
    and-int v19, v14, v66

    move-object/from16 v2, p16

    if-nez v19, :cond_31

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_30

    const/high16 v19, 0x100000

    goto :goto_21

    :cond_30
    const/high16 v19, 0x80000

    :goto_21
    or-int v9, v9, v19

    :cond_31
    :goto_22
    and-int v19, v14, v67

    if-nez v19, :cond_33

    and-int v19, v13, v22

    move-object/from16 v2, p17

    if-nez v19, :cond_32

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_32

    const/high16 v19, 0x800000

    goto :goto_23

    :cond_32
    const/high16 v19, 0x400000

    :goto_23
    or-int v9, v9, v19

    goto :goto_24

    :cond_33
    move-object/from16 v2, p17

    :goto_24
    and-int v19, v14, v68

    if-nez v19, :cond_35

    const/high16 v19, 0x40000

    and-int v19, v13, v19

    move-object/from16 v2, p18

    if-nez v19, :cond_34

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_34

    const/high16 v19, 0x4000000

    goto :goto_25

    :cond_34
    const/high16 v19, 0x2000000

    :goto_25
    or-int v9, v9, v19

    goto :goto_26

    :cond_35
    move-object/from16 v2, p18

    :goto_26
    const v19, 0x5b6db6db

    and-int v19, v3, v19

    const v20, 0x12492492

    xor-int v19, v19, v20

    if-nez v19, :cond_37

    const v19, 0xb6db6db

    and-int v19, v9, v19

    const v20, 0x2492492

    xor-int v19, v19, v20

    if-nez v19, :cond_37

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v19

    if-nez v19, :cond_36

    goto :goto_27

    :cond_36
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p5

    move-object/from16 v70, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, v2

    goto/16 :goto_3c

    :cond_37
    :goto_27
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v19, v15, 0x1

    if-eqz v19, :cond_3e

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v19

    if-eqz v19, :cond_38

    goto :goto_28

    :cond_38
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v4, v13, 0x20

    if-eqz v4, :cond_39

    const v4, -0x70001

    and-int/2addr v3, v4

    :cond_39
    and-int/lit16 v4, v13, 0x1000

    if-eqz v4, :cond_3a

    and-int/lit16 v9, v9, -0x381

    :cond_3a
    and-int/lit16 v4, v13, 0x2000

    if-eqz v4, :cond_3b

    and-int/lit16 v9, v9, -0x1c01

    :cond_3b
    and-int v4, v13, v22

    if-eqz v4, :cond_3c

    const v4, -0x1c00001

    and-int/2addr v9, v4

    :cond_3c
    const/high16 v4, 0x40000

    and-int/2addr v4, v13

    if-eqz v4, :cond_3d

    const v4, -0xe000001

    and-int/2addr v9, v4

    :cond_3d
    move-object/from16 v6, p2

    move/from16 v12, p3

    move/from16 v69, p4

    move-object/from16 v2, p5

    move-object/from16 v70, p6

    move-object/from16 v10, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move/from16 v7, p10

    move-object/from16 v8, p11

    move/from16 v11, p14

    move/from16 v71, p15

    move-object/from16 v39, p16

    move-object/from16 v40, p17

    move-object/from16 v41, p18

    move v13, v3

    move v14, v9

    move-object/from16 v3, p12

    move-object/from16 v9, p13

    goto/16 :goto_3a

    :cond_3e
    :goto_28
    if-eqz v6, :cond_3f

    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_29

    :cond_3f
    move-object/from16 v6, p2

    :goto_29
    if-eqz v12, :cond_40

    const/4 v12, 0x1

    goto :goto_2a

    :cond_40
    move/from16 v12, p3

    :goto_2a
    if-eqz v18, :cond_41

    const/16 v18, 0x0

    move/from16 v69, v18

    goto :goto_2b

    :cond_41
    move/from16 v69, p4

    :goto_2b
    and-int/lit8 v18, v13, 0x20

    if-eqz v18, :cond_42

    invoke-static {}, Landroidx/compose/material/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/text/TextStyle;

    const v18, -0x70001

    and-int v3, v3, v18

    goto :goto_2c

    :cond_42
    move-object/from16 v2, p5

    :goto_2c
    if-eqz v23, :cond_43

    const/16 v70, 0x0

    goto :goto_2d

    :cond_43
    move-object/from16 v70, p6

    :goto_2d
    if-eqz v10, :cond_44

    const/4 v10, 0x0

    goto :goto_2e

    :cond_44
    move-object/from16 v10, p7

    :goto_2e
    if-eqz v4, :cond_45

    const/4 v4, 0x0

    goto :goto_2f

    :cond_45
    move-object/from16 v4, p8

    :goto_2f
    if-eqz v5, :cond_46

    const/4 v5, 0x0

    goto :goto_30

    :cond_46
    move-object/from16 v5, p9

    :goto_30
    if-eqz v7, :cond_47

    const/4 v7, 0x0

    goto :goto_31

    :cond_47
    move/from16 v7, p10

    :goto_31
    if-eqz v8, :cond_48

    sget-object v8, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v8

    goto :goto_32

    :cond_48
    move-object/from16 v8, p11

    :goto_32
    move-object/from16 p2, v2

    and-int/lit16 v2, v13, 0x1000

    if-eqz v2, :cond_49

    sget-object v2, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v2

    and-int/lit16 v9, v9, -0x381

    goto :goto_33

    :cond_49
    move-object/from16 v2, p12

    :goto_33
    move-object/from16 p3, v2

    and-int/lit16 v2, v13, 0x2000

    if-eqz v2, :cond_4a

    sget-object v2, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v2

    and-int/lit16 v9, v9, -0x1c01

    goto :goto_34

    :cond_4a
    move-object/from16 v2, p13

    :goto_34
    if-eqz v11, :cond_4b

    const/4 v11, 0x0

    goto :goto_35

    :cond_4b
    move/from16 v11, p14

    :goto_35
    if-eqz v16, :cond_4c

    const v16, 0x7fffffff

    move/from16 v71, v16

    goto :goto_36

    :cond_4c
    move/from16 v71, p15

    :goto_36
    move-object/from16 p4, v2

    if-eqz v17, :cond_4e

    const v2, -0x384349

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p5, v3

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_4d

    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_4d
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_37

    :cond_4e
    move/from16 p5, v3

    move-object/from16 v2, p16

    :goto_37
    and-int v3, v13, v22

    if-eqz v3, :cond_4f

    sget-object v3, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    move-object/from16 p6, v2

    const/4 v2, 0x6

    invoke-virtual {v3, v0, v2}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material/Shapes;->getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v2

    const v3, -0x1c00001

    and-int/2addr v3, v9

    move v9, v3

    goto :goto_38

    :cond_4f
    move-object/from16 p6, v2

    move-object/from16 v2, p17

    :goto_38
    const/high16 v3, 0x40000

    and-int/2addr v3, v13

    if-eqz v3, :cond_50

    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x30

    const v63, 0x1fffff

    move-object/from16 v59, v0

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->outlinedTextFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v3

    const v16, -0xe000001

    and-int v9, v9, v16

    move/from16 v13, p5

    move-object/from16 v39, p6

    move-object/from16 v40, v2

    move-object/from16 v41, v3

    move v14, v9

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    goto :goto_39

    :cond_50
    move-object/from16 v3, p3

    move/from16 v13, p5

    move-object/from16 v39, p6

    move-object/from16 v41, p18

    move-object/from16 v40, v2

    move v14, v9

    move-object/from16 v2, p2

    :goto_39
    move-object/from16 v9, p4

    :goto_3a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endDefaults()V

    const v15, -0x384349

    invoke-interface {v0, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p9, v11

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v15, v11, :cond_51

    new-instance v11, Landroidx/compose/ui/text/input/TextFieldValue;

    const-wide/16 v17, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x6

    const/16 v20, 0x0

    move-object/from16 p2, v11

    move-object/from16 p3, p0

    move-wide/from16 p4, v17

    move-object/from16 p6, v15

    move/from16 p7, v19

    move-object/from16 p8, v20

    invoke-direct/range {p2 .. p8}, Landroidx/compose/ui/text/input/TextFieldValue;-><init>(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p10, v9

    const/4 v9, 0x0

    const/4 v15, 0x2

    invoke-static {v11, v9, v15, v9}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v15

    invoke-interface {v0, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    goto :goto_3b

    :cond_51
    move-object/from16 p10, v9

    :goto_3b
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v15, Landroidx/compose/runtime/MutableState;

    invoke-static {v15}, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextField$lambda-2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v9

    const-wide/16 v17, 0x0

    const/4 v11, 0x0

    const/16 v19, 0x6

    const/16 v20, 0x0

    move-object/from16 p2, v9

    move-object/from16 p3, p0

    move-wide/from16 p4, v17

    move-object/from16 p6, v11

    move/from16 p7, v19

    move-object/from16 p8, v20

    invoke-static/range {p2 .. p8}, Landroidx/compose/ui/text/input/TextFieldValue;->copy-3r_uNRQ$default(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v9

    const v11, -0x383ecf

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v0, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    or-int v11, v11, v17

    move-object/from16 p2, v3

    move-object/from16 v3, p1

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    or-int v11, v11, v17

    move-object/from16 p3, v8

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v11, :cond_52

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v8, v11, :cond_53

    :cond_52
    new-instance v8, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextField$2$1;

    invoke-direct {v8, v1, v3, v15}, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextField$2$1;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V

    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_53
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-object/from16 v17, v8

    check-cast v17, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v8, v13, 0x380

    and-int/lit16 v11, v13, 0x1c00

    or-int/2addr v8, v11

    and-int v11, v13, v64

    or-int/2addr v8, v11

    and-int v11, v13, v65

    or-int/2addr v8, v11

    and-int v11, v13, v66

    or-int/2addr v8, v11

    and-int v11, v13, v67

    or-int/2addr v8, v11

    and-int v11, v13, v68

    or-int/2addr v8, v11

    const/high16 v11, 0x70000000

    and-int/2addr v11, v13

    or-int v36, v8, v11

    and-int/lit8 v8, v14, 0xe

    and-int/lit8 v11, v14, 0x70

    or-int/2addr v8, v11

    and-int/lit16 v11, v14, 0x380

    or-int/2addr v8, v11

    sget v11, Landroidx/compose/foundation/text/KeyboardActions;->$stable:I

    shl-int/lit8 v11, v11, 0x9

    or-int/2addr v8, v11

    and-int/lit16 v11, v14, 0x1c00

    or-int/2addr v8, v11

    and-int v11, v14, v64

    or-int/2addr v8, v11

    and-int v11, v14, v65

    or-int/2addr v8, v11

    and-int v11, v14, v66

    or-int/2addr v8, v11

    and-int v11, v14, v67

    or-int/2addr v8, v11

    and-int v11, v14, v68

    or-int v37, v8, v11

    const/16 v38, 0x0

    move-object/from16 v16, v9

    move-object/from16 v18, v6

    move/from16 v19, v12

    move/from16 v20, v69

    move-object/from16 v21, v2

    move-object/from16 v22, v70

    move-object/from16 v23, v10

    move-object/from16 v24, v4

    move-object/from16 v25, v5

    move/from16 v26, v7

    move-object/from16 v27, p3

    move-object/from16 v28, p2

    move-object/from16 v29, p10

    move/from16 v30, p9

    move/from16 v31, v71

    move-object/from16 v32, v39

    move-object/from16 v33, v40

    move-object/from16 v34, v41

    move-object/from16 v35, v0

    invoke-static/range {v16 .. v38}, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, p2

    move/from16 v15, p9

    move-object/from16 v14, p10

    move-object v9, v4

    move v11, v7

    move-object v8, v10

    move v4, v12

    move-object/from16 v17, v39

    move-object/from16 v18, v40

    move-object/from16 v19, v41

    move/from16 v16, v71

    move-object/from16 v12, p3

    move-object v7, v2

    move-object v10, v5

    move/from16 v5, v69

    :goto_3c
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-nez v2, :cond_54

    goto :goto_3d

    :cond_54
    new-instance v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextField$3;

    move-object/from16 p2, v0

    move-object/from16 v1, p0

    move-object/from16 v72, v2

    move-object/from16 v2, p1

    move-object v3, v6

    move-object v6, v7

    move-object/from16 v7, v70

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    invoke-direct/range {v0 .. v22}, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextField$3;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;III)V

    move-object/from16 v1, p2

    move-object/from16 v0, v72

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_3d
    return-void
.end method

.method private static final OutlinedTextField$lambda-2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;)",
            "Landroidx/compose/ui/text/input/TextFieldValue;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/text/input/TextFieldValue;

    return-object p0
.end method

.method private static final OutlinedTextField$lambda-3(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final OutlinedTextFieldLayout-uBqXD2s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V
    .locals 40
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p28    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p29    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;ZZ",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "Landroidx/compose/ui/text/TextStyle;",
            "ZI",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/Modifier;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;JJFFJJJ",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/runtime/Composer;",
            "IIII)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v14, p2

    move-object/from16 v12, p5

    move-object/from16 v11, p6

    move-object/from16 v10, p7

    move-object/from16 v9, p10

    move-object/from16 v8, p11

    move-object/from16 v7, p13

    move-wide/from16 v5, p24

    move-wide/from16 v2, p26

    move-object/from16 v13, p28

    move/from16 v15, p30

    move/from16 v4, p31

    move/from16 v2, p32

    move/from16 v3, p33

    const-string v5, "modifier"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "value"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onValueChange"

    invoke-static {v14, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "keyboardOptions"

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "keyboardActions"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "textStyle"

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "visualTransformation"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "interactionSource"

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "shape"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, -0x249c37ce

    move-object/from16 v6, p29

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    and-int/lit8 v5, v3, 0x1

    const/16 v16, 0x4

    if-eqz v5, :cond_0

    or-int/lit8 v5, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v15, 0xe

    if-nez v5, :cond_2

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move/from16 v5, v16

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v15

    goto :goto_1

    :cond_2
    move v5, v15

    :goto_1
    and-int/lit8 v17, v3, 0x2

    const/16 v18, 0x20

    const/16 v19, 0x10

    if-eqz v17, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v17, v15, 0x70

    if-nez v17, :cond_5

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_4

    move/from16 v17, v18

    goto :goto_2

    :cond_4
    move/from16 v17, v19

    :goto_2
    or-int v5, v5, v17

    :cond_5
    :goto_3
    and-int/lit8 v17, v3, 0x4

    const/16 v20, 0x100

    const/16 v21, 0x80

    if-eqz v17, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v13, v15, 0x380

    if-nez v13, :cond_8

    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    move/from16 v13, v20

    goto :goto_4

    :cond_7
    move/from16 v13, v21

    :goto_4
    or-int/2addr v5, v13

    :cond_8
    :goto_5
    and-int/lit8 v13, v3, 0x8

    const/16 v17, 0x800

    const/16 v22, 0x400

    if-eqz v13, :cond_9

    or-int/lit16 v5, v5, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v15, 0x1c00

    if-nez v13, :cond_b

    move/from16 v13, p3

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v23

    if-eqz v23, :cond_a

    move/from16 v23, v17

    goto :goto_6

    :cond_a
    move/from16 v23, v22

    :goto_6
    or-int v5, v5, v23

    goto :goto_8

    :cond_b
    :goto_7
    move/from16 v13, p3

    :goto_8
    and-int/lit8 v23, v3, 0x10

    const/16 v24, 0x4000

    const/16 v25, 0x2000

    const v35, 0xe000

    if-eqz v23, :cond_c

    or-int/lit16 v5, v5, 0x6000

    move/from16 v13, p4

    goto :goto_a

    :cond_c
    and-int v23, v15, v35

    move/from16 v13, p4

    if-nez v23, :cond_e

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v23

    if-eqz v23, :cond_d

    move/from16 v23, v24

    goto :goto_9

    :cond_d
    move/from16 v23, v25

    :goto_9
    or-int v5, v5, v23

    :cond_e
    :goto_a
    and-int/lit8 v23, v3, 0x20

    const/high16 v36, 0x70000

    if-eqz v23, :cond_f

    const/high16 v23, 0x30000

    :goto_b
    or-int v5, v5, v23

    goto :goto_c

    :cond_f
    and-int v23, v15, v36

    if-nez v23, :cond_11

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_10

    const/high16 v23, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v23, 0x10000

    goto :goto_b

    :cond_11
    :goto_c
    and-int/lit8 v23, v3, 0x40

    const/high16 v37, 0x380000

    if-eqz v23, :cond_12

    const/high16 v23, 0x180000

    :goto_d
    or-int v5, v5, v23

    goto :goto_e

    :cond_12
    and-int v23, v15, v37

    if-nez v23, :cond_14

    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_13

    const/high16 v23, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v23, 0x80000

    goto :goto_d

    :cond_14
    :goto_e
    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_15

    const/high16 v0, 0xc00000

    :goto_f
    or-int/2addr v5, v0

    goto :goto_10

    :cond_15
    const/high16 v0, 0x1c00000

    and-int/2addr v0, v15

    if-nez v0, :cond_17

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/high16 v0, 0x800000

    goto :goto_f

    :cond_16
    const/high16 v0, 0x400000

    goto :goto_f

    :cond_17
    :goto_10
    and-int/lit16 v0, v3, 0x100

    if-eqz v0, :cond_18

    const/high16 v0, 0x6000000

    or-int/2addr v5, v0

    goto :goto_12

    :cond_18
    const/high16 v0, 0xe000000

    and-int/2addr v0, v15

    if-nez v0, :cond_1a

    move/from16 v0, p8

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v23

    if-eqz v23, :cond_19

    const/high16 v23, 0x4000000

    goto :goto_11

    :cond_19
    const/high16 v23, 0x2000000

    :goto_11
    or-int v5, v5, v23

    goto :goto_13

    :cond_1a
    :goto_12
    move/from16 v0, p8

    :goto_13
    and-int/lit16 v0, v3, 0x200

    if-eqz v0, :cond_1b

    const/high16 v23, 0x30000000

    or-int v5, v5, v23

    move/from16 v10, p9

    goto :goto_15

    :cond_1b
    const/high16 v23, 0x70000000

    and-int v23, v15, v23

    move/from16 v10, p9

    if-nez v23, :cond_1d

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v23

    if-eqz v23, :cond_1c

    const/high16 v23, 0x20000000

    goto :goto_14

    :cond_1c
    const/high16 v23, 0x10000000

    :goto_14
    or-int v5, v5, v23

    :cond_1d
    :goto_15
    and-int/lit16 v10, v3, 0x400

    if-eqz v10, :cond_1e

    or-int/lit8 v10, v4, 0x6

    goto :goto_17

    :cond_1e
    and-int/lit8 v10, v4, 0xe

    if-nez v10, :cond_20

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1f

    move/from16 v10, v16

    goto :goto_16

    :cond_1f
    const/4 v10, 0x2

    :goto_16
    or-int/2addr v10, v4

    goto :goto_17

    :cond_20
    move v10, v4

    :goto_17
    and-int/lit16 v9, v3, 0x800

    if-eqz v9, :cond_21

    or-int/lit8 v10, v10, 0x30

    goto :goto_19

    :cond_21
    and-int/lit8 v9, v4, 0x70

    if-nez v9, :cond_23

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_22

    move/from16 v9, v18

    goto :goto_18

    :cond_22
    move/from16 v9, v19

    :goto_18
    or-int/2addr v10, v9

    :cond_23
    :goto_19
    and-int/lit16 v9, v3, 0x1000

    if-eqz v9, :cond_24

    or-int/lit16 v10, v10, 0x180

    goto :goto_1b

    :cond_24
    and-int/lit16 v9, v4, 0x380

    if-nez v9, :cond_26

    move-object/from16 v9, p12

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_25

    move/from16 v23, v20

    goto :goto_1a

    :cond_25
    move/from16 v23, v21

    :goto_1a
    or-int v10, v10, v23

    goto :goto_1c

    :cond_26
    :goto_1b
    move-object/from16 v9, p12

    :goto_1c
    and-int/lit16 v8, v3, 0x2000

    if-eqz v8, :cond_27

    or-int/lit16 v10, v10, 0xc00

    goto :goto_1e

    :cond_27
    and-int/lit16 v8, v4, 0x1c00

    if-nez v8, :cond_29

    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_28

    move/from16 v8, v17

    goto :goto_1d

    :cond_28
    move/from16 v8, v22

    :goto_1d
    or-int/2addr v10, v8

    :cond_29
    :goto_1e
    and-int/lit16 v8, v3, 0x4000

    if-eqz v8, :cond_2a

    or-int/lit16 v10, v10, 0x6000

    goto :goto_20

    :cond_2a
    and-int v8, v4, v35

    if-nez v8, :cond_2c

    move-object/from16 v8, p14

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_2b

    goto :goto_1f

    :cond_2b
    move/from16 v24, v25

    :goto_1f
    or-int v10, v10, v24

    goto :goto_21

    :cond_2c
    :goto_20
    move-object/from16 v8, p14

    :goto_21
    const v23, 0x8000

    and-int v23, v3, v23

    if-eqz v23, :cond_2d

    const/high16 v23, 0x30000

    or-int v10, v10, v23

    move-object/from16 v13, p15

    goto :goto_23

    :cond_2d
    and-int v23, v4, v36

    move-object/from16 v13, p15

    if-nez v23, :cond_2f

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_2e

    const/high16 v23, 0x20000

    goto :goto_22

    :cond_2e
    const/high16 v23, 0x10000

    :goto_22
    or-int v10, v10, v23

    :cond_2f
    :goto_23
    const/high16 v23, 0x10000

    and-int v23, v3, v23

    if-eqz v23, :cond_30

    const/high16 v23, 0x180000

    or-int v10, v10, v23

    move-wide/from16 v13, p16

    goto :goto_25

    :cond_30
    and-int v23, v4, v37

    move-wide/from16 v13, p16

    if-nez v23, :cond_32

    invoke-interface {v6, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v23

    if-eqz v23, :cond_31

    const/high16 v23, 0x100000

    goto :goto_24

    :cond_31
    const/high16 v23, 0x80000

    :goto_24
    or-int v10, v10, v23

    :cond_32
    :goto_25
    const/high16 v23, 0x20000

    and-int v23, v3, v23

    if-eqz v23, :cond_33

    const/high16 v23, 0xc00000

    or-int v10, v10, v23

    move-wide/from16 v13, p18

    goto :goto_27

    :cond_33
    const/high16 v23, 0x1c00000

    and-int v23, v4, v23

    move-wide/from16 v13, p18

    if-nez v23, :cond_35

    invoke-interface {v6, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v23

    if-eqz v23, :cond_34

    const/high16 v23, 0x800000

    goto :goto_26

    :cond_34
    const/high16 v23, 0x400000

    :goto_26
    or-int v10, v10, v23

    :cond_35
    :goto_27
    const/high16 v23, 0x40000

    and-int v23, v3, v23

    if-eqz v23, :cond_36

    const/high16 v23, 0x6000000

    or-int v10, v10, v23

    move/from16 v13, p20

    goto :goto_29

    :cond_36
    const/high16 v23, 0xe000000

    and-int v23, v4, v23

    move/from16 v13, p20

    if-nez v23, :cond_38

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v14

    if-eqz v14, :cond_37

    const/high16 v14, 0x4000000

    goto :goto_28

    :cond_37
    const/high16 v14, 0x2000000

    :goto_28
    or-int/2addr v10, v14

    :cond_38
    :goto_29
    const/high16 v14, 0x80000

    and-int/2addr v14, v3

    if-eqz v14, :cond_39

    const/high16 v14, 0x30000000

    or-int/2addr v10, v14

    goto :goto_2b

    :cond_39
    const/high16 v14, 0x70000000

    and-int/2addr v14, v4

    if-nez v14, :cond_3b

    move/from16 v14, p21

    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v23

    if-eqz v23, :cond_3a

    const/high16 v23, 0x20000000

    goto :goto_2a

    :cond_3a
    const/high16 v23, 0x10000000

    :goto_2a
    or-int v10, v10, v23

    goto :goto_2c

    :cond_3b
    :goto_2b
    move/from16 v14, p21

    :goto_2c
    const/high16 v23, 0x100000

    and-int v23, v3, v23

    if-eqz v23, :cond_3c

    or-int/lit8 v16, v2, 0x6

    move-wide/from16 v13, p22

    goto :goto_2e

    :cond_3c
    and-int/lit8 v23, v2, 0xe

    move-wide/from16 v13, p22

    if-nez v23, :cond_3e

    invoke-interface {v6, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v23

    if-eqz v23, :cond_3d

    goto :goto_2d

    :cond_3d
    const/16 v16, 0x2

    :goto_2d
    or-int v16, v2, v16

    goto :goto_2e

    :cond_3e
    move/from16 v16, v2

    :goto_2e
    const/high16 v23, 0x200000

    and-int v23, v3, v23

    if-eqz v23, :cond_3f

    or-int/lit8 v16, v16, 0x30

    move-wide/from16 v13, p24

    goto :goto_30

    :cond_3f
    and-int/lit8 v23, v2, 0x70

    move-wide/from16 v13, p24

    if-nez v23, :cond_41

    invoke-interface {v6, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v23

    if-eqz v23, :cond_40

    goto :goto_2f

    :cond_40
    move/from16 v18, v19

    :goto_2f
    or-int v16, v16, v18

    :cond_41
    :goto_30
    move/from16 v4, v16

    const/high16 v16, 0x400000

    and-int v16, v3, v16

    if-eqz v16, :cond_42

    or-int/lit16 v4, v4, 0x180

    goto :goto_32

    :cond_42
    and-int/lit16 v8, v2, 0x380

    if-nez v8, :cond_44

    move-wide/from16 v8, p26

    invoke-interface {v6, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_43

    goto :goto_31

    :cond_43
    move/from16 v20, v21

    :goto_31
    or-int v4, v4, v20

    goto :goto_33

    :cond_44
    :goto_32
    move-wide/from16 v8, p26

    :goto_33
    const/high16 v16, 0x800000

    and-int v16, v3, v16

    if-eqz v16, :cond_45

    or-int/lit16 v4, v4, 0xc00

    goto :goto_35

    :cond_45
    and-int/lit16 v3, v2, 0x1c00

    if-nez v3, :cond_47

    move-object/from16 v3, p28

    const/4 v2, 0x2

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_46

    goto :goto_34

    :cond_46
    move/from16 v17, v22

    :goto_34
    or-int v4, v4, v17

    goto :goto_36

    :cond_47
    :goto_35
    move-object/from16 v3, p28

    const/4 v2, 0x2

    :goto_36
    const v16, 0x5b6db6db

    and-int v16, v5, v16

    const v17, 0x12492492

    xor-int v16, v16, v17

    if-nez v16, :cond_49

    const v16, 0x5b6db6db

    and-int v16, v10, v16

    const v17, 0x12492492

    xor-int v16, v16, v17

    if-nez v16, :cond_49

    and-int/lit16 v2, v4, 0x16db

    xor-int/lit16 v2, v2, 0x492

    if-nez v2, :cond_49

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_48

    goto :goto_37

    :cond_48
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v10, p9

    move-object v1, v6

    goto/16 :goto_3a

    :cond_49
    :goto_37
    if-eqz v0, :cond_4a

    const v0, 0x7fffffff

    goto :goto_38

    :cond_4a
    move/from16 v0, p9

    :goto_38
    const v2, -0x384349

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v17, v4

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_4b

    sget-object v2, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v2, v4, v12, v11}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_4b
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v2, Landroidx/compose/runtime/MutableState;

    if-eqz v7, :cond_4c

    sget-object v18, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v19, 0x0

    sget v20, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextFieldTopPadding:F

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0xd

    const/16 v24, 0x0

    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    goto :goto_39

    :cond_4c
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    :goto_39
    invoke-interface {v1, v4}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    invoke-virtual {v11}, Landroidx/compose/material/TextFieldDefaults;->getMinWidth-D9Ej5fM()F

    move-result v12

    invoke-virtual {v11}, Landroidx/compose/material/TextFieldDefaults;->getMinHeight-D9Ej5fM()F

    move-result v11

    invoke-static {v4, v12, v11}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v8, v9, v3}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v11, v17

    new-instance v12, Landroidx/compose/ui/graphics/SolidColor;

    move-object v15, v12

    const/4 v1, 0x0

    invoke-direct {v12, v13, v14, v1}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v1

    const v1, -0x30deda35

    const/4 v3, 0x1

    new-instance v12, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;

    move-object/from16 v16, v12

    move-object/from16 v17, v2

    move-object/from16 v18, p12

    move-object/from16 v19, p13

    move-object/from16 v20, p14

    move-object/from16 v21, p15

    move/from16 v22, p8

    move-wide/from16 v23, p16

    move-wide/from16 v25, p18

    move/from16 v27, p20

    move/from16 v28, v10

    move-object/from16 v29, p28

    move/from16 v30, p21

    move-wide/from16 v31, p22

    move/from16 v33, v5

    move/from16 v34, v11

    invoke-direct/range {v16 .. v34}, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFILandroidx/compose/ui/graphics/Shape;FJII)V

    invoke-static {v6, v1, v3, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v16

    shr-int/lit8 v1, v5, 0x3

    and-int/lit8 v2, v1, 0xe

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v5, 0x1c00

    or-int/2addr v1, v2

    and-int v2, v5, v35

    or-int/2addr v1, v2

    shr-int/lit8 v2, v5, 0x6

    and-int v2, v2, v36

    or-int/2addr v1, v2

    shl-int/lit8 v2, v5, 0x3

    and-int v3, v2, v37

    or-int/2addr v1, v3

    sget v3, Landroidx/compose/foundation/text/KeyboardActions;->$stable:I

    shl-int/lit8 v3, v3, 0x15

    or-int/2addr v1, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    const/high16 v2, 0xe000000

    and-int/2addr v2, v5

    or-int/2addr v1, v2

    const/high16 v2, 0x70000000

    and-int/2addr v2, v5

    or-int v18, v1, v2

    and-int/lit8 v1, v10, 0xe

    or-int/lit16 v1, v1, 0x6000

    shl-int/lit8 v2, v10, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int v19, v1, v2

    const/16 v20, 0x800

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p3

    move-object v1, v6

    move/from16 v6, p4

    move-object/from16 v7, p7

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move/from16 v10, p8

    move v11, v0

    move-object/from16 v12, p10

    move-object/from16 v14, p11

    move-object/from16 v17, v1

    invoke-static/range {v2 .. v20}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move v10, v0

    :goto_3a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_4d

    goto :goto_3b

    :cond_4d
    new-instance v14, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v38, v14

    move-object/from16 v14, p13

    move-object/from16 v39, v15

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-wide/from16 v17, p16

    move-wide/from16 v19, p18

    move/from16 v21, p20

    move/from16 v22, p21

    move-wide/from16 v23, p22

    move-wide/from16 v25, p24

    move-wide/from16 v27, p26

    move-object/from16 v29, p28

    move/from16 v30, p30

    move/from16 v31, p31

    move/from16 v32, p32

    move/from16 v33, p33

    invoke-direct/range {v0 .. v33}, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;IIII)V

    move-object/from16 v1, v38

    move-object/from16 v0, v39

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_3b
    return-void
.end method

.method public static final synthetic access$IconsWithTextFieldLayout-T2E5_Oc(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p20}, Landroidx/compose/material/OutlinedTextFieldKt;->IconsWithTextFieldLayout-T2E5_Oc(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final synthetic access$OutlinedTextField$lambda-3(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextField$lambda-3(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V

    return-void
.end method

.method public static final synthetic access$calculateHeight-MK6IjOU(IIIIIJF)I
    .locals 0

    invoke-static/range {p0 .. p7}, Landroidx/compose/material/OutlinedTextFieldKt;->calculateHeight-MK6IjOU(IIIIIJF)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$calculateWidth-VsPV1Ek(IIIIIJ)I
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material/OutlinedTextFieldKt;->calculateWidth-VsPV1Ek(IIIIIJ)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getOutlinedTextFieldInnerPadding$p()F
    .locals 1

    sget v0, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextFieldInnerPadding:F

    return v0
.end method

.method public static final synthetic access$place(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZF)V
    .locals 0

    invoke-static/range {p0 .. p11}, Landroidx/compose/material/OutlinedTextFieldKt;->place(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZF)V

    return-void
.end method

.method private static final calculateHeight-MK6IjOU(IIIIIJF)I
    .locals 0

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getTextFieldPadding()F

    move-result p4

    mul-float/2addr p4, p7

    int-to-float p2, p2

    add-float/2addr p2, p4

    int-to-float p3, p3

    const/high16 p7, 0x40000000    # 2.0f

    div-float/2addr p3, p7

    invoke-static {p4, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    add-float/2addr p2, p3

    invoke-static {p5, p6}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result p3

    invoke-static {p2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p3, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method private static final calculateWidth-VsPV1Ek(IIIIIJ)I
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr p0, p2

    add-int/2addr p0, p1

    invoke-static {p5, p6}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method private static final outlineCutout-d16Qtg0(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1;

    invoke-direct {v0, p1, p2}, Landroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1;-><init>(J)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithContent(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final outlinedBorder-gLEpSso(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJ)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p5, p6}, Landroidx/compose/material/OutlinedTextFieldKt;->outlineCutout-d16Qtg0(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, p2, p3, p4, p1}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final place(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZF)V
    .locals 17

    move/from16 v0, p1

    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getTextFieldPadding()F

    move-result v1

    mul-float v1, v1, p11

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v8

    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getHorizontalIconPadding()F

    move-result v1

    mul-float v9, v1, p11

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v1

    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    :goto_0
    if-nez p4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v1

    sub-int v12, p2, v1

    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v1

    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    move-result v13

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object/from16 v10, p0

    move-object/from16 v11, p4

    invoke-static/range {v10 .. v16}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    :goto_1
    if-nez p6, :cond_2

    goto :goto_4

    :cond_2
    if-eqz p10, :cond_3

    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v1

    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    move-result v1

    goto :goto_2

    :cond_3
    move v1, v8

    :goto_2
    int-to-float v1, v1

    const/4 v2, 0x1

    int-to-float v2, v2

    sub-float v2, v2, p9

    mul-float/2addr v1, v2

    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    mul-float v3, v3, p9

    sub-float/2addr v1, v3

    if-nez p3, :cond_4

    const/4 v2, 0x0

    goto :goto_3

    :cond_4
    invoke-static/range {p3 .. p3}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v9

    mul-float/2addr v2, v3

    :goto_3
    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    add-int v3, v2, v8

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p6

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    :goto_4
    if-eqz p10, :cond_5

    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v1

    invoke-virtual/range {p5 .. p5}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    move-result v1

    move v12, v1

    goto :goto_5

    :cond_5
    move v12, v8

    :goto_5
    invoke-static/range {p3 .. p3}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v11

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object/from16 v9, p0

    move-object/from16 v10, p5

    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    if-nez p7, :cond_6

    goto :goto_6

    :cond_6
    if-eqz p10, :cond_7

    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v1

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    move-result v8

    :cond_7
    move v3, v8

    invoke-static/range {p3 .. p3}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p7

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    :goto_6
    sget-object v0, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    move-result-wide v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    move-object/from16 p1, p8

    move-wide/from16 p2, v0

    move/from16 p4, v2

    move/from16 p5, v3

    move-object/from16 p6, v4

    invoke-static/range {p0 .. p6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place-70tqf50$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFILjava/lang/Object;)V

    return-void
.end method
