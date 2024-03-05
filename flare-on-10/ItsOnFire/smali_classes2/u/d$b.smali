.class public final Lu/d$b;
.super Lu/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lu/d$c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0007\u0008\u0082\u0004\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\"\u0010\u0014\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR3\u0010\u0014\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e8\u0006X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0018"
    }
    d2 = {
        "Lu/d$b;",
        "R",
        "Lu/d$c;",
        "Lu/d;",
        "",
        "i0",
        "",
        "g0",
        "",
        "toString",
        "Lt/f;",
        "p",
        "Lt/f;",
        "select",
        "Lkotlin/Function2;",
        "Lu/c;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "q",
        "Lkotlin/jvm/functions/Function2;",
        "block",
        "owner",
        "<init>",
        "(Lu/d;Ljava/lang/Object;Lt/f;Lkotlin/jvm/functions/Function2;)V",
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
.field public final p:Lt/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/f<",
            "TR;>;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lu/c;",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic r:Lu/d;


# direct methods
.method public constructor <init>(Lu/d;Ljava/lang/Object;Lt/f;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .param p1    # Lu/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lt/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lt/f<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lu/c;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu/d$b;->r:Lu/d;

    invoke-direct {p0, p1, p2}, Lu/d$c;-><init>(Lu/d;Ljava/lang/Object;)V

    iput-object p3, p0, Lu/d$b;->p:Lt/f;

    iput-object p4, p0, Lu/d$b;->q:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public g0()V
    .locals 5

    iget-object v0, p0, Lu/d$b;->q:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lu/d$b;->r:Lu/d;

    iget-object v2, p0, Lu/d$b;->p:Lt/f;

    invoke-interface {v2}, Lt/f;->o()Lkotlin/coroutines/Continuation;

    move-result-object v2

    new-instance v3, Lu/d$b$a;

    iget-object v4, p0, Lu/d$b;->r:Lu/d;

    invoke-direct {v3, v4, p0}, Lu/d$b$a;-><init>(Lu/d;Lu/d$b;)V

    invoke-static {v0, v1, v2, v3}, Lr/a;->e(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public i0()Z
    .locals 1

    invoke-virtual {p0}, Lu/d$c;->h0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lu/d$b;->p:Lt/f;

    invoke-interface {p0}, Lt/f;->i()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LockSelect["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu/d$c;->m:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu/d$b;->p:Lt/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lu/d$b;->r:Lu/d;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
