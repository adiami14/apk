.class public final Lo/r$e;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/r;->h(Lo/i;J)Lo/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lj/u0;",
        "Lo/j<",
        "-TT;>;",
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
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"
    }
    d2 = {
        "T",
        "Lj/u0;",
        "Lo/j;",
        "downstream",
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
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2"
    f = "Delay.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x160
    }
    m = "invokeSuspend"
    n = {
        "downstream",
        "values",
        "lastValue",
        "ticker"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation


# instance fields
.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:J

.field public final synthetic p:Lo/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/i<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLo/i;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lo/i<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lo/r$e;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lo/r$e;->o:J

    iput-object p3, p0, Lo/r$e;->p:Lo/i;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final i(Lj/u0;Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lj/u0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lo/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/u0;",
            "Lo/j<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lo/r$e;

    iget-wide v1, p0, Lo/r$e;->o:J

    iget-object p0, p0, Lo/r$e;->p:Lo/i;

    invoke-direct {v0, v1, v2, p0, p3}, Lo/r$e;-><init>(JLo/i;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lo/r$e;->m:Ljava/lang/Object;

    iput-object p2, v0, Lo/r$e;->n:Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p0}, Lo/r$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj/u0;

    check-cast p2, Lo/j;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lo/r$e;->i(Lj/u0;Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo/r$e;->l:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lo/r$e;->k:Ljava/lang/Object;

    check-cast v1, Ll/i0;

    iget-object v4, p0, Lo/r$e;->j:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v5, p0, Lo/r$e;->n:Ljava/lang/Object;

    check-cast v5, Ll/i0;

    iget-object v6, p0, Lo/r$e;->m:Ljava/lang/Object;

    check-cast v6, Lo/j;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lo/r$e;->m:Ljava/lang/Object;

    check-cast p1, Lj/u0;

    iget-object v1, p0, Lo/r$e;->n:Ljava/lang/Object;

    check-cast v1, Lo/j;

    const/4 v5, 0x0

    const/4 v6, -0x1

    new-instance v7, Lo/r$e$c;

    iget-object v4, p0, Lo/r$e;->p:Lo/i;

    invoke-direct {v7, v4, v3}, Lo/r$e$c;-><init>(Lo/i;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Ll/e0;->g(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ll/i0;

    move-result-object v11

    new-instance v12, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v12}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-wide v5, p0, Lo/r$e;->o:J

    const-wide/16 v7, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lo/k;->y0(Lj/u0;JJILjava/lang/Object;)Ll/i0;

    move-result-object p1

    move-object v6, v1

    move-object v5, v11

    move-object v4, v12

    move-object v1, p1

    :cond_2
    :goto_0
    iget-object p1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v7, Lp/u;->c:Lq/r0;

    if-eq p1, v7, :cond_4

    iput-object v6, p0, Lo/r$e;->m:Ljava/lang/Object;

    iput-object v5, p0, Lo/r$e;->n:Ljava/lang/Object;

    iput-object v4, p0, Lo/r$e;->j:Ljava/lang/Object;

    iput-object v1, p0, Lo/r$e;->k:Ljava/lang/Object;

    iput v2, p0, Lo/r$e;->l:I

    new-instance p1, Lt/b;

    invoke-direct {p1, p0}, Lt/b;-><init>(Lkotlin/coroutines/Continuation;)V

    :try_start_0
    invoke-interface {v5}, Ll/i0;->p()Lt/d;

    move-result-object v7

    new-instance v8, Lo/r$e$a;

    invoke-direct {v8, v4, v1, v3}, Lo/r$e$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Ll/i0;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p1, v7, v8}, Lt/a;->g(Lt/d;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, Ll/i0;->o()Lt/d;

    move-result-object v7

    new-instance v8, Lo/r$e$b;

    invoke-direct {v8, v4, v6, v3}, Lo/r$e$b;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lo/j;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p1, v7, v8}, Lt/a;->g(Lt/d;Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v7

    invoke-virtual {p1, v7}, Lt/b;->p0(Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {p1}, Lt/b;->o0()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    if-ne p1, v7, :cond_3

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne p1, v0, :cond_2

    return-object v0

    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
