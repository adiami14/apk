.class public final Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0002\u001aE\u0010\u0005\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u0007*\u0008\u0012\u0004\u0012\u0002H\u00070\u00082\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000bH\u0082\u0008\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0002\u00a2\u0006\u0002\u0010\u000c\u001aE\u0010\r\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u0007*\u0008\u0012\u0004\u0012\u0002H\u00070\u00082\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000bH\u0082\u0008\u0082\u0002\u0008\n\u0006\u0008\u0001\u0012\u0002\u0010\u0002\u00a2\u0006\u0002\u0010\u000c\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0002\u001a\u000c\u0010\u000f\u001a\u00020\u0010*\u00020\u0004H\u0002\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0016"
    }
    d2 = {
        "InvalidFocusDirection",
        "",
        "NoActiveChild",
        "backwardFocusSearch",
        "Landroidx/compose/ui/node/ModifiedFocusNode;",
        "forEachItemAfter",
        "",
        "T",
        "",
        "item",
        "action",
        "Lkotlin/Function1;",
        "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "forEachItemBefore",
        "forwardFocusSearch",
        "isRoot",
        "",
        "oneDimensionalFocusSearch",
        "direction",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "oneDimensionalFocusSearch-Mxy_nc0",
        "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Landroidx/compose/ui/node/ModifiedFocusNode;",
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


# static fields
.field private static final InvalidFocusDirection:Ljava/lang/String; = "This function should only be used for 1-D focus search"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final NoActiveChild:Ljava/lang/String; = "ActiveParent must have a focusedChild"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;
    .locals 8

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-string v2, "ActiveParent must have a focusedChild"

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {p0, v4}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/ModifiedFocusNode;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v3

    :goto_0
    return-object v3

    :pswitch_1
    invoke-virtual {p0, v4}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/ModifiedFocusNode;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object p0, v0

    :goto_1
    return-object p0

    :pswitch_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusedChild()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v1, v1, v6

    packed-switch v1, :pswitch_data_1

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_4
    invoke-virtual {p0, v5}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_7

    :goto_2
    add-int/lit8 v2, v1, -0x1

    if-eqz v5, :cond_4

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/node/ModifiedFocusNode;

    invoke-static {v6}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    return-object v6

    :cond_4
    :goto_3
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v5, v4

    :cond_5
    if-gez v2, :cond_6

    goto :goto_4

    :cond_6
    move v1, v2

    goto :goto_2

    :cond_7
    :goto_4
    return-object v3

    :pswitch_5
    invoke-static {v0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v1

    if-nez v1, :cond_d

    invoke-virtual {p0, v5}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_c

    :goto_5
    add-int/lit8 v2, v1, -0x1

    if-eqz v5, :cond_9

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/node/ModifiedFocusNode;

    invoke-static {v6}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v6

    if-nez v6, :cond_8

    goto :goto_6

    :cond_8
    return-object v6

    :cond_9
    :goto_6
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    move v5, v4

    :cond_a
    if-gez v2, :cond_b

    goto :goto_7

    :cond_b
    move v1, v2

    goto :goto_5

    :cond_c
    :goto_7
    return-object v3

    :cond_d
    return-object v1

    :pswitch_6
    invoke-static {v0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    if-nez p0, :cond_e

    goto :goto_8

    :cond_e
    move-object v0, p0

    :goto_8
    return-object v0

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_7
    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusedChild()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v1, v1, v6

    packed-switch v1, :pswitch_data_2

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_8
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_9
    invoke-virtual {p0, v5}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_14

    :goto_9
    add-int/lit8 v6, v2, -0x1

    if-eqz v5, :cond_11

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/node/ModifiedFocusNode;

    invoke-static {v7}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v7

    if-nez v7, :cond_10

    goto :goto_a

    :cond_10
    return-object v7

    :cond_11
    :goto_a
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    move v5, v4

    :cond_12
    if-gez v6, :cond_13

    goto :goto_b

    :cond_13
    move v2, v6

    goto :goto_9

    :cond_14
    :goto_b
    invoke-static {p0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->isRoot(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v0

    if-eqz v0, :cond_15

    move-object p0, v3

    :cond_15
    return-object p0

    :pswitch_a
    invoke-static {v0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v1

    if-nez v1, :cond_1c

    invoke-virtual {p0, v5}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_1a

    :goto_c
    add-int/lit8 v6, v2, -0x1

    if-eqz v5, :cond_17

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/node/ModifiedFocusNode;

    invoke-static {v7}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v7

    if-nez v7, :cond_16

    goto :goto_d

    :cond_16
    return-object v7

    :cond_17
    :goto_d
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    move v5, v4

    :cond_18
    if-gez v6, :cond_19

    goto :goto_e

    :cond_19
    move v2, v6

    goto :goto_c

    :cond_1a
    :goto_e
    invoke-static {p0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->isRoot(Landroidx/compose/ui/node/ModifiedFocusNode;)Z

    move-result v0

    if-eqz v0, :cond_1b

    move-object p0, v3

    :cond_1b
    return-object p0

    :cond_1c
    return-object v1

    :pswitch_b
    invoke-static {v0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    if-nez p0, :cond_1d

    goto :goto_f

    :cond_1d
    move-object v0, p0

    :goto_f
    return-object v0

    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method

.method private static final forEachItemAfter(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;TT;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    add-int/lit8 v3, v1, 0x1

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static final forEachItemBefore(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;TT;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_3

    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-eqz v1, :cond_0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    move v1, v0

    :cond_1
    if-gez v2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private static final forwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;
    .locals 7

    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    return-object p0

    :pswitch_1
    invoke-virtual {p0, v2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v2, v0, :cond_1

    add-int/lit8 v3, v2, 0x1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/node/ModifiedFocusNode;

    invoke-static {v2}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->forwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v2

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    return-object v2

    :cond_1
    return-object v1

    :pswitch_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/ModifiedFocusNode;->getFocusedChild()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->forwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v3

    if-nez v3, :cond_6

    invoke-virtual {p0, v2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    move v4, v2

    :goto_1
    if-ge v2, v3, :cond_5

    add-int/lit8 v5, v2, 0x1

    if-eqz v4, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/node/ModifiedFocusNode;

    invoke-static {v6}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->forwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v6

    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    return-object v6

    :cond_3
    :goto_2
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v4, 0x1

    :cond_4
    move v2, v5

    goto :goto_1

    :cond_5
    return-object v1

    :cond_6
    return-object v3

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "ActiveParent must have a focusedChild"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final isRoot(Landroidx/compose/ui/node/ModifiedFocusNode;)Z
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findParentFocusNode$ui_release()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final oneDimensionalFocusSearch-Mxy_nc0(Landroidx/compose/ui/node/ModifiedFocusNode;I)Landroidx/compose/ui/node/ModifiedFocusNode;
    .locals 2
    .param p0    # Landroidx/compose/ui/node/ModifiedFocusNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "$this$oneDimensionalFocusSearch"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getNext-dhqQ-8s()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->forwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getPrevious-dhqQ-8s()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/focus/FocusDirection;->equals-impl0(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Landroidx/compose/ui/focus/OneDimensionalFocusSearchKt;->backwardFocusSearch(Landroidx/compose/ui/node/ModifiedFocusNode;)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This function should only be used for 1-D focus search"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
