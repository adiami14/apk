.class public final Lcom/secure/itsonfire/Invader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/secure/itsonfire/Invader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005J\u001e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u00a8\u0006,"
    }
    d2 = {
        "Lcom/secure/itsonfire/Invader;",
        "",
        "context",
        "Landroid/content/Context;",
        "row",
        "",
        "column",
        "screenX",
        "screenY",
        "(Landroid/content/Context;IIII)V",
        "height",
        "",
        "isVisible",
        "",
        "()Z",
        "setVisible",
        "(Z)V",
        "left",
        "padding",
        "position",
        "Landroid/graphics/RectF;",
        "getPosition",
        "()Landroid/graphics/RectF;",
        "setPosition",
        "(Landroid/graphics/RectF;)V",
        "right",
        "shipMoving",
        "speed",
        "width",
        "getWidth",
        "()F",
        "setWidth",
        "(F)V",
        "dropDownAndReverse",
        "",
        "waveNumber",
        "takeAim",
        "playerShipX",
        "playerShipLength",
        "waves",
        "update",
        "fps",
        "",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/secure/itsonfire/Invader$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static bitmap1:Landroid/graphics/Bitmap;

.field public static bitmap2:Landroid/graphics/Bitmap;

.field private static numberOfInvaders:I


# instance fields
.field private height:F

.field private isVisible:Z

.field private final left:I

.field private final padding:I

.field private position:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final right:I

.field private shipMoving:I

.field private speed:F

.field private width:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/secure/itsonfire/Invader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/secure/itsonfire/Invader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/secure/itsonfire/Invader;->Companion:Lcom/secure/itsonfire/Invader$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/secure/itsonfire/Invader;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIII)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-float v0, p4

    const/high16 v1, 0x41880000    # 17.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/secure/itsonfire/Invader;->width:F

    int-to-float p5, p5

    div-float/2addr p5, v1

    iput p5, p0, Lcom/secure/itsonfire/Invader;->height:F

    div-int/lit8 p4, p4, 0x50

    iput p4, p0, Lcom/secure/itsonfire/Invader;->padding:I

    new-instance p5, Landroid/graphics/RectF;

    int-to-float p3, p3

    iget v0, p0, Lcom/secure/itsonfire/Invader;->width:F

    int-to-float v1, p4

    add-float/2addr v1, v0

    mul-float/2addr v1, p3

    const/16 v2, 0x64

    int-to-float v2, v2

    int-to-float p2, p2

    div-int/lit8 v3, p4, 0x4

    int-to-float v3, v3

    add-float/2addr v3, v0

    mul-float/2addr v3, p2

    add-float/2addr v3, v2

    int-to-float v4, p4

    add-float/2addr v4, v0

    mul-float/2addr p3, v4

    add-float/2addr p3, v0

    div-int/lit8 p4, p4, 0x4

    int-to-float p4, p4

    add-float/2addr v0, p4

    mul-float/2addr p2, v0

    add-float/2addr v2, p2

    iget p2, p0, Lcom/secure/itsonfire/Invader;->height:F

    add-float/2addr v2, p2

    invoke-direct {p5, v1, v3, p3, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p5, p0, Lcom/secure/itsonfire/Invader;->position:Landroid/graphics/RectF;

    const/high16 p2, 0x42200000    # 40.0f

    iput p2, p0, Lcom/secure/itsonfire/Invader;->speed:F

    const/4 p2, 0x1

    iput p2, p0, Lcom/secure/itsonfire/Invader;->left:I

    const/4 p3, 0x2

    iput p3, p0, Lcom/secure/itsonfire/Invader;->right:I

    iput p3, p0, Lcom/secure/itsonfire/Invader;->shipMoving:I

    iput-boolean p2, p0, Lcom/secure/itsonfire/Invader;->isVisible:Z

    sget-object p3, Lcom/secure/itsonfire/Invader;->Companion:Lcom/secure/itsonfire/Invader$Companion;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const p5, 0x7f07006f

    invoke-static {p4, p5}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p4

    const-string p5, "decodeResource(\n        \u2026     R.drawable.invader1)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Lcom/secure/itsonfire/Invader$Companion;->setBitmap1(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p4, 0x7f070070

    invoke-static {p1, p4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p4, "decodeResource(\n        \u2026     R.drawable.invader2)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Lcom/secure/itsonfire/Invader$Companion;->setBitmap2(Landroid/graphics/Bitmap;)V

    invoke-virtual {p3}, Lcom/secure/itsonfire/Invader$Companion;->getBitmap1()Landroid/graphics/Bitmap;

    move-result-object p1

    iget p4, p0, Lcom/secure/itsonfire/Invader;->width:F

    float-to-int p4, p4

    iget p5, p0, Lcom/secure/itsonfire/Invader;->height:F

    float-to-int p5, p5

    const/4 v0, 0x0

    invoke-static {p1, p4, p5, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p4, "createScaledBitmap(\n    \u2026nt()),\n            false)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Lcom/secure/itsonfire/Invader$Companion;->setBitmap1(Landroid/graphics/Bitmap;)V

    invoke-virtual {p3}, Lcom/secure/itsonfire/Invader$Companion;->getBitmap2()Landroid/graphics/Bitmap;

    move-result-object p1

    iget p5, p0, Lcom/secure/itsonfire/Invader;->width:F

    float-to-int p5, p5

    iget p0, p0, Lcom/secure/itsonfire/Invader;->height:F

    float-to-int p0, p0

    invoke-static {p1, p5, p0, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/secure/itsonfire/Invader$Companion;->setBitmap2(Landroid/graphics/Bitmap;)V

    sget p0, Lcom/secure/itsonfire/Invader;->numberOfInvaders:I

    add-int/2addr p0, p2

    sput p0, Lcom/secure/itsonfire/Invader;->numberOfInvaders:I

    return-void
.end method

.method public static final synthetic access$getNumberOfInvaders$cp()I
    .locals 1

    sget v0, Lcom/secure/itsonfire/Invader;->numberOfInvaders:I

    return v0
.end method

.method public static final synthetic access$setNumberOfInvaders$cp(I)V
    .locals 0

    sput p0, Lcom/secure/itsonfire/Invader;->numberOfInvaders:I

    return-void
.end method


# virtual methods
.method public final dropDownAndReverse(I)V
    .locals 3

    iget v0, p0, Lcom/secure/itsonfire/Invader;->shipMoving:I

    iget v1, p0, Lcom/secure/itsonfire/Invader;->left:I

    if-ne v0, v1, :cond_0

    iget v1, p0, Lcom/secure/itsonfire/Invader;->right:I

    :cond_0
    iput v1, p0, Lcom/secure/itsonfire/Invader;->shipMoving:I

    iget-object v0, p0, Lcom/secure/itsonfire/Invader;->position:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    iget v2, p0, Lcom/secure/itsonfire/Invader;->height:F

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    iget v0, p0, Lcom/secure/itsonfire/Invader;->speed:F

    const v1, 0x3f8ccccd    # 1.1f

    int-to-float p1, p1

    const/16 v2, 0x14

    int-to-float v2, v2

    div-float/2addr p1, v2

    add-float/2addr p1, v1

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/secure/itsonfire/Invader;->speed:F

    return-void
.end method

.method public final getPosition()Landroid/graphics/RectF;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lcom/secure/itsonfire/Invader;->position:Landroid/graphics/RectF;

    return-object p0
.end method

.method public final getWidth()F
    .locals 0

    iget p0, p0, Lcom/secure/itsonfire/Invader;->width:F

    return p0
.end method

.method public final isVisible()Z
    .locals 0

    iget-boolean p0, p0, Lcom/secure/itsonfire/Invader;->isVisible:Z

    return p0
.end method

.method public final setPosition(Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/secure/itsonfire/Invader;->position:Landroid/graphics/RectF;

    return-void
.end method

.method public final setVisible(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/secure/itsonfire/Invader;->isVisible:Z

    return-void
.end method

.method public final setWidth(F)V
    .locals 0

    iput p1, p0, Lcom/secure/itsonfire/Invader;->width:F

    return-void
.end method

.method public final takeAim(FFI)Z
    .locals 4

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    add-float/2addr p2, p1

    iget-object v1, p0, Lcom/secure/itsonfire/Invader;->position:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    cmpl-float v2, p2, v1

    const/4 v3, 0x1

    if-lez v2, :cond_0

    iget v2, p0, Lcom/secure/itsonfire/Invader;->width:F

    add-float/2addr v2, v1

    cmpg-float p2, p2, v2

    if-ltz p2, :cond_1

    :cond_0
    cmpl-float p2, p1, v1

    if-lez p2, :cond_2

    iget p0, p0, Lcom/secure/itsonfire/Invader;->width:F

    add-float/2addr v1, p0

    cmpg-float p0, p1, v1

    if-gez p0, :cond_2

    :cond_1
    sget p0, Lcom/secure/itsonfire/Invader;->numberOfInvaders:I

    mul-int/lit8 p0, p0, 0x64

    div-int/2addr p0, p3

    invoke-virtual {v0, p0}, Ljava/util/Random;->nextInt(I)I

    move-result p0

    if-nez p0, :cond_2

    return v3

    :cond_2
    sget p0, Lcom/secure/itsonfire/Invader;->numberOfInvaders:I

    mul-int/lit16 p0, p0, 0x96

    invoke-virtual {v0, p0}, Ljava/util/Random;->nextInt(I)I

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    return v3
.end method

.method public final update(J)V
    .locals 5

    iget v0, p0, Lcom/secure/itsonfire/Invader;->shipMoving:I

    iget v1, p0, Lcom/secure/itsonfire/Invader;->left:I

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lcom/secure/itsonfire/Invader;->position:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v3, p0, Lcom/secure/itsonfire/Invader;->speed:F

    long-to-float v4, p1

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iput v2, v1, Landroid/graphics/RectF;->left:F

    :cond_0
    iget v1, p0, Lcom/secure/itsonfire/Invader;->right:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/secure/itsonfire/Invader;->position:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lcom/secure/itsonfire/Invader;->speed:F

    long-to-float p1, p1

    div-float/2addr v2, p1

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->left:F

    :cond_1
    iget-object p1, p0, Lcom/secure/itsonfire/Invader;->position:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->left:F

    iget p0, p0, Lcom/secure/itsonfire/Invader;->width:F

    add-float/2addr p2, p0

    iput p2, p1, Landroid/graphics/RectF;->right:F

    return-void
.end method
