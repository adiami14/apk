.class public final Lu/d$e$a;
.super Lq/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/d$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lu/d$e$a;",
        "Lq/j0;",
        "",
        "affected",
        "c",
        "Lq/d;",
        "a",
        "Lq/d;",
        "()Lq/d;",
        "atomicOp",
        "<init>",
        "(Lu/d$e;Lq/d;)V",
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
.field public final a:Lq/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq/d<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic b:Lu/d$e;


# direct methods
.method public constructor <init>(Lu/d$e;Lq/d;)V
    .locals 0
    .param p1    # Lu/d$e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/d<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lu/d$e$a;->b:Lu/d$e;

    invoke-direct {p0}, Lq/j0;-><init>()V

    iput-object p2, p0, Lu/d$e$a;->a:Lq/d;

    return-void
.end method


# virtual methods
.method public a()Lq/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq/d<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lu/d$e$a;->a:Lq/d;

    return-object p0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lu/d$e$a;->a()Lq/d;

    move-result-object v0

    invoke-virtual {v0}, Lq/d;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lu/e;->d()Lu/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu/d$e$a;->a()Lq/d;

    move-result-object v0

    :goto_0
    if-eqz p1, :cond_1

    check-cast p1, Lu/d;

    sget-object v1, Lu/d;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, p0, v0}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    const/4 p0, 0x0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
