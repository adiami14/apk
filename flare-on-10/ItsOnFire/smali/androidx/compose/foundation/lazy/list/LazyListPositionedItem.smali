.class public final Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/LazyListItemInfo;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001Bf\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010*2\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000J\u000e\u0010\'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200R\u0011\u0010\u0015\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0019R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0019R\u0019\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010!R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0018\u0010%\u001a\u00020\u0003*\u00020&8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00061"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;",
        "Landroidx/compose/foundation/lazy/LazyListItemInfo;",
        "offset",
        "",
        "index",
        "key",
        "",
        "size",
        "sizeWithSpacings",
        "minMainAxisOffset",
        "maxMainAxisOffset",
        "isVertical",
        "",
        "wrappers",
        "",
        "Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;",
        "placementAnimator",
        "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
        "visualOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "(IILjava/lang/Object;IIIIZLjava/util/List;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "hasAnimations",
        "getHasAnimations",
        "()Z",
        "getIndex",
        "()I",
        "getKey",
        "()Ljava/lang/Object;",
        "getOffset",
        "placeablesCount",
        "getPlaceablesCount",
        "getSize",
        "getSizeWithSpacings",
        "J",
        "mainAxis",
        "getMainAxis--gyyYBs",
        "(J)I",
        "mainAxisSize",
        "Landroidx/compose/ui/layout/Placeable;",
        "getMainAxisSize",
        "(Landroidx/compose/ui/layout/Placeable;)I",
        "getAnimationSpec",
        "Landroidx/compose/animation/core/FiniteAnimationSpec;",
        "getOffset-Bjo55l4",
        "(I)J",
        "place",
        "",
        "scope",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
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
.field private final hasAnimations:Z

.field private final index:I

.field private final isVertical:Z

.field private final key:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final maxMainAxisOffset:I

.field private final minMainAxisOffset:I

.field private final offset:I

.field private final placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final size:I

.field private final sizeWithSpacings:I

.field private final visualOffset:J

.field private final wrappers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(IILjava/lang/Object;IIIIZLjava/util/List;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Object;",
            "IIIIZ",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;",
            ">;",
            "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->offset:I

    iput p2, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->index:I

    iput-object p3, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->key:Ljava/lang/Object;

    iput p4, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->size:I

    iput p5, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->sizeWithSpacings:I

    iput p6, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->minMainAxisOffset:I

    iput p7, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->maxMainAxisOffset:I

    iput-boolean p8, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->isVertical:Z

    iput-object p9, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->wrappers:Ljava/util/List;

    iput-object p10, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    iput-wide p11, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->visualOffset:J

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getPlaceablesCount()I

    move-result p1

    const/4 p2, 0x0

    move p3, p2

    :goto_0
    if-ge p3, p1, :cond_1

    add-int/lit8 p4, p3, 0x1

    invoke-virtual {p0, p3}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getAnimationSpec(I)Landroidx/compose/animation/core/FiniteAnimationSpec;

    move-result-object p3

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    goto :goto_1

    :cond_0
    move p3, p4

    goto :goto_0

    :cond_1
    :goto_1
    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->hasAnimations:Z

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Object;IIIIZLjava/util/List;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p12}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;-><init>(IILjava/lang/Object;IIIIZLjava/util/List;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;J)V

    return-void
.end method

.method private final getMainAxis--gyyYBs(J)I
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->isVertical:Z

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

.method private final getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->isVertical:Z

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p0

    :goto_0
    return p0
.end method


# virtual methods
.method public final getAnimationSpec(I)Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->wrappers:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;->getParentData()Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Landroidx/compose/animation/core/FiniteAnimationSpec;

    if-eqz p1, :cond_0

    check-cast p0, Landroidx/compose/animation/core/FiniteAnimationSpec;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public final getHasAnimations()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->hasAnimations:Z

    return p0
.end method

.method public getIndex()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->index:I

    return p0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->key:Ljava/lang/Object;

    return-object p0
.end method

.method public final getMainAxisSize(I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->wrappers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;->getPlaceable()Landroidx/compose/ui/layout/Placeable;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result p0

    return p0
.end method

.method public getOffset()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->offset:I

    return p0
.end method

.method public final getOffset-Bjo55l4(I)J
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->wrappers:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;->getOffset-nOcc-ac()J

    move-result-wide p0

    return-wide p0
.end method

.method public final getPlaceablesCount()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->wrappers:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public getSize()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->size:I

    return p0
.end method

.method public final getSizeWithSpacings()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->sizeWithSpacings:I

    return p0
.end method

.method public final place(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 13
    .param p1    # Landroidx/compose/ui/layout/Placeable$PlacementScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getPlaceablesCount()I

    move-result v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    move v4, v1

    if-ge v4, v0, :cond_3

    add-int/lit8 v1, v4, 0x1

    iget-object v2, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->wrappers:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;->getPlaceable()Landroidx/compose/ui/layout/Placeable;

    move-result-object v9

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->minMainAxisOffset:I

    invoke-direct {p0, v9}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    sub-int v10, v2, v3

    iget v11, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->maxMainAxisOffset:I

    invoke-virtual {p0, v4}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getAnimationSpec(I)Landroidx/compose/animation/core/FiniteAnimationSpec;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->placementAnimator:Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v4}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset-Bjo55l4(I)J

    move-result-wide v7

    move v5, v10

    move v6, v11

    invoke-virtual/range {v2 .. v8}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;->getAnimatedOffset-YT5a7pE(Ljava/lang/Object;IIIJ)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v4}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getOffset-Bjo55l4(I)J

    move-result-wide v2

    :goto_1
    invoke-direct {p0, v2, v3}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getMainAxis--gyyYBs(J)I

    move-result v4

    if-le v4, v10, :cond_0

    invoke-direct {p0, v2, v3}, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->getMainAxis--gyyYBs(J)I

    move-result v4

    if-ge v4, v11, :cond_0

    iget-boolean v4, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->isVertical:Z

    if-eqz v4, :cond_2

    iget-wide v4, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->visualOffset:J

    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v6

    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v2

    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v6, v2}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v7

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v5, p1

    move-object v6, v9

    move v9, v2

    invoke-static/range {v5 .. v12}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-wide v4, p0, Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;->visualOffset:J

    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v6

    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v2

    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v6, v2}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide v7

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v5, p1

    move-object v6, v9

    move v9, v2

    invoke-static/range {v5 .. v12}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelativeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_3
    return-void
.end method
