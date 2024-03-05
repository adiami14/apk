.class public final Lq/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022%\u0008\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\u0008\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\u0008\u00030\r2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0015H\u0082\u0008\"\u001a\u0010\u001d\u001a\u00020\u00188\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u0012\u0004\u0008\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\u00188\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001a\u0012\u0004\u0008\u001e\u0010\u001c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006 "
    }
    d2 = {
        "T",
        "Lkotlin/coroutines/Continuation;",
        "Lkotlin/Result;",
        "result",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "cause",
        "",
        "onCancellation",
        "f",
        "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "Lq/l;",
        "",
        "h",
        "",
        "contState",
        "",
        "mode",
        "doYield",
        "Lkotlin/Function0;",
        "block",
        "b",
        "Lq/r0;",
        "a",
        "Lq/r0;",
        "getUNDEFINED$annotations",
        "()V",
        "UNDEFINED",
        "getREUSABLE_CLAIMED$annotations",
        "REUSABLE_CLAIMED",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lq/r0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq/r0;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lq/m;->a:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lq/m;->b:Lq/r0;

    return-void
.end method

.method public static final synthetic a()Lq/r0;
    .locals 1

    sget-object v0, Lq/m;->a:Lq/r0;

    return-object v0
.end method

.method public static final b(Lq/l;Ljava/lang/Object;IZLkotlin/jvm/functions/Function0;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/l<",
            "*>;",
            "Ljava/lang/Object;",
            "IZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, Lj/u3;->a:Lj/u3;

    invoke-virtual {v0}, Lj/u3;->b()Lj/t1;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {v0}, Lj/t1;->C()Z

    move-result p3

    if-eqz p3, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lj/t1;->B()Z

    move-result p3

    const/4 v2, 0x1

    if-eqz p3, :cond_1

    iput-object p1, p0, Lq/l;->o:Ljava/lang/Object;

    iput p2, p0, Lj/j1;->l:I

    invoke-virtual {v0, p0}, Lj/t1;->v(Lj/j1;)V

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Lj/t1;->y(Z)V

    :try_start_0
    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_2
    invoke-virtual {v0}, Lj/t1;->E()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    const/4 p2, 0x0

    :try_start_1
    invoke-virtual {p0, p1, p2}, Lj/j1;->j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-virtual {v0, v2}, Lj/t1;->q(Z)V

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    :goto_1
    return v1

    :catchall_1
    move-exception p0

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-virtual {v0, v2}, Lj/t1;->q(Z)V

    invoke-static {v2}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p0
.end method

.method public static synthetic c(Lq/l;Ljava/lang/Object;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Z
    .locals 1

    and-int/lit8 p5, p5, 0x4

    const/4 p6, 0x0

    if-eqz p5, :cond_0

    move p3, p6

    :cond_0
    sget-object p5, Lj/u3;->a:Lj/u3;

    invoke-virtual {p5}, Lj/u3;->b()Lj/t1;

    move-result-object p5

    if-eqz p3, :cond_1

    invoke-virtual {p5}, Lj/t1;->C()Z

    move-result p3

    if-eqz p3, :cond_1

    return p6

    :cond_1
    invoke-virtual {p5}, Lj/t1;->B()Z

    move-result p3

    const/4 v0, 0x1

    if-eqz p3, :cond_2

    iput-object p1, p0, Lq/l;->o:Ljava/lang/Object;

    iput p2, p0, Lj/j1;->l:I

    invoke-virtual {p5, p0}, Lj/t1;->v(Lj/j1;)V

    move p6, v0

    goto :goto_1

    :cond_2
    invoke-virtual {p5, v0}, Lj/t1;->y(Z)V

    :try_start_0
    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_3
    invoke-virtual {p5}, Lj/t1;->E()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_3

    goto :goto_0

    :catchall_0
    move-exception p1

    const/4 p2, 0x0

    :try_start_1
    invoke-virtual {p0, p1, p2}, Lj/j1;->j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-virtual {p5, v0}, Lj/t1;->q(Z)V

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    :goto_1
    return p6

    :catchall_1
    move-exception p0

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-virtual {p5, v0}, Lj/t1;->q(Z)V

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p0
.end method

.method public static synthetic d()V
    .locals 0

    return-void
.end method

.method public static synthetic e()V
    .locals 0

    return-void
.end method

.method public static final f(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .param p0    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .annotation build Lj/i2;
    .end annotation

    instance-of v0, p0, Lq/l;

    if-eqz v0, :cond_8

    check-cast p0, Lq/l;

    invoke-static {p1, p2}, Lj/k0;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lq/l;->m:Lj/o0;

    invoke-virtual {p0}, Lq/l;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/o0;->isDispatchNeeded(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object p2, p0, Lq/l;->o:Ljava/lang/Object;

    iput v1, p0, Lj/j1;->l:I

    iget-object p1, p0, Lq/l;->m:Lj/o0;

    invoke-virtual {p0}, Lq/l;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lj/o0;->dispatch(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    sget-object v0, Lj/u3;->a:Lj/u3;

    invoke-virtual {v0}, Lj/u3;->b()Lj/t1;

    move-result-object v0

    invoke-virtual {v0}, Lj/t1;->B()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object p2, p0, Lq/l;->o:Ljava/lang/Object;

    iput v1, p0, Lj/j1;->l:I

    invoke-virtual {v0, p0}, Lj/t1;->v(Lj/j1;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0, v1}, Lj/t1;->y(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lq/l;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    sget-object v4, Lj/n2;->b:Lj/n2$b;

    invoke-interface {v3, v4}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v3

    check-cast v3, Lj/n2;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lj/n2;->b()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Lj/n2;->u()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lq/l;->d(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_7

    iget-object p2, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    iget-object v3, p0, Lq/l;->p:Ljava/lang/Object;

    invoke-interface {p2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    invoke-static {v4, v3}, Lq/w0;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lq/w0;->a:Lq/r0;

    if-eq v3, v5, :cond_3

    invoke-static {p2, v4, v3}, Lj/n0;->g(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lj/c4;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    :try_start_1
    iget-object v5, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    invoke-interface {v5, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    :try_start_2
    invoke-virtual {p2}, Lj/c4;->y1()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_4
    invoke-static {v4, v3}, Lq/w0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lj/c4;->y1()Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    invoke-static {v4, v3}, Lq/w0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_6
    throw p1

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lj/t1;->E()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v2}, Lj/j1;->j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-virtual {v0, v1}, Lj/t1;->q(Z)V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v1}, Lj/t1;->q(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static synthetic g(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lq/m;->f(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final h(Lq/l;)Z
    .locals 5
    .param p0    # Lq/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/l<",
            "-",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    sget-object v1, Lj/u3;->a:Lj/u3;

    invoke-virtual {v1}, Lj/u3;->b()Lj/t1;

    move-result-object v1

    invoke-virtual {v1}, Lj/t1;->C()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lj/t1;->B()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    iput-object v0, p0, Lq/l;->o:Ljava/lang/Object;

    iput v4, p0, Lj/j1;->l:I

    invoke-virtual {v1, p0}, Lj/t1;->v(Lj/j1;)V

    move v3, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4}, Lj/t1;->y(Z)V

    :try_start_0
    invoke-virtual {p0}, Lj/j1;->run()V

    :cond_2
    invoke-virtual {v1}, Lj/t1;->E()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {p0, v0, v2}, Lj/j1;->j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    invoke-virtual {v1, v4}, Lj/t1;->q(Z)V

    :goto_1
    return v3

    :catchall_1
    move-exception p0

    invoke-virtual {v1, v4}, Lj/t1;->q(Z)V

    throw p0
.end method
