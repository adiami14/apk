.class public final Lj/w2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000 \n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\u0008\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u0012\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u0012\u0004\u0008\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0005\u0012\u0004\u0008\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0005\u0012\u0004\u0008\u0010\u0010\u0007\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0014\"\u001a\u0010\u001b\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0005\u0012\u0004\u0008\u001a\u0010\u0007\"\u001a\u0010 \u001a\u00020\u001c8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u0012\u0004\u0008\u001f\u0010\u0007\"\u001a\u0010#\u001a\u00020\u001c8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001e\u0012\u0004\u0008\"\u0010\u0007\u00a8\u0006$"
    }
    d2 = {
        "",
        "g",
        "o",
        "Lq/r0;",
        "a",
        "Lq/r0;",
        "getCOMPLETING_ALREADY$annotations",
        "()V",
        "COMPLETING_ALREADY",
        "b",
        "getCOMPLETING_WAITING_CHILDREN$annotations",
        "COMPLETING_WAITING_CHILDREN",
        "c",
        "getCOMPLETING_RETRY$annotations",
        "COMPLETING_RETRY",
        "d",
        "getTOO_LATE_TO_CANCEL$annotations",
        "TOO_LATE_TO_CANCEL",
        "",
        "e",
        "I",
        "RETRY",
        "f",
        "FALSE",
        "TRUE",
        "h",
        "getSEALED$annotations",
        "SEALED",
        "Lj/s1;",
        "i",
        "Lj/s1;",
        "getEMPTY_NEW$annotations",
        "EMPTY_NEW",
        "j",
        "getEMPTY_ACTIVE$annotations",
        "EMPTY_ACTIVE",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lq/r0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:I = -0x1

.field public static final f:I = 0x0

.field public static final g:I = 0x1

.field public static final h:Lq/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final i:Lj/s1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final j:Lj/s1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq/r0;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj/w2;->a:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj/w2;->b:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj/w2;->c:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj/w2;->d:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj/w2;->h:Lq/r0;

    new-instance v0, Lj/s1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/s1;-><init>(Z)V

    sput-object v0, Lj/w2;->i:Lj/s1;

    new-instance v0, Lj/s1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lj/s1;-><init>(Z)V

    sput-object v0, Lj/w2;->j:Lj/s1;

    return-void
.end method

.method public static final synthetic a()Lq/r0;
    .locals 1

    sget-object v0, Lj/w2;->a:Lq/r0;

    return-object v0
.end method

.method public static final synthetic b()Lq/r0;
    .locals 1

    sget-object v0, Lj/w2;->c:Lq/r0;

    return-object v0
.end method

.method public static final synthetic c()Lj/s1;
    .locals 1

    sget-object v0, Lj/w2;->j:Lj/s1;

    return-object v0
.end method

.method public static final synthetic d()Lj/s1;
    .locals 1

    sget-object v0, Lj/w2;->i:Lj/s1;

    return-object v0
.end method

.method public static final synthetic e()Lq/r0;
    .locals 1

    sget-object v0, Lj/w2;->h:Lq/r0;

    return-object v0
.end method

.method public static final synthetic f()Lq/r0;
    .locals 1

    sget-object v0, Lj/w2;->d:Lq/r0;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p0, Lj/g2;

    if-eqz v0, :cond_0

    new-instance v0, Lj/h2;

    check-cast p0, Lj/g2;

    invoke-direct {v0, p0}, Lj/h2;-><init>(Lj/g2;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static synthetic h()V
    .locals 0

    return-void
.end method

.method public static synthetic i()V
    .locals 0

    return-void
.end method

.method public static synthetic j()V
    .locals 0

    return-void
.end method

.method public static synthetic k()V
    .locals 0

    return-void
.end method

.method public static synthetic l()V
    .locals 0

    return-void
.end method

.method public static synthetic m()V
    .locals 0

    return-void
.end method

.method public static synthetic n()V
    .locals 0

    return-void
.end method

.method public static final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p0, Lj/h2;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lj/h2;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lj/h2;->a:Lj/g2;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
