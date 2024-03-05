.class public final Landroidx/compose/ui/focus/FocusNodeUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\tH\u0000\u001a&\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2\u0006\u0010\u0008\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "FocusTag",
        "",
        "findFocusableChildren",
        "",
        "Landroidx/compose/ui/node/LayoutNode;",
        "focusableChildren",
        "",
        "Landroidx/compose/ui/node/ModifiedFocusNode;",
        "excludeDeactivated",
        "",
        "searchChildrenForFocusNode",
        "queue",
        "Landroidx/compose/runtime/collection/MutableVector;",
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
.field public static final FocusTag:Ljava/lang/String; = "Compose Focus"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static final findFocusableChildren(Landroidx/compose/ui/node/LayoutNode;Ljava/util/List;Z)V
    .locals 3
    .param p0    # Landroidx/compose/ui/node/LayoutNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/node/LayoutNode;",
            "Ljava/util/List<",
            "Landroidx/compose/ui/node/ModifiedFocusNode;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "focusableChildren"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getOuterLayoutNodeWrapper$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findNextFocusWrapper(Z)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getChildren$ui_release()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v0, v1, :cond_1

    add-int/lit8 v2, v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    invoke-static {v0, p1, p2}, Landroidx/compose/ui/focus/FocusNodeUtilsKt;->findFocusableChildren(Landroidx/compose/ui/node/LayoutNode;Ljava/util/List;Z)V

    move v0, v2

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static final searchChildrenForFocusNode(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/ModifiedFocusNode;
    .locals 5
    .param p0    # Landroidx/compose/ui/node/LayoutNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/runtime/collection/MutableVector;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/node/LayoutNode;",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;Z)",
            "Landroidx/compose/ui/node/ModifiedFocusNode;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->get_children$ui_release()Landroidx/compose/runtime/collection/MutableVector;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    move-result-object p0

    move v2, v1

    :cond_0
    aget-object v3, p0, v2

    check-cast v3, Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getOuterLayoutNodeWrapper$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v4

    invoke-virtual {v4, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findNextFocusWrapper(Z)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v4

    if-eqz v4, :cond_1

    return-object v4

    :cond_1
    invoke-virtual {p1, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v0, :cond_0

    :cond_2
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-virtual {p1, v1}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/node/LayoutNode;

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/FocusNodeUtilsKt;->searchChildrenForFocusNode(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    if-eqz p0, :cond_2

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic searchChildrenForFocusNode$default(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/collection/MutableVector;ZILjava/lang/Object;)Landroidx/compose/ui/node/ModifiedFocusNode;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/16 p1, 0x10

    new-instance p3, Landroidx/compose/runtime/collection/MutableVector;

    new-array p1, p1, [Landroidx/compose/ui/node/LayoutNode;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    move-object p1, p3

    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/FocusNodeUtilsKt;->searchChildrenForFocusNode(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    return-object p0
.end method
