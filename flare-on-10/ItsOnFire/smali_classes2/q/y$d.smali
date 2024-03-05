.class public final Lq/y$d;
.super Lq/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\u0008\u00030\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lq/y$d;",
        "Lq/j0;",
        "",
        "affected",
        "c",
        "",
        "d",
        "",
        "toString",
        "Lq/y;",
        "Lkotlinx/coroutines/internal/Node;",
        "a",
        "Lq/y;",
        "b",
        "next",
        "Lq/y$a;",
        "Lq/y$a;",
        "desc",
        "Lq/d;",
        "()Lq/d;",
        "atomicOp",
        "<init>",
        "(Lq/y;Lq/y;Lq/y$a;)V",
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
.field public final a:Lq/y;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lq/y;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lq/y$a;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq/y;Lq/y;Lq/y$a;)V
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lq/y$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lq/j0;-><init>()V

    iput-object p1, p0, Lq/y$d;->a:Lq/y;

    iput-object p2, p0, Lq/y$d;->b:Lq/y;

    iput-object p3, p0, Lq/y$d;->c:Lq/y$a;

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

    iget-object p0, p0, Lq/y$d;->c:Lq/y$a;

    invoke-virtual {p0}, Lq/b;->b()Lq/d;

    move-result-object p0

    return-object p0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    if-eqz p1, :cond_5

    check-cast p1, Lq/y;

    iget-object v0, p0, Lq/y$d;->c:Lq/y$a;

    invoke-virtual {v0, p0}, Lq/y$a;->j(Lq/y$d;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lq/z;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lq/y$d;->b:Lq/y;

    invoke-static {v0}, Lq/y;->z(Lq/y;)Lq/l0;

    move-result-object v3

    sget-object v4, Lq/y;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p1, p0, v3}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p0, p0, Lq/y$d;->c:Lq/y$a;

    invoke-virtual {p0, p1}, Lq/y$a;->k(Lq/y;)V

    invoke-static {v0, v2}, Lq/y;->x(Lq/y;Lq/j0;)Lq/y;

    :cond_0
    return-object v1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lq/y$d;->a()Lq/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lq/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lq/y$d;->a()Lq/d;

    move-result-object v0

    invoke-virtual {v0}, Lq/d;->f()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    sget-object v1, Lq/c;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lq/y$d;->a()Lq/d;

    move-result-object v0

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    iget-object v0, p0, Lq/y$d;->c:Lq/y$a;

    iget-object v1, p0, Lq/y$d;->b:Lq/y;

    invoke-virtual {v0, p1, v1}, Lq/y$a;->n(Lq/y;Lq/y;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lq/y$d;->b:Lq/y;

    :goto_1
    sget-object v1, Lq/y;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, p0, v0}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lq/y$d;->c:Lq/y$a;

    invoke-virtual {v0, p0}, Lq/y$a;->g(Lq/y$d;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PrepareOp(op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lq/y$d;->a()Lq/d;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
