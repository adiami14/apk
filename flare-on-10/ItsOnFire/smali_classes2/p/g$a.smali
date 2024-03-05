.class public final Lp/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp/g;->i(Ll/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    bv = {}
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "Lo/i;",
        "inner",
        "",
        "a",
        "(Lo/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic j:Lj/n2;

.field public final synthetic k:Lu/f;

.field public final synthetic l:Ll/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/g0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic m:Lp/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/y<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj/n2;Lu/f;Ll/g0;Lp/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/n2;",
            "Lu/f;",
            "Ll/g0<",
            "-TT;>;",
            "Lp/y<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lp/g$a;->j:Lj/n2;

    iput-object p2, p0, Lp/g$a;->k:Lu/f;

    iput-object p3, p0, Lp/g$a;->l:Ll/g0;

    iput-object p4, p0, Lp/g$a;->m:Lp/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lo/i;
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
            "Lo/i<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lp/g$a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp/g$a$b;

    iget v1, v0, Lp/g$a$b;->n:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp/g$a$b;->n:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp/g$a$b;

    invoke-direct {v0, p0, p2}, Lp/g$a$b;-><init>(Lp/g$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lp/g$a$b;->l:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lp/g$a$b;->n:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lp/g$a$b;->k:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lo/i;

    iget-object p0, v0, Lp/g$a$b;->j:Ljava/lang/Object;

    check-cast p0, Lp/g$a;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lp/g$a;->j:Lj/n2;

    if-eqz p2, :cond_3

    invoke-static {p2}, Lj/r2;->z(Lj/n2;)V

    :cond_3
    iget-object p2, p0, Lp/g$a;->k:Lu/f;

    iput-object p0, v0, Lp/g$a$b;->j:Ljava/lang/Object;

    iput-object p1, v0, Lp/g$a$b;->k:Ljava/lang/Object;

    iput v3, v0, Lp/g$a$b;->n:I

    invoke-interface {p2, v0}, Lu/f;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    iget-object v0, p0, Lp/g$a;->l:Ll/g0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lp/g$a$a;

    iget-object p2, p0, Lp/g$a;->m:Lp/y;

    iget-object p0, p0, Lp/g$a;->k:Lu/f;

    const/4 v4, 0x0

    invoke-direct {v3, p1, p2, p0, v4}, Lp/g$a$a;-><init>(Lo/i;Lp/y;Lu/f;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo/i;

    invoke-virtual {p0, p1, p2}, Lp/g$a;->a(Lo/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
