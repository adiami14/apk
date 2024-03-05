.class public final Ln/h$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln/h;->g()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ln/h$a<",
        "*>;",
        "Ln/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "R",
        "Ln/h$a;",
        "owner",
        "a",
        "(Ln/h$a;)Ljava/lang/Object;",
        "n/h$c"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln/h$a;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ln/h$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln/h$a<",
            "*>;)",
            "Ln/e;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object p0, Ln/h;->a:Ln/h;

    invoke-static {p0, p1}, Ln/h;->b(Ln/h;Ln/h$a;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p1, Ln/h$a;->k:Ln/f;

    invoke-virtual {p0}, Ln/f;->c()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance v0, Ln/e;

    iget-object p1, p1, Ln/h$a;->k:Ln/f;

    invoke-direct {v0, p1, p0}, Ln/e;-><init>(Ln/f;Lkotlin/coroutines/CoroutineContext;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln/h$a;

    invoke-virtual {p0, p1}, Ln/h$b;->a(Ln/h$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
