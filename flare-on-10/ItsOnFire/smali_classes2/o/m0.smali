.class public final enum Lo/m0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo/m0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lo/m0;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "START",
        "STOP",
        "STOP_AND_RESET_REPLAY_CACHE",
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
.field public static final enum j:Lo/m0;

.field public static final enum k:Lo/m0;

.field public static final enum l:Lo/m0;

.field public static final synthetic m:[Lo/m0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo/m0;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/m0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/m0;->j:Lo/m0;

    new-instance v0, Lo/m0;

    const-string v1, "STOP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/m0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/m0;->k:Lo/m0;

    new-instance v0, Lo/m0;

    const-string v1, "STOP_AND_RESET_REPLAY_CACHE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/m0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/m0;->l:Lo/m0;

    invoke-static {}, Lo/m0;->a()[Lo/m0;

    move-result-object v0

    sput-object v0, Lo/m0;->m:[Lo/m0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lo/m0;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lo/m0;

    sget-object v1, Lo/m0;->j:Lo/m0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/m0;->k:Lo/m0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/m0;->l:Lo/m0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/m0;
    .locals 1

    const-class v0, Lo/m0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo/m0;

    return-object p0
.end method

.method public static values()[Lo/m0;
    .locals 1

    sget-object v0, Lo/m0;->m:[Lo/m0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/m0;

    return-object v0
.end method
