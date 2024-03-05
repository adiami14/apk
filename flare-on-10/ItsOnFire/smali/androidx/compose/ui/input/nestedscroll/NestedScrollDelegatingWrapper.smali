.class public final Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;
.super Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper<",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010\u000b\u001a\u00020\u00032\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002J\u0008\u0010\u000c\u001a\u00020\u0003H\u0016J\u0008\u0010\r\u001a\u00020\u0003H\u0016J\u0008\u0010\u000e\u001a\u00020\u0003H\u0016J\u0008\u0010\u000f\u001a\u00020\u0000H\u0016J\u0008\u0010\u0010\u001a\u00020\u0000H\u0016R(\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR4\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R$\u0010(\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\u00a8\u0006."
    }
    d2 = {
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;",
        "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;",
        "",
        "refreshSelfIfNeeded",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "newParent",
        "refreshChildrenWithParentConnection",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "Landroidx/compose/ui/node/LayoutNode;",
        "children",
        "loopChildrenForNestedScroll",
        "onModifierChanged",
        "attach",
        "detach",
        "findPreviousNestedScrollWrapper",
        "findNextNestedScrollWrapper",
        "value",
        "parentConnection",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "setParentConnection",
        "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V",
        "lastModifier",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;",
        "Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;",
        "childScrollConnection",
        "Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;",
        "nestedScrollChildrenResult",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "Lkotlin/Function0;",
        "Lj/u0;",
        "getCoroutineScopeEvaluation",
        "()Lkotlin/jvm/functions/Function0;",
        "setCoroutineScopeEvaluation",
        "(Lkotlin/jvm/functions/Function0;)V",
        "coroutineScopeEvaluation",
        "getModifier",
        "()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;",
        "setModifier",
        "(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V",
        "modifier",
        "Landroidx/compose/ui/node/LayoutNodeWrapper;",
        "wrapped",
        "nestedScrollModifier",
        "<init>",
        "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final childScrollConnection:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lastModifier:Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final nestedScrollChildrenResult:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private parentConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/node/LayoutNodeWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "wrapped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nestedScrollModifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier$Element;)V

    new-instance p1, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->parentConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapperKt;->access$getNoOpConnection$p()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v0

    :cond_0
    invoke-interface {p2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getConnection()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;-><init>(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->childScrollConnection:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;

    const/16 p1, 0x10

    new-instance p2, Landroidx/compose/runtime/collection/MutableVector;

    new-array p1, p1, [Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    iput-object p2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->nestedScrollChildrenResult:Landroidx/compose/runtime/collection/MutableVector;

    return-void
.end method

.method public static final synthetic access$getCoroutineScopeEvaluation(Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;)Lkotlin/jvm/functions/Function0;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getCoroutineScopeEvaluation()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    return-object p0
.end method

.method private final getCoroutineScopeEvaluation()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lj/u0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object p0

    invoke-interface {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getDispatcher()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->getCalculateNestedScrollScope$ui_release()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    return-object p0
.end method

.method private final loopChildrenForNestedScroll(Landroidx/compose/runtime/collection/MutableVector;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getOuterLayoutNodeWrapper$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findNextNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->nestedScrollChildrenResult:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->get_children$ui_release()Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v2

    invoke-direct {p0, v2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->loopChildrenForNestedScroll(Landroidx/compose/runtime/collection/MutableVector;)V

    :goto_0
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_2
    return-void
.end method

.method private final refreshChildrenWithParentConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->nestedScrollChildrenResult:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findNextNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->nestedScrollChildrenResult:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getLayoutNode$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->get_children$ui_release()Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->loopChildrenForNestedScroll(Landroidx/compose/runtime/collection/MutableVector;)V

    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->nestedScrollChildrenResult:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->nestedScrollChildrenResult:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    move-result-object v0

    aget-object v0, v0, v1

    check-cast v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->nestedScrollChildrenResult:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v3

    if-lez v3, :cond_4

    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    move-result-object v2

    :cond_2
    aget-object v4, v2, v1

    check-cast v4, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    invoke-direct {v4, p1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->setParentConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    if-eqz p1, :cond_3

    new-instance v5, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper$refreshChildrenWithParentConnection$1$1;

    invoke-direct {v5, p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper$refreshChildrenWithParentConnection$1$1;-><init>(Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;)V

    goto :goto_2

    :cond_3
    new-instance v5, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper$refreshChildrenWithParentConnection$1$2;

    invoke-direct {v5, v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper$refreshChildrenWithParentConnection$1$2;-><init>(Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;)V

    :goto_2
    invoke-direct {v4, v5}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->setCoroutineScopeEvaluation(Lkotlin/jvm/functions/Function0;)V

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v3, :cond_2

    :cond_4
    return-void
.end method

.method private final refreshSelfIfNeeded()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->lastModifier:Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getConnection()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getConnection()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v2

    if-ne v1, v2, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getDispatcher()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getDispatcher()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    move-result-object v1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->isAttached()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-super {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->findPreviousNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    move-object v2, v1

    goto :goto_2

    :cond_2
    iget-object v2, v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->childScrollConnection:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;

    :goto_2
    invoke-direct {p0, v2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->setParentConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-direct {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getCoroutineScopeEvaluation()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    :goto_3
    if-nez v1, :cond_4

    invoke-direct {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getCoroutineScopeEvaluation()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    :cond_4
    invoke-direct {p0, v1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->setCoroutineScopeEvaluation(Lkotlin/jvm/functions/Function0;)V

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->childScrollConnection:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;

    invoke-direct {p0, v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->refreshChildrenWithParentConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->lastModifier:Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    :cond_5
    return-void
.end method

.method private final setCoroutineScopeEvaluation(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lj/u0;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object p0

    invoke-interface {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getDispatcher()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->setCalculateNestedScrollScope$ui_release(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private final setParentConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getDispatcher()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->setParent$ui_release(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->childScrollConnection:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;

    if-nez p1, :cond_0

    invoke-static {}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapperKt;->access$getNoOpConnection$p()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;->setParent(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->parentConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    return-void
.end method


# virtual methods
.method public attach()V
    .locals 0

    invoke-super {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->attach()V

    invoke-direct {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->refreshSelfIfNeeded()V

    return-void
.end method

.method public detach()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->detach()V

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->parentConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    invoke-direct {p0, v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->refreshChildrenWithParentConnection(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->lastModifier:Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    return-void
.end method

.method public findNextNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public findPreviousNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public bridge synthetic getModifier()Landroidx/compose/ui/Modifier$Element;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object p0

    return-object p0
.end method

.method public getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-super {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getModifier()Landroidx/compose/ui/Modifier$Element;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    return-object p0
.end method

.method public onModifierChanged()V
    .locals 2

    invoke-super {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->onModifierChanged()V

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->childScrollConnection:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getConnection()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;->setSelf(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->getModifier()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;->getDispatcher()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->parentConnection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->setParent$ui_release(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V

    invoke-direct {p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->refreshSelfIfNeeded()V

    return-void
.end method

.method public bridge synthetic setModifier(Landroidx/compose/ui/Modifier$Element;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->setModifier(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V

    return-void
.end method

.method public setModifier(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getModifier()Landroidx/compose/ui/Modifier$Element;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    iput-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;->lastModifier:Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    invoke-super {p0, p1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setModifier(Landroidx/compose/ui/Modifier$Element;)V

    return-void
.end method
