.class public final Lo/z$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/z$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
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
            "Lo/e0<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lj/u0;

.field public final synthetic l:Lj/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/z<",
            "Lo/t0<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lj/u0;Lj/z;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lo/e0<",
            "TT;>;>;",
            "Lj/u0;",
            "Lj/z<",
            "Lo/t0<",
            "TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lo/z$b$a;->j:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lo/z$b$a;->k:Lj/u0;

    iput-object p3, p0, Lo/z$b$a;->l:Lj/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    iget-object p2, p0, Lo/z$b$a;->j:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lo/e0;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lo/e0;->setValue(Ljava/lang/Object;)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lo/z$b$a;->k:Lj/u0;

    iget-object v0, p0, Lo/z$b$a;->j:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p0, p0, Lo/z$b$a;->l:Lj/z;

    invoke-static {p1}, Lo/v0;->a(Ljava/lang/Object;)Lo/e0;

    move-result-object p1

    new-instance v1, Lo/g0;

    invoke-interface {p2}, Lj/u0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-static {p2}, Lj/r2;->B(Lkotlin/coroutines/CoroutineContext;)Lj/n2;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lo/g0;-><init>(Lo/t0;Lj/n2;)V

    invoke-interface {p0, v1}, Lj/z;->P(Ljava/lang/Object;)Z

    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
