.class final Landroidx/compose/foundation/gestures/ScrollingLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u001b\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0006\u0010+\u001a\u00020\u0005J1\u0010,\u001a\u00020$*\u00020-2\u0006\u0010.\u001a\u00020$2\u0008\u0010/\u001a\u0004\u0018\u00010\'2\u0006\u00100\u001a\u000201\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00082\u00103J\n\u00104\u001a\u00020$*\u00020$J\u0017\u00105\u001a\u00020$*\u00020\'\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00086\u00107J\u0017\u00105\u001a\u00020$*\u00020\u001d\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00088\u00107J\u001a\u00109\u001a\u00020\'*\u00020$\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008:\u0010;J\u001a\u0010<\u001a\u00020\u001d*\u00020$\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008=\u0010;J\u001f\u0010>\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010?\u001a\u00020$\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008@\u0010AR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006B"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/ScrollingLogic;",
        "",
        "orientation",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "reverseDirection",
        "",
        "nestedScrollDispatcher",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;",
        "scrollableState",
        "Landroidx/compose/foundation/gestures/ScrollableState;",
        "flingBehavior",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "overScrollController",
        "Landroidx/compose/foundation/gestures/OverScrollController;",
        "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/OverScrollController;)V",
        "getFlingBehavior",
        "()Landroidx/compose/foundation/gestures/FlingBehavior;",
        "getNestedScrollDispatcher",
        "()Landroidx/compose/runtime/State;",
        "getOrientation",
        "()Landroidx/compose/foundation/gestures/Orientation;",
        "getOverScrollController",
        "()Landroidx/compose/foundation/gestures/OverScrollController;",
        "getReverseDirection",
        "()Z",
        "getScrollableState",
        "()Landroidx/compose/foundation/gestures/ScrollableState;",
        "doFlingAnimation",
        "Landroidx/compose/ui/unit/Velocity;",
        "available",
        "doFlingAnimation-QWom1Mo",
        "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onDragStopped",
        "",
        "axisVelocity",
        "",
        "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "performRawScroll",
        "Landroidx/compose/ui/geometry/Offset;",
        "scroll",
        "performRawScroll-MK-Hz9U",
        "(J)J",
        "shouldScrollImmediately",
        "dispatchScroll",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "scrollDelta",
        "pointerPosition",
        "source",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;",
        "dispatchScroll-iGfEq8s",
        "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/ui/geometry/Offset;I)F",
        "reverseIfNeeded",
        "toFloat",
        "toFloat-k-4lQ0M",
        "(J)F",
        "toFloat-TH1AsA0",
        "toOffset",
        "toOffset-tuRUvjQ",
        "(F)J",
        "toVelocity",
        "toVelocity-adjELrA",
        "update",
        "newValue",
        "update-QWom1Mo",
        "(JF)J",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nestedScrollDispatcher:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final orientation:Landroidx/compose/foundation/gestures/Orientation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final reverseDirection:Z

.field private final scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/OverScrollController;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/gestures/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/gestures/ScrollableState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/gestures/OverScrollController;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Z",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;",
            ">;",
            "Landroidx/compose/foundation/gestures/ScrollableState;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Landroidx/compose/foundation/gestures/OverScrollController;",
            ")V"
        }
    .end annotation

    const-string v0, "orientation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nestedScrollDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollableState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flingBehavior"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->reverseDirection:Z

    iput-object p3, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->nestedScrollDispatcher:Landroidx/compose/runtime/State;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    iput-object p5, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    iput-object p6, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    return-void
.end method


# virtual methods
.method public final dispatchScroll-iGfEq8s(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/ui/geometry/Offset;I)F
    .locals 10
    .param p1    # Landroidx/compose/foundation/gestures/ScrollScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/geometry/Offset;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toOffset-tuRUvjQ(F)J

    move-result-wide v1

    invoke-interface {v0, v1, v2, p3, p4}, Landroidx/compose/foundation/gestures/OverScrollController;->consumePreScroll-A0NYTsA(JLandroidx/compose/ui/geometry/Offset;I)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toFloat-k-4lQ0M(J)F

    move-result v0

    :goto_0
    sub-float/2addr p2, v0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->nestedScrollDispatcher:Landroidx/compose/runtime/State;

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    invoke-virtual {p0, p2}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toOffset-tuRUvjQ(F)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, p4}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->dispatchPreScroll-OzD1aCk(JI)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toFloat-k-4lQ0M(J)F

    move-result v0

    sub-float/2addr p2, v0

    invoke-virtual {p0, p2}, Landroidx/compose/foundation/gestures/ScrollingLogic;->reverseIfNeeded(F)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/foundation/gestures/ScrollScope;->scrollBy(F)F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->reverseIfNeeded(F)F

    move-result p1

    sub-float v0, p2, p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toOffset-tuRUvjQ(F)J

    move-result-wide v2

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toOffset-tuRUvjQ(F)J

    move-result-wide v4

    move v6, p4

    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->dispatchPostScroll-DzOQY0M(JJI)J

    move-result-wide v1

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p2}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toOffset-tuRUvjQ(F)J

    move-result-wide v4

    invoke-virtual {p0, v1, v2}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toFloat-k-4lQ0M(J)F

    move-result p1

    sub-float p1, v0, p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toOffset-tuRUvjQ(F)J

    move-result-wide v6

    move-object v8, p3

    move v9, p4

    invoke-interface/range {v3 .. v9}, Landroidx/compose/foundation/gestures/OverScrollController;->consumePostScroll-l7mfB5k(JJLandroidx/compose/ui/geometry/Offset;I)V

    :goto_1
    return v0
.end method

.method public final doFlingAnimation-QWom1Mo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/ui/unit/Velocity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;

    iget v1, v0, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;

    invoke-direct {v0, p0, p3}, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;-><init>(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p3, v4, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v4, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p0, v4, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p3, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    iput-wide p1, p3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/ScrollingLogic;->getScrollableState()Landroidx/compose/foundation/gestures/ScrollableState;

    move-result-object v1

    const/4 v3, 0x0

    new-instance v11, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$2;

    const/4 v10, 0x0

    move-object v5, v11

    move-object v6, p0

    move-object v7, p3

    move-wide v8, p1

    invoke-direct/range {v5 .. v10}, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$2;-><init>(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/jvm/internal/Ref$LongRef;JLkotlin/coroutines/Continuation;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    iput-object p3, v4, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;->L$0:Ljava/lang/Object;

    iput v2, v4, Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$1;->label:I

    move-object v2, v3

    move-object v3, v11

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/gestures/ScrollableState$DefaultImpls;->scroll$default(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3

    return-object v0

    :cond_3
    move-object p0, p3

    :goto_1
    iget-wide p0, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Velocity;->box-impl(J)Landroidx/compose/ui/unit/Velocity;

    move-result-object p0

    return-object p0
.end method

.method public final getFlingBehavior()Landroidx/compose/foundation/gestures/FlingBehavior;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    return-object p0
.end method

.method public final getNestedScrollDispatcher()Landroidx/compose/runtime/State;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->nestedScrollDispatcher:Landroidx/compose/runtime/State;

    return-object p0
.end method

.method public final getOrientation()Landroidx/compose/foundation/gestures/Orientation;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    return-object p0
.end method

.method public final getOverScrollController()Landroidx/compose/foundation/gestures/OverScrollController;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    return-object p0
.end method

.method public final getReverseDirection()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->reverseDirection:Z

    return p0
.end method

.method public final getScrollableState()Landroidx/compose/foundation/gestures/ScrollableState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    return-object p0
.end method

.method public final onDragStopped(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;

    iget v1, v0, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;

    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;-><init>(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p2, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v4, :cond_4

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-wide p0, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->J$0:J

    iget-object v0, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->L$0:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/gestures/ScrollingLogic;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-wide p0, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->J$0:J

    iget-object v1, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->L$0:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/foundation/gestures/ScrollingLogic;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_3
    move-object v7, v1

    goto :goto_3

    :cond_4
    iget-wide p0, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->J$0:J

    iget-object v1, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->L$0:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/foundation/gestures/ScrollingLogic;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/ScrollingLogic;->getOverScrollController()Landroidx/compose/foundation/gestures/OverScrollController;

    move-result-object p2

    if-nez p2, :cond_6

    const/4 p2, 0x0

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toVelocity-adjELrA(F)J

    move-result-wide v7

    invoke-interface {p2, v7, v8}, Landroidx/compose/foundation/gestures/OverScrollController;->consumePreFling-AH228Gc(J)J

    move-result-wide v7

    invoke-virtual {p0, v7, v8}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toFloat-TH1AsA0(J)F

    move-result p2

    :goto_1
    sub-float/2addr p1, p2

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toVelocity-adjELrA(F)J

    move-result-wide p1

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/ScrollingLogic;->getNestedScrollDispatcher()Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    iput-object p0, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->L$0:Ljava/lang/Object;

    iput-wide p1, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->J$0:J

    iput v4, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->label:I

    invoke-virtual {v1, p1, p2, v6}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->dispatchPreFling-QWom1Mo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    return-object v0

    :cond_7
    move-object v10, v1

    move-object v1, p0

    move-wide p0, p1

    move-object p2, v10

    :goto_2
    check-cast p2, Landroidx/compose/ui/unit/Velocity;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/Velocity;->unbox-impl()J

    move-result-wide v4

    invoke-static {p0, p1, v4, v5}, Landroidx/compose/ui/unit/Velocity;->minus-AH228Gc(JJ)J

    move-result-wide p0

    iput-object v1, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->L$0:Ljava/lang/Object;

    iput-wide p0, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->J$0:J

    iput v3, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->label:I

    invoke-virtual {v1, p0, p1, v6}, Landroidx/compose/foundation/gestures/ScrollingLogic;->doFlingAnimation-QWom1Mo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :goto_3
    check-cast p2, Landroidx/compose/ui/unit/Velocity;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/Velocity;->unbox-impl()J

    move-result-wide v8

    invoke-virtual {v7}, Landroidx/compose/foundation/gestures/ScrollingLogic;->getNestedScrollDispatcher()Landroidx/compose/runtime/State;

    move-result-object p2

    invoke-interface {p2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    invoke-static {p0, p1, v8, v9}, Landroidx/compose/ui/unit/Velocity;->minus-AH228Gc(JJ)J

    move-result-wide p0

    iput-object v7, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->L$0:Ljava/lang/Object;

    iput-wide v8, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->J$0:J

    iput v2, v6, Landroidx/compose/foundation/gestures/ScrollingLogic$onDragStopped$1;->label:I

    move-wide v2, p0

    move-wide v4, v8

    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->dispatchPostFling-RZ2iAVY(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_8

    return-object v0

    :cond_8
    move-object v0, v7

    move-wide p0, v8

    :goto_4
    check-cast p2, Landroidx/compose/ui/unit/Velocity;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/Velocity;->unbox-impl()J

    move-result-wide v1

    invoke-static {p0, p1, v1, v2}, Landroidx/compose/ui/unit/Velocity;->minus-AH228Gc(JJ)J

    move-result-wide p0

    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/ScrollingLogic;->getOverScrollController()Landroidx/compose/foundation/gestures/OverScrollController;

    move-result-object p2

    if-nez p2, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v0, p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toFloat-TH1AsA0(J)F

    move-result p0

    invoke-virtual {v0, p0}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toVelocity-adjELrA(F)J

    move-result-wide p0

    invoke-interface {p2, p0, p1}, Landroidx/compose/foundation/gestures/OverScrollController;->consumePostFling-TH1AsA0(J)V

    :goto_5
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/ScrollingLogic;->getOverScrollController()Landroidx/compose/foundation/gestures/OverScrollController;

    move-result-object p0

    if-nez p0, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {p0}, Landroidx/compose/foundation/gestures/OverScrollController;->release()V

    :goto_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final performRawScroll-MK-Hz9U(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-interface {v0}, Landroidx/compose/foundation/gestures/ScrollableState;->isScrollInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide p0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toFloat-k-4lQ0M(J)F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->reverseIfNeeded(F)F

    move-result p1

    invoke-interface {v0, p1}, Landroidx/compose/foundation/gestures/ScrollableState;->dispatchRawDelta(F)F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->reverseIfNeeded(F)F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollingLogic;->toOffset-tuRUvjQ(F)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public final reverseIfNeeded(F)F
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->reverseDirection:Z

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    int-to-float p0, p0

    mul-float/2addr p1, p0

    :cond_0
    return p1
.end method

.method public final shouldScrollImmediately()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-interface {v0}, Landroidx/compose/foundation/gestures/ScrollableState;->isScrollInProgress()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    if-nez p0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Landroidx/compose/foundation/gestures/OverScrollController;->stopOverscrollAnimation()Z

    move-result p0

    :goto_0
    if-eqz p0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final toFloat-TH1AsA0(J)F
    .locals 1

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    if-ne p0, v0, :cond_0

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result p0

    :goto_0
    return p0
.end method

.method public final toFloat-k-4lQ0M(J)F
    .locals 1

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    if-ne p0, v0, :cond_0

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p0

    :goto_0
    return p0
.end method

.method public final toOffset-tuRUvjQ(F)J
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide p0

    goto :goto_1

    :cond_1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    if-ne p0, v1, :cond_2

    invoke-static {p1, v0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide p0

    goto :goto_1

    :cond_2
    invoke-static {v0, p1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide p0

    :goto_1
    return-wide p0
.end method

.method public final toVelocity-adjELrA(F)J
    .locals 2

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    invoke-static {p1, v1}, Landroidx/compose/ui/unit/VelocityKt;->Velocity(FF)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    invoke-static {v1, p1}, Landroidx/compose/ui/unit/VelocityKt;->Velocity(FF)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public final update-QWom1Mo(JF)J
    .locals 7

    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollingLogic;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    if-ne p0, v0, :cond_0

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-wide v1, p1

    move v3, p3

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/Velocity;->copy-OhffZ5M$default(JFFILjava/lang/Object;)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-wide v0, p1

    move v3, p3

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/unit/Velocity;->copy-OhffZ5M$default(JFFILjava/lang/Object;)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method
