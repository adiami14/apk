.class public final Landroidx/compose/ui/graphics/ColorMatrix;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\r\u0010\u000bJ5\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0086\n\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\r\u0010\"\u001a\u00020\t\u00a2\u0006\u0004\u0008#\u0010\u000bJP\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f26\u0010&\u001a2\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(+\u0012\u0004\u0012\u00020\t0\'H\u0082\u0008\u00a2\u0006\u0004\u0008,\u0010-J\u001b\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00080\u00101J(\u0010.\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000fH\u0086\n\u00a2\u0006\u0004\u00083\u00104J\u0015\u00105\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f\u00a2\u0006\u0004\u00086\u00107J\u0015\u00108\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f\u00a2\u0006\u0004\u00089\u00107J\u0015\u0010:\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f\u00a2\u0006\u0004\u0008;\u00107J\u0015\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u000f\u00a2\u0006\u0004\u0008>\u00107J-\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000f\u00a2\u0006\u0004\u0008D\u0010EJ\u001e\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008H\u00101J\u0010\u0010I\u001a\u00020JH\u00d6\u0001\u00a2\u0006\u0004\u0008K\u0010LR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006M"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/ColorMatrix;",
        "",
        "values",
        "",
        "constructor-impl",
        "([F)[F",
        "getValues",
        "()[F",
        "convertRgbToYuv",
        "",
        "convertRgbToYuv-impl",
        "([F)V",
        "convertYuvToRgb",
        "convertYuvToRgb-impl",
        "dot",
        "",
        "m1",
        "row",
        "",
        "m2",
        "column",
        "dot-Me4OoYI",
        "([F[FI[FI)F",
        "equals",
        "",
        "other",
        "equals-impl",
        "([FLjava/lang/Object;)Z",
        "get",
        "get-impl",
        "([FII)F",
        "hashCode",
        "hashCode-impl",
        "([F)I",
        "reset",
        "reset-impl",
        "rotateInternal",
        "degrees",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "cosine",
        "sine",
        "rotateInternal-impl",
        "([FFLkotlin/jvm/functions/Function2;)V",
        "set",
        "src",
        "set-jHG-Opc",
        "([F[F)V",
        "v",
        "set-impl",
        "([FIIF)V",
        "setToRotateBlue",
        "setToRotateBlue-impl",
        "([FF)V",
        "setToRotateGreen",
        "setToRotateGreen-impl",
        "setToRotateRed",
        "setToRotateRed-impl",
        "setToSaturation",
        "sat",
        "setToSaturation-impl",
        "setToScale",
        "redScale",
        "greenScale",
        "blueScale",
        "alphaScale",
        "setToScale-impl",
        "([FFFFF)V",
        "timesAssign",
        "colorMatrix",
        "timesAssign-jHG-Opc",
        "toString",
        "",
        "toString-impl",
        "([F)Ljava/lang/String;",
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

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# instance fields
.field private final values:[F
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private synthetic constructor <init>([F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/graphics/ColorMatrix;->values:[F

    return-void
.end method

.method public static final synthetic box-impl([F)Landroidx/compose/ui/graphics/ColorMatrix;
    .locals 1

    new-instance v0, Landroidx/compose/ui/graphics/ColorMatrix;

    invoke-direct {v0, p0}, Landroidx/compose/ui/graphics/ColorMatrix;-><init>([F)V

    return-object v0
.end method

.method public static constructor-impl([F)[F
    .locals 1
    .param p0    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "values"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic constructor-impl$default([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/16 p0, 0x14

    new-array p0, p0, [F

    fill-array-data p0, :array_0

    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->constructor-impl([F)[F

    move-result-object p0

    return-object p0

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static final convertRgbToYuv-impl([F)V
    .locals 2

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->reset-impl([F)V

    const v0, 0x3e991687    # 0.299f

    const/4 v1, 0x0

    aput v0, p0, v1

    const v0, 0x3f1645a2    # 0.587f

    const/4 v1, 0x1

    aput v0, p0, v1

    const v0, 0x3de978d5    # 0.114f

    const/4 v1, 0x2

    aput v0, p0, v1

    const v0, -0x41d335d2    # -0.16874f

    const/4 v1, 0x5

    aput v0, p0, v1

    const v0, -0x41566517    # -0.33126f

    const/4 v1, 0x6

    aput v0, p0, v1

    const/4 v0, 0x7

    const/high16 v1, 0x3f000000    # 0.5f

    aput v1, p0, v0

    const/16 v0, 0xa

    aput v1, p0, v0

    const v0, -0x4129a177    # -0.41869f

    const/16 v1, 0xb

    aput v0, p0, v1

    const v0, -0x42597a25    # -0.08131f

    const/16 v1, 0xc

    aput v0, p0, v1

    return-void
.end method

.method public static final convertYuvToRgb-impl([F)V
    .locals 3

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->reset-impl([F)V

    const v0, 0x3fb374bc    # 1.402f

    const/4 v1, 0x2

    aput v0, p0, v1

    const/4 v0, 0x5

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p0, v0

    const v0, -0x414fcce2    # -0.34414f

    const/4 v2, 0x6

    aput v0, p0, v2

    const v0, -0x40c92e1f    # -0.71414f

    const/4 v2, 0x7

    aput v0, p0, v2

    const/16 v0, 0xa

    aput v1, p0, v0

    const v0, 0x3fe2d0e5    # 1.772f

    const/16 v1, 0xb

    aput v0, p0, v1

    const/4 v0, 0x0

    const/16 v1, 0xc

    aput v0, p0, v1

    return-void
.end method

.method private static final dot-Me4OoYI([F[FI[FI)F
    .locals 2

    const/4 p0, 0x5

    mul-int/2addr p2, p0

    add-int/lit8 v0, p2, 0x0

    aget v0, p1, v0

    const/4 v1, 0x0

    add-int/2addr v1, p4

    aget v1, p3, v1

    mul-float/2addr v0, v1

    add-int/lit8 v1, p2, 0x1

    aget v1, p1, v1

    add-int/2addr p0, p4

    aget p0, p3, p0

    mul-float/2addr v1, p0

    add-float/2addr v0, v1

    add-int/lit8 p0, p2, 0x2

    aget p0, p1, p0

    const/16 v1, 0xa

    add-int/2addr v1, p4

    aget v1, p3, v1

    mul-float/2addr p0, v1

    add-float/2addr v0, p0

    add-int/lit8 p2, p2, 0x3

    aget p0, p1, p2

    const/16 p1, 0xf

    add-int/2addr p1, p4

    aget p1, p3, p1

    mul-float/2addr p0, p1

    add-float/2addr v0, p0

    return v0
.end method

.method public static equals-impl([FLjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/ui/graphics/ColorMatrix;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Landroidx/compose/ui/graphics/ColorMatrix;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/ColorMatrix;->unbox-impl()[F

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final equals-impl0([F[F)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final get-impl([FII)F
    .locals 1

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    mul-int/lit8 p1, p1, 0x5

    add-int/2addr p1, p2

    aget p0, p0, p1

    return p0
.end method

.method public static hashCode-impl([F)I
    .locals 0

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([F)I

    move-result p0

    return p0
.end method

.method public static final reset-impl([F)V
    .locals 7

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lkotlin/collections/ArraysKt;->fill$default([FFIIILjava/lang/Object;)V

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p0, v0

    const/16 v0, 0xc

    aput v1, p0, v0

    const/4 v0, 0x6

    aput v1, p0, v0

    const/16 v0, 0x12

    aput v1, p0, v0

    return-void
.end method

.method private static final rotateInternal-impl([FFLkotlin/jvm/functions/Function2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([FF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->reset-impl([F)V

    float-to-double p0, p1

    const-wide v0, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr p0, v0

    const-wide v0, 0x4066800000000000L    # 180.0

    div-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->sin(D)D

    move-result-wide p0

    double-to-float p0, p0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-interface {p2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final set-impl([FIIF)V
    .locals 1

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    mul-int/lit8 p1, p1, 0x5

    add-int/2addr p1, p2

    aput p3, p0, p1

    return-void
.end method

.method public static final set-jHG-Opc([F[F)V
    .locals 8
    .param p1    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Lkotlin/collections/ArraysKt;->copyInto$default([F[FIIIILjava/lang/Object;)[F

    return-void
.end method

.method public static final setToRotateBlue-impl([FF)V
    .locals 4

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->reset-impl([F)V

    float-to-double v0, p1

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v2

    const-wide v2, 0x4066800000000000L    # 180.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/4 v1, 0x6

    aput p1, p0, v1

    const/4 v1, 0x0

    aput p1, p0, v1

    const/4 p1, 0x1

    aput v0, p0, p1

    neg-float p1, v0

    const/4 v0, 0x5

    aput p1, p0, v0

    return-void
.end method

.method public static final setToRotateGreen-impl([FF)V
    .locals 4

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->reset-impl([F)V

    float-to-double v0, p1

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v2

    const-wide v2, 0x4066800000000000L    # 180.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/16 v1, 0xc

    aput p1, p0, v1

    const/4 v1, 0x0

    aput p1, p0, v1

    neg-float p1, v0

    const/4 v1, 0x2

    aput p1, p0, v1

    const/16 p1, 0xa

    aput v0, p0, p1

    return-void
.end method

.method public static final setToRotateRed-impl([FF)V
    .locals 4

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->reset-impl([F)V

    float-to-double v0, p1

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v2

    const-wide v2, 0x4066800000000000L    # 180.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/16 v1, 0xc

    aput p1, p0, v1

    const/4 v1, 0x6

    aput p1, p0, v1

    const/4 p1, 0x7

    aput v0, p0, p1

    neg-float p1, v0

    const/16 v0, 0xb

    aput p1, p0, v0

    return-void
.end method

.method public static final setToSaturation-impl([FF)V
    .locals 6

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->reset-impl([F)V

    const/4 v0, 0x1

    int-to-float v1, v0

    sub-float/2addr v1, p1

    const v2, 0x3e5a1cac    # 0.213f

    mul-float/2addr v2, v1

    const v3, 0x3f370a3d    # 0.715f

    mul-float/2addr v3, v1

    const v4, 0x3d9374bc    # 0.072f

    mul-float/2addr v1, v4

    add-float v4, v2, p1

    const/4 v5, 0x0

    aput v4, p0, v5

    aput v3, p0, v0

    const/4 v0, 0x2

    aput v1, p0, v0

    const/4 v0, 0x5

    aput v2, p0, v0

    add-float v0, v3, p1

    const/4 v4, 0x6

    aput v0, p0, v4

    const/4 v0, 0x7

    aput v1, p0, v0

    const/16 v0, 0xa

    aput v2, p0, v0

    const/16 v0, 0xb

    aput v3, p0, v0

    add-float/2addr v1, p1

    const/16 p1, 0xc

    aput v1, p0, p1

    return-void
.end method

.method public static final setToScale-impl([FFFFF)V
    .locals 1

    const-string v0, "arg0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->reset-impl([F)V

    const/4 v0, 0x0

    aput p1, p0, v0

    const/4 p1, 0x6

    aput p2, p0, p1

    const/16 p1, 0xc

    aput p3, p0, p1

    const/16 p1, 0x12

    aput p4, p0, p1

    return-void
.end method

.method public static final timesAssign-jHG-Opc([F[F)V
    .locals 43
    .param p1    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "arg0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "colorMatrix"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v0, v0, v2, v1, v2}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v3

    const/4 v4, 0x1

    invoke-static {v0, v0, v2, v1, v4}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v5

    const/4 v6, 0x2

    invoke-static {v0, v0, v2, v1, v6}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v7

    const/4 v8, 0x3

    invoke-static {v0, v0, v2, v1, v8}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v9

    aget v10, v0, v2

    const/4 v11, 0x4

    aget v12, v1, v11

    mul-float/2addr v10, v12

    aget v12, v0, v4

    const/16 v13, 0x9

    aget v14, v1, v13

    mul-float/2addr v12, v14

    add-float/2addr v10, v12

    aget v12, v0, v6

    const/16 v14, 0xe

    aget v15, v1, v14

    mul-float/2addr v12, v15

    add-float/2addr v10, v12

    aget v12, v0, v8

    const/16 v15, 0x13

    aget v16, v1, v15

    mul-float v12, v12, v16

    add-float/2addr v10, v12

    aget v12, v0, v11

    add-float/2addr v10, v12

    invoke-static {v0, v0, v4, v1, v2}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v12

    invoke-static {v0, v0, v4, v1, v4}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v16

    invoke-static {v0, v0, v4, v1, v6}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v17

    invoke-static {v0, v0, v4, v1, v8}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v18

    const/16 v19, 0x5

    aget v20, v0, v19

    aget v21, v1, v11

    mul-float v20, v20, v21

    const/16 v21, 0x6

    aget v22, v0, v21

    aget v23, v1, v13

    mul-float v22, v22, v23

    add-float v20, v20, v22

    const/16 v22, 0x7

    aget v23, v0, v22

    aget v24, v1, v14

    mul-float v23, v23, v24

    add-float v20, v20, v23

    const/16 v23, 0x8

    aget v24, v0, v23

    aget v25, v1, v15

    mul-float v24, v24, v25

    add-float v20, v20, v24

    aget v24, v0, v13

    add-float v20, v20, v24

    invoke-static {v0, v0, v6, v1, v2}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v24

    invoke-static {v0, v0, v6, v1, v4}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v25

    invoke-static {v0, v0, v6, v1, v6}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v26

    invoke-static {v0, v0, v6, v1, v8}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v27

    const/16 v28, 0xa

    aget v29, v0, v28

    aget v30, v1, v11

    mul-float v29, v29, v30

    const/16 v30, 0xb

    aget v31, v0, v30

    aget v32, v1, v13

    mul-float v31, v31, v32

    add-float v29, v29, v31

    const/16 v31, 0xc

    aget v32, v0, v31

    aget v33, v1, v14

    mul-float v32, v32, v33

    add-float v29, v29, v32

    const/16 v32, 0xd

    aget v33, v0, v32

    aget v34, v1, v15

    mul-float v33, v33, v34

    add-float v29, v29, v33

    aget v33, v0, v14

    add-float v29, v29, v33

    invoke-static {v0, v0, v8, v1, v2}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v33

    invoke-static {v0, v0, v8, v1, v4}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v34

    invoke-static {v0, v0, v8, v1, v6}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v35

    invoke-static {v0, v0, v8, v1, v8}, Landroidx/compose/ui/graphics/ColorMatrix;->dot-Me4OoYI([F[FI[FI)F

    move-result v36

    const/16 v37, 0xf

    aget v38, v0, v37

    aget v39, v1, v11

    mul-float v38, v38, v39

    const/16 v39, 0x10

    aget v40, v0, v39

    aget v41, v1, v13

    mul-float v40, v40, v41

    add-float v38, v38, v40

    const/16 v40, 0x11

    aget v41, v0, v40

    aget v42, v1, v14

    mul-float v41, v41, v42

    add-float v38, v38, v41

    const/16 v41, 0x12

    aget v42, v0, v41

    aget v1, v1, v15

    mul-float v42, v42, v1

    add-float v38, v38, v42

    aget v1, v0, v15

    add-float v38, v38, v1

    aput v3, v0, v2

    aput v5, v0, v4

    aput v7, v0, v6

    aput v9, v0, v8

    aput v10, v0, v11

    aput v12, v0, v19

    aput v16, v0, v21

    aput v17, v0, v22

    aput v18, v0, v23

    aput v20, v0, v13

    aput v24, v0, v28

    aput v25, v0, v30

    aput v26, v0, v31

    aput v27, v0, v32

    aput v29, v0, v14

    aput v33, v0, v37

    aput v34, v0, v39

    aput v35, v0, v40

    aput v36, v0, v41

    aput v38, v0, v15

    return-void
.end method

.method public static toString-impl([F)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ColorMatrix(values="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/graphics/ColorMatrix;->values:[F

    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/ColorMatrix;->equals-impl([FLjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final getValues()[F
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/graphics/ColorMatrix;->values:[F

    return-object p0
.end method

.method public hashCode()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/graphics/ColorMatrix;->values:[F

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->hashCode-impl([F)I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/graphics/ColorMatrix;->values:[F

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorMatrix;->toString-impl([F)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic unbox-impl()[F
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/graphics/ColorMatrix;->values:[F

    return-object p0
.end method
