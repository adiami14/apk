.class final Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Float;",
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
.field public final synthetic $reverseDirection:Z

.field public final synthetic $state:Landroidx/compose/foundation/gestures/ScrollableState;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/ScrollableState;Z)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2$1;->$state:Landroidx/compose/foundation/gestures/ScrollableState;

    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2$1;->$reverseDirection:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2$1;->invoke(F)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2$1;->$state:Landroidx/compose/foundation/gestures/ScrollableState;

    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2$1;->$reverseDirection:Z

    invoke-static {p1, p0}, Landroidx/compose/foundation/gestures/ScrollableKt$scrollable$2;->access$invoke$reverseIfNeeded(FZ)F

    move-result p0

    invoke-interface {v0, p0}, Landroidx/compose/foundation/gestures/ScrollableState;->dispatchRawDelta(F)F

    return-void
.end method
