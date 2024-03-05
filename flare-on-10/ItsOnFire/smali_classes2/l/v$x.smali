.class public final Ll/v$x;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll/v;->E(Ll/i0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ll/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ll/g0<",
        "-TR;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"
    }
    d2 = {
        "E",
        "R",
        "Ll/g0;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1"
    f = "Deprecated.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x1e7,
        0x14d,
        0x14d
    }
    m = "invokeSuspend"
    n = {
        "$this$produce",
        "$this$consume$iv$iv",
        "$this$produce",
        "$this$consume$iv$iv",
        "$this$produce",
        "$this$consume$iv$iv"
    }
    s = {
        "L$0",
        "L$2",
        "L$0",
        "L$2",
        "L$0",
        "L$2"
    }
.end annotation


# instance fields
.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ll/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/i0<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final synthetic q:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TE;",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll/i0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/i0<",
            "+TE;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TE;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ll/v$x;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ll/v$x;->p:Ll/i0;

    iput-object p2, p0, Ll/v$x;->q:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ll/v$x;

    iget-object v1, p0, Ll/v$x;->p:Ll/i0;

    iget-object p0, p0, Ll/v$x;->q:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, p0, p2}, Ll/v$x;-><init>(Ll/i0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Ll/v$x;->o:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll/g0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Ll/v$x;->invoke(Ll/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Ll/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ll/g0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/g0<",
            "-TR;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Ll/v$x;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Ll/v$x;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Ll/v$x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ll/v$x;->n:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Ll/v$x;->l:Ljava/lang/Object;

    check-cast v1, Ll/p;

    iget-object v6, p0, Ll/v$x;->k:Ljava/lang/Object;

    check-cast v6, Ll/i0;

    iget-object v7, p0, Ll/v$x;->j:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function2;

    iget-object v8, p0, Ll/v$x;->o:Ljava/lang/Object;

    check-cast v8, Ll/g0;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object p1, v8

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object v1, p0, Ll/v$x;->m:Ljava/lang/Object;

    check-cast v1, Ll/g0;

    iget-object v6, p0, Ll/v$x;->l:Ljava/lang/Object;

    check-cast v6, Ll/p;

    iget-object v7, p0, Ll/v$x;->k:Ljava/lang/Object;

    check-cast v7, Ll/i0;

    iget-object v8, p0, Ll/v$x;->j:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function2;

    iget-object v9, p0, Ll/v$x;->o:Ljava/lang/Object;

    check-cast v9, Ll/g0;

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p0

    move-object v6, v7

    goto/16 :goto_3

    :cond_2
    iget-object v1, p0, Ll/v$x;->l:Ljava/lang/Object;

    check-cast v1, Ll/p;

    iget-object v6, p0, Ll/v$x;->k:Ljava/lang/Object;

    check-cast v6, Ll/i0;

    iget-object v7, p0, Ll/v$x;->j:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function2;

    iget-object v8, p0, Ll/v$x;->o:Ljava/lang/Object;

    check-cast v8, Ll/g0;

    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Ll/v$x;->o:Ljava/lang/Object;

    check-cast p1, Ll/g0;

    iget-object v6, p0, Ll/v$x;->p:Ll/i0;

    iget-object v1, p0, Ll/v$x;->q:Lkotlin/jvm/functions/Function2;

    :try_start_3
    invoke-interface {v6}, Ll/i0;->iterator()Ll/p;

    move-result-object v7

    move-object v10, v7

    move-object v7, v1

    move-object v1, v10

    :goto_0
    iput-object p1, p0, Ll/v$x;->o:Ljava/lang/Object;

    iput-object v7, p0, Ll/v$x;->j:Ljava/lang/Object;

    iput-object v6, p0, Ll/v$x;->k:Ljava/lang/Object;

    iput-object v1, p0, Ll/v$x;->l:Ljava/lang/Object;

    iput v5, p0, Ll/v$x;->n:I

    invoke-interface {v1, p0}, Ll/p;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_4

    return-object v0

    :cond_4
    move-object v10, v8

    move-object v8, p1

    move-object p1, v10

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v1}, Ll/p;->next()Ljava/lang/Object;

    move-result-object p1

    iput-object v8, p0, Ll/v$x;->o:Ljava/lang/Object;

    iput-object v7, p0, Ll/v$x;->j:Ljava/lang/Object;

    iput-object v6, p0, Ll/v$x;->k:Ljava/lang/Object;

    iput-object v1, p0, Ll/v$x;->l:Ljava/lang/Object;

    iput-object v8, p0, Ll/v$x;->m:Ljava/lang/Object;

    iput v4, p0, Ll/v$x;->n:I

    invoke-interface {v7, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v1

    move-object v1, v9

    :goto_2
    :try_start_4
    iput-object v9, p0, Ll/v$x;->o:Ljava/lang/Object;

    iput-object v8, p0, Ll/v$x;->j:Ljava/lang/Object;

    iput-object v7, p0, Ll/v$x;->k:Ljava/lang/Object;

    iput-object v6, p0, Ll/v$x;->l:Ljava/lang/Object;

    iput-object v2, p0, Ll/v$x;->m:Ljava/lang/Object;

    iput v3, p0, Ll/v$x;->n:I

    invoke-interface {v1, p1, p0}, Ll/m0;->U(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v1, v6

    move-object v6, v7

    move-object v7, v8

    move-object p1, v9

    goto :goto_0

    :cond_7
    :try_start_5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-static {v6, v2}, Ll/s;->b(Ll/i0;Ljava/lang/Throwable;)V

    return-object p0

    :catchall_1
    move-exception p0

    :goto_3
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {v6, p0}, Ll/s;->b(Ll/i0;Ljava/lang/Throwable;)V

    throw p1
.end method
