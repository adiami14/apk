.class public final Lu/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000.\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0000\u001a8\u0010\u0008\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0005*\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006H\u0086H\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\"\u001a\u0010\u0012\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000f\u0012\u0004\u0008\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00138\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u0012\u0004\u0008\u0016\u0010\u0011\"\u001a\u0010\u001a\u001a\u00020\u00138\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0015\u0012\u0004\u0008\u0019\u0010\u0011\"\u001a\u0010\u001d\u001a\u00020\u00138\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0015\u0012\u0004\u0008\u001c\u0010\u0011\"\u001a\u0010 \u001a\u00020\u00138\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0015\u0012\u0004\u0008\u001f\u0010\u0011\"\u001a\u0010#\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u000f\u0012\u0004\u0008\"\u0010\u0011\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006$"
    }
    d2 = {
        "",
        "permits",
        "acquiredPermits",
        "Lu/f;",
        "a",
        "T",
        "Lkotlin/Function0;",
        "action",
        "q",
        "(Lu/f;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "id",
        "Lu/i;",
        "prev",
        "j",
        "I",
        "getMAX_SPIN_CYCLES$annotations",
        "()V",
        "MAX_SPIN_CYCLES",
        "Lq/r0;",
        "b",
        "Lq/r0;",
        "getPERMIT$annotations",
        "PERMIT",
        "c",
        "getTAKEN$annotations",
        "TAKEN",
        "d",
        "getBROKEN$annotations",
        "BROKEN",
        "e",
        "getCANCELLED$annotations",
        "CANCELLED",
        "f",
        "getSEGMENT_SIZE$annotations",
        "SEGMENT_SIZE",
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
.field public static final a:I

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

.field public static final e:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0xc

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lq/t0;->f(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lu/h;->a:I

    new-instance v0, Lq/r0;

    const-string v1, "PERMIT"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu/h;->b:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu/h;->c:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu/h;->d:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu/h;->e:Lq/r0;

    const-string v2, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lq/t0;->f(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lu/h;->f:I

    return-void
.end method

.method public static final a(II)Lu/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lu/g;

    invoke-direct {v0, p0, p1}, Lu/g;-><init>(II)V

    return-object v0
.end method

.method public static synthetic b(IIILjava/lang/Object;)Lu/f;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lu/h;->a(II)Lu/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(JLu/i;)Lu/i;
    .locals 0

    invoke-static {p0, p1, p2}, Lu/h;->j(JLu/i;)Lu/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()Lq/r0;
    .locals 1

    sget-object v0, Lu/h;->d:Lq/r0;

    return-object v0
.end method

.method public static final synthetic e()Lq/r0;
    .locals 1

    sget-object v0, Lu/h;->e:Lq/r0;

    return-object v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, Lu/h;->a:I

    return v0
.end method

.method public static final synthetic g()Lq/r0;
    .locals 1

    sget-object v0, Lu/h;->b:Lq/r0;

    return-object v0
.end method

.method public static final synthetic h()I
    .locals 1

    sget v0, Lu/h;->f:I

    return v0
.end method

.method public static final synthetic i()Lq/r0;
    .locals 1

    sget-object v0, Lu/h;->c:Lq/r0;

    return-object v0
.end method

.method public static final j(JLu/i;)Lu/i;
    .locals 2

    new-instance v0, Lu/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lu/i;-><init>(JLu/i;I)V

    return-object v0
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

.method public static synthetic o()V
    .locals 0

    return-void
.end method

.method public static synthetic p()V
    .locals 0

    return-void
.end method

.method public static final q(Lu/f;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lu/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu/f;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lu/h$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lu/h$a;

    iget v1, v0, Lu/h$a;->m:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu/h$a;->m:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu/h$a;

    invoke-direct {v0, p2}, Lu/h$a;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lu/h$a;->l:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu/h$a;->m:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lu/h$a;->k:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iget-object p0, v0, Lu/h$a;->j:Ljava/lang/Object;

    check-cast p0, Lu/f;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p0, v0, Lu/h$a;->j:Ljava/lang/Object;

    iput-object p1, v0, Lu/h$a;->k:Ljava/lang/Object;

    iput v3, v0, Lu/h$a;->m:I

    invoke-interface {p0, v0}, Lu/f;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    :try_start_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0}, Lu/f;->release()V

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0}, Lu/f;->release()V

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p1
.end method

.method public static final r(Lu/f;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu/f;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    invoke-interface {p0, p2}, Lu/f;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-static {p2}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    :try_start_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0}, Lu/f;->release()V

    invoke-static {p2}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p2}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    invoke-interface {p0}, Lu/f;->release()V

    invoke-static {p2}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p1
.end method
