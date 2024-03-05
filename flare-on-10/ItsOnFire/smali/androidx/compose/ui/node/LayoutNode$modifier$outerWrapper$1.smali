.class final Landroidx/compose/ui/node/LayoutNode$modifier$outerWrapper$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/node/LayoutNode;->setModifier(Landroidx/compose/ui/Modifier;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/ui/Modifier$Element;",
        "Landroidx/compose/ui/node/LayoutNodeWrapper;",
        "Landroidx/compose/ui/node/LayoutNodeWrapper;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/node/LayoutNodeWrapper;",
        "mod",
        "Landroidx/compose/ui/Modifier$Element;",
        "toWrap",
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
.field public final synthetic this$0:Landroidx/compose/ui/node/LayoutNode;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/node/LayoutNode$modifier$outerWrapper$1;->this$0:Landroidx/compose/ui/node/LayoutNode;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/LayoutNodeWrapper;
    .locals 3
    .param p1    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/node/LayoutNodeWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "mod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toWrap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroidx/compose/ui/layout/RemeasurementModifier;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/RemeasurementModifier;

    iget-object v1, p0, Landroidx/compose/ui/node/LayoutNode$modifier$outerWrapper$1;->this$0:Landroidx/compose/ui/node/LayoutNode;

    invoke-interface {v0, v1}, Landroidx/compose/ui/layout/RemeasurementModifier;->onRemeasurementAvailable(Landroidx/compose/ui/layout/Remeasurement;)V

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/draw/DrawModifier;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/compose/ui/node/DrawEntity;

    move-object v1, p1

    check-cast v1, Landroidx/compose/ui/draw/DrawModifier;

    invoke-direct {v0, p2, v1}, Landroidx/compose/ui/node/DrawEntity;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/draw/DrawModifier;)V

    invoke-virtual {p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getDrawEntityHead()Landroidx/compose/ui/node/DrawEntity;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/node/DrawEntity;->setNext(Landroidx/compose/ui/node/DrawEntity;)V

    invoke-virtual {p2, v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->setDrawEntityHead(Landroidx/compose/ui/node/DrawEntity;)V

    invoke-virtual {v0}, Landroidx/compose/ui/node/DrawEntity;->onInitialize()V

    :cond_1
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode$modifier$outerWrapper$1;->this$0:Landroidx/compose/ui/node/LayoutNode;

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/node/LayoutNode;->access$reuseLayoutNodeWrapper(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    move-result-object p0

    if-nez p0, :cond_1f

    instance-of p0, p1, Landroidx/compose/ui/modifier/ModifierLocalProvider;

    const/4 v0, 0x1

    if-eqz p0, :cond_2

    new-instance p0, Landroidx/compose/ui/node/ModifierLocalProviderNode;

    move-object v1, p1

    check-cast v1, Landroidx/compose/ui/modifier/ModifierLocalProvider;

    invoke-direct {p0, p2, v1}, Landroidx/compose/ui/node/ModifierLocalProviderNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/modifier/ModifierLocalProvider;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v1

    if-eq p2, v1, :cond_3

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {v1, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    goto :goto_0

    :cond_2
    move-object p0, p2

    :cond_3
    :goto_0
    instance-of v1, p1, Landroidx/compose/ui/modifier/ModifierLocalConsumer;

    if-eqz v1, :cond_5

    new-instance v1, Landroidx/compose/ui/node/ModifierLocalConsumerNode;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/modifier/ModifierLocalConsumer;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/ModifierLocalConsumerNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/modifier/ModifierLocalConsumer;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_4

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_4
    move-object p0, v1

    :cond_5
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusModifier;

    if-eqz v1, :cond_7

    new-instance v1, Landroidx/compose/ui/node/ModifiedFocusNode;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/focus/FocusModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/ModifiedFocusNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_6

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_6
    move-object p0, v1

    :cond_7
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusEventModifier;

    if-eqz v1, :cond_9

    new-instance v1, Landroidx/compose/ui/node/ModifiedFocusEventNode;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/focus/FocusEventModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/ModifiedFocusEventNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusEventModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_8

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_8
    move-object p0, v1

    :cond_9
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusRequesterModifier;

    if-eqz v1, :cond_b

    new-instance v1, Landroidx/compose/ui/node/ModifiedFocusRequesterNode;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/focus/FocusRequesterModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/ModifiedFocusRequesterNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusRequesterModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_a
    move-object p0, v1

    :cond_b
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusOrderModifier;

    if-eqz v1, :cond_d

    new-instance v1, Landroidx/compose/ui/node/ModifiedFocusOrderNode;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/focus/FocusOrderModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/ModifiedFocusOrderNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusOrderModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_c

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_c
    move-object p0, v1

    :cond_d
    instance-of v1, p1, Landroidx/compose/ui/input/key/KeyInputModifier;

    if-eqz v1, :cond_f

    new-instance v1, Landroidx/compose/ui/node/ModifiedKeyInputNode;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/input/key/KeyInputModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/ModifiedKeyInputNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/key/KeyInputModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_e

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_e
    move-object p0, v1

    :cond_f
    instance-of v1, p1, Landroidx/compose/ui/input/pointer/PointerInputModifier;

    if-eqz v1, :cond_11

    new-instance v1, Landroidx/compose/ui/node/PointerInputDelegatingWrapper;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/PointerInputDelegatingWrapper;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/pointer/PointerInputModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_10

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_10
    move-object p0, v1

    :cond_11
    instance-of v1, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    if-eqz v1, :cond_13

    new-instance v1, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_12

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_12
    move-object p0, v1

    :cond_13
    instance-of v1, p1, Landroidx/compose/ui/layout/LayoutModifier;

    if-eqz v1, :cond_15

    new-instance v1, Landroidx/compose/ui/node/ModifiedLayoutNode;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/layout/LayoutModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/ModifiedLayoutNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/LayoutModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_14

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_14
    move-object p0, v1

    :cond_15
    instance-of v1, p1, Landroidx/compose/ui/layout/ParentDataModifier;

    if-eqz v1, :cond_17

    new-instance v1, Landroidx/compose/ui/node/ModifiedParentDataNode;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/layout/ParentDataModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/ModifiedParentDataNode;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/ParentDataModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_16

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_16
    move-object p0, v1

    :cond_17
    instance-of v1, p1, Landroidx/compose/ui/semantics/SemanticsModifier;

    if-eqz v1, :cond_19

    new-instance v1, Landroidx/compose/ui/semantics/SemanticsWrapper;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/semantics/SemanticsModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/semantics/SemanticsWrapper;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/semantics/SemanticsModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_18

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_18
    move-object p0, v1

    :cond_19
    instance-of v1, p1, Landroidx/compose/ui/layout/OnRemeasuredModifier;

    if-eqz v1, :cond_1b

    new-instance v1, Landroidx/compose/ui/node/RemeasureModifierWrapper;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/layout/OnRemeasuredModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/RemeasureModifierWrapper;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnRemeasuredModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_1a

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_1a
    move-object p0, v1

    :cond_1b
    instance-of v1, p1, Landroidx/compose/ui/layout/OnPlacedModifier;

    if-eqz v1, :cond_1d

    new-instance v1, Landroidx/compose/ui/node/OnPlacedModifierWrapper;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/layout/OnPlacedModifier;

    invoke-direct {v1, p0, v2}, Landroidx/compose/ui/node/OnPlacedModifierWrapper;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnPlacedModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_1c

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_1c
    move-object p0, v1

    :cond_1d
    instance-of v1, p1, Landroidx/compose/ui/layout/OnGloballyPositionedModifier;

    if-eqz v1, :cond_1f

    new-instance v1, Landroidx/compose/ui/node/OnGloballyPositionedModifierWrapper;

    check-cast p1, Landroidx/compose/ui/layout/OnGloballyPositionedModifier;

    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/node/OnGloballyPositionedModifierWrapper;-><init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnGloballyPositionedModifier;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->onInitialize()V

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-eq p2, p0, :cond_1e

    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setChained(Z)V

    :cond_1e
    move-object p0, v1

    :cond_1f
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/Modifier$Element;

    check-cast p2, Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/LayoutNode$modifier$outerWrapper$1;->invoke(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    return-object p0
.end method
