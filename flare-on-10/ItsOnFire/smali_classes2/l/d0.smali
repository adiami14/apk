.class public Ll/d0;
.super Ll/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ll/a<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0010\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\u0007H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u000eH\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0015\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\""
    }
    d2 = {
        "Ll/d0;",
        "E",
        "Ll/a;",
        "element",
        "",
        "H",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "Lt/f;",
        "select",
        "I",
        "(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;",
        "Lq/q;",
        "Ll/l0;",
        "list",
        "Ll/w;",
        "closed",
        "",
        "i0",
        "(Ljava/lang/Object;Ll/w;)V",
        "",
        "e0",
        "()Z",
        "isBufferAlwaysEmpty",
        "f0",
        "isBufferEmpty",
        "B",
        "isBufferAlwaysFull",
        "C",
        "isBufferFull",
        "Lkotlin/Function1;",
        "Lkotlinx/coroutines/internal/OnUndeliveredElement;",
        "onUndeliveredElement",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
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
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TE;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ll/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final B()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final C()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public H(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    :cond_0
    invoke-super {p0, p1}, Ll/c;->H(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ll/b;->d:Lq/r0;

    if-ne v0, v1, :cond_1

    return-object v1

    :cond_1
    sget-object v2, Ll/b;->e:Lq/r0;

    if-ne v0, v2, :cond_3

    invoke-virtual {p0, p1}, Ll/c;->M(Ljava/lang/Object;)Ll/j0;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    instance-of v1, v0, Ll/w;

    if-eqz v1, :cond_0

    return-object v0

    :cond_3
    instance-of p0, v0, Ll/w;

    if-eqz p0, :cond_4

    return-object v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid offerInternal result "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public I(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;
    .locals 2
    .param p2    # Lt/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lt/f<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    :cond_0
    invoke-virtual {p0}, Ll/a;->d0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1, p2}, Ll/c;->I(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ll/c;->h(Ljava/lang/Object;)Lq/y$b;

    move-result-object v0

    invoke-interface {p2, v0}, Lt/f;->r(Lq/b;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Ll/b;->d:Lq/r0;

    :cond_2
    :goto_0
    invoke-static {}, Lt/g;->d()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {}, Lt/g;->d()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object v1, Ll/b;->d:Lq/r0;

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    sget-object v1, Ll/b;->e:Lq/r0;

    if-eq v0, v1, :cond_0

    sget-object v1, Lq/c;->b:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    instance-of p0, v0, Ll/w;

    if-eqz p0, :cond_5

    return-object v0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Invalid result "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final e0()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public final f0()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public i0(Ljava/lang/Object;Ll/w;)V
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ll/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ll/w<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    instance-of v1, p1, Ljava/util/ArrayList;

    if-nez v1, :cond_1

    check-cast p1, Ll/l0;

    instance-of v1, p1, Ll/c$a;

    if-eqz v1, :cond_0

    iget-object p0, p0, Ll/c;->j:Lkotlin/jvm/functions/Function1;

    if-eqz p0, :cond_5

    check-cast p1, Ll/c$a;

    iget-object p1, p1, Ll/c$a;->m:Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lq/i0;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lq/d1;)Lq/d1;

    move-result-object p0

    move-object v0, p0

    goto :goto_2

    :cond_0
    invoke-virtual {p1, p2}, Ll/l0;->i0(Ll/w;)V

    goto :goto_2

    :cond_1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move-object v2, v0

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v1, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/l0;

    instance-of v4, v3, Ll/c$a;

    if-eqz v4, :cond_3

    iget-object v4, p0, Ll/c;->j:Lkotlin/jvm/functions/Function1;

    if-eqz v4, :cond_2

    check-cast v3, Ll/c$a;

    iget-object v3, v3, Ll/c$a;->m:Ljava/lang/Object;

    invoke-static {v4, v3, v2}, Lq/i0;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lq/d1;)Lq/d1;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v3, p2}, Ll/l0;->i0(Ll/w;)V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    move-object v0, v2

    :cond_5
    :goto_2
    if-nez v0, :cond_6

    return-void

    :cond_6
    throw v0
.end method
