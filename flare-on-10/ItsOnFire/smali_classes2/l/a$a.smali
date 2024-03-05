.class public final Ll/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ll/p<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0002\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000c\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u00032\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002J\u0013\u0010\u000b\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0007\"\u0004\u0008\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "Ll/a$a;",
        "E",
        "Ll/p;",
        "",
        "a",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "next",
        "()Ljava/lang/Object;",
        "",
        "result",
        "e",
        "f",
        "Ll/a;",
        "Ll/a;",
        "channel",
        "b",
        "Ljava/lang/Object;",
        "d",
        "g",
        "(Ljava/lang/Object;)V",
        "<init>",
        "(Ll/a;)V",
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
.field public final a:Ll/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/a<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll/a;)V
    .locals 0
    .param p1    # Ll/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/a<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/a$a;->a:Ll/a;

    sget-object p1, Ll/b;->f:Lq/r0;

    iput-object p1, p0, Ll/a$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic c(Ll/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ll/a$a;->f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ll/a$a;->b:Ljava/lang/Object;

    sget-object v1, Ll/b;->f:Lq/r0;

    if-eq v0, v1, :cond_0

    :goto_0
    invoke-virtual {p0, v0}, Ll/a$a;->e(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object v0, p0, Ll/a$a;->a:Ll/a;

    invoke-virtual {v0}, Ll/a;->l0()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/a$a;->b:Ljava/lang/Object;

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ll/a$a;->f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public synthetic b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Since 1.3.0, binary compatibility with versions <= 1.2.x"
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "next"
    .end annotation

    invoke-static {p0, p1}, Ll/p$a;->a(Ll/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final d()Ljava/lang/Object;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Ll/a$a;->b:Ljava/lang/Object;

    return-object p0
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p1, Ll/w;

    if-eqz p0, :cond_1

    check-cast p1, Ll/w;

    iget-object p0, p1, Ll/w;->m:Ljava/lang/Throwable;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p1}, Ll/w;->n0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lq/q0;->p(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public final f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    invoke-static {v0}, Lj/t;->b(Lkotlin/coroutines/Continuation;)Lj/r;

    move-result-object v0

    new-instance v1, Ll/a$d;

    invoke-direct {v1, p0, v0}, Ll/a$d;-><init>(Ll/a$a;Lj/q;)V

    :cond_0
    iget-object v2, p0, Ll/a$a;->a:Ll/a;

    invoke-static {v2, v1}, Ll/a;->R(Ll/a;Ll/h0;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p0, p0, Ll/a$a;->a:Ll/a;

    invoke-static {p0, v0, v1}, Ll/a;->X(Ll/a;Lj/q;Ll/h0;)V

    goto :goto_2

    :cond_1
    iget-object v2, p0, Ll/a$a;->a:Ll/a;

    invoke-virtual {v2}, Ll/a;->l0()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/a$a;->g(Ljava/lang/Object;)V

    instance-of v3, v2, Ll/w;

    if-eqz v3, :cond_3

    check-cast v2, Ll/w;

    iget-object p0, v2, Ll/w;->m:Ljava/lang/Throwable;

    if-nez p0, :cond_2

    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    const/4 p0, 0x0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_0

    :cond_2
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-virtual {v2}, Ll/w;->n0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    sget-object v3, Ll/b;->f:Lq/r0;

    if-eq v2, v3, :cond_0

    const/4 v1, 0x1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object p0, p0, Ll/a$a;->a:Ll/a;

    iget-object p0, p0, Ll/c;->j:Lkotlin/jvm/functions/Function1;

    if-eqz p0, :cond_4

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    invoke-static {p0, v2, v3}, Lq/i0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    goto :goto_1

    :cond_4
    const/4 p0, 0x0

    :goto_1
    invoke-interface {v0, v1, p0}, Lj/q;->O(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    :goto_2
    invoke-virtual {v0}, Lj/r;->x()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_5

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_5
    return-object p0
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Ll/a$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, Ll/a$a;->b:Ljava/lang/Object;

    instance-of v1, v0, Ll/w;

    if-nez v1, :cond_1

    sget-object v1, Ll/b;->f:Lq/r0;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Ll/a$a;->b:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "\'hasNext\' should be called prior to \'next\' invocation"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    check-cast v0, Ll/w;

    invoke-virtual {v0}, Ll/w;->n0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lq/q0;->p(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method
