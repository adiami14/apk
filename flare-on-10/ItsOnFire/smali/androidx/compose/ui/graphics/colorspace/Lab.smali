.class public final Landroidx/compose/ui/graphics/colorspace/Lab;
.super Landroidx/compose/ui/graphics/colorspace/ColorSpace;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/colorspace/Lab$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\t\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/colorspace/Lab;",
        "Landroidx/compose/ui/graphics/colorspace/ColorSpace;",
        "name",
        "",
        "id",
        "",
        "(Ljava/lang/String;I)V",
        "isWideGamut",
        "",
        "()Z",
        "fromXyz",
        "",
        "v",
        "getMaxValue",
        "",
        "component",
        "getMinValue",
        "toXyz",
        "Companion",
        "ui-graphics_release"
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
.field private static final A:F = 0.008856452f

.field private static final B:F = 7.787037f

.field private static final C:F = 0.13793103f

.field public static final Companion:Landroidx/compose/ui/graphics/colorspace/Lab$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final D:F = 0.20689656f


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/graphics/colorspace/Lab$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/colorspace/Lab$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/graphics/colorspace/Lab;->Companion:Landroidx/compose/ui/graphics/colorspace/Lab$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/ui/graphics/colorspace/ColorModel;->Companion:Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;->getLab-xdoWZVw()J

    move-result-wide v3

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public fromXyz([F)[F
    .locals 14
    .param p1    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "v"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    aget v0, p1, p0

    sget-object v1, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    move-result-object v2

    aget v2, v2, p0

    div-float/2addr v0, v2

    const/4 v2, 0x1

    aget v3, p1, v2

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    move-result-object v4

    aget v4, v4, v2

    div-float/2addr v3, v4

    const/4 v4, 0x2

    aget v5, p1, v4

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    move-result-object v1

    aget v1, v1, v4

    div-float/2addr v5, v1

    const v1, 0x3c111aa7

    cmpl-float v6, v0, v1

    const v7, 0x3eaaaaab

    const v8, 0x3e0d3dcb

    const v9, 0x40f92f68

    if-lez v6, :cond_0

    float-to-double v10, v0

    float-to-double v12, v7

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    double-to-float v0, v10

    goto :goto_0

    :cond_0
    mul-float/2addr v0, v9

    add-float/2addr v0, v8

    :goto_0
    cmpl-float v6, v3, v1

    if-lez v6, :cond_1

    float-to-double v10, v3

    float-to-double v12, v7

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    double-to-float v3, v10

    goto :goto_1

    :cond_1
    mul-float/2addr v3, v9

    add-float/2addr v3, v8

    :goto_1
    cmpl-float v1, v5, v1

    if-lez v1, :cond_2

    float-to-double v5, v5

    float-to-double v7, v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    double-to-float v1, v5

    goto :goto_2

    :cond_2
    mul-float/2addr v5, v9

    add-float v1, v5, v8

    :goto_2
    const/high16 v5, 0x42e80000    # 116.0f

    mul-float/2addr v5, v3

    const/high16 v6, 0x41800000    # 16.0f

    sub-float/2addr v5, v6

    const/high16 v6, 0x43fa0000    # 500.0f

    sub-float/2addr v0, v3

    mul-float/2addr v0, v6

    const/high16 v6, 0x43480000    # 200.0f

    sub-float/2addr v3, v1

    mul-float/2addr v3, v6

    const/4 v1, 0x0

    const/high16 v6, 0x42c80000    # 100.0f

    invoke-static {v5, v1, v6}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    aput v1, p1, p0

    const/high16 p0, -0x3d000000    # -128.0f

    const/high16 v1, 0x43000000    # 128.0f

    invoke-static {v0, p0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    aput v0, p1, v2

    invoke-static {v3, p0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p0

    aput p0, p1, v4

    return-object p1
.end method

.method public getMaxValue(I)F
    .locals 0

    if-nez p1, :cond_0

    const/high16 p0, 0x42c80000    # 100.0f

    goto :goto_0

    :cond_0
    const/high16 p0, 0x43000000    # 128.0f

    :goto_0
    return p0
.end method

.method public getMinValue(I)F
    .locals 0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/high16 p0, -0x3d000000    # -128.0f

    :goto_0
    return p0
.end method

.method public isWideGamut()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public toXyz([F)[F
    .locals 9
    .param p1    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "v"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    aget v0, p1, p0

    const/4 v1, 0x0

    const/high16 v2, 0x42c80000    # 100.0f

    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    aput v0, p1, p0

    const/4 v0, 0x1

    aget v1, p1, v0

    const/high16 v2, -0x3d000000    # -128.0f

    const/high16 v3, 0x43000000    # 128.0f

    invoke-static {v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    aput v1, p1, v0

    const/4 v1, 0x2

    aget v4, p1, v1

    invoke-static {v4, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    aput v2, p1, v1

    aget v3, p1, p0

    const/high16 v4, 0x41800000    # 16.0f

    add-float/2addr v3, v4

    const/high16 v4, 0x42e80000    # 116.0f

    div-float/2addr v3, v4

    aget v4, p1, v0

    const v5, 0x3b03126f    # 0.002f

    mul-float/2addr v4, v5

    add-float/2addr v4, v3

    const v5, 0x3ba3d70a    # 0.005f

    mul-float/2addr v2, v5

    sub-float v2, v3, v2

    const v5, 0x3e53dcb1

    cmpl-float v6, v4, v5

    const v7, 0x3e0d3dcb

    const v8, 0x3e038027

    if-lez v6, :cond_0

    mul-float v6, v4, v4

    mul-float/2addr v6, v4

    goto :goto_0

    :cond_0
    sub-float/2addr v4, v7

    mul-float v6, v4, v8

    :goto_0
    cmpl-float v4, v3, v5

    if-lez v4, :cond_1

    mul-float v4, v3, v3

    mul-float/2addr v4, v3

    goto :goto_1

    :cond_1
    sub-float/2addr v3, v7

    mul-float v4, v3, v8

    :goto_1
    cmpl-float v3, v2, v5

    if-lez v3, :cond_2

    mul-float v3, v2, v2

    mul-float/2addr v3, v2

    goto :goto_2

    :cond_2
    sub-float/2addr v2, v7

    mul-float v3, v2, v8

    :goto_2
    sget-object v2, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    move-result-object v5

    aget v5, v5, p0

    mul-float/2addr v6, v5

    aput v6, p1, p0

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    move-result-object p0

    aget p0, p0, v0

    mul-float/2addr v4, p0

    aput v4, p1, v0

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    move-result-object p0

    aget p0, p0, v1

    mul-float/2addr v3, p0

    aput v3, p1, v1

    return-object p1
.end method
