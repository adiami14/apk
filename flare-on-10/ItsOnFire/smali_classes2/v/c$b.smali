.class public final Lv/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/c1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/c;->e(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;)Lj/c1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/c1<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0089\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0013\u0010\u0006\u001a\u00028\u0000H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\u0008H\u0097\u0001J\u0013\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0097\u0001J\u0019\u0010\t\u001a\u00020\u00082\u000e\u0010\u000b\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0096\u0001J8\u0010\u0015\u001a\u00028\u0001\"\u0004\u0008\u0001\u0010\u00102\u0006\u0010\u0011\u001a\u00028\u00012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00010\u0012H\u0096\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J*\u0010\u001a\u001a\u0004\u0018\u00018\u0001\"\u0008\u0008\u0001\u0010\u0017*\u00020\u00132\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00060\u000ej\u0002`\u000fH\u0097\u0001J\u0010\u0010\u001d\u001a\u00028\u0000H\u0097\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0097\u0001JB\u0010(\u001a\u00020\'2\u0006\u0010 \u001a\u00020\u000c2\u0006\u0010!\u001a\u00020\u000c2\'\u0010&\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u00080\"j\u0002`%H\u0097\u0001J2\u0010)\u001a\u00020\'2\'\u0010&\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u00080\"j\u0002`%H\u0096\u0001J\u0013\u0010*\u001a\u00020\u0008H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008*\u0010\u0007J\u0015\u0010,\u001a\u00020+2\n\u0010\u0019\u001a\u0006\u0012\u0002\u0008\u00030\u0018H\u0096\u0001J\u0011\u0010.\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0096\u0003J\u0011\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0097\u0003J\t\u00102\u001a\u00020\u000cH\u0096\u0001R\u001a\u00106\u001a\u0008\u0012\u0004\u0012\u00020/038\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u00084\u00105R\u0014\u00109\u001a\u00020\u000c8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u00087\u00108R\u0014\u0010:\u001a\u00020\u000c8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008:\u00108R\u0014\u0010<\u001a\u00020\u000c8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008;\u00108R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\u0008\u00030\u00188\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u00028\u00000?8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010AR\u0014\u0010F\u001a\u00020C8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010E\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006G"
    }
    d2 = {
        "v/c$b",
        "Lj/c1;",
        "Lj/y;",
        "child",
        "Lj/w;",
        "X",
        "x",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "cancel",
        "",
        "cause",
        "",
        "a",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "R",
        "initial",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "operation",
        "fold",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;",
        "E",
        "Lkotlin/coroutines/CoroutineContext$Key;",
        "key",
        "get",
        "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;",
        "u",
        "g",
        "()Ljava/lang/Object;",
        "l",
        "onCancelling",
        "invokeImmediately",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "Lkotlinx/coroutines/CompletionHandler;",
        "handler",
        "Lj/p1;",
        "r",
        "H",
        "n",
        "Lkotlin/coroutines/CoroutineContext;",
        "minusKey",
        "context",
        "plus",
        "Lj/n2;",
        "other",
        "M",
        "start",
        "Lkotlin/sequences/Sequence;",
        "k",
        "()Lkotlin/sequences/Sequence;",
        "children",
        "b",
        "()Z",
        "isActive",
        "isCancelled",
        "e",
        "isCompleted",
        "getKey",
        "()Lkotlin/coroutines/CoroutineContext$Key;",
        "Lt/d;",
        "j",
        "()Lt/d;",
        "onAwait",
        "Lt/c;",
        "N",
        "()Lt/c;",
        "onJoin",
        "kotlinx-coroutines-play-services"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic j:Lj/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/z<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj/z;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/z<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/c$b;->j:Lj/z;

    return-void
.end method


# virtual methods
.method public H(Lkotlin/jvm/functions/Function1;)Lj/p1;
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lj/p1;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lj/n2;->H(Lkotlin/jvm/functions/Function1;)Lj/p1;

    move-result-object p0

    return-object p0
.end method

.method public M(Lj/n2;)Lj/n2;
    .locals 0
    .param p1    # Lj/n2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`."
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lj/n2;->M(Lj/n2;)Lj/n2;

    move-result-object p0

    return-object p0
.end method

.method public N()Lt/c;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/n2;->N()Lt/c;

    move-result-object p0

    return-object p0
.end method

.method public X(Lj/y;)Lj/w;
    .locals 0
    .param p1    # Lj/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lj/i2;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lj/n2;->X(Lj/y;)Lj/w;

    move-result-object p0

    return-object p0
.end method

.method public synthetic a(Ljava/lang/Throwable;)Z
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lj/n2;->a(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public b()Z
    .locals 0

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/n2;->b()Z

    move-result p0

    return p0
.end method

.method public synthetic cancel()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/n2;->cancel()V

    return-void
.end method

.method public cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lj/n2;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public e()Z
    .locals 0

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/n2;->e()Z

    move-result p0

    return p0
.end method

.method public fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            "+TR;>;)TR;"
        }
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1, p2}, Lkotlin/coroutines/CoroutineContext$Element;->fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public g()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lj/c2;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/c1;->g()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
    .locals 0
    .param p1    # Lkotlin/coroutines/CoroutineContext$Key;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            ">(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lkotlin/coroutines/CoroutineContext$Element;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p0

    return-object p0
.end method

.method public getKey()Lkotlin/coroutines/CoroutineContext$Key;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lkotlin/coroutines/CoroutineContext$Element;->getKey()Lkotlin/coroutines/CoroutineContext$Key;

    move-result-object p0

    return-object p0
.end method

.method public isCancelled()Z
    .locals 0

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/n2;->isCancelled()Z

    move-result p0

    return p0
.end method

.method public j()Lt/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt/d<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/c1;->j()Lt/d;

    move-result-object p0

    return-object p0
.end method

.method public k()Lkotlin/sequences/Sequence;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lj/n2;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/n2;->k()Lkotlin/sequences/Sequence;

    move-result-object p0

    return-object p0
.end method

.method public l()Ljava/lang/Throwable;
    .locals 0
    .annotation build Lj/c2;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/c1;->l()Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public minusKey(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;
    .locals 0
    .param p1    # Lkotlin/coroutines/CoroutineContext$Key;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;)",
            "Lkotlin/coroutines/CoroutineContext;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lkotlin/coroutines/CoroutineContext$Element;->minusKey(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0
.end method

.method public n(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
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

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lj/n2;->n(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
    .locals 0
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0
.end method

.method public r(ZZLkotlin/jvm/functions/Function1;)Lj/p1;
    .locals 0
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lj/p1;"
        }
    .end annotation

    .annotation build Lj/i2;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1, p2, p3}, Lj/n2;->r(ZZLkotlin/jvm/functions/Function1;)Lj/p1;

    move-result-object p0

    return-object p0
.end method

.method public start()Z
    .locals 0

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/n2;->start()Z

    move-result p0

    return p0
.end method

.method public u()Ljava/util/concurrent/CancellationException;
    .locals 0
    .annotation build Lj/i2;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0}, Lj/n2;->u()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0
.end method

.method public x(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Lv/c$b;->j:Lj/z;

    invoke-interface {p0, p1}, Lj/c1;->x(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
