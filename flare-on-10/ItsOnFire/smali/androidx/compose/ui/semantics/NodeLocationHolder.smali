.class public final Landroidx/compose/ui/semantics/NodeLocationHolder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;,
        Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Landroidx/compose/ui/semantics/NodeLocationHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0010\u0011B\u0017\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/semantics/NodeLocationHolder;",
        "",
        "subtreeRoot",
        "Landroidx/compose/ui/node/LayoutNode;",
        "node",
        "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "location",
        "Landroidx/compose/ui/geometry/Rect;",
        "getNode$ui_release",
        "()Landroidx/compose/ui/node/LayoutNode;",
        "getSubtreeRoot$ui_release",
        "compareTo",
        "",
        "other",
        "Companion",
        "ComparisonStrategy",
        "ui_release"
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
.field public static final Companion:Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static comparisonStrategy:Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final location:Landroidx/compose/ui/geometry/Rect;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final node:Landroidx/compose/ui/node/LayoutNode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final subtreeRoot:Landroidx/compose/ui/node/LayoutNode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/semantics/NodeLocationHolder;->Companion:Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;

    sget-object v0, Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;->Stripe:Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;

    sput-object v0, Landroidx/compose/ui/semantics/NodeLocationHolder;->comparisonStrategy:Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V
    .locals 3
    .param p1    # Landroidx/compose/ui/node/LayoutNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/node/LayoutNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "subtreeRoot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "node"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->subtreeRoot:Landroidx/compose/ui/node/LayoutNode;

    iput-object p2, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->node:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getInnerLayoutNodeWrapper$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p1

    invoke-static {p2}, Landroidx/compose/ui/semantics/SemanticsSortKt;->findWrapperToGetBounds(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->isAttached()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->isAttached()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p1, p2, v0, v2, v1}, Landroidx/compose/ui/layout/LayoutCoordinates$DefaultImpls;->localBoundingBoxOf$default(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;ZILjava/lang/Object;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    :cond_0
    iput-object v1, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    return-void
.end method

.method public static final synthetic access$getComparisonStrategy$cp()Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;
    .locals 1

    sget-object v0, Landroidx/compose/ui/semantics/NodeLocationHolder;->comparisonStrategy:Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;

    return-object v0
.end method

.method public static final synthetic access$setComparisonStrategy$cp(Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->comparisonStrategy:Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;

    return-void
.end method


# virtual methods
.method public compareTo(Landroidx/compose/ui/semantics/NodeLocationHolder;)I
    .locals 6
    .param p1    # Landroidx/compose/ui/semantics/NodeLocationHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    const/4 v3, -0x1

    if-nez v2, :cond_1

    return v3

    :cond_1
    sget-object v2, Landroidx/compose/ui/semantics/NodeLocationHolder;->comparisonStrategy:Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;

    sget-object v4, Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;->Stripe:Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;

    const/4 v5, 0x0

    if-ne v2, v4, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v0

    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v2

    sub-float/2addr v0, v2

    cmpg-float v0, v0, v5

    if-gtz v0, :cond_2

    return v3

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v0

    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v2

    sub-float/2addr v0, v2

    cmpl-float v0, v0, v5

    if-ltz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    sget-object v2, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    const/4 v4, 0x0

    if-ne v0, v2, :cond_6

    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v0

    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v2

    sub-float/2addr v0, v2

    cmpg-float v0, v0, v5

    if-nez v0, :cond_4

    move v2, v1

    goto :goto_0

    :cond_4
    move v2, v4

    :goto_0
    if-nez v2, :cond_9

    if-gez v0, :cond_5

    move v1, v3

    :cond_5
    return v1

    :cond_6
    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v0

    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v2

    sub-float/2addr v0, v2

    cmpg-float v0, v0, v5

    if-nez v0, :cond_7

    move v2, v1

    goto :goto_1

    :cond_7
    move v2, v4

    :goto_1
    if-nez v2, :cond_9

    if-gez v0, :cond_8

    goto :goto_2

    :cond_8
    move v1, v3

    :goto_2
    return v1

    :cond_9
    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v0

    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v2

    sub-float/2addr v0, v2

    cmpg-float v0, v0, v5

    if-nez v0, :cond_a

    move v2, v1

    goto :goto_3

    :cond_a
    move v2, v4

    :goto_3
    if-nez v2, :cond_c

    if-gez v0, :cond_b

    move v1, v3

    :cond_b
    return v1

    :cond_c
    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getHeight()F

    move-result v0

    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getHeight()F

    move-result v2

    sub-float/2addr v0, v2

    cmpg-float v0, v0, v5

    if-nez v0, :cond_d

    move v2, v1

    goto :goto_4

    :cond_d
    move v2, v4

    :goto_4
    if-nez v2, :cond_f

    if-gez v0, :cond_e

    goto :goto_5

    :cond_e
    move v1, v3

    :goto_5
    return v1

    :cond_f
    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    move-result v0

    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->location:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    move-result v2

    sub-float/2addr v0, v2

    cmpg-float v0, v0, v5

    if-nez v0, :cond_10

    move v4, v1

    :cond_10
    if-nez v4, :cond_12

    if-gez v0, :cond_11

    goto :goto_6

    :cond_11
    move v1, v3

    :goto_6
    return v1

    :cond_12
    iget-object v0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->node:Landroidx/compose/ui/node/LayoutNode;

    invoke-static {v0}, Landroidx/compose/ui/semantics/SemanticsSortKt;->findWrapperToGetBounds(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->boundsInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    iget-object v2, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->node:Landroidx/compose/ui/node/LayoutNode;

    invoke-static {v2}, Landroidx/compose/ui/semantics/SemanticsSortKt;->findWrapperToGetBounds(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->boundsInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    iget-object v4, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->node:Landroidx/compose/ui/node/LayoutNode;

    new-instance v5, Landroidx/compose/ui/semantics/NodeLocationHolder$compareTo$child1$1;

    invoke-direct {v5, v0}, Landroidx/compose/ui/semantics/NodeLocationHolder$compareTo$child1$1;-><init>(Landroidx/compose/ui/geometry/Rect;)V

    invoke-static {v4, v5}, Landroidx/compose/ui/semantics/SemanticsSortKt;->findNodeByPredicateTraversal(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    iget-object v4, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->node:Landroidx/compose/ui/node/LayoutNode;

    new-instance v5, Landroidx/compose/ui/semantics/NodeLocationHolder$compareTo$child2$1;

    invoke-direct {v5, v2}, Landroidx/compose/ui/semantics/NodeLocationHolder$compareTo$child2$1;-><init>(Landroidx/compose/ui/geometry/Rect;)V

    invoke-static {v4, v5}, Landroidx/compose/ui/semantics/SemanticsSortKt;->findNodeByPredicateTraversal(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v2

    if-eqz v0, :cond_13

    if-eqz v2, :cond_13

    new-instance v1, Landroidx/compose/ui/semantics/NodeLocationHolder;

    iget-object p0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->subtreeRoot:Landroidx/compose/ui/node/LayoutNode;

    invoke-direct {v1, p0, v0}, Landroidx/compose/ui/semantics/NodeLocationHolder;-><init>(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V

    new-instance p0, Landroidx/compose/ui/semantics/NodeLocationHolder;

    iget-object p1, p1, Landroidx/compose/ui/semantics/NodeLocationHolder;->subtreeRoot:Landroidx/compose/ui/node/LayoutNode;

    invoke-direct {p0, p1, v2}, Landroidx/compose/ui/semantics/NodeLocationHolder;-><init>(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V

    invoke-virtual {v1, p0}, Landroidx/compose/ui/semantics/NodeLocationHolder;->compareTo(Landroidx/compose/ui/semantics/NodeLocationHolder;)I

    move-result p0

    return p0

    :cond_13
    if-eqz v0, :cond_14

    return v1

    :cond_14
    return v3
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/compose/ui/semantics/NodeLocationHolder;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/semantics/NodeLocationHolder;->compareTo(Landroidx/compose/ui/semantics/NodeLocationHolder;)I

    move-result p0

    return p0
.end method

.method public final getNode$ui_release()Landroidx/compose/ui/node/LayoutNode;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->node:Landroidx/compose/ui/node/LayoutNode;

    return-object p0
.end method

.method public final getSubtreeRoot$ui_release()Landroidx/compose/ui/node/LayoutNode;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/semantics/NodeLocationHolder;->subtreeRoot:Landroidx/compose/ui/node/LayoutNode;

    return-object p0
.end method
