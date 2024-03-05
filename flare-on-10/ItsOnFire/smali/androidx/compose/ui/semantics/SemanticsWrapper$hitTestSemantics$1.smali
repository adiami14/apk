.class final Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/semantics/SemanticsWrapper;->hitTestSemantics-9KIMszo(JLandroidx/compose/ui/node/HitTestResult;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "inLayer",
        "",
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
.field public final synthetic $hitSemanticsWrappers:Landroidx/compose/ui/node/HitTestResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/node/HitTestResult<",
            "Landroidx/compose/ui/semantics/SemanticsWrapper;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $pointerPosition:J

.field public final synthetic this$0:Landroidx/compose/ui/semantics/SemanticsWrapper;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/semantics/SemanticsWrapper;JLandroidx/compose/ui/node/HitTestResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/semantics/SemanticsWrapper;",
            "J",
            "Landroidx/compose/ui/node/HitTestResult<",
            "Landroidx/compose/ui/semantics/SemanticsWrapper;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;->this$0:Landroidx/compose/ui/semantics/SemanticsWrapper;

    iput-wide p2, p0, Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;->$pointerPosition:J

    iput-object p4, p0, Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;->$hitSemanticsWrappers:Landroidx/compose/ui/node/HitTestResult;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;->invoke(Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Z)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;->this$0:Landroidx/compose/ui/semantics/SemanticsWrapper;

    invoke-virtual {v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v0

    iget-wide v1, p0, Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;->$pointerPosition:J

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->fromParentPosition-MK-Hz9U(J)J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;->this$0:Landroidx/compose/ui/semantics/SemanticsWrapper;

    invoke-virtual {v2}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v2

    iget-object p0, p0, Landroidx/compose/ui/semantics/SemanticsWrapper$hitTestSemantics$1;->$hitSemanticsWrappers:Landroidx/compose/ui/node/HitTestResult;

    invoke-virtual {v2, v0, v1, p0, p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->hitTestSemantics-9KIMszo(JLandroidx/compose/ui/node/HitTestResult;Z)V

    return-void
.end method
