.class public final Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1$visibleItemsInfo$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/LazyLayoutItemInfo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;->getVisibleItemsInfo()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "androidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1$visibleItemsInfo$1$1",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemInfo;",
        "index",
        "",
        "getIndex",
        "()I",
        "key",
        "",
        "getKey",
        "()Ljava/lang/Object;",
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
.field public final synthetic $it:Landroidx/compose/foundation/lazy/LazyListItemInfo;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1$visibleItemsInfo$1$1;->$it:Landroidx/compose/foundation/lazy/LazyListItemInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getIndex()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1$visibleItemsInfo$1$1;->$it:Landroidx/compose/foundation/lazy/LazyListItemInfo;

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    move-result p0

    return p0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1$visibleItemsInfo$1$1;->$it:Landroidx/compose/foundation/lazy/LazyListItemInfo;

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getKey()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
