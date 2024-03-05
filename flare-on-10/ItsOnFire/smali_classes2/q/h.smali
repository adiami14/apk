.class public abstract Lq/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<N:",
        "Lq/h<",
        "TN;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0018\u0008 \u0018\u0000*\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\u0008\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u000eR\u0013\u0010\u0014\u001a\u0004\u0018\u00018\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0010R\u0013\u0010\u0018\u001a\u0004\u0018\u00018\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0010R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0013R\u0014\u0010!\u001a\u00028\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u0013\u00a8\u0006$"
    }
    d2 = {
        "Lq/h;",
        "N",
        "",
        "Lkotlin/Function0;",
        "",
        "onClosedAction",
        "k",
        "(Lkotlin/jvm/functions/Function0;)Lq/h;",
        "value",
        "",
        "m",
        "(Lq/h;)Z",
        "",
        "b",
        "()V",
        "j",
        "()Z",
        "l",
        "d",
        "()Lq/h;",
        "next",
        "i",
        "isTail",
        "f",
        "prev",
        "g",
        "removed",
        "e",
        "()Ljava/lang/Object;",
        "nextOrClosed",
        "c",
        "leftmostAliveNode",
        "h",
        "rightmostAliveNode",
        "<init>",
        "(Lq/h;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _next:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic _prev:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lq/h;

    const-string v2, "_next"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lq/h;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "_prev"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lq/h;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lq/h;)V
    .locals 1
    .param p1    # Lq/h;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lq/h;->_next:Ljava/lang/Object;

    iput-object p1, p0, Lq/h;->_prev:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a(Lq/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lq/h;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 2

    sget-object v0, Lq/h;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final c()Lq/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    invoke-virtual {p0}, Lq/h;->f()Lq/h;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lq/h;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lq/h;->_prev:Ljava/lang/Object;

    check-cast p0, Lq/h;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final d()Lq/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0}, Lq/h;->a(Lq/h;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lq/g;->a()Lq/r0;

    move-result-object v0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    check-cast p0, Lq/h;

    return-object p0
.end method

.method public final e()Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lq/h;->_next:Ljava/lang/Object;

    return-object p0
.end method

.method public final f()Lq/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Lq/h;->_prev:Ljava/lang/Object;

    check-cast p0, Lq/h;

    return-object p0
.end method

.method public abstract g()Z
.end method

.method public final h()Lq/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    :goto_0
    invoke-virtual {p0}, Lq/h;->d()Lq/h;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lq/h;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final i()Z
    .locals 0

    invoke-virtual {p0}, Lq/h;->d()Lq/h;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public final j()Z
    .locals 3

    sget-object v0, Lq/h;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lq/g;->a()Lq/r0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, p0, v2, v1}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final k(Lkotlin/jvm/functions/Function0;)Lq/h;
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0;",
            ")TN;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0}, Lq/h;->a(Lq/h;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lq/g;->a()Lq/r0;

    move-result-object v0

    if-eq p0, v0, :cond_0

    check-cast p0, Lq/h;

    return-object p0

    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public final l()V
    .locals 2

    :cond_0
    invoke-virtual {p0}, Lq/h;->c()Lq/h;

    move-result-object v0

    invoke-virtual {p0}, Lq/h;->h()Lq/h;

    move-result-object v1

    iput-object v0, v1, Lq/h;->_prev:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iput-object v1, v0, Lq/h;->_next:Ljava/lang/Object;

    :cond_1
    invoke-virtual {v1}, Lq/h;->g()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lq/h;->g()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    return-void
.end method

.method public final m(Lq/h;)Z
    .locals 2
    .param p1    # Lq/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)Z"
        }
    .end annotation

    sget-object v0, Lq/h;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
