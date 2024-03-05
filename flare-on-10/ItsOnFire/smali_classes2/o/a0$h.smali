.class public final Lo/a0$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/a0;->h(Lo/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lo/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/i<",
        "TR;>;"
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
.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lo/i;

.field public final synthetic l:Lkotlin/jvm/functions/Function3;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lo/i;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    iput-object p1, p0, Lo/a0$h;->j:Ljava/lang/Object;

    iput-object p2, p0, Lo/a0$h;->k:Lo/i;

    iput-object p3, p0, Lo/a0$h;->l:Lkotlin/jvm/functions/Function3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p2, Lo/a0$h$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo/a0$h$a;

    iget v1, v0, Lo/a0$h$a;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo/a0$h$a;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo/a0$h$a;

    invoke-direct {v0, p0, p2}, Lo/a0$h$a;-><init>(Lo/a0$h;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lo/a0$h$a;->j:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo/a0$h$a;->k:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lo/a0$h$a;->o:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, v0, Lo/a0$h$a;->n:Ljava/lang/Object;

    check-cast p1, Lo/j;

    iget-object v2, v0, Lo/a0$h$a;->m:Ljava/lang/Object;

    check-cast v2, Lo/a0$h;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p2, p0

    move-object p0, v2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v2, p0, Lo/a0$h;->j:Ljava/lang/Object;

    iput-object v2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iput-object p0, v0, Lo/a0$h$a;->m:Ljava/lang/Object;

    iput-object p1, v0, Lo/a0$h$a;->n:Ljava/lang/Object;

    iput-object p2, v0, Lo/a0$h$a;->o:Ljava/lang/Object;

    iput v4, v0, Lo/a0$h$a;->k:I

    invoke-interface {p1, v2, v0}, Lo/j;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    iget-object v2, p0, Lo/a0$h;->k:Lo/i;

    new-instance v4, Lo/a0$i;

    iget-object p0, p0, Lo/a0$h;->l:Lkotlin/jvm/functions/Function3;

    invoke-direct {v4, p2, p0, p1}, Lo/a0$i;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function3;Lo/j;)V

    const/4 p0, 0x0

    iput-object p0, v0, Lo/a0$h$a;->m:Ljava/lang/Object;

    iput-object p0, v0, Lo/a0$h$a;->n:Ljava/lang/Object;

    iput-object p0, v0, Lo/a0$h$a;->o:Ljava/lang/Object;

    iput v3, v0, Lo/a0$h$a;->k:I

    invoke-interface {v2, v4, v0}, Lo/i;->collect(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
