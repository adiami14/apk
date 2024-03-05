.class public final synthetic Lj/s2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\u0008\u00030\u00052\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0001\u00a8\u0006\u0008"
    }
    d2 = {
        "Lj/n2;",
        "Ljava/util/concurrent/Future;",
        "future",
        "Lj/p1;",
        "b",
        "Lj/q;",
        "",
        "a",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x1,
        0x6,
        0x0
    }
    xs = "kotlinx/coroutines/JobKt"
.end annotation


# direct methods
.method public static final a(Lj/q;Ljava/util/concurrent/Future;)V
    .locals 1
    .param p0    # Lj/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/q<",
            "*>;",
            "Ljava/util/concurrent/Future<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Lj/m;

    invoke-direct {v0, p1}, Lj/m;-><init>(Ljava/util/concurrent/Future;)V

    invoke-interface {p0, v0}, Lj/q;->A(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final b(Lj/n2;Ljava/util/concurrent/Future;)Lj/p1;
    .locals 1
    .param p0    # Lj/n2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/n2;",
            "Ljava/util/concurrent/Future<",
            "*>;)",
            "Lj/p1;"
        }
    .end annotation

    .annotation build Lj/i2;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lj/n;

    invoke-direct {v0, p1}, Lj/n;-><init>(Ljava/util/concurrent/Future;)V

    invoke-interface {p0, v0}, Lj/n2;->H(Lkotlin/jvm/functions/Function1;)Lj/p1;

    move-result-object p0

    return-object p0
.end method
