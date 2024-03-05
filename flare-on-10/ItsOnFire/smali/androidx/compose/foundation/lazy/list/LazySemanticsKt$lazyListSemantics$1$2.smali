.class final Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "x",
        "",
        "y",
        "invoke",
        "(FF)Ljava/lang/Boolean;"
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

.field public final synthetic $state:Landroidx/compose/foundation/lazy/LazyListState;


# direct methods
.method public constructor <init>(ZLj/u0;Landroidx/compose/foundation/lazy/LazyListState;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;->$isVertical:Z

    iput-object p2, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;->$coroutineScope:Lj/u0;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(FF)Ljava/lang/Boolean;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;->$isVertical:Z

    if-eqz v0, :cond_0

    move p1, p2

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;->$coroutineScope:Lj/u0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2$1;

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p1, p2}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;FLkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2;->invoke(FF)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
