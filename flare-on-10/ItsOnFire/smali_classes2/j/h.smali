.class public final Lj/h;
.super Lj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lj/a<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0019"
    }
    d2 = {
        "Lj/h;",
        "T",
        "Lj/a;",
        "",
        "state",
        "",
        "g0",
        "x1",
        "()Ljava/lang/Object;",
        "Ljava/lang/Thread;",
        "l",
        "Ljava/lang/Thread;",
        "blockedThread",
        "Lj/t1;",
        "m",
        "Lj/t1;",
        "eventLoop",
        "",
        "M0",
        "()Z",
        "isScopedCoroutine",
        "Lkotlin/coroutines/CoroutineContext;",
        "parentContext",
        "<init>",
        "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lj/t1;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final l:Ljava/lang/Thread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lj/t1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lj/t1;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Thread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lj/t1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, Lj/a;-><init>(Lkotlin/coroutines/CoroutineContext;ZZ)V

    iput-object p2, p0, Lj/h;->l:Ljava/lang/Thread;

    iput-object p3, p0, Lj/h;->m:Lj/t1;

    return-void
.end method


# virtual methods
.method public M0()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public g0(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, Lj/h;->l:Ljava/lang/Thread;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p0, p0, Lj/h;->l:Ljava/lang/Thread;

    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lj/b;->g(Ljava/lang/Thread;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_1
    return-void
.end method

.method public final x1()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/b;->d()V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lj/h;->m:Lj/t1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0, v2, v1, v3}, Lj/t1;->z(Lj/t1;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lj/h;->m:Lj/t1;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lj/t1;->D()J

    move-result-wide v4

    goto :goto_1

    :cond_2
    const-wide v4, 0x7fffffffffffffffL

    :goto_1
    invoke-virtual {p0}, Lj/v2;->e()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0, p0, v4, v5}, Lj/b;->c(Ljava/lang/Object;J)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_3
    move-object v0, v3

    :goto_2
    if-nez v0, :cond_1

    invoke-static {p0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_4
    :try_start_2
    iget-object v0, p0, Lj/h;->m:Lj/t1;

    if-eqz v0, :cond_5

    invoke-static {v0, v2, v1, v3}, Lj/t1;->s(Lj/t1;ZILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_5
    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lj/b;->h()V

    :cond_6
    invoke-virtual {p0}, Lj/v2;->G0()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lj/w2;->o(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lj/e0;

    if-eqz v0, :cond_7

    move-object v3, p0

    check-cast v3, Lj/e0;

    :cond_7
    if-nez v3, :cond_8

    return-object p0

    :cond_8
    iget-object p0, v3, Lj/e0;->a:Ljava/lang/Throwable;

    throw p0

    :cond_9
    :try_start_3
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    invoke-virtual {p0, v0}, Lj/v2;->j0(Ljava/lang/Throwable;)Z

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_4
    iget-object p0, p0, Lj/h;->m:Lj/t1;

    if-eqz p0, :cond_a

    invoke-static {p0, v2, v1, v3}, Lj/t1;->s(Lj/t1;ZILjava/lang/Object;)V

    :cond_a
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p0

    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lj/b;->h()V

    :cond_b
    throw p0
.end method
