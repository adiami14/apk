.class public final Ll/a$h;
.super Lq/y$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll/a;->b0(Ll/h0;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016\u00a8\u0006\u0007\u00b8\u0006\u0000"
    }
    d2 = {
        "q/y$f",
        "Lq/y$c;",
        "Lq/y;",
        "Lkotlinx/coroutines/internal/Node;",
        "affected",
        "",
        "k",
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
.field public final synthetic d:Ll/a;


# direct methods
.method public constructor <init>(Lq/y;Ll/a;)V
    .locals 0

    iput-object p2, p0, Ll/a$h;->d:Ll/a;

    invoke-direct {p0, p1}, Lq/y$c;-><init>(Lq/y;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/y;

    invoke-virtual {p0, p1}, Ll/a$h;->k(Lq/y;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public k(Lq/y;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Ll/a$h;->d:Ll/a;

    invoke-virtual {p0}, Ll/a;->f0()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, Lq/x;->a()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
