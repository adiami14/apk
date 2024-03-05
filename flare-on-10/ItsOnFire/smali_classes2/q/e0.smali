.class public final Lq/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lq/e0;",
        "",
        "Lj/z2;",
        "a",
        "",
        "b",
        "Z",
        "FAST_SERVICE_LOADER_ENABLED",
        "c",
        "Lj/z2;",
        "dispatcher",
        "<init>",
        "()V",
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
.field public static final a:Lq/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Z

.field public static final c:Lj/z2;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq/e0;

    invoke-direct {v0}, Lq/e0;-><init>()V

    sput-object v0, Lq/e0;->a:Lq/e0;

    const-string v1, "kotlinx.coroutines.fast.service.loader"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lq/t0;->e(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Lq/e0;->b:Z

    invoke-virtual {v0}, Lq/e0;->a()Lj/z2;

    move-result-object v0

    sput-object v0, Lq/e0;->c:Lj/z2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lj/z2;
    .locals 6

    const-class p0, Lq/d0;

    const/4 v0, 0x0

    :try_start_0
    sget-boolean v1, Lq/e0;->b:Z

    if-eqz v1, :cond_0

    sget-object p0, Lq/o;->a:Lq/o;

    invoke-virtual {p0}, Lq/o;->d()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {p0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, Lkotlin/sequences/SequencesKt;->asSequence(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;

    move-result-object p0

    invoke-static {p0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    move-object v2, v0

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, v2

    check-cast v3, Lq/d0;

    invoke-interface {v3}, Lq/d0;->c()I

    move-result v3

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lq/d0;

    invoke-interface {v5}, Lq/d0;->c()I

    move-result v5

    if-ge v3, v5, :cond_4

    move-object v2, v4

    move v3, v5

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    :goto_1
    check-cast v2, Lq/d0;

    if-eqz v2, :cond_5

    invoke-static {v2, p0}, Lq/f0;->f(Lq/d0;Ljava/util/List;)Lj/z2;

    move-result-object p0

    if-nez p0, :cond_6

    :cond_5
    const/4 p0, 0x3

    invoke-static {v0, v0, p0, v0}, Lq/f0;->b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Lq/g0;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, Lq/f0;->b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Lq/g0;

    move-result-object p0

    :cond_6
    :goto_2
    return-object p0
.end method
