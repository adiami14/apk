.class public final Landroidx/compose/material/Strings_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0006"
    }
    d2 = {
        "getString",
        "",
        "string",
        "Landroidx/compose/material/Strings;",
        "getString-4foXLRw",
        "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "material_release"
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
.method public static final getString-4foXLRw(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 2
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const p2, -0x32667688    # -3.219904E8f

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p2

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p2

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget-object v0, Landroidx/compose/material/Strings;->Companion:Landroidx/compose/material/Strings$Companion;

    invoke-virtual {v0}, Landroidx/compose/material/Strings$Companion;->getNavigationMenu-UdPEhr4()I

    move-result v1

    invoke-static {p0, v1}, Landroidx/compose/material/Strings;->equals-impl0(II)Z

    move-result v1

    if-eqz v1, :cond_0

    sget p0, Landroidx/compose/ui/R$string;->navigation_menu:I

    invoke-virtual {p2, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p2, "resources.getString(R.string.navigation_menu)"

    :goto_0
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/material/Strings$Companion;->getCloseDrawer-UdPEhr4()I

    move-result v1

    invoke-static {p0, v1}, Landroidx/compose/material/Strings;->equals-impl0(II)Z

    move-result v1

    if-eqz v1, :cond_1

    sget p0, Landroidx/compose/ui/R$string;->close_drawer:I

    invoke-virtual {p2, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p2, "resources.getString(R.string.close_drawer)"

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/compose/material/Strings$Companion;->getCloseSheet-UdPEhr4()I

    move-result v1

    invoke-static {p0, v1}, Landroidx/compose/material/Strings;->equals-impl0(II)Z

    move-result v1

    if-eqz v1, :cond_2

    sget p0, Landroidx/compose/ui/R$string;->close_sheet:I

    invoke-virtual {p2, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p2, "resources.getString(R.string.close_sheet)"

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/material/Strings$Companion;->getDefaultErrorMessage-UdPEhr4()I

    move-result v1

    invoke-static {p0, v1}, Landroidx/compose/material/Strings;->equals-impl0(II)Z

    move-result v1

    if-eqz v1, :cond_3

    sget p0, Landroidx/compose/ui/R$string;->default_error_message:I

    invoke-virtual {p2, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p2, "resources.getString(R.st\u2026ng.default_error_message)"

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/material/Strings$Companion;->getExposedDropdownMenu-UdPEhr4()I

    move-result v0

    invoke-static {p0, v0}, Landroidx/compose/material/Strings;->equals-impl0(II)Z

    move-result p0

    if-eqz p0, :cond_4

    sget p0, Landroidx/compose/ui/R$string;->dropdown_menu:I

    invoke-virtual {p2, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p2, "resources.getString(R.string.dropdown_menu)"

    goto :goto_0

    :cond_4
    const-string p0, ""

    :goto_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object p0
.end method
