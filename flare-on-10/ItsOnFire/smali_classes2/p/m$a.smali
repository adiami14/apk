.class public final Lp/m$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp/m;->a(Lo/j;[Lo/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lj/u0;",
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
        "\u0000\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "R",
        "T",
        "Lj/u0;",
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
    c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2"
    f = "Combine.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x39,
        0x4f,
        0x52
    }
    m = "invokeSuspend"
    n = {
        "latestValues",
        "resultChannel",
        "lastReceivedEpoch",
        "remainingAbsentValues",
        "currentEpoch",
        "latestValues",
        "resultChannel",
        "lastReceivedEpoch",
        "remainingAbsentValues",
        "currentEpoch",
        "latestValues",
        "resultChannel",
        "lastReceivedEpoch",
        "remainingAbsentValues",
        "currentEpoch"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1"
    }
.end annotation


# instance fields
.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:I

.field public m:I

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:[Lo/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lo/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic q:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "[TT;>;"
        }
    .end annotation
.end field

.field public final synthetic r:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lo/j<",
            "-TR;>;[TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic s:Lo/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/j<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Lo/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lo/j;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lo/i<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function0<",
            "[TT;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lo/j<",
            "-TR;>;-[TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lo/j<",
            "-TR;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lp/m$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp/m$a;->p:[Lo/i;

    iput-object p2, p0, Lp/m$a;->q:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lp/m$a;->r:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lp/m$a;->s:Lo/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v6, Lp/m$a;

    iget-object v1, p0, Lp/m$a;->p:[Lo/i;

    iget-object v2, p0, Lp/m$a;->q:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lp/m$a;->r:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lp/m$a;->s:Lo/j;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lp/m$a;-><init>([Lo/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lo/j;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lp/m$a;->o:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Lj/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lj/u0;
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
            "Lj/u0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lp/m$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lp/m$a;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lp/m$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj/u0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lp/m$a;->invoke(Lj/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lp/m$a;->n:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget v2, v0, Lp/m$a;->m:I

    iget v3, v0, Lp/m$a;->l:I

    iget-object v7, v0, Lp/m$a;->k:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v0, Lp/m$a;->j:Ljava/lang/Object;

    check-cast v8, Ll/n;

    iget-object v9, v0, Lp/m$a;->o:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v13, v3

    move-object v14, v9

    move v3, v2

    move-object v2, v7

    move-object v7, v8

    goto/16 :goto_2

    :cond_2
    iget v2, v0, Lp/m$a;->m:I

    iget v3, v0, Lp/m$a;->l:I

    iget-object v7, v0, Lp/m$a;->k:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v0, Lp/m$a;->j:Ljava/lang/Object;

    check-cast v8, Ll/n;

    iget-object v9, v0, Lp/m$a;->o:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v10, p1

    check-cast v10, Ll/r;

    invoke-virtual {v10}, Ll/r;->o()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v22, v7

    move v7, v2

    move-object/from16 v2, v22

    goto/16 :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lp/m$a;->o:Ljava/lang/Object;

    check-cast v2, Lj/u0;

    iget-object v7, v0, Lp/m$a;->p:[Lo/i;

    array-length v13, v7

    if-nez v13, :cond_4

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_4
    new-array v14, v13, [Ljava/lang/Object;

    sget-object v8, Lp/u;->b:Lq/r0;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v7, v14

    invoke-static/range {v7 .. v12}, Lkotlin/collections/ArraysKt;->fill$default([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static {v13, v8, v8, v7, v8}, Ll/q;->d(ILl/m;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ll/n;

    move-result-object v21

    new-instance v12, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v12, v13}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    move v11, v3

    :goto_1
    if-ge v11, v13, :cond_5

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lp/m$a$a;

    iget-object v7, v0, Lp/m$a;->p:[Lo/i;

    const/16 v20, 0x0

    move-object v15, v10

    move-object/from16 v16, v7

    move/from16 v17, v11

    move-object/from16 v18, v12

    move-object/from16 v19, v21

    invoke-direct/range {v15 .. v20}, Lp/m$a$a;-><init>([Lo/i;ILjava/util/concurrent/atomic/AtomicInteger;Ll/n;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    move-object v7, v2

    move v11, v15

    move-object v15, v12

    move-object/from16 v12, v16

    invoke-static/range {v7 .. v12}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    add-int/lit8 v11, v17, 0x1

    move-object v12, v15

    goto :goto_1

    :cond_5
    new-array v2, v13, [B

    move-object/from16 v7, v21

    :goto_2
    add-int/2addr v3, v6

    int-to-byte v3, v3

    iput-object v14, v0, Lp/m$a;->o:Ljava/lang/Object;

    iput-object v7, v0, Lp/m$a;->j:Ljava/lang/Object;

    iput-object v2, v0, Lp/m$a;->k:Ljava/lang/Object;

    iput v13, v0, Lp/m$a;->l:I

    iput v3, v0, Lp/m$a;->m:I

    iput v6, v0, Lp/m$a;->n:I

    invoke-interface {v7, v0}, Ll/i0;->z(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_6

    return-object v1

    :cond_6
    move-object v8, v7

    move-object v9, v14

    move v7, v3

    move v3, v13

    :goto_3
    invoke-static {v10}, Ll/r;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lkotlin/collections/IndexedValue;

    if-nez v10, :cond_7

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_7
    invoke-virtual {v10}, Lkotlin/collections/IndexedValue;->getIndex()I

    move-result v11

    aget-object v12, v9, v11

    invoke-virtual {v10}, Lkotlin/collections/IndexedValue;->getValue()Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v9, v11

    sget-object v10, Lp/u;->b:Lq/r0;

    if-ne v12, v10, :cond_8

    add-int/lit8 v3, v3, -0x1

    :cond_8
    aget-byte v10, v2, v11

    if-eq v10, v7, :cond_9

    int-to-byte v10, v7

    aput-byte v10, v2, v11

    invoke-interface {v8}, Ll/i0;->v()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Ll/r;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lkotlin/collections/IndexedValue;

    if-nez v10, :cond_7

    :cond_9
    if-nez v3, :cond_b

    iget-object v10, v0, Lp/m$a;->q:Lkotlin/jvm/functions/Function0;

    invoke-interface {v10}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ljava/lang/Object;

    if-nez v10, :cond_a

    iget-object v10, v0, Lp/m$a;->r:Lkotlin/jvm/functions/Function3;

    iget-object v11, v0, Lp/m$a;->s:Lo/j;

    iput-object v9, v0, Lp/m$a;->o:Ljava/lang/Object;

    iput-object v8, v0, Lp/m$a;->j:Ljava/lang/Object;

    iput-object v2, v0, Lp/m$a;->k:Ljava/lang/Object;

    iput v3, v0, Lp/m$a;->l:I

    iput v7, v0, Lp/m$a;->m:I

    iput v5, v0, Lp/m$a;->n:I

    invoke-interface {v10, v11, v9, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_b

    return-object v1

    :cond_a
    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0xe

    const/16 v17, 0x0

    move-object v11, v9

    move-object v12, v10

    invoke-static/range {v11 .. v17}, Lkotlin/collections/ArraysKt;->copyInto$default([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    iget-object v11, v0, Lp/m$a;->r:Lkotlin/jvm/functions/Function3;

    iget-object v12, v0, Lp/m$a;->s:Lo/j;

    iput-object v9, v0, Lp/m$a;->o:Ljava/lang/Object;

    iput-object v8, v0, Lp/m$a;->j:Ljava/lang/Object;

    iput-object v2, v0, Lp/m$a;->k:Ljava/lang/Object;

    iput v3, v0, Lp/m$a;->l:I

    iput v7, v0, Lp/m$a;->m:I

    iput v4, v0, Lp/m$a;->n:I

    invoke-interface {v11, v12, v10, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_b

    return-object v1

    :cond_b
    move v13, v3

    move v3, v7

    move-object v7, v8

    move-object v14, v9

    goto/16 :goto_2
.end method
