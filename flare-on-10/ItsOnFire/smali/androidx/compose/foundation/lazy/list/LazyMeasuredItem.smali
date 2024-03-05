.class public final Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001Bz\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0008\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001bR\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001bR\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010$\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006*"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;",
        "",
        "index",
        "",
        "placeables",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;",
        "isVertical",
        "",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "reverseLayout",
        "beforeContentPadding",
        "afterContentPadding",
        "placementAnimator",
        "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
        "spacing",
        "visualOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "key",
        "(I[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIILandroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;IJLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "crossAxisSize",
        "getCrossAxisSize",
        "()I",
        "getIndex",
        "getKey",
        "()Ljava/lang/Object;",
        "[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;",
        "size",
        "getSize",
        "sizeWithSpacings",
        "getSizeWithSpacings",
        "J",
        "position",
        "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;",
        "offset",
        "layoutWidth",
        "layoutHeight",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final afterContentPadding:I

.field private final beforeContentPadding:I

.field private final crossAxisSize:I

.field private final horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final index:I

.field private final isVertical:Z

.field private final key:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final placeables:[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final reverseLayout:Z

.field private final size:I

.field private final sizeWithSpacings:I

.field private final spacing:I

.field private final verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final visualOffset:J


# direct methods
.method private constructor <init>(I[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIILandroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;IJLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->index:I

    iput-object p2, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->placeables:[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;

    iput-boolean p3, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->isVertical:Z

    iput-object p4, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iput-object p5, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    iput-object p6, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    iput-boolean p7, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->reverseLayout:Z

    iput p8, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->beforeContentPadding:I

    iput p9, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->afterContentPadding:I

    iput-object p10, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    iput p11, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->spacing:I

    iput-wide p12, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->visualOffset:J

    iput-object p14, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->key:Ljava/lang/Object;

    array-length p1, p2

    const/4 p3, 0x0

    move p4, p3

    move p5, p4

    :goto_0
    if-ge p3, p1, :cond_2

    aget-object p6, p2, p3

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;->getPlaceable()Landroidx/compose/ui/layout/Placeable;

    move-result-object p6

    iget-boolean p7, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->isVertical:Z

    if-eqz p7, :cond_0

    invoke-virtual {p6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p7

    goto :goto_1

    :cond_0
    invoke-virtual {p6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p7

    :goto_1
    add-int/2addr p4, p7

    iget-boolean p7, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->isVertical:Z

    if-nez p7, :cond_1

    invoke-virtual {p6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p6

    goto :goto_2

    :cond_1
    invoke-virtual {p6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p6

    :goto_2
    invoke-static {p5, p6}, Ljava/lang/Math;->max(II)I

    move-result p5

    goto :goto_0

    :cond_2
    iput p4, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->size:I

    iget p1, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->spacing:I

    add-int/2addr p4, p1

    iput p4, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->sizeWithSpacings:I

    iput p5, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->crossAxisSize:I

    return-void
.end method

.method public synthetic constructor <init>(I[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIILandroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;IJLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p14}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;-><init>(I[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIILandroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;IJLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getCrossAxisSize()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->crossAxisSize:I

    return p0
.end method

.method public final getIndex()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->index:I

    return p0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->key:Ljava/lang/Object;

    return-object p0
.end method

.method public final getSize()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->size:I

    return p0
.end method

.method public final getSizeWithSpacings()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->sizeWithSpacings:I

    return p0
.end method

.method public final position(III)Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;
    .locals 16
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->isVertical:Z

    if-eqz v1, :cond_0

    move/from16 v1, p3

    goto :goto_0

    :cond_0
    move/from16 v1, p2

    :goto_0
    iget-boolean v2, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->reverseLayout:Z

    if-eqz v2, :cond_1

    sub-int v3, v1, p1

    iget v4, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->size:I

    sub-int/2addr v3, v4

    goto :goto_1

    :cond_1
    move/from16 v3, p1

    :goto_1
    const/4 v4, 0x0

    if-eqz v2, :cond_2

    iget-object v2, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->placeables:[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;

    invoke-static {v2}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    iget-boolean v5, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->reverseLayout:Z

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    if-ltz v2, :cond_4

    goto :goto_3

    :cond_3
    iget-object v7, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->placeables:[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;

    array-length v7, v7

    if-ge v2, v7, :cond_4

    goto :goto_3

    :cond_4
    move v6, v4

    :goto_3
    if-eqz v6, :cond_b

    iget-object v5, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->placeables:[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;

    aget-object v5, v5, v2

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;->getPlaceable()Landroidx/compose/ui/layout/Placeable;

    move-result-object v13

    iget-boolean v5, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->reverseLayout:Z

    if-eqz v5, :cond_5

    move v5, v4

    goto :goto_4

    :cond_5
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v5

    :goto_4
    iget-boolean v6, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->isVertical:Z

    const-string v7, "Required value was null."

    if-eqz v6, :cond_7

    iget-object v6, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    if-eqz v6, :cond_6

    invoke-virtual {v13}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v7

    iget-object v8, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    move/from16 v15, p2

    invoke-interface {v6, v7, v15, v8}, Landroidx/compose/ui/Alignment$Horizontal;->align(IILandroidx/compose/ui/unit/LayoutDirection;)I

    move-result v6

    invoke-static {v6, v3}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v6

    move/from16 v8, p3

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move/from16 v15, p2

    iget-object v6, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    if-eqz v6, :cond_a

    invoke-virtual {v13}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v7

    move/from16 v8, p3

    invoke-interface {v6, v7, v8}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    move-result v6

    invoke-static {v3, v6}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v6

    :goto_5
    move-wide v11, v6

    iget-boolean v6, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->isVertical:Z

    if-eqz v6, :cond_8

    invoke-virtual {v13}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v6

    goto :goto_6

    :cond_8
    invoke-virtual {v13}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v6

    :goto_6
    add-int/2addr v3, v6

    new-instance v6, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;

    iget-object v7, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->placeables:[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;

    aget-object v7, v7, v2

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;->getParentData()Ljava/lang/Object;

    move-result-object v14

    const/4 v7, 0x0

    move-object v10, v6

    move-object v15, v7

    invoke-direct/range {v10 .. v15}, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;-><init>(JLandroidx/compose/ui/layout/Placeable;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v9, v5, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-boolean v5, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->reverseLayout:Z

    if-eqz v5, :cond_9

    add-int/lit8 v2, v2, -0x1

    goto/16 :goto_2

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v14, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    iget v2, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->index:I

    iget-object v3, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->key:Ljava/lang/Object;

    iget v4, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->size:I

    iget v6, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->sizeWithSpacings:I

    if-nez v5, :cond_c

    iget v7, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->beforeContentPadding:I

    goto :goto_7

    :cond_c
    iget v7, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->afterContentPadding:I

    :goto_7
    neg-int v7, v7

    if-nez v5, :cond_d

    iget v5, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->afterContentPadding:I

    goto :goto_8

    :cond_d
    iget v5, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->beforeContentPadding:I

    :goto_8
    add-int v8, v1, v5

    iget-boolean v10, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->isVertical:Z

    iget-object v11, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    iget-wide v12, v0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->visualOffset:J

    const/4 v15, 0x0

    move-object v0, v14

    move/from16 v1, p1

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v10

    move-object v10, v11

    move-wide v11, v12

    move-object v13, v15

    invoke-direct/range {v0 .. v13}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;-><init>(IILjava/lang/Object;IIIIZLjava/util/List;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14
.end method
