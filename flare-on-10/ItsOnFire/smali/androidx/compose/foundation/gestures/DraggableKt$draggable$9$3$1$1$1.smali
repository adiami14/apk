.class final Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1$1"
    f = "Draggable.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x10b,
        0x113
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope",
        "velocityTracker",
        "velocityTracker",
        "isDragSuccessful"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field public final synthetic $$this$coroutineScope:Lj/u0;

.field public final synthetic $canDragState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic $channel:Ll/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/n<",
            "Landroidx/compose/foundation/gestures/DragEvent;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $orientation:Landroidx/compose/foundation/gestures/Orientation;

.field public final synthetic $reverseDirection:Z

.field public final synthetic $startImmediatelyState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field public L$1:Ljava/lang/Object;

.field public L$2:Ljava/lang/Object;

.field public L$3:Ljava/lang/Object;

.field public Z$0:Z

.field public label:I


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/Orientation;Ll/n;ZLj/u0;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Ll/n<",
            "Landroidx/compose/foundation/gestures/DragEvent;",
            ">;Z",
            "Lj/u0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$canDragState:Landroidx/compose/runtime/State;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$startImmediatelyState:Landroidx/compose/runtime/State;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$channel:Ll/n;

    iput-boolean p5, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$reverseDirection:Z

    iput-object p6, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$$this$coroutineScope:Lj/u0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v8, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$canDragState:Landroidx/compose/runtime/State;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$startImmediatelyState:Landroidx/compose/runtime/State;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$channel:Ll/n;

    iget-boolean v5, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$reverseDirection:Z

    iget-object v6, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$$this$coroutineScope:Lj/u0;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/Orientation;Ll/n;ZLj/u0;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v8, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$0:Ljava/lang/Object;

    return-object v8
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
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
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    iget v1, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->label:I

    const/4 v9, -0x1

    const/4 v7, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v11, :cond_1

    if-ne v1, v7, :cond_0

    iget v1, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->I$0:I

    iget-boolean v2, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->Z$0:Z

    iget-object v3, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lj/u0;

    iget-object v4, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$2:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/foundation/gestures/Orientation;

    iget-object v5, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ll/n;

    iget-object v0, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$0:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Landroidx/compose/ui/input/pointer/util/VelocityTracker;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move v10, v1

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/input/pointer/util/VelocityTracker;

    iget-object v2, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v1

    move-object/from16 v1, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$0:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    new-instance v13, Landroidx/compose/ui/input/pointer/util/VelocityTracker;

    invoke-direct {v13}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;-><init>()V

    iget-object v2, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$canDragState:Landroidx/compose/runtime/State;

    iget-object v3, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$startImmediatelyState:Landroidx/compose/runtime/State;

    iget-object v5, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-object v12, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v13, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$1:Ljava/lang/Object;

    iput v11, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->label:I

    move-object v1, v12

    move-object v4, v13

    move-object/from16 v6, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/gestures/DraggableKt;->access$awaitDownAndSlop(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_3

    return-object v8

    :cond_3
    move-object v2, v12

    :goto_0
    move-object v3, v1

    check-cast v3, Lkotlin/Pair;

    if-nez v3, :cond_4

    goto/16 :goto_7

    :cond_4
    iget-object v12, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$channel:Ll/n;

    iget-boolean v14, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$reverseDirection:Z

    iget-object v15, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iget-object v6, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->$$this$coroutineScope:Lj/u0;

    if-eqz v14, :cond_5

    move v5, v11

    goto :goto_1

    :cond_5
    move v5, v10

    :goto_1
    :try_start_1
    iput-object v13, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v12, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$1:Ljava/lang/Object;

    iput-object v15, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->L$3:Ljava/lang/Object;

    iput-boolean v14, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->Z$0:Z

    iput v10, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->I$0:I

    iput v7, v0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1;->label:I
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v13

    move-object v4, v12

    move-object/from16 v16, v6

    move-object v6, v15

    move-object/from16 v7, p0

    :try_start_2
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/gestures/DraggableKt;->access$awaitDrag(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/Pair;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Ll/m0;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v8, :cond_6

    return-object v8

    :cond_6
    move v1, v10

    move-object v5, v12

    move-object v6, v13

    move v2, v14

    move-object v4, v15

    move-object/from16 v3, v16

    :goto_2
    :try_start_3
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_8

    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->calculateVelocity-9UxMQ8M()J

    move-result-wide v0

    invoke-static {v0, v1, v4}, Landroidx/compose/foundation/gestures/DraggableKt;->access$toFloat-sF-c-tU(JLandroidx/compose/foundation/gestures/Orientation;)F

    move-result v0

    new-instance v1, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    move v9, v11

    :goto_3
    int-to-float v2, v9

    mul-float/2addr v0, v2

    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;-><init>(F)V

    goto :goto_4

    :cond_8
    sget-object v1, Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;->INSTANCE:Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;

    :goto_4
    invoke-interface {v5, v1}, Ll/m0;->T(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v5, v12

    move-object v6, v13

    move v2, v14

    move-object v4, v15

    goto :goto_8

    :catch_2
    move-exception v0

    move-object/from16 v16, v6

    :goto_5
    move-object v5, v12

    move-object v6, v13

    move v2, v14

    move-object v4, v15

    move-object/from16 v3, v16

    :goto_6
    :try_start_4
    invoke-static {v3}, Lj/v0;->k(Lj/u0;)Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v1, :cond_9

    sget-object v0, Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;->INSTANCE:Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;

    invoke-interface {v5, v0}, Ll/m0;->T(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_9
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    :goto_8
    if-eqz v10, :cond_b

    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->calculateVelocity-9UxMQ8M()J

    move-result-wide v6

    invoke-static {v6, v7, v4}, Landroidx/compose/foundation/gestures/DraggableKt;->access$toFloat-sF-c-tU(JLandroidx/compose/foundation/gestures/Orientation;)F

    move-result v1

    new-instance v3, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;

    if-eqz v2, :cond_a

    goto :goto_9

    :cond_a
    move v9, v11

    :goto_9
    int-to-float v2, v9

    mul-float/2addr v1, v2

    invoke-direct {v3, v1}, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;-><init>(F)V

    goto :goto_a

    :cond_b
    sget-object v3, Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;->INSTANCE:Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;

    :goto_a
    invoke-interface {v5, v3}, Ll/m0;->T(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method
