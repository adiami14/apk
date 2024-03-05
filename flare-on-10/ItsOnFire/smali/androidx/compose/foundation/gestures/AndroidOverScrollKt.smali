.class public final Landroidx/compose/foundation/gestures/AndroidOverScrollKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0001\u001a\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\u00a8\u0006\t"
    }
    d2 = {
        "NoOpOverscrollController",
        "androidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1",
        "Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;",
        "rememberOverScrollController",
        "Landroidx/compose/foundation/gestures/OverScrollController;",
        "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/OverScrollController;",
        "overScroll",
        "Landroidx/compose/ui/Modifier;",
        "overScrollController",
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


# static fields
.field private static final NoOpOverscrollController:Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/AndroidOverScrollKt;->NoOpOverscrollController:Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;

    return-void
.end method

.method public static final overScroll(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/OverScrollController;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/gestures/OverScrollController;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overScrollController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/compose/foundation/gestures/AndroidOverScrollKt$overScroll$1;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/gestures/AndroidOverScrollKt$overScroll$1;-><init>(Landroidx/compose/foundation/gestures/OverScrollController;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithContent(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final rememberOverScrollController(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/OverScrollController;
    .locals 3
    .param p0    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const p1, -0x62e10881

    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {}, Landroidx/compose/foundation/gestures/OverScrollConfigurationKt;->getLocalOverScrollConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    const v1, -0x384098

    invoke-interface {p0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_0

    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_0
    if-eqz v0, :cond_1

    new-instance v1, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;

    invoke-direct {v1, p1, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;-><init>(Landroid/content/Context;Landroidx/compose/foundation/gestures/OverScrollConfiguration;)V

    move-object v2, v1

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/compose/foundation/gestures/AndroidOverScrollKt;->NoOpOverscrollController:Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;

    move-object v2, p1

    :goto_0
    invoke-interface {p0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v2, Landroidx/compose/foundation/gestures/OverScrollController;

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object v2
.end method
