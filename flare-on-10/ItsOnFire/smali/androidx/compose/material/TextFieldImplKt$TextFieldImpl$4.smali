.class final Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TextFieldImplKt;->TextFieldImpl(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
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
.field public final synthetic $$changed:I

.field public final synthetic $$changed1:I

.field public final synthetic $$default:I

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

.field public final synthetic $singleLine:Z

.field public final synthetic $textStyle:Landroidx/compose/ui/text/TextStyle;

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

.field public final synthetic $type:Landroidx/compose/material/TextFieldType;

.field public final synthetic $value:Landroidx/compose/ui/text/input/TextFieldValue;

.field public final synthetic $visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;


# direct methods
.method public constructor <init>(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;III)V
    .locals 2
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
            "III)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$type:Landroidx/compose/material/TextFieldType;

    move v1, p2

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$enabled:Z

    move v1, p3

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$readOnly:Z

    move-object v1, p4

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    move-object v1, p5

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$onValueChange:Lkotlin/jvm/functions/Function1;

    move-object v1, p6

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$modifier:Landroidx/compose/ui/Modifier;

    move v1, p7

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$singleLine:Z

    move-object v1, p8

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    move-object v1, p9

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$label:Lkotlin/jvm/functions/Function2;

    move-object v1, p10

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$placeholder:Lkotlin/jvm/functions/Function2;

    move-object v1, p11

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$leading:Lkotlin/jvm/functions/Function2;

    move-object v1, p12

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$trailing:Lkotlin/jvm/functions/Function2;

    move v1, p13

    iput-boolean v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$isError:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    move-object/from16 v1, p15

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    move-object/from16 v1, p16

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

    move/from16 v1, p17

    iput v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$maxLines:I

    move-object/from16 v1, p18

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v1, p19

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$shape:Landroidx/compose/ui/graphics/Shape;

    move-object/from16 v1, p20

    iput-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$colors:Landroidx/compose/material/TextFieldColors;

    move/from16 v1, p21

    iput v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$$changed:I

    move/from16 v1, p22

    iput v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$$changed1:I

    move/from16 v1, p23

    iput v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$$default:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v21, p1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$type:Landroidx/compose/material/TextFieldType;

    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$enabled:Z

    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$readOnly:Z

    iget-object v4, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iget-object v5, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$onValueChange:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v7, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$singleLine:Z

    iget-object v8, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    iget-object v9, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$label:Lkotlin/jvm/functions/Function2;

    iget-object v10, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$placeholder:Lkotlin/jvm/functions/Function2;

    iget-object v11, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$leading:Lkotlin/jvm/functions/Function2;

    iget-object v12, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$trailing:Lkotlin/jvm/functions/Function2;

    iget-boolean v13, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$isError:Z

    iget-object v14, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    iget-object v15, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    move-object/from16 p1, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

    move-object/from16 v16, v1

    iget v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$maxLines:I

    move/from16 v17, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v18, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$shape:Landroidx/compose/ui/graphics/Shape;

    move-object/from16 v19, v1

    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$colors:Landroidx/compose/material/TextFieldColors;

    move-object/from16 v20, v1

    iget v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$$changed:I

    or-int/lit8 v22, v1, 0x1

    iget v1, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$$changed1:I

    move/from16 v23, v1

    iget v0, v0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$4;->$$default:I

    move/from16 v24, v0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v24}, Landroidx/compose/material/TextFieldImplKt;->TextFieldImpl(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
