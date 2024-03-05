.class public final Landroidx/compose/ui/node/OuterMeasurablePlaceable;
.super Landroidx/compose/ui/layout/Placeable;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/Measurable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/node/OuterMeasurablePlaceable$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0096\u0002J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0016J\u001d\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000fH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016J\u0010\u00109\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0016J\u0008\u0010:\u001a\u00020\u0015H\u0002J@\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u001b2\u0019\u0010>\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u0016H\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008?\u0010@J@\u0010A\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u001b2\u0019\u0010>\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u0016H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008B\u0010@J\u0006\u0010C\u001a\u00020\u0015J\u001b\u0010D\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000f\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008E\u0010FJ\u0006\u0010G\u001a\u00020\u0015R\u001a\u0010\u0008\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R!\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\"\u0010)\u001a\u0004\u0018\u00010(2\u0008\u0010\'\u001a\u0004\u0018\u00010(@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u000e\u0010,\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006H"
    }
    d2 = {
        "Landroidx/compose/ui/node/OuterMeasurablePlaceable;",
        "Landroidx/compose/ui/layout/Measurable;",
        "Landroidx/compose/ui/layout/Placeable;",
        "layoutNode",
        "Landroidx/compose/ui/node/LayoutNode;",
        "outerWrapper",
        "Landroidx/compose/ui/node/LayoutNodeWrapper;",
        "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNodeWrapper;)V",
        "duringAlignmentLinesQuery",
        "",
        "getDuringAlignmentLinesQuery$ui_release",
        "()Z",
        "setDuringAlignmentLinesQuery$ui_release",
        "(Z)V",
        "lastConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "getLastConstraints-DWUhwKw",
        "()Landroidx/compose/ui/unit/Constraints;",
        "lastLayerBlock",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "lastPosition",
        "Landroidx/compose/ui/unit/IntOffset;",
        "J",
        "lastZIndex",
        "",
        "measuredHeight",
        "",
        "getMeasuredHeight",
        "()I",
        "measuredOnce",
        "measuredWidth",
        "getMeasuredWidth",
        "getOuterWrapper",
        "()Landroidx/compose/ui/node/LayoutNodeWrapper;",
        "setOuterWrapper",
        "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V",
        "<set-?>",
        "",
        "parentData",
        "getParentData",
        "()Ljava/lang/Object;",
        "placedOnce",
        "get",
        "alignmentLine",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "maxIntrinsicHeight",
        "width",
        "maxIntrinsicWidth",
        "height",
        "measure",
        "constraints",
        "measure-BRTryo0",
        "(J)Landroidx/compose/ui/layout/Placeable;",
        "minIntrinsicHeight",
        "minIntrinsicWidth",
        "onIntrinsicsQueried",
        "placeAt",
        "position",
        "zIndex",
        "layerBlock",
        "placeAt-f8xVGno",
        "(JFLkotlin/jvm/functions/Function1;)V",
        "placeOuterWrapper",
        "placeOuterWrapper-f8xVGno",
        "recalculateParentData",
        "remeasure",
        "remeasure-BRTryo0",
        "(J)Z",
        "replace",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private duringAlignmentLinesQuery:Z

.field private lastLayerBlock:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastPosition:J

.field private lastZIndex:F

.field private final layoutNode:Landroidx/compose/ui/node/LayoutNode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private measuredOnce:Z

.field private outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private parentData:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private placedOnce:Z


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNodeWrapper;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/node/LayoutNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/node/LayoutNodeWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "layoutNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outerWrapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/compose/ui/layout/Placeable;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    iput-object p2, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    sget-object p1, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->lastPosition:J

    return-void
.end method

.method public static final synthetic access$placeOuterWrapper-f8xVGno(Landroidx/compose/ui/node/OuterMeasurablePlaceable;JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->placeOuterWrapper-f8xVGno(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final onIntrinsicsQueried()V
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->requestRemeasure$ui_release()V

    return-void
.end method

.method private final placeOuterWrapper-f8xVGno(JFLkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JF",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    if-nez p4, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->getOuterWrapper()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place-70tqf50(Landroidx/compose/ui/layout/Placeable;JF)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->getOuterWrapper()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v1

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer-aW-9-wM(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public get(Landroidx/compose/ui/layout/AlignmentLine;)I
    .locals 4
    .param p1    # Landroidx/compose/ui/layout/AlignmentLine;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "alignmentLine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object v0

    :goto_0
    sget-object v2, Landroidx/compose/ui/node/LayoutNode$LayoutState;->Measuring:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getAlignmentLines$ui_release()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/compose/ui/node/LayoutNodeAlignmentLines;->setUsedDuringParentMeasurement$ui_release(Z)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object v1

    :goto_1
    sget-object v0, Landroidx/compose/ui/node/LayoutNode$LayoutState;->LayingOut:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-ne v1, v0, :cond_3

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getAlignmentLines$ui_release()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/compose/ui/node/LayoutNodeAlignmentLines;->setUsedDuringParentLayout$ui_release(Z)V

    :cond_3
    :goto_2
    iput-boolean v3, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->duringAlignmentLinesQuery:Z

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result p1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->duringAlignmentLinesQuery:Z

    return p1
.end method

.method public final getDuringAlignmentLinesQuery$ui_release()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->duringAlignmentLinesQuery:Z

    return p0
.end method

.method public final getLastConstraints-DWUhwKw()Landroidx/compose/ui/unit/Constraints;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-boolean v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->measuredOnce:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasurementConstraints-msEJaDk()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->box-impl(J)Landroidx/compose/ui/unit/Constraints;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public getMeasuredHeight()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredHeight()I

    move-result p0

    return p0
.end method

.method public getMeasuredWidth()I
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredWidth()I

    move-result p0

    return p0
.end method

.method public final getOuterWrapper()Landroidx/compose/ui/node/LayoutNodeWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    return-object p0
.end method

.method public getParentData()Ljava/lang/Object;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->parentData:Ljava/lang/Object;

    return-object p0
.end method

.method public maxIntrinsicHeight(I)I
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->onIntrinsicsQueried()V

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    move-result p0

    return p0
.end method

.method public maxIntrinsicWidth(I)I
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->onIntrinsicsQueried()V

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result p0

    return p0
.end method

.method public measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getMeasuredByParent$ui_release()Landroidx/compose/ui/node/LayoutNode$UsageByParent;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/node/LayoutNode$UsageByParent;->NotUsed:Landroidx/compose/ui/node/LayoutNode$UsageByParent;

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getCanMultiMeasure$ui_release()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v3

    :goto_1
    if-eqz v1, :cond_4

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object v2

    sget-object v4, Landroidx/compose/ui/node/OuterMeasurablePlaceable$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    sget-object v0, Landroidx/compose/ui/node/LayoutNode$UsageByParent;->InLayoutBlock:Landroidx/compose/ui/node/LayoutNode$UsageByParent;

    goto :goto_2

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object p1

    const-string p2, "Measurable could be only measured from the parent\'s measure or layout block.Parents state is "

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    sget-object v0, Landroidx/compose/ui/node/LayoutNode$UsageByParent;->InMeasureBlock:Landroidx/compose/ui/node/LayoutNode$UsageByParent;

    :goto_2
    invoke-virtual {v1, v0}, Landroidx/compose/ui/node/LayoutNode;->setMeasuredByParent$ui_release(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "measure() may not be called multiple times on the same Measurable. Current state "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getMeasuredByParent$ui_release()Landroidx/compose/ui/node/LayoutNode$UsageByParent;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ". Parent state "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2e

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    sget-object v1, Landroidx/compose/ui/node/LayoutNode$UsageByParent;->NotUsed:Landroidx/compose/ui/node/LayoutNode$UsageByParent;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/node/LayoutNode;->setMeasuredByParent$ui_release(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V

    :goto_3
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->remeasure-BRTryo0(J)Z

    return-object p0
.end method

.method public minIntrinsicHeight(I)I
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->onIntrinsicsQueried()V

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    move-result p0

    return p0
.end method

.method public minIntrinsicWidth(I)I
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->onIntrinsicsQueried()V

    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    move-result p0

    return p0
.end method

.method public placeAt-f8xVGno(JFLkotlin/jvm/functions/Function1;)V
    .locals 9
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JF",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->lastPosition:J

    iput p3, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->lastZIndex:F

    iput-object p4, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->lastLayerBlock:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getWrappedBy$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->isShallowPlacing()Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->placeOuterWrapper-f8xVGno(JFLkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :cond_2
    iput-boolean v2, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->placedOnce:Z

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getAlignmentLines$ui_release()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/compose/ui/node/LayoutNodeAlignmentLines;->setUsedByModifierLayout$ui_release(Z)V

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-static {v0}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    new-instance v8, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;

    move-object v2, v8

    move-object v3, p0

    move-wide v4, p1

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Landroidx/compose/ui/node/OuterMeasurablePlaceable$placeAt$1;-><init>(Landroidx/compose/ui/node/OuterMeasurablePlaceable;JFLkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v8}, Landroidx/compose/ui/node/OwnerSnapshotObserver;->observeLayoutModifierSnapshotReads$ui_release(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V

    :goto_1
    return-void
.end method

.method public final recalculateParentData()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-interface {v0}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->parentData:Ljava/lang/Object;

    return-void
.end method

.method public final remeasure-BRTryo0(J)Z
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-static {v0}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getCanMultiMeasure$ui_release()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getCanMultiMeasure$ui_release()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v4

    :goto_1
    invoke-virtual {v2, v1}, Landroidx/compose/ui/node/LayoutNode;->setCanMultiMeasure$ui_release(Z)V

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/node/LayoutNode$LayoutState;->NeedsRemeasure:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-eq v1, v2, :cond_3

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasurementConstraints-msEJaDk()J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Landroidx/compose/ui/unit/Constraints;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-interface {v0, p0}, Landroidx/compose/ui/node/Owner;->forceMeasureTheSubtree(Landroidx/compose/ui/node/LayoutNode;)V

    return v5

    :cond_3
    :goto_2
    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getAlignmentLines$ui_release()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroidx/compose/ui/node/LayoutNodeAlignmentLines;->setUsedByModifierMeasurement$ui_release(Z)V

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->get_children$ui_release()Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v2

    if-lez v2, :cond_5

    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    move-result-object v1

    move v3, v5

    :cond_4
    aget-object v6, v1, v3

    check-cast v6, Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getAlignmentLines$ui_release()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroidx/compose/ui/node/LayoutNodeAlignmentLines;->setUsedDuringParentMeasurement$ui_release(Z)V

    add-int/2addr v3, v4

    if-lt v3, v2, :cond_4

    :cond_5
    iput-boolean v4, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->measuredOnce:Z

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    sget-object v2, Landroidx/compose/ui/node/LayoutNode$LayoutState;->Measuring:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    invoke-virtual {v1, v2}, Landroidx/compose/ui/node/LayoutNode;->setLayoutState$ui_release(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/Placeable;->setMeasurementConstraints-BRTryo0(J)V

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getSize-YbymL2g()J

    move-result-wide v6

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    new-instance v3, Landroidx/compose/ui/node/OuterMeasurablePlaceable$remeasure$2;

    invoke-direct {v3, p0, p1, p2}, Landroidx/compose/ui/node/OuterMeasurablePlaceable$remeasure$2;-><init>(Landroidx/compose/ui/node/OuterMeasurablePlaceable;J)V

    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/node/OwnerSnapshotObserver;->observeMeasureSnapshotReads$ui_release(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object p1

    if-ne p1, v2, :cond_6

    iget-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    sget-object p2, Landroidx/compose/ui/node/LayoutNode$LayoutState;->NeedsRelayout:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/node/LayoutNode;->setLayoutState$ui_release(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V

    :cond_6
    iget-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getSize-YbymL2g()J

    move-result-wide p1

    invoke-static {p1, p2, v6, v7}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p2

    if-ne p1, p2, :cond_8

    iget-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p2

    if-eq p1, p2, :cond_7

    goto :goto_3

    :cond_7
    move v4, v5

    :cond_8
    :goto_3
    iget-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p1

    iget-object p2, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p2

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/Placeable;->setMeasuredSize-ozmzZPI(J)V

    return v4
.end method

.method public final replace()V
    .locals 4

    iget-boolean v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->placedOnce:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->lastPosition:J

    iget v2, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->lastZIndex:F

    iget-object v3, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->lastLayerBlock:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->placeAt-f8xVGno(JFLkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final setDuringAlignmentLinesQuery$ui_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->duringAlignmentLinesQuery:Z

    return-void
.end method

.method public final setOuterWrapper(Landroidx/compose/ui/node/LayoutNodeWrapper;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/node/LayoutNodeWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/node/OuterMeasurablePlaceable;->outerWrapper:Landroidx/compose/ui/node/LayoutNodeWrapper;

    return-void
.end method
