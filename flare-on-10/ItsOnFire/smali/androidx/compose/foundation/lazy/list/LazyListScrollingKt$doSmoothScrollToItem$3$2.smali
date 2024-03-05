.class final Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/animation/core/AnimationScope<",
        "Ljava/lang/Float;",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/animation/core/AnimationScope;",
        "",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

.field public final synthetic $anim:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/animation/core/AnimationState<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic $boundDistancePx:F

.field public final synthetic $forward:Z

.field public final synthetic $index:I

.field public final synthetic $loop:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic $loops:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic $prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

.field public final synthetic $scrollOffset:I

.field public final synthetic $target:F

.field public final synthetic $this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;


# direct methods
.method public constructor <init>(FLkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;ILandroidx/compose/foundation/lazy/LazyListState;ILkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "Lkotlin/jvm/internal/Ref$BooleanRef;",
            "ZF",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "I",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "I",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/animation/core/AnimationState<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)V"
        }
    .end annotation

    iput p1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$target:F

    iput-object p2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

    iput-object p4, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$loop:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean p5, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$forward:Z

    iput p6, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$boundDistancePx:F

    iput-object p7, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$loops:Lkotlin/jvm/internal/Ref$IntRef;

    iput p8, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    iput-object p9, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iput p10, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$scrollOffset:I

    iput-object p11, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$anim:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/animation/core/AnimationScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->invoke(Landroidx/compose/animation/core/AnimationScope;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/animation/core/AnimationScope;)V
    .locals 8
    .param p1    # Landroidx/compose/animation/core/AnimationScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/AnimationScope<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;)V"
        }
    .end annotation

    const-string v0, "$this$animateTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v1, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    invoke-static {v0, v1}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt;->access$doSmoothScrollToItem$getTargetItem(Landroidx/compose/foundation/lazy/LazyListState;I)Landroidx/compose/foundation/lazy/LazyListItemInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    iget v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$target:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$target:F

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$target:F

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v0

    :goto_0
    iget-object v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v2, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    sub-float/2addr v0, v2

    iget-object v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

    invoke-interface {v2, v0}, Landroidx/compose/foundation/gestures/ScrollScope;->scrollBy(F)F

    move-result v2

    iget-object v3, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v4, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    invoke-static {v3, v4}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt;->access$doSmoothScrollToItem$getTargetItem(Landroidx/compose/foundation/lazy/LazyListState;I)Landroidx/compose/foundation/lazy/LazyListItemInfo;

    move-result-object v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-boolean v4, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$forward:Z

    iget-object v5, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v6, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    iget v7, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$scrollOffset:I

    invoke-static {v4, v5, v6, v7}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->access$invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/LazyListState;II)Z

    move-result v4

    if-nez v4, :cond_7

    cmpg-float v2, v0, v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    if-nez v2, :cond_3

    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$loop:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v1, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    return-void

    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v4, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    add-float/2addr v4, v0

    iput v4, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$forward:Z

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$boundDistancePx:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$boundDistancePx:F

    neg-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_5

    :goto_2
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    :cond_5
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$forward:Z

    const/4 v2, 0x2

    const/16 v4, 0x64

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$loops:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-lt v0, v2, :cond_7

    iget v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    iget-object v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListState;->getLayoutInfo()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    invoke-interface {v2}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    move-result v2

    sub-int/2addr v0, v2

    if-le v0, v4, :cond_7

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    sub-int/2addr v2, v4

    goto :goto_3

    :cond_6
    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$loops:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-lt v0, v2, :cond_7

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListState;->getLayoutInfo()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    sub-int/2addr v0, v2

    if-le v0, v4, :cond_7

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    add-int/2addr v2, v4

    :goto_3
    invoke-virtual {v0, v2, v1}, Landroidx/compose/foundation/lazy/LazyListState;->snapToItemIndexInternal$foundation_release(II)V

    :cond_7
    :goto_4
    move-object v0, v3

    :cond_8
    iget-boolean v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$forward:Z

    iget-object v3, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v4, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    iget v5, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$scrollOffset:I

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3;->access$invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/LazyListState;II)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;

    iget v2, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$index:I

    iget v3, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$scrollOffset:I

    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/lazy/LazyListState;->snapToItemIndexInternal$foundation_release(II)V

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$loop:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v1, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    return-void

    :cond_9
    if-nez v0, :cond_a

    return-void

    :cond_a
    new-instance p1, Landroidx/compose/foundation/lazy/list/ItemFoundInScroll;

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3$2;->$anim:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Landroidx/compose/animation/core/AnimationState;

    invoke-direct {p1, v0, p0}, Landroidx/compose/foundation/lazy/list/ItemFoundInScroll;-><init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;Landroidx/compose/animation/core/AnimationState;)V

    throw p1
.end method
