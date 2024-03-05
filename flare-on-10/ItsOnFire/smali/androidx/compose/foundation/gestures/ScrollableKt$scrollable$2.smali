.class final Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/ScrollableKt;->scrollable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/OverScrollController;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/ui/Modifier;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/Modifier;",
        "invoke",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"
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
.field public final synthetic $enabled:Z

.field public final synthetic $flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

.field public final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field public final synthetic $orientation:Landroidx/compose/foundation/gestures/Orientation;

.field public final synthetic $overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

.field public final synthetic $reverseDirection:Z

.field public final synthetic $state:Landroidx/compose/foundation/gestures/ScrollableState;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/FlingBehavior;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$state:Landroidx/compose/foundation/gestures/ScrollableState;

    iput-boolean p4, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$reverseDirection:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$enabled:Z

    iput-object p6, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p7, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$invoke$reverseIfNeeded(FZ)F
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->invoke$reverseIfNeeded(FZ)F

    move-result p0

    return p0
.end method

.method private static final invoke$reverseIfNeeded(FZ)F
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    int-to-float p1, p1

    mul-float/2addr p0, p1

    :cond_0
    return p0
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 11
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "$this$composed"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x1ff74155

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object p3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    invoke-static {p3, p1}, Landroidx/compose/foundation/gestures/AndroidOverScrollKt;->overScroll(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/OverScrollController;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    :cond_1
    iget-object p3, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$state:Landroidx/compose/foundation/gestures/ScrollableState;

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$reverseDirection:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$state:Landroidx/compose/foundation/gestures/ScrollableState;

    iget-boolean v4, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$reverseDirection:Z

    const v5, -0x383ecf

    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_3

    :cond_2
    new-instance v0, Landroidx/compose/foundation/gestures/BringIntoViewResponder;

    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/foundation/gestures/BringIntoViewResponder;-><init>(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v0, Landroidx/compose/foundation/gestures/BringIntoViewResponder;

    iget-boolean p3, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$enabled:Z

    if-eqz p3, :cond_4

    sget-object p3, Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;->INSTANCE:Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;

    goto :goto_1

    :cond_4
    sget-object p3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    :goto_1
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    invoke-virtual {v1, v0}, Landroidx/compose/ui/Modifier$Companion;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iget-boolean v4, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$reverseDirection:Z

    iget-object v5, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$state:Landroidx/compose/foundation/gestures/ScrollableState;

    iget-object v6, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$overScrollController:Landroidx/compose/foundation/gestures/OverScrollController;

    iget-boolean v8, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$enabled:Z

    const/4 v10, 0x0

    move-object v9, p2

    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/gestures/ScrollableKt;->access$touchScrollable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/OverScrollController;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    new-instance v1, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2$1;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$state:Landroidx/compose/foundation/gestures/ScrollableState;

    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->$reverseDirection:Z

    invoke-direct {v1, v2, p0}, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2$1;-><init>(Landroidx/compose/foundation/gestures/ScrollableState;Z)V

    invoke-static {p1, v0, v1}, Landroidx/compose/foundation/gestures/AndroidScrollable_androidKt;->mouseScrollable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p0, p3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
