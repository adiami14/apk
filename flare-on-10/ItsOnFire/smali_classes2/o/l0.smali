.class public final Lo/l0;
.super Lp/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp/d<",
        "Lo/j0<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lo/l0;",
        "Lp/d;",
        "Lo/j0;",
        "flow",
        "",
        "c",
        "",
        "Lkotlin/coroutines/Continuation;",
        "",
        "d",
        "(Lo/j0;)[Lkotlin/coroutines/Continuation;",
        "",
        "a",
        "J",
        "index",
        "b",
        "Lkotlin/coroutines/Continuation;",
        "cont",
        "<init>",
        "()V",
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
.field public a:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public b:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lp/d;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/l0;->a:J

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lo/j0;

    invoke-virtual {p0, p1}, Lo/l0;->c(Lo/j0;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Lkotlin/coroutines/Continuation;
    .locals 0

    check-cast p1, Lo/j0;

    invoke-virtual {p0, p1}, Lo/l0;->d(Lo/j0;)[Lkotlin/coroutines/Continuation;

    move-result-object p0

    return-object p0
.end method

.method public c(Lo/j0;)Z
    .locals 4
    .param p1    # Lo/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/j0<",
            "*>;)Z"
        }
    .end annotation

    iget-wide v0, p0, Lo/l0;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p1}, Lo/j0;->d0()J

    move-result-wide v0

    iput-wide v0, p0, Lo/l0;->a:J

    const/4 p0, 0x1

    return p0
.end method

.method public d(Lo/j0;)[Lkotlin/coroutines/Continuation;
    .locals 4
    .param p1    # Lo/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/j0<",
            "*>;)[",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-wide v0, p0, Lo/l0;->a:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lo/l0;->a:J

    const/4 v2, 0x0

    iput-object v2, p0, Lo/l0;->b:Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lo/j0;->c0(J)[Lkotlin/coroutines/Continuation;

    move-result-object p0

    return-object p0
.end method
