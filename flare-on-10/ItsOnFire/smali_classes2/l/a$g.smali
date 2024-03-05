.class public final Ll/a$g;
.super Lq/y$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lq/y$e<",
        "Ll/l0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0004\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\u0008\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u0013"
    }
    d2 = {
        "Ll/a$g;",
        "E",
        "Lq/y$e;",
        "Ll/l0;",
        "Lkotlinx/coroutines/internal/RemoveFirstDesc;",
        "Lq/y;",
        "affected",
        "",
        "e",
        "Lq/y$d;",
        "Lkotlinx/coroutines/internal/PrepareOp;",
        "prepareOp",
        "j",
        "",
        "k",
        "Lq/w;",
        "queue",
        "<init>",
        "(Lq/w;)V",
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
.method public constructor <init>(Lq/w;)V
    .locals 0
    .param p1    # Lq/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lq/y$e;-><init>(Lq/y;)V

    return-void
.end method


# virtual methods
.method public e(Lq/y;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of p0, p1, Ll/w;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p0, p1, Ll/l0;

    if-nez p0, :cond_1

    sget-object p1, Ll/b;->f:Lq/r0;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public j(Lq/y$d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lq/y$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p1, Lq/y$d;->a:Lq/y;

    check-cast p0, Ll/l0;

    invoke-virtual {p0, p1}, Ll/l0;->j0(Lq/y$d;)Lq/r0;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lq/z;->a:Ljava/lang/Object;

    return-object p0

    :cond_0
    sget-object p1, Lq/c;->b:Ljava/lang/Object;

    if-ne p0, p1, :cond_1

    return-object p1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public k(Lq/y;)V
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    check-cast p1, Ll/l0;

    invoke-virtual {p1}, Ll/l0;->k0()V

    return-void
.end method
