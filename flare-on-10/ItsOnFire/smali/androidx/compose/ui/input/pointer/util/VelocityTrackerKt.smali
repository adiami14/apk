.class public final Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000c\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "AssumePointerMoveStoppedMilliseconds",
        "",
        "DefaultWeight",
        "",
        "HistorySize",
        "HorizonMilliseconds",
        "MinSampleSize",
        "polyFitLeastSquares",
        "Landroidx/compose/ui/input/pointer/util/PolynomialFit;",
        "x",
        "",
        "y",
        "degree",
        "addPointerInputChange",
        "",
        "Landroidx/compose/ui/input/pointer/util/VelocityTracker;",
        "event",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final AssumePointerMoveStoppedMilliseconds:I = 0x28

.field private static final DefaultWeight:F = 1.0f

.field private static final HistorySize:I = 0x14

.field private static final HorizonMilliseconds:I = 0x64

.field private static final MinSampleSize:I = 0x3


# direct methods
.method public static final addPointerInputChange(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 8
    .param p0    # Landroidx/compose/ui/input/pointer/util/VelocityTracker;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getHistorical()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    add-int/lit8 v3, v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/input/pointer/HistoricalChange;

    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getUptimeMillis()J

    move-result-wide v4

    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getPosition-F1C5BW0()J

    move-result-wide v6

    invoke-virtual {p0, v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    return-void
.end method

.method public static final polyFitLeastSquares(Ljava/util/List;Ljava/util/List;I)Landroidx/compose/ui/input/pointer/util/PolynomialFit;
    .locals 19
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;I)",
            "Landroidx/compose/ui/input/pointer/util/PolynomialFit;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "x"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "y"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    if-lt v2, v3, :cond_17

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v5

    if-ne v4, v5, :cond_16

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_15

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v4

    if-lt v2, v4, :cond_0

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    add-int/2addr v2, v3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    const/4 v8, 0x0

    if-ge v7, v2, :cond_1

    add-int/lit8 v7, v7, 0x1

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v4, v3

    new-instance v7, Landroidx/compose/ui/input/pointer/util/Matrix;

    invoke-direct {v7, v4, v2}, Landroidx/compose/ui/input/pointer/util/Matrix;-><init>(II)V

    move v9, v6

    :goto_2
    const/high16 v10, 0x3f800000    # 1.0f

    if-ge v9, v2, :cond_3

    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v7, v6, v9, v10}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    move v10, v3

    :goto_3
    if-ge v10, v4, :cond_2

    add-int/lit8 v12, v10, 0x1

    add-int/lit8 v13, v10, -0x1

    invoke-virtual {v7, v13, v9}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    move-result v13

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v14

    mul-float/2addr v13, v14

    invoke-virtual {v7, v10, v9, v13}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    move v10, v12

    goto :goto_3

    :cond_2
    move v9, v11

    goto :goto_2

    :cond_3
    new-instance v9, Landroidx/compose/ui/input/pointer/util/Matrix;

    invoke-direct {v9, v4, v2}, Landroidx/compose/ui/input/pointer/util/Matrix;-><init>(II)V

    new-instance v11, Landroidx/compose/ui/input/pointer/util/Matrix;

    invoke-direct {v11, v4, v4}, Landroidx/compose/ui/input/pointer/util/Matrix;-><init>(II)V

    move v12, v6

    :goto_4
    if-ge v12, v4, :cond_b

    add-int/lit8 v13, v12, 0x1

    move v14, v6

    :goto_5
    if-ge v14, v2, :cond_4

    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v7, v12, v14}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    move-result v3

    invoke-virtual {v9, v12, v14, v3}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    move v14, v15

    const/4 v3, 0x1

    goto :goto_5

    :cond_4
    move v3, v6

    :goto_6
    if-ge v3, v12, :cond_6

    add-int/lit8 v14, v3, 0x1

    invoke-virtual {v9, v12}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    move-result-object v15

    invoke-virtual {v9, v3}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    move-result-object v8

    invoke-virtual {v15, v8}, Landroidx/compose/ui/input/pointer/util/Vector;->times(Landroidx/compose/ui/input/pointer/util/Vector;)F

    move-result v8

    move v15, v6

    :goto_7
    if-ge v15, v2, :cond_5

    add-int/lit8 v16, v15, 0x1

    invoke-virtual {v9, v12, v15}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    move-result v17

    invoke-virtual {v9, v3, v15}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    move-result v18

    mul-float v18, v18, v8

    sub-float v6, v17, v18

    invoke-virtual {v9, v12, v15, v6}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    move/from16 v15, v16

    const/4 v6, 0x0

    goto :goto_7

    :cond_5
    move v3, v14

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v9, v12}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/util/Vector;->norm()F

    move-result v3

    float-to-double v14, v3

    const-wide v16, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v6, v14, v16

    if-ltz v6, :cond_a

    div-float v3, v10, v3

    const/4 v6, 0x0

    :goto_8
    if-ge v6, v2, :cond_7

    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v9, v12, v6}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    move-result v14

    mul-float/2addr v14, v3

    invoke-virtual {v9, v12, v6, v14}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    move v6, v8

    goto :goto_8

    :cond_7
    const/4 v3, 0x0

    :goto_9
    if-ge v3, v4, :cond_9

    add-int/lit8 v6, v3, 0x1

    if-ge v3, v12, :cond_8

    const/4 v8, 0x0

    goto :goto_a

    :cond_8
    invoke-virtual {v9, v12}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    move-result-object v8

    invoke-virtual {v7, v3}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    move-result-object v14

    invoke-virtual {v8, v14}, Landroidx/compose/ui/input/pointer/util/Vector;->times(Landroidx/compose/ui/input/pointer/util/Vector;)F

    move-result v8

    :goto_a
    invoke-virtual {v11, v12, v3, v8}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    move v3, v6

    goto :goto_9

    :cond_9
    move v12, v13

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x0

    goto/16 :goto_4

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v3, Landroidx/compose/ui/input/pointer/util/Vector;

    invoke-direct {v3, v2}, Landroidx/compose/ui/input/pointer/util/Vector;-><init>(I)V

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v2, :cond_c

    add-int/lit8 v7, v6, 0x1

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    mul-float/2addr v8, v10

    invoke-virtual {v3, v6, v8}, Landroidx/compose/ui/input/pointer/util/Vector;->set(IF)V

    move v6, v7

    goto :goto_b

    :cond_c
    add-int/lit8 v6, v4, -0x1

    if-ltz v6, :cond_10

    move v7, v6

    :goto_c
    add-int/lit8 v8, v7, -0x1

    invoke-virtual {v9, v7}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    move-result-object v12

    invoke-virtual {v12, v3}, Landroidx/compose/ui/input/pointer/util/Vector;->times(Landroidx/compose/ui/input/pointer/util/Vector;)F

    move-result v12

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v5, v7, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v12, v7, 0x1

    if-gt v12, v6, :cond_e

    move v13, v6

    :goto_d
    add-int/lit8 v14, v13, -0x1

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    move-result v15

    invoke-virtual {v11, v7, v13}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    move-result v16

    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Number;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->floatValue()F

    move-result v17

    mul-float v16, v16, v17

    sub-float v15, v15, v16

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-interface {v5, v7, v15}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-ne v13, v12, :cond_d

    goto :goto_e

    :cond_d
    move v13, v14

    goto :goto_d

    :cond_e
    :goto_e
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    invoke-virtual {v11, v7, v7}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    move-result v13

    div-float/2addr v12, v13

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v5, v7, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-gez v8, :cond_f

    goto :goto_f

    :cond_f
    move v7, v8

    goto :goto_c

    :cond_10
    :goto_f
    const/4 v3, 0x0

    const/4 v6, 0x0

    :goto_10
    if-ge v3, v2, :cond_11

    add-int/lit8 v7, v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    add-float/2addr v6, v3

    move v3, v7

    goto :goto_10

    :cond_11
    int-to-float v3, v2

    div-float/2addr v6, v3

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_11
    if-ge v7, v2, :cond_13

    add-int/lit8 v9, v7, 0x1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    move-result v11

    const/4 v12, 0x0

    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    sub-float/2addr v11, v13

    move v14, v10

    const/4 v13, 0x1

    :goto_12
    if-ge v13, v4, :cond_12

    add-int/lit8 v15, v13, 0x1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Number;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->floatValue()F

    move-result v16

    mul-float v14, v14, v16

    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    mul-float/2addr v13, v14

    sub-float/2addr v11, v13

    move v13, v15

    goto :goto_12

    :cond_12
    mul-float v13, v11, v10

    mul-float/2addr v13, v11

    add-float/2addr v3, v13

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    sub-float/2addr v7, v6

    mul-float v11, v7, v10

    mul-float/2addr v11, v7

    add-float/2addr v8, v11

    move v7, v9

    goto :goto_11

    :cond_13
    const v0, 0x358637bd    # 1.0E-6f

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_14

    goto :goto_13

    :cond_14
    div-float/2addr v3, v8

    sub-float/2addr v10, v3

    :goto_13
    new-instance v0, Landroidx/compose/ui/input/pointer/util/PolynomialFit;

    invoke-direct {v0, v5, v10}, Landroidx/compose/ui/input/pointer/util/PolynomialFit;-><init>(Ljava/util/List;F)V

    return-object v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "At least one point must be provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "x and y must be the same length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The degree must be at positive integer"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
