.class public Lq/y$b;
.super Lq/y$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lq/y;",
        ">",
        "Lq/y$a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0012\u0008\u0016\u0018\u0000*\u000c\u0008\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001c\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\"\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J#\u0010\r\u001a\u00020\u000c2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "Lq/y$b;",
        "Lq/y;",
        "Lkotlinx/coroutines/internal/Node;",
        "T",
        "Lq/y$a;",
        "Lq/j0;",
        "op",
        "m",
        "(Lq/j0;)Lq/y;",
        "affected",
        "",
        "next",
        "",
        "l",
        "(Lq/y;Ljava/lang/Object;)Z",
        "Lq/y$d;",
        "prepareOp",
        "",
        "g",
        "(Lq/y$d;)V",
        "n",
        "(Lq/y;Lq/y;)Ljava/lang/Object;",
        "f",
        "(Lq/y;Lq/y;)V",
        "b",
        "Lq/y;",
        "queue",
        "c",
        "node",
        "h",
        "()Lq/y;",
        "affectedNode",
        "i",
        "originalNext",
        "<init>",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _affectedNode:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lq/y;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lq/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lq/y$b;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_affectedNode"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lq/y$b;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lq/y;Lq/y;)V
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/y;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lq/y$a;-><init>()V

    iput-object p1, p0, Lq/y$b;->b:Lq/y;

    iput-object p2, p0, Lq/y$b;->c:Lq/y;

    const/4 p1, 0x0

    iput-object p1, p0, Lq/y$b;->_affectedNode:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public f(Lq/y;Lq/y;)V
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object p1, p0, Lq/y$b;->c:Lq/y;

    iget-object p0, p0, Lq/y$b;->b:Lq/y;

    invoke-static {p1, p0}, Lq/y;->y(Lq/y;Lq/y;)V

    return-void
.end method

.method public g(Lq/y$d;)V
    .locals 2
    .param p1    # Lq/y$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lq/y$b;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object p1, p1, Lq/y$d;->a:Lq/y;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final h()Lq/y;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Lq/y$b;->_affectedNode:Ljava/lang/Object;

    check-cast p0, Lq/y;

    return-object p0
.end method

.method public final i()Lq/y;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lq/y$b;->b:Lq/y;

    return-object p0
.end method

.method public l(Lq/y;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object p0, p0, Lq/y$b;->b:Lq/y;

    if-eq p2, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public final m(Lq/j0;)Lq/y;
    .locals 0
    .param p1    # Lq/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Lq/y$b;->b:Lq/y;

    invoke-static {p0, p1}, Lq/y;->x(Lq/y;Lq/j0;)Lq/y;

    move-result-object p0

    return-object p0
.end method

.method public n(Lq/y;Lq/y;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p2, p0, Lq/y$b;->c:Lq/y;

    sget-object v0, Lq/y;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p2, p2, p1}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lq/y$b;->c:Lq/y;

    sget-object p2, Lq/y;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v0, p0, Lq/y$b;->b:Lq/y;

    invoke-static {p2, p1, p1, v0}, Landroidx/concurrent/futures/a;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p0, p0, Lq/y$b;->c:Lq/y;

    return-object p0
.end method
