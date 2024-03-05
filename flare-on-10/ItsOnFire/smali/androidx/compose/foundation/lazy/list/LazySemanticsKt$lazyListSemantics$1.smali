.class final Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/list/LazySemanticsKt;->lazyListSemantics(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListState;Lj/u0;ZZ)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $coroutineScope:Lj/u0;

.field public final synthetic $isVertical:Z

.field public final synthetic $reverseScrolling:Z

.field public final synthetic $state:Landroidx/compose/foundation/lazy/LazyListState;

.field public final synthetic $stateOfItemsProvider:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZZLandroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListState;Lj/u0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Landroidx/compose/runtime/State<",
            "+",
            "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Lj/u0;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$reverseScrolling:Z

    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$isVertical:Z

    iput-object p3, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$stateOfItemsProvider:Landroidx/compose/runtime/State;

    iput-object p4, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iput-object p5, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$coroutineScope:Lj/u0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 5
    .param p1    # Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$stateOfItemsProvider:Landroidx/compose/runtime/State;

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$1;-><init>(Landroidx/compose/runtime/State;)V

    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->indexForKey(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Landroidx/compose/ui/semantics/ScrollAxisRange;

    new-instance v1, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-direct {v1, v2}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;)V

    new-instance v2, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iget-object v4, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$stateOfItemsProvider:Landroidx/compose/runtime/State;

    invoke-direct {v2, v3, v4}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/State;)V

    iget-boolean v3, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$reverseScrolling:Z

    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/semantics/ScrollAxisRange;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V

    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$isVertical:Z

    if-eqz v1, :cond_0

    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V

    :goto_0
    new-instance v0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;

    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$isVertical:Z

    iget-object v2, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$coroutineScope:Lj/u0;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;-><init>(ZLj/u0;Landroidx/compose/foundation/lazy/LazyListState;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v0, v2, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->scrollBy$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    new-instance v0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$3;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iget-object v4, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$coroutineScope:Lj/u0;

    invoke-direct {v0, v3, v4}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$3;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lj/u0;)V

    invoke-static {p1, v1, v0, v2, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->scrollToIndex$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    new-instance v0, Landroidx/compose/ui/semantics/CollectionInfo;

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->$isVertical:Z

    const/4 v1, -0x1

    if-eqz p0, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    invoke-direct {v0, v3, v2}, Landroidx/compose/ui/semantics/CollectionInfo;-><init>(II)V

    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V

    return-void
.end method
