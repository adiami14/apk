.class final Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
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
.field public final synthetic $$dirty:I

.field public final synthetic $horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field public final synthetic $nColumns:I

.field public final synthetic $scope:Landroidx/compose/foundation/lazy/LazyGridScopeImpl;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/LazyGridScopeImpl;ILandroidx/compose/foundation/layout/Arrangement$Horizontal;I)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->$scope:Landroidx/compose/foundation/lazy/LazyGridScopeImpl;

    iput p2, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->$nColumns:I

    iput-object p3, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iput p4, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->$$dirty:I

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/lazy/LazyItemScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    const-string v0, "$this$items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x70

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x2db

    xor-int/lit16 p4, p4, 0x92

    if-nez p4, :cond_5

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_4

    :cond_5
    :goto_3
    iget-object p4, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->$scope:Landroidx/compose/foundation/lazy/LazyGridScopeImpl;

    invoke-virtual {p4, p2, p1}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->contentFor(ILandroidx/compose/foundation/lazy/LazyItemScope;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    iget p2, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->$nColumns:I

    iget-object p4, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iget p0, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;->$$dirty:I

    and-int/lit8 v0, p0, 0xe

    or-int/lit16 v0, v0, 0x200

    shr-int/lit8 p0, p0, 0xc

    and-int/lit8 p0, p0, 0x70

    or-int/2addr p0, v0

    invoke-static {p2, p4, p1, p3, p0}, Landroidx/compose/foundation/lazy/LazyGridKt;->access$ItemRow(ILandroidx/compose/foundation/layout/Arrangement$Horizontal;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    :cond_6
    :goto_4
    return-void
.end method
