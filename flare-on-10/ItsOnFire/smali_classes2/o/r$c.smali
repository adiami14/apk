.class public final Lo/r$c;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/r;->e(Lo/i;Lkotlin/jvm/functions/Function1;)Lo/i;
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
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1"
    f = "Delay.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xde,
        0x163
    }
    m = "invokeSuspend"
    n = {
        "downstream",
        "values",
        "lastValue",
        "timeoutMillis",
        "downstream",
        "values",
        "lastValue",
        "timeoutMillis"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
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

.field public final synthetic o:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic p:Lo/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/i<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lo/i;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Long;",
            ">;",
            "Lo/i<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lo/r$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo/r$c;->o:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lo/r$c;->p:Lo/i;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final i(Lj/u0;Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    new-instance v0, Lo/r$c;

    iget-object v1, p0, Lo/r$c;->o:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lo/r$c;->p:Lo/i;

    invoke-direct {v0, v1, p0, p3}, Lo/r$c;-><init>(Lkotlin/jvm/functions/Function1;Lo/i;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lo/r$c;->m:Ljava/lang/Object;

    iput-object p2, v0, Lo/r$c;->n:Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p0}, Lo/r$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj/u0;

    check-cast p2, Lo/j;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lo/r$c;->i(Lj/u0;Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo/r$c;->l:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lo/r$c;->k:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v1, p0, Lo/r$c;->j:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v5, p0, Lo/r$c;->n:Ljava/lang/Object;

    check-cast v5, Ll/i0;

    iget-object v6, p0, Lo/r$c;->m:Ljava/lang/Object;

    check-cast v6, Lo/j;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_0
    move-object v7, v6

    move-object v6, v5

    move-object v5, v1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object v1, p0, Lo/r$c;->k:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v5, p0, Lo/r$c;->j:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, p0, Lo/r$c;->n:Ljava/lang/Object;

    check-cast v6, Ll/i0;

    iget-object v7, p0, Lo/r$c;->m:Ljava/lang/Object;

    check-cast v7, Lo/j;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lo/r$c;->m:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lj/u0;

    iget-object p1, p0, Lo/r$c;->n:Ljava/lang/Object;

    check-cast p1, Lo/j;

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lo/r$c$c;

    iget-object v1, p0, Lo/r$c;->p:Lo/i;

    invoke-direct {v8, v1, v4}, Lo/r$c$c;-><init>(Lo/i;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Ll/e0;->g(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ll/i0;

    move-result-object v1

    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    move-object v7, p1

    move-object v6, v1

    :goto_0
    iget-object p1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v1, Lp/u;->c:Lq/r0;

    if-eq p1, v1, :cond_c

    new-instance v1, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    iget-object p1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz p1, :cond_8

    iget-object v8, p0, Lo/r$c;->o:Lkotlin/jvm/functions/Function1;

    sget-object v9, Lp/u;->a:Lq/r0;

    if-ne p1, v9, :cond_4

    move-object p1, v4

    :cond_4
    invoke-interface {v8, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    iput-wide v10, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    const-wide/16 v12, 0x0

    cmp-long p1, v10, v12

    if-ltz p1, :cond_5

    move p1, v3

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_9

    cmp-long p1, v10, v12

    if-nez p1, :cond_8

    iget-object p1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-ne p1, v9, :cond_6

    move-object p1, v4

    :cond_6
    iput-object v7, p0, Lo/r$c;->m:Ljava/lang/Object;

    iput-object v6, p0, Lo/r$c;->n:Ljava/lang/Object;

    iput-object v5, p0, Lo/r$c;->j:Ljava/lang/Object;

    iput-object v1, p0, Lo/r$c;->k:Ljava/lang/Object;

    iput v3, p0, Lo/r$c;->l:I

    invoke-interface {v7, p1, p0}, Lo/j;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    iput-object v4, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :cond_8
    move-object p1, v1

    move-object v1, v5

    move-object v5, v6

    move-object v6, v7

    goto :goto_3

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Debounce timeout should not be negative"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_3
    iput-object v6, p0, Lo/r$c;->m:Ljava/lang/Object;

    iput-object v5, p0, Lo/r$c;->n:Ljava/lang/Object;

    iput-object v1, p0, Lo/r$c;->j:Ljava/lang/Object;

    iput-object p1, p0, Lo/r$c;->k:Ljava/lang/Object;

    iput v2, p0, Lo/r$c;->l:I

    new-instance v7, Lt/b;

    invoke-direct {v7, p0}, Lt/b;-><init>(Lkotlin/coroutines/Continuation;)V

    :try_start_0
    iget-object v8, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz v8, :cond_a

    iget-wide v8, p1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    new-instance p1, Lo/r$c$a;

    invoke-direct {p1, v6, v1, v4}, Lo/r$c$a;-><init>(Lo/j;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v7, v8, v9, p1}, Lt/a;->p(JLkotlin/jvm/functions/Function1;)V

    :cond_a
    invoke-interface {v5}, Ll/i0;->p()Lt/d;

    move-result-object p1

    new-instance v8, Lo/r$c$b;

    invoke-direct {v8, v1, v6, v4}, Lo/r$c$b;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lo/j;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v7, p1, v8}, Lt/a;->g(Lt/d;Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p1

    invoke-virtual {v7, p1}, Lt/b;->p0(Ljava/lang/Throwable;)V

    :goto_4
    invoke-virtual {v7}, Lt/b;->o0()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    if-ne p1, v7, :cond_b

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_b
    if-ne p1, v0, :cond_0

    return-object v0

    :cond_c
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
