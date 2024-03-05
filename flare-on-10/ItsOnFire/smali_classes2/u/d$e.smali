.class public final Lu/d$e;
.super Lq/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/d$e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0008B\u0019\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0016J\u001e\u0010\u0008\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000c\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lu/d$e;",
        "Lq/b;",
        "Lq/d;",
        "op",
        "",
        "c",
        "failure",
        "",
        "a",
        "Lu/d;",
        "b",
        "Lu/d;",
        "mutex",
        "Ljava/lang/Object;",
        "owner",
        "<init>",
        "(Lu/d;Ljava/lang/Object;)V",
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
.field public final b:Lu/d;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/lang/Object;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu/d;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lu/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lq/b;-><init>()V

    iput-object p1, p0, Lu/d$e;->b:Lu/d;

    iput-object p2, p0, Lu/d$e;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lq/d;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Lq/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/d<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-static {}, Lu/e;->d()Lu/b;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lu/d$e;->c:Ljava/lang/Object;

    if-nez p2, :cond_1

    invoke-static {}, Lu/e;->c()Lu/b;

    move-result-object p2

    goto :goto_0

    :cond_1
    new-instance v0, Lu/b;

    invoke-direct {v0, p2}, Lu/b;-><init>(Ljava/lang/Object;)V

    move-object p2, v0

    :goto_0
    iget-object p0, p0, Lu/d$e;->b:Lu/d;

    sget-object v0, Lu/d;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, p1, p2}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lq/d;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lq/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lu/d$e$a;

    invoke-direct {v0, p0, p1}, Lu/d$e$a;-><init>(Lu/d$e;Lq/d;)V

    iget-object p1, p0, Lu/d$e;->b:Lu/d;

    sget-object v1, Lu/d;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lu/e;->d()Lu/b;

    move-result-object v2

    invoke-static {v1, p1, v2, v0}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lu/e;->f()Lq/r0;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object p0, p0, Lu/d$e;->b:Lu/d;

    invoke-virtual {v0, p0}, Lu/d$e$a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
