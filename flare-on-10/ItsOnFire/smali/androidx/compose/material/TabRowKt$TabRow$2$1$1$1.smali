.class final Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
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

.field public final synthetic $constraints:J

.field public final synthetic $divider:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic $indicator:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $tabPlaceables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $tabPositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $tabRowHeight:I

.field public final synthetic $tabRowWidth:I

.field public final synthetic $tabWidth:I

.field public final synthetic $this_SubcomposeLayout:Landroidx/compose/ui/layout/SubcomposeMeasureScope;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroidx/compose/ui/layout/SubcomposeMeasureScope;Lkotlin/jvm/functions/Function2;IJILkotlin/jvm/functions/Function3;Ljava/util/List;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;",
            "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;IJI",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabPlaceables:Ljava/util/List;

    iput-object p2, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$this_SubcomposeLayout:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    iput-object p3, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$divider:Lkotlin/jvm/functions/Function2;

    iput p4, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabWidth:I

    iput-wide p5, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$constraints:J

    iput p7, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabRowHeight:I

    iput-object p8, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$indicator:Lkotlin/jvm/functions/Function3;

    iput-object p9, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabPositions:Ljava/util/List;

    iput p10, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$$dirty:I

    iput p11, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabRowWidth:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 22
    .param p1    # Landroidx/compose/ui/layout/Placeable$PlacementScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "$this$layout"

    move-object/from16 v9, p1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabPlaceables:Ljava/util/List;

    iget v10, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabWidth:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    move v2, v12

    :goto_0
    if-ge v2, v11, :cond_0

    add-int/lit8 v13, v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/Placeable;

    mul-int v4, v2, v10

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    move v2, v13

    goto :goto_0

    :cond_0
    iget-object v1, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$this_SubcomposeLayout:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    sget-object v2, Landroidx/compose/material/TabSlots;->Divider:Landroidx/compose/material/TabSlots;

    iget-object v3, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$divider:Lkotlin/jvm/functions/Function2;

    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    move-result-object v1

    iget-wide v10, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$constraints:J

    iget v8, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabRowHeight:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    move v2, v12

    :goto_1
    if-ge v2, v7, :cond_1

    add-int/lit8 v21, v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xb

    const/16 v20, 0x0

    move-wide v13, v10

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v2

    sub-int v5, v8, v2

    const/4 v6, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object/from16 v2, p1

    move v15, v7

    move v7, v13

    move v13, v8

    move-object v8, v14

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    move v8, v13

    move v7, v15

    move/from16 v2, v21

    goto :goto_1

    :cond_1
    iget-object v1, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$this_SubcomposeLayout:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    sget-object v2, Landroidx/compose/material/TabSlots;->Indicator:Landroidx/compose/material/TabSlots;

    const v3, -0x3abe2e1c

    new-instance v4, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1$3;

    iget-object v5, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$indicator:Lkotlin/jvm/functions/Function3;

    iget-object v6, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabPositions:Ljava/util/List;

    iget v7, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$$dirty:I

    invoke-direct {v4, v5, v6, v7}, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1$3;-><init>(Lkotlin/jvm/functions/Function3;Ljava/util/List;I)V

    const/4 v5, 0x1

    invoke-static {v3, v5, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    move-result-object v1

    iget v10, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabRowWidth:I

    iget v0, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;->$tabRowHeight:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v11

    :goto_2
    if-ge v12, v11, :cond_2

    add-int/lit8 v13, v12, 0x1

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    sget-object v3, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    invoke-virtual {v3, v10, v0}, Landroidx/compose/ui/unit/Constraints$Companion;->fixed-JhjzzOo(II)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    move v12, v13

    goto :goto_2

    :cond_2
    return-void
.end method
