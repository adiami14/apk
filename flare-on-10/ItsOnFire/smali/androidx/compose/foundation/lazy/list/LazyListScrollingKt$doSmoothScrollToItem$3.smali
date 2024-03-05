.class final Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/list/LazyListScrollingKt;->doSmoothScrollToItem(Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3"
    f = "LazyListScrolling.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x74,
        0xcf
    }
    m = "invokeSuspend"
    n = {
        "$this$scroll",
        "loop",
        "anim",
        "loops",
        "targetDistancePx",
        "boundDistancePx",
        "forward"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "F$0",
        "F$1",
        "I$0"
    }
.end annotation


# instance fields
.field public final synthetic $index:I

.field public final synthetic $scrollOffset:I

.field public final synthetic $this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

.field public F$0:F

.field public F$1:F

.field public I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field public L$1:Ljava/lang/Object;

.field public L$2:Ljava/lang/Object;

.field public L$3:Ljava/lang/Object;

.field public label:I


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iput p2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$index:I

    iput p3, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$scrollOffset:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static final synthetic access$invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/LazyListState;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/LazyListState;II)Z

    move-result p0

    return p0
.end method

.method private static final invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/LazyListState;II)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result p0

    if-le p0, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result p0

    if-ne p0, p2, :cond_3

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemScrollOffset()I

    move-result p0

    if-le p0, p3, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result p0

    if-ge p0, p2, :cond_2

    :goto_0
    move v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result p0

    if-ne p0, p2, :cond_3

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemScrollOffset()I

    move-result p0

    if-ge p0, p3, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$index:I

    iget p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$scrollOffset:I

    invoke-direct {v0, v1, v2, p0, p2}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;-><init>(Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/foundation/gestures/ScrollScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/ScrollScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->invoke(Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    iget v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v6, :cond_1

    if-ne v0, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->I$0:I

    iget v7, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->F$1:F

    iget v8, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->F$0:F

    iget-object v9, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$3:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v10, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$2:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v11, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$1:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v12, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$0:Ljava/lang/Object;

    check-cast v12, Landroidx/compose/foundation/gestures/ScrollScope;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/foundation/lazy/list/ItemFoundInScroll; {:try_start_0 .. :try_end_0} :catch_2

    move v15, v7

    move v14, v8

    move-object v13, v9

    move-object v9, v12

    move-object v12, v10

    goto/16 :goto_8

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$0:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Landroidx/compose/foundation/gestures/ScrollScope;

    :try_start_1
    iget-object v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListState;->getDensity$foundation_release()Landroidx/compose/ui/unit/Density;

    move-result-object v0

    invoke-static {}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt;->access$getTargetDistance$p()F

    move-result v7

    invoke-interface {v0, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v0

    iget-object v7, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyListState;->getDensity$foundation_release()Landroidx/compose/ui/unit/Density;

    move-result-object v7

    invoke-static {}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt;->access$getBoundDistance$p()F

    move-result v8

    invoke-interface {v7, v8}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v7

    new-instance v8, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    iput-boolean v6, v8, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1e

    const/16 v21, 0x0

    invoke-static/range {v13 .. v21}, Landroidx/compose/animation/core/AnimationStateKt;->AnimationState$default(FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    move-result-object v10

    iput-object v10, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v10, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v11, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$index:I

    invoke-static {v10, v11}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt;->access$doSmoothScrollToItem$getTargetItem(Landroidx/compose/foundation/lazy/LazyListState;I)Landroidx/compose/foundation/lazy/LazyListItemInfo;

    move-result-object v10

    if-nez v10, :cond_b

    iget v10, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$index:I

    iget-object v11, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result v11

    if-le v10, v11, :cond_3

    move v10, v6

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    :goto_0
    new-instance v11, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    iput v6, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_1
    .catch Landroidx/compose/foundation/lazy/list/ItemFoundInScroll; {:try_start_1 .. :try_end_1} :catch_2

    move v14, v0

    move v15, v7

    move v0, v10

    move-object v13, v11

    move-object v11, v8

    move-object/from16 v28, v12

    move-object v12, v9

    move-object/from16 v9, v28

    :goto_1
    :try_start_2
    iget-boolean v7, v11, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v7, :cond_e

    iget-object v7, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyListState;->getLayoutInfo()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getTotalItemsCount()I

    move-result v7

    if-lez v7, :cond_e

    iget-object v7, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyListState;->getLayoutInfo()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    const/4 v10, 0x0

    const/16 v16, 0x0

    :goto_2
    if-ge v10, v8, :cond_4

    add-int/lit8 v17, v10, 0x1

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    invoke-interface {v10}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getSize()I

    move-result v10

    add-int v16, v16, v10

    move/from16 v10, v17

    goto :goto_2

    :cond_4
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    div-int v16, v16, v7

    iget v7, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$index:I

    iget-object v8, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result v8

    sub-int/2addr v7, v8

    mul-int v7, v7, v16

    int-to-float v7, v7

    iget v8, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$scrollOffset:I

    int-to-float v8, v8

    add-float/2addr v7, v8

    iget-object v8, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemScrollOffset()I

    move-result v8

    int-to-float v8, v8

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v8

    cmpg-float v8, v8, v14

    if-gez v8, :cond_5

    :goto_3
    move v8, v7

    goto :goto_4

    :cond_5
    if-eqz v0, :cond_6

    move v8, v14

    goto :goto_4

    :cond_6
    neg-float v7, v14

    goto :goto_3

    :goto_4
    iget-object v7, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object/from16 v16, v7

    check-cast v16, Landroidx/compose/animation/core/AnimationState;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1e

    const/16 v25, 0x0

    invoke-static/range {v16 .. v25}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    move-result-object v7

    iput-object v7, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v10, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    iget-object v7, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object/from16 v19, v7

    check-cast v19, Landroidx/compose/animation/core/AnimationState;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v20

    const/16 v21, 0x0

    iget-object v7, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/animation/core/AnimationState;

    invoke-virtual {v7}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    cmpg-float v7, v7, v3

    if-nez v7, :cond_7

    move v7, v6

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    if-nez v7, :cond_8

    move/from16 v22, v6

    goto :goto_6

    :cond_8
    const/16 v22, 0x0

    :goto_6
    new-instance v23, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;

    if-eqz v0, :cond_9

    move/from16 v16, v6

    goto :goto_7

    :cond_9
    const/16 v16, 0x0

    :goto_7
    iget v7, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$index:I

    iget-object v5, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v4, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$scrollOffset:I
    :try_end_2
    .catch Landroidx/compose/foundation/lazy/list/ItemFoundInScroll; {:try_start_2 .. :try_end_2} :catch_0

    move/from16 v17, v7

    move-object/from16 v7, v23

    move-object/from16 p0, v9

    move-object v9, v10

    move-object/from16 v10, p0

    move-object/from16 p1, v11

    move-object/from16 v26, v12

    move/from16 v12, v16

    move-object/from16 v27, v13

    move v13, v15

    move v3, v14

    move-object/from16 v14, v27

    move v6, v15

    move/from16 v15, v17

    move-object/from16 v16, v5

    move/from16 v17, v4

    move-object/from16 v18, v26

    :try_start_3
    invoke-direct/range {v7 .. v18}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;-><init>(FLkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;ILandroidx/compose/foundation/lazy/LazyListState;ILkotlin/jvm/internal/Ref$ObjectRef;)V
    :try_end_3
    .catch Landroidx/compose/foundation/lazy/list/ItemFoundInScroll; {:try_start_3 .. :try_end_3} :catch_1

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object/from16 v12, p0

    :try_start_4
    iput-object v12, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$0:Ljava/lang/Object;

    move-object/from16 v8, p1

    iput-object v8, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$1:Ljava/lang/Object;

    move-object/from16 v9, v26

    iput-object v9, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$2:Ljava/lang/Object;

    move-object/from16 v11, v27

    iput-object v11, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$3:Ljava/lang/Object;

    iput v3, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->F$0:F

    iput v6, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->F$1:F

    iput v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->I$0:I

    const/4 v7, 0x1

    iput v7, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->label:I

    move-object/from16 v13, v19

    move-object/from16 v14, v20

    move-object/from16 v15, v21

    move/from16 v16, v22

    move-object/from16 v17, v23

    move-object/from16 v18, v1

    move/from16 v19, v4

    move-object/from16 v20, v5

    invoke-static/range {v13 .. v20}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catch Landroidx/compose/foundation/lazy/list/ItemFoundInScroll; {:try_start_4 .. :try_end_4} :catch_2

    if-ne v4, v2, :cond_a

    return-object v2

    :cond_a
    move v14, v3

    move v15, v6

    move-object v13, v11

    move-object v11, v8

    move-object/from16 v28, v12

    move-object v12, v9

    move-object/from16 v9, v28

    :goto_8
    :try_start_5
    iget v3, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_5
    .catch Landroidx/compose/foundation/lazy/list/ItemFoundInScroll; {:try_start_5 .. :try_end_5} :catch_0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x1

    goto/16 :goto_1

    :catch_0
    move-exception v0

    move-object v12, v9

    goto :goto_9

    :catch_1
    move-exception v0

    move-object/from16 v12, p0

    goto :goto_9

    :cond_b
    :try_start_6
    new-instance v0, Landroidx/compose/foundation/lazy/list/ItemFoundInScroll;

    iget-object v3, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/animation/core/AnimationState;

    invoke-direct {v0, v10, v3}, Landroidx/compose/foundation/lazy/list/ItemFoundInScroll;-><init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;Landroidx/compose/animation/core/AnimationState;)V

    throw v0
    :try_end_6
    .catch Landroidx/compose/foundation/lazy/list/ItemFoundInScroll; {:try_start_6 .. :try_end_6} :catch_2

    :catch_2
    move-exception v0

    :goto_9
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/ItemFoundInScroll;->getPreviousAnimation()Landroidx/compose/animation/core/AnimationState;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1e

    const/16 v22, 0x0

    invoke-static/range {v13 .. v22}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    move-result-object v13

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/list/ItemFoundInScroll;->getItem()Landroidx/compose/foundation/lazy/LazyListItemInfo;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getOffset()I

    move-result v0

    iget v3, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$scrollOffset:I

    add-int/2addr v0, v3

    int-to-float v0, v0

    new-instance v3, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v14

    const/4 v15, 0x0

    invoke-virtual {v13}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_c

    const/4 v5, 0x1

    goto :goto_a

    :cond_c
    const/4 v5, 0x0

    :goto_a
    const/4 v4, 0x1

    xor-int/lit8 v16, v5, 0x1

    new-instance v4, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$4;

    invoke-direct {v4, v0, v3, v12}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$4;-><init>(FLkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/ScrollScope;)V

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/4 v0, 0x0

    iput-object v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$1:Ljava/lang/Object;

    iput-object v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$2:Ljava/lang/Object;

    iput-object v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->L$3:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->label:I

    move-object/from16 v17, v4

    move-object/from16 v18, v1

    invoke-static/range {v13 .. v20}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_d

    return-object v2

    :cond_d
    :goto_b
    iget-object v0, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v2, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$index:I

    iget v1, v1, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->$scrollOffset:I

    invoke-virtual {v0, v2, v1}, Landroidx/compose/foundation/lazy/LazyListState;->snapToItemIndexInternal$foundation_release(II)V

    :cond_e
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
