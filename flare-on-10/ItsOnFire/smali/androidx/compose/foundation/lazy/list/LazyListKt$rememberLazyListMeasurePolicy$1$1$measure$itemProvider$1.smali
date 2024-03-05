.class final Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;J)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
.field public final synthetic $afterContentPadding:I

.field public final synthetic $beforeContentPadding:I

.field public final synthetic $horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

.field public final synthetic $isVertical:Z

.field public final synthetic $itemsCount:I

.field public final synthetic $placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

.field public final synthetic $reverseLayout:Z

.field public final synthetic $spaceBetweenItems:I

.field public final synthetic $startPadding:I

.field public final synthetic $this_LazyMeasurePolicy:Landroidx/compose/ui/layout/MeasureScope;

.field public final synthetic $topPadding:I

.field public final synthetic $verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;


# direct methods
.method public constructor <init>(IILandroidx/compose/ui/layout/MeasureScope;IIZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ZIILandroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$itemsCount:I

    iput p2, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$spaceBetweenItems:I

    iput-object p3, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$this_LazyMeasurePolicy:Landroidx/compose/ui/layout/MeasureScope;

    iput p4, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$startPadding:I

    iput p5, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$topPadding:I

    iput-boolean p6, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$isVertical:Z

    iput-object p7, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iput-object p8, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    iput-boolean p9, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$reverseLayout:Z

    iput p10, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$beforeContentPadding:I

    iput p11, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$afterContentPadding:I

    iput-object p12, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createItem-8xJyyfI(ILjava/lang/Object;[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;
    .locals 18
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "key"

    move-object/from16 v14, p2

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "placeables"

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$itemsCount:I

    add-int/lit8 v1, v1, -0x1

    move/from16 v3, p1

    if-ne v3, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$spaceBetweenItems:I

    :goto_0
    move v13, v1

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$this_LazyMeasurePolicy:Landroidx/compose/ui/layout/MeasureScope;

    invoke-interface {v1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v8

    iget v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$startPadding:I

    iget v2, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$topPadding:I

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v15

    new-instance v1, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    iget-boolean v5, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$isVertical:Z

    iget-object v6, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iget-object v7, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    iget-boolean v9, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$reverseLayout:Z

    iget v10, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$beforeContentPadding:I

    iget v11, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$afterContentPadding:I

    iget-object v12, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;->$placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    const/16 v17, 0x0

    move-object v2, v1

    move/from16 v3, p1

    move-object/from16 v4, p3

    move-wide v14, v15

    move-object/from16 v16, p2

    invoke-direct/range {v2 .. v17}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;-><init>(I[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIILandroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;IJLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
