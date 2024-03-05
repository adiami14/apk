.class public final Landroidx/compose/foundation/lazy/LazyGridScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/LazyGridScope;


# annotations
.annotation runtime Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;,
        Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u0001:\u0002@AB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010#\u001a\u00020\u0003H\u0002J3\u0010$\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\u0002\u0008)\u0012\u0004\u0012\u00020\u00030&0%2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,J=\u0010-\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\u0002\u0008)\u0012\u0004\u0012\u00020\u00030&0%2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H\u0002J(\u0010.\u001a\r\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\u0002\u0008)2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H\u0002\u00a2\u0006\u0002\u0010/JI\u00100\u001a\u00020(2\u0019\u00101\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0018\u000102\u00a2\u0006\u0002\u0008\t2\u001c\u00103\u001a\u0018\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020(02\u00a2\u0006\u0002\u0008)\u00a2\u0006\u0002\u0008\tH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104Jl\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u00032\u001f\u00101\u001a\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0006\u00a2\u0006\u0002\u0008\t21\u00107\u001a-\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u00088\u0012\u0008\u00089\u0012\u0004\u0008\u0008(:\u0012\u0004\u0012\u00020(0\u0006\u00a2\u0006\u0002\u0008)\u00a2\u0006\u0002\u0008\tH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J(\u0010<\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0003H\u0002R(\u0010\u0005\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0002\u0008\tX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000ej\u0008\u0012\u0004\u0012\u00020\u0003`\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u000c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006B"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/LazyGridScopeImpl;",
        "Landroidx/compose/foundation/lazy/LazyGridScope;",
        "nColumns",
        "",
        "(I)V",
        "DefaultSpan",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;",
        "Landroidx/compose/foundation/lazy/GridItemSpan;",
        "Lkotlin/ExtensionFunctionType;",
        "bucketSize",
        "getBucketSize",
        "()I",
        "bucketStartItemIndex",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "cachedBucket",
        "",
        "cachedBucketIndex",
        "hasCustomSpans",
        "",
        "getHasCustomSpans$foundation_release",
        "()Z",
        "setHasCustomSpans$foundation_release",
        "(Z)V",
        "intervals",
        "Landroidx/compose/foundation/lazy/list/MutableIntervalList;",
        "Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;",
        "lastInterval",
        "Landroidx/compose/foundation/lazy/list/IntervalHolder;",
        "lastLineIndex",
        "lastLineStartItemIndex",
        "totalSize",
        "getTotalSize",
        "cachedIntervalForIndex",
        "itemIndex",
        "contentFor",
        "",
        "Lkotlin/Pair;",
        "Lkotlin/Function0;",
        "",
        "Landroidx/compose/runtime/Composable;",
        "lineIndex",
        "scope",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "contentForLineStartingWith",
        "contentOf",
        "(ILandroidx/compose/foundation/lazy/LazyItemScope;)Lkotlin/jvm/functions/Function2;",
        "item",
        "span",
        "Lkotlin/Function1;",
        "content",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V",
        "items",
        "count",
        "itemContent",
        "Lkotlin/ParameterName;",
        "name",
        "index",
        "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V",
        "spanOf",
        "row",
        "column",
        "maxSpan",
        "IntervalData",
        "LazyGridItemSpanScopeImpl",
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
.field private final DefaultSpan:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;",
            "Ljava/lang/Integer;",
            "Landroidx/compose/foundation/lazy/GridItemSpan;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final bucketStartItemIndex:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cachedBucket:Ljava/util/List;
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

.field private cachedBucketIndex:I

.field private hasCustomSpans:Z

.field private final intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/lazy/list/MutableIntervalList<",
            "Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lastInterval:Landroidx/compose/foundation/lazy/list/IntervalHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/lazy/list/IntervalHolder<",
            "Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastLineIndex:I

.field private lastLineStartItemIndex:I

.field private final nColumns:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->nColumns:I

    new-instance p1, Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->bucketStartItemIndex:Ljava/util/ArrayList;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedBucketIndex:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedBucket:Ljava/util/List;

    sget-object p1, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$DefaultSpan$1;->INSTANCE:Landroidx/compose/foundation/lazy/LazyGridScopeImpl$DefaultSpan$1;

    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->DefaultSpan:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method private final cachedIntervalForIndex(I)Landroidx/compose/foundation/lazy/list/IntervalHolder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/compose/foundation/lazy/list/IntervalHolder<",
            "Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->lastInterval:Landroidx/compose/foundation/lazy/list/IntervalHolder;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getStartIndex()I

    move-result v1

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getStartIndex()I

    move-result v2

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getSize()I

    move-result v3

    add-int/2addr v2, v3

    const/4 v3, 0x0

    if-ge p1, v2, :cond_0

    if-gt v1, p1, :cond_0

    const/4 v3, 0x1

    :cond_0
    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    invoke-static {v0, p1}, Landroidx/compose/foundation/lazy/list/IntervalListKt;->intervalForIndex(Landroidx/compose/foundation/lazy/list/IntervalList;I)Landroidx/compose/foundation/lazy/list/IntervalHolder;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->lastInterval:Landroidx/compose/foundation/lazy/list/IntervalHolder;

    :goto_0
    return-object v0
.end method

.method private final contentForLineStartingWith(IILandroidx/compose/foundation/lazy/LazyItemScope;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            ")",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->nColumns:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->nColumns:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getTotalSize()I

    move-result v2

    if-ge p1, v2, :cond_0

    iget v2, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->nColumns:I

    sub-int/2addr v2, v1

    invoke-direct {p0, p1, p2, v1, v2}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->spanOf(IIII)I

    move-result v2

    invoke-direct {p0, p1, p3}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->contentOf(ILandroidx/compose/foundation/lazy/LazyItemScope;)Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final contentOf(ILandroidx/compose/foundation/lazy/LazyItemScope;)Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            ")",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedIntervalForIndex(I)Landroidx/compose/foundation/lazy/list/IntervalHolder;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getContent()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;->getContent()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getStartIndex()I

    move-result p0

    sub-int/2addr p1, p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p2, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function2;

    return-object p0
.end method

.method private final getBucketSize()I
    .locals 4

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getTotalSize()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    iget p0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->nColumns:I

    int-to-double v2, p0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int p0, v0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private final spanOf(IIII)I
    .locals 1

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedIntervalForIndex(I)Landroidx/compose/foundation/lazy/list/IntervalHolder;

    move-result-object p0

    sget-object v0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->INSTANCE:Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;

    invoke-virtual {v0, p2}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->setItemRow(I)V

    invoke-virtual {v0, p3}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->setItemColumn(I)V

    invoke-virtual {v0, p4}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->setMaxCurrentLineSpan(I)V

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getContent()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;->getSpan()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/IntervalHolder;->getStartIndex()I

    move-result p0

    sub-int/2addr p1, p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/lazy/GridItemSpan;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/GridItemSpan;->unbox-impl()J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/GridItemSpan;->getCurrentLineSpan-impl(J)I

    move-result p0

    const/4 p1, 0x1

    invoke-static {p0, p1, p4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final contentFor(ILandroidx/compose/foundation/lazy/LazyItemScope;)Ljava/util/List;
    .locals 9
    .param p2    # Landroidx/compose/foundation/lazy/LazyItemScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            ")",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->hasCustomSpans:Z

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->nColumns:I

    mul-int/2addr v0, p1

    invoke-direct {p0, v0, p1, p2}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->contentForLineStartingWith(IILandroidx/compose/foundation/lazy/LazyItemScope;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getBucketSize()I

    move-result v0

    div-int v0, p1, v0

    iget-object v1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->bucketStartItemIndex:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getBucketSize()I

    move-result v3

    mul-int/2addr v1, v3

    iget-object v3, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->bucketStartItemIndex:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "bucketStartItemIndex[min\u2026StartItemIndex.size - 1)]"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget v4, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->lastLineIndex:I

    const/4 v5, 0x0

    if-gt v1, v4, :cond_1

    if-gt v4, p1, :cond_1

    move v6, v2

    goto :goto_0

    :cond_1
    move v6, v5

    :goto_0
    if-eqz v6, :cond_2

    iget v3, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->lastLineStartItemIndex:I

    move v1, v4

    goto :goto_1

    :cond_2
    iget v4, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedBucketIndex:I

    if-ne v0, v4, :cond_3

    sub-int v4, p1, v1

    iget-object v6, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedBucket:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_3

    iget-object v1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedBucket:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v3

    move v1, p1

    :cond_3
    :goto_1
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getBucketSize()I

    move-result v4

    rem-int v4, v1, v4

    if-nez v4, :cond_5

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getBucketSize()I

    move-result v4

    sub-int v6, p1, v1

    const/4 v7, 0x2

    if-gt v7, v6, :cond_4

    if-ge v6, v4, :cond_4

    move v4, v2

    goto :goto_2

    :cond_4
    move v4, v5

    :goto_2
    if-eqz v4, :cond_5

    move v4, v2

    goto :goto_3

    :cond_5
    move v4, v5

    :goto_3
    if-eqz v4, :cond_6

    iput v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedBucketIndex:I

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedBucket:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_6
    if-gt v1, p1, :cond_7

    move v0, v2

    goto :goto_4

    :cond_7
    move v0, v5

    :goto_4
    const-string v6, "Check failed."

    if-eqz v0, :cond_e

    :cond_8
    :goto_5
    if-ge v1, p1, :cond_d

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getTotalSize()I

    move-result v0

    if-ge v3, v0, :cond_d

    if-eqz v4, :cond_9

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->cachedBucket:Ljava/util/List;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    move v0, v5

    :goto_6
    iget v7, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->nColumns:I

    if-ge v0, v7, :cond_a

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getTotalSize()I

    move-result v7

    if-ge v3, v7, :cond_a

    add-int/lit8 v7, v3, 0x1

    iget v8, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->nColumns:I

    sub-int/2addr v8, v0

    invoke-direct {p0, v3, v1, v0, v8}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->spanOf(IIII)I

    move-result v3

    add-int/2addr v0, v3

    move v3, v7

    goto :goto_6

    :cond_a
    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getBucketSize()I

    move-result v0

    rem-int v0, v1, v0

    if-nez v0, :cond_8

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getBucketSize()I

    move-result v0

    div-int v0, v1, v0

    iget-object v7, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->bucketStartItemIndex:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v7, v0, :cond_b

    move v0, v2

    goto :goto_7

    :cond_b
    move v0, v5

    :goto_7
    if-eqz v0, :cond_c

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->bucketStartItemIndex:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    iput p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->lastLineIndex:I

    iput v3, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->lastLineStartItemIndex:I

    invoke-direct {p0, v3, p1, p2}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->contentForLineStartingWith(IILandroidx/compose/foundation/lazy/LazyItemScope;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final getHasCustomSpans$foundation_release()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->hasCustomSpans:Z

    return p0
.end method

.method public final getTotalSize()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->getTotalSize()I

    move-result p0

    return p0
.end method

.method public item(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V
    .locals 3
    .param p1    # Lkotlin/jvm/functions/Function1;
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
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;",
            "Landroidx/compose/foundation/lazy/GridItemSpan;",
            ">;",
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

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    new-instance v1, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$item$1;

    invoke-direct {v1, p2}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$item$1;-><init>(Lkotlin/jvm/functions/Function3;)V

    if-nez p1, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance p2, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$item$2$1;

    invoke-direct {p2, p1}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$item$2$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    :goto_0
    if-nez p2, :cond_1

    iget-object p2, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->DefaultSpan:Lkotlin/jvm/functions/Function2;

    :cond_1
    new-instance v2, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;

    invoke-direct {v2, v1, p2}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    const/4 p2, 0x1

    invoke-virtual {v0, p2, v2}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->add(ILjava/lang/Object;)V

    if-eqz p1, :cond_2

    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->hasCustomSpans:Z

    :cond_2
    return-void
.end method

.method public items(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V
    .locals 3
    .param p2    # Lkotlin/jvm/functions/Function2;
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
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/foundation/lazy/GridItemSpan;",
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

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->intervals:Landroidx/compose/foundation/lazy/list/MutableIntervalList;

    new-instance v1, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;

    new-instance v2, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$items$1;

    invoke-direct {v2, p3}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$items$1;-><init>(Lkotlin/jvm/functions/Function4;)V

    if-nez p2, :cond_0

    iget-object p3, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->DefaultSpan:Lkotlin/jvm/functions/Function2;

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    invoke-direct {v1, v2, p3}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, p1, v1}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->add(ILjava/lang/Object;)V

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->hasCustomSpans:Z

    :cond_1
    return-void
.end method

.method public final setHasCustomSpans$foundation_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->hasCustomSpans:Z

    return-void
.end method
