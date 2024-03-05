.class public final Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000cJ\u001b\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\r\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;",
        "",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "isVertical",
        "",
        "itemsProvider",
        "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
        "placeablesProvider",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;",
        "measuredItemFactory",
        "Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;",
        "(JZLandroidx/compose/foundation/lazy/list/LazyListItemsProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "childConstraints",
        "getChildConstraints-msEJaDk",
        "()J",
        "J",
        "keyToIndexMap",
        "",
        "",
        "getKeyToIndexMap",
        "()Ljava/util/Map;",
        "getAndMeasure",
        "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;",
        "index",
        "Landroidx/compose/foundation/lazy/list/DataIndex;",
        "getAndMeasure-oA9-DU0",
        "(I)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;",
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
.field private final childConstraints:J

.field private final itemsProvider:Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final measuredItemFactory:Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final placeablesProvider:Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(JZLandroidx/compose/foundation/lazy/list/LazyListItemsProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->itemsProvider:Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;

    iput-object p5, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->placeablesProvider:Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;

    iput-object p6, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->measuredItemFactory:Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;

    const p4, 0x7fffffff

    if-eqz p3, :cond_0

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result p5

    move v1, p5

    goto :goto_0

    :cond_0
    move v1, p4

    :goto_0
    const/4 v2, 0x0

    if-nez p3, :cond_1

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result p4

    :cond_1
    move v3, p4

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v0, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->childConstraints:J

    return-void
.end method

.method public synthetic constructor <init>(JZLandroidx/compose/foundation/lazy/list/LazyListItemsProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;-><init>(JZLandroidx/compose/foundation/lazy/list/LazyListItemsProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;)V

    return-void
.end method


# virtual methods
.method public final getAndMeasure-oA9-DU0(I)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->itemsProvider:Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;

    invoke-interface {v0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;->getKey(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->placeablesProvider:Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->getChildConstraints-msEJaDk()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;->getAndMeasure-0kLqBqw(IJ)[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;

    move-result-object v1

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->measuredItemFactory:Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;

    invoke-interface {p0, p1, v0, v1}, Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;->createItem-8xJyyfI(ILjava/lang/Object;[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move-result-object p0

    return-object p0
.end method

.method public final getChildConstraints-msEJaDk()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->childConstraints:J

    return-wide v0
.end method

.method public final getKeyToIndexMap()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;->itemsProvider:Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;->getKeyToIndexMap()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method
