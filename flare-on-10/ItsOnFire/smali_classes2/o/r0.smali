.class public final Lo/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/o0;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lo/r0;",
        "Lo/o0;",
        "Lo/t0;",
        "",
        "subscriptionCount",
        "Lo/i;",
        "Lo/m0;",
        "a",
        "",
        "toString",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/t0;)Lo/i;
    .locals 1
    .param p1    # Lo/t0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/t0<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lo/i<",
            "Lo/m0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p0, Lo/r0$a;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/r0$a;-><init>(Lo/t0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0}, Lo/k;->I0(Lkotlin/jvm/functions/Function2;)Lo/i;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "SharingStarted.Lazily"

    return-object p0
.end method
