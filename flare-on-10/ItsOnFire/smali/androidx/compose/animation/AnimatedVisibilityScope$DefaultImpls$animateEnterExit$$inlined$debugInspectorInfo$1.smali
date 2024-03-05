.class public final Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls;->animateEnterExit(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n\u00a8\u0006\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "",
        "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic $enter$inlined:Landroidx/compose/animation/EnterTransition;

.field public final synthetic $exit$inlined:Landroidx/compose/animation/ExitTransition;

.field public final synthetic $label$inlined:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1;->$enter$inlined:Landroidx/compose/animation/EnterTransition;

    iput-object p2, p0, Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1;->$exit$inlined:Landroidx/compose/animation/ExitTransition;

    iput-object p3, p0, Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1;->$label$inlined:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/InspectorInfo;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1;->invoke(Landroidx/compose/ui/platform/InspectorInfo;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animateEnterExit"

    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1;->$enter$inlined:Landroidx/compose/animation/EnterTransition;

    const-string v2, "enter"

    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1;->$exit$inlined:Landroidx/compose/animation/ExitTransition;

    const-string v2, "exit"

    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object p1

    iget-object p0, p0, Landroidx/compose/animation/AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1;->$label$inlined:Ljava/lang/String;

    const-string v0, "label"

    invoke-virtual {p1, v0, p0}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
