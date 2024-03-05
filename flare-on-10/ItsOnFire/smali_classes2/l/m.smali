.class public final enum Ll/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ll/m;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SUSPEND",
        "DROP_OLDEST",
        "DROP_LATEST",
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
.field public static final enum j:Ll/m;

.field public static final enum k:Ll/m;

.field public static final enum l:Ll/m;

.field public static final synthetic m:[Ll/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll/m;

    const-string v1, "SUSPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/m;->j:Ll/m;

    new-instance v0, Ll/m;

    const-string v1, "DROP_OLDEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/m;->k:Ll/m;

    new-instance v0, Ll/m;

    const-string v1, "DROP_LATEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/m;->l:Ll/m;

    invoke-static {}, Ll/m;->a()[Ll/m;

    move-result-object v0

    sput-object v0, Ll/m;->m:[Ll/m;

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

.method public static final synthetic a()[Ll/m;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/m;

    sget-object v1, Ll/m;->j:Ll/m;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/m;->k:Ll/m;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/m;->l:Ll/m;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll/m;
    .locals 1

    const-class v0, Ll/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/m;

    return-object p0
.end method

.method public static values()[Ll/m;
    .locals 1

    sget-object v0, Ll/m;->m:[Ll/m;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/m;

    return-object v0
.end method
