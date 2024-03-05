.class final Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/list/LazyListKt;->rememberLazyListMeasurePolicy(Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;
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
.field public final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic $horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

.field public final synthetic $horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field public final synthetic $isVertical:Z

.field public final synthetic $itemScope:Landroidx/compose/ui/node/Ref;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/node/Ref<",
            "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

.field public final synthetic $placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

.field public final synthetic $reverseLayout:Z

.field public final synthetic $state:Landroidx/compose/foundation/lazy/LazyListState;

.field public final synthetic $stateOfItemsProvider:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

.field public final synthetic $verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;


# direct methods
.method public constructor <init>(ZLandroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/OverScrollController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/runtime/State<",
            "+",
            "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Landroidx/compose/ui/node/Ref<",
            "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;",
            ">;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/gestures/OverScrollController;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    iput-object p2, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p3, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    iput-object p4, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$stateOfItemsProvider:Landroidx/compose/runtime/State;

    iput-object p5, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iput-object p6, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$itemScope:Landroidx/compose/ui/node/Ref;

    iput-object p7, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    iput-object p8, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iput-object p9, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    iput-object p10, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iput-object p11, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    iput-object p12, p0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;J)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;
    .locals 32
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move-wide/from16 v13, p3

    const-string v1, "$this$LazyMeasurePolicy"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "placeablesProvider"

    move-object/from16 v12, p2

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    invoke-static {v13, v14, v1}, Landroidx/compose/foundation/ScrollKt;->assertNotNestingScrollableContainers-K40F9xA(JZ)V

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v1

    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v5

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v1

    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v1

    iget-object v2, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v2}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result v2

    invoke-interface {v15, v2}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v6

    iget-object v2, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v2}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v2

    invoke-interface {v15, v2}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v2

    add-int v11, v6, v2

    add-int v10, v5, v1

    iget-boolean v3, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v3, :cond_0

    move v4, v11

    goto :goto_0

    :cond_0
    move v4, v10

    :goto_0
    if-eqz v3, :cond_1

    iget-boolean v7, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    if-nez v7, :cond_1

    move/from16 v16, v6

    goto :goto_1

    :cond_1
    if-eqz v3, :cond_2

    iget-boolean v7, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    if-eqz v7, :cond_2

    move/from16 v16, v2

    goto :goto_1

    :cond_2
    if-nez v3, :cond_3

    iget-boolean v2, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    if-nez v2, :cond_3

    move/from16 v16, v5

    goto :goto_1

    :cond_3
    move/from16 v16, v1

    :goto_1
    sub-int v22, v4, v16

    neg-int v1, v10

    neg-int v2, v11

    invoke-static {v13, v14, v1, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v8

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$stateOfItemsProvider:Landroidx/compose/runtime/State;

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v1, v7}, Landroidx/compose/foundation/lazy/LazyListState;->updateScrollPositionIfTheFirstItemWasMoved$foundation_release(Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;)V

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v1, v15}, Landroidx/compose/foundation/lazy/LazyListState;->setDensity$foundation_release(Landroidx/compose/ui/unit/Density;)V

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$itemScope:Landroidx/compose/ui/node/Ref;

    invoke-static {v1, v15, v8, v9}, Landroidx/compose/foundation/lazy/list/LazyListKt;->access$update-3p2s80s(Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/unit/Density;J)V

    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    const-string v2, "Required value was null."

    if-eqz v1, :cond_5

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    move-result v1

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    if-eqz v1, :cond_8

    invoke-interface {v1}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    move-result v1

    :goto_2
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v3

    invoke-interface {v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;->getItemsCount()I

    move-result v26

    new-instance v27, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;

    iget-boolean v4, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    new-instance v17, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;

    iget-object v2, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    move/from16 v18, v10

    iget-boolean v10, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    iget-object v13, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    move-object v14, v1

    move-object/from16 v1, v17

    move-object/from16 v19, v2

    move/from16 v2, v26

    move/from16 v20, v4

    move-object/from16 v4, p1

    move-object/from16 v21, v7

    move/from16 v7, v20

    move-wide/from16 v28, v8

    move-object/from16 v8, v19

    move-object v9, v14

    move/from16 v30, v18

    move/from16 v31, v11

    move/from16 v11, v16

    move/from16 v12, v22

    invoke-direct/range {v1 .. v13}, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1;-><init>(IILandroidx/compose/ui/layout/MeasureScope;IIZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ZIILandroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;)V

    const/4 v9, 0x0

    move-object/from16 v2, v27

    move-wide/from16 v3, v28

    move/from16 v5, v20

    move-object/from16 v6, v21

    move-object/from16 v7, p2

    move-object/from16 v8, v17

    invoke-direct/range {v2 .. v9}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;-><init>(JZLandroidx/compose/foundation/lazy/list/LazyListItemsProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListState;->getPrefetchPolicy$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->getChildConstraints-msEJaDk()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;->setConstraints-BRTryo0(J)V

    :goto_3
    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v1, :cond_7

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v1

    sub-int v1, v1, v31

    goto :goto_4

    :cond_7
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v1

    sub-int v1, v1, v30

    :goto_4
    move v9, v1

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndexNonObservable-AUyieIw$foundation_release()I

    move-result v12

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemScrollOffsetNonObservable$foundation_release()I

    move-result v13

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListState;->getScrollToBeConsumed$foundation_release()F

    move-result v14

    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    move/from16 v17, v1

    invoke-interface/range {v21 .. v21}, Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;->getHeaderIndexes()Ljava/util/List;

    move-result-object v18

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-object/from16 v19, v1

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-object/from16 v20, v1

    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    move/from16 v21, v1

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v23

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    move-object/from16 v24, v1

    new-instance v1, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$1;

    move-object/from16 v25, v1

    move-object/from16 v2, p1

    move-wide/from16 v3, p3

    move/from16 v5, v30

    move/from16 v6, v31

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$1;-><init>(Landroidx/compose/ui/layout/MeasureScope;JII)V

    move/from16 v7, v26

    move-object/from16 v8, v27

    move/from16 v10, v16

    move/from16 v11, v22

    move-wide/from16 v15, v28

    move-object/from16 v22, p1

    invoke-static/range {v7 .. v25}, Landroidx/compose/foundation/lazy/list/LazyListMeasureKt;->measureLazyList-wroFCeY(ILandroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;

    move-result-object v6

    iget-object v1, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iget-object v0, v0, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    invoke-virtual {v1, v6}, Landroidx/compose/foundation/lazy/LazyListState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;)V

    move-object v1, v6

    move-wide/from16 v2, p3

    move/from16 v4, v30

    move/from16 v5, v31

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/list/LazyListKt;->access$refreshOverScrollInfo-L1NQ6kE(Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;JII)V

    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getLazyLayoutMeasureResult()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;

    move-result-object v0

    return-object v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
