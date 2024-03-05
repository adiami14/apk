.class public final Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/LazyListScope;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J5\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016\u00a2\u0006\u0002\u0008\u0018\u00a2\u0006\u0002\u0008\u0019H\u0016\u00a2\u0006\u0002\u0010\u001aJm\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00052#\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\u001f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001621\u0010 \u001a-\u0012\u0004\u0012\u00020\u0017\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\u001f\u0012\u0004\u0012\u00020\u00120!\u00a2\u0006\u0002\u0008\u0018\u00a2\u0006\u0002\u0008\u0019H\u0016\u00a2\u0006\u0002\u0010\"J5\u0010#\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016\u00a2\u0006\u0002\u0008\u0018\u00a2\u0006\u0002\u0008\u0019H\u0017\u00a2\u0006\u0002\u0010\u001aR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "()V",
        "_headerIndexes",
        "",
        "",
        "_intervals",
        "Landroidx/compose/foundation/lazy/list/MutableIntervalList;",
        "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;",
        "headerIndexes",
        "",
        "getHeaderIndexes",
        "()Ljava/util/List;",
        "intervals",
        "Landroidx/compose/foundation/lazy/list/IntervalList;",
        "getIntervals",
        "()Landroidx/compose/foundation/lazy/list/IntervalList;",
        "item",
        "",
        "key",
        "",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V",
        "items",
        "count",
        "Lkotlin/ParameterName;",
        "name",
        "index",
        "itemContent",
        "Lkotlin/Function2;",
        "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V",
        "stickyHeader",
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
.field private _headerIndexes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final _intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/lazy/list/MutableIntervalList<",
            "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final intervals:Landroidx/compose/foundation/lazy/list/IntervalList;
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
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    invoke-direct {v0}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->_intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->intervals:Landroidx/compose/foundation/lazy/list/IntervalList;

    return-void
.end method


# virtual methods
.method public final getHeaderIndexes()Ljava/util/List;
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

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->_headerIndexes:Ljava/util/List;

    if-nez p0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public final getIntervals()Landroidx/compose/foundation/lazy/list/IntervalList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/foundation/lazy/list/IntervalList<",
            "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->intervals:Landroidx/compose/foundation/lazy/list/IntervalList;

    return-object p0
.end method

.method public item(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->_intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    new-instance v0, Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;

    if-eqz p1, :cond_0

    new-instance v1, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl$item$1;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl$item$1;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance p1, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl$item$2;

    invoke-direct {p1, p2}, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl$item$2;-><init>(Lkotlin/jvm/functions/Function3;)V

    invoke-direct {v0, v1, p1}, Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V
    .locals 2
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "itemContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->_intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    new-instance v0, Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;

    new-instance v1, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl$items$1;

    invoke-direct {v1, p3}, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl$items$1;-><init>(Lkotlin/jvm/functions/Function4;)V

    invoke-direct {v0, p2, v1}, Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p0, p1, v0}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public stickyHeader(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->_headerIndexes:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->_headerIndexes:Ljava/util/List;

    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->_intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->getTotalSize()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;->item(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method
