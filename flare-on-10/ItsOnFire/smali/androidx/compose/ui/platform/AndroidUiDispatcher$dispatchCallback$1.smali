.class public final Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/AndroidUiDispatcher;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1",
        "Landroid/view/Choreographer$FrameCallback;",
        "Ljava/lang/Runnable;",
        "doFrame",
        "",
        "frameTimeNanos",
        "",
        "run",
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
.field public final synthetic this$0:Landroidx/compose/ui/platform/AndroidUiDispatcher;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidUiDispatcher;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;->this$0:Landroidx/compose/ui/platform/AndroidUiDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;->this$0:Landroidx/compose/ui/platform/AndroidUiDispatcher;

    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidUiDispatcher;->access$getHandler$p(Landroidx/compose/ui/platform/AndroidUiDispatcher;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;->this$0:Landroidx/compose/ui/platform/AndroidUiDispatcher;

    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidUiDispatcher;->access$performTrampolineDispatch(Landroidx/compose/ui/platform/AndroidUiDispatcher;)V

    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;->this$0:Landroidx/compose/ui/platform/AndroidUiDispatcher;

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/platform/AndroidUiDispatcher;->access$performFrameDispatch(Landroidx/compose/ui/platform/AndroidUiDispatcher;J)V

    return-void
.end method

.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;->this$0:Landroidx/compose/ui/platform/AndroidUiDispatcher;

    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidUiDispatcher;->access$performTrampolineDispatch(Landroidx/compose/ui/platform/AndroidUiDispatcher;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;->this$0:Landroidx/compose/ui/platform/AndroidUiDispatcher;

    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidUiDispatcher;->access$getLock$p(Landroidx/compose/ui/platform/AndroidUiDispatcher;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;->this$0:Landroidx/compose/ui/platform/AndroidUiDispatcher;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidUiDispatcher;->access$getToRunOnFrame$p(Landroidx/compose/ui/platform/AndroidUiDispatcher;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidUiDispatcher;->getChoreographer()Landroid/view/Choreographer;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    const/4 p0, 0x0

    invoke-static {v1, p0}, Landroidx/compose/ui/platform/AndroidUiDispatcher;->access$setScheduledFrameDispatch$p(Landroidx/compose/ui/platform/AndroidUiDispatcher;Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method