.class public final Lq/l;
.super Lj/j1;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;
.implements Lkotlin/coroutines/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lj/j1<",
        "TT;>;",
        "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;",
        "Lkotlin/coroutines/Continuation<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0000\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00002\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\u0008\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010:\u001a\u000208\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\u0008K\u0010LJ\u0017\u0010\u0008\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\u0008\u00030\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"JH\u0010\'\u001a\u00020\r2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001f2%\u0008\u0008\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\u000c\u0008$\u0012\u0008\u0008%\u0012\u0004\u0008\u0008(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010#H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(J!\u0010*\u001a\u00020\r2\u0008\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010-\u001a\u00020\n2\u0008\u0010,\u001a\u0004\u0018\u00010\u001cH\u0086\u0008\u00a2\u0006\u0004\u0008-\u0010.J!\u0010/\u001a\u00020\r2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u0010\"J\u001f\u00103\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\u00083\u00104J\u000f\u00106\u001a\u000205H\u0016\u00a2\u0006\u0004\u00086\u00107R\u0014\u0010:\u001a\u0002088\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u00109R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010;R\u001e\u0010?\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u0012\u0004\u0008>\u0010\u000fR\u0014\u0010A\u001a\u00020\u001c8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010=R\u0014\u00101\u001a\u0002008\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010CR\u001c\u0010F\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010ER\u001a\u0010I\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010HR\u001a\u0010J\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010\u0013\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006M"
    }
    d2 = {
        "Lq/l;",
        "T",
        "Lj/j1;",
        "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;",
        "Lkotlinx/coroutines/internal/CoroutineStackFrame;",
        "Lkotlin/coroutines/Continuation;",
        "Ljava/lang/StackTraceElement;",
        "Lkotlinx/coroutines/internal/StackTraceElement;",
        "getStackTraceElement",
        "()Ljava/lang/StackTraceElement;",
        "",
        "q",
        "()Z",
        "",
        "l",
        "()V",
        "u",
        "Lj/r;",
        "m",
        "()Lj/r;",
        "Lj/q;",
        "continuation",
        "",
        "y",
        "(Lj/q;)Ljava/lang/Throwable;",
        "cause",
        "r",
        "(Ljava/lang/Throwable;)Z",
        "",
        "k",
        "()Ljava/lang/Object;",
        "Lkotlin/Result;",
        "result",
        "resumeWith",
        "(Ljava/lang/Object;)V",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "onCancellation",
        "v",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "takenState",
        "d",
        "(Ljava/lang/Object;Ljava/lang/Throwable;)V",
        "state",
        "w",
        "(Ljava/lang/Object;)Z",
        "x",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "value",
        "n",
        "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lj/o0;",
        "Lj/o0;",
        "dispatcher",
        "Lkotlin/coroutines/Continuation;",
        "o",
        "Ljava/lang/Object;",
        "get_state$kotlinx_coroutines_core$annotations",
        "_state",
        "p",
        "countOrElement",
        "getContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "getCallerFrame",
        "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;",
        "callerFrame",
        "g",
        "()Lkotlin/coroutines/Continuation;",
        "delegate",
        "reusableCancellableContinuation",
        "<init>",
        "(Lj/o0;Lkotlin/coroutines/Continuation;)V",
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
.field public static final synthetic q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _reusableCancellableContinuation:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lj/o0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public o:Ljava/lang/Object;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final p:Ljava/lang/Object;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lq/l;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_reusableCancellableContinuation"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lq/l;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lj/o0;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .param p1    # Lj/o0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/o0;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lj/j1;-><init>(I)V

    iput-object p1, p0, Lq/l;->m:Lj/o0;

    iput-object p2, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    invoke-static {}, Lq/m;->a()Lq/r0;

    move-result-object p1

    iput-object p1, p0, Lq/l;->o:Ljava/lang/Object;

    invoke-virtual {p0}, Lq/l;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lq/w0;->b(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lq/l;->p:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lq/l;->_reusableCancellableContinuation:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic p()V
    .locals 0

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    instance-of p0, p1, Lj/f0;

    if-eqz p0, :cond_0

    check-cast p1, Lj/f0;

    iget-object p0, p1, Lj/f0;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public g()Lkotlin/coroutines/Continuation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/Continuation<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    invoke-interface {p0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method public k()Ljava/lang/Object;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lq/l;->o:Ljava/lang/Object;

    invoke-static {}, Lq/m;->a()Lq/r0;

    move-result-object v1

    iput-object v1, p0, Lq/l;->o:Ljava/lang/Object;

    return-object v0
.end method

.method public final l()V
    .locals 2

    :cond_0
    iget-object v0, p0, Lq/l;->_reusableCancellableContinuation:Ljava/lang/Object;

    sget-object v1, Lq/m;->b:Lq/r0;

    if-eq v0, v1, :cond_0

    return-void
.end method

.method public final m()Lj/r;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/r<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    :cond_0
    :goto_0
    iget-object v0, p0, Lq/l;->_reusableCancellableContinuation:Ljava/lang/Object;

    if-nez v0, :cond_1

    sget-object v0, Lq/m;->b:Lq/r0;

    iput-object v0, p0, Lq/l;->_reusableCancellableContinuation:Ljava/lang/Object;

    const/4 p0, 0x0

    return-object p0

    :cond_1
    instance-of v1, v0, Lj/r;

    if-eqz v1, :cond_2

    sget-object v1, Lq/l;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v2, Lq/m;->b:Lq/r0;

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lj/r;

    return-object v0

    :cond_2
    sget-object v1, Lq/m;->b:Lq/r0;

    if-eq v0, v1, :cond_0

    instance-of v1, v0, Ljava/lang/Throwable;

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final n(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext;",
            "TT;)V"
        }
    .end annotation

    iput-object p2, p0, Lq/l;->o:Ljava/lang/Object;

    const/4 p2, 0x1

    iput p2, p0, Lj/j1;->l:I

    iget-object p2, p0, Lq/l;->m:Lj/o0;

    invoke-virtual {p2, p1, p0}, Lj/o0;->dispatchYield(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final o()Lj/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/r<",
            "*>;"
        }
    .end annotation

    iget-object p0, p0, Lq/l;->_reusableCancellableContinuation:Ljava/lang/Object;

    instance-of v0, p0, Lj/r;

    if-eqz v0, :cond_0

    check-cast p0, Lj/r;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public final q()Z
    .locals 0

    iget-object p0, p0, Lq/l;->_reusableCancellableContinuation:Ljava/lang/Object;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public final r(Ljava/lang/Throwable;)Z
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    :cond_0
    iget-object v0, p0, Lq/l;->_reusableCancellableContinuation:Ljava/lang/Object;

    sget-object v1, Lq/m;->b:Lq/r0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    sget-object v0, Lq/l;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_1
    instance-of v1, v0, Ljava/lang/Throwable;

    if-eqz v1, :cond_2

    return v3

    :cond_2
    sget-object v1, Lq/l;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v2, 0x0

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v1}, Lj/k0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lq/l;->m:Lj/o0;

    invoke-virtual {v4, v0}, Lj/o0;->isDispatchNeeded(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    iput-object v3, p0, Lq/l;->o:Ljava/lang/Object;

    iput v5, p0, Lj/j1;->l:I

    iget-object p1, p0, Lq/l;->m:Lj/o0;

    invoke-virtual {p1, v0, p0}, Lj/o0;->dispatch(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_0
    sget-object v0, Lj/u3;->a:Lj/u3;

    invoke-virtual {v0}, Lj/u3;->b()Lj/t1;

    move-result-object v0

    invoke-virtual {v0}, Lj/t1;->B()Z

    move-result v4

    if-eqz v4, :cond_1

    iput-object v3, p0, Lq/l;->o:Ljava/lang/Object;

    iput v5, p0, Lj/j1;->l:I

    invoke-virtual {v0, p0}, Lj/t1;->v(Lj/j1;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Lj/t1;->y(Z)V

    :try_start_0
    invoke-virtual {p0}, Lq/l;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    iget-object v4, p0, Lq/l;->p:Ljava/lang/Object;

    invoke-static {v3, v4}, Lq/w0;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v5, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    invoke-interface {v5, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v3, v4}, Lq/w0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v0}, Lj/t1;->E()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {v3, v4}, Lq/w0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v1}, Lj/j1;->j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_0
    invoke-virtual {v0, v2}, Lj/t1;->q(Z)V

    :goto_1
    return-void

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v2}, Lj/t1;->q(Z)V

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DispatchedContinuation["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq/l;->m:Lj/o0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    invoke-static {p0}, Lj/z0;->c(Lkotlin/coroutines/Continuation;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final u()V
    .locals 0

    invoke-virtual {p0}, Lq/l;->l()V

    invoke-virtual {p0}, Lq/l;->o()Lj/r;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lj/r;->r()V

    :cond_0
    return-void
.end method

.method public final v(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 6
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
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

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
    if-nez p2, :cond_8

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

    :try_start_2
    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lj/c4;->y1()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    invoke-static {v4, v3}, Lq/w0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    goto :goto_2

    :catchall_0
    move-exception p1

    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lj/c4;->y1()Z

    move-result p2

    if-eqz p2, :cond_7

    :cond_6
    invoke-static {v4, v3}, Lq/w0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {v0}, Lj/t1;->E()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_8

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v2}, Lj/j1;->j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-virtual {v0, v1}, Lj/t1;->q(Z)V

    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    :goto_4
    return-void

    :catchall_2
    move-exception p0

    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-virtual {v0, v1}, Lj/t1;->q(Z)V

    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p0
.end method

.method public final w(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p0}, Lq/l;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v1, Lj/n2;->b:Lj/n2$b;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    check-cast v0, Lj/n2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lj/n2;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lj/n2;->u()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lq/l;->d(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    iget-object v1, p0, Lq/l;->p:Ljava/lang/Object;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    invoke-static {v2, v1}, Lq/w0;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lq/w0;->a:Lq/r0;

    if-eq v1, v3, :cond_0

    invoke-static {v0, v2, v1}, Lj/n0;->g(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lj/c4;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x1

    :try_start_0
    iget-object p0, p0, Lq/l;->n:Lkotlin/coroutines/Continuation;

    invoke-interface {p0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lj/c4;->y1()Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    invoke-static {v2, v1}, Lq/w0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return-void

    :catchall_0
    move-exception p0

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lj/c4;->y1()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v2, v1}, Lq/w0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p0
.end method

.method public final y(Lj/q;)Ljava/lang/Throwable;
    .locals 3
    .param p1    # Lj/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/q<",
            "*>;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    :cond_0
    iget-object v0, p0, Lq/l;->_reusableCancellableContinuation:Ljava/lang/Object;

    sget-object v1, Lq/m;->b:Lq/r0;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    sget-object v0, Lq/l;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v2

    :cond_1
    instance-of p1, v0, Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    sget-object p1, Lq/l;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p1, p0, v0, v2}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    check-cast v0, Ljava/lang/Throwable;

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Inconsistent state "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
