.class public final Lq/w0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lj/s3<",
        "*>;",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "Lj/s3<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00002\u000c\u0010\u0001\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lj/s3;",
        "found",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "element",
        "a",
        "(Lj/s3;Lkotlin/coroutines/CoroutineContext$Element;)Lj/s3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final j:Lq/w0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/w0$b;

    invoke-direct {v0}, Lq/w0$b;-><init>()V

    sput-object v0, Lq/w0$b;->j:Lq/w0$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lj/s3;Lkotlin/coroutines/CoroutineContext$Element;)Lj/s3;
    .locals 0
    .param p1    # Lj/s3;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/CoroutineContext$Element;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/s3<",
            "*>;",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            ")",
            "Lj/s3<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p0, p2, Lj/s3;

    if-eqz p0, :cond_1

    check-cast p2, Lj/s3;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj/s3;

    check-cast p2, Lkotlin/coroutines/CoroutineContext$Element;

    invoke-virtual {p0, p1, p2}, Lq/w0$b;->a(Lj/s3;Lkotlin/coroutines/CoroutineContext$Element;)Lj/s3;

    move-result-object p0

    return-object p0
.end method
