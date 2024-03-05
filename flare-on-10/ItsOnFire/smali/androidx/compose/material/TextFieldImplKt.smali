.class public final Landroidx/compose/material/TextFieldImplKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aH\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\"0*\u00a2\u0006\u0002\u0008+H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008,\u0010-\u001a\u00f1\u0001\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\"072\u0006\u00108\u001a\u00020\u00082\u0006\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020&2\u0013\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010*\u00a2\u0006\u0002\u0008+2\u0013\u0010<\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010*\u00a2\u0006\u0002\u0008+2\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010*\u00a2\u0006\u0002\u0008+2\u0013\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010*\u00a2\u0006\u0002\u0008+2\u0006\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020A2\u0008\u0008\u0002\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0008\u0008\u0002\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0001\u00a2\u0006\u0002\u0010M\u001a\u0012\u0010N\u001a\u00020\u00012\u0008\u0010O\u001a\u0004\u0018\u00010PH\u0000\u001a\u0012\u0010Q\u001a\u00020\u00012\u0008\u0010O\u001a\u0004\u0018\u00010PH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0013\u0010\u000b\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u000c\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\r\u001a\u00020\u000eX\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000eX\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u000eX\u0080T\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0014\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u0015\u0010\u0005\"\u000e\u0010\u0016\u001a\u00020\u000eX\u0080T\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0017\u001a\u00020\u0018X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u001a\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u001e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006R"
    }
    d2 = {
        "AnimationDuration",
        "",
        "HorizontalIconPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "getHorizontalIconPadding",
        "()F",
        "F",
        "IconDefaultSizeModifier",
        "Landroidx/compose/ui/Modifier;",
        "getIconDefaultSizeModifier",
        "()Landroidx/compose/ui/Modifier;",
        "IndicatorFocusedWidth",
        "IndicatorUnfocusedWidth",
        "LabelId",
        "",
        "LeadingId",
        "PlaceholderAnimationDelayOrDuration",
        "PlaceholderAnimationDuration",
        "PlaceholderId",
        "TextFieldId",
        "TextFieldPadding",
        "getTextFieldPadding",
        "TrailingId",
        "ZeroConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "getZeroConstraints",
        "()J",
        "J",
        "layoutId",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "getLayoutId",
        "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;",
        "Decoration",
        "",
        "contentColor",
        "Landroidx/compose/ui/graphics/Color;",
        "typography",
        "Landroidx/compose/ui/text/TextStyle;",
        "contentAlpha",
        "",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "Decoration-euL9pac",
        "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "TextFieldImpl",
        "type",
        "Landroidx/compose/material/TextFieldType;",
        "enabled",
        "",
        "readOnly",
        "value",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "onValueChange",
        "Lkotlin/Function1;",
        "modifier",
        "singleLine",
        "textStyle",
        "label",
        "placeholder",
        "leading",
        "trailing",
        "isError",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "keyboardActions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "maxLines",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "colors",
        "Landroidx/compose/material/TextFieldColors;",
        "(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V",
        "heightOrZero",
        "placeable",
        "Landroidx/compose/ui/layout/Placeable;",
        "widthOrZero",
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
.field public static final AnimationDuration:I = 0x96

.field private static final HorizontalIconPadding:F

.field private static final IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorFocusedWidth:F

.field private static final IndicatorUnfocusedWidth:F

.field public static final LabelId:Ljava/lang/String; = "Label"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final LeadingId:Ljava/lang/String; = "Leading"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PlaceholderAnimationDelayOrDuration:I = 0x43

.field private static final PlaceholderAnimationDuration:I = 0x53

.field public static final PlaceholderId:Ljava/lang/String; = "Hint"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TextFieldId:Ljava/lang/String; = "TextField"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TextFieldPadding:F

.field public static final TrailingId:Ljava/lang/String; = "Trailing"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final ZeroConstraints:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/material/TextFieldImplKt;->ZeroConstraints:J

    const/4 v0, 0x1

    int-to-float v0, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    sput v0, Landroidx/compose/material/TextFieldImplKt;->IndicatorUnfocusedWidth:F

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    sput v0, Landroidx/compose/material/TextFieldImplKt;->IndicatorFocusedWidth:F

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    sput v0, Landroidx/compose/material/TextFieldImplKt;->TextFieldPadding:F

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    sput v0, Landroidx/compose/material/TextFieldImplKt;->HorizontalIconPadding:F

    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v1, 0x30

    int-to-float v1, v1

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Landroidx/compose/material/TextFieldImplKt;->IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public static final Decoration-euL9pac(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .param p2    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/text/TextStyle;",
            "Ljava/lang/Float;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p4

    move/from16 v7, p6

    const-string v0, "content"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x77cd729b

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v0, v7, 0x6

    move-wide/from16 v9, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v7, 0xe

    move-wide/from16 v9, p0

    if-nez v0, :cond_2

    invoke-interface {v8, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_2
    move v0, v7

    :goto_1
    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v7, 0x70

    if-nez v2, :cond_5

    move-object/from16 v2, p2

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v2, p2

    :goto_4
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v4, v7, 0x380

    if-nez v4, :cond_8

    move-object/from16 v4, p3

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_5

    :cond_7
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v0, v5

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v4, p3

    :goto_7
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v0, v0, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v5, v7, 0x1c00

    if-nez v5, :cond_b

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x800

    goto :goto_8

    :cond_a
    const/16 v5, 0x400

    :goto_8
    or-int/2addr v0, v5

    :cond_b
    :goto_9
    move v11, v0

    and-int/lit16 v0, v11, 0x16db

    xor-int/lit16 v0, v0, 0x492

    if-nez v0, :cond_d

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_a

    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v2

    goto :goto_e

    :cond_d
    :goto_a
    const/4 v0, 0x0

    if-eqz v1, :cond_e

    move-object v12, v0

    goto :goto_b

    :cond_e
    move-object v12, v2

    :goto_b
    if-eqz v3, :cond_f

    move-object v13, v0

    goto :goto_c

    :cond_f
    move-object v13, v4

    :goto_c
    const v14, -0x30deb1ff

    new-instance v15, Landroidx/compose/material/TextFieldImplKt$Decoration$colorAndEmphasis$1;

    move-object v0, v15

    move-wide/from16 v1, p0

    move-object v3, v13

    move-object/from16 v4, p4

    move v5, v11

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material/TextFieldImplKt$Decoration$colorAndEmphasis$1;-><init>(JLjava/lang/Float;Lkotlin/jvm/functions/Function2;I)V

    const/4 v0, 0x1

    invoke-static {v8, v14, v0, v15}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    if-eqz v12, :cond_10

    const v1, -0x77cd6fbe

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    shr-int/lit8 v1, v11, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    invoke-static {v12, v0, v8, v1}, Landroidx/compose/material/TextKt;->ProvideTextStyle(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :cond_10
    const v1, -0x77cd6f8a

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v8, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-object v3, v12

    move-object v4, v13

    :goto_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-nez v8, :cond_11

    goto :goto_f

    :cond_11
    new-instance v11, Landroidx/compose/material/TextFieldImplKt$Decoration$1;

    move-object v0, v11

    move-wide/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Landroidx/compose/material/TextFieldImplKt$Decoration$1;-><init>(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v8, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_f
    return-void
.end method

.method public static final TextFieldImpl(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
    .locals 60
    .param p0    # Landroidx/compose/material/TextFieldType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    .param p10    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p18    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p19    # Landroidx/compose/material/TextFieldColors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p20    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/TextFieldType;",
            "ZZ",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
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
            "I",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v15, p0

    move/from16 v14, p1

    move-object/from16 v13, p3

    move-object/from16 v12, p4

    move-object/from16 v11, p5

    move-object/from16 v10, p7

    move-object/from16 v9, p8

    move-object/from16 v8, p13

    move-object/from16 v7, p15

    move-object/from16 v6, p17

    move-object/from16 v5, p18

    move-object/from16 v4, p19

    move/from16 v3, p21

    move/from16 v2, p22

    move/from16 v1, p23

    const-string v0, "type"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onValueChange"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyle"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visualTransformation"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyboardActions"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactionSource"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colors"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x22151570

    move-object/from16 v4, p20

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v0, v1, 0x1

    const/16 v16, 0x4

    const/16 v17, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v0, v3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v3, 0xe

    if-nez v0, :cond_2

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move/from16 v0, v16

    goto :goto_0

    :cond_1
    move/from16 v0, v17

    :goto_0
    or-int/2addr v0, v3

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    and-int/lit8 v18, v1, 0x2

    const/16 v19, 0x20

    const/16 v20, 0x10

    if-eqz v18, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v18, v3, 0x70

    if-nez v18, :cond_5

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_4

    move/from16 v18, v19

    goto :goto_2

    :cond_4
    move/from16 v18, v20

    :goto_2
    or-int v0, v0, v18

    :cond_5
    :goto_3
    and-int/lit8 v18, v1, 0x4

    const/16 v21, 0x100

    const/16 v22, 0x80

    if-eqz v18, :cond_6

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v15, v3, 0x380

    if-nez v15, :cond_8

    move/from16 v15, p2

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_7

    move/from16 v18, v21

    goto :goto_4

    :cond_7
    move/from16 v18, v22

    :goto_4
    or-int v0, v0, v18

    goto :goto_6

    :cond_8
    :goto_5
    move/from16 v15, p2

    :goto_6
    and-int/lit8 v18, v1, 0x8

    const/16 v23, 0x800

    const/16 v24, 0x400

    if-eqz v18, :cond_9

    or-int/lit16 v0, v0, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v15, v3, 0x1c00

    if-nez v15, :cond_b

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    move/from16 v15, v23

    goto :goto_7

    :cond_a
    move/from16 v15, v24

    :goto_7
    or-int/2addr v0, v15

    :cond_b
    :goto_8
    and-int/lit8 v15, v1, 0x10

    const/16 v18, 0x2000

    const/16 v25, 0x4000

    if-eqz v15, :cond_c

    or-int/lit16 v0, v0, 0x6000

    goto :goto_a

    :cond_c
    const v15, 0xe000

    and-int/2addr v15, v3

    if-nez v15, :cond_e

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_d

    move/from16 v15, v25

    goto :goto_9

    :cond_d
    move/from16 v15, v18

    :goto_9
    or-int/2addr v0, v15

    :cond_e
    :goto_a
    and-int/lit8 v15, v1, 0x20

    const/high16 v26, 0x20000

    const/high16 v27, 0x10000

    if-eqz v15, :cond_f

    const/high16 v15, 0x30000

    :goto_b
    or-int/2addr v0, v15

    goto :goto_c

    :cond_f
    const/high16 v15, 0x70000

    and-int/2addr v15, v3

    if-nez v15, :cond_11

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    move/from16 v15, v26

    goto :goto_b

    :cond_10
    move/from16 v15, v27

    goto :goto_b

    :cond_11
    :goto_c
    and-int/lit8 v15, v1, 0x40

    const/high16 v28, 0x80000

    if-eqz v15, :cond_12

    const/high16 v15, 0x180000

    or-int/2addr v0, v15

    goto :goto_e

    :cond_12
    const/high16 v15, 0x380000

    and-int/2addr v15, v3

    if-nez v15, :cond_14

    move/from16 v15, p6

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_13

    const/high16 v29, 0x100000

    goto :goto_d

    :cond_13
    move/from16 v29, v28

    :goto_d
    or-int v0, v0, v29

    goto :goto_f

    :cond_14
    :goto_e
    move/from16 v15, p6

    :goto_f
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_15

    const/high16 v11, 0xc00000

    :goto_10
    or-int/2addr v0, v11

    goto :goto_11

    :cond_15
    const/high16 v11, 0x1c00000

    and-int/2addr v11, v3

    if-nez v11, :cond_17

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_16

    const/high16 v11, 0x800000

    goto :goto_10

    :cond_16
    const/high16 v11, 0x400000

    goto :goto_10

    :cond_17
    :goto_11
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_18

    const/high16 v11, 0x6000000

    :goto_12
    or-int/2addr v0, v11

    goto :goto_13

    :cond_18
    const/high16 v11, 0xe000000

    and-int/2addr v11, v3

    if-nez v11, :cond_1a

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_19

    const/high16 v11, 0x4000000

    goto :goto_12

    :cond_19
    const/high16 v11, 0x2000000

    goto :goto_12

    :cond_1a
    :goto_13
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_1b

    const/high16 v11, 0x30000000

    or-int/2addr v0, v11

    goto :goto_15

    :cond_1b
    const/high16 v11, 0x70000000

    and-int/2addr v11, v3

    if-nez v11, :cond_1d

    move-object/from16 v11, p9

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_1c

    const/high16 v29, 0x20000000

    goto :goto_14

    :cond_1c
    const/high16 v29, 0x10000000

    :goto_14
    or-int v0, v0, v29

    goto :goto_16

    :cond_1d
    :goto_15
    move-object/from16 v11, p9

    :goto_16
    move/from16 v29, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v0, v2, 0x6

    move/from16 v16, v0

    move-object/from16 v0, p10

    goto :goto_18

    :cond_1e
    and-int/lit8 v0, v2, 0xe

    if-nez v0, :cond_20

    move-object/from16 v0, p10

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1f

    goto :goto_17

    :cond_1f
    move/from16 v16, v17

    :goto_17
    or-int v16, v2, v16

    goto :goto_18

    :cond_20
    move-object/from16 v0, p10

    move/from16 v16, v2

    :goto_18
    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v16, v16, 0x30

    goto :goto_1a

    :cond_21
    and-int/lit8 v0, v2, 0x70

    if-nez v0, :cond_23

    move-object/from16 v0, p11

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_22

    goto :goto_19

    :cond_22
    move/from16 v19, v20

    :goto_19
    or-int v16, v16, v19

    goto :goto_1a

    :cond_23
    move-object/from16 v0, p11

    :goto_1a
    move/from16 v0, v16

    and-int/lit16 v11, v1, 0x1000

    if-eqz v11, :cond_24

    or-int/lit16 v0, v0, 0x180

    goto :goto_1c

    :cond_24
    and-int/lit16 v11, v2, 0x380

    if-nez v11, :cond_26

    move/from16 v11, p12

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_25

    goto :goto_1b

    :cond_25
    move/from16 v21, v22

    :goto_1b
    or-int v0, v0, v21

    goto :goto_1d

    :cond_26
    :goto_1c
    move/from16 v11, p12

    :goto_1d
    and-int/lit16 v11, v1, 0x2000

    if-eqz v11, :cond_27

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1f

    :cond_27
    and-int/lit16 v11, v2, 0x1c00

    if-nez v11, :cond_29

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_28

    goto :goto_1e

    :cond_28
    move/from16 v23, v24

    :goto_1e
    or-int v0, v0, v23

    :cond_29
    :goto_1f
    const v11, 0xe000

    and-int/2addr v11, v2

    if-nez v11, :cond_2c

    and-int/lit16 v11, v1, 0x4000

    if-nez v11, :cond_2a

    move-object/from16 v11, p14

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2b

    move/from16 v18, v25

    goto :goto_20

    :cond_2a
    move-object/from16 v11, p14

    :cond_2b
    :goto_20
    or-int v0, v0, v18

    goto :goto_21

    :cond_2c
    move-object/from16 v11, p14

    :goto_21
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_2d

    const/high16 v16, 0x30000

    :goto_22
    or-int v0, v0, v16

    goto :goto_23

    :cond_2d
    const/high16 v16, 0x70000

    and-int v16, v2, v16

    if-nez v16, :cond_2f

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2e

    move/from16 v16, v26

    goto :goto_22

    :cond_2e
    move/from16 v16, v27

    goto :goto_22

    :cond_2f
    :goto_23
    and-int v16, v1, v27

    if-eqz v16, :cond_30

    const/high16 v17, 0x180000

    or-int v0, v0, v17

    move/from16 v7, p16

    goto :goto_25

    :cond_30
    const/high16 v17, 0x380000

    and-int v17, v2, v17

    move/from16 v7, p16

    if-nez v17, :cond_32

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_31

    const/high16 v17, 0x100000

    goto :goto_24

    :cond_31
    move/from16 v17, v28

    :goto_24
    or-int v0, v0, v17

    :cond_32
    :goto_25
    and-int v17, v1, v26

    if-eqz v17, :cond_33

    const/high16 v17, 0xc00000

    :goto_26
    or-int v0, v0, v17

    goto :goto_27

    :cond_33
    const/high16 v17, 0x1c00000

    and-int v17, v2, v17

    if-nez v17, :cond_35

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_34

    const/high16 v17, 0x800000

    goto :goto_26

    :cond_34
    const/high16 v17, 0x400000

    goto :goto_26

    :cond_35
    :goto_27
    const/high16 v17, 0x40000

    and-int v17, v1, v17

    if-eqz v17, :cond_36

    const/high16 v17, 0x6000000

    :goto_28
    or-int v0, v0, v17

    goto :goto_29

    :cond_36
    const/high16 v17, 0xe000000

    and-int v17, v2, v17

    if-nez v17, :cond_38

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_37

    const/high16 v17, 0x4000000

    goto :goto_28

    :cond_37
    const/high16 v17, 0x2000000

    goto :goto_28

    :cond_38
    :goto_29
    and-int v17, v1, v28

    if-eqz v17, :cond_39

    const/high16 v17, 0x30000000

    or-int v0, v0, v17

    move-object/from16 v5, p19

    goto :goto_2b

    :cond_39
    const/high16 v17, 0x70000000

    and-int v17, v2, v17

    move-object/from16 v5, p19

    if-nez v17, :cond_3b

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_3a

    const/high16 v17, 0x20000000

    goto :goto_2a

    :cond_3a
    const/high16 v17, 0x10000000

    :goto_2a
    or-int v0, v0, v17

    :cond_3b
    :goto_2b
    const v17, 0x5b6db6db

    and-int v17, v29, v17

    const v18, 0x12492492

    xor-int v17, v17, v18

    if-nez v17, :cond_3d

    const v17, 0x5b6db6db

    and-int v17, v0, v17

    const v18, 0x12492492

    xor-int v17, v17, v18

    if-nez v17, :cond_3d

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v17

    if-nez v17, :cond_3c

    goto :goto_2c

    :cond_3c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v0, v4

    move/from16 v17, v7

    move-object v15, v11

    goto/16 :goto_3b

    :cond_3d
    :goto_2c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v17, v3, 0x1

    if-eqz v17, :cond_3f

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v17

    if-eqz v17, :cond_3e

    goto :goto_2d

    :cond_3e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_41

    const v2, -0xe001

    and-int/2addr v0, v2

    goto :goto_2e

    :cond_3f
    :goto_2d
    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_40

    sget-object v2, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v2

    const v11, -0xe001

    and-int/2addr v0, v11

    move-object v11, v2

    :cond_40
    if-eqz v16, :cond_41

    const v2, 0x7fffffff

    move v7, v0

    move/from16 v26, v2

    move-object/from16 v25, v11

    goto :goto_2f

    :cond_41
    :goto_2e
    move/from16 v26, v7

    move-object/from16 v25, v11

    move v7, v0

    :goto_2f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    const v0, 0x221518a8

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v16

    sget-object v11, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v18

    cmp-long v0, v16, v18

    const/16 v18, 0x0

    if-eqz v0, :cond_42

    const/4 v0, 0x1

    goto :goto_30

    :cond_42
    move/from16 v0, v18

    :goto_30
    if-eqz v0, :cond_43

    goto :goto_31

    :cond_43
    shr-int/lit8 v0, v29, 0x3

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v16, v7, 0x18

    and-int/lit8 v16, v16, 0x70

    or-int v0, v0, v16

    invoke-interface {v5, v14, v4, v0}, Landroidx/compose/material/TextFieldColors;->textColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v16

    :goto_31
    move-wide/from16 v31, v16

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    new-instance v0, Landroidx/compose/ui/text/TextStyle;

    move-object/from16 v30, v0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    const/16 v53, 0x0

    const v54, 0x3fffe

    const/16 v55, 0x0

    invoke-direct/range {v30 .. v55}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v0}, Landroidx/compose/ui/text/TextStyle;->merge(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v17

    shr-int/lit8 v0, v7, 0x15

    and-int/lit8 v0, v0, 0xe

    invoke-static {v6, v4, v0}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/text/input/TextFieldValue;->getAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v2

    const v1, -0x384098

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_44

    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_45

    :cond_44
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/text/input/TextFieldValue;->getAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v1

    invoke-interface {v8, v1}, Landroidx/compose/ui/text/input/VisualTransformation;->filter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;

    move-result-object v2

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_45
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v2, Landroidx/compose/ui/text/input/TransformedText;

    invoke-virtual {v2}, Landroidx/compose/ui/text/input/TransformedText;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v16

    if-eqz v0, :cond_46

    sget-object v0, Landroidx/compose/material/InputPhase;->Focused:Landroidx/compose/material/InputPhase;

    :goto_32
    move-object v2, v0

    goto :goto_34

    :cond_46
    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_47

    const/4 v0, 0x1

    goto :goto_33

    :cond_47
    move/from16 v0, v18

    :goto_33
    if-eqz v0, :cond_48

    sget-object v0, Landroidx/compose/material/InputPhase;->UnfocusedEmpty:Landroidx/compose/material/InputPhase;

    goto :goto_32

    :cond_48
    sget-object v0, Landroidx/compose/material/InputPhase;->UnfocusedNotEmpty:Landroidx/compose/material/InputPhase;

    goto :goto_32

    :goto_34
    new-instance v1, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;

    move-object v0, v1

    move-object v15, v1

    move-object/from16 v1, p19

    move-object v14, v2

    move/from16 v2, p1

    move/from16 v3, p12

    move-object v5, v4

    move-object/from16 v4, p17

    move-object v13, v5

    move/from16 v5, v29

    move v6, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;-><init>(Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    const/4 v1, 0x6

    invoke-virtual {v0, v13, v1}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material/Typography;->getSubtitle1()Landroidx/compose/ui/text/TextStyle;

    move-result-object v3

    invoke-virtual {v2}, Landroidx/compose/material/Typography;->getCaption()Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v4

    move-object/from16 p16, v2

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v1

    invoke-static {v4, v5, v1, v2}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-eqz v1, :cond_49

    invoke-virtual/range {p16 .. p16}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v1

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-eqz v1, :cond_4a

    :cond_49
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v1

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_4b

    invoke-virtual/range {p16 .. p16}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v1

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-eqz v1, :cond_4b

    :cond_4a
    const/16 v24, 0x1

    goto :goto_35

    :cond_4b
    move/from16 v24, v18

    :goto_35
    sget-object v27, Landroidx/compose/material/TextFieldTransitionScope;->INSTANCE:Landroidx/compose/material/TextFieldTransitionScope;

    const v1, 0x22151de8

    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v1, 0x6

    invoke-virtual {v0, v13, v1}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material/Typography;->getCaption()Landroidx/compose/ui/text/TextStyle;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v1

    if-eqz v24, :cond_4e

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    cmp-long v3, v1, v3

    if-eqz v3, :cond_4c

    const/4 v3, 0x1

    goto :goto_36

    :cond_4c
    move/from16 v3, v18

    :goto_36
    if-eqz v3, :cond_4d

    goto :goto_37

    :cond_4d
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v14, v13, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v1

    :cond_4e
    :goto_37
    move-wide/from16 v30, v1

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const/4 v1, 0x6

    invoke-virtual {v0, v13, v1}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material/Typography;->getSubtitle1()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v0

    if-eqz v24, :cond_51

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-eqz v2, :cond_4f

    const/4 v2, 0x1

    goto :goto_38

    :cond_4f
    move/from16 v2, v18

    :goto_38
    if-eqz v2, :cond_50

    goto :goto_39

    :cond_50
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v15, v14, v13, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v0

    :cond_51
    :goto_39
    move-wide/from16 v32, v0

    if-eqz v9, :cond_52

    const/16 v28, 0x1

    goto :goto_3a

    :cond_52
    move/from16 v28, v18

    :goto_3a
    const v11, -0x30de8d6a

    new-instance v6, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;

    move-object v0, v6

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move-object/from16 v3, v16

    move-object/from16 v4, p5

    move/from16 v5, p12

    move-object/from16 v56, v6

    move v6, v7

    move-object/from16 v7, p19

    move/from16 v8, p1

    move-object/from16 v9, p17

    move/from16 v10, v29

    move-object/from16 v11, p0

    move-object/from16 v12, p3

    move-object/from16 v57, v13

    move-object/from16 v13, p4

    move-object/from16 v29, v14

    move/from16 v14, p2

    move-object/from16 v34, v15

    move-object/from16 v15, v25

    move-object/from16 v16, p15

    move/from16 v18, p6

    move/from16 v19, v26

    move-object/from16 v20, p13

    move-object/from16 v21, p10

    move-object/from16 v22, p11

    move-object/from16 v23, p18

    invoke-direct/range {v0 .. v24}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;ZILandroidx/compose/material/TextFieldColors;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILandroidx/compose/material/TextFieldType;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Z)V

    move-object/from16 v2, v56

    move-object/from16 v0, v57

    const v1, -0x30de8d6a

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v9

    const/high16 v11, 0x1b0000

    move-object/from16 v1, v27

    move-object/from16 v2, v29

    move-wide/from16 v3, v30

    move-wide/from16 v5, v32

    move-object/from16 v7, v34

    move/from16 v8, v28

    move-object v10, v0

    invoke-virtual/range {v1 .. v11}, Landroidx/compose/material/TextFieldTransitionScope;->Transition-DTcfvLk(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V

    move/from16 v17, v26

    :goto_3b
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-nez v14, :cond_53

    goto :goto_3c

    :cond_53
    new-instance v13, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;

    move-object v0, v13

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v58, v13

    move/from16 v13, p12

    move-object/from16 v59, v14

    move-object/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    invoke-direct/range {v0 .. v23}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;-><init>(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;III)V

    move-object/from16 v1, v58

    move-object/from16 v0, v59

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_3c
    return-void
.end method

.method public static final synthetic access$getIndicatorFocusedWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldImplKt;->IndicatorFocusedWidth:F

    return v0
.end method

.method public static final synthetic access$getIndicatorUnfocusedWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldImplKt;->IndicatorUnfocusedWidth:F

    return v0
.end method

.method public static final getHorizontalIconPadding()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldImplKt;->HorizontalIconPadding:F

    return v0
.end method

.method public static final getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Landroidx/compose/material/TextFieldImplKt;->IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public static final getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;
    .locals 2
    .param p0    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroidx/compose/ui/layout/LayoutIdParentData;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/compose/ui/layout/LayoutIdParentData;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutIdParentData;->getLayoutId()Ljava/lang/Object;

    move-result-object v1

    :goto_1
    return-object v1
.end method

.method public static final getTextFieldPadding()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldImplKt;->TextFieldPadding:F

    return v0
.end method

.method public static final getZeroConstraints()J
    .locals 2

    sget-wide v0, Landroidx/compose/material/TextFieldImplKt;->ZeroConstraints:J

    return-wide v0
.end method

.method public static final heightOrZero(Landroidx/compose/ui/layout/Placeable;)I
    .locals 0
    .param p0    # Landroidx/compose/ui/layout/Placeable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final widthOrZero(Landroidx/compose/ui/layout/Placeable;)I
    .locals 0
    .param p0    # Landroidx/compose/ui/layout/Placeable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p0

    :goto_0
    return p0
.end method
