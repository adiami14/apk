.class public final Lp/j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo/j;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "R",
        "value",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic j:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lj/n2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:Lj/u0;

.field public final synthetic l:Lp/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/j<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field public final synthetic m:Lo/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/j<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lj/u0;Lp/j;Lo/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lj/n2;",
            ">;",
            "Lj/u0;",
            "Lp/j<",
            "TT;TR;>;",
            "Lo/j<",
            "-TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lp/j$a$a;->j:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lp/j$a$a;->k:Lj/u0;

    iput-object p3, p0, Lp/j$a$a;->l:Lp/j;

    iput-object p4, p0, Lp/j$a$a;->m:Lo/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lp/j$a$a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp/j$a$a$b;

    iget v1, v0, Lp/j$a$a$b;->o:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp/j$a$a$b;->o:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp/j$a$a$b;

    invoke-direct {v0, p0, p2}, Lp/j$a$a$b;-><init>(Lp/j$a$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lp/j$a$a$b;->m:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lp/j$a$a$b;->o:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lp/j$a$a$b;->l:Ljava/lang/Object;

    check-cast p0, Lj/n2;

    iget-object p0, v0, Lp/j$a$a$b;->k:Ljava/lang/Object;

    iget-object p1, v0, Lp/j$a$a$b;->j:Ljava/lang/Object;

    check-cast p1, Lp/j$a$a;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lp/j$a$a;->j:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lj/n2;

    if-eqz p2, :cond_3

    new-instance v2, Lp/l;

    invoke-direct {v2}, Lp/l;-><init>()V

    invoke-interface {p2, v2}, Lj/n2;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, Lp/j$a$a$b;->j:Ljava/lang/Object;

    iput-object p1, v0, Lp/j$a$a$b;->k:Ljava/lang/Object;

    iput-object p2, v0, Lp/j$a$a$b;->l:Ljava/lang/Object;

    iput v3, v0, Lp/j$a$a$b;->o:I

    invoke-interface {p2, v0}, Lj/n2;->n(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p2, p0, Lp/j$a$a;->j:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, p0, Lp/j$a$a;->k:Lj/u0;

    const/4 v1, 0x0

    sget-object v2, Lj/w0;->m:Lj/w0;

    new-instance v3, Lp/j$a$a$a;

    iget-object v4, p0, Lp/j$a$a;->l:Lp/j;

    iget-object p0, p0, Lp/j$a$a;->m:Lo/j;

    const/4 v5, 0x0

    invoke-direct {v3, v4, p0, p1, v5}, Lp/j$a$a$a;-><init>(Lp/j;Lo/j;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x1

    invoke-static/range {v0 .. v5}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    move-result-object p0

    iput-object p0, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
