.class public final Lu/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0004*\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H\u0086H\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\u0008\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000c\u0012\u0004\u0008\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u00020\u000b8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u0012\u0004\u0008\u0011\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u000b8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000c\u0012\u0004\u0008\u0014\u0010\u000e\"\u001a\u0010\u0018\u001a\u00020\u000b8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u000c\u0012\u0004\u0008\u0017\u0010\u000e\"\u001a\u0010\u001d\u001a\u00020\u00198\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u0012\u0004\u0008\u001c\u0010\u000e\"\u001a\u0010 \u001a\u00020\u00198\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001b\u0012\u0004\u0008\u001f\u0010\u000e\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006!"
    }
    d2 = {
        "",
        "locked",
        "Lu/c;",
        "a",
        "T",
        "",
        "owner",
        "Lkotlin/Function0;",
        "action",
        "o",
        "(Lu/c;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lq/r0;",
        "Lq/r0;",
        "getLOCK_FAIL$annotations",
        "()V",
        "LOCK_FAIL",
        "b",
        "getUNLOCK_FAIL$annotations",
        "UNLOCK_FAIL",
        "c",
        "getLOCKED$annotations",
        "LOCKED",
        "d",
        "getUNLOCKED$annotations",
        "UNLOCKED",
        "Lu/b;",
        "e",
        "Lu/b;",
        "getEMPTY_LOCKED$annotations",
        "EMPTY_LOCKED",
        "f",
        "getEMPTY_UNLOCKED$annotations",
        "EMPTY_UNLOCKED",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lu/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Lu/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq/r0;

    const-string v1, "LOCK_FAIL"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu/e;->a:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "UNLOCK_FAIL"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu/e;->b:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "LOCKED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu/e;->c:Lq/r0;

    new-instance v1, Lq/r0;

    const-string v2, "UNLOCKED"

    invoke-direct {v1, v2}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v1, Lu/e;->d:Lq/r0;

    new-instance v2, Lu/b;

    invoke-direct {v2, v0}, Lu/b;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lu/e;->e:Lu/b;

    new-instance v0, Lu/b;

    invoke-direct {v0, v1}, Lu/b;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lu/e;->f:Lu/b;

    return-void
.end method

.method public static final a(Z)Lu/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lu/d;

    invoke-direct {v0, p0}, Lu/d;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(ZILjava/lang/Object;)Lu/c;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lu/e;->a(Z)Lu/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lu/b;
    .locals 1

    sget-object v0, Lu/e;->e:Lu/b;

    return-object v0
.end method

.method public static final synthetic d()Lu/b;
    .locals 1

    sget-object v0, Lu/e;->f:Lu/b;

    return-object v0
.end method

.method public static final synthetic e()Lq/r0;
    .locals 1

    sget-object v0, Lu/e;->c:Lq/r0;

    return-object v0
.end method

.method public static final synthetic f()Lq/r0;
    .locals 1

    sget-object v0, Lu/e;->a:Lq/r0;

    return-object v0
.end method

.method public static final synthetic g()Lq/r0;
    .locals 1

    sget-object v0, Lu/e;->d:Lq/r0;

    return-object v0
.end method

.method public static final synthetic h()Lq/r0;
    .locals 1

    sget-object v0, Lu/e;->b:Lq/r0;

    return-object v0
.end method

.method public static synthetic i()V
    .locals 0

    return-void
.end method

.method public static synthetic j()V
    .locals 0

    return-void
.end method

.method public static synthetic k()V
    .locals 0

    return-void
.end method

.method public static synthetic l()V
    .locals 0

    return-void
.end method

.method public static synthetic m()V
    .locals 0

    return-void
.end method

.method public static synthetic n()V
    .locals 0

    return-void
.end method

.method public static final o(Lu/c;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu/c;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lu/e$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lu/e$a;

    iget v1, v0, Lu/e$a;->n:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu/e$a;->n:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu/e$a;

    invoke-direct {v0, p3}, Lu/e$a;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lu/e$a;->m:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu/e$a;->n:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lu/e$a;->l:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lkotlin/jvm/functions/Function0;

    iget-object p1, v0, Lu/e$a;->k:Ljava/lang/Object;

    iget-object p0, v0, Lu/e$a;->j:Ljava/lang/Object;

    check-cast p0, Lu/c;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p0, v0, Lu/e$a;->j:Ljava/lang/Object;

    iput-object p1, v0, Lu/e$a;->k:Ljava/lang/Object;

    iput-object p2, v0, Lu/e$a;->l:Ljava/lang/Object;

    iput v3, v0, Lu/e$a;->n:I

    invoke-interface {p0, p1, v0}, Lu/c;->c(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    :try_start_0
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0, p1}, Lu/c;->d(Ljava/lang/Object;)V

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0, p1}, Lu/c;->d(Ljava/lang/Object;)V

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p2
.end method

.method public static final p(Lu/c;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu/c;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    invoke-interface {p0, p1, p3}, Lu/c;->c(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    const/4 p3, 0x1

    invoke-static {p3}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    :try_start_0
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0, p1}, Lu/c;->d(Ljava/lang/Object;)V

    invoke-static {p3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-static {p3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0, p1}, Lu/c;->d(Ljava/lang/Object;)V

    invoke-static {p3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p2
.end method

.method public static synthetic q(Lu/c;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p5, 0x1

    and-int/2addr p4, p5

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/4 p4, 0x0

    invoke-static {p4}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    invoke-interface {p0, p1, p3}, Lu/c;->c(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    invoke-static {p5}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    :try_start_0
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p5}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0, p1}, Lu/c;->d(Ljava/lang/Object;)V

    invoke-static {p5}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-static {p5}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0, p1}, Lu/c;->d(Ljava/lang/Object;)V

    invoke-static {p5}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p2
.end method
