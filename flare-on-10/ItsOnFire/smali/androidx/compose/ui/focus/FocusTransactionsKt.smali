.class public final Landroidx/compose/ui/focus/FocusTransactionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u000c\u0010\u0008\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\t\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\u000c\u0010\n\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0002H\u0002\u001a\u000c\u0010\r\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0002H\u0002\u001a\u000c\u0010\u000f\u001a\u00020\u0004*\u00020\u0002H\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "activateNode",
        "",
        "Landroidx/compose/ui/node/ModifiedFocusNode;",
        "captureFocus",
        "",
        "clearChildFocus",
        "clearFocus",
        "forcedClear",
        "deactivateNode",
        "freeFocus",
        "grantFocus",
        "grantFocusToChild",
        "childNode",
        "requestFocus",
        "requestFocusForChild",
        "requestFocusForOwner",
        "ui_release"
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
.method public static final activateNode(Landroidx/compose/ui/node/ModifiedFocusNode;)V
    .locals 2
    .param p0    # Landroidx/compose/ui/node/ModifiedFocusNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    :goto_0
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    :goto_1
    return-void
.end method

.method public static final captureFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)Z
    .locals 2
    .param p0    # Landroidx/compose/ui/node/ModifiedFocusNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const/4 v1, 0x0

    goto :goto_0

    :pswitch_1
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    :goto_0
    :pswitch_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static final clearChildFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)Z
    .locals 4

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusedChild()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus$default(Landroidx/compose/ui/node/ModifiedFocusNode;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v3}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusedChild(Landroidx/compose/ui/node/ModifiedFocusNode;)V

    move v1, v2

    :cond_0
    return v1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final clearFocus(Landroidx/compose/ui/node/ModifiedFocusNode;Z)Z
    .locals 3
    .param p0    # Landroidx/compose/ui/node/ModifiedFocusNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :pswitch_1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/compose/ui/focus/FocusStateImpl;->Deactivated:Landroidx/compose/ui/focus/FocusStateImpl;

    goto :goto_1

    :cond_0
    move p1, v1

    goto :goto_2

    :pswitch_2
    if-eqz p1, :cond_1

    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    goto :goto_2

    :goto_0
    :pswitch_3
    sget-object p1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    :goto_1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    :pswitch_4
    move p1, v2

    :cond_1
    :goto_2
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public static synthetic clearFocus$default(Landroidx/compose/ui/node/ModifiedFocusNode;ZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/node/ModifiedFocusNode;Z)Z

    move-result p0

    return p0
.end method

.method public static final deactivateNode(Landroidx/compose/ui/node/ModifiedFocusNode;)V
    .locals 3
    .param p0    # Landroidx/compose/ui/node/ModifiedFocusNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    :goto_0
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Deactivated:Landroidx/compose/ui/focus/FocusStateImpl;

    goto :goto_1

    :cond_1
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->DeactivatedParent:Landroidx/compose/ui/focus/FocusStateImpl;

    :goto_1
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getLayoutNode$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getOwner$ui_release()Landroidx/compose/ui/node/Owner;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusManager()Landroidx/compose/ui/focus/FocusManager;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v0, v1}, Landroidx/compose/ui/focus/FocusManager;->clearFocus(Z)V

    goto :goto_0

    :goto_2
    return-void
.end method

.method public static final freeFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)Z
    .locals 2
    .param p0    # Landroidx/compose/ui/node/ModifiedFocusNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const/4 v1, 0x0

    goto :goto_0

    :pswitch_1
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    :goto_0
    :pswitch_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static final grantFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Granting focus to a deactivated node."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    goto :goto_0

    :pswitch_2
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    :goto_0
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private static final grantFocusToChild(Landroidx/compose/ui/node/ModifiedFocusNode;Landroidx/compose/ui/node/ModifiedFocusNode;)Z
    .locals 0

    invoke-static {p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusedChild(Landroidx/compose/ui/node/ModifiedFocusNode;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final requestFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)V
    .locals 2
    .param p0    # Landroidx/compose/ui/node/ModifiedFocusNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findParentFocusNode$ui_release()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForChild(Landroidx/compose/ui/node/ModifiedFocusNode;Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    goto :goto_1

    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForOwner(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :pswitch_1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->sendOnFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    :cond_1
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final requestFocusForChild(Landroidx/compose/ui/node/ModifiedFocusNode;Landroidx/compose/ui/node/ModifiedFocusNode;)Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findParentFocusNode$ui_release()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForOwner(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    :goto_0
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForChild(Landroidx/compose/ui/node/ModifiedFocusNode;Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v0

    goto :goto_3

    :cond_0
    if-eqz v1, :cond_2

    invoke-static {v1, p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForChild(Landroidx/compose/ui/node/ModifiedFocusNode;Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :pswitch_1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusedChild()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v1

    if-nez v1, :cond_1

    :goto_1
    goto :goto_2

    :cond_1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :pswitch_3
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->activateNode(Landroidx/compose/ui/node/ModifiedFocusNode;)V

    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForChild(Landroidx/compose/ui/node/ModifiedFocusNode;Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v0

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->deactivateNode(Landroidx/compose/ui/node/ModifiedFocusNode;)V

    goto :goto_3

    :pswitch_4
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    :goto_2
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocusToChild(Landroidx/compose/ui/node/ModifiedFocusNode;Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v0

    :cond_2
    :goto_3
    :pswitch_5
    return v0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Non child node cannot request focus."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final requestFocusForOwner(Landroidx/compose/ui/node/ModifiedFocusNode;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getLayoutNode$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getOwner$ui_release()Landroidx/compose/ui/node/Owner;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/node/Owner;->requestFocus()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Owner not initialized."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
