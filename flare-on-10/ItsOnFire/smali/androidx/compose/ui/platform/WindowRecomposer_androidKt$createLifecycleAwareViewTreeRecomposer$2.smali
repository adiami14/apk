.class public final Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/WindowRecomposer_androidKt;->createLifecycleAwareViewTreeRecomposer(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2",
        "Landroidx/lifecycle/LifecycleEventObserver;",
        "onStateChanged",
        "",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "event",
        "Landroidx/lifecycle/Lifecycle$Event;",
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
.field public final synthetic $pausableClock:Landroidx/compose/runtime/PausableMonotonicFrameClock;

.field public final synthetic $recomposer:Landroidx/compose/runtime/Recomposer;

.field public final synthetic $runRecomposeScope:Lj/u0;


# direct methods
.method public constructor <init>(Lj/u0;Landroidx/compose/runtime/PausableMonotonicFrameClock;Landroidx/compose/runtime/Recomposer;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;->$runRecomposeScope:Lj/u0;

    iput-object p2, p0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;->$pausableClock:Landroidx/compose/runtime/PausableMonotonicFrameClock;

    iput-object p3, p0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;->$recomposer:Landroidx/compose/runtime/Recomposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 6
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/Lifecycle$Event;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_5

    const/4 p1, 0x2

    if-eq p2, p1, :cond_3

    const/4 p1, 0x3

    if-eq p2, p1, :cond_1

    const/4 p1, 0x4

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;->$recomposer:Landroidx/compose/runtime/Recomposer;

    invoke-virtual {p0}, Landroidx/compose/runtime/Recomposer;->cancel()V

    goto :goto_0

    :cond_1
    iget-object p0, p0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;->$pausableClock:Landroidx/compose/runtime/PausableMonotonicFrameClock;

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/runtime/PausableMonotonicFrameClock;->pause()V

    goto :goto_0

    :cond_3
    iget-object p0, p0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;->$pausableClock:Landroidx/compose/runtime/PausableMonotonicFrameClock;

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Landroidx/compose/runtime/PausableMonotonicFrameClock;->resume()V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;->$runRecomposeScope:Lj/u0;

    const/4 v1, 0x0

    sget-object v2, Lj/w0;->m:Lj/w0;

    new-instance v3, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1;

    iget-object p2, p0, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;->$recomposer:Landroidx/compose/runtime/Recomposer;

    const/4 v4, 0x0

    invoke-direct {v3, p2, p1, p0, v4}, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1;-><init>(Landroidx/compose/runtime/Recomposer;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    :goto_0
    return-void
.end method
