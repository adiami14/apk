.class public abstract Lq/y$a;
.super Lq/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\u000c\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u0008H\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\u00082\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00082\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00152\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0008R\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001a\u00a8\u0006 "
    }
    d2 = {
        "Lq/y$a;",
        "Lq/b;",
        "Lq/j0;",
        "op",
        "Lq/y;",
        "Lkotlinx/coroutines/internal/Node;",
        "m",
        "affected",
        "",
        "e",
        "next",
        "",
        "l",
        "",
        "f",
        "n",
        "Lq/y$d;",
        "prepareOp",
        "g",
        "j",
        "k",
        "Lq/d;",
        "c",
        "failure",
        "a",
        "h",
        "()Lq/y;",
        "affectedNode",
        "i",
        "originalNext",
        "<init>",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/d;Ljava/lang/Object;)V
    .locals 4
    .param p1    # Lq/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/d<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0}, Lq/y$a;->h()Lq/y;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lq/y$a;->i()Lq/y;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0, v0, v1}, Lq/y$a;->n(Lq/y;Lq/y;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    sget-object v3, Lq/y;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, v0, p1, v2}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    invoke-virtual {p0, v0, v1}, Lq/y$a;->f(Lq/y;Lq/y;)V

    :cond_4
    return-void
.end method

.method public final c(Lq/d;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lq/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lq/y$a;->m(Lq/j0;)Lq/y;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p0, Lq/c;->b:Ljava/lang/Object;

    return-object p0

    :cond_1
    iget-object v1, v0, Lq/y;->_next:Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v1, p1, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p1}, Lq/d;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    :cond_3
    instance-of v3, v1, Lq/j0;

    if-eqz v3, :cond_5

    check-cast v1, Lq/j0;

    invoke-virtual {p1, v1}, Lq/j0;->b(Lq/j0;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object p0, Lq/c;->b:Ljava/lang/Object;

    return-object p0

    :cond_4
    invoke-virtual {v1, v0}, Lq/j0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    invoke-virtual {p0, v0}, Lq/y$a;->e(Lq/y;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_6

    return-object v3

    :cond_6
    invoke-virtual {p0, v0, v1}, Lq/y$a;->l(Lq/y;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Lq/y$d;

    move-object v4, v1

    check-cast v4, Lq/y;

    invoke-direct {v3, v0, v4, p0}, Lq/y$d;-><init>(Lq/y;Lq/y;Lq/y$a;)V

    sget-object v4, Lq/y;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v0, v1, v3}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-virtual {v3, v0}, Lq/y$d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v0, Lq/z;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v0, :cond_0

    return-object v2

    :catchall_0
    move-exception p0

    sget-object p1, Lq/y;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p1, v0, v3, v1}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p0
.end method

.method public e(Lq/y;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract f(Lq/y;Lq/y;)V
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract g(Lq/y$d;)V
    .param p1    # Lq/y$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract h()Lq/y;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract i()Lq/y;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public j(Lq/y$d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lq/y$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1}, Lq/y$a;->g(Lq/y$d;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public k(Lq/y;)V
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    return-void
.end method

.method public l(Lq/y;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 p0, 0x0

    return p0
.end method

.method public m(Lq/j0;)Lq/y;
    .locals 0
    .param p1    # Lq/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lq/y$a;->h()Lq/y;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p0
.end method

.method public abstract n(Lq/y;Lq/y;)Ljava/lang/Object;
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
