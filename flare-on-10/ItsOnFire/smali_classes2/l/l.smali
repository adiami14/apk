.class public final Ll/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a2\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u00a0\u0001\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042-\u0008\u0002\u0010\u0012\u001a\'\u0012\u0015\u0012\u0013\u0018\u00010\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\u0008\u0001\u0010\u0018\u001a)\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013\u00a2\u0006\u0002\u0008\u0017H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "E",
        "Ll/i0;",
        "",
        "capacity",
        "Lj/w0;",
        "start",
        "Ll/i;",
        "b",
        "Lj/u0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "cause",
        "",
        "Lkotlinx/coroutines/CompletionHandler;",
        "onCompletion",
        "Lkotlin/Function2;",
        "Ll/g0;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "block",
        "a",
        "(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILj/w0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ll/i;",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILj/w0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ll/i;
    .locals 1
    .param p0    # Lj/u0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lj/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function2;
        .annotation build Lkotlin/BuilderInference;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/u0;",
            "Lkotlin/coroutines/CoroutineContext;",
            "I",
            "Lj/w0;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ll/g0<",
            "-TE;>;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ll/i<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lj/e3;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p1}, Lj/n0;->d(Lj/u0;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    invoke-static {p2}, Ll/j;->a(I)Ll/i;

    move-result-object p1

    invoke-virtual {p3}, Lj/w0;->d()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ll/c0;

    invoke-direct {p2, p0, p1, p5}, Ll/c0;-><init>(Lkotlin/coroutines/CoroutineContext;Ll/i;Lkotlin/jvm/functions/Function2;)V

    goto :goto_0

    :cond_0
    new-instance p2, Ll/k;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Ll/k;-><init>(Lkotlin/coroutines/CoroutineContext;Ll/i;Z)V

    :goto_0
    if-eqz p4, :cond_1

    invoke-virtual {p2, p4}, Lj/v2;->H(Lkotlin/jvm/functions/Function1;)Lj/p1;

    :cond_1
    invoke-virtual {p2, p3, p2, p5}, Lj/a;->w1(Lj/w0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    return-object p2
.end method

.method public static final b(Ll/i0;ILj/w0;)Ll/i;
    .locals 11
    .param p0    # Ll/i0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lj/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ll/i0<",
            "+TE;>;I",
            "Lj/w0;",
            ")",
            "Ll/i<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lj/e3;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lj/e2;->j:Lj/e2;

    invoke-static {}, Lj/m1;->g()Lj/o0;

    move-result-object v1

    invoke-static {v0, v1}, Lj/v0;->m(Lj/u0;Lkotlin/coroutines/CoroutineContext;)Lj/u0;

    move-result-object v0

    sget-object v1, Lj/p0;->a:Lj/p0$b;

    new-instance v2, Ll/l$a;

    invoke-direct {v2, v1}, Ll/l$a;-><init>(Lj/p0$b;)V

    invoke-static {v0, v2}, Lj/v0;->m(Lj/u0;Lkotlin/coroutines/CoroutineContext;)Lj/u0;

    move-result-object v3

    new-instance v7, Ll/l$b;

    invoke-direct {v7, p0}, Ll/l$b;-><init>(Ll/i0;)V

    new-instance v8, Ll/l$c;

    const/4 v0, 0x0

    invoke-direct {v8, p0, v0}, Ll/l$c;-><init>(Ll/i0;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move v5, p1

    move-object v6, p2

    invoke-static/range {v3 .. v10}, Ll/l;->c(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILj/w0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ll/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILj/w0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ll/i;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    :cond_1
    move v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    sget-object p3, Lj/w0;->k:Lj/w0;

    :cond_2
    move-object v3, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    :cond_3
    move-object v4, p4

    move-object v0, p0

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Ll/l;->a(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILj/w0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ll/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll/i0;ILj/w0;ILjava/lang/Object;)Ll/i;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lj/w0;->k:Lj/w0;

    :cond_1
    invoke-static {p0, p1, p2}, Ll/l;->b(Ll/i0;ILj/w0;)Ll/i;

    move-result-object p0

    return-object p0
.end method
