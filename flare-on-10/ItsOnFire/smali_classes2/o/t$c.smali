.class public final Lo/t$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/t;->e(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/i<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0007\u00b8\u0006\u0000"
    }
    d2 = {
        "p/x$b",
        "Lo/i;",
        "Lo/j;",
        "collector",
        "",
        "collect",
        "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field public final synthetic j:Lo/i;

.field public final synthetic k:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lo/i;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    iput-object p1, p0, Lo/t$c;->j:Lo/i;

    iput-object p2, p0, Lo/t$c;->k:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lo/j;
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

    instance-of v0, p2, Lo/t$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo/t$c$a;

    iget v1, v0, Lo/t$c$a;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo/t$c$a;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo/t$c$a;

    invoke-direct {v0, p0, p2}, Lo/t$c$a;-><init>(Lo/t$c;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lo/t$c$a;->j:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo/t$c$a;->k:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lo/t$c$a;->m:Ljava/lang/Object;

    check-cast p0, Lp/v;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lo/t$c$a;->o:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object p1, v0, Lo/t$c$a;->n:Ljava/lang/Object;

    check-cast p1, Lo/j;

    iget-object v2, v0, Lo/t$c$a;->m:Ljava/lang/Object;

    check-cast v2, Lo/t$c;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    iput-boolean v4, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    iget-object v2, p0, Lo/t$c;->j:Lo/i;

    new-instance v5, Lo/t$d;

    invoke-direct {v5, p2, p1}, Lo/t$d;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lo/j;)V

    iput-object p0, v0, Lo/t$c$a;->m:Ljava/lang/Object;

    iput-object p1, v0, Lo/t$c$a;->n:Ljava/lang/Object;

    iput-object p2, v0, Lo/t$c$a;->o:Ljava/lang/Object;

    iput v4, v0, Lo/t$c$a;->k:I

    invoke-interface {v2, v5, v0}, Lo/i;->collect(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    move-object p0, p2

    :goto_1
    iget-boolean p0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz p0, :cond_6

    new-instance p0, Lp/v;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lp/v;-><init>(Lo/j;Lkotlin/coroutines/CoroutineContext;)V

    :try_start_1
    iget-object p1, v2, Lo/t$c;->k:Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lo/t$c$a;->m:Ljava/lang/Object;

    const/4 p2, 0x0

    iput-object p2, v0, Lo/t$c$a;->n:Ljava/lang/Object;

    iput-object p2, v0, Lo/t$c$a;->o:Ljava/lang/Object;

    iput v3, v0, Lo/t$c$a;->k:I

    const/4 p2, 0x6

    invoke-static {p2}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    invoke-interface {p1, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x7

    invoke-static {p2}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Lp/v;->releaseIntercepted()V

    goto :goto_4

    :goto_3
    invoke-virtual {p0}, Lp/v;->releaseIntercepted()V

    throw p1

    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
