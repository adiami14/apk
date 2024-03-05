.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014R%\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;",
        "",
        "()V",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "getConstraints-msEJaDk",
        "()J",
        "setConstraints-BRTryo0",
        "(J)V",
        "J",
        "prefetcher",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;",
        "getPrefetcher$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;",
        "setPrefetcher$foundation_release",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;)V",
        "removeFromPrefetch",
        "",
        "index",
        "",
        "(I)Lkotlin/Unit;",
        "scheduleForPrefetch",
        "Subscriber",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private constraints:J

.field private prefetcher:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0xf

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;->constraints:J

    return-void
.end method


# virtual methods
.method public final getConstraints-msEJaDk()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;->constraints:J

    return-wide v0
.end method

.method public final getPrefetcher$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;->prefetcher:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;

    return-object p0
.end method

.method public final removeFromPrefetch(I)Lkotlin/Unit;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;->prefetcher:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;->removeFromPrefetch(I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_0
    return-object p0
.end method

.method public final scheduleForPrefetch(I)Lkotlin/Unit;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;->prefetcher:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;->scheduleForPrefetch(I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_0
    return-object p0
.end method

.method public final setConstraints-BRTryo0(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;->constraints:J

    return-void
.end method

.method public final setPrefetcher$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;->prefetcher:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;

    return-void
.end method
