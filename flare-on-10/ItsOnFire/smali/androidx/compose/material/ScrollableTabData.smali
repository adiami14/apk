.class final Landroidx/compose/material/ScrollableTabData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J*\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J,\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/material/ScrollableTabData;",
        "",
        "Landroidx/compose/material/TabPosition;",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "",
        "edgeOffset",
        "",
        "tabPositions",
        "calculateTabOffset",
        "selectedTab",
        "",
        "onLaidOut",
        "Landroidx/compose/foundation/ScrollState;",
        "scrollState",
        "Landroidx/compose/foundation/ScrollState;",
        "Lj/u0;",
        "coroutineScope",
        "Lj/u0;",
        "Ljava/lang/Integer;",
        "<init>",
        "(Landroidx/compose/foundation/ScrollState;Lj/u0;)V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final coroutineScope:Lj/u0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final scrollState:Landroidx/compose/foundation/ScrollState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private selectedTab:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/ScrollState;Lj/u0;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/ScrollState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lj/u0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "scrollState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material/ScrollableTabData;->scrollState:Landroidx/compose/foundation/ScrollState;

    iput-object p2, p0, Landroidx/compose/material/ScrollableTabData;->coroutineScope:Lj/u0;

    return-void
.end method

.method public static final synthetic access$getScrollState$p(Landroidx/compose/material/ScrollableTabData;)Landroidx/compose/foundation/ScrollState;
    .locals 0

    iget-object p0, p0, Landroidx/compose/material/ScrollableTabData;->scrollState:Landroidx/compose/foundation/ScrollState;

    return-object p0
.end method

.method private final calculateTabOffset(Landroidx/compose/material/TabPosition;Landroidx/compose/ui/unit/Density;ILjava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/TabPosition;",
            "Landroidx/compose/ui/unit/Density;",
            "I",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;)I"
        }
    .end annotation

    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/compose/material/TabPosition;

    invoke-virtual {p4}, Landroidx/compose/material/TabPosition;->getRight-D9Ej5fM()F

    move-result p4

    invoke-interface {p2, p4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result p4

    add-int/2addr p4, p3

    iget-object p0, p0, Landroidx/compose/material/ScrollableTabData;->scrollState:Landroidx/compose/foundation/ScrollState;

    invoke-virtual {p0}, Landroidx/compose/foundation/ScrollState;->getMaxValue()I

    move-result p0

    sub-int p0, p4, p0

    invoke-virtual {p1}, Landroidx/compose/material/TabPosition;->getLeft-D9Ej5fM()F

    move-result p3

    invoke-interface {p2, p3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result p3

    div-int/lit8 v0, p0, 0x2

    invoke-virtual {p1}, Landroidx/compose/material/TabPosition;->getWidth-D9Ej5fM()F

    move-result p1

    invoke-interface {p2, p1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    sub-int/2addr v0, p1

    sub-int/2addr p3, v0

    sub-int/2addr p4, p0

    const/4 p0, 0x0

    invoke-static {p4, p0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p1

    invoke-static {p3, p0, p1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final onLaidOut(Landroidx/compose/ui/unit/Density;ILjava/util/List;I)V
    .locals 6
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/unit/Density;",
            "I",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "density"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tabPositions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/material/ScrollableTabData;->selectedTab:Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, p4, :cond_2

    :goto_0
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/material/ScrollableTabData;->selectedTab:Ljava/lang/Integer;

    invoke-static {p3, p4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/compose/material/TabPosition;

    if-nez p4, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0, p4, p1, p2, p3}, Landroidx/compose/material/ScrollableTabData;->calculateTabOffset(Landroidx/compose/material/TabPosition;Landroidx/compose/ui/unit/Density;ILjava/util/List;)I

    move-result p1

    iget-object p2, p0, Landroidx/compose/material/ScrollableTabData;->scrollState:Landroidx/compose/foundation/ScrollState;

    invoke-virtual {p2}, Landroidx/compose/foundation/ScrollState;->getValue()I

    move-result p2

    if-eq p2, p1, :cond_2

    iget-object v0, p0, Landroidx/compose/material/ScrollableTabData;->coroutineScope:Lj/u0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Landroidx/compose/material/ScrollableTabData$onLaidOut$1$1;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p1, p2}, Landroidx/compose/material/ScrollableTabData$onLaidOut$1$1;-><init>(Landroidx/compose/material/ScrollableTabData;ILkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    :cond_2
    :goto_1
    return-void
.end method
