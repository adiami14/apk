.class final Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/LazyGridKt;->FixedLazyGrid(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
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

.field public final synthetic $content:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/foundation/lazy/LazyGridScope;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field public final synthetic $nColumns:I


# direct methods
.method public constructor <init>(ILkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/Arrangement$Horizontal;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyGridScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "I)V"
        }
    .end annotation

    iput p1, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$nColumns:I

    iput-object p2, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$content:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iput p4, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$$dirty:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
    .locals 9
    .param p1    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;

    iget v1, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$nColumns:I

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;-><init>(I)V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$content:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getHasCustomSpans$foundation_release()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getTotalSize()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getTotalSize()I

    move-result v1

    sub-int/2addr v1, v2

    iget v3, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$nColumns:I

    div-int/2addr v1, v3

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl;->getTotalSize()I

    move-result v1

    :goto_0
    move v4, v1

    const/4 v5, 0x0

    const v1, -0x3abe28e0

    new-instance v3, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;

    iget v6, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$nColumns:I

    iget-object v7, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iget p0, p0, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1;->$$dirty:I

    invoke-direct {v3, v0, v6, v7, p0}, Landroidx/compose/foundation/lazy/LazyGridKt$FixedLazyGrid$1$1$1;-><init>(Landroidx/compose/foundation/lazy/LazyGridScopeImpl;ILandroidx/compose/foundation/layout/Arrangement$Horizontal;I)V

    invoke-static {v1, v2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/lazy/LazyListScope$DefaultImpls;->items$default(Landroidx/compose/foundation/lazy/LazyListScope;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    return-void
.end method
