.class final Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/runtime/DisposableEffectScope;",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

.field public final synthetic $view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1;->$bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1;->$view:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 1
    .param p1    # Landroidx/compose/runtime/DisposableEffectScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1;->$bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1;->$view:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;->setView$foundation_release(Landroid/view/View;)V

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1;->$bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    new-instance p1, Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1$invoke$$inlined$onDispose$1;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1$invoke$$inlined$onDispose$1;-><init>(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1;->invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p0

    return-object p0
.end method
