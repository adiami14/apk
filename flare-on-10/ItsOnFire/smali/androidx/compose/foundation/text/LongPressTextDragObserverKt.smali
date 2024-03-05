.class public final Landroidx/compose/foundation/text/LongPressTextDragObserverKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0007"
    }
    d2 = {
        "detectDragGesturesAfterLongPressWithObserver",
        "",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "observer",
        "Landroidx/compose/foundation/text/TextDragObserver;",
        "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "detectDragGesturesWithObserver",
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
.method public static final detectDragGesturesAfterLongPressWithObserver(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text/TextDragObserver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Landroidx/compose/foundation/text/TextDragObserver;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v1, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    new-instance v2, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3;

    invoke-direct {v2, p1}, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    new-instance v3, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4;

    invoke-direct {v3, p1}, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    new-instance v4, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5;

    invoke-direct {v4, p1}, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    move-object v0, p0

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGesturesAfterLongPress(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final detectDragGesturesWithObserver(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text/TextDragObserver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Landroidx/compose/foundation/text/TextDragObserver;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v1, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesWithObserver$2;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesWithObserver$2;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    new-instance v2, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesWithObserver$3;

    invoke-direct {v2, p1}, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesWithObserver$3;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    new-instance v3, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesWithObserver$4;

    invoke-direct {v3, p1}, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesWithObserver$4;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    new-instance v4, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesWithObserver$5;

    invoke-direct {v4, p1}, Landroidx/compose/foundation/text/LongPressTextDragObserverKt$detectDragGesturesWithObserver$5;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    move-object v0, p0

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
