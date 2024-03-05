.class public abstract Lj/t1;
.super Lj/o0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008 \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008)\u0010*J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\n\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\u0007J\u0010\u0010\u000c\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eJ\u0008\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0007\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0011\u0010$\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u001eR\u0011\u0010&\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u001eR\u0011\u0010(\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u001e\u00a8\u0006+"
    }
    d2 = {
        "Lj/t1;",
        "Lj/o0;",
        "",
        "D",
        "",
        "E",
        "F",
        "Lj/j1;",
        "task",
        "",
        "v",
        "unconfined",
        "y",
        "q",
        "",
        "parallelism",
        "limitedParallelism",
        "shutdown",
        "t",
        "j",
        "J",
        "useCount",
        "k",
        "Z",
        "shared",
        "Lq/a;",
        "l",
        "Lq/a;",
        "unconfinedQueue",
        "A",
        "()Z",
        "isEmpty",
        "w",
        "()J",
        "nextTime",
        "b",
        "isActive",
        "B",
        "isUnconfinedLoopActive",
        "C",
        "isUnconfinedQueueEmpty",
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


# instance fields
.field public j:J

.field public k:Z

.field public l:Lq/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq/a<",
            "Lj/j1<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/o0;-><init>()V

    return-void
.end method

.method public static synthetic s(Lj/t1;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lj/t1;->q(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic z(Lj/t1;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lj/t1;->y(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public A()Z
    .locals 0

    invoke-virtual {p0}, Lj/t1;->C()Z

    move-result p0

    return p0
.end method

.method public final B()Z
    .locals 5

    iget-wide v0, p0, Lj/t1;->j:J

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lj/t1;->t(Z)J

    move-result-wide v3

    cmp-long p0, v0, v3

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final C()Z
    .locals 0

    iget-object p0, p0, Lj/t1;->l:Lq/a;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lq/a;->d()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public D()J
    .locals 2

    invoke-virtual {p0}, Lj/t1;->E()Z

    move-result p0

    if-nez p0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final E()Z
    .locals 1

    iget-object p0, p0, Lj/t1;->l:Lq/a;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lq/a;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj/j1;

    if-nez p0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Lj/j1;->run()V

    const/4 p0, 0x1

    return p0
.end method

.method public F()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final b()Z
    .locals 4

    iget-wide v0, p0, Lj/t1;->j:J

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public final limitedParallelism(I)Lj/o0;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Lq/t;->a(I)V

    return-object p0
.end method

.method public final q(Z)V
    .locals 4

    iget-wide v0, p0, Lj/t1;->j:J

    invoke-virtual {p0, p1}, Lj/t1;->t(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lj/t1;->j:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    return-void

    :cond_0
    iget-boolean p1, p0, Lj/t1;->k:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lj/t1;->shutdown()V

    :cond_1
    return-void
.end method

.method public shutdown()V
    .locals 0

    return-void
.end method

.method public final t(Z)J
    .locals 0

    if-eqz p1, :cond_0

    const-wide p0, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 p0, 0x1

    :goto_0
    return-wide p0
.end method

.method public final v(Lj/j1;)V
    .locals 1
    .param p1    # Lj/j1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/j1<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lj/t1;->l:Lq/a;

    if-nez v0, :cond_0

    new-instance v0, Lq/a;

    invoke-direct {v0}, Lq/a;-><init>()V

    iput-object v0, p0, Lj/t1;->l:Lq/a;

    :cond_0
    invoke-virtual {v0, p1}, Lq/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public w()J
    .locals 2

    iget-object p0, p0, Lj/t1;->l:Lq/a;

    const-wide v0, 0x7fffffffffffffffL

    if-nez p0, :cond_0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lq/a;->d()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public final y(Z)V
    .locals 4

    iget-wide v0, p0, Lj/t1;->j:J

    invoke-virtual {p0, p1}, Lj/t1;->t(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lj/t1;->j:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj/t1;->k:Z

    :cond_0
    return-void
.end method
