.class public final Lj/e$a;
.super Lj/u2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\"\u0010\u0013\u001a\u00020\u000c8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\u0008\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\u0008\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lj/e$a;",
        "Lj/u2;",
        "",
        "cause",
        "",
        "g0",
        "(Ljava/lang/Throwable;)V",
        "Lj/q;",
        "",
        "n",
        "Lj/q;",
        "continuation",
        "Lj/p1;",
        "o",
        "Lj/p1;",
        "k0",
        "()Lj/p1;",
        "m0",
        "(Lj/p1;)V",
        "handle",
        "Lj/e$b;",
        "Lj/e;",
        "value",
        "j0",
        "()Lj/e$b;",
        "l0",
        "(Lj/e$b;)V",
        "disposer",
        "<init>",
        "(Lj/e;Lj/q;)V",
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
.field private volatile synthetic _disposer:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lj/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/q<",
            "Ljava/util/List<",
            "+TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public o:Lj/p1;

.field public final synthetic p:Lj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/e<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj/e;Lj/q;)V
    .locals 0
    .param p1    # Lj/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/q<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lj/e$a;->p:Lj/e;

    invoke-direct {p0}, Lj/u2;-><init>()V

    iput-object p2, p0, Lj/e$a;->n:Lj/q;

    const/4 p1, 0x0

    iput-object p1, p0, Lj/e$a;->_disposer:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public g0(Ljava/lang/Throwable;)V
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iget-object v0, p0, Lj/e$a;->n:Lj/q;

    invoke-interface {v0, p1}, Lj/q;->B(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lj/e$a;->n:Lj/q;

    invoke-interface {v0, p1}, Lj/q;->Z(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj/e$a;->j0()Lj/e$b;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lj/e$b;->b()V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lj/e$a;->p:Lj/e;

    sget-object v0, Lj/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lj/e$a;->n:Lj/q;

    iget-object p0, p0, Lj/e$a;->p:Lj/e;

    invoke-static {p0}, Lj/e;->a(Lj/e;)[Lj/c1;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, p0, v1

    invoke-interface {v3}, Lj/c1;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lj/e$a;->g0(Ljava/lang/Throwable;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final j0()Lj/e$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/e<",
            "TT;>.b;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Lj/e$a;->_disposer:Ljava/lang/Object;

    check-cast p0, Lj/e$b;

    return-object p0
.end method

.method public final k0()Lj/p1;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lj/e$a;->o:Lj/p1;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "handle"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final l0(Lj/e$b;)V
    .locals 0
    .param p1    # Lj/e$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/e<",
            "TT;>.b;)V"
        }
    .end annotation

    iput-object p1, p0, Lj/e$a;->_disposer:Ljava/lang/Object;

    return-void
.end method

.method public final m0(Lj/p1;)V
    .locals 0
    .param p1    # Lj/p1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iput-object p1, p0, Lj/e$a;->o:Lj/p1;

    return-void
.end method
