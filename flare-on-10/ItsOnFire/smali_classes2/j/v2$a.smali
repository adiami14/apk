.class public final Lj/v2$a;
.super Lj/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/v2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lj/r<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0014R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lj/v2$a;",
        "T",
        "Lj/r;",
        "Lj/n2;",
        "parent",
        "",
        "w",
        "",
        "I",
        "Lj/v2;",
        "r",
        "Lj/v2;",
        "job",
        "Lkotlin/coroutines/Continuation;",
        "delegate",
        "<init>",
        "(Lkotlin/coroutines/Continuation;Lj/v2;)V",
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
.field public final r:Lj/v2;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;Lj/v2;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lj/v2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;",
            "Lj/v2;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lj/r;-><init>(Lkotlin/coroutines/Continuation;I)V

    iput-object p2, p0, Lj/v2$a;->r:Lj/v2;

    return-void
.end method


# virtual methods
.method public I()Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "AwaitContinuation"

    return-object p0
.end method

.method public w(Lj/n2;)Ljava/lang/Throwable;
    .locals 1
    .param p1    # Lj/n2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lj/v2$a;->r:Lj/v2;

    invoke-virtual {p0}, Lj/v2;->G0()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lj/v2$c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lj/v2$c;

    invoke-virtual {v0}, Lj/v2$c;->e()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    instance-of v0, p0, Lj/e0;

    if-eqz v0, :cond_1

    check-cast p0, Lj/e0;

    iget-object p0, p0, Lj/e0;->a:Ljava/lang/Throwable;

    return-object p0

    :cond_1
    invoke-interface {p1}, Lj/n2;->u()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0
.end method
