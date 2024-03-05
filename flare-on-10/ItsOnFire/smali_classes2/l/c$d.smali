.class public final Ll/c$d;
.super Lq/y$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lq/y$e<",
        "Ll/j0<",
        "-TE;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0004\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0014\u0010\u000e\u001a\u00028\u00018\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Ll/c$d;",
        "E",
        "Lq/y$e;",
        "Ll/j0;",
        "Lkotlinx/coroutines/internal/RemoveFirstDesc;",
        "Lq/y;",
        "affected",
        "",
        "e",
        "Lq/y$d;",
        "Lkotlinx/coroutines/internal/PrepareOp;",
        "prepareOp",
        "j",
        "Ljava/lang/Object;",
        "element",
        "Lq/w;",
        "queue",
        "<init>",
        "(Ljava/lang/Object;Lq/w;)V",
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
.field public final e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lq/w;)V
    .locals 0
    .param p2    # Lq/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lq/w;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lq/y$e;-><init>(Lq/y;)V

    iput-object p1, p0, Ll/c$d;->e:Ljava/lang/Object;

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
    instance-of p0, p1, Ll/j0;

    if-nez p0, :cond_1

    sget-object p1, Ll/b;->e:Lq/r0;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public j(Lq/y$d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lq/y$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p1, Lq/y$d;->a:Lq/y;

    check-cast v0, Ll/j0;

    iget-object p0, p0, Ll/c$d;->e:Ljava/lang/Object;

    invoke-interface {v0, p0, p1}, Ll/j0;->c(Ljava/lang/Object;Lq/y$d;)Lq/r0;

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
