.class public final Lo/o0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0008\u001a\u0004\u0008\u000c\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lo/o0$a;",
        "",
        "",
        "stopTimeoutMillis",
        "replayExpirationMillis",
        "Lo/o0;",
        "a",
        "b",
        "Lo/o0;",
        "c",
        "()Lo/o0;",
        "Eagerly",
        "d",
        "Lazily",
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
.field public static final synthetic a:Lo/o0$a;

.field public static final b:Lo/o0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lo/o0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/o0$a;

    invoke-direct {v0}, Lo/o0$a;-><init>()V

    sput-object v0, Lo/o0$a;->a:Lo/o0$a;

    new-instance v0, Lo/q0;

    invoke-direct {v0}, Lo/q0;-><init>()V

    sput-object v0, Lo/o0$a;->b:Lo/o0;

    new-instance v0, Lo/r0;

    invoke-direct {v0}, Lo/r0;-><init>()V

    sput-object v0, Lo/o0$a;->c:Lo/o0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lo/o0$a;JJILjava/lang/Object;)Lo/o0;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const-wide p3, 0x7fffffffffffffffL

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/o0$a;->a(JJ)Lo/o0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JJ)Lo/o0;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p0, Lo/s0;

    invoke-direct {p0, p1, p2, p3, p4}, Lo/s0;-><init>(JJ)V

    return-object p0
.end method

.method public final c()Lo/o0;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Lo/o0$a;->b:Lo/o0;

    return-object p0
.end method

.method public final d()Lo/o0;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Lo/o0$a;->c:Lo/o0;

    return-object p0
.end method
