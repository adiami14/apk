.class public final Lo/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/b0;->d(Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function4;)Lo/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/i<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0007\u00b8\u0006\u0008"
    }
    d2 = {
        "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1",
        "Lo/i;",
        "Lo/j;",
        "collector",
        "",
        "collect",
        "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "kotlinx-coroutines-core",
        "o/b0$t"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic j:[Lo/i;

.field public final synthetic k:Lkotlin/jvm/functions/Function4;


# direct methods
.method public constructor <init>([Lo/i;Lkotlin/jvm/functions/Function4;)V
    .locals 0

    iput-object p1, p0, Lo/b0$a;->j:[Lo/i;

    iput-object p2, p0, Lo/b0$a;->k:Lkotlin/jvm/functions/Function4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lo/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lo/b0$a;->j:[Lo/i;

    invoke-static {}, Lo/b0;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    new-instance v2, Lo/b0$a$a;

    iget-object p0, p0, Lo/b0$a;->k:Lkotlin/jvm/functions/Function4;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Lo/b0$a$a;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function4;)V

    invoke-static {p1, v0, v1, v2, p2}, Lp/m;->a(Lo/j;[Lo/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
