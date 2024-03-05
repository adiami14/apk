.class public final Ln/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lkotlin/jvm/internal/markers/KMutableIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TE;>;",
        "Lkotlin/jvm/internal/markers/KMutableIterator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0082\u0004\u0018\u0000*\u0004\u0008\u0002\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\n\u001a\u00020\tH\u0002R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00028\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Ln/c$a$a;",
        "E",
        "",
        "",
        "hasNext",
        "next",
        "()Ljava/lang/Object;",
        "",
        "b",
        "",
        "a",
        "Lkotlin/Function2;",
        "j",
        "Lkotlin/jvm/functions/Function2;",
        "factory",
        "",
        "k",
        "I",
        "index",
        "l",
        "Ljava/lang/Object;",
        "key",
        "m",
        "value",
        "<init>",
        "(Ln/c$a;Lkotlin/jvm/functions/Function2;)V",
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
.field public final j:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TK;TV;TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public k:I

.field public l:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public m:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field public final synthetic n:Ln/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln/c<",
            "TK;TV;>.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln/c$a;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .param p1    # Ln/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TK;-TV;+TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ln/c$a$a;->n:Ln/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln/c$a$a;->j:Lkotlin/jvm/functions/Function2;

    const/4 p1, -0x1

    iput p1, p0, Ln/c$a$a;->k:I

    invoke-virtual {p0}, Ln/c$a$a;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    :cond_0
    :goto_0
    iget v0, p0, Ln/c$a$a;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ln/c$a$a;->k:I

    iget-object v1, p0, Ln/c$a$a;->n:Ln/c$a;

    invoke-static {v1}, Ln/c$a;->a(Ln/c$a;)I

    move-result v1

    if-ge v0, v1, :cond_3

    iget-object v0, p0, Ln/c$a$a;->n:Ln/c$a;

    iget-object v0, v0, Ln/c$a;->d:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v1, p0, Ln/c$a$a;->k:I

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iput-object v0, p0, Ln/c$a$a;->l:Ljava/lang/Object;

    iget-object v0, p0, Ln/c$a$a;->n:Ln/c$a;

    iget-object v0, v0, Ln/c$a;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v1, p0, Ln/c$a$a;->k:I

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ln/m;

    if-eqz v1, :cond_2

    check-cast v0, Ln/m;

    iget-object v0, v0, Ln/m;->a:Ljava/lang/Object;

    :cond_2
    if-eqz v0, :cond_0

    iput-object v0, p0, Ln/c$a$a;->m:Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public b()Ljava/lang/Void;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Ln/d;->c()Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, Ln/c$a$a;->k:I

    iget-object p0, p0, Ln/c$a$a;->n:Ln/c$a;

    invoke-static {p0}, Ln/c$a;->a(Ln/c$a;)I

    move-result p0

    if-ge v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget v0, p0, Ln/c$a$a;->k:I

    iget-object v1, p0, Ln/c$a$a;->n:Ln/c$a;

    invoke-static {v1}, Ln/c$a;->a(Ln/c$a;)I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Ln/c$a$a;->j:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Ln/c$a$a;->l:Ljava/lang/Object;

    if-nez v1, :cond_0

    const-string v1, "key"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_0
    iget-object v2, p0, Ln/c$a$a;->m:Ljava/lang/Object;

    if-nez v2, :cond_1

    const-string v2, "value"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Ln/c$a$a;->a()V

    return-object v0

    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public bridge synthetic remove()V
    .locals 0

    invoke-virtual {p0}, Ln/c$a$a;->b()Ljava/lang/Void;

    return-void
.end method
