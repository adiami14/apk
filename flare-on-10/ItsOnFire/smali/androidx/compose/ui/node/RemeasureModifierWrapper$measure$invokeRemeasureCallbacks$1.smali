.class final Landroidx/compose/ui/node/RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/node/RemeasureModifierWrapper;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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
.field public final synthetic this$0:Landroidx/compose/ui/node/RemeasureModifierWrapper;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/RemeasureModifierWrapper;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/node/RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1;->this$0:Landroidx/compose/ui/node/RemeasureModifierWrapper;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/node/RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1;->this$0:Landroidx/compose/ui/node/RemeasureModifierWrapper;

    invoke-virtual {v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getModifier()Landroidx/compose/ui/Modifier$Element;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/OnRemeasuredModifier;

    iget-object p0, p0, Landroidx/compose/ui/node/RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1;->this$0:Landroidx/compose/ui/node/RemeasureModifierWrapper;

    invoke-static {p0}, Landroidx/compose/ui/node/RemeasureModifierWrapper;->access$getMeasuredSize-YbymL2g(Landroidx/compose/ui/node/RemeasureModifierWrapper;)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/layout/OnRemeasuredModifier;->onRemeasured-ozmzZPI(J)V

    return-void
.end method