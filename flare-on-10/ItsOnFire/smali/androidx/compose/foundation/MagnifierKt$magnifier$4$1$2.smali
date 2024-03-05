.class final Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/MagnifierKt$magnifier$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $density:Landroidx/compose/ui/unit/Density;

.field public final synthetic $magnifier:Landroidx/compose/foundation/PlatformMagnifier;

.field public final synthetic $updatedMagnifierCenter$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic $updatedSourceCenter$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic $updatedZoom$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/unit/Density;Landroidx/compose/foundation/PlatformMagnifier;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/PlatformMagnifier;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p2, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    iput-object p3, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$updatedSourceCenter$delegate:Landroidx/compose/runtime/State;

    iput-object p4, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$updatedMagnifierCenter$delegate:Landroidx/compose/runtime/State;

    iput-object p6, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$updatedZoom$delegate:Landroidx/compose/runtime/State;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 9

    iget-object v0, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$updatedSourceCenter$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Landroidx/compose/foundation/MagnifierKt$magnifier$4;->access$invoke$lambda-3(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$density:Landroidx/compose/ui/unit/Density;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Landroidx/compose/foundation/MagnifierKt$magnifier$4;->access$invoke$lambda-1(Landroidx/compose/runtime/MutableState;)J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v3, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    iget-object v2, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Landroidx/compose/foundation/MagnifierKt$magnifier$4;->access$invoke$lambda-1(Landroidx/compose/runtime/MutableState;)J

    move-result-wide v4

    invoke-static {v4, v5, v0, v1}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    move-result-wide v4

    iget-object v0, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$updatedMagnifierCenter$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Landroidx/compose/foundation/MagnifierKt$magnifier$4;->access$invoke$lambda-4(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$density:Landroidx/compose/ui/unit/Density;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$anchorPositionInRoot$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1}, Landroidx/compose/foundation/MagnifierKt$magnifier$4;->access$invoke$lambda-1(Landroidx/compose/runtime/MutableState;)J

    move-result-wide v0

    invoke-static {v0, v1, v6, v7}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v0

    :goto_0
    move-wide v6, v0

    iget-object p0, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$updatedZoom$delegate:Landroidx/compose/runtime/State;

    invoke-static {p0}, Landroidx/compose/foundation/MagnifierKt$magnifier$4;->access$invoke$lambda-5(Landroidx/compose/runtime/State;)F

    move-result v8

    invoke-interface/range {v3 .. v8}, Landroidx/compose/foundation/PlatformMagnifier;->update-Wko1d7g(JJF)V

    goto :goto_1

    :cond_1
    iget-object p0, p0, Landroidx/compose/foundation/MagnifierKt$magnifier$4$1$2;->$magnifier:Landroidx/compose/foundation/PlatformMagnifier;

    invoke-interface {p0}, Landroidx/compose/foundation/PlatformMagnifier;->dismiss()V

    :goto_1
    return-void
.end method
