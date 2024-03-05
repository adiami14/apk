.class public final Landroidx/compose/ui/focus/FocusManagerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "updateProperties",
        "",
        "Landroidx/compose/ui/node/ModifiedFocusNode;",
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
.method public static final synthetic access$updateProperties(Landroidx/compose/ui/node/ModifiedFocusNode;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusManagerKt;->updateProperties(Landroidx/compose/ui/node/ModifiedFocusNode;)V

    return-void
.end method

.method private static final updateProperties(Landroidx/compose/ui/node/ModifiedFocusNode;)V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getModifier()Landroidx/compose/ui/Modifier$Element;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/FocusModifier;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusModifier;->getModifierLocalReadScope()Landroidx/compose/ui/modifier/ModifierLocalReadScope;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/focus/FocusPropertiesKt;->getModifierLocalFocusProperties()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/modifier/ModifierLocalReadScope;->getCurrent(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/FocusProperties;

    invoke-static {p0, v0}, Landroidx/compose/ui/focus/FocusPropertiesKt;->setUpdatedProperties(Landroidx/compose/ui/node/ModifiedFocusNode;Landroidx/compose/ui/focus/FocusProperties;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->focusableChildren(Z)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    add-int/lit8 v2, v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/ModifiedFocusNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusManagerKt;->updateProperties(Landroidx/compose/ui/node/ModifiedFocusNode;)V

    move v0, v2

    goto :goto_0

    :cond_0
    return-void
.end method
