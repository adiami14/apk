.class final Landroidx/compose/foundation/gestures/DragLogic$processDragStop$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DragLogic;->processDragStop(Lj/u0;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.gestures.DragLogic"
    f = "Draggable.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x18a,
        0x18d
    }
    m = "processDragStop"
    n = {
        "this",
        "$this$processDragStop",
        "event"
    }
    s = {
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field public L$0:Ljava/lang/Object;

.field public L$1:Ljava/lang/Object;

.field public L$2:Ljava/lang/Object;

.field public label:I

.field public synthetic result:Ljava/lang/Object;

.field public final synthetic this$0:Landroidx/compose/foundation/gestures/DragLogic;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/DragLogic;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/DragLogic;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/foundation/gestures/DragLogic$processDragStop$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragLogic$processDragStop$1;->this$0:Landroidx/compose/foundation/gestures/DragLogic;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragLogic$processDragStop$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/foundation/gestures/DragLogic$processDragStop$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/foundation/gestures/DragLogic$processDragStop$1;->label:I

    iget-object p1, p0, Landroidx/compose/foundation/gestures/DragLogic$processDragStop$1;->this$0:Landroidx/compose/foundation/gestures/DragLogic;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Landroidx/compose/foundation/gestures/DragLogic;->processDragStop(Lj/u0;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
