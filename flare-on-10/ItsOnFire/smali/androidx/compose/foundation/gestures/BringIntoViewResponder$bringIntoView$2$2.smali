.class final Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lj/u0;",
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
        "Lj/u0;",
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
    c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$2"
    f = "Scrollable.kt"
    i = {}
    l = {
        0x1cc
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public final synthetic $destRect:Landroidx/compose/ui/geometry/Rect;

.field public label:I

.field public final synthetic this$0:Landroidx/compose/foundation/gestures/BringIntoViewResponder;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/BringIntoViewResponder;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/BringIntoViewResponder;",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->this$0:Landroidx/compose/foundation/gestures/BringIntoViewResponder;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->$destRect:Landroidx/compose/ui/geometry/Rect;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->this$0:Landroidx/compose/foundation/gestures/BringIntoViewResponder;

    iget-object p0, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->$destRect:Landroidx/compose/ui/geometry/Rect;

    invoke-direct {p1, v0, p0, p2}, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;-><init>(Landroidx/compose/foundation/gestures/BringIntoViewResponder;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lj/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lj/u0;
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
            "Lj/u0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj/u0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->invoke(Lj/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->this$0:Landroidx/compose/foundation/gestures/BringIntoViewResponder;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/BringIntoViewResponder;->access$getParent$p(Landroidx/compose/foundation/gestures/BringIntoViewResponder;)Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    move-result-object p1

    const-string v1, "parent"

    const/4 v3, 0x0

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_2
    iget-object v4, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->this$0:Landroidx/compose/foundation/gestures/BringIntoViewResponder;

    invoke-static {v4}, Landroidx/compose/foundation/gestures/BringIntoViewResponder;->access$getParent$p(Landroidx/compose/foundation/gestures/BringIntoViewResponder;)Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v3

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->$destRect:Landroidx/compose/ui/geometry/Rect;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->this$0:Landroidx/compose/foundation/gestures/BringIntoViewResponder;

    invoke-static {v5}, Landroidx/compose/foundation/gestures/BringIntoViewResponder;->access$getLayoutCoordinates$p(Landroidx/compose/foundation/gestures/BringIntoViewResponder;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v5

    if-nez v5, :cond_4

    const-string v5, "layoutCoordinates"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v3, v5

    :goto_0
    invoke-interface {v4, v1, v3}, Landroidx/compose/foundation/relocation/BringIntoViewResponder;->toLocalRect(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    iput v2, p0, Landroidx/compose/foundation/gestures/BringIntoViewResponder$bringIntoView$2$2;->label:I

    invoke-interface {p1, v1, p0}, Landroidx/compose/foundation/relocation/BringIntoViewResponder;->bringIntoView(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
