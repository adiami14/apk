.class public final Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0006\n\u0002\u0010#\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020\u0008\u00a2\u0006\u0004\u0008>\u0010?JM\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001c\u0010\u0017\u001a\u00020\u0006*\u00020\u0002H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J<\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ;\u0010\'\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0006\u0010(\u001a\u00020\u0013R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010,\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00100R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00104R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00104R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00104R\u001a\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u0001088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u001b\u0010=\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010<\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006@"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
        "",
        "",
        "index",
        "sizeWithSpacings",
        "averageItemsSize",
        "Landroidx/compose/ui/unit/IntOffset;",
        "scrolledBy",
        "",
        "reverseLayout",
        "mainAxisLayoutSize",
        "fallback",
        "calculateExpectedOffset-tGxSNXI",
        "(IIIJZII)I",
        "calculateExpectedOffset",
        "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;",
        "item",
        "Landroidx/compose/foundation/lazy/list/ItemInfo;",
        "itemInfo",
        "",
        "startAnimationsIfNeeded",
        "toOffset-Bjo55l4",
        "(I)J",
        "toOffset",
        "consumedScroll",
        "layoutWidth",
        "layoutHeight",
        "",
        "positionedItems",
        "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;",
        "itemProvider",
        "onMeasured",
        "key",
        "placeableIndex",
        "minOffset",
        "maxOffset",
        "rawOffset",
        "getAnimatedOffset-YT5a7pE",
        "(Ljava/lang/Object;IIIJ)J",
        "getAnimatedOffset",
        "reset",
        "Lj/u0;",
        "scope",
        "Lj/u0;",
        "isVertical",
        "Z",
        "",
        "keyToItemInfoMap",
        "Ljava/util/Map;",
        "",
        "keyToIndexMap",
        "viewportStartItemIndex",
        "I",
        "viewportStartItemNotVisiblePartSize",
        "viewportEndItemIndex",
        "viewportEndItemNotVisiblePartSize",
        "",
        "positionedKeys",
        "Ljava/util/Set;",
        "getMainAxis--gyyYBs",
        "(J)I",
        "mainAxis",
        "<init>",
        "(Lj/u0;Z)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final isVertical:Z

.field private keyToIndexMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final keyToItemInfoMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Landroidx/compose/foundation/lazy/list/ItemInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final positionedKeys:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final scope:Lj/u0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private viewportEndItemIndex:I

.field private viewportEndItemNotVisiblePartSize:I

.field private viewportStartItemIndex:I

.field private viewportStartItemNotVisiblePartSize:I


# direct methods
.method public constructor <init>(Lj/u0;Z)V
    .locals 1
    .param p1    # Lj/u0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->scope:Lj/u0;

    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->isVertical:Z

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToItemInfoMap:Ljava/util/Map;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToIndexMap:Ljava/util/Map;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemIndex:I

    iput p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemIndex:I

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->positionedKeys:Ljava/util/Set;

    return-void
.end method

.method private final calculateExpectedOffset-tGxSNXI(IIIJZII)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemIndex:I

    if-nez p6, :cond_0

    if-ge v2, p1, :cond_1

    goto :goto_0

    :cond_0
    if-le v2, p1, :cond_1

    :goto_0
    move v2, v1

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    iget v3, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemIndex:I

    if-nez p6, :cond_2

    if-le v3, p1, :cond_3

    goto :goto_2

    :cond_2
    if-ge v3, p1, :cond_3

    :goto_2
    move v0, v1

    :cond_3
    const/4 v3, -0x1

    if-eqz v2, :cond_5

    iget p2, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemIndex:I

    sub-int/2addr p1, p2

    if-nez p6, :cond_4

    move v3, v1

    :cond_4
    mul-int/2addr p1, v3

    iget p2, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemNotVisiblePartSize:I

    add-int/2addr p7, p2

    sub-int/2addr p1, v1

    mul-int/2addr p3, p1

    add-int/2addr p7, p3

    invoke-direct {p0, p4, p5}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result p0

    add-int p8, p7, p0

    goto :goto_3

    :cond_5
    if-eqz v0, :cond_7

    iget p7, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemIndex:I

    sub-int/2addr p7, p1

    if-nez p6, :cond_6

    move v3, v1

    :cond_6
    mul-int/2addr p7, v3

    iget p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemNotVisiblePartSize:I

    sub-int/2addr p1, p2

    sub-int/2addr p7, v1

    mul-int/2addr p3, p7

    sub-int/2addr p1, p3

    invoke-direct {p0, p4, p5}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result p0

    add-int p8, p1, p0

    :cond_7
    :goto_3
    return p8
.end method

.method private final getMainAxis--gyyYBs(J)I
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->isVertical:Z

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result p0

    :goto_0
    return p0
.end method

.method private final startAnimationsIfNeeded(Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;Landroidx/compose/foundation/lazy/list/ItemInfo;)V
    .locals 13

    :goto_0
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getPlaceablesCount()I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->removeLast(Ljava/util/List;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    :goto_1
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getPlaceablesCount()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset-Bjo55l4(I)J

    move-result-wide v3

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v1

    new-instance v5, Landroidx/compose/foundation/lazy/list/PlaceableInfo;

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getNotAnimatableDelta-nOcc-ac()J

    move-result-wide v6

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v8

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v9

    sub-int/2addr v8, v9

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v3

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v8, v3}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v3

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getMainAxisSize(I)I

    move-result v0

    invoke-direct {v5, v3, v4, v0, v2}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    :goto_2
    if-ge v1, v3, :cond_3

    add-int/lit8 v4, v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/list/PlaceableInfo;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->getTargetOffset-nOcc-ac()J

    move-result-wide v6

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getNotAnimatableDelta-nOcc-ac()J

    move-result-wide v8

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v10

    invoke-static {v8, v9}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v11

    add-int/2addr v10, v11

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    invoke-static {v8, v9}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v10, v6}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v6

    invoke-virtual {p1, v1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset-Bjo55l4(I)J

    move-result-wide v8

    invoke-virtual {p1, v1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getMainAxisSize(I)I

    move-result v10

    invoke-virtual {v5, v10}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->setSize(I)V

    invoke-virtual {p1, v1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getAnimationSpec(I)Landroidx/compose/animation/core/FiniteAnimationSpec;

    move-result-object v1

    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getNotAnimatableDelta-nOcc-ac()J

    move-result-wide v6

    invoke-static {v8, v9}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v10

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v11

    sub-int/2addr v10, v11

    invoke-static {v8, v9}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v8

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    sub-int/2addr v8, v6

    invoke-static {v10, v8}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->setTargetOffset--gyyYBs(J)V

    if-eqz v1, :cond_2

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->setInProgress(Z)V

    iget-object v7, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->scope:Lj/u0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1;

    invoke-direct {v10, v5, v1, v2}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1;-><init>(Landroidx/compose/foundation/lazy/list/PlaceableInfo;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    :cond_2
    move v1, v4

    goto :goto_2

    :cond_3
    return-void
.end method

.method private final toOffset-Bjo55l4(I)J
    .locals 2

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->isVertical:Z

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    if-nez p0, :cond_1

    move p1, v0

    :cond_1
    invoke-static {v1, p1}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public final getAnimatedOffset-YT5a7pE(Ljava/lang/Object;IIIJ)J
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToItemInfoMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/list/ItemInfo;

    if-nez p1, :cond_0

    return-wide p5

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object p5

    invoke-interface {p5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/compose/foundation/lazy/list/PlaceableInfo;

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->getAnimatedOffset()Landroidx/compose/animation/core/Animatable;

    move-result-object p5

    invoke-virtual {p5}, Landroidx/compose/animation/core/Animatable;->getValue()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroidx/compose/ui/unit/IntOffset;

    invoke-virtual {p5}, Landroidx/compose/ui/unit/IntOffset;->unbox-impl()J

    move-result-wide p5

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getNotAnimatableDelta-nOcc-ac()J

    move-result-wide v0

    invoke-static {p5, p6}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v2

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {p5, p6}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result p5

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result p6

    add-int/2addr p5, p6

    invoke-static {v2, p5}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide p5

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->getTargetOffset-nOcc-ac()J

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getNotAnimatableDelta-nOcc-ac()J

    move-result-wide v2

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result p1

    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v4

    add-int/2addr p1, v4

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v0

    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v0

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->getInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result p1

    if-ge p1, p3, :cond_1

    invoke-direct {p0, p5, p6}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result p1

    if-lt p1, p3, :cond_2

    :cond_1
    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result p1

    if-le p1, p4, :cond_3

    invoke-direct {p0, p5, p6}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result p1

    if-le p1, p4, :cond_3

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->scope:Lj/u0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator$getAnimatedOffset$1;

    const/4 p0, 0x0

    invoke-direct {v3, p2, p0}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator$getAnimatedOffset$1;-><init>(Landroidx/compose/foundation/lazy/list/PlaceableInfo;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    :cond_3
    return-wide p5
.end method

.method public final onMeasured(IIIZLjava/util/List;Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;)V
    .locals 31
    .param p5    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIZ",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;",
            ">;",
            "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;",
            ")V"
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    const-string v0, "positionedItems"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemProvider"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v12, 0x0

    move v1, v12

    :goto_0
    if-ge v1, v0, :cond_1

    add-int/lit8 v2, v1, 0x1

    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getHasAnimations()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    move v0, v12

    :goto_1
    if-nez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->reset()V

    return-void

    :cond_2
    iget-boolean v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->isVertical:Z

    if-eqz v0, :cond_3

    move/from16 v14, p3

    goto :goto_2

    :cond_3
    move/from16 v14, p2

    :goto_2
    move/from16 v0, p1

    if-eqz p4, :cond_4

    neg-int v0, v0

    :cond_4
    invoke-direct {v9, v0}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->toOffset-Bjo55l4(I)J

    move-result-wide v15

    invoke-static/range {p5 .. p5}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    invoke-static/range {p5 .. p5}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    move-result v0

    move v1, v12

    move v2, v1

    :goto_3
    if-ge v1, v0, :cond_6

    add-int/lit8 v3, v1, 0x1

    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    iget-object v4, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToItemInfoMap:Ljava/util/Map;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/list/ItemInfo;

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getIndex()I

    move-result v5

    invoke-virtual {v4, v5}, Landroidx/compose/foundation/lazy/list/ItemInfo;->setIndex(I)V

    :goto_4
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getSizeWithSpacings()I

    move-result v1

    add-int/2addr v2, v1

    move v1, v3

    goto :goto_3

    :cond_6
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    move-result v0

    div-int v19, v2, v0

    iget-object v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->positionedKeys:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    move-result v8

    move v0, v12

    :goto_5
    if-ge v0, v8, :cond_f

    add-int/lit8 v20, v0, 0x1

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    iget-object v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->positionedKeys:Ljava/util/Set;

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToItemInfoMap:Ljava/util/Map;

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/list/ItemInfo;

    if-nez v0, :cond_d

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getHasAnimations()Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v6, Landroidx/compose/foundation/lazy/list/ItemInfo;

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getIndex()I

    move-result v0

    invoke-direct {v6, v0}, Landroidx/compose/foundation/lazy/list/ItemInfo;-><init>(I)V

    iget-object v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToIndexMap:Ljava/util/Map;

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v7, v12}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset-Bjo55l4(I)J

    move-result-wide v4

    invoke-virtual {v7, v12}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getMainAxisSize(I)I

    move-result v21

    if-nez v0, :cond_7

    invoke-direct {v9, v4, v5}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result v0

    move-wide/from16 v27, v4

    move-object/from16 p1, v6

    move-object/from16 v29, v7

    move/from16 v30, v8

    goto :goto_8

    :cond_7
    invoke-direct {v9, v4, v5}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-nez p4, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getSizeWithSpacings()I

    move-result v2

    sub-int/2addr v1, v2

    add-int v1, v1, v21

    :goto_6
    move/from16 v22, v1

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getSizeWithSpacings()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v0, p0

    move/from16 v3, v19

    move-wide/from16 v27, v4

    move-wide v4, v15

    move-object/from16 p1, v6

    move/from16 v6, p4

    move-object/from16 v29, v7

    move v7, v14

    move/from16 v30, v8

    move/from16 v8, v22

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->calculateExpectedOffset-tGxSNXI(IIIJZII)I

    move-result v0

    if-eqz p4, :cond_9

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getSize()I

    move-result v1

    sub-int v1, v1, v21

    goto :goto_7

    :cond_9
    move v1, v12

    :goto_7
    add-int/2addr v0, v1

    :goto_8
    iget-boolean v1, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->isVertical:Z

    if-eqz v1, :cond_a

    const/16 v23, 0x0

    const/16 v25, 0x1

    const/16 v26, 0x0

    move-wide/from16 v21, v27

    move/from16 v24, v0

    goto :goto_9

    :cond_a
    const/16 v24, 0x0

    const/16 v25, 0x2

    const/16 v26, 0x0

    move-wide/from16 v21, v27

    move/from16 v23, v0

    :goto_9
    invoke-static/range {v21 .. v26}, Landroidx/compose/ui/unit/IntOffset;->copy-iSbpLlY$default(JIIILjava/lang/Object;)J

    move-result-wide v0

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getPlaceablesCount()I

    move-result v2

    move v3, v12

    :goto_a
    if-ge v3, v2, :cond_b

    add-int/lit8 v4, v3, 0x1

    move-object/from16 v5, v29

    invoke-virtual {v5, v3}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset-Bjo55l4(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v8

    invoke-static/range {v27 .. v28}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v21

    sub-int v8, v8, v21

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    invoke-static/range {v27 .. v28}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v7

    sub-int/2addr v6, v7

    invoke-static {v8, v6}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v8

    new-instance v12, Landroidx/compose/foundation/lazy/list/PlaceableInfo;

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v22

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v23

    add-int v13, v22, v23

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v22

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    add-int v6, v22, v6

    invoke-static {v13, v6}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v6

    invoke-virtual {v5, v3}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getMainAxisSize(I)I

    move-result v3

    const/4 v13, 0x0

    invoke-direct {v12, v6, v7, v3, v13}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move v3, v4

    const/4 v12, 0x0

    goto :goto_a

    :cond_b
    move-object/from16 v5, v29

    iget-object v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToItemInfoMap:Ljava/util/Map;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getKey()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v9, v5, v2}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->startAnimationsIfNeeded(Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;Landroidx/compose/foundation/lazy/list/ItemInfo;)V

    goto :goto_b

    :cond_c
    move/from16 v30, v8

    goto :goto_b

    :cond_d
    move-object v5, v7

    move/from16 v30, v8

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getHasAnimations()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getNotAnimatableDelta-nOcc-ac()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v3

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v3, v1}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->setNotAnimatableDelta--gyyYBs(J)V

    invoke-direct {v9, v5, v0}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->startAnimationsIfNeeded(Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;Landroidx/compose/foundation/lazy/list/ItemInfo;)V

    goto :goto_b

    :cond_e
    iget-object v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToItemInfoMap:Ljava/util/Map;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_b
    move/from16 v0, v20

    move/from16 v8, v30

    const/4 v12, 0x0

    goto/16 :goto_5

    :cond_f
    if-nez p4, :cond_10

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getIndex()I

    move-result v0

    iput v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemIndex:I

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset()I

    move-result v0

    iput v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemNotVisiblePartSize:I

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getIndex()I

    move-result v0

    iput v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemIndex:I

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset()I

    move-result v0

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getSizeWithSpacings()I

    move-result v1

    add-int/2addr v0, v1

    sub-int/2addr v0, v14

    goto :goto_c

    :cond_10
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getIndex()I

    move-result v0

    iput v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemIndex:I

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset()I

    move-result v0

    sub-int v0, v14, v0

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getSize()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemNotVisiblePartSize:I

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getIndex()I

    move-result v0

    iput v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemIndex:I

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset()I

    move-result v0

    neg-int v0, v0

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getSizeWithSpacings()I

    move-result v1

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getSize()I

    move-result v2

    sub-int/2addr v1, v2

    add-int/2addr v0, v1

    :goto_c
    iput v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemNotVisiblePartSize:I

    iget-object v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToItemInfoMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_d
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->positionedKeys:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroidx/compose/foundation/lazy/list/ItemInfo;

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getNotAnimatableDelta-nOcc-ac()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v3

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v3, v1}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v1

    invoke-virtual {v13, v1, v2}, Landroidx/compose/foundation/lazy/list/ItemInfo;->setNotAnimatableDelta--gyyYBs(J)V

    invoke-virtual/range {p6 .. p6}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->getKeyToIndexMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_e
    if-ge v3, v2, :cond_13

    add-int/lit8 v4, v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/list/PlaceableInfo;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->getTargetOffset-nOcc-ac()J

    move-result-wide v5

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getNotAnimatableDelta-nOcc-ac()J

    move-result-wide v7

    invoke-static {v5, v6}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v17

    invoke-static {v7, v8}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v18

    move-object/from16 p1, v1

    add-int v1, v17, v18

    invoke-static {v5, v6}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v5

    invoke-static {v7, v8}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {v1, v5}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v5

    invoke-direct {v9, v5, v6}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result v1

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->getSize()I

    move-result v3

    add-int/2addr v1, v3

    if-lez v1, :cond_11

    invoke-direct {v9, v5, v6}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-ge v1, v14, :cond_11

    const/4 v1, 0x1

    goto :goto_f

    :cond_11
    const/4 v1, 0x0

    :goto_f
    if-eqz v1, :cond_12

    const/4 v1, 0x1

    goto :goto_10

    :cond_12
    move-object/from16 v1, p1

    move v3, v4

    goto :goto_e

    :cond_13
    const/4 v1, 0x0

    :goto_10
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_11
    if-ge v4, v3, :cond_15

    add-int/lit8 v5, v4, 0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/list/PlaceableInfo;

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/list/PlaceableInfo;->getInProgress()Z

    move-result v4

    if-eqz v4, :cond_14

    const/4 v2, 0x1

    goto :goto_12

    :cond_14
    move v4, v5

    goto :goto_11

    :cond_15
    const/4 v2, 0x0

    :goto_12
    const/16 v17, 0x1

    xor-int/lit8 v2, v2, 0x1

    if-nez v1, :cond_16

    if-nez v2, :cond_19

    :cond_16
    if-eqz v0, :cond_19

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/list/ItemInfo;->getPlaceables()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_17

    goto :goto_13

    :cond_17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result v1

    invoke-virtual {v11, v1}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->getAndMeasure-oA9-DU0(I)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v0, p0

    move/from16 v3, v19

    move-wide v4, v15

    move/from16 v6, p4

    move v7, v14

    move-object/from16 p1, v8

    move v8, v14

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->calculateExpectedOffset-tGxSNXI(IIIJZII)I

    move-result v0

    if-eqz p4, :cond_18

    sub-int v0, v14, v0

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getSize()I

    move-result v1

    sub-int/2addr v0, v1

    :cond_18
    move-object/from16 v3, p1

    move/from16 v1, p2

    move/from16 v2, p3

    invoke-virtual {v3, v0, v1, v2}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->position(III)Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {v9, v0, v13}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->startAnimationsIfNeeded(Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;Landroidx/compose/foundation/lazy/list/ItemInfo;)V

    goto/16 :goto_d

    :cond_19
    :goto_13
    move/from16 v1, p2

    move/from16 v2, p3

    invoke-interface {v12}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_d

    :cond_1a
    move/from16 v1, p2

    move/from16 v2, p3

    goto/16 :goto_d

    :cond_1b
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->getKeyToIndexMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, v9, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToIndexMap:Ljava/util/Map;

    return-void
.end method

.method public final reset()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToItemInfoMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->keyToIndexMap:Ljava/util/Map;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemIndex:I

    const/4 v1, 0x0

    iput v1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportStartItemNotVisiblePartSize:I

    iput v0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemIndex:I

    iput v1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->viewportEndItemNotVisiblePartSize:I

    return-void
.end method
