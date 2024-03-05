.class public final Lt/b$c;
.super Lq/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\u0008\u00030\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lt/b$c;",
        "Lq/j0;",
        "",
        "affected",
        "c",
        "Lq/y$d;",
        "a",
        "Lq/y$d;",
        "otherOp",
        "Lq/d;",
        "()Lq/d;",
        "atomicOp",
        "<init>",
        "(Lq/y$d;)V",
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
.field public final a:Lq/y$d;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq/y$d;)V
    .locals 0
    .param p1    # Lq/y$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lq/j0;-><init>()V

    iput-object p1, p0, Lt/b$c;->a:Lq/y$d;

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

    iget-object p0, p0, Lt/b$c;->a:Lq/y$d;

    invoke-virtual {p0}, Lq/y$d;->a()Lq/d;

    move-result-object p0

    return-object p0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    if-eqz p1, :cond_1

    check-cast p1, Lt/b;

    iget-object v0, p0, Lt/b$c;->a:Lq/y$d;

    invoke-virtual {v0}, Lq/y$d;->d()V

    iget-object v0, p0, Lt/b$c;->a:Lq/y$d;

    invoke-virtual {v0}, Lq/y$d;->a()Lq/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lt/b$c;->a:Lq/y$d;

    iget-object v1, v1, Lq/y$d;->c:Lq/y$a;

    goto :goto_0

    :cond_0
    invoke-static {}, Lt/g;->f()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    sget-object v2, Lt/b;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p1, p0, v1}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
