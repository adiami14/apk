.class public final Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
.implements Landroidx/compose/ui/layout/MeasureResult;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0012J\t\u0010/\u001a\u000200H\u0096\u0001R\u001e\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0012\u0010 \u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u001fR\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0011\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0014\u0010\u0011\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001fR\u0014\u0010\u0010\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001fR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0012\u0010-\u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\u001f\u00a8\u00061"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;",
        "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "firstVisibleItem",
        "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;",
        "firstVisibleItemScrollOffset",
        "",
        "canScrollForward",
        "",
        "consumedScroll",
        "",
        "measureResult",
        "visibleItemsInfo",
        "",
        "Landroidx/compose/foundation/lazy/LazyListItemInfo;",
        "viewportStartOffset",
        "viewportEndOffset",
        "totalItemsCount",
        "(Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;III)V",
        "alignmentLines",
        "",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "getAlignmentLines",
        "()Ljava/util/Map;",
        "getCanScrollForward",
        "()Z",
        "getConsumedScroll",
        "()F",
        "getFirstVisibleItem",
        "()Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;",
        "getFirstVisibleItemScrollOffset",
        "()I",
        "height",
        "getHeight",
        "lazyLayoutMeasureResult",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;",
        "getLazyLayoutMeasureResult",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;",
        "getMeasureResult",
        "()Landroidx/compose/ui/layout/MeasureResult;",
        "getTotalItemsCount",
        "getViewportEndOffset",
        "getViewportStartOffset",
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
.field private final canScrollForward:Z

.field private final consumedScroll:F

.field private final firstVisibleItem:Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final firstVisibleItemScrollOffset:I

.field private final measureResult:Landroidx/compose/ui/layout/MeasureResult;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final totalItemsCount:I

.field private final viewportEndOffset:I

.field private final viewportStartOffset:I

.field private final visibleItemsInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListItemInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;III)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/layout/MeasureResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;",
            "IZF",
            "Landroidx/compose/ui/layout/MeasureResult;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/foundation/lazy/LazyListItemInfo;",
            ">;III)V"
        }
    .end annotation

    const-string v0, "measureResult"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibleItemsInfo"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->firstVisibleItem:Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    iput p2, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    iput-boolean p3, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->canScrollForward:Z

    iput p4, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->consumedScroll:F

    iput-object p5, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    iput-object p6, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->visibleItemsInfo:Ljava/util/List;

    iput p7, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->viewportStartOffset:I

    iput p8, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->viewportEndOffset:I

    iput p9, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->totalItemsCount:I

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

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getCanScrollForward()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->canScrollForward:Z

    return p0
.end method

.method public final getConsumedScroll()F
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->consumedScroll:F

    return p0
.end method

.method public final getFirstVisibleItem()Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->firstVisibleItem:Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    return-object p0
.end method

.method public final getFirstVisibleItemScrollOffset()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->firstVisibleItemScrollOffset:I

    return p0
.end method

.method public getHeight()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result p0

    return p0
.end method

.method public final getLazyLayoutMeasureResult()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult$lazyLayoutMeasureResult$1;-><init>(Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;)V

    return-object v0
.end method

.method public final getMeasureResult()Landroidx/compose/ui/layout/MeasureResult;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    return-object p0
.end method

.method public getTotalItemsCount()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->totalItemsCount:I

    return p0
.end method

.method public getViewportEndOffset()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->viewportEndOffset:I

    return p0
.end method

.method public getViewportStartOffset()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->viewportStartOffset:I

    return p0
.end method

.method public getVisibleItemsInfo()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListItemInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->visibleItemsInfo:Ljava/util/List;

    return-object p0
.end method

.method public getWidth()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result p0

    return p0
.end method

.method public placeChildren()V
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->measureResult:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->placeChildren()V

    return-void
.end method
