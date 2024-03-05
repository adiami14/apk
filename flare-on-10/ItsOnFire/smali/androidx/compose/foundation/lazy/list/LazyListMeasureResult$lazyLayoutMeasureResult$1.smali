.class public final Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;
.implements Landroidx/compose/ui/layout/MeasureResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getLazyLayoutMeasureResult()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0001R\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0012\u0010\t\u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "androidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "alignmentLines",
        "",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "",
        "getAlignmentLines",
        "()Ljava/util/Map;",
        "height",
        "getHeight",
        "()I",
        "visibleItemsInfo",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemInfo;",
        "getVisibleItemsInfo",
        "()Ljava/util/List;",
        "width",
        "getWidth",
        "placeChildren",
        "",
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
.field private final synthetic $$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

.field public final synthetic this$0:Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;->this$0:Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getMeasureResult()Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    return-void
.end method


# virtual methods
.method public getAlignmentLines()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public getHeight()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result p0

    return p0
.end method

.method public getVisibleItemsInfo()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;->this$0:Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    add-int/lit8 v3, v2, 0x1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    new-instance v4, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1$visibleItemsInfo$1$1;

    invoke-direct {v4, v2}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1$visibleItemsInfo$1$1;-><init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getWidth()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result p0

    return p0
.end method

.method public placeChildren()V
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->placeChildren()V

    return-void
.end method
