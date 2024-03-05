.class public final Landroidx/compose/foundation/lazy/LazyDslKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001al\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\u0002\u0008\u0013H\u0007\u00a2\u0006\u0002\u0010\u0014\u001al\u0010\u0015\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\u0002\u0008\u0013H\u0007\u00a2\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010\u001b\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u001c*\u00020\u00122\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H\u001c0\u001d2%\u0008\n\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u0011H\u001c\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\"\u0018\u00010\u001123\u0008\u0004\u0010#\u001a-\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u0011H\u001c\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\u00010$\u00a2\u0006\u0002\u0008&\u00a2\u0006\u0002\u0008\u0013H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'\u001a\u0085\u0001\u0010\u001b\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u001c*\u00020\u00122\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H\u001c0(2%\u0008\n\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u0011H\u001c\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\"\u0018\u00010\u001123\u0008\u0004\u0010#\u001a-\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u0011H\u001c\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\u00010$\u00a2\u0006\u0002\u0008&\u00a2\u0006\u0002\u0008\u0013H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)\u001a\u00af\u0001\u0010*\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u001c*\u00020\u00122\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H\u001c0\u001d2:\u0008\n\u0010\u001e\u001a4\u0012\u0013\u0012\u00110+\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(,\u0012\u0013\u0012\u0011H\u001c\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\"\u0018\u00010$2H\u0008\u0004\u0010#\u001aB\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110+\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(,\u0012\u0013\u0012\u0011H\u001c\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\u00010-\u00a2\u0006\u0002\u0008&\u00a2\u0006\u0002\u0008\u0013H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.\u001a\u00af\u0001\u0010*\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u001c*\u00020\u00122\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H\u001c0(2:\u0008\n\u0010\u001e\u001a4\u0012\u0013\u0012\u00110+\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(,\u0012\u0013\u0012\u0011H\u001c\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\"\u0018\u00010$2H\u0008\u0004\u0010#\u001aB\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110+\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(,\u0012\u0013\u0012\u0011H\u001c\u00a2\u0006\u000c\u0008\u001f\u0012\u0008\u0008 \u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\u00010-\u00a2\u0006\u0002\u0008&\u00a2\u0006\u0002\u0008\u0013H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00060"
    }
    d2 = {
        "LazyColumn",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "reverseLayout",
        "",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "flingBehavior",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "LazyRow",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "items",
        "T",
        "",
        "key",
        "Lkotlin/ParameterName;",
        "name",
        "item",
        "",
        "itemContent",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Landroidx/compose/runtime/Composable;",
        "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V",
        "",
        "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V",
        "itemsIndexed",
        "",
        "index",
        "Lkotlin/Function3;",
        "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V",
        "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V",
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
.method public static final LazyColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/lazy/LazyListState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
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
            "Z",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyListScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v15, p7

    move/from16 v14, p9

    move/from16 v13, p10

    const-string v0, "content"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2cb91279

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v0, v13, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v14, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v14, 0xe

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x70

    if-nez v3, :cond_5

    and-int/lit8 v3, v13, 0x2

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v3, p1

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    goto :goto_3

    :cond_5
    move-object/from16 v3, p1

    :goto_3
    and-int/lit8 v4, v13, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v14, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p2

    :goto_6
    and-int/lit8 v6, v13, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v14, 0x1c00

    if-nez v7, :cond_b

    move/from16 v7, p3

    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_7

    :cond_a
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v2, v8

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v7, p3

    :goto_9
    const v8, 0xe000

    and-int/2addr v8, v14

    if-nez v8, :cond_e

    and-int/lit8 v8, v13, 0x10

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_a

    :cond_c
    move-object/from16 v8, p4

    :cond_d
    const/16 v9, 0x2000

    :goto_a
    or-int/2addr v2, v9

    goto :goto_b

    :cond_e
    move-object/from16 v8, p4

    :goto_b
    and-int/lit8 v9, v13, 0x20

    const/high16 v10, 0x70000

    if-eqz v9, :cond_f

    const/high16 v11, 0x30000

    or-int/2addr v2, v11

    goto :goto_d

    :cond_f
    and-int v11, v14, v10

    if-nez v11, :cond_11

    move-object/from16 v11, p5

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_c

    :cond_10
    const/high16 v16, 0x10000

    :goto_c
    or-int v2, v2, v16

    goto :goto_e

    :cond_11
    :goto_d
    move-object/from16 v11, p5

    :goto_e
    const/high16 v16, 0x380000

    and-int v17, v14, v16

    if-nez v17, :cond_13

    and-int/lit8 v17, v13, 0x40

    move-object/from16 v10, p6

    if-nez v17, :cond_12

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x100000

    goto :goto_f

    :cond_12
    const/high16 v17, 0x80000

    :goto_f
    or-int v2, v2, v17

    goto :goto_10

    :cond_13
    move-object/from16 v10, p6

    :goto_10
    and-int/lit16 v1, v13, 0x80

    const/high16 v17, 0x1c00000

    if-eqz v1, :cond_14

    const/high16 v1, 0xc00000

    :goto_11
    or-int/2addr v2, v1

    goto :goto_12

    :cond_14
    and-int v1, v14, v17

    if-nez v1, :cond_16

    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    const/high16 v1, 0x800000

    goto :goto_11

    :cond_15
    const/high16 v1, 0x400000

    goto :goto_11

    :cond_16
    :goto_12
    const v1, 0x16db6db

    and-int/2addr v1, v2

    const v18, 0x492492

    xor-int v1, v1, v18

    if-nez v1, :cond_18

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_13

    :cond_17
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v5

    move v4, v7

    move-object v5, v8

    move-object v7, v10

    move-object v6, v11

    move-object/from16 v26, v12

    goto/16 :goto_1b

    :cond_18
    :goto_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v14, 0x1

    const v18, -0x380001

    const v19, -0xe001

    if-eqz v1, :cond_1d

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_16

    :cond_19
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v13, 0x2

    if-eqz v0, :cond_1a

    and-int/lit8 v2, v2, -0x71

    :cond_1a
    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_1b

    and-int v2, v2, v19

    :cond_1b
    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_1c

    and-int v2, v2, v18

    :cond_1c
    move-object/from16 v18, p0

    move-object/from16 v19, v3

    :goto_14
    move-object/from16 v20, v5

    move/from16 v21, v7

    move-object/from16 v22, v8

    move-object/from16 v24, v10

    :goto_15
    move-object/from16 v23, v11

    goto/16 :goto_1a

    :cond_1d
    :goto_16
    if-eqz v0, :cond_1e

    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_17

    :cond_1e
    move-object/from16 v0, p0

    :goto_17
    and-int/lit8 v1, v13, 0x2

    move-object/from16 p0, v0

    const/4 v0, 0x0

    if-eqz v1, :cond_1f

    const/4 v1, 0x3

    invoke-static {v0, v0, v12, v0, v1}, Landroidx/compose/foundation/lazy/LazyListStateKt;->rememberLazyListState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;

    move-result-object v1

    and-int/lit8 v2, v2, -0x71

    goto :goto_18

    :cond_1f
    move-object v1, v3

    :goto_18
    if-eqz v4, :cond_20

    int-to-float v3, v0

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    invoke-static {v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v3

    move-object v5, v3

    :cond_20
    if-eqz v6, :cond_21

    move v7, v0

    :cond_21
    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_23

    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    if-nez v7, :cond_22

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    goto :goto_19

    :cond_22
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getBottom()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    :goto_19
    and-int v2, v2, v19

    move-object v8, v0

    :cond_23
    if-eqz v9, :cond_24

    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v0

    move-object v11, v0

    :cond_24
    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_25

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    const/4 v3, 0x6

    invoke-virtual {v0, v12, v3}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v0

    and-int v2, v2, v18

    move-object/from16 v18, p0

    move-object/from16 v24, v0

    move-object/from16 v19, v1

    move-object/from16 v20, v5

    move/from16 v21, v7

    move-object/from16 v22, v8

    goto :goto_15

    :cond_25
    move-object/from16 v18, p0

    move-object/from16 v19, v1

    goto :goto_14

    :goto_1a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endDefaults()V

    const/4 v4, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    and-int/lit8 v0, v2, 0xe

    or-int/lit16 v0, v0, 0x6000

    and-int/lit8 v1, v2, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0x1c00

    or-int/2addr v0, v1

    shr-int/lit8 v1, v2, 0x3

    const/high16 v3, 0x70000

    and-int/2addr v1, v3

    or-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0x3

    and-int v1, v1, v16

    or-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0x9

    and-int v1, v1, v17

    or-int v16, v0, v1

    shr-int/lit8 v0, v2, 0x15

    and-int/lit8 v17, v0, 0xe

    const/16 v25, 0x300

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    move/from16 v3, v21

    move-object/from16 v5, v24

    move-object/from16 v6, v23

    move-object/from16 v7, v22

    move-object/from16 v10, p7

    move-object v11, v12

    move-object/from16 v26, v12

    move/from16 v12, v16

    move/from16 v13, v17

    move/from16 v14, v25

    invoke-static/range {v0 .. v14}, Landroidx/compose/foundation/lazy/list/LazyListKt;->LazyList(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    move/from16 v4, v21

    move-object/from16 v5, v22

    move-object/from16 v7, v24

    :goto_1b
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-nez v11, :cond_26

    goto :goto_1c

    :cond_26
    new-instance v12, Landroidx/compose/foundation/lazy/LazyDslKt$LazyColumn$1;

    move-object v0, v12

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/lazy/LazyDslKt$LazyColumn$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v11, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1c
    return-void
.end method

.method public static final LazyRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/lazy/LazyListState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/Alignment$Vertical;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
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
            "Z",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyListScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v15, p7

    move/from16 v14, p9

    move/from16 v13, p10

    const-string v0, "content"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x50d840b6

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v0, v13, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v14, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v14, 0xe

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x70

    if-nez v3, :cond_5

    and-int/lit8 v3, v13, 0x2

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v3, p1

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    goto :goto_3

    :cond_5
    move-object/from16 v3, p1

    :goto_3
    and-int/lit8 v4, v13, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v14, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p2

    :goto_6
    and-int/lit8 v6, v13, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v14, 0x1c00

    if-nez v7, :cond_b

    move/from16 v7, p3

    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_7

    :cond_a
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v2, v8

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v7, p3

    :goto_9
    const v8, 0xe000

    and-int/2addr v8, v14

    if-nez v8, :cond_e

    and-int/lit8 v8, v13, 0x10

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_a

    :cond_c
    move-object/from16 v8, p4

    :cond_d
    const/16 v9, 0x2000

    :goto_a
    or-int/2addr v2, v9

    goto :goto_b

    :cond_e
    move-object/from16 v8, p4

    :goto_b
    and-int/lit8 v9, v13, 0x20

    const/high16 v10, 0x70000

    if-eqz v9, :cond_f

    const/high16 v11, 0x30000

    or-int/2addr v2, v11

    goto :goto_d

    :cond_f
    and-int v11, v14, v10

    if-nez v11, :cond_11

    move-object/from16 v11, p5

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_c

    :cond_10
    const/high16 v16, 0x10000

    :goto_c
    or-int v2, v2, v16

    goto :goto_e

    :cond_11
    :goto_d
    move-object/from16 v11, p5

    :goto_e
    const/high16 v16, 0x380000

    and-int v16, v14, v16

    if-nez v16, :cond_13

    and-int/lit8 v16, v13, 0x40

    move-object/from16 v10, p6

    if-nez v16, :cond_12

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x100000

    goto :goto_f

    :cond_12
    const/high16 v16, 0x80000

    :goto_f
    or-int v2, v2, v16

    goto :goto_10

    :cond_13
    move-object/from16 v10, p6

    :goto_10
    and-int/lit16 v1, v13, 0x80

    if-eqz v1, :cond_14

    const/high16 v1, 0xc00000

    :goto_11
    or-int/2addr v2, v1

    goto :goto_12

    :cond_14
    const/high16 v1, 0x1c00000

    and-int/2addr v1, v14

    if-nez v1, :cond_16

    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    const/high16 v1, 0x800000

    goto :goto_11

    :cond_15
    const/high16 v1, 0x400000

    goto :goto_11

    :cond_16
    :goto_12
    const v1, 0x16db6db

    and-int/2addr v1, v2

    const v16, 0x492492

    xor-int v1, v1, v16

    if-nez v1, :cond_18

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_13

    :cond_17
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v5

    move v4, v7

    move-object v5, v8

    move-object v7, v10

    move-object v6, v11

    move-object/from16 v26, v12

    goto/16 :goto_1b

    :cond_18
    :goto_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v14, 0x1

    const v16, -0x380001

    const v17, -0xe001

    if-eqz v1, :cond_1d

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_16

    :cond_19
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v13, 0x2

    if-eqz v0, :cond_1a

    and-int/lit8 v2, v2, -0x71

    :cond_1a
    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_1b

    and-int v2, v2, v17

    :cond_1b
    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_1c

    and-int v2, v2, v16

    :cond_1c
    move-object/from16 v16, p0

    move-object/from16 v17, v3

    :goto_14
    move-object/from16 v18, v5

    move/from16 v19, v7

    move-object/from16 v20, v8

    move-object/from16 v22, v10

    :goto_15
    move-object/from16 v21, v11

    goto/16 :goto_1a

    :cond_1d
    :goto_16
    if-eqz v0, :cond_1e

    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_17

    :cond_1e
    move-object/from16 v0, p0

    :goto_17
    and-int/lit8 v1, v13, 0x2

    move-object/from16 p0, v0

    const/4 v0, 0x0

    if-eqz v1, :cond_1f

    const/4 v1, 0x3

    invoke-static {v0, v0, v12, v0, v1}, Landroidx/compose/foundation/lazy/LazyListStateKt;->rememberLazyListState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;

    move-result-object v1

    and-int/lit8 v2, v2, -0x71

    goto :goto_18

    :cond_1f
    move-object v1, v3

    :goto_18
    if-eqz v4, :cond_20

    int-to-float v3, v0

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    invoke-static {v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v3

    move-object v5, v3

    :cond_20
    if-eqz v6, :cond_21

    move v7, v0

    :cond_21
    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_23

    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    if-nez v7, :cond_22

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    goto :goto_19

    :cond_22
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    :goto_19
    and-int v2, v2, v17

    move-object v8, v0

    :cond_23
    if-eqz v9, :cond_24

    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v0

    move-object v11, v0

    :cond_24
    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_25

    sget-object v0, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    const/4 v3, 0x6

    invoke-virtual {v0, v12, v3}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v0

    and-int v2, v2, v16

    move-object/from16 v16, p0

    move-object/from16 v22, v0

    move-object/from16 v17, v1

    move-object/from16 v18, v5

    move/from16 v19, v7

    move-object/from16 v20, v8

    goto :goto_15

    :cond_25
    move-object/from16 v16, p0

    move-object/from16 v17, v1

    goto :goto_14

    :goto_1a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endDefaults()V

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    and-int/lit8 v0, v2, 0xe

    or-int/lit16 v0, v0, 0x6000

    and-int/lit8 v1, v2, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0x1c00

    or-int/2addr v0, v1

    shr-int/lit8 v1, v2, 0x3

    const/high16 v3, 0x70000

    and-int/2addr v1, v3

    or-int/2addr v0, v1

    const/high16 v1, 0xe000000

    shl-int/lit8 v3, v2, 0x9

    and-int/2addr v1, v3

    or-int/2addr v0, v1

    const/high16 v1, 0x70000000

    shl-int/lit8 v3, v2, 0xf

    and-int/2addr v1, v3

    or-int v23, v0, v1

    shr-int/lit8 v0, v2, 0x15

    and-int/lit8 v24, v0, 0xe

    const/16 v25, 0xc0

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    move/from16 v3, v19

    move-object/from16 v5, v22

    move-object/from16 v8, v21

    move-object/from16 v9, v20

    move-object/from16 v10, p7

    move-object v11, v12

    move-object/from16 v26, v12

    move/from16 v12, v23

    move/from16 v13, v24

    move/from16 v14, v25

    invoke-static/range {v0 .. v14}, Landroidx/compose/foundation/lazy/list/LazyListKt;->LazyList(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    :goto_1b
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-nez v11, :cond_26

    goto :goto_1c

    :cond_26
    new-instance v12, Landroidx/compose/foundation/lazy/LazyDslKt$LazyRow$1;

    move-object v0, v12

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/lazy/LazyDslKt$LazyRow$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v11, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1c
    return-void
.end method

.method public static final items(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V
    .locals 4
    .param p0    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/LazyListScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz p2, :cond_0

    new-instance v1, Landroidx/compose/foundation/lazy/LazyDslKt$items$1;

    invoke-direct {v1, p2, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$items$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const p2, -0x3abe1cba

    const/4 v2, 0x1

    new-instance v3, Landroidx/compose/foundation/lazy/LazyDslKt$items$2;

    invoke-direct {v3, p3, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$items$2;-><init>(Lkotlin/jvm/functions/Function4;Ljava/util/List;)V

    invoke-static {p2, v2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    invoke-interface {p0, v0, v1, p1}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

.method public static final items(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V
    .locals 4
    .param p0    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/LazyListScope;",
            "[TT;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    if-eqz p2, :cond_0

    new-instance v1, Landroidx/compose/foundation/lazy/LazyDslKt$items$3;

    invoke-direct {v1, p2, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$items$3;-><init>(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const p2, -0x3abe1733

    const/4 v2, 0x1

    new-instance v3, Landroidx/compose/foundation/lazy/LazyDslKt$items$4;

    invoke-direct {v3, p3, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$items$4;-><init>(Lkotlin/jvm/functions/Function4;[Ljava/lang/Object;)V

    invoke-static {p2, v2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    invoke-interface {p0, v0, v1, p1}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

.method public static synthetic items$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V
    .locals 2

    and-int/lit8 p4, p4, 0x2

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p2, p5

    :cond_0
    const-string p4, "<this>"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "items"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "itemContent"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p4

    if-eqz p2, :cond_1

    new-instance p5, Landroidx/compose/foundation/lazy/LazyDslKt$items$1;

    invoke-direct {p5, p2, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$items$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    :cond_1
    const p2, -0x3abe1cba

    const/4 v0, 0x1

    new-instance v1, Landroidx/compose/foundation/lazy/LazyDslKt$items$2;

    invoke-direct {v1, p3, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$items$2;-><init>(Lkotlin/jvm/functions/Function4;Ljava/util/List;)V

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    invoke-interface {p0, p4, p5, p1}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

.method public static synthetic items$default(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V
    .locals 2

    and-int/lit8 p4, p4, 0x2

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p2, p5

    :cond_0
    const-string p4, "<this>"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "items"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "itemContent"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p4, p1

    if-eqz p2, :cond_1

    new-instance p5, Landroidx/compose/foundation/lazy/LazyDslKt$items$3;

    invoke-direct {p5, p2, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$items$3;-><init>(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;)V

    :cond_1
    const p2, -0x3abe1733

    const/4 v0, 0x1

    new-instance v1, Landroidx/compose/foundation/lazy/LazyDslKt$items$4;

    invoke-direct {v1, p3, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$items$4;-><init>(Lkotlin/jvm/functions/Function4;[Ljava/lang/Object;)V

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    invoke-interface {p0, p4, p5, p1}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

.method public static final itemsIndexed(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V
    .locals 4
    .param p0    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/LazyListScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-",
            "Ljava/lang/Integer;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz p2, :cond_0

    new-instance v1, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1;

    invoke-direct {v1, p2, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const p2, -0x3abe1b4f

    const/4 v2, 0x1

    new-instance v3, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2;

    invoke-direct {v3, p3, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2;-><init>(Lkotlin/jvm/functions/Function5;Ljava/util/List;)V

    invoke-static {p2, v2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    invoke-interface {p0, v0, v1, p1}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

.method public static final itemsIndexed(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V
    .locals 4
    .param p0    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/LazyListScope;",
            "[TT;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-",
            "Ljava/lang/Integer;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    if-eqz p2, :cond_0

    new-instance v1, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3;

    invoke-direct {v1, p2, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3;-><init>(Lkotlin/jvm/functions/Function2;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const p2, -0x3abe13c4

    const/4 v2, 0x1

    new-instance v3, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4;

    invoke-direct {v3, p3, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4;-><init>(Lkotlin/jvm/functions/Function5;[Ljava/lang/Object;)V

    invoke-static {p2, v2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    invoke-interface {p0, v0, v1, p1}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

.method public static synthetic itemsIndexed$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;ILjava/lang/Object;)V
    .locals 2

    and-int/lit8 p4, p4, 0x2

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p2, p5

    :cond_0
    const-string p4, "<this>"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "items"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "itemContent"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p4

    if-eqz p2, :cond_1

    new-instance p5, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1;

    invoke-direct {p5, p2, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V

    :cond_1
    const p2, -0x3abe1b4f

    const/4 v0, 0x1

    new-instance v1, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2;

    invoke-direct {v1, p3, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2;-><init>(Lkotlin/jvm/functions/Function5;Ljava/util/List;)V

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    invoke-interface {p0, p4, p5, p1}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

.method public static synthetic itemsIndexed$default(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;ILjava/lang/Object;)V
    .locals 2

    and-int/lit8 p4, p4, 0x2

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p2, p5

    :cond_0
    const-string p4, "<this>"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "items"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "itemContent"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p4, p1

    if-eqz p2, :cond_1

    new-instance p5, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3;

    invoke-direct {p5, p2, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3;-><init>(Lkotlin/jvm/functions/Function2;[Ljava/lang/Object;)V

    :cond_1
    const p2, -0x3abe13c4

    const/4 v0, 0x1

    new-instance v1, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4;

    invoke-direct {v1, p3, p1}, Landroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4;-><init>(Lkotlin/jvm/functions/Function5;[Ljava/lang/Object;)V

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    invoke-interface {p0, p4, p5, p1}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method
