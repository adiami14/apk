.class public final Landroidx/compose/foundation/DarkThemeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "isSystemInDarkTheme",
        "",
        "(Landroidx/compose/runtime/Composer;I)Z",
        "foundation_release"
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
.method public static final isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z
    .locals 0
    .param p0    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ReadOnlyComposable;
    .end annotation

    const/4 p1, 0x0

    invoke-static {p0, p1}, Landroidx/compose/foundation/DarkTheme_androidKt;->_isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result p0

    return p0
.end method
