.class public Lj/q2;
.super Lj/v2;
.source "SourceFile"

# interfaces
.implements Lj/c0;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\u0008\u001a\u00020\u0003H\u0003R\u001a\u0010\r\u001a\u00020\u00038\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\u00038PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lj/q2;",
        "Lj/v2;",
        "Lj/c0;",
        "",
        "complete",
        "",
        "exception",
        "d",
        "s1",
        "k",
        "Z",
        "C0",
        "()Z",
        "handlesException",
        "D0",
        "onCancelComplete",
        "Lj/n2;",
        "parent",
        "<init>",
        "(Lj/n2;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# instance fields
.field public final k:Z


# direct methods
.method public constructor <init>(Lj/n2;)V
    .locals 1
    .param p1    # Lj/n2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj/v2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lj/v2;->J0(Lj/n2;)V

    invoke-virtual {p0}, Lj/q2;->s1()Z

    move-result p1

    iput-boolean p1, p0, Lj/q2;->k:Z

    return-void
.end method


# virtual methods
.method public C0()Z
    .locals 0

    iget-boolean p0, p0, Lj/q2;->k:Z

    return p0
.end method

.method public D0()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public complete()Z
    .locals 1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lj/v2;->R0(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public d(Ljava/lang/Throwable;)Z
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    new-instance v0, Lj/e0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lj/e0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lj/v2;->R0(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final s1()Z
    .locals 3

    invoke-virtual {p0}, Lj/v2;->F0()Lj/w;

    move-result-object p0

    instance-of v0, p0, Lj/x;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lj/x;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lj/u2;->h0()Lj/v2;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lj/v2;->C0()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    invoke-virtual {p0}, Lj/v2;->F0()Lj/w;

    move-result-object p0

    instance-of v2, p0, Lj/x;

    if-eqz v2, :cond_3

    check-cast p0, Lj/x;

    goto :goto_1

    :cond_3
    move-object p0, v1

    :goto_1
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lj/u2;->h0()Lj/v2;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_4
    :goto_2
    return v0
.end method
