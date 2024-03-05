.class public final Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B7\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ \u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0008\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;",
        "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
        "itemScope",
        "Landroidx/compose/ui/node/Ref;",
        "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;",
        "list",
        "Landroidx/compose/foundation/lazy/list/IntervalList;",
        "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;",
        "headerIndexes",
        "",
        "",
        "nearestItemsRange",
        "Lkotlin/ranges/IntRange;",
        "(Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/list/IntervalList;Ljava/util/List;Lkotlin/ranges/IntRange;)V",
        "getHeaderIndexes",
        "()Ljava/util/List;",
        "itemsCount",
        "getItemsCount",
        "()I",
        "keyToIndexMap",
        "",
        "",
        "getKeyToIndexMap",
        "()Ljava/util/Map;",
        "getContent",
        "Lkotlin/Function0;",
        "",
        "Landroidx/compose/runtime/Composable;",
        "index",
        "(I)Lkotlin/jvm/functions/Function2;",
        "getKey",
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
.field private final headerIndexes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final itemScope:Landroidx/compose/ui/node/Ref;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/node/Ref<",
            "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final keyToIndexMap:Ljava/util/Map;
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

.field private final list:Landroidx/compose/foundation/lazy/list/IntervalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/lazy/list/IntervalList<",
            "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/list/IntervalList;Ljava/util/List;Lkotlin/ranges/IntRange;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/node/Ref;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/list/IntervalList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/ranges/IntRange;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/node/Ref<",
            "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;",
            ">;",
            "Landroidx/compose/foundation/lazy/list/IntervalList<",
            "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/ranges/IntRange;",
            ")V"
        }
    .end annotation

    const-string v0, "itemScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerIndexes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nearestItemsRange"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->itemScope:Landroidx/compose/ui/node/Ref;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->list:Landroidx/compose/foundation/lazy/list/IntervalList;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->headerIndexes:Ljava/util/List;

    invoke-static {p4, p2}, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImplKt;->generateKeyToIndexMap(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/list/IntervalList;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->keyToIndexMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getContent(I)Lkotlin/jvm/functions/Function2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->list:Landroidx/compose/foundation/lazy/list/IntervalList;

    invoke-static {v0, p1}, Landroidx/compose/foundation/lazy/list/IntervalListKt;->intervalForIndex(Landroidx/compose/foundation/lazy/list/IntervalList;I)Landroidx/compose/foundation/lazy/list/IntervalHolder;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getStartIndex()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getContent()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;->getContent()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->itemScope:Landroidx/compose/ui/node/Ref;

    invoke-virtual {p0}, Landroidx/compose/ui/node/Ref;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function2;

    return-object p0
.end method

.method public getHeaderIndexes()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->headerIndexes:Ljava/util/List;

    return-object p0
.end method

.method public getItemsCount()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->list:Landroidx/compose/foundation/lazy/list/IntervalList;

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/list/IntervalList;->getTotalSize()I

    move-result p0

    return p0
.end method

.method public getKey(I)Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->list:Landroidx/compose/foundation/lazy/list/IntervalList;

    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/list/IntervalListKt;->intervalForIndex(Landroidx/compose/foundation/lazy/list/IntervalList;I)Landroidx/compose/foundation/lazy/list/IntervalHolder;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getStartIndex()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getContent()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;->getKey()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {p1}, Landroidx/compose/foundation/lazy/Lazy_androidKt;->getDefaultLazyKeyFor(I)Ljava/lang/Object;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public getKeyToIndexMap()Ljava/util/Map;
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

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;->keyToIndexMap:Ljava/util/Map;

    return-object p0
.end method
