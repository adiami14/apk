.class public final Lcom/secure/itsonfire/Bullet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\u0008\u001a\u00020\u0003X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0003X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\nR\u000e\u0010\u0018\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/secure/itsonfire/Bullet;",
        "",
        "screenY",
        "",
        "speed",
        "",
        "heightModifier",
        "(IFF)V",
        "down",
        "getDown",
        "()I",
        "heading",
        "height",
        "isActive",
        "",
        "()Z",
        "setActive",
        "(Z)V",
        "position",
        "Landroid/graphics/RectF;",
        "getPosition",
        "()Landroid/graphics/RectF;",
        "up",
        "getUp",
        "width",
        "shoot",
        "startX",
        "startY",
        "direction",
        "update",
        "",
        "fps",
        "",
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
.field private final down:I

.field private heading:I

.field private height:F

.field private isActive:Z

.field private final position:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final speed:F

.field private final up:I

.field private final width:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/secure/itsonfire/Bullet;->speed:F

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/secure/itsonfire/Bullet;->position:Landroid/graphics/RectF;

    const/4 p2, 0x1

    iput p2, p0, Lcom/secure/itsonfire/Bullet;->down:I

    const/4 p2, -0x1

    iput p2, p0, Lcom/secure/itsonfire/Bullet;->heading:I

    const/16 p2, 0xf

    iput p2, p0, Lcom/secure/itsonfire/Bullet;->width:I

    int-to-float p1, p1

    div-float/2addr p1, p3

    iput p1, p0, Lcom/secure/itsonfire/Bullet;->height:F

    return-void
.end method

.method public synthetic constructor <init>(IFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/high16 p2, 0x43af0000    # 350.0f

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/high16 p3, 0x41a00000    # 20.0f

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/secure/itsonfire/Bullet;-><init>(IFF)V

    return-void
.end method


# virtual methods
.method public final getDown()I
    .locals 0

    iget p0, p0, Lcom/secure/itsonfire/Bullet;->down:I

    return p0
.end method

.method public final getPosition()Landroid/graphics/RectF;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Lcom/secure/itsonfire/Bullet;->position:Landroid/graphics/RectF;

    return-object p0
.end method

.method public final getUp()I
    .locals 0

    iget p0, p0, Lcom/secure/itsonfire/Bullet;->up:I

    return p0
.end method

.method public final isActive()Z
    .locals 0

    iget-boolean p0, p0, Lcom/secure/itsonfire/Bullet;->isActive:Z

    return p0
.end method

.method public final setActive(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/secure/itsonfire/Bullet;->isActive:Z

    return-void
.end method

.method public final shoot(FFI)Z
    .locals 2

    iget-boolean v0, p0, Lcom/secure/itsonfire/Bullet;->isActive:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/secure/itsonfire/Bullet;->position:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->left:F

    iput p2, v0, Landroid/graphics/RectF;->top:F

    iget v1, p0, Lcom/secure/itsonfire/Bullet;->width:I

    int-to-float v1, v1

    add-float/2addr p1, v1

    iput p1, v0, Landroid/graphics/RectF;->right:F

    iget p1, p0, Lcom/secure/itsonfire/Bullet;->height:F

    add-float/2addr p2, p1

    iput p2, v0, Landroid/graphics/RectF;->bottom:F

    iput p3, p0, Lcom/secure/itsonfire/Bullet;->heading:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/secure/itsonfire/Bullet;->isActive:Z

    return p1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final update(J)V
    .locals 3

    iget v0, p0, Lcom/secure/itsonfire/Bullet;->heading:I

    iget v1, p0, Lcom/secure/itsonfire/Bullet;->up:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/secure/itsonfire/Bullet;->position:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    iget v2, p0, Lcom/secure/itsonfire/Bullet;->speed:F

    long-to-float p1, p1

    div-float/2addr v2, p1

    sub-float/2addr v1, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/secure/itsonfire/Bullet;->position:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    iget v2, p0, Lcom/secure/itsonfire/Bullet;->speed:F

    long-to-float p1, p1

    div-float/2addr v2, p1

    add-float/2addr v1, v2

    :goto_0
    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object p1, p0, Lcom/secure/itsonfire/Bullet;->position:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->top:F

    iget p0, p0, Lcom/secure/itsonfire/Bullet;->height:F

    add-float/2addr p2, p0

    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    return-void
.end method
