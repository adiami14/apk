.class final Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextFieldLayout-uBqXD2s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlin/jvm/functions/Function2<",
        "-",
        "Landroidx/compose/runtime/Composer;",
        "-",
        "Ljava/lang/Integer;",
        "+",
        "Lkotlin/Unit;",
        ">;",
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

.field public final synthetic $$dirty2:I

.field public final synthetic $decoratedLabel:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic $decoratedPlaceholder:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $indicatorColor:J

.field public final synthetic $indicatorWidth:F

.field public final synthetic $labelProgress:F

.field public final synthetic $labelSize:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/geometry/Size;",
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

.field public final synthetic $leadingColor:J

.field public final synthetic $shape:Landroidx/compose/ui/graphics/Shape;

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

.field public final synthetic $trailingColor:J


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFILandroidx/compose/ui/graphics/Shape;FJII)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/geometry/Size;",
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
            ">;ZJJFI",
            "Landroidx/compose/ui/graphics/Shape;",
            "FJII)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$labelSize:Landroidx/compose/runtime/MutableState;

    move-object v1, p2

    iput-object v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$decoratedPlaceholder:Lkotlin/jvm/functions/Function3;

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$decoratedLabel:Lkotlin/jvm/functions/Function2;

    move-object v1, p4

    iput-object v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$leading:Lkotlin/jvm/functions/Function2;

    move-object v1, p5

    iput-object v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$trailing:Lkotlin/jvm/functions/Function2;

    move v1, p6

    iput-boolean v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$singleLine:Z

    move-wide v1, p7

    iput-wide v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$leadingColor:J

    move-wide v1, p9

    iput-wide v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$trailingColor:J

    move v1, p11

    iput v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$labelProgress:F

    move v1, p12

    iput v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$$dirty1:I

    move-object/from16 v1, p13

    iput-object v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$shape:Landroidx/compose/ui/graphics/Shape;

    move/from16 v1, p14

    iput v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$indicatorWidth:F

    move-wide/from16 v1, p15

    iput-wide v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$indicatorColor:J

    move/from16 v1, p17

    iput v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$$dirty:I

    move/from16 v1, p18

    iput v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$$dirty2:I

    const/4 v1, 0x3

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->invoke(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p2

    const-string v2, "coreTextField"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0xe

    if-nez v2, :cond_1

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x5b

    xor-int/lit8 v3, v3, 0x12

    if-nez v3, :cond_3

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    iget-object v3, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$labelSize:Landroidx/compose/runtime/MutableState;

    invoke-interface {v3}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/geometry/Size;

    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Size;->unbox-impl()J

    move-result-wide v17

    iget-object v3, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$decoratedPlaceholder:Lkotlin/jvm/functions/Function3;

    iget-object v4, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$decoratedLabel:Lkotlin/jvm/functions/Function2;

    iget-object v5, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$leading:Lkotlin/jvm/functions/Function2;

    iget-object v6, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$trailing:Lkotlin/jvm/functions/Function2;

    iget-boolean v7, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$singleLine:Z

    iget-wide v8, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$leadingColor:J

    iget-wide v14, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$trailingColor:J

    iget v10, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$labelProgress:F

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    iget-object v13, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$labelSize:Landroidx/compose/runtime/MutableState;

    iget v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$labelProgress:F

    move/from16 v19, v10

    const v10, -0x384098

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_4

    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v12, v10, :cond_5

    :cond_4
    new-instance v12, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1$1$1;

    invoke-direct {v12, v1, v13}, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1$1$1;-><init>(FLandroidx/compose/runtime/MutableState;)V

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_5
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v12, Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$shape:Landroidx/compose/ui/graphics/Shape;

    iget v1, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$indicatorWidth:F

    move-wide/from16 v22, v14

    move v14, v1

    iget-wide v10, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$indicatorColor:J

    move-wide v15, v10

    and-int/lit8 v1, v2, 0xe

    iget v2, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$$dirty1:I

    shr-int/lit8 v10, v2, 0x3

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v1, v10

    shr-int/lit8 v10, v2, 0x3

    and-int/lit16 v10, v10, 0x380

    or-int/2addr v1, v10

    shr-int/lit8 v10, v2, 0x3

    and-int/lit16 v10, v10, 0x1c00

    or-int/2addr v1, v10

    const v10, 0xe000

    shr-int/lit8 v11, v2, 0x3

    and-int/2addr v10, v11

    or-int/2addr v1, v10

    const/high16 v10, 0x70000

    iget v11, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$$dirty:I

    shr-int/lit8 v11, v11, 0x9

    and-int/2addr v10, v11

    or-int/2addr v1, v10

    const/high16 v10, 0x380000

    and-int/2addr v10, v2

    or-int/2addr v1, v10

    const/high16 v10, 0x1c00000

    and-int/2addr v10, v2

    or-int/2addr v1, v10

    const/high16 v10, 0xe000000

    and-int/2addr v10, v2

    or-int v20, v1, v10

    iget v0, v0, Landroidx/compose/material/OutlinedTextFieldKt$OutlinedTextFieldLayout$1;->$$dirty2:I

    shr-int/lit8 v1, v0, 0x9

    and-int/lit8 v1, v1, 0xe

    shr-int/lit8 v2, v2, 0x18

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int v21, v1, v0

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    move-wide v7, v8

    move/from16 v0, v19

    move-wide/from16 v9, v22

    move v11, v0

    move-object/from16 v19, p2

    invoke-static/range {v1 .. v21}, Landroidx/compose/material/OutlinedTextFieldKt;->access$IconsWithTextFieldLayout-T2E5_Oc(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/runtime/Composer;II)V

    :goto_3
    return-void
.end method
