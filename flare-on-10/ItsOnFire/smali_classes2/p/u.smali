.class public final Lp/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000c\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0008\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u0012\u0004\u0008\u0007\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u0012\u0004\u0008\n\u0010\u0004\u00a8\u0006\u000c"
    }
    d2 = {
        "Lq/r0;",
        "a",
        "Lq/r0;",
        "getNULL$annotations",
        "()V",
        "NULL",
        "b",
        "getUNINITIALIZED$annotations",
        "UNINITIALIZED",
        "c",
        "getDONE$annotations",
        "DONE",
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
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

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
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq/r0;

    const-string v1, "NULL"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp/u;->a:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "UNINITIALIZED"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp/u;->b:Lq/r0;

    new-instance v0, Lq/r0;

    const-string v1, "DONE"

    invoke-direct {v0, v1}, Lq/r0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp/u;->c:Lq/r0;

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    return-void
.end method
