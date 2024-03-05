.class public final Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J#\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u0005J%\u0010\u001b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u0005J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t@BX\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000cR\u0011\u0010\u0013\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u000cR\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000cR\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;",
        "",
        "initialIndex",
        "",
        "initialScrollOffset",
        "(II)V",
        "hadFirstNotEmptyLayout",
        "",
        "<set-?>",
        "Landroidx/compose/foundation/lazy/list/DataIndex;",
        "index",
        "getIndex-AUyieIw",
        "()I",
        "I",
        "indexState",
        "Landroidx/compose/runtime/MutableState;",
        "lastKnownFirstItemKey",
        "observableIndex",
        "getObservableIndex",
        "observableScrollOffset",
        "getObservableScrollOffset",
        "scrollOffset",
        "getScrollOffset",
        "scrollOffsetState",
        "requestPosition",
        "",
        "requestPosition-NTjDD6g",
        "update",
        "update-NTjDD6g",
        "updateFromMeasureResult",
        "measureResult",
        "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;",
        "updateScrollPositionIfTheFirstItemWasMoved",
        "itemsProvider",
        "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
        "Companion",
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


# static fields
.field private static final Companion:Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private hadFirstNotEmptyLayout:Z

.field private index:I

.field private final indexState:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lastKnownFirstItemKey:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private scrollOffset:I

.field private final scrollOffsetState:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->Companion:Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v0, v0, v1, v2}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result p1

    iput p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->index:I

    iput p2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffset:I

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->getIndex-AUyieIw()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->indexState:Landroidx/compose/runtime/MutableState;

    iget p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffset:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffsetState:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;-><init>(II)V

    return-void
.end method

.method private final update-NTjDD6g(II)V
    .locals 2

    int-to-float v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->getIndex-AUyieIw()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/foundation/lazy/list/DataIndex;->equals-impl0(II)Z

    move-result v0

    if-nez v0, :cond_1

    iput p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->index:I

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->indexState:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    :cond_1
    iget p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffset:I

    if-eq p2, p1, :cond_2

    iput p2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffset:I

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffsetState:Landroidx/compose/runtime/MutableState;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Index should be non-negative ("

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getIndex-AUyieIw()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->index:I

    return p0
.end method

.method public final getObservableIndex()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->indexState:Landroidx/compose/runtime/MutableState;

    invoke-interface {p0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public final getObservableScrollOffset()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffsetState:Landroidx/compose/runtime/MutableState;

    invoke-interface {p0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public final getScrollOffset()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffset:I

    return p0
.end method

.method public final requestPosition-NTjDD6g(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->update-NTjDD6g(II)V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->lastKnownFirstItemKey:Ljava/lang/Object;

    return-void
.end method

.method public final updateFromMeasureResult(Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;)V
    .locals 4
    .param p1    # Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "measureResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getFirstVisibleItem()Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->lastKnownFirstItemKey:Ljava/lang/Object;

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->hadFirstNotEmptyLayout:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getTotalItemsCount()I

    move-result v0

    if-lez v0, :cond_4

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->hadFirstNotEmptyLayout:Z

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getFirstVisibleItemScrollOffset()I

    move-result v1

    int-to-float v2, v1

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    const/4 v3, 0x0

    if-ltz v2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getFirstVisibleItem()Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getIndex()I

    move-result v3

    :goto_2
    invoke-static {v3}, Landroidx/compose/foundation/lazy/list/DataIndex;->constructor-impl(I)I

    move-result p1

    invoke-direct {p0, p1, v1}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->update-NTjDD6g(II)V

    :cond_4
    return-void

    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "scrollOffset should be non-negative ("

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final updateScrollPositionIfTheFirstItemWasMoved(Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;)V
    .locals 3
    .param p1    # Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "itemsProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->Companion:Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->lastKnownFirstItemKey:Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->getIndex-AUyieIw()I

    move-result v2

    invoke-static {v0, v1, v2, p1}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;->access$findLazyListIndexByKey-M1M1bNc(Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;Ljava/lang/Object;ILandroidx/compose/foundation/lazy/list/LazyListItemsProvider;)I

    move-result p1

    iget v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->scrollOffset:I

    invoke-direct {p0, p1, v0}, Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;->update-NTjDD6g(II)V

    return-void
.end method
