.class public final Lo/l$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/l;->h([I)Lo/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/i<",
        "Ljava/lang/Integer;",
        ">;"
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
.field public final synthetic j:[I


# direct methods
.method public constructor <init>([I)V
    .locals 0

    iput-object p1, p0, Lo/l$h;->j:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
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
            "-",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lo/l$h$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo/l$h$a;

    iget v1, v0, Lo/l$h$a;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo/l$h$a;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo/l$h$a;

    invoke-direct {v0, p0, p2}, Lo/l$h$a;-><init>(Lo/l$h;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lo/l$h$a;->j:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo/l$h$a;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lo/l$h$a;->p:I

    iget p1, v0, Lo/l$h$a;->o:I

    iget-object v2, v0, Lo/l$h$a;->n:Ljava/lang/Object;

    check-cast v2, [I

    iget-object v4, v0, Lo/l$h$a;->m:Ljava/lang/Object;

    check-cast v4, Lo/j;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p2, v4

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p0, p0, Lo/l$h;->j:[I

    const/4 p2, 0x0

    array-length v2, p0

    move v5, v2

    move-object v2, p0

    move p0, v5

    move v6, p2

    move-object p2, p1

    move p1, v6

    :goto_1
    if-ge p1, p0, :cond_4

    aget v4, v2, p1

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object p2, v0, Lo/l$h$a;->m:Ljava/lang/Object;

    iput-object v2, v0, Lo/l$h$a;->n:Ljava/lang/Object;

    iput p1, v0, Lo/l$h$a;->o:I

    iput p0, v0, Lo/l$h$a;->p:I

    iput v3, v0, Lo/l$h$a;->k:I

    invoke-interface {p2, v4, v0}, Lo/j;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr p1, v3

    goto :goto_1

    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
