.class public final Lu/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00022\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00050\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0019\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Lu/g;",
        "Lu/f;",
        "",
        "c",
        "()Z",
        "",
        "b",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "release",
        "()V",
        "g",
        "Lj/q;",
        "cont",
        "h",
        "(Lj/q;)Z",
        "j",
        "i",
        "",
        "a",
        "I",
        "permits",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/jvm/functions/Function1;",
        "onCancellationRelease",
        "()I",
        "availablePermits",
        "acquiredPermits",
        "<init>",
        "(II)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic _availablePermits:I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a:I

.field public final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic deqIdx:J
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic enqIdx:J
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic head:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic tail:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lu/g;

    const-string v2, "head"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lu/g;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "deqIdx"

    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    sput-object v2, Lu/g;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v2, "tail"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lu/g;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "enqIdx"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lu/g;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_availablePermits"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lu/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu/g;->a:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lu/g;->deqIdx:J

    iput-wide v0, p0, Lu/g;->enqIdx:J

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lez p1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-eqz v4, :cond_3

    if-ltz p2, :cond_1

    if-gt p2, p1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v2, :cond_2

    new-instance v2, Lu/i;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v2, v0, v1, v3, v4}, Lu/i;-><init>(JLu/i;I)V

    iput-object v2, p0, Lu/g;->head:Ljava/lang/Object;

    iput-object v2, p0, Lu/g;->tail:Ljava/lang/Object;

    sub-int/2addr p1, p2

    iput p1, p0, Lu/g;->_availablePermits:I

    new-instance p1, Lu/g$a;

    invoke-direct {p1, p0}, Lu/g$a;-><init>(Lu/g;)V

    iput-object p1, p0, Lu/g;->b:Lkotlin/jvm/functions/Function1;

    return-void

    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "The number of acquired permits should be in 0.."

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Semaphore should have at least 1 permit, but had "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic d(Lu/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lu/g;->g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lu/g;Lj/q;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lu/g;->h(Lj/q;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(Lu/g;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lu/g;->b:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget p0, p0, Lu/g;->_availablePermits:I

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, Lu/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_0

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Lu/g;->g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public c()Z
    .locals 3

    :cond_0
    iget v0, p0, Lu/g;->_availablePermits:I

    if-gtz v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    sget-object v1, Lu/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0
.end method

.method public final g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    invoke-static {v0}, Lj/t;->b(Lkotlin/coroutines/Continuation;)Lj/r;

    move-result-object v0

    :cond_0
    invoke-static {p0, v0}, Lu/g;->e(Lu/g;Lj/q;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lu/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v1

    if-lez v1, :cond_0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p0}, Lu/g;->f(Lu/g;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Lj/q;->O(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    invoke-virtual {v0}, Lj/r;->x()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_2

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_2
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final h(Lj/q;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/q<",
            "-",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lu/g;->tail:Ljava/lang/Object;

    check-cast v0, Lu/i;

    sget-object v1, Lu/g;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    invoke-static {}, Lu/h;->h()I

    move-result v3

    int-to-long v3, v3

    div-long v3, v1, v3

    :cond_0
    move-object v5, v0

    :cond_1
    :goto_0
    invoke-virtual {v5}, Lq/o0;->o()J

    move-result-wide v6

    cmp-long v6, v6, v3

    if-ltz v6, :cond_2

    invoke-virtual {v5}, Lq/o0;->g()Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_2
    invoke-static {v5}, Lq/h;->a(Lq/h;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {}, Lq/g;->a()Lq/r0;

    move-result-object v7

    if-ne v6, v7, :cond_c

    invoke-static {}, Lq/g;->a()Lq/r0;

    move-result-object v5

    :cond_3
    invoke-static {v5}, Lq/p0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lq/p0;->h(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v6, :cond_9

    invoke-static {v5}, Lq/p0;->f(Ljava/lang/Object;)Lq/o0;

    move-result-object v6

    :cond_4
    :goto_1
    iget-object v9, p0, Lu/g;->tail:Ljava/lang/Object;

    check-cast v9, Lq/o0;

    invoke-virtual {v9}, Lq/o0;->o()J

    move-result-wide v10

    invoke-virtual {v6}, Lq/o0;->o()J

    move-result-wide v12

    cmp-long v10, v10, v12

    if-ltz v10, :cond_6

    :cond_5
    :goto_2
    move v6, v8

    goto :goto_3

    :cond_6
    invoke-virtual {v6}, Lq/o0;->r()Z

    move-result v10

    if-nez v10, :cond_7

    move v6, v7

    goto :goto_3

    :cond_7
    sget-object v10, Lu/g;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v10, p0, v9, v6}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v9}, Lq/o0;->n()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v9}, Lq/h;->l()V

    goto :goto_2

    :goto_3
    if-eqz v6, :cond_0

    goto :goto_4

    :cond_8
    invoke-virtual {v6}, Lq/o0;->n()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v6}, Lq/h;->l()V

    goto :goto_1

    :cond_9
    :goto_4
    invoke-static {v5}, Lq/p0;->f(Ljava/lang/Object;)Lq/o0;

    move-result-object v0

    check-cast v0, Lu/i;

    invoke-static {}, Lu/h;->h()I

    move-result v3

    int-to-long v3, v3

    rem-long/2addr v1, v3

    long-to-int v1, v1

    const/4 v2, 0x0

    iget-object v3, v0, Lu/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {v3, v1, v2, p1}, Ln/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    new-instance p0, Lu/a;

    invoke-direct {p0, v0, v1}, Lu/a;-><init>(Lu/i;I)V

    invoke-interface {p1, p0}, Lj/q;->A(Lkotlin/jvm/functions/Function1;)V

    return v8

    :cond_a
    invoke-static {}, Lu/h;->g()Lq/r0;

    move-result-object v2

    invoke-static {}, Lu/h;->i()Lq/r0;

    move-result-object v3

    iget-object v0, v0, Lu/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {v0, v1, v2, v3}, Ln/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-object p0, p0, Lu/g;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0, p0}, Lj/q;->O(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return v8

    :cond_b
    return v7

    :cond_c
    check-cast v6, Lq/h;

    check-cast v6, Lq/o0;

    if-eqz v6, :cond_e

    :cond_d
    :goto_5
    move-object v5, v6

    goto/16 :goto_0

    :cond_e
    invoke-virtual {v5}, Lq/o0;->o()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    move-object v8, v5

    check-cast v8, Lu/i;

    invoke-static {v6, v7, v8}, Lu/h;->c(JLu/i;)Lu/i;

    move-result-object v6

    invoke-virtual {v5, v6}, Lq/h;->m(Lq/h;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v5}, Lq/o0;->g()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {v5}, Lq/h;->l()V

    goto :goto_5
.end method

.method public final i(Lj/q;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/q<",
            "-",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-object p0, p0, Lu/g;->b:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1, p0}, Lj/q;->C(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p1, p0}, Lj/q;->Z(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final j()Z
    .locals 14

    iget-object v0, p0, Lu/g;->head:Ljava/lang/Object;

    check-cast v0, Lu/i;

    sget-object v1, Lu/g;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    invoke-static {}, Lu/h;->h()I

    move-result v3

    int-to-long v3, v3

    div-long v3, v1, v3

    :cond_0
    move-object v5, v0

    :cond_1
    :goto_0
    invoke-virtual {v5}, Lq/o0;->o()J

    move-result-wide v6

    cmp-long v6, v6, v3

    if-ltz v6, :cond_2

    invoke-virtual {v5}, Lq/o0;->g()Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_2
    invoke-static {v5}, Lq/h;->a(Lq/h;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {}, Lq/g;->a()Lq/r0;

    move-result-object v7

    if-ne v6, v7, :cond_f

    invoke-static {}, Lq/g;->a()Lq/r0;

    move-result-object v5

    :cond_3
    invoke-static {v5}, Lq/p0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lq/p0;->h(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v6, :cond_9

    invoke-static {v5}, Lq/p0;->f(Ljava/lang/Object;)Lq/o0;

    move-result-object v6

    :cond_4
    :goto_1
    iget-object v9, p0, Lu/g;->head:Ljava/lang/Object;

    check-cast v9, Lq/o0;

    invoke-virtual {v9}, Lq/o0;->o()J

    move-result-wide v10

    invoke-virtual {v6}, Lq/o0;->o()J

    move-result-wide v12

    cmp-long v10, v10, v12

    if-ltz v10, :cond_6

    :cond_5
    :goto_2
    move v6, v8

    goto :goto_3

    :cond_6
    invoke-virtual {v6}, Lq/o0;->r()Z

    move-result v10

    if-nez v10, :cond_7

    move v6, v7

    goto :goto_3

    :cond_7
    sget-object v10, Lu/g;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v10, p0, v9, v6}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v9}, Lq/o0;->n()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v9}, Lq/h;->l()V

    goto :goto_2

    :goto_3
    if-eqz v6, :cond_0

    goto :goto_4

    :cond_8
    invoke-virtual {v6}, Lq/o0;->n()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v6}, Lq/h;->l()V

    goto :goto_1

    :cond_9
    :goto_4
    invoke-static {v5}, Lq/p0;->f(Ljava/lang/Object;)Lq/o0;

    move-result-object v0

    check-cast v0, Lu/i;

    invoke-virtual {v0}, Lq/h;->b()V

    invoke-virtual {v0}, Lq/o0;->o()J

    move-result-wide v5

    cmp-long v3, v5, v3

    if-lez v3, :cond_a

    return v7

    :cond_a
    invoke-static {}, Lu/h;->h()I

    move-result v3

    int-to-long v3, v3

    rem-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {}, Lu/h;->g()Lq/r0;

    move-result-object v2

    iget-object v3, v0, Lu/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_d

    invoke-static {}, Lu/h;->f()I

    move-result p0

    :goto_5
    if-ge v7, p0, :cond_c

    iget-object v2, v0, Lu/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lu/h;->i()Lq/r0;

    move-result-object v3

    if-ne v2, v3, :cond_b

    return v8

    :cond_b
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_c
    invoke-static {}, Lu/h;->g()Lq/r0;

    move-result-object p0

    invoke-static {}, Lu/h;->d()Lq/r0;

    move-result-object v2

    iget-object v0, v0, Lu/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {v0, v1, p0, v2}, Ln/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, v8

    return p0

    :cond_d
    invoke-static {}, Lu/h;->e()Lq/r0;

    move-result-object v0

    if-ne v2, v0, :cond_e

    return v7

    :cond_e
    check-cast v2, Lj/q;

    invoke-virtual {p0, v2}, Lu/g;->i(Lj/q;)Z

    move-result p0

    return p0

    :cond_f
    check-cast v6, Lq/h;

    check-cast v6, Lq/o0;

    if-eqz v6, :cond_11

    :cond_10
    :goto_6
    move-object v5, v6

    goto/16 :goto_0

    :cond_11
    invoke-virtual {v5}, Lq/o0;->o()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    move-object v8, v5

    check-cast v8, Lu/i;

    invoke-static {v6, v7, v8}, Lu/h;->c(JLu/i;)Lu/i;

    move-result-object v6

    invoke-virtual {v5, v6}, Lq/h;->m(Lq/h;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v5}, Lq/o0;->g()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-virtual {v5}, Lq/h;->l()V

    goto :goto_6
.end method

.method public release()V
    .locals 3

    :cond_0
    iget v0, p0, Lu/g;->_availablePermits:I

    iget v1, p0, Lu/g;->a:I

    if-ge v0, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    add-int/lit8 v1, v0, 0x1

    sget-object v2, Lu/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    if-ltz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lu/g;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The number of released permits cannot be greater than "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lu/g;->a:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
