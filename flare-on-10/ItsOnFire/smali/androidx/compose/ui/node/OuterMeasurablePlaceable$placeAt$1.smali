.class final Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/node/OuterMeasurablePlaceable;->placeAt-f8xVGno(JFLkotlin/jvm/functions/Function1;)V
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
.field public final synthetic $layerBlock:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $position:J

.field public final synthetic $zIndex:F

.field public final synthetic this$0:Landroidx/compose/ui/node/OuterMeasurablePlaceable;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/OuterMeasurablePlaceable;JFLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/node/OuterMeasurablePlaceable;",
            "JF",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->this$0:Landroidx/compose/ui/node/OuterMeasurablePlaceable;

    iput-wide p2, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->$position:J

    iput p4, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->$zIndex:F

    iput-object p5, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->$layerBlock:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->this$0:Landroidx/compose/ui/node/OuterMeasurablePlaceable;

    iget-wide v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->$position:J

    iget v3, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->$zIndex:F

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;->$layerBlock:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3, p0}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->access$placeOuterWrapper-f8xVGno(Landroidx/compose/ui/node/OuterMeasurablePlaceable;JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method
