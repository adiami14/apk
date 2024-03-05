.class public final Landroidx/compose/foundation/lazy/list/IntervalListKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a*\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a&\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u00082\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a \u0010\n\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u00082\u0006\u0010\t\u001a\u00020\u0001H\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "findIndexOfHighestValueLesserThan",
        "",
        "T",
        "list",
        "",
        "Landroidx/compose/foundation/lazy/list/IntervalHolder;",
        "value",
        "intervalForIndex",
        "Landroidx/compose/foundation/lazy/list/IntervalList;",
        "index",
        "intervalIndexForItemIndex",
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
.method private static final findIndexOfHighestValueLesserThan(Ljava/util/List;I)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/IntervalHolder<",
            "TT;>;>;I)I"
        }
    .end annotation

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    if-ge v1, v0, :cond_3

    sub-int v2, v0, v1

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/list/IntervalHolder;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getStartIndex()I

    move-result v3

    if-ne v3, p1, :cond_1

    return v2

    :cond_1
    if-ge v3, p1, :cond_2

    add-int/lit8 v1, v2, 0x1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/list/IntervalHolder;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getStartIndex()I

    move-result v3

    if-ge p1, v3, :cond_0

    return v2

    :cond_2
    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static final intervalForIndex(Landroidx/compose/foundation/lazy/list/IntervalList;I)Landroidx/compose/foundation/lazy/list/IntervalHolder;
    .locals 1
    .param p0    # Landroidx/compose/foundation/lazy/list/IntervalList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/list/IntervalList<",
            "TT;>;I)",
            "Landroidx/compose/foundation/lazy/list/IntervalHolder<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/list/IntervalList;->getIntervals()Ljava/util/List;

    move-result-object v0

    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/list/IntervalListKt;->intervalIndexForItemIndex(Landroidx/compose/foundation/lazy/list/IntervalList;I)I

    move-result p0

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/lazy/list/IntervalHolder;

    return-object p0
.end method

.method public static final intervalIndexForItemIndex(Landroidx/compose/foundation/lazy/list/IntervalList;I)I
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/list/IntervalList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/list/IntervalList<",
            "TT;>;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_0

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/list/IntervalList;->getTotalSize()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/list/IntervalList;->getIntervals()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/list/IntervalListKt;->findIndexOfHighestValueLesserThan(Ljava/util/List;I)I

    move-result p0

    return p0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/list/IntervalList;->getTotalSize()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
