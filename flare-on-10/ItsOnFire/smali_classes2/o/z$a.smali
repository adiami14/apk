.class public final Lo/z$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/z;->d(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lo/i;Lo/d0;Lo/o0;Ljava/lang/Object;)Lj/n2;
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
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@"
    }
    d2 = {
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
    c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1"
    f = "Share.kt"
    i = {}
    l = {
        0xd6,
        0xda,
        0xdb,
        0xe1
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public j:I

.field public final synthetic k:Lo/o0;

.field public final synthetic l:Lo/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic m:Lo/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/d0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic n:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/o0;Lo/i;Lo/d0;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/o0;",
            "Lo/i<",
            "+TT;>;",
            "Lo/d0<",
            "TT;>;TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lo/z$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo/z$a;->k:Lo/o0;

    iput-object p2, p0, Lo/z$a;->l:Lo/i;

    iput-object p3, p0, Lo/z$a;->m:Lo/d0;

    iput-object p4, p0, Lo/z$a;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance p1, Lo/z$a;

    iget-object v1, p0, Lo/z$a;->k:Lo/o0;

    iget-object v2, p0, Lo/z$a;->l:Lo/i;

    iget-object v3, p0, Lo/z$a;->m:Lo/d0;

    iget-object v4, p0, Lo/z$a;->n:Ljava/lang/Object;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/z$a;-><init>(Lo/o0;Lo/i;Lo/d0;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    return-object p1
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

    invoke-virtual {p0, p1, p2}, Lo/z$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lo/z$a;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lo/z$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj/u0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lo/z$a;->invoke(Lj/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo/z$a;->j:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lo/z$a;->k:Lo/o0;

    sget-object v1, Lo/o0;->a:Lo/o0$a;

    invoke-virtual {v1}, Lo/o0$a;->c()Lo/o0;

    move-result-object v6

    if-ne p1, v6, :cond_4

    iget-object p1, p0, Lo/z$a;->l:Lo/i;

    iget-object v1, p0, Lo/z$a;->m:Lo/d0;

    iput v5, p0, Lo/z$a;->j:I

    invoke-interface {p1, v1, p0}, Lo/i;->collect(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_7

    return-object v0

    :cond_4
    iget-object p1, p0, Lo/z$a;->k:Lo/o0;

    invoke-virtual {v1}, Lo/o0$a;->d()Lo/o0;

    move-result-object v1

    const/4 v5, 0x0

    if-ne p1, v1, :cond_6

    iget-object p1, p0, Lo/z$a;->m:Lo/d0;

    invoke-interface {p1}, Lo/d0;->h()Lo/t0;

    move-result-object p1

    new-instance v1, Lo/z$a$a;

    invoke-direct {v1, v5}, Lo/z$a$a;-><init>(Lkotlin/coroutines/Continuation;)V

    iput v4, p0, Lo/z$a;->j:I

    invoke-static {p1, v1, p0}, Lo/k;->u0(Lo/i;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    iget-object p1, p0, Lo/z$a;->l:Lo/i;

    iget-object v1, p0, Lo/z$a;->m:Lo/d0;

    iput v3, p0, Lo/z$a;->j:I

    invoke-interface {p1, v1, p0}, Lo/i;->collect(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_7

    return-object v0

    :cond_6
    iget-object p1, p0, Lo/z$a;->k:Lo/o0;

    iget-object v1, p0, Lo/z$a;->m:Lo/d0;

    invoke-interface {v1}, Lo/d0;->h()Lo/t0;

    move-result-object v1

    invoke-interface {p1, v1}, Lo/o0;->a(Lo/t0;)Lo/i;

    move-result-object p1

    invoke-static {p1}, Lo/k;->g0(Lo/i;)Lo/i;

    move-result-object p1

    new-instance v1, Lo/z$a$b;

    iget-object v3, p0, Lo/z$a;->l:Lo/i;

    iget-object v4, p0, Lo/z$a;->m:Lo/d0;

    iget-object v6, p0, Lo/z$a;->n:Ljava/lang/Object;

    invoke-direct {v1, v3, v4, v6, v5}, Lo/z$a$b;-><init>(Lo/i;Lo/d0;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput v2, p0, Lo/z$a;->j:I

    invoke-static {p1, v1, p0}, Lo/k;->A(Lo/i;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
