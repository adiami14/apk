.class public interface abstract Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;",
        "",
        "onPostMeasure",
        "",
        "result",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;",
        "placeablesProvider",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onPostMeasure(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;)V
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
