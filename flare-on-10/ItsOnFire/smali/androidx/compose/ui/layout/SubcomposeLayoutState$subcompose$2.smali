.class final Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/SubcomposeLayoutState;->subcompose(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $node:Landroidx/compose/ui/node/LayoutNode;

.field public final synthetic $nodeState:Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;

.field public final synthetic this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;Landroidx/compose/ui/node/LayoutNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    iput-object p2, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2;->$nodeState:Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;

    iput-object p3, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2;->$node:Landroidx/compose/ui/node/LayoutNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 9

    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    iget-object v1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2;->$nodeState:Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;

    iget-object p0, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2;->$node:Landroidx/compose/ui/node/LayoutNode;

    invoke-static {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getRoot(Landroidx/compose/ui/layout/SubcomposeLayoutState;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    invoke-virtual {v1}, Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;->getContent()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-virtual {v1}, Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;->getComposition()Landroidx/compose/runtime/Composition;

    move-result-object v5

    invoke-virtual {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->getCompositionContext$ui_release()Landroidx/compose/runtime/CompositionContext;

    move-result-object v6

    if-eqz v6, :cond_0

    const v7, -0x3abe24c7

    new-instance v8, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2$1$1;

    invoke-direct {v8, v4}, Landroidx/compose/ui/layout/SubcomposeLayoutState$subcompose$2$1$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v7, v3, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    invoke-static {v0, v5, p0, v6, v3}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$subcomposeInto(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/runtime/Composition;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;->setComposition(Landroidx/compose/runtime/Composition;)V

    const/4 p0, 0x0

    invoke-static {v2, p0}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "parent composition reference not set"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
