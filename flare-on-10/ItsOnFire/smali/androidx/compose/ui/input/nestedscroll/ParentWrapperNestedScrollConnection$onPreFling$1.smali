.class final Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection$onPreFling$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;->onPreFling-QWom1Mo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection"
    f = "NestedScrollDelegatingWrapper.kt"
    i = {
        0x0,
        0x0,
        0x1
    }
    l = {
        0xb5,
        0xb6
    }
    m = "onPreFling-QWom1Mo"
    n = {
        "this",
        "available",
        "parentPreConsumed"
    }
    s = {
        "L$0",
        "J$0",
        "J$0"
    }
.end annotation


# instance fields
.field public J$0:J

.field public L$0:Ljava/lang/Object;

.field public label:I

.field public synthetic result:Ljava/lang/Object;

.field public final synthetic this$0:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection$onPreFling$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection$onPreFling$1;->this$0:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection$onPreFling$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection$onPreFling$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection$onPreFling$1;->label:I

    iget-object p1, p0, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection$onPreFling$1;->this$0:Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;->onPreFling-QWom1Mo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
