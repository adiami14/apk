.class public final Landroidx/compose/foundation/lazy/list/LazyListMeasureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001ax\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u00d8\u0001\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2/\u0010)\u001a+\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+\u00a2\u0006\u0002\u0008.\u0012\u0004\u0012\u00020/0*H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00080\u00101\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00062"
    }
    d2 = {
        "calculateItemsOffsets",
        "",
        "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;",
        "items",
        "",
        "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;",
        "layoutWidth",
        "",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "itemsScrollOffset",
        "isVertical",
        "",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "reverseLayout",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "measureLazyList",
        "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;",
        "itemsCount",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;",
        "mainAxisAvailableSize",
        "beforeContentPadding",
        "afterContentPadding",
        "firstVisibleItemIndex",
        "Landroidx/compose/foundation/lazy/list/DataIndex;",
        "firstVisibleItemScrollOffset",
        "scrollToBeConsumed",
        "",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "headerIndexes",
        "placementAnimator",
        "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
        "layout",
        "Lkotlin/Function3;",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measureLazyList-wroFCeY",
        "(ILandroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final calculateItemsOffsets(Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;",
            ">;IIIIIZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;",
            ">;"
        }
    .end annotation

    move-object v0, p0

    move v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p7

    move/from16 v4, p4

    if-eqz p6, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    move v5, v1

    :goto_0
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move/from16 v8, p3

    if-ge v8, v4, :cond_1

    move v4, v6

    goto :goto_1

    :cond_1
    move v4, v7

    :goto_1
    if-eqz v4, :cond_4

    if-nez p5, :cond_2

    move v8, v6

    goto :goto_2

    :cond_2
    move v8, v7

    :goto_2
    if-eqz v8, :cond_3

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v4, :cond_e

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    new-array v9, v4, [I

    move v10, v7

    :goto_4
    if-ge v10, v4, :cond_6

    if-nez p9, :cond_5

    move v11, v10

    goto :goto_5

    :cond_5
    sub-int v11, v4, v10

    sub-int/2addr v11, v6

    :goto_5
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSize()I

    move-result v11

    aput v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_6
    new-array v10, v4, [I

    move v11, v7

    :goto_6
    if-ge v11, v4, :cond_7

    aput v7, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_7
    const-string v11, "Required value was null."

    if-eqz p6, :cond_9

    if-eqz v3, :cond_8

    move-object/from16 v12, p10

    invoke-interface {v3, v12, v5, v9, v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    goto :goto_7

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move-object/from16 v12, p10

    if-eqz p8, :cond_d

    move-object/from16 p3, p8

    move-object/from16 p4, p10

    move/from16 p5, v5

    move-object/from16 p6, v9

    move-object/from16 p7, p11

    move-object/from16 p8, v10

    invoke-interface/range {p3 .. p8}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    :goto_7
    move v3, v7

    move v9, v3

    :goto_8
    if-ge v3, v4, :cond_f

    aget v11, v10, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v12, v9, 0x1

    if-nez p9, :cond_a

    goto :goto_9

    :cond_a
    sub-int v9, v4, v9

    sub-int/2addr v9, v6

    :goto_9
    invoke-interface {p0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    if-eqz p9, :cond_b

    sub-int v11, v5, v11

    invoke-virtual {v9}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSize()I

    move-result v13

    sub-int/2addr v11, v13

    :cond_b
    if-eqz p9, :cond_c

    move v13, v7

    goto :goto_a

    :cond_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v13

    :goto_a
    invoke-virtual {v9, v11, p1, v2}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->position(III)Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    move-result-object v9

    invoke-virtual {v8, v13, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move v9, v12

    goto :goto_8

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v4, p5

    :goto_b
    if-ge v7, v3, :cond_f

    add-int/lit8 v5, v7, 0x1

    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    invoke-virtual {v6, v4, p1, v2}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->position(III)Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v6

    add-int/2addr v4, v6

    move v7, v5

    goto :goto_b

    :cond_f
    return-object v8
.end method

.method public static final measureLazyList-wroFCeY(ILandroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;
    .locals 23
    .param p1    # Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/ui/unit/Density;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p18    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;",
            "IIIIIFJZ",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;+",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;)",
            "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v14, p2

    move/from16 v15, p3

    move-wide/from16 v2, p8

    move-object/from16 v13, p18

    const-string v4, "itemProvider"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "headerIndexes"

    move-object/from16 v12, p11

    invoke-static {v12, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "density"

    move-object/from16 v11, p15

    invoke-static {v11, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "layoutDirection"

    move-object/from16 v10, p16

    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "placementAnimator"

    move-object/from16 v9, p17

    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "layout"

    invoke-static {v13, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x1

    const/4 v8, 0x0

    if-ltz v15, :cond_0

    move/from16 v4, v16

    goto :goto_0

    :cond_0
    move v4, v8

    :goto_0
    const-string v5, "Failed requirement."

    if-eqz v4, :cond_18

    if-ltz p4, :cond_1

    move/from16 v4, v16

    goto :goto_1

    :cond_1
    move v4, v8

    :goto_1
    if-eqz v4, :cond_17

    if-gtz v0, :cond_2

    new-instance v0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {p8 .. p9}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static/range {p8 .. p9}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Landroidx/compose/foundation/lazy/list/LazyListMeasureKt$measureLazyList$1;->INSTANCE:Landroidx/compose/foundation/lazy/list/LazyListMeasureKt$measureLazyList$1;

    invoke-interface {v13, v7, v2, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/MeasureResult;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    neg-int v7, v15

    const/4 v8, 0x0

    move-object/from16 p5, v0

    move-object/from16 p6, v1

    move/from16 p7, v4

    move/from16 p8, v5

    move/from16 p9, v6

    move-object/from16 p10, v2

    move-object/from16 p11, v3

    move/from16 p12, v7

    move/from16 p13, p4

    move/from16 p14, v8

    invoke-direct/range {p5 .. p14}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;III)V

    return-object v0

    :cond_2
    move/from16 v4, p5

    if-lt v4, v0, :cond_3

    add-int/lit8 v4, v0, -0x1

    invoke-static {v4}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v4

    move v5, v8

    goto :goto_2

    :cond_3
    move/from16 v5, p6

    :goto_2
    invoke-static/range {p7 .. p7}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v8}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v7

    invoke-static {v4, v7}, Landroidx/compose/foundation/lazy/list/DataIndex;->equals-impl0(II)Z

    move-result v7

    if-eqz v7, :cond_4

    if-gez v5, :cond_4

    add-int/2addr v6, v5

    move v5, v8

    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    sub-int/2addr v5, v15

    neg-int v8, v15

    const/4 v9, 0x0

    :goto_3
    if-gez v5, :cond_5

    const/16 p5, 0x0

    invoke-static/range {p5 .. p5}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v17

    sub-int v17, v4, v17

    if-lez v17, :cond_5

    add-int/lit8 v4, v4, -0x1

    invoke-static {v4}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v4

    invoke-virtual {v1, v4}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->getAndMeasure-oA9-DU0(I)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move-result-object v10

    move/from16 p6, v4

    move/from16 v4, p5

    invoke-interface {v7, v4, v10}, Ljava/util/List;->add(ILjava/lang/Object;)V

    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getCrossAxisSize()I

    move-result v4

    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v4

    add-int/2addr v5, v4

    move/from16 v4, p6

    move-object/from16 v10, p16

    goto :goto_3

    :cond_5
    if-ge v5, v8, :cond_6

    add-int/2addr v6, v5

    move v5, v8

    :cond_6
    add-int/2addr v5, v15

    add-int v10, v14, p4

    move/from16 p5, v4

    const/4 v4, 0x0

    invoke-static {v10, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v10

    neg-int v4, v5

    move/from16 p6, v4

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v4

    move/from16 v20, p5

    move/from16 v19, p6

    move/from16 v18, v5

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v4, :cond_7

    add-int/lit8 v21, v5, 0x1

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    add-int/lit8 v20, v20, 0x1

    invoke-static/range {v20 .. v20}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v20

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v5

    add-int v19, v19, v5

    move/from16 v5, v21

    goto :goto_4

    :cond_7
    move/from16 v5, v19

    move/from16 v4, v20

    :goto_5
    if-le v5, v10, :cond_8

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v19

    if-eqz v19, :cond_b

    :cond_8
    if-ge v4, v0, :cond_b

    move/from16 p6, v10

    invoke-virtual {v1, v4}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->getAndMeasure-oA9-DU0(I)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v19

    add-int v5, v5, v19

    if-gt v5, v8, :cond_9

    move/from16 v19, v5

    add-int/lit8 v5, v0, -0x1

    if-eq v4, v5, :cond_a

    add-int/lit8 v5, v4, 0x1

    invoke-static {v5}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v5

    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v10

    sub-int v18, v18, v10

    goto :goto_6

    :cond_9
    move/from16 v19, v5

    :cond_a
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getCrossAxisSize()I

    move-result v5

    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v9, v5

    move/from16 v5, p5

    :goto_6
    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v4

    move/from16 v10, p6

    move/from16 p5, v5

    move/from16 v5, v19

    goto :goto_5

    :cond_b
    if-ge v5, v14, :cond_e

    sub-int v4, v14, v5

    sub-int v18, v18, v4

    add-int/2addr v5, v4

    move/from16 v10, p5

    move v0, v9

    move/from16 v9, v18

    :goto_7
    if-ge v9, v15, :cond_c

    const/16 p5, 0x0

    invoke-static/range {p5 .. p5}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v17

    sub-int v17, v10, v17

    if-lez v17, :cond_c

    add-int/lit8 v10, v10, -0x1

    invoke-static {v10}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v10

    move/from16 v17, v8

    invoke-virtual {v1, v10}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->getAndMeasure-oA9-DU0(I)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move-result-object v8

    move/from16 v1, p5

    invoke-interface {v7, v1, v8}, Ljava/util/List;->add(ILjava/lang/Object;)V

    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getCrossAxisSize()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v1

    add-int/2addr v9, v1

    move-object/from16 v1, p1

    move/from16 v8, v17

    goto :goto_7

    :cond_c
    move/from16 v17, v8

    add-int/2addr v6, v4

    if-gez v9, :cond_d

    add-int/2addr v6, v9

    add-int/2addr v5, v9

    move v1, v0

    move v0, v5

    const/4 v9, 0x0

    goto :goto_8

    :cond_d
    move v1, v0

    move v0, v5

    goto :goto_8

    :cond_e
    move/from16 v17, v8

    move v0, v5

    move v1, v9

    move/from16 v9, v18

    :goto_8
    invoke-static/range {p7 .. p7}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    invoke-static {v4}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v4

    invoke-static {v6}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v5

    if-ne v4, v5, :cond_f

    invoke-static/range {p7 .. p7}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-lt v4, v5, :cond_f

    int-to-float v4, v6

    move v10, v4

    goto :goto_9

    :cond_f
    move/from16 v10, p7

    :goto_9
    neg-int v8, v9

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    if-lez v15, :cond_11

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v5

    move-object v6, v4

    const/4 v4, 0x0

    :goto_a
    if-ge v4, v5, :cond_10

    move/from16 p6, v1

    add-int/lit8 v1, v4, 0x1

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move/from16 p7, v5

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v5

    move-object/from16 v18, v6

    if-gt v5, v9, :cond_12

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v6

    if-eq v4, v6, :cond_12

    sub-int/2addr v9, v5

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move/from16 v5, p7

    move v4, v1

    move/from16 v1, p6

    goto :goto_a

    :cond_10
    move/from16 p6, v1

    move-object/from16 v18, v6

    goto :goto_b

    :cond_11
    move/from16 p6, v1

    move-object/from16 v18, v4

    :cond_12
    :goto_b
    move v1, v9

    if-eqz p10, :cond_13

    move/from16 v4, p6

    goto :goto_c

    :cond_13
    move v4, v0

    :goto_c
    invoke-static {v2, v3, v4}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v19

    if-eqz p10, :cond_14

    move v4, v0

    goto :goto_d

    :cond_14
    move/from16 v4, p6

    :goto_d
    invoke-static {v2, v3, v4}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v20

    move-object v2, v7

    move/from16 v3, v19

    move/from16 v4, v20

    move v5, v0

    move/from16 v6, p2

    move v7, v8

    const/16 v21, 0x0

    move/from16 v8, p10

    move-object/from16 v9, p12

    move v15, v10

    move-object/from16 v10, p13

    move/from16 v11, p14

    move-object/from16 v12, p15

    move/from16 v22, v1

    move-object v1, v13

    move-object/from16 v13, p16

    invoke-static/range {v2 .. v13}, Landroidx/compose/foundation/lazy/list/LazyListMeasureKt;->calculateItemsOffsets(Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)Ljava/util/List;

    move-result-object v2

    invoke-interface/range {p11 .. p11}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_15

    move-object/from16 p5, v2

    move-object/from16 p6, p1

    move-object/from16 p7, p11

    move/from16 p8, p3

    move/from16 p9, v19

    move/from16 p10, v20

    invoke-static/range {p5 .. p10}, Landroidx/compose/foundation/lazy/list/LazyListHeadersKt;->findOrComposeLazyListHeader(Ljava/util/List;Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;Ljava/util/List;III)Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    move-result-object v3

    goto :goto_e

    :cond_15
    const/4 v3, 0x0

    :goto_e
    float-to-int v4, v15

    move-object/from16 p5, p17

    move/from16 p6, v4

    move/from16 p7, v19

    move/from16 p8, v20

    move/from16 p9, p14

    move-object/from16 p10, v2

    move-object/from16 p11, p1

    invoke-virtual/range {p5 .. p11}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->onMeasured(IIIZLjava/util/List;Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;)V

    invoke-static {v0, v14}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int v4, v4, p4

    if-le v0, v14, :cond_16

    goto :goto_f

    :cond_16
    move/from16 v16, v21

    :goto_f
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, Landroidx/compose/foundation/lazy/list/LazyListMeasureKt$measureLazyList$3;

    invoke-direct {v6, v2, v3}, Landroidx/compose/foundation/lazy/list/LazyListMeasureKt$measureLazyList$3;-><init>(Ljava/util/List;Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;)V

    invoke-interface {v1, v0, v5, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/MeasureResult;

    new-instance v1, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;

    move-object/from16 p1, v1

    move-object/from16 p2, v18

    move/from16 p3, v22

    move/from16 p4, v16

    move/from16 p5, v15

    move-object/from16 p6, v0

    move-object/from16 p7, v2

    move/from16 p8, v17

    move/from16 p9, v4

    move/from16 p10, p0

    invoke-direct/range {p1 .. p10}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;III)V

    return-object v1

    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
