.class public final Landroidx/compose/foundation/lazy/list/LazyListKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u0018H\u0001\u00a2\u0006\u0002\u0010\u0019\u001a=\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008$\u0010%\u001a\u0089\u0001\u0010&\u001a\u00020\'2\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020*0)2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010.\u001a\u00020/H\u0003\u00a2\u0006\u0002\u00100\u001a/\u00101\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020-0,2\u0006\u00102\u001a\u0002032\u0006\u0010\u001f\u001a\u00020 H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00084\u00105\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00066"
    }
    d2 = {
        "LazyList",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "reverseLayout",
        "",
        "isVertical",
        "flingBehavior",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "refreshOverScrollInfo",
        "overScrollController",
        "Landroidx/compose/foundation/gestures/OverScrollController;",
        "result",
        "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "totalHorizontalPadding",
        "",
        "totalVerticalPadding",
        "refreshOverScrollInfo-L1NQ6kE",
        "(Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;JII)V",
        "rememberLazyListMeasurePolicy",
        "Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;",
        "stateOfItemsProvider",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
        "itemScope",
        "Landroidx/compose/ui/node/Ref;",
        "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;",
        "placementAnimator",
        "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
        "(Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;",
        "update",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "update-3p2s80s",
        "(Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/unit/Density;J)V",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final LazyList(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 31
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/lazy/LazyListState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/ui/Alignment$Vertical;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZZ",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyListScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v5, p1

    move-object/from16 v4, p2

    move/from16 v3, p3

    move/from16 v2, p4

    move-object/from16 v1, p5

    move-object/from16 v0, p10

    move/from16 v15, p12

    move/from16 v14, p14

    const-string v7, "modifier"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "state"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "contentPadding"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "flingBehavior"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "content"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v7, 0x5cdb51a0

    move-object/from16 v8, p11

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    and-int/lit8 v7, v14, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v7, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v15, 0xe

    if-nez v7, :cond_2

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v15

    goto :goto_1

    :cond_2
    move v7, v15

    :goto_1
    and-int/lit8 v10, v14, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v15, 0x70

    if-nez v10, :cond_5

    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :cond_5
    :goto_3
    and-int/lit8 v10, v14, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v7, v7, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v15, 0x380

    if-nez v10, :cond_8

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v7, v10

    :cond_8
    :goto_5
    and-int/lit8 v10, v14, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v7, v7, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v15, 0x1c00

    if-nez v10, :cond_b

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v7, v10

    :cond_b
    :goto_7
    and-int/lit8 v10, v14, 0x10

    const v11, 0xe000

    if-eqz v10, :cond_c

    or-int/lit16 v7, v7, 0x6000

    goto :goto_9

    :cond_c
    and-int v10, v15, v11

    if-nez v10, :cond_e

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_8

    :cond_d
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v7, v10

    :cond_e
    :goto_9
    and-int/lit8 v10, v14, 0x20

    const/high16 v12, 0x70000

    if-eqz v10, :cond_f

    const/high16 v10, 0x30000

    :goto_a
    or-int/2addr v7, v10

    goto :goto_b

    :cond_f
    and-int v10, v15, v12

    if-nez v10, :cond_11

    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v10, 0x10000

    goto :goto_a

    :cond_11
    :goto_b
    and-int/lit8 v10, v14, 0x40

    const/high16 v16, 0x380000

    if-eqz v10, :cond_12

    const/high16 v17, 0x180000

    or-int v7, v7, v17

    move-object/from16 v8, p6

    goto :goto_d

    :cond_12
    and-int v17, v15, v16

    move-object/from16 v8, p6

    if-nez v17, :cond_14

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x80000

    :goto_c
    or-int v7, v7, v17

    :cond_14
    :goto_d
    and-int/lit16 v12, v14, 0x80

    const/high16 v18, 0x1c00000

    if-eqz v12, :cond_15

    const/high16 v19, 0xc00000

    or-int v7, v7, v19

    move-object/from16 v11, p7

    goto :goto_f

    :cond_15
    and-int v19, v15, v18

    move-object/from16 v11, p7

    if-nez v19, :cond_17

    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v7, v7, v20

    :cond_17
    :goto_f
    and-int/lit16 v9, v14, 0x100

    const/high16 v21, 0xe000000

    if-eqz v9, :cond_18

    const/high16 v22, 0x6000000

    or-int v7, v7, v22

    move-object/from16 v1, p8

    goto :goto_11

    :cond_18
    and-int v22, v15, v21

    move-object/from16 v1, p8

    if-nez v22, :cond_1a

    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_19

    const/high16 v22, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v22, 0x2000000

    :goto_10
    or-int v7, v7, v22

    :cond_1a
    :goto_11
    and-int/lit16 v1, v14, 0x200

    const/high16 v22, 0x70000000

    if-eqz v1, :cond_1b

    const/high16 v23, 0x30000000

    or-int v7, v7, v23

    move-object/from16 v3, p9

    goto :goto_13

    :cond_1b
    and-int v23, v15, v22

    move-object/from16 v3, p9

    if-nez v23, :cond_1d

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    const/high16 v23, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v23, 0x10000000

    :goto_12
    or-int v7, v7, v23

    :cond_1d
    :goto_13
    and-int/lit16 v3, v14, 0x400

    if-eqz v3, :cond_1e

    or-int/lit8 v3, p13, 0x6

    goto :goto_15

    :cond_1e
    and-int/lit8 v3, p13, 0xe

    if-nez v3, :cond_20

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1f

    const/4 v3, 0x4

    goto :goto_14

    :cond_1f
    const/4 v3, 0x2

    :goto_14
    or-int v3, p13, v3

    goto :goto_15

    :cond_20
    move/from16 v3, p13

    :goto_15
    const v23, 0x5b6db6db

    and-int v23, v7, v23

    const v24, 0x12492492

    xor-int v23, v23, v24

    if-nez v23, :cond_22

    and-int/lit8 v23, v3, 0xb

    const/16 v20, 0x2

    xor-int/lit8 v20, v23, 0x2

    if-nez v20, :cond_22

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v20

    if-nez v20, :cond_21

    goto :goto_16

    :cond_21
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object v7, v8

    move-object v8, v11

    move-object v2, v13

    goto/16 :goto_1d

    :cond_22
    :goto_16
    const/16 v20, 0x0

    if-eqz v10, :cond_23

    move-object/from16 v23, v20

    goto :goto_17

    :cond_23
    move-object/from16 v23, v8

    :goto_17
    if-eqz v12, :cond_24

    move-object/from16 v24, v20

    goto :goto_18

    :cond_24
    move-object/from16 v24, v11

    :goto_18
    if-eqz v9, :cond_25

    move-object/from16 v25, v20

    goto :goto_19

    :cond_25
    move-object/from16 v25, p8

    :goto_19
    if-eqz v1, :cond_26

    move-object/from16 v26, v20

    goto :goto_1a

    :cond_26
    move-object/from16 v26, p9

    :goto_1a
    const/4 v1, 0x0

    invoke-static {v13, v1}, Landroidx/compose/foundation/gestures/AndroidOverScrollKt;->rememberOverScrollController(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/OverScrollController;

    move-result-object v27

    const v8, -0x384349

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    sget-object v28, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v8, v9, :cond_27

    new-instance v8, Landroidx/compose/ui/node/Ref;

    invoke-direct {v8}, Landroidx/compose/ui/node/Ref;-><init>()V

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_27
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v8, Landroidx/compose/ui/node/Ref;

    shr-int/lit8 v9, v7, 0x3

    and-int/lit8 v9, v9, 0xe

    shl-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v9

    sget v9, Landroidx/compose/ui/node/Ref;->$stable:I

    shl-int/lit8 v10, v9, 0x6

    or-int/2addr v3, v10

    invoke-static {v5, v0, v8, v13, v3}, Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImplKt;->rememberStateOfItemsProvider(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/node/Ref;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    const v10, -0x2b2019d8

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v10, -0x384349

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v10, v11, :cond_28

    sget-object v10, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v10, v13}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lj/u0;

    move-result-object v10

    new-instance v11, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v11, v10}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lj/u0;)V

    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v10, v11

    :cond_28
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v10, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-virtual {v10}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lj/u0;

    move-result-object v12

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const v11, -0x384098

    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v10, v11

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_29

    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_2a

    :cond_29
    new-instance v11, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    invoke-direct {v11, v12, v2}, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;-><init>(Lj/u0;Z)V

    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_2a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v11, Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;

    invoke-virtual {v5, v11}, Landroidx/compose/foundation/lazy/LazyListState;->setPlacementAnimator$foundation_release(Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;)V

    shl-int/lit8 v9, v9, 0x3

    shl-int/lit8 v10, v7, 0x3

    and-int/lit16 v1, v10, 0x380

    or-int/2addr v1, v9

    shl-int/lit8 v9, v7, 0x6

    const v19, 0xe000

    and-int v19, v9, v19

    or-int v1, v1, v19

    const/high16 v17, 0x70000

    and-int v17, v9, v17

    or-int v1, v1, v17

    and-int v9, v9, v16

    or-int/2addr v1, v9

    and-int v9, v10, v18

    or-int/2addr v1, v9

    and-int v9, v7, v21

    or-int/2addr v1, v9

    and-int v9, v7, v22

    or-int v20, v1, v9

    shr-int/lit8 v1, v7, 0x15

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v21, v1, 0x40

    const/16 v22, 0x0

    move-object v7, v3

    move-object/from16 v9, p1

    move-object/from16 v10, v27

    move-object v1, v11

    move-object/from16 v11, p2

    move-object/from16 v29, v12

    move/from16 v12, p3

    move-object/from16 p7, v13

    move/from16 v13, p4

    move-object/from16 v14, v23

    move-object/from16 v15, v25

    move-object/from16 v16, v26

    move-object/from16 v17, v24

    move-object/from16 v18, v1

    move-object/from16 v19, p7

    invoke-static/range {v7 .. v22}, Landroidx/compose/foundation/lazy/list/LazyListKt;->rememberLazyListMeasurePolicy(Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;

    move-result-object v17

    move-object/from16 v15, p7

    const/4 v1, 0x0

    invoke-static {v15, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicyKt;->rememberLazyLayoutPrefetchPolicy(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroidx/compose/foundation/lazy/LazyListState;->setPrefetchPolicy$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;)V

    invoke-static {v15, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutStateKt;->rememberLazyLayoutState(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutState;

    move-result-object v14

    invoke-virtual {v5, v14}, Landroidx/compose/foundation/lazy/LazyListState;->setInnerState$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutState;)V

    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;

    invoke-interface {v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;->getItemsCount()I

    move-result v8

    if-lez v8, :cond_2b

    invoke-virtual {v5, v7}, Landroidx/compose/foundation/lazy/LazyListState;->updateScrollPositionIfTheFirstItemWasMoved$foundation_release(Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;)V

    :cond_2b
    move-object/from16 v0, p0

    move v7, v1

    move-object v1, v3

    move v13, v2

    move-object/from16 v2, p1

    move-object v12, v3

    move-object/from16 v3, v29

    move/from16 v4, p4

    move/from16 v5, p3

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt;->lazyListSemantics(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListState;Lj/u0;ZZ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v13}, Landroidx/compose/foundation/ScrollKt;->clipScrollableContainer(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v13, :cond_2c

    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_1b

    :cond_2c
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_1b
    move-object v9, v1

    const v1, 0x5cdb5c84

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    xor-int/lit8 v1, p3, 0x1

    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    if-ne v2, v3, :cond_2d

    const/4 v2, 0x1

    goto :goto_1c

    :cond_2d
    move v2, v7

    :goto_1c
    if-eqz v2, :cond_2e

    if-nez v13, :cond_2e

    xor-int/lit8 v1, v1, 0x1

    :cond_2e
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/LazyListState;->getInternalInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v2

    const/4 v11, 0x0

    const/16 v3, 0x8

    const/16 v16, 0x0

    move-object v7, v0

    move-object/from16 v8, p1

    move-object/from16 v10, v27

    move-object v0, v12

    move v12, v1

    move-object/from16 v13, p5

    move-object v1, v14

    move-object v14, v2

    move-object v2, v15

    move v15, v3

    invoke-static/range {v7 .. v16}, Landroidx/compose/foundation/gestures/ScrollableKt;->scrollable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/OverScrollController;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/LazyListState;->getPrefetchPolicy$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;

    move-result-object v11

    const v3, -0x384212

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_2f

    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_30

    :cond_2f
    new-instance v4, Landroidx/compose/foundation/lazy/list/LazyListKt$LazyList$2$1;

    invoke-direct {v4, v0}, Landroidx/compose/foundation/lazy/list/LazyListKt$LazyList$2$1;-><init>(Landroidx/compose/runtime/State;)V

    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_30
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function0;

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v1

    move-object/from16 v12, v17

    move-object v13, v2

    invoke-static/range {v8 .. v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    move-object/from16 v10, v26

    :goto_1d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_31

    goto :goto_1e

    :cond_31
    new-instance v14, Landroidx/compose/foundation/lazy/list/LazyListKt$LazyList$3;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v30, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/lazy/list/LazyListKt$LazyList$3;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;III)V

    move-object/from16 v0, v30

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1e
    return-void
.end method

.method public static final synthetic access$refreshOverScrollInfo-L1NQ6kE(Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;JII)V
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/lazy/list/LazyListKt;->refreshOverScrollInfo-L1NQ6kE(Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;JII)V

    return-void
.end method

.method public static final synthetic access$update-3p2s80s(Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/unit/Density;J)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/list/LazyListKt;->update-3p2s80s(Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/unit/Density;J)V

    return-void
.end method

.method private static final refreshOverScrollInfo-L1NQ6kE(Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;JII)V
    .locals 5

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getCanScrollForward()Z

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getFirstVisibleItem()Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;->getIndex()I

    move-result v1

    :goto_0
    const/4 v3, 0x1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getFirstVisibleItemScrollOffset()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v3

    :goto_2
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getWidth()I

    move-result v4

    add-int/2addr v4, p4

    invoke-static {p2, p3, v4}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result p4

    int-to-float p4, p4

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;->getHeight()I

    move-result p1

    add-int/2addr p1, p5

    invoke-static {p2, p3, p1}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result p1

    int-to-float p1, p1

    invoke-static {p4, p1}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide p1

    if-nez v0, :cond_3

    if-eqz v1, :cond_4

    :cond_3
    move v2, v3

    :cond_4
    invoke-interface {p0, p1, p2, v2}, Landroidx/compose/foundation/gestures/OverScrollController;->refreshContainerInfo-TmRCtEA(JZ)V

    return-void
.end method

.method private static final rememberLazyListMeasurePolicy(Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
            ">;",
            "Landroidx/compose/ui/node/Ref<",
            "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Landroidx/compose/foundation/gestures/OverScrollController;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZZ",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;",
            "Landroidx/compose/runtime/Composer;",
            "III)",
            "Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;"
        }
    .end annotation

    move-object/from16 v0, p12

    move/from16 v1, p15

    const v2, 0xc6709c7

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit16 v2, v1, 0x80

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v14, v3

    goto :goto_0

    :cond_0
    move-object/from16 v14, p7

    :goto_0
    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_1

    move-object v15, v3

    goto :goto_1

    :cond_1
    move-object/from16 v15, p8

    :goto_1
    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_2

    move-object v12, v3

    goto :goto_2

    :cond_2
    move-object/from16 v12, p9

    :goto_2
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_3

    move-object v11, v3

    goto :goto_3

    :cond_3
    move-object/from16 v11, p10

    :goto_3
    const/16 v1, 0xa

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 v4, 0x1

    aput-object p3, v2, v4

    const/4 v4, 0x2

    aput-object p4, v2, v4

    const/4 v4, 0x3

    invoke-static/range {p5 .. p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x4

    invoke-static/range {p6 .. p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x5

    aput-object v14, v2, v4

    const/4 v4, 0x6

    aput-object v15, v2, v4

    const/4 v4, 0x7

    aput-object v12, v2, v4

    const/16 v4, 0x8

    aput-object v11, v2, v4

    const/16 v4, 0x9

    aput-object p11, v2, v4

    const v4, -0x383cc2

    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    move v4, v3

    :goto_4
    if-ge v3, v1, :cond_4

    aget-object v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    goto :goto_4

    :cond_4
    invoke-interface/range {p12 .. p12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v4, :cond_5

    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_6

    :cond_5
    new-instance v1, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;

    move-object v4, v1

    move/from16 v5, p6

    move-object/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    move-object/from16 v10, p1

    move-object/from16 v13, p11

    move-object/from16 v16, p3

    invoke-direct/range {v4 .. v16}, Landroidx/compose/foundation/lazy/list/LazyListKt$rememberLazyListMeasurePolicy$1$1;-><init>(ZLandroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/OverScrollController;)V

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_6
    invoke-interface/range {p12 .. p12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;

    invoke-interface/range {p12 .. p12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object v1
.end method

.method private static final update-3p2s80s(Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/unit/Density;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/node/Ref<",
            "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;",
            ">;",
            "Landroidx/compose/ui/unit/Density;",
            "J)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/Ref;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;->getDensity()Landroidx/compose/ui/unit/Density;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;->getConstraints-msEJaDk()J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Landroidx/compose/ui/unit/Constraints;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;-><init>(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/Ref;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
