.class final Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt$RangeSlider$2;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $maxPx:F

.field public final synthetic $minPx:F

.field public final synthetic $onValueChangeFinished:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $onValueChangeState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic $rawOffsetEnd:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $rawOffsetStart:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $scope:Lj/u0;

.field public final synthetic $tickFractions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $valueRange:Lkotlin/ranges/ClosedFloatingPointRange;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/List;FFLkotlin/jvm/functions/Function0;Lj/u0;Landroidx/compose/runtime/State;Lkotlin/ranges/ClosedFloatingPointRange;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;FF",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lj/u0;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/Unit;",
            ">;>;",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$rawOffsetStart:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$rawOffsetEnd:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$tickFractions:Ljava/util/List;

    iput p4, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$minPx:F

    iput p5, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$maxPx:F

    iput-object p6, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$onValueChangeFinished:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$scope:Lj/u0;

    iput-object p8, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$onValueChangeState:Landroidx/compose/runtime/State;

    iput-object p9, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->invoke(Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Z)V
    .locals 16

    move-object/from16 v0, p0

    if-eqz p1, :cond_0

    iget-object v1, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$rawOffsetStart:Landroidx/compose/runtime/MutableState;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$rawOffsetEnd:Landroidx/compose/runtime/MutableState;

    :goto_0
    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$tickFractions:Ljava/util/List;

    iget v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$minPx:F

    iget v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$maxPx:F

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/material/SliderKt;->access$snapValueToTick(FLjava/util/List;FF)F

    move-result v2

    cmpg-float v3, v1, v2

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_3

    iget-object v0, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$onValueChangeFinished:Lkotlin/jvm/functions/Function0;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :goto_2
    return-void

    :cond_3
    iget-object v12, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$scope:Lj/u0;

    const/4 v13, 0x0

    const/4 v14, 0x0

    new-instance v15, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1$1;

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$onValueChangeFinished:Lkotlin/jvm/functions/Function0;

    iget-object v5, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$rawOffsetStart:Landroidx/compose/runtime/MutableState;

    iget-object v6, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$rawOffsetEnd:Landroidx/compose/runtime/MutableState;

    iget-object v7, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$onValueChangeState:Landroidx/compose/runtime/State;

    iget v8, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$minPx:F

    iget v9, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$maxPx:F

    iget-object v10, v0, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    const/4 v11, 0x0

    move-object v0, v15

    move/from16 v4, p1

    invoke-direct/range {v0 .. v11}, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1$1;-><init>(FFLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;FFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, v12

    move-object v2, v13

    move-object v3, v14

    move-object v4, v15

    invoke-static/range {v1 .. v6}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    return-void
.end method