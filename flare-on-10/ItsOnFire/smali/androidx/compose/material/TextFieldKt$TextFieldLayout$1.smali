.class final Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TextFieldKt;->TextFieldLayout-uBqXD2s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V
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

.field public final synthetic $labelProgress:F

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
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFII)V
    .locals 0
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
            ">;ZJJFII)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$decoratedLabel:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$decoratedPlaceholder:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$leading:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$trailing:Lkotlin/jvm/functions/Function2;

    iput-boolean p5, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$singleLine:Z

    iput-wide p6, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$leadingColor:J

    iput-wide p8, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$trailingColor:J

    iput p10, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$labelProgress:F

    iput p11, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$$dirty1:I

    iput p12, p0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$$dirty:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->invoke(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 17
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

    const-string v2, "coreTextField"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0xe

    move-object/from16 v11, p2

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

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v3, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$decoratedLabel:Lkotlin/jvm/functions/Function2;

    iget-object v4, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$decoratedPlaceholder:Lkotlin/jvm/functions/Function3;

    iget-object v5, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$leading:Lkotlin/jvm/functions/Function2;

    iget-object v6, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$trailing:Lkotlin/jvm/functions/Function2;

    iget-boolean v7, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$singleLine:Z

    iget-wide v8, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$leadingColor:J

    iget-wide v12, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$trailingColor:J

    iget v10, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$labelProgress:F

    and-int/lit8 v2, v2, 0xe

    iget v14, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$$dirty1:I

    shr-int/lit8 v15, v14, 0x6

    and-int/lit8 v15, v15, 0x70

    or-int/2addr v2, v15

    and-int/lit16 v15, v14, 0x380

    or-int/2addr v2, v15

    shr-int/lit8 v15, v14, 0x3

    and-int/lit16 v15, v15, 0x1c00

    or-int/2addr v2, v15

    const v15, 0xe000

    shr-int/lit8 v16, v14, 0x3

    and-int v15, v16, v15

    or-int/2addr v2, v15

    const/high16 v15, 0x70000

    iget v0, v0, Landroidx/compose/material/TextFieldKt$TextFieldLayout$1;->$$dirty:I

    shr-int/lit8 v0, v0, 0x9

    and-int/2addr v0, v15

    or-int/2addr v0, v2

    const/high16 v2, 0x380000

    and-int/2addr v2, v14

    or-int/2addr v0, v2

    const/high16 v2, 0x1c00000

    and-int/2addr v2, v14

    or-int/2addr v0, v2

    const/high16 v2, 0xe000000

    and-int/2addr v2, v14

    or-int v14, v0, v2

    move-object/from16 v0, p1

    move-object v1, v3

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move v5, v7

    move-wide v6, v8

    move-wide v8, v12

    move-object/from16 v11, p2

    move v12, v14

    invoke-static/range {v0 .. v12}, Landroidx/compose/material/TextFieldKt;->access$IconsWithTextFieldLayout-SxpAMN0(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLandroidx/compose/runtime/Composer;I)V

    :goto_3
    return-void
.end method
