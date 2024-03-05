.class final Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;",
        "",
        "()V",
        "findLazyListIndexByKey",
        "Landroidx/compose/foundation/lazy/list/DataIndex;",
        "key",
        "lastKnownIndex",
        "itemsProvider",
        "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
        "findLazyListIndexByKey-M1M1bNc",
        "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/list/LazyListItemsProvider;)I",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$findLazyListIndexByKey-M1M1bNc(Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;Ljava/lang/Object;ILandroidx/compose/foundation/lazy/list/LazyListItemsProvider;)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;->findLazyListIndexByKey-M1M1bNc(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/list/LazyListItemsProvider;)I

    move-result p0

    return p0
.end method

.method private final findLazyListIndexByKey-M1M1bNc(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/list/LazyListItemsProvider;)I
    .locals 0

    if-nez p1, :cond_0

    return p2

    :cond_0
    invoke-interface {p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;->getItemsCount()I

    move-result p0

    if-ge p2, p0, :cond_1

    invoke-interface {p3, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;->getKey(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return p2

    :cond_1
    invoke-interface {p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;->getKeyToIndexMap()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result p0

    return p0

    :cond_2
    return p2
.end method
