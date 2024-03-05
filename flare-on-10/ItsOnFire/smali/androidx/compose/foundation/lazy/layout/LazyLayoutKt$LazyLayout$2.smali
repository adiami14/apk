.class final Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
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
.field public final synthetic $itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

.field public final synthetic $measurePolicy:Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;

.field public final synthetic $state:Landroidx/compose/foundation/lazy/layout/LazyLayoutState;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/foundation/lazy/layout/LazyLayoutState;Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$state:Landroidx/compose/foundation/lazy/layout/LazyLayoutState;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$measurePolicy:Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    check-cast p2, Landroidx/compose/ui/unit/Constraints;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p0

    return-object p0
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 3
    .param p1    # Landroidx/compose/ui/layout/SubcomposeMeasureScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "$this$SubcomposeLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;->onBeforeMeasure-0kLqBqw(Landroidx/compose/ui/unit/Density;J)V

    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$state:Landroidx/compose/foundation/lazy/layout/LazyLayoutState;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->getItemsProvider$foundation_release()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    invoke-direct {v0, v1, v2, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$measurePolicy:Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;

    invoke-interface {v1, p1, v0, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;J)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;

    move-result-object p1

    iget-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$state:Landroidx/compose/foundation/lazy/layout/LazyLayoutState;

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->getOnPostMeasureListener$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;->onPostMeasure(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;)V

    :goto_0
    iget-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$state:Landroidx/compose/foundation/lazy/layout/LazyLayoutState;

    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->getLayoutInfoState$foundation_release()Landroidx/compose/runtime/MutableState;

    move-result-object p2

    invoke-interface {p2, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$2;->$state:Landroidx/compose/foundation/lazy/layout/LazyLayoutState;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->setLayoutInfoNonObservable$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;)V

    return-object p1
.end method
