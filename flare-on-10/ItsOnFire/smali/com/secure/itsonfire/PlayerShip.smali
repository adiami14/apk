.class public final Lcom/secure/itsonfire/PlayerShip;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/secure/itsonfire/PlayerShip$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 &2\u00020\u0001:\u0001\'B\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u00a2\u0006\u0004\u0008$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0012R\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u0008\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u00a8\u0006("
    }
    d2 = {
        "Lcom/secure/itsonfire/PlayerShip;",
        "",
        "",
        "fps",
        "",
        "update",
        "",
        "screenX",
        "I",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "setBitmap",
        "(Landroid/graphics/Bitmap;)V",
        "",
        "width",
        "F",
        "getWidth",
        "()F",
        "height",
        "Landroid/graphics/RectF;",
        "position",
        "Landroid/graphics/RectF;",
        "getPosition",
        "()Landroid/graphics/RectF;",
        "speed",
        "moving",
        "getMoving",
        "()I",
        "setMoving",
        "(I)V",
        "Landroid/content/Context;",
        "context",
        "screenY",
        "<init>",
        "(Landroid/content/Context;II)V",
        "Companion",
        "a",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/secure/itsonfire/PlayerShip$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final left:I = 0x1

.field public static final right:I = 0x2

.field public static final stopped:I


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final height:F

.field private moving:I

.field private final position:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final screenX:I

.field private final speed:F

.field private final width:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/secure/itsonfire/PlayerShip$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/secure/itsonfire/PlayerShip$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/secure/itsonfire/PlayerShip;->Companion:Lcom/secure/itsonfire/PlayerShip$a;

    const/16 v0, 0x8

    sput v0, Lcom/secure/itsonfire/PlayerShip;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/secure/itsonfire/PlayerShip;->screenX:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f07007d

    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "decodeResource(\n        \u2026   R.drawable.playership)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/secure/itsonfire/PlayerShip;->bitmap:Landroid/graphics/Bitmap;

    int-to-float p1, p2

    const/high16 v0, 0x41a00000    # 20.0f

    div-float/2addr p1, v0

    iput p1, p0, Lcom/secure/itsonfire/PlayerShip;->width:F

    int-to-float p3, p3

    const/high16 v0, 0x41200000    # 10.0f

    div-float v0, p3, v0

    iput v0, p0, Lcom/secure/itsonfire/PlayerShip;->height:F

    new-instance v1, Landroid/graphics/RectF;

    int-to-float v2, p2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float v3, p3, v0

    div-int/lit8 p2, p2, 0x2

    int-to-float p2, p2

    add-float/2addr p2, p1

    invoke-direct {v1, v2, v3, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Lcom/secure/itsonfire/PlayerShip;->position:Landroid/graphics/RectF;

    const/high16 p2, 0x43e10000    # 450.0f

    iput p2, p0, Lcom/secure/itsonfire/PlayerShip;->speed:F

    iget-object p2, p0, Lcom/secure/itsonfire/PlayerShip;->bitmap:Landroid/graphics/Bitmap;

    float-to-int p1, p1

    float-to-int p3, v0

    const/4 v0, 0x0

    invoke-static {p2, p1, p3, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createScaledBitmap(bitma\u2026nt() ,\n            false)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/secure/itsonfire/PlayerShip;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lcom/secure/itsonfire/PlayerShip;->bitmap:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final getMoving()I
    .locals 0

    iget p0, p0, Lcom/secure/itsonfire/PlayerShip;->moving:I

    return p0
.end method

.method public final getPosition()Landroid/graphics/RectF;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lcom/secure/itsonfire/PlayerShip;->position:Landroid/graphics/RectF;

    return-object p0
.end method

.method public final getWidth()F
    .locals 0

    iget p0, p0, Lcom/secure/itsonfire/PlayerShip;->width:F

    return p0
.end method

.method public final setBitmap(Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/secure/itsonfire/PlayerShip;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final setMoving(I)V
    .locals 0

    iput p1, p0, Lcom/secure/itsonfire/PlayerShip;->moving:I

    return-void
.end method

.method public final update(J)V
    .locals 4

    iget v0, p0, Lcom/secure/itsonfire/PlayerShip;->moving:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lcom/secure/itsonfire/PlayerShip;->position:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-lez v3, :cond_0

    iget v0, p0, Lcom/secure/itsonfire/PlayerShip;->speed:F

    long-to-float p1, p1

    div-float/2addr v0, p1

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->left:F

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/secure/itsonfire/PlayerShip;->position:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lcom/secure/itsonfire/PlayerShip;->screenX:I

    int-to-float v2, v2

    iget v3, p0, Lcom/secure/itsonfire/PlayerShip;->width:F

    sub-float/2addr v2, v3

    cmpg-float v2, v1, v2

    if-gez v2, :cond_1

    iget v2, p0, Lcom/secure/itsonfire/PlayerShip;->speed:F

    long-to-float p1, p1

    div-float/2addr v2, p1

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->left:F

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/secure/itsonfire/PlayerShip;->position:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->left:F

    iget p0, p0, Lcom/secure/itsonfire/PlayerShip;->width:F

    add-float/2addr p2, p0

    iput p2, p1, Landroid/graphics/RectF;->right:F

    return-void
.end method
