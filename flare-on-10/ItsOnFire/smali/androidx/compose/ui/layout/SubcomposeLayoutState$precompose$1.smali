.class public final Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/SubcomposeLayoutState;->precompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "androidx/compose/ui/layout/SubcomposeLayoutState$precompose$1",
        "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;",
        "dispose",
        "",
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


# instance fields
.field public final synthetic $slotId:Ljava/lang/Object;

.field public final synthetic this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/SubcomposeLayoutState;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    iput-object p2, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->$slotId:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getPrecomposeMap$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->$slotId:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    if-eqz v0, :cond_5

    iget-object v1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v1}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getRoot(Landroidx/compose/ui/layout/SubcomposeLayoutState;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    const-string v6, "Check failed."

    if-eqz v5, :cond_4

    iget-object v5, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v5}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getReusableCount$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;)I

    move-result v5

    iget-object v7, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v7}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getMaxSlotsToRetainForReuse$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;)I

    move-result v7

    if-ge v5, v7, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getRoot(Landroidx/compose/ui/layout/SubcomposeLayoutState;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v5, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v5}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getPrecomposedCount$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;)I

    move-result v5

    sub-int/2addr v0, v5

    iget-object v5, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v5}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getReusableCount$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;)I

    move-result v5

    sub-int/2addr v0, v5

    iget-object v5, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v5, v1, v0, v4}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$move(Landroidx/compose/ui/layout/SubcomposeLayoutState;III)V

    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getReusableCount$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;)I

    move-result v1

    add-int/2addr v1, v4

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$setReusableCount$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;I)V

    goto :goto_1

    :cond_1
    iget-object v5, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v5}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getRoot(Landroidx/compose/ui/layout/SubcomposeLayoutState;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v7

    invoke-static {v7, v4}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    invoke-static {v5, v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$disposeNode(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/node/LayoutNode;)V

    invoke-static {v5}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getRoot(Landroidx/compose/ui/layout/SubcomposeLayoutState;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    invoke-virtual {v0, v1, v4}, Landroidx/compose/ui/node/LayoutNode;->removeAt$ui_release(II)V

    invoke-static {v7, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    :goto_1
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getPrecomposedCount$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;)I

    move-result v0

    if-lez v0, :cond_2

    move v3, v4

    :cond_2
    if-eqz v3, :cond_3

    iget-object p0, p0, Landroidx/compose/ui/layout/SubcomposeLayoutState$precompose$1;->this$0:Landroidx/compose/ui/layout/SubcomposeLayoutState;

    invoke-static {p0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$getPrecomposedCount$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/SubcomposeLayoutState;->access$setPrecomposedCount$p(Landroidx/compose/ui/layout/SubcomposeLayoutState;I)V

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_2
    return-void
.end method
