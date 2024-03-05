.class public final Lcom/secure/itsonfire/DefenseBrick;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0008R\u000e\u0010\t\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/secure/itsonfire/DefenseBrick;",
        "",
        "row",
        "",
        "column",
        "shelterNumber",
        "screenX",
        "screenY",
        "(IIIII)V",
        "brickPadding",
        "height",
        "isVisible",
        "",
        "()Z",
        "setVisible",
        "(Z)V",
        "position",
        "Landroid/graphics/RectF;",
        "getPosition",
        "()Landroid/graphics/RectF;",
        "shelterPadding",
        "",
        "startHeight",
        "width",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final brickPadding:I

.field private final height:I

.field private isVisible:Z

.field private final position:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final shelterPadding:F

.field private final startHeight:F

.field private final width:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/secure/itsonfire/DefenseBrick;->isVisible:Z

    div-int/lit8 v1, p4, 0x64

    iput v1, p0, Lcom/secure/itsonfire/DefenseBrick;->width:I

    div-int/lit8 v2, p5, 0x50

    iput v2, p0, Lcom/secure/itsonfire/DefenseBrick;->height:I

    iput v0, p0, Lcom/secure/itsonfire/DefenseBrick;->brickPadding:I

    int-to-float p4, p4

    const/high16 v3, 0x41400000    # 12.0f

    div-float/2addr p4, v3

    iput p4, p0, Lcom/secure/itsonfire/DefenseBrick;->shelterPadding:F

    int-to-float p5, p5

    const/high16 v3, 0x41200000    # 10.0f

    div-float v3, p5, v3

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    sub-float/2addr p5, v3

    iput p5, p0, Lcom/secure/itsonfire/DefenseBrick;->startHeight:F

    new-instance v3, Landroid/graphics/RectF;

    mul-int v4, p2, v1

    add-int/2addr v4, v0

    int-to-float v4, v4

    int-to-float p3, p3

    mul-float v5, p4, p3

    add-float/2addr v4, v5

    add-float/2addr v4, p4

    mul-float v5, p4, p3

    add-float/2addr v4, v5

    mul-int v5, p1, v2

    add-int/2addr v5, v0

    int-to-float v5, v5

    add-float/2addr v5, p5

    mul-int/2addr p2, v1

    add-int/2addr p2, v1

    sub-int/2addr p2, v0

    int-to-float p2, p2

    mul-float v1, p4, p3

    add-float/2addr p2, v1

    add-float/2addr p2, p4

    mul-float/2addr p4, p3

    add-float/2addr p2, p4

    mul-int/2addr p1, v2

    add-int/2addr p1, v2

    sub-int/2addr p1, v0

    int-to-float p1, p1

    add-float/2addr p1, p5

    invoke-direct {v3, v4, v5, p2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v3, p0, Lcom/secure/itsonfire/DefenseBrick;->position:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final getPosition()Landroid/graphics/RectF;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lcom/secure/itsonfire/DefenseBrick;->position:Landroid/graphics/RectF;

    return-object p0
.end method

.method public final isVisible()Z
    .locals 0

    iget-boolean p0, p0, Lcom/secure/itsonfire/DefenseBrick;->isVisible:Z

    return p0
.end method

.method public final setVisible(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/secure/itsonfire/DefenseBrick;->isVisible:Z

    return-void
.end method
