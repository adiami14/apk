.class public final Lt/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aN\u0010\t\u001a\u00020\u0008\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001aG\u0010\r\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u001f\u0008\u0004\u0010\u000c\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00080\u0004\u00a2\u0006\u0002\u0008\u000bH\u0086H\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\" \u0010\u0015\u001a\u00020\u00068\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u0012\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0012\" \u0010\u0019\u001a\u00020\u00068\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0010\u0012\u0004\u0008\u0018\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0010\u0012\u0004\u0008\u001b\u0010\u0014\"\u001a\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0010\u0012\u0004\u0008\u001d\u0010\u0014\"\u001a\u0010#\u001a\u00020\u001f8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u0012\u0004\u0008\"\u0010\u0014\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006$"
    }
    d2 = {
        "R",
        "Lt/a;",
        "Lkotlin/time/Duration;",
        "timeout",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "block",
        "",
        "k",
        "(Lt/a;JLkotlin/jvm/functions/Function1;)V",
        "Lkotlin/ExtensionFunctionType;",
        "builder",
        "l",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "Ljava/lang/Object;",
        "f",
        "()Ljava/lang/Object;",
        "getNOT_SELECTED$annotations",
        "()V",
        "NOT_SELECTED",
        "b",
        "d",
        "getALREADY_SELECTED$annotations",
        "ALREADY_SELECTED",
        "c",
        "getUNDECIDED$annotations",
        "UNDECIDED",
        "getRESUMED$annotations",
        "RESUMED",
        "Lt/i;",
        "e",
        "Lt/i;",
        "getSelectOpSequenceNumber$annotations",
        "selectOpSequenceNumber",
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
.field public static final a:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lt/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq/r0;

    const-string v1, "NOT_SELECTED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lt/g;->a:Ljava/lang/Object;

    new-instance v0, Lq/r0;

    const-string v1, "ALREADY_SELECTED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lt/g;->b:Ljava/lang/Object;

    new-instance v0, Lq/r0;

    const-string v1, "UNDECIDED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lt/g;->c:Ljava/lang/Object;

    new-instance v0, Lq/r0;

    const-string v1, "RESUMED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lt/g;->d:Ljava/lang/Object;

    new-instance v0, Lt/i;

    invoke-direct {v0}, Lt/i;-><init>()V

    sput-object v0, Lt/g;->e:Lt/i;

    return-void
.end method

.method public static final synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lt/g;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic b()Lt/i;
    .locals 1

    sget-object v0, Lt/g;->e:Lt/i;

    return-object v0
.end method

.method public static final synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lt/g;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public static final d()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lt/g;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic e()V
    .locals 0

    return-void
.end method

.method public static final f()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lt/g;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic g()V
    .locals 0

    return-void
.end method

.method public static synthetic h()V
    .locals 0

    return-void
.end method

.method public static synthetic i()V
    .locals 0

    return-void
.end method

.method public static synthetic j()V
    .locals 0

    return-void
.end method

.method public static final k(Lt/a;JLkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p0    # Lt/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lt/a<",
            "-TR;>;J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation build Lj/c2;
    .end annotation

    invoke-static {p1, p2}, Lj/f1;->e(J)J

    move-result-wide p1

    invoke-interface {p0, p1, p2, p3}, Lt/a;->p(JLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lt/a<",
            "-TR;>;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lt/b;

    invoke-direct {v0, p1}, Lt/b;-><init>(Lkotlin/coroutines/Continuation;)V

    :try_start_0
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {v0, p0}, Lt/b;->p0(Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {v0}, Lt/b;->o0()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p0
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lt/a<",
            "-TR;>;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    new-instance v0, Lt/b;

    invoke-direct {v0, p1}, Lt/b;-><init>(Lkotlin/coroutines/Continuation;)V

    :try_start_0
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {v0, p0}, Lt/b;->p0(Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {v0}, Lt/b;->o0()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    const/4 p1, 0x1

    invoke-static {p1}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    return-object p0
.end method
