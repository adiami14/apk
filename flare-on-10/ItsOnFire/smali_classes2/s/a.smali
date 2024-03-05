.class public final Ls/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/a$a;,
        Ls/a$c;,
        Ls/a$d;,
        Ls/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0003\u0006\u0013%B+\u0012\u0006\u0010H\u001a\u00020\u000c\u0012\u0006\u0010J\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010M\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010P\u001a\u00020B\u00a2\u0006\u0004\u0008[\u0010\\J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0008\u0018\u00010\u0008R\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u000c2\n\u0010\u000b\u001a\u00060\u0008R\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u000cH\u0082\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000cH\u0082\u0008\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\u0082\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082\u0008\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u0082\u0008\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0019\u0010\"\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008%\u0010\u0015J+\u0010\'\u001a\u0004\u0018\u00010\u0003*\u0008\u0018\u00010\u0008R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010)\u001a\u0008\u0018\u00010\u0008R\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\u0008R\u00020\u00002\u0006\u0010*\u001a\u00020\u000c2\u0006\u0010+\u001a\u00020\u000c\u00a2\u0006\u0004\u0008,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\u0008R\u00020\u0000\u00a2\u0006\u0004\u0008.\u0010/J\u0018\u00100\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\u0008\u00a2\u0006\u0004\u00080\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016\u00a2\u0006\u0004\u00084\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u00086\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f\u00a2\u0006\u0004\u00088\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\u0008\u0008\u0002\u0010<\u001a\u00020;2\u0008\u0008\u0002\u0010&\u001a\u00020\u0005\u00a2\u0006\u0004\u0008=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;\u00a2\u0006\u0004\u0008?\u0010@J\r\u0010A\u001a\u00020\u0019\u00a2\u0006\u0004\u0008A\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008E\u0010FR\u0014\u0010H\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010GR\u0014\u0010J\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010GR\u0014\u0010M\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0014\u0010P\u001a\u00020B8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0014\u0010S\u001a\u00020Q8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010RR\u0014\u0010T\u001a\u00020Q8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010RR\u001e\u0010W\u001a\u000c\u0012\u0008\u0012\u00060\u0008R\u00020\u00000U8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010VR\u0015\u0010X\u001a\u00020\u000c8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010\u0015R\u0015\u0010Y\u001a\u00020\u000c8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010\u0015R\u0011\u0010Z\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010\u001d\u00a8\u0006]"
    }
    d2 = {
        "Ls/a;",
        "Ljava/util/concurrent/Executor;",
        "Ljava/io/Closeable;",
        "Ls/k;",
        "task",
        "",
        "a",
        "(Ls/k;)Z",
        "Ls/a$c;",
        "q",
        "()Ls/a$c;",
        "worker",
        "",
        "p",
        "(Ls/a$c;)I",
        "",
        "state",
        "f",
        "(J)I",
        "c",
        "o",
        "()I",
        "i",
        "n",
        "()J",
        "",
        "h",
        "()V",
        "z",
        "()Z",
        "t",
        "skipUnpark",
        "w",
        "(Z)V",
        "A",
        "(J)Z",
        "C",
        "d",
        "tailDispatch",
        "y",
        "(Ls/a$c;Ls/k;Z)Ls/k;",
        "g",
        "oldIndex",
        "newIndex",
        "s",
        "(Ls/a$c;II)V",
        "r",
        "(Ls/a$c;)Z",
        "b",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "command",
        "execute",
        "(Ljava/lang/Runnable;)V",
        "close",
        "timeout",
        "v",
        "(J)V",
        "block",
        "Ls/l;",
        "taskContext",
        "j",
        "(Ljava/lang/Runnable;Ls/l;Z)V",
        "e",
        "(Ljava/lang/Runnable;Ls/l;)Ls/k;",
        "x",
        "",
        "toString",
        "()Ljava/lang/String;",
        "u",
        "(Ls/k;)V",
        "I",
        "corePoolSize",
        "k",
        "maxPoolSize",
        "l",
        "J",
        "idleWorkerKeepAliveNs",
        "m",
        "Ljava/lang/String;",
        "schedulerName",
        "Ls/f;",
        "Ls/f;",
        "globalCpuQueue",
        "globalBlockingQueue",
        "Lq/m0;",
        "Lq/m0;",
        "workers",
        "createdWorkers",
        "availableCpuPermits",
        "isTerminated",
        "<init>",
        "(IIJLjava/lang/String;)V",
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
.field public static final A:J = 0x3ffffe00000L

.field public static final B:I = 0x2a

.field public static final C:J = 0x7ffffc0000000000L

.field public static final D:I = 0x1

.field public static final E:I = 0x1ffffe

.field public static final F:J = 0x1fffffL

.field public static final G:J = -0x200000L

.field public static final H:J = 0x200000L

.field public static final q:Ls/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic r:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final u:Lq/r0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final v:I = -0x1

.field public static final w:I = 0x0

.field public static final x:I = 0x1

.field public static final y:I = 0x15

.field public static final z:J = 0x1fffffL


# instance fields
.field private volatile synthetic _isTerminated:I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile synthetic controlState:J
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final k:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final l:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final m:Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Ls/f;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Ls/f;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Lq/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq/m0<",
            "Ls/a$c;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic parkedWorkersStack:J
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls/a;->q:Ls/a$a;

    new-instance v0, Lq/r0;

    const-string v1, "NOT_IN_STACK"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Ls/a;->u:Lq/r0;

    const-class v0, Ls/a;

    const-string v1, "parkedWorkersStack"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Ls/a;->r:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-class v0, Ls/a;

    const-string v1, "controlState"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-class v0, Ls/a;

    const-string v1, "_isTerminated"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ls/a;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 3
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls/a;->j:I

    iput p2, p0, Ls/a;->k:I

    iput-wide p3, p0, Ls/a;->l:J

    iput-object p5, p0, Ls/a;->m:Ljava/lang/String;

    const/4 p5, 0x0

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, p5

    :goto_0
    if-eqz v1, :cond_7

    if-lt p2, p1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    const-string v2, "Max pool size "

    if-eqz v1, :cond_6

    const v1, 0x1ffffe

    if-gt p2, v1, :cond_2

    move v1, v0

    goto :goto_2

    :cond_2
    move v1, p5

    :goto_2
    if-eqz v1, :cond_5

    const-wide/16 v1, 0x0

    cmp-long p2, p3, v1

    if-lez p2, :cond_3

    goto :goto_3

    :cond_3
    move v0, p5

    :goto_3
    if-eqz v0, :cond_4

    new-instance p2, Ls/f;

    invoke-direct {p2}, Ls/f;-><init>()V

    iput-object p2, p0, Ls/a;->n:Ls/f;

    new-instance p2, Ls/f;

    invoke-direct {p2}, Ls/f;-><init>()V

    iput-object p2, p0, Ls/a;->o:Ls/f;

    iput-wide v1, p0, Ls/a;->parkedWorkersStack:J

    new-instance p2, Lq/m0;

    add-int/lit8 p3, p1, 0x1

    invoke-direct {p2, p3}, Lq/m0;-><init>(I)V

    iput-object p2, p0, Ls/a;->p:Lq/m0;

    int-to-long p1, p1

    const/16 p3, 0x2a

    shl-long/2addr p1, p3

    iput-wide p1, p0, Ls/a;->controlState:J

    iput p5, p0, Ls/a;->_isTerminated:I

    return-void

    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Idle worker keep alive time "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " must be positive"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " should not exceed maximal supported number of threads 2097150"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " should be greater than or equals to core pool size "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Core pool size "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " should be at least 1"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(IIJLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    sget-wide p3, Ls/o;->e:J

    :cond_0
    move-wide v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const-string p5, "DefaultDispatcher"

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Ls/a;-><init>(IIJLjava/lang/String;)V

    return-void
.end method

.method public static synthetic B(Ls/a;JILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Ls/a;->controlState:J

    :cond_0
    invoke-virtual {p0, p1, p2}, Ls/a;->A(J)Z

    move-result p0

    return p0
.end method

.method public static synthetic k(Ls/a;Ljava/lang/Runnable;Ls/l;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Ls/o;->i:Ls/l;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ls/a;->j(Ljava/lang/Runnable;Ls/l;Z)V

    return-void
.end method


# virtual methods
.method public final A(J)Z
    .locals 3

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, p1

    long-to-int v0, v0

    const-wide v1, 0x3ffffe00000L

    and-long/2addr p1, v1

    const/16 v1, 0x15

    shr-long/2addr p1, v1

    long-to-int p1, p1

    sub-int/2addr v0, p1

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p2

    iget v0, p0, Ls/a;->j:I

    if-ge p2, v0, :cond_1

    invoke-virtual {p0}, Ls/a;->d()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget v1, p0, Ls/a;->j:I

    if-le v1, v0, :cond_0

    invoke-virtual {p0}, Ls/a;->d()I

    :cond_0
    if-lez p2, :cond_1

    return v0

    :cond_1
    return p1
.end method

.method public final C()Z
    .locals 4

    :cond_0
    invoke-virtual {p0}, Ls/a;->q()Ls/a$c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    sget-object v2, Ls/a$c;->q:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, -0x1

    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final a(Ls/k;)Z
    .locals 2

    iget-object v0, p1, Ls/k;->k:Ls/l;

    invoke-interface {v0}, Ls/l;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object p0, p0, Ls/a;->o:Ls/f;

    goto :goto_1

    :cond_1
    iget-object p0, p0, Ls/a;->n:Ls/f;

    :goto_1
    invoke-virtual {p0, p1}, Lq/a0;->a(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final b(J)I
    .locals 2

    const-wide v0, 0x7ffffc0000000000L

    and-long p0, p1, v0

    const/16 p2, 0x2a

    shr-long/2addr p0, p2

    long-to-int p0, p0

    return p0
.end method

.method public final c(J)I
    .locals 2

    const-wide v0, 0x3ffffe00000L

    and-long p0, p1, v0

    const/16 p2, 0x15

    shr-long/2addr p0, p2

    long-to-int p0, p0

    return p0
.end method

.method public close()V
    .locals 2

    const-wide/16 v0, 0x2710

    invoke-virtual {p0, v0, v1}, Ls/a;->v(J)V

    return-void
.end method

.method public final d()I
    .locals 10

    iget-object v0, p0, Ls/a;->p:Lq/m0;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ls/a;->isTerminated()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 p0, -0x1

    monitor-exit v0

    return p0

    :cond_0
    :try_start_1
    iget-wide v1, p0, Ls/a;->controlState:J

    const-wide/32 v3, 0x1fffff

    and-long v5, v1, v3

    long-to-int v5, v5

    const-wide v6, 0x3ffffe00000L

    and-long/2addr v1, v6

    const/16 v6, 0x15

    shr-long/2addr v1, v6

    long-to-int v1, v1

    sub-int v1, v5, v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    iget v6, p0, Ls/a;->j:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lt v1, v6, :cond_1

    monitor-exit v0

    return v2

    :cond_1
    :try_start_2
    iget v6, p0, Ls/a;->k:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-lt v5, v6, :cond_2

    monitor-exit v0

    return v2

    :cond_2
    :try_start_3
    iget-wide v5, p0, Ls/a;->controlState:J

    and-long/2addr v5, v3

    long-to-int v5, v5

    const/4 v6, 0x1

    add-int/2addr v5, v6

    if-lez v5, :cond_3

    iget-object v7, p0, Ls/a;->p:Lq/m0;

    invoke-virtual {v7, v5}, Lq/m0;->b(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_3

    move v7, v6

    goto :goto_0

    :cond_3
    move v7, v2

    :goto_0
    if-eqz v7, :cond_6

    new-instance v7, Ls/a$c;

    invoke-direct {v7, p0, v5}, Ls/a$c;-><init>(Ls/a;I)V

    iget-object v8, p0, Ls/a;->p:Lq/m0;

    invoke-virtual {v8, v5, v7}, Lq/m0;->c(ILjava/lang/Object;)V

    sget-object v8, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v8, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v8

    and-long/2addr v3, v8

    long-to-int p0, v3

    if-ne v5, p0, :cond_4

    move v2, v6

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v7}, Ljava/lang/Thread;->start()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/2addr v1, v6

    monitor-exit v0

    return v1

    :cond_5
    :try_start_4
    const-string p0, "Failed requirement."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    const-string p0, "Failed requirement."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final e(Ljava/lang/Runnable;Ls/l;)Ls/k;
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ls/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Ls/o;->f:Ls/j;

    invoke-virtual {p0}, Ls/j;->a()J

    move-result-wide v0

    instance-of p0, p1, Ls/k;

    if-eqz p0, :cond_0

    check-cast p1, Ls/k;

    iput-wide v0, p1, Ls/k;->j:J

    iput-object p2, p1, Ls/k;->k:Ls/l;

    return-object p1

    :cond_0
    new-instance p0, Ls/n;

    invoke-direct {p0, p1, v0, v1, p2}, Ls/n;-><init>(Ljava/lang/Runnable;JLs/l;)V

    return-object p0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 6
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Ls/a;->k(Ls/a;Ljava/lang/Runnable;Ls/l;ZILjava/lang/Object;)V

    return-void
.end method

.method public final f(J)I
    .locals 2

    const-wide/32 v0, 0x1fffff

    and-long p0, p1, v0

    long-to-int p0, p0

    return p0
.end method

.method public final g()Ls/a$c;
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ls/a$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ls/a$c;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Ls/a$c;->a(Ls/a$c;)Ls/a;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    move-object v2, v0

    :cond_1
    return-object v2
.end method

.method public final h()V
    .locals 3

    sget-object v0, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, -0x200000

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    return-void
.end method

.method public final i()I
    .locals 4

    sget-object v0, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x1fffff

    and-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method public final isTerminated()Z
    .locals 0

    iget p0, p0, Ls/a;->_isTerminated:I

    return p0
.end method

.method public final j(Ljava/lang/Runnable;Ls/l;Z)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ls/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/b;->e()V

    :cond_0
    invoke-virtual {p0, p1, p2}, Ls/a;->e(Ljava/lang/Runnable;Ls/l;)Ls/k;

    move-result-object p1

    invoke-virtual {p0}, Ls/a;->g()Ls/a$c;

    move-result-object p2

    invoke-virtual {p0, p2, p1, p3}, Ls/a;->y(Ls/a$c;Ls/k;Z)Ls/k;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Ls/a;->a(Ls/k;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, Ls/a;->m:Ljava/lang/String;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " was terminated"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz p3, :cond_3

    if-eqz p2, :cond_3

    const/4 p2, 0x1

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    iget-object p1, p1, Ls/k;->k:Ls/l;

    invoke-interface {p1}, Ls/l;->f()I

    move-result p1

    if-nez p1, :cond_5

    if-eqz p2, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0}, Ls/a;->x()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p2}, Ls/a;->w(Z)V

    :goto_2
    return-void
.end method

.method public final l()I
    .locals 4

    iget-wide v0, p0, Ls/a;->controlState:J

    const-wide v2, 0x7ffffc0000000000L

    and-long/2addr v0, v2

    const/16 p0, 0x2a

    shr-long/2addr v0, p0

    long-to-int p0, v0

    return p0
.end method

.method public final m()I
    .locals 4

    iget-wide v0, p0, Ls/a;->controlState:J

    const-wide/32 v2, 0x1fffff

    and-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method public final n()J
    .locals 3

    sget-object v0, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, 0x200000

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final o()I
    .locals 4

    sget-object v0, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x1fffff

    and-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method public final p(Ls/a$c;)I
    .locals 0

    invoke-virtual {p1}, Ls/a$c;->h()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    sget-object p1, Ls/a;->u:Lq/r0;

    if-ne p0, p1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    check-cast p0, Ls/a$c;

    invoke-virtual {p0}, Ls/a$c;->g()I

    move-result p1

    if-eqz p1, :cond_2

    return p1

    :cond_2
    invoke-virtual {p0}, Ls/a$c;->h()Ljava/lang/Object;

    move-result-object p0

    goto :goto_0
.end method

.method public final q()Ls/a$c;
    .locals 9

    :cond_0
    iget-wide v2, p0, Ls/a;->parkedWorkersStack:J

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Ls/a;->p:Lq/m0;

    invoke-virtual {v1, v0}, Lq/m0;->b(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ls/a$c;

    if-nez v6, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    const-wide/32 v0, 0x200000

    add-long/2addr v0, v2

    const-wide/32 v4, -0x200000

    and-long/2addr v0, v4

    invoke-virtual {p0, v6}, Ls/a;->p(Ls/a$c;)I

    move-result v4

    if-ltz v4, :cond_0

    sget-object v5, Ls/a;->r:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    int-to-long v7, v4

    or-long/2addr v7, v0

    move-object v0, v5

    move-object v1, p0

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ls/a;->u:Lq/r0;

    invoke-virtual {v6, p0}, Ls/a$c;->q(Ljava/lang/Object;)V

    return-object v6
.end method

.method public final r(Ls/a$c;)Z
    .locals 8
    .param p1    # Ls/a$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ls/a$c;->h()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ls/a;->u:Lq/r0;

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget-wide v2, p0, Ls/a;->parkedWorkersStack:J

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    const-wide/32 v4, 0x200000

    add-long/2addr v4, v2

    const-wide/32 v6, -0x200000

    and-long/2addr v4, v6

    invoke-virtual {p1}, Ls/a$c;->g()I

    move-result v1

    iget-object v6, p0, Ls/a;->p:Lq/m0;

    invoke-virtual {v6, v0}, Lq/m0;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls/a$c;->q(Ljava/lang/Object;)V

    sget-object v0, Ls/a;->r:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    int-to-long v6, v1

    or-long/2addr v4, v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0
.end method

.method public final s(Ls/a$c;II)V
    .locals 8
    .param p1    # Ls/a$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    :cond_0
    iget-wide v2, p0, Ls/a;->parkedWorkersStack:J

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    const-wide/32 v4, 0x200000

    add-long/2addr v4, v2

    const-wide/32 v6, -0x200000

    and-long/2addr v4, v6

    if-ne v0, p2, :cond_2

    if-nez p3, :cond_1

    invoke-virtual {p0, p1}, Ls/a;->p(Ls/a$c;)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, p3

    :cond_2
    :goto_0
    if-ltz v0, :cond_0

    sget-object v1, Ls/a;->r:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    int-to-long v6, v0

    or-long/2addr v4, v6

    move-object v0, v1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final t()J
    .locals 3

    sget-object v0, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide v1, 0x40000000000L

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ls/a;->p:Lq/m0;

    invoke-virtual {v1}, Lq/m0;->a()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v2

    move v5, v4

    move v6, v5

    move v7, v6

    move v8, v3

    :goto_0
    if-ge v8, v1, :cond_7

    iget-object v9, p0, Ls/a;->p:Lq/m0;

    invoke-virtual {v9, v8}, Lq/m0;->b(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ls/a$c;

    if-nez v9, :cond_0

    goto :goto_2

    :cond_0
    iget-object v10, v9, Ls/a$c;->j:Ls/q;

    invoke-virtual {v10}, Ls/q;->f()I

    move-result v10

    iget-object v9, v9, Ls/a$c;->k:Ls/a$d;

    sget-object v11, Ls/a$b;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v11, v9

    if-eq v9, v3, :cond_5

    const/4 v11, 0x2

    if-eq v9, v11, :cond_4

    const/4 v11, 0x3

    if-eq v9, v11, :cond_3

    const/4 v11, 0x4

    if-eq v9, v11, :cond_2

    const/4 v10, 0x5

    if-eq v9, v10, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    if-lez v10, :cond_6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v10, 0x64

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v10, 0x63

    goto :goto_1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v10, 0x62

    :goto_1
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v5, 0x1

    :cond_6
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_7
    iget-wide v8, p0, Ls/a;->controlState:J

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ls/a;->m:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x40

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lj/z0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[Pool Size {core = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ls/a;->j:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", max = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ls/a;->k:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "}, Worker States {CPU = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", blocking = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", parked = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", dormant = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", terminated = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "}, running workers queues = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", global CPU queue size = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ls/a;->n:Ls/f;

    invoke-virtual {v0}, Lq/a0;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", global blocking queue size = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ls/a;->o:Ls/f;

    invoke-virtual {v0}, Lq/a0;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", Control State {created workers= "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/32 v2, 0x1fffff

    and-long/2addr v2, v8

    long-to-int v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", blocking tasks = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, 0x3ffffe00000L

    and-long/2addr v2, v8

    const/16 v0, 0x15

    shr-long/2addr v2, v0

    long-to-int v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", CPUs acquired = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Ls/a;->j:I

    const-wide v2, 0x7ffffc0000000000L

    and-long/2addr v2, v8

    const/16 v0, 0x2a

    shr-long/2addr v2, v0

    long-to-int v0, v2

    sub-int/2addr p0, v0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "}]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final u(Ls/k;)V
    .locals 1
    .param p1    # Ls/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object p0

    if-eqz p0, :cond_0

    :goto_0
    invoke-virtual {p0}, Lj/b;->f()V

    goto :goto_1

    :catchall_0
    move-exception p0

    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-static {}, Lj/c;->b()Lj/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lj/b;->f()V

    :cond_1
    throw p0
.end method

.method public final v(J)V
    .locals 7

    sget-object v0, Ls/a;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ls/a;->g()Ls/a$c;

    move-result-object v0

    iget-object v1, p0, Ls/a;->p:Lq/m0;

    monitor-enter v1

    :try_start_0
    iget-wide v3, p0, Ls/a;->controlState:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/32 v5, 0x1fffff

    and-long/2addr v3, v5

    long-to-int v3, v3

    monitor-exit v1

    if-gt v2, v3, :cond_3

    move v1, v2

    :goto_0
    iget-object v4, p0, Ls/a;->p:Lq/m0;

    invoke-virtual {v4, v1}, Lq/m0;->b(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v4, Ls/a$c;

    if-eq v4, v0, :cond_2

    :goto_1
    invoke-virtual {v4}, Ljava/lang/Thread;->isAlive()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v4}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    invoke-virtual {v4, p1, p2}, Ljava/lang/Thread;->join(J)V

    goto :goto_1

    :cond_1
    iget-object v4, v4, Ls/a$c;->j:Ls/q;

    iget-object v5, p0, Ls/a;->o:Ls/f;

    invoke-virtual {v4, v5}, Ls/q;->g(Ls/f;)V

    :cond_2
    if-eq v1, v3, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Ls/a;->o:Ls/f;

    invoke-virtual {p1}, Lq/a0;->b()V

    iget-object p1, p0, Ls/a;->n:Ls/f;

    invoke-virtual {p1}, Lq/a0;->b()V

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0, v2}, Ls/a$c;->f(Z)Ls/k;

    move-result-object p1

    if-nez p1, :cond_6

    :cond_4
    iget-object p1, p0, Ls/a;->n:Ls/f;

    invoke-virtual {p1}, Lq/a0;->g()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls/k;

    if-nez p1, :cond_6

    iget-object p1, p0, Ls/a;->o:Ls/f;

    invoke-virtual {p1}, Lq/a0;->g()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls/k;

    if-nez p1, :cond_6

    if-eqz v0, :cond_5

    sget-object p1, Ls/a$d;->n:Ls/a$d;

    invoke-virtual {v0, p1}, Ls/a$c;->t(Ls/a$d;)Z

    :cond_5
    const-wide/16 p1, 0x0

    iput-wide p1, p0, Ls/a;->parkedWorkersStack:J

    iput-wide p1, p0, Ls/a;->controlState:J

    return-void

    :cond_6
    invoke-virtual {p0, p1}, Ls/a;->u(Ls/k;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public final w(Z)V
    .locals 3

    sget-object v0, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v1, 0x200000

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide v0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ls/a;->C()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, v0, v1}, Ls/a;->A(J)Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Ls/a;->C()Z

    return-void
.end method

.method public final x()V
    .locals 4

    invoke-virtual {p0}, Ls/a;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Ls/a;->B(Ls/a;JILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Ls/a;->C()Z

    return-void
.end method

.method public final y(Ls/a$c;Ls/k;Z)Ls/k;
    .locals 1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    iget-object p0, p1, Ls/a$c;->k:Ls/a$d;

    sget-object v0, Ls/a$d;->n:Ls/a$d;

    if-ne p0, v0, :cond_1

    return-object p2

    :cond_1
    iget-object p0, p2, Ls/k;->k:Ls/l;

    invoke-interface {p0}, Ls/l;->f()I

    move-result p0

    if-nez p0, :cond_2

    iget-object p0, p1, Ls/a$c;->k:Ls/a$d;

    sget-object v0, Ls/a$d;->k:Ls/a$d;

    if-ne p0, v0, :cond_2

    return-object p2

    :cond_2
    const/4 p0, 0x1

    iput-boolean p0, p1, Ls/a$c;->o:Z

    iget-object p0, p1, Ls/a$c;->j:Ls/q;

    invoke-virtual {p0, p2, p3}, Ls/q;->a(Ls/k;Z)Ls/k;

    move-result-object p0

    return-object p0
.end method

.method public final z()Z
    .locals 6

    :cond_0
    iget-wide v2, p0, Ls/a;->controlState:J

    const-wide v0, 0x7ffffc0000000000L

    and-long/2addr v0, v2

    const/16 v4, 0x2a

    shr-long/2addr v0, v4

    long-to-int v0, v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    const-wide v0, 0x40000000000L

    sub-long v4, v2, v0

    sget-object v0, Ls/a;->s:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0
.end method
