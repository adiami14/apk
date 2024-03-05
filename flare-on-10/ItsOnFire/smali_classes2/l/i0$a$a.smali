.class public final Ll/i0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll/i0$a;->d(Ll/i0;)Lt/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt/d<",
        "TE;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001JL\u0010\n\u001a\u00020\t\"\u0004\u0008\u0001\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00032$\u0010\u0008\u001a \u0008\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0017\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "l/i0$a$a",
        "Lt/d;",
        "R",
        "Lt/f;",
        "select",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "block",
        "",
        "L",
        "(Lt/f;Lkotlin/jvm/functions/Function2;)V",
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
.field public final synthetic j:Ll/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/i0<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll/i0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/i0<",
            "+TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ll/i0$a$a;->j:Ll/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Lt/f;Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .param p1    # Lt/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lt/f<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TE;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation build Lj/i2;
    .end annotation

    iget-object p0, p0, Ll/i0$a$a;->j:Ll/i0;

    invoke-interface {p0}, Ll/i0;->p()Lt/d;

    move-result-object p0

    new-instance v0, Ll/i0$a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Ll/i0$a$a$a;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p0, p1, v0}, Lt/d;->L(Lt/f;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method
