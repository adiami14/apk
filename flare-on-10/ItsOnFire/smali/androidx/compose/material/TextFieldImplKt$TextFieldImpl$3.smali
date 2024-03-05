.class final Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function7;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TextFieldImplKt;->TextFieldImpl(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function7<",
        "Ljava/lang/Float;",
        "Landroidx/compose/ui/graphics/Color;",
        "Landroidx/compose/ui/graphics/Color;",
        "Landroidx/compose/ui/unit/Dp;",
        "Ljava/lang/Float;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $$dirty:I

.field public final synthetic $$dirty1:I

.field public final synthetic $colors:Landroidx/compose/material/TextFieldColors;

.field public final synthetic $enabled:Z

.field public final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field public final synthetic $isError:Z

.field public final synthetic $keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

.field public final synthetic $keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

.field public final synthetic $label:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $leading:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $maxLines:I

.field public final synthetic $mergedTextStyle:Landroidx/compose/ui/text/TextStyle;

.field public final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field public final synthetic $onValueChange:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $placeholder:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $readOnly:Z

.field public final synthetic $shape:Landroidx/compose/ui/graphics/Shape;

.field public final synthetic $shouldOverrideTextStyleColor:Z

.field public final synthetic $singleLine:Z

.field public final synthetic $trailing:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $transformedText:Landroidx/compose/ui/text/AnnotatedString;

.field public final synthetic $type:Landroidx/compose/material/TextFieldType;

.field public final synthetic $value:Landroidx/compose/ui/text/input/TextFieldValue;

.field public final synthetic $visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;ZILandroidx/compose/material/TextFieldColors;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILandroidx/compose/material/TextFieldType;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Z)V
    .locals 2
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
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/Modifier;",
            "ZI",
            "Landroidx/compose/material/TextFieldColors;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "I",
            "Landroidx/compose/material/TextFieldType;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "Landroidx/compose/ui/text/TextStyle;",
            "ZI",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
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
            "Landroidx/compose/ui/graphics/Shape;",
            "Z)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$label:Lkotlin/jvm/functions/Function2;

    move-object v1, p2

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$placeholder:Lkotlin/jvm/functions/Function2;

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$transformedText:Landroidx/compose/ui/text/AnnotatedString;

    move-object v1, p4

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$modifier:Landroidx/compose/ui/Modifier;

    move v1, p5

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    move v1, p6

    iput v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    move-object v1, p7

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    move v1, p8

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    move-object v1, p9

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move v1, p10

    iput v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    move-object v1, p11

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$type:Landroidx/compose/material/TextFieldType;

    move-object v1, p12

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    move-object v1, p13

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$onValueChange:Lkotlin/jvm/functions/Function1;

    move/from16 v1, p14

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$readOnly:Z

    move-object/from16 v1, p15

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    move-object/from16 v1, p16

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

    move-object/from16 v1, p17

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$mergedTextStyle:Landroidx/compose/ui/text/TextStyle;

    move/from16 v1, p18

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$singleLine:Z

    move/from16 v1, p19

    iput v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$maxLines:I

    move-object/from16 v1, p20

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    move-object/from16 v1, p21

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$leading:Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, p22

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$trailing:Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, p23

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$shape:Landroidx/compose/ui/graphics/Shape;

    move/from16 v1, p24

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$shouldOverrideTextStyleColor:Z

    const/4 v1, 0x7

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v2

    move-object v0, p2

    check-cast v0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v3

    move-object v0, p3

    check-cast v0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v5

    move-object v0, p4

    check-cast v0, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v7

    move-object/from16 v0, p5

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v8

    move-object/from16 v9, p6

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p7

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    move-object v1, p0

    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->invoke-h1eT-Ww(FJJFFLandroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke-h1eT-Ww(FJJFFLandroidx/compose/runtime/Composer;I)V
    .locals 48
    .param p8    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v14, p8

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0xe

    const/4 v7, 0x2

    move/from16 v13, p1

    if-nez v2, :cond_1

    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v7

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v3, v1, 0x70

    if-nez v3, :cond_3

    move-wide/from16 v3, p2

    invoke-interface {v14, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_3
    move-wide/from16 v3, p2

    :goto_3
    and-int/lit16 v5, v1, 0x380

    if-nez v5, :cond_5

    move-wide/from16 v5, p4

    invoke-interface {v14, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_4

    :cond_4
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    goto :goto_5

    :cond_5
    move-wide/from16 v5, p4

    :goto_5
    and-int/lit16 v8, v1, 0x1c00

    move/from16 v12, p6

    if-nez v8, :cond_7

    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_6

    :cond_6
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v2, v8

    :cond_7
    const v36, 0xe000

    and-int v1, v1, v36

    if-nez v1, :cond_9

    move/from16 v1, p7

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_7

    :cond_8
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v2, v8

    goto :goto_8

    :cond_9
    move/from16 v1, p7

    :goto_8
    move/from16 v38, v2

    const v2, 0x5b6db

    and-int v2, v38, v2

    const v8, 0x12492

    xor-int/2addr v2, v8

    if-nez v2, :cond_b

    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_9

    :cond_a
    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_10

    :cond_b
    :goto_9
    iget-object v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$label:Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v2, :cond_c

    move-object/from16 v41, v8

    goto :goto_a

    :cond_c
    iget-boolean v10, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$shouldOverrideTextStyleColor:Z

    const v11, -0x3abe1a60

    new-instance v15, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3$decoratedLabel$1$1;

    move-object/from16 p9, v15

    move/from16 v16, p1

    move-wide/from16 v17, p4

    move-object/from16 v19, v2

    move/from16 v20, v38

    move/from16 v21, v10

    move-wide/from16 v22, p2

    invoke-direct/range {v15 .. v23}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3$decoratedLabel$1$1;-><init>(FJLkotlin/jvm/functions/Function2;IZJ)V

    move-object/from16 v2, p9

    invoke-static {v11, v9, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object/from16 v41, v2

    :goto_a
    iget-object v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$placeholder:Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x0

    if-eqz v2, :cond_e

    iget-object v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$transformedText:Landroidx/compose/ui/text/AnnotatedString;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_d

    move v2, v9

    goto :goto_b

    :cond_d
    move v2, v3

    :goto_b
    if-eqz v2, :cond_e

    const v2, -0x30de8e46

    new-instance v4, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3$decoratedPlaceholder$1;

    iget-object v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v6, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget v10, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    iget v11, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    iget-object v15, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$placeholder:Lkotlin/jvm/functions/Function2;

    move-object/from16 v21, v15

    move-object v15, v4

    move/from16 v16, p7

    move-object/from16 v17, v5

    move/from16 v18, v6

    move/from16 v19, v10

    move/from16 v20, v11

    invoke-direct/range {v15 .. v21}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3$decoratedPlaceholder$1;-><init>(FLandroidx/compose/material/TextFieldColors;ZIILkotlin/jvm/functions/Function2;)V

    invoke-static {v14, v2, v9, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_c

    :cond_e
    move-object/from16 v19, v8

    :goto_c
    sget-object v1, Landroidx/compose/material/Strings;->Companion:Landroidx/compose/material/Strings$Companion;

    invoke-virtual {v1}, Landroidx/compose/material/Strings$Companion;->getDefaultErrorMessage-UdPEhr4()I

    move-result v1

    const/4 v15, 0x6

    invoke-static {v1, v14, v15}, Landroidx/compose/material/Strings_androidKt;->getString-4foXLRw(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    const v6, -0x384098

    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_f

    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_10

    :cond_f
    new-instance v6, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3$textFieldModifier$1$1;

    invoke-direct {v6, v5, v1}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3$textFieldModifier$1$1;-><init>(ZLjava/lang/String;)V

    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_10
    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v6, v9, v8}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    instance-of v1, v1, Landroidx/compose/material/TextFieldColorsWithIcons;

    if-eqz v1, :cond_11

    const v1, -0x3f3e4558

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    check-cast v1, Landroidx/compose/material/TextFieldColorsWithIcons;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    iget-object v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0xe

    iget v6, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v8, v6, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v5, v8

    shr-int/lit8 v6, v6, 0xf

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v6, v5

    move-object/from16 v5, p8

    invoke-interface/range {v1 .. v6}, Landroidx/compose/material/TextFieldColorsWithIcons;->leadingIconColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    goto :goto_d

    :cond_11
    const v1, -0x3f3e44f8

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    iget v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    iget v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v6, v5, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v4, v6

    shr-int/lit8 v5, v5, 0x15

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v4, v5

    invoke-interface {v1, v2, v3, v14, v4}, Landroidx/compose/material/TextFieldColors;->leadingIconColor(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v1

    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-wide/from16 v42, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    instance-of v1, v1, Landroidx/compose/material/TextFieldColorsWithIcons;

    if-eqz v1, :cond_12

    const v1, -0x3f3e4467

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    check-cast v1, Landroidx/compose/material/TextFieldColorsWithIcons;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    iget-object v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0xe

    iget v6, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v8, v6, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v5, v8

    shr-int/lit8 v6, v6, 0xf

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v6, v5

    move-object/from16 v5, p8

    invoke-interface/range {v1 .. v6}, Landroidx/compose/material/TextFieldColorsWithIcons;->trailingIconColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    goto :goto_e

    :cond_12
    const v1, -0x3f3e4406

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    iget v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    iget v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v6, v5, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v4, v6

    shr-int/lit8 v5, v5, 0x15

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v4, v5

    invoke-interface {v1, v2, v3, v14, v4}, Landroidx/compose/material/TextFieldColors;->trailingIconColor(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    :goto_e
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v1

    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-wide/from16 v44, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$type:Landroidx/compose/material/TextFieldType;

    sget-object v2, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/high16 v37, 0x380000

    const/high16 v39, 0x70000000

    const/high16 v40, 0xe000000

    const/high16 v46, 0x70000

    if-eq v1, v9, :cond_14

    if-eq v1, v7, :cond_13

    const v0, -0x3f3e3899

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto/16 :goto_f

    :cond_13
    const v1, -0x3f3e3e03

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    iget-object v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0xe

    iget v6, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v7, v6, 0x3

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v5, v7

    shr-int/lit8 v7, v6, 0xf

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v5, v7

    shr-int/lit8 v6, v6, 0x12

    and-int/lit16 v6, v6, 0x1c00

    or-int/2addr v6, v5

    move-object/from16 v5, p8

    invoke-interface/range {v1 .. v6}, Landroidx/compose/material/TextFieldColors;->indicatorColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v23

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    iget v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v4, v4, 0x18

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    invoke-interface {v1, v2, v14, v3}, Landroidx/compose/material/TextFieldColors;->backgroundColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v27

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    iget v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v4, v3, 0x6

    and-int/lit8 v4, v4, 0xe

    shr-int/lit8 v3, v3, 0x18

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v4

    invoke-interface {v1, v2, v14, v3}, Landroidx/compose/material/TextFieldColors;->cursorColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v25

    iget-object v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iget-object v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$onValueChange:Lkotlin/jvm/functions/Function1;

    iget-boolean v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget-boolean v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$readOnly:Z

    iget-object v6, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    iget-object v7, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

    iget-object v8, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$mergedTextStyle:Landroidx/compose/ui/text/TextStyle;

    iget-boolean v9, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$singleLine:Z

    iget v10, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$maxLines:I

    iget-object v11, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object v12, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$leading:Lkotlin/jvm/functions/Function2;

    move/from16 v47, v15

    move-object v15, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$trailing:Lkotlin/jvm/functions/Function2;

    move-object/from16 v16, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$shape:Landroidx/compose/ui/graphics/Shape;

    move-object/from16 v29, v1

    iget v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v17, v1, 0x6

    and-int/lit8 v17, v17, 0x70

    shr-int/lit8 v13, v1, 0x6

    and-int/lit16 v13, v13, 0x380

    or-int v13, v17, v13

    shl-int/lit8 v14, v1, 0x6

    and-int/lit16 v14, v14, 0x1c00

    or-int/2addr v13, v14

    shl-int/lit8 v14, v1, 0x6

    and-int v14, v14, v36

    or-int/2addr v13, v14

    iget v0, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shl-int/lit8 v14, v0, 0x3

    and-int v14, v14, v46

    or-int/2addr v13, v14

    sget v14, Landroidx/compose/foundation/text/KeyboardActions;->$stable:I

    shl-int/lit8 v14, v14, 0x12

    or-int/2addr v13, v14

    shl-int/lit8 v14, v0, 0x3

    and-int v14, v14, v37

    or-int/2addr v13, v14

    shl-int/lit8 v1, v1, 0x6

    and-int v1, v1, v40

    or-int/2addr v1, v13

    shl-int/lit8 v13, v0, 0x9

    and-int v13, v13, v39

    or-int v31, v1, v13

    shr-int/lit8 v1, v0, 0x9

    and-int/lit8 v1, v1, 0xe

    shr-int/lit8 v13, v0, 0x12

    and-int/lit8 v13, v13, 0x70

    or-int/2addr v1, v13

    shl-int/lit8 v13, v0, 0xc

    and-int v13, v13, v36

    or-int/2addr v1, v13

    shl-int/lit8 v13, v0, 0xc

    and-int v13, v13, v46

    or-int/2addr v1, v13

    shl-int/lit8 v13, v38, 0x18

    and-int v13, v13, v40

    or-int/2addr v1, v13

    shl-int/lit8 v13, v38, 0x12

    and-int v13, v13, v39

    or-int v32, v1, v13

    shr-int/lit8 v0, v0, 0xf

    and-int/lit16 v0, v0, 0x1c00

    move/from16 v33, v0

    const/16 v34, 0x0

    move-object/from16 v1, v20

    move-object/from16 v13, v19

    move-object/from16 v0, p8

    move-object/from16 v14, v41

    move-wide/from16 v17, v42

    move-wide/from16 v19, v44

    move/from16 v21, p1

    move/from16 v22, p6

    move-object/from16 v30, p8

    invoke-static/range {v1 .. v34}, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextFieldLayout-uBqXD2s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V

    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto/16 :goto_f

    :cond_14
    move-object v7, v14

    move/from16 v47, v15

    const v1, -0x3f3e4382

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v8, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iget-object v9, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$onValueChange:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    move v10, v2

    iget-boolean v11, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$readOnly:Z

    iget-object v12, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    iget-object v13, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

    iget-object v14, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$mergedTextStyle:Landroidx/compose/ui/text/TextStyle;

    iget-boolean v15, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$singleLine:Z

    iget v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$maxLines:I

    move/from16 v16, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    move-object/from16 v17, v1

    iget-object v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v18, v4

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$leading:Lkotlin/jvm/functions/Function2;

    move-object/from16 v21, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$trailing:Lkotlin/jvm/functions/Function2;

    move-object/from16 v22, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    iget v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0xe

    iget v6, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v23, v6, 0x3

    and-int/lit8 v23, v23, 0x70

    or-int v5, v5, v23

    move-object/from16 p2, v8

    shr-int/lit8 v8, v6, 0xf

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v5, v8

    shr-int/lit8 v6, v6, 0x12

    and-int/lit16 v6, v6, 0x1c00

    or-int/2addr v6, v5

    move-object/from16 v5, p8

    invoke-interface/range {v1 .. v6}, Landroidx/compose/material/TextFieldColors;->indicatorColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v29

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$enabled:Z

    iget v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    iget v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v4, v4, 0x18

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    invoke-interface {v1, v2, v7, v3}, Landroidx/compose/material/TextFieldColors;->backgroundColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v31

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$isError:Z

    iget v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shr-int/lit8 v4, v3, 0x6

    and-int/lit8 v4, v4, 0xe

    shr-int/lit8 v3, v3, 0x18

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v4

    invoke-interface {v1, v2, v7, v3}, Landroidx/compose/material/TextFieldColors;->cursorColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v33

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$shape:Landroidx/compose/ui/graphics/Shape;

    move-object/from16 v35, v1

    iget v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty:I

    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0x70

    shr-int/lit8 v3, v1, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    and-int v3, v3, v36

    or-int/2addr v2, v3

    iget v0, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$3;->$$dirty1:I

    shl-int/lit8 v3, v0, 0x3

    and-int v3, v3, v46

    or-int/2addr v2, v3

    sget v3, Landroidx/compose/foundation/text/KeyboardActions;->$stable:I

    shl-int/lit8 v3, v3, 0x12

    or-int/2addr v2, v3

    shl-int/lit8 v3, v0, 0x3

    and-int v3, v3, v37

    or-int/2addr v2, v3

    shl-int/lit8 v1, v1, 0x6

    and-int v1, v1, v40

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0x9

    and-int v2, v2, v39

    or-int v37, v1, v2

    shr-int/lit8 v1, v0, 0x9

    and-int/lit8 v1, v1, 0xe

    shr-int/lit8 v2, v0, 0x12

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0xc

    and-int v2, v2, v36

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0xc

    and-int v2, v2, v46

    or-int/2addr v1, v2

    shl-int/lit8 v2, v38, 0x18

    and-int v2, v2, v40

    or-int/2addr v1, v2

    shl-int/lit8 v2, v38, 0x12

    and-int v2, v2, v39

    or-int v38, v1, v2

    shr-int/lit8 v0, v0, 0xf

    and-int/lit16 v0, v0, 0x1c00

    move/from16 v39, v0

    const/16 v40, 0x0

    move-object/from16 v7, v20

    move-object/from16 v20, v41

    move-wide/from16 v23, v42

    move-wide/from16 v25, v44

    move/from16 v27, p1

    move/from16 v28, p6

    move-object/from16 v36, p8

    move-object/from16 v8, p2

    invoke-static/range {v7 .. v40}, Landroidx/compose/material/TextFieldKt;->TextFieldLayout-uBqXD2s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V

    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    :goto_f
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_10
    return-void
.end method
