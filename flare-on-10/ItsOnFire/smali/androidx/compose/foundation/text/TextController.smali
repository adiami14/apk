.class public final Landroidx/compose/foundation/text/TextController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/RememberObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0019\u001a\u00020\u001aH\u0016J\u0008\u0010\u001b\u001a\u00020\u001aH\u0016J\u0008\u0010\u001c\u001a\u00020\u001aH\u0016J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u001a2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000c\u0010%\u001a\u00020\u0006*\u00020\u0006H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006&"
    }
    d2 = {
        "Landroidx/compose/foundation/text/TextController;",
        "Landroidx/compose/runtime/RememberObserver;",
        "state",
        "Landroidx/compose/foundation/text/TextState;",
        "(Landroidx/compose/foundation/text/TextState;)V",
        "coreModifiers",
        "Landroidx/compose/ui/Modifier;",
        "longPressDragObserver",
        "Landroidx/compose/foundation/text/TextDragObserver;",
        "getLongPressDragObserver",
        "()Landroidx/compose/foundation/text/TextDragObserver;",
        "setLongPressDragObserver",
        "(Landroidx/compose/foundation/text/TextDragObserver;)V",
        "measurePolicy",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "getMeasurePolicy",
        "()Landroidx/compose/ui/layout/MeasurePolicy;",
        "modifiers",
        "getModifiers",
        "()Landroidx/compose/ui/Modifier;",
        "selectionModifiers",
        "selectionRegistrar",
        "Landroidx/compose/foundation/text/selection/SelectionRegistrar;",
        "getState",
        "()Landroidx/compose/foundation/text/TextState;",
        "onAbandoned",
        "",
        "onForgotten",
        "onRemembered",
        "outOfBoundary",
        "",
        "start",
        "Landroidx/compose/ui/geometry/Offset;",
        "end",
        "outOfBoundary-0a9Yr6o",
        "(JJ)Z",
        "update",
        "drawTextAndSelectionBehind",
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
.field private final coreModifiers:Landroidx/compose/ui/Modifier;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public longPressDragObserver:Landroidx/compose/foundation/text/TextDragObserver;

.field private final measurePolicy:Landroidx/compose/ui/layout/MeasurePolicy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private selectionModifiers:Landroidx/compose/ui/Modifier;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final state:Landroidx/compose/foundation/text/TextState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/TextState;)V
    .locals 5
    .param p1    # Landroidx/compose/foundation/text/TextState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/TextController;->state:Landroidx/compose/foundation/text/TextState;

    new-instance p1, Landroidx/compose/foundation/text/TextController$measurePolicy$1;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/TextController$measurePolicy$1;-><init>(Landroidx/compose/foundation/text/TextController;)V

    iput-object p1, p0, Landroidx/compose/foundation/text/TextController;->measurePolicy:Landroidx/compose/ui/layout/MeasurePolicy;

    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/TextController;->drawTextAndSelectionBehind(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Landroidx/compose/foundation/text/TextController$coreModifiers$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/TextController$coreModifiers$1;-><init>(Landroidx/compose/foundation/text/TextController;)V

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Landroidx/compose/foundation/text/TextController$coreModifiers$2;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/TextController$coreModifiers$2;-><init>(Landroidx/compose/foundation/text/TextController;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/text/TextController;->coreModifiers:Landroidx/compose/ui/Modifier;

    iput-object p1, p0, Landroidx/compose/foundation/text/TextController;->selectionModifiers:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public static final synthetic access$getSelectionRegistrar$p(Landroidx/compose/foundation/text/TextController;)Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/TextController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    return-object p0
.end method

.method public static final synthetic access$outOfBoundary-0a9Yr6o(Landroidx/compose/foundation/text/TextController;JJ)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/TextController;->outOfBoundary-0a9Yr6o(JJ)Z

    move-result p0

    return p0
.end method

.method private final drawTextAndSelectionBehind(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 18
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x3fff

    const/16 v17, 0x0

    invoke-static/range {v0 .. v17}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer-2Xn7asI$default(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Landroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Landroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1;-><init>(Landroidx/compose/foundation/text/TextController;)V

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method private final outOfBoundary-0a9Yr6o(JJ)Z
    .locals 2

    iget-object p0, p0, Landroidx/compose/foundation/text/TextController;->state:Landroidx/compose/foundation/text/TextState;

    invoke-virtual {p0}, Landroidx/compose/foundation/text/TextState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    move-result p1

    invoke-virtual {p0, p3, p4}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    move-result p0

    const/4 p2, 0x1

    sub-int/2addr v1, p2

    if-lt p1, v1, :cond_1

    if-ge p0, v1, :cond_2

    :cond_1
    if-gez p1, :cond_3

    if-gez p0, :cond_3

    :cond_2
    move v0, p2

    :cond_3
    return v0
.end method


# virtual methods
.method public final getLongPressDragObserver()Landroidx/compose/foundation/text/TextDragObserver;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/text/TextController;->longPressDragObserver:Landroidx/compose/foundation/text/TextDragObserver;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "longPressDragObserver"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final getMeasurePolicy()Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/text/TextController;->measurePolicy:Landroidx/compose/ui/layout/MeasurePolicy;

    return-object p0
.end method

.method public final getModifiers()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/TextController;->coreModifiers:Landroidx/compose/ui/Modifier;

    iget-object p0, p0, Landroidx/compose/foundation/text/TextController;->selectionModifiers:Landroidx/compose/ui/Modifier;

    invoke-interface {v0, p0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public final getState()Landroidx/compose/foundation/text/TextState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/text/TextController;->state:Landroidx/compose/foundation/text/TextState;

    return-object p0
.end method

.method public onAbandoned()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/TextController;->state:Landroidx/compose/foundation/text/TextState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextState;->getSelectable()Landroidx/compose/foundation/text/selection/Selectable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Landroidx/compose/foundation/text/TextController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p0, v0}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->unsubscribe(Landroidx/compose/foundation/text/selection/Selectable;)V

    :goto_0
    return-void
.end method

.method public onForgotten()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/TextController;->state:Landroidx/compose/foundation/text/TextState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextState;->getSelectable()Landroidx/compose/foundation/text/selection/Selectable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Landroidx/compose/foundation/text/TextController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p0, v0}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->unsubscribe(Landroidx/compose/foundation/text/selection/Selectable;)V

    :goto_0
    return-void
.end method

.method public onRemembered()V
    .locals 7

    iget-object v0, p0, Landroidx/compose/foundation/text/TextController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/TextController;->getState()Landroidx/compose/foundation/text/TextState;

    move-result-object v1

    new-instance v2, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;

    invoke-virtual {p0}, Landroidx/compose/foundation/text/TextController;->getState()Landroidx/compose/foundation/text/TextState;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/TextState;->getSelectableId()J

    move-result-wide v3

    new-instance v5, Landroidx/compose/foundation/text/TextController$onRemembered$1$1;

    invoke-direct {v5, p0}, Landroidx/compose/foundation/text/TextController$onRemembered$1$1;-><init>(Landroidx/compose/foundation/text/TextController;)V

    new-instance v6, Landroidx/compose/foundation/text/TextController$onRemembered$1$2;

    invoke-direct {v6, p0}, Landroidx/compose/foundation/text/TextController$onRemembered$1$2;-><init>(Landroidx/compose/foundation/text/TextController;)V

    invoke-direct {v2, v3, v4, v5, v6}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;-><init>(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v0, v2}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->subscribe(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroidx/compose/foundation/text/TextState;->setSelectable(Landroidx/compose/foundation/text/selection/Selectable;)V

    :goto_0
    return-void
.end method

.method public final setLongPressDragObserver(Landroidx/compose/foundation/text/TextDragObserver;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text/TextDragObserver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/foundation/text/TextController;->longPressDragObserver:Landroidx/compose/foundation/text/TextDragObserver;

    return-void
.end method

.method public final update(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V
    .locals 4
    .param p1    # Landroidx/compose/foundation/text/selection/SelectionRegistrar;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/text/TextController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/foundation/text/TouchMode_androidKt;->isInTouchMode()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/text/TextController$update$1;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/text/TextController$update$1;-><init>(Landroidx/compose/foundation/text/TextController;Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/TextController;->setLongPressDragObserver(Landroidx/compose/foundation/text/TextDragObserver;)V

    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    invoke-virtual {p0}, Landroidx/compose/foundation/text/TextController;->getLongPressDragObserver()Landroidx/compose/foundation/text/TextDragObserver;

    move-result-object v0

    new-instance v2, Landroidx/compose/foundation/text/TextController$update$2;

    invoke-direct {v2, p0, v1}, Landroidx/compose/foundation/text/TextController$update$2;-><init>(Landroidx/compose/foundation/text/TextController;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0, v2}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/TextController$update$mouseSelectionObserver$1;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/text/TextController$update$mouseSelectionObserver$1;-><init>(Landroidx/compose/foundation/text/TextController;Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    new-instance v2, Landroidx/compose/foundation/text/TextController$update$3;

    invoke-direct {v2, v0, v1}, Landroidx/compose/foundation/text/TextController$update$3;-><init>(Landroidx/compose/foundation/text/TextController$update$mouseSelectionObserver$1;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0, v2}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {}, Landroidx/compose/foundation/text/TextPointerIcon_androidKt;->getTextPointerIcon()Landroidx/compose/ui/input/pointer/PointerIcon;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v0, v2, v3, v1}, Landroidx/compose/ui/input/pointer/PointerIconKt;->pointerHoverIcon$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    :goto_0
    iput-object p1, p0, Landroidx/compose/foundation/text/TextController;->selectionModifiers:Landroidx/compose/ui/Modifier;

    return-void
.end method
