.class final Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/OverScrollController;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0007\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008*\u0010\u0012J7\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0008\u0010/\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u000201H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00082\u00103J\u001d\u00104\u001a\u00020)2\u0006\u0010(\u001a\u00020)H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00085\u00106J/\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020-2\u0008\u0010/\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u000201H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00089\u0010:J\u0008\u0010;\u001a\u00020\u0015H\u0002J\u0008\u0010<\u001a\u00020\'H\u0002J%\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008A\u0010BJ%\u0010C\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008D\u0010BJ%\u0010E\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008F\u0010BJ%\u0010G\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008H\u0010BJ%\u0010I\u001a\u00020\'2\u0006\u0010J\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008K\u0010LJ\u0008\u0010M\u001a\u00020\'H\u0016J\u001d\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020-H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008P\u0010QJ\u0008\u0010R\u001a\u00020\u0015H\u0016J \u0010S\u001a\u00020\u0015*\u00020T2\u0006\u0010U\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J \u0010Y\u001a\u00020\u0015*\u00020T2\u0006\u0010Z\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J\u000c\u0010[\u001a\u00020\'*\u00020TH\u0016J \u0010\\\u001a\u00020\u0015*\u00020T2\u0006\u0010]\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J \u0010^\u001a\u00020\u0015*\u00020T2\u0006\u0010_\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r8B@BX\u0082\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\u00158B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u0014\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006`"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;",
        "Landroidx/compose/foundation/gestures/OverScrollController;",
        "context",
        "Landroid/content/Context;",
        "overScrollConfig",
        "Landroidx/compose/foundation/gestures/OverScrollConfiguration;",
        "(Landroid/content/Context;Landroidx/compose/foundation/gestures/OverScrollConfiguration;)V",
        "allEffects",
        "",
        "Landroid/widget/EdgeEffect;",
        "bottomEffect",
        "bottomEffectNegation",
        "<set-?>",
        "Landroidx/compose/ui/geometry/Size;",
        "containerSize",
        "getContainerSize-NH-jbRc",
        "()J",
        "setContainerSize-uvyYCjk",
        "(J)V",
        "containerSize$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "",
        "isContentScrolls",
        "()Z",
        "setContentScrolls",
        "(Z)V",
        "isContentScrolls$delegate",
        "leftEffect",
        "leftEffectNegation",
        "getOverScrollConfig",
        "()Landroidx/compose/foundation/gestures/OverScrollConfiguration;",
        "redrawSignal",
        "Landroidx/compose/runtime/MutableState;",
        "",
        "rightEffect",
        "rightEffectNegation",
        "topEffect",
        "topEffectNegation",
        "consumePostFling",
        "",
        "velocity",
        "Landroidx/compose/ui/unit/Velocity;",
        "consumePostFling-TH1AsA0",
        "consumePostScroll",
        "initialDragDelta",
        "Landroidx/compose/ui/geometry/Offset;",
        "overScrollDelta",
        "pointerPosition",
        "source",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;",
        "consumePostScroll-l7mfB5k",
        "(JJLandroidx/compose/ui/geometry/Offset;I)V",
        "consumePreFling",
        "consumePreFling-AH228Gc",
        "(J)J",
        "consumePreScroll",
        "scrollDelta",
        "consumePreScroll-A0NYTsA",
        "(JLandroidx/compose/ui/geometry/Offset;I)J",
        "ignoreOverscroll",
        "invalidateOverScroll",
        "pullBottom",
        "",
        "scroll",
        "displacement",
        "pullBottom-0a9Yr6o",
        "(JJ)F",
        "pullLeft",
        "pullLeft-0a9Yr6o",
        "pullRight",
        "pullRight-0a9Yr6o",
        "pullTop",
        "pullTop-0a9Yr6o",
        "refreshContainerInfo",
        "size",
        "refreshContainerInfo-TmRCtEA",
        "(JZ)V",
        "release",
        "releaseOppositeOverscroll",
        "delta",
        "releaseOppositeOverscroll-k-4lQ0M",
        "(J)Z",
        "stopOverscrollAnimation",
        "drawBottom",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "bottom",
        "canvas",
        "Landroid/graphics/Canvas;",
        "Landroidx/compose/ui/graphics/NativeCanvas;",
        "drawLeft",
        "left",
        "drawOverScroll",
        "drawRight",
        "right",
        "drawTop",
        "top",
        "foundation_release"
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
.field private final allEffects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/EdgeEffect;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final bottomEffect:Landroid/widget/EdgeEffect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final bottomEffectNegation:Landroid/widget/EdgeEffect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final containerSize$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final isContentScrolls$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final leftEffect:Landroid/widget/EdgeEffect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final leftEffectNegation:Landroid/widget/EdgeEffect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final overScrollConfig:Landroidx/compose/foundation/gestures/OverScrollConfiguration;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final redrawSignal:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rightEffect:Landroid/widget/EdgeEffect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rightEffectNegation:Landroid/widget/EdgeEffect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final topEffect:Landroid/widget/EdgeEffect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final topEffectNegation:Landroid/widget/EdgeEffect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/compose/foundation/gestures/OverScrollConfiguration;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/gestures/OverScrollConfiguration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overScrollConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->overScrollConfig:Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    sget-object p2, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {p2, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {p2, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v3

    iput-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {p2, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    const/4 v5, 0x4

    new-array v5, v5, [Landroid/widget/EdgeEffect;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v3, 0x1

    aput-object v1, v5, v3

    const/4 v1, 0x2

    aput-object v4, v5, v1

    const/4 v3, 0x3

    aput-object v2, v5, v3

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->allEffects:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v3

    iput-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {p2, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v3

    iput-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {p2, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v3

    iput-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {p2, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffectNegation:Landroid/widget/EdgeEffect;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    move p2, v6

    :goto_0
    if-ge p2, p1, :cond_0

    add-int/lit8 v3, p2, 0x1

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getOverScrollConfig()Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/gestures/OverScrollConfiguration;->getGlowColor-0d7_KjU()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    move-result v4

    invoke-virtual {p2, v4}, Landroid/widget/EdgeEffect;->setColor(I)V

    move p2, v3

    goto :goto_0

    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->redrawSignal:Landroidx/compose/runtime/MutableState;

    sget-object p1, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    move-result-wide p1

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    move-result-object p1

    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->containerSize$delegate:Landroidx/compose/runtime/MutableState;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->isContentScrolls$delegate:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method private final drawBottom(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 4

    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {p3, v1}, Landroid/graphics/Canvas;->rotate(F)V

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->overScrollConfig:Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    invoke-virtual {v1}, Landroidx/compose/foundation/gestures/OverScrollConfiguration;->getDrawPadding()Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v1

    invoke-interface {p1, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v1

    neg-float v1, v1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p0

    neg-float p0, p0

    add-float/2addr p0, p1

    invoke-virtual {p3, v1, p0}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p0

    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p0
.end method

.method private final drawLeft(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 3

    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/high16 v1, 0x43870000    # 270.0f

    invoke-virtual {p3, v1}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v1

    neg-float v1, v1

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->overScrollConfig:Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/OverScrollConfiguration;->getDrawPadding()Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object p0

    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v2

    invoke-interface {p0, v2}, Landroidx/compose/foundation/layout/PaddingValues;->calculateLeftPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result p0

    invoke-interface {p1, p0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p0

    invoke-virtual {p3, v1, p0}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p0

    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p0
.end method

.method private final drawRight(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 3

    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->overScrollConfig:Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/OverScrollConfiguration;->getDrawPadding()Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object p0

    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v2

    invoke-interface {p0, v2}, Landroidx/compose/foundation/layout/PaddingValues;->calculateRightPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result p0

    const/high16 v2, 0x42b40000    # 90.0f

    invoke-virtual {p3, v2}, Landroid/graphics/Canvas;->rotate(F)V

    int-to-float v1, v1

    neg-float v1, v1

    invoke-interface {p1, p0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p0

    add-float/2addr v1, p0

    const/4 p0, 0x0

    invoke-virtual {p3, p0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p0

    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p0
.end method

.method private final drawTop(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->overScrollConfig:Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/OverScrollConfiguration;->getDrawPadding()Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object p0

    invoke-interface {p0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result p0

    invoke-interface {p1, p0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p0

    const/4 p1, 0x0

    invoke-virtual {p3, p1, p0}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p0

    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p0
.end method

.method private final getContainerSize-NH-jbRc()J
    .locals 2

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->containerSize$delegate:Landroidx/compose/runtime/MutableState;

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/geometry/Size;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Size;->unbox-impl()J

    move-result-wide v0

    return-wide v0
.end method

.method private final ignoreOverscroll()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->overScrollConfig:Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/OverScrollConfiguration;->getForceShowAlways()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->isContentScrolls()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private final invalidateOverScroll()V
    .locals 1

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->redrawSignal:Landroidx/compose/runtime/MutableState;

    invoke-interface {p0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final isContentScrolls()Z
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->isContentScrolls$delegate:Landroidx/compose/runtime/MutableState;

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final pullBottom-0a9Yr6o(JJ)F
    .locals 2

    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result p3

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result p4

    div-float/2addr p3, p4

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p2

    div-float/2addr p1, p2

    sget-object p2, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object p4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    neg-float p1, p1

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p3

    invoke-virtual {p2, p4, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    neg-float p1, p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide p2

    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p0

    mul-float/2addr p1, p0

    return p1
.end method

.method private final pullLeft-0a9Yr6o(JJ)F
    .locals 2

    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p3

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p4

    div-float/2addr p3, p4

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result p2

    div-float/2addr p1, p2

    sget-object p2, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object p4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p3

    invoke-virtual {p2, p4, p1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide p2

    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result p0

    mul-float/2addr p1, p0

    return p1
.end method

.method private final pullRight-0a9Yr6o(JJ)F
    .locals 2

    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p3

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p4

    div-float/2addr p3, p4

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result p2

    div-float/2addr p1, p2

    sget-object p2, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object p4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    neg-float p1, p1

    invoke-virtual {p2, p4, p1, p3}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    neg-float p1, p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide p2

    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result p0

    mul-float/2addr p1, p0

    return p1
.end method

.method private final pullTop-0a9Yr6o(JJ)F
    .locals 2

    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result p3

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result p4

    div-float/2addr p3, p4

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p2

    div-float/2addr p1, p2

    sget-object p2, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object p4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {p2, p4, p1, p3}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide p2

    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p0

    mul-float/2addr p1, p0

    return p1
.end method

.method private final releaseOppositeOverscroll-k-4lQ0M(J)Z
    .locals 5

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_3

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    cmpl-float v3, v3, v1

    if-lez v3, :cond_3

    iget-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v4

    :cond_3
    :goto_2
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v3

    cmpg-float v3, v3, v1

    if-gez v3, :cond_6

    iget-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    if-nez v0, :cond_5

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    move v0, v2

    goto :goto_4

    :cond_5
    :goto_3
    move v0, v4

    :cond_6
    :goto_4
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_9

    iget-object p1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    if-nez v0, :cond_7

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p0

    if-eqz p0, :cond_8

    :cond_7
    move v2, v4

    :cond_8
    move v0, v2

    :cond_9
    return v0
.end method

.method private final setContainerSize-uvyYCjk(J)V
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->containerSize$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final setContentScrolls(Z)V
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->isContentScrolls$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public consumePostFling-TH1AsA0(J)V
    .locals 4

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->ignoreOverscroll()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    sget-object v0, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    :goto_0
    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onAbsorbCompat(Landroid/widget/EdgeEffect;I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    sget-object v0, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    neg-int v3, v3

    goto :goto_0

    :cond_2
    :goto_1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    sget-object v0, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    :goto_2
    invoke-virtual {v0, v1, v2}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onAbsorbCompat(Landroid/widget/EdgeEffect;I)V

    goto :goto_3

    :cond_3
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    sget-object v0, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    neg-int v2, v2

    goto :goto_2

    :cond_4
    :goto_3
    sget-object v0, Landroidx/compose/ui/unit/Velocity;->Companion:Landroidx/compose/ui/unit/Velocity$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/Velocity$Companion;->getZero-9UxMQ8M()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Landroidx/compose/ui/unit/Velocity;->equals-impl0(JJ)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->invalidateOverScroll()V

    :cond_5
    return-void
.end method

.method public consumePostScroll-l7mfB5k(JJLandroidx/compose/ui/geometry/Offset;I)V
    .locals 4
    .param p5    # Landroidx/compose/ui/geometry/Offset;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->ignoreOverscroll()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;->Companion:Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;->getDrag-WNlRxjI()I

    move-result v0

    invoke-static {p6, v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;->equals-impl0(II)Z

    move-result p6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p6, :cond_7

    if-nez p5, :cond_1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide p5

    invoke-static {p5, p6}, Landroidx/compose/ui/geometry/SizeKt;->getCenter-uvyYCjk(J)J

    move-result-wide p5

    goto :goto_0

    :cond_1
    invoke-virtual {p5}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide p5

    :goto_0
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_2

    invoke-direct {p0, p3, p4, p5, p6}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullLeft-0a9Yr6o(JJ)F

    goto :goto_1

    :cond_2
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v2

    cmpg-float v2, v2, v3

    if-gez v2, :cond_3

    invoke-direct {p0, p3, p4, p5, p6}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullRight-0a9Yr6o(JJ)F

    :cond_3
    :goto_1
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    cmpl-float v2, v2, v3

    if-lez v2, :cond_4

    invoke-direct {p0, p3, p4, p5, p6}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullTop-0a9Yr6o(JJ)F

    goto :goto_2

    :cond_4
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    cmpg-float v2, v2, v3

    if-gez v2, :cond_5

    invoke-direct {p0, p3, p4, p5, p6}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullBottom-0a9Yr6o(JJ)F

    :cond_5
    :goto_2
    sget-object p5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide p5

    invoke-static {p3, p4, p5, p6}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_3

    :cond_6
    move p3, v0

    goto :goto_4

    :cond_7
    :goto_3
    move p3, v1

    :goto_4
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->releaseOppositeOverscroll-k-4lQ0M(J)Z

    move-result p1

    if-nez p1, :cond_9

    if-eqz p3, :cond_8

    goto :goto_5

    :cond_8
    move v0, v1

    :cond_9
    :goto_5
    if-eqz v0, :cond_a

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->invalidateOverScroll()V

    :cond_a
    return-void
.end method

.method public consumePreFling-AH228Gc(J)J
    .locals 6

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->ignoreOverscroll()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Landroidx/compose/ui/unit/Velocity;->Companion:Landroidx/compose/ui/unit/Velocity$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/unit/Velocity$Companion;->getZero-9UxMQ8M()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lez v0, :cond_2

    sget-object v0, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v4}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpg-float v4, v4, v1

    if-nez v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_0
    if-nez v4, :cond_2

    iget-object v4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v5

    invoke-static {v5}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v5

    :goto_1
    invoke-virtual {v0, v4, v5}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onAbsorbCompat(Landroid/widget/EdgeEffect;I)V

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v0

    goto :goto_3

    :cond_2
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    sget-object v0, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v4}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpg-float v4, v4, v1

    if-nez v4, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    move v4, v3

    :goto_2
    if-nez v4, :cond_4

    iget-object v4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    move-result v5

    invoke-static {v5}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v5

    neg-int v5, v5

    goto :goto_1

    :cond_4
    move v0, v1

    :goto_3
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v4

    cmpl-float v4, v4, v1

    if-lez v4, :cond_6

    sget-object v4, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v4, v5}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v5

    cmpg-float v5, v5, v1

    if-nez v5, :cond_5

    move v5, v2

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    if-nez v5, :cond_6

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    :goto_5
    invoke-virtual {v4, v1, v2}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onAbsorbCompat(Landroid/widget/EdgeEffect;I)V

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v1

    goto :goto_7

    :cond_6
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v4

    cmpg-float v4, v4, v1

    if-gez v4, :cond_8

    sget-object v4, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v4, v5}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v5

    cmpg-float v5, v5, v1

    if-nez v5, :cond_7

    goto :goto_6

    :cond_7
    move v2, v3

    :goto_6
    if-nez v2, :cond_8

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    neg-int v2, v2

    goto :goto_5

    :cond_8
    :goto_7
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/VelocityKt;->Velocity(FF)J

    move-result-wide p1

    sget-object v0, Landroidx/compose/ui/unit/Velocity;->Companion:Landroidx/compose/ui/unit/Velocity$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/Velocity$Companion;->getZero-9UxMQ8M()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Landroidx/compose/ui/unit/Velocity;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->invalidateOverScroll()V

    :cond_9
    return-wide p1
.end method

.method public consumePreScroll-A0NYTsA(JLandroidx/compose/ui/geometry/Offset;I)J
    .locals 6
    .param p3    # Landroidx/compose/ui/geometry/Offset;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->ignoreOverscroll()Z

    move-result v0

    if-nez v0, :cond_15

    sget-object v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;->Companion:Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;->getDrag-WNlRxjI()I

    move-result v0

    invoke-static {p4, v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;->equals-impl0(II)Z

    move-result p4

    if-nez p4, :cond_0

    goto/16 :goto_f

    :cond_0
    if-nez p3, :cond_1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide p3

    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/SizeKt;->getCenter-uvyYCjk(J)J

    move-result-wide p3

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide p3

    :goto_0
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    if-eqz v0, :cond_4

    :cond_3
    move v4, v1

    goto :goto_7

    :cond_4
    sget-object v0, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v4}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpg-float v4, v4, v1

    if-nez v4, :cond_5

    move v4, v2

    goto :goto_2

    :cond_5
    move v4, v3

    :goto_2
    if-nez v4, :cond_7

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullTop-0a9Yr6o(JJ)F

    move-result v4

    iget-object v5, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v5}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_6

    move v0, v2

    goto :goto_3

    :cond_6
    move v0, v3

    :goto_3
    if-eqz v0, :cond_a

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    :goto_4
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_7

    :cond_7
    iget-object v4, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v4}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpg-float v4, v4, v1

    if-nez v4, :cond_8

    move v4, v2

    goto :goto_5

    :cond_8
    move v4, v3

    :goto_5
    if-nez v4, :cond_3

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullBottom-0a9Yr6o(JJ)F

    move-result v4

    iget-object v5, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v5}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_9

    move v0, v2

    goto :goto_6

    :cond_9
    move v0, v3

    :goto_6
    if-eqz v0, :cond_a

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    goto :goto_4

    :cond_a
    :goto_7
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_b

    move v0, v2

    goto :goto_8

    :cond_b
    move v0, v3

    :goto_8
    if-eqz v0, :cond_c

    goto :goto_e

    :cond_c
    sget-object v0, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v5}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v5

    cmpg-float v5, v5, v1

    if-nez v5, :cond_d

    move v5, v2

    goto :goto_9

    :cond_d
    move v5, v3

    :goto_9
    if-nez v5, :cond_10

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullLeft-0a9Yr6o(JJ)F

    move-result p1

    iget-object p2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p2}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result p2

    cmpg-float p2, p2, v1

    if-nez p2, :cond_e

    goto :goto_a

    :cond_e
    move v2, v3

    :goto_a
    if-eqz v2, :cond_f

    iget-object p2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    :goto_b
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_f
    move v1, p1

    goto :goto_e

    :cond_10
    iget-object v5, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v5}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v5

    cmpg-float v5, v5, v1

    if-nez v5, :cond_11

    move v5, v2

    goto :goto_c

    :cond_11
    move v5, v3

    :goto_c
    if-nez v5, :cond_13

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullRight-0a9Yr6o(JJ)F

    move-result p1

    iget-object p2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p2}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result p2

    cmpg-float p2, p2, v1

    if-nez p2, :cond_12

    goto :goto_d

    :cond_12
    move v2, v3

    :goto_d
    if-eqz v2, :cond_f

    iget-object p2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    goto :goto_b

    :cond_13
    :goto_e
    invoke-static {v1, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide p1

    sget-object p3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    move-result p3

    if-nez p3, :cond_14

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->invalidateOverScroll()V

    :cond_14
    return-wide p1

    :cond_15
    :goto_f
    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide p0

    return-wide p0
.end method

.method public drawOverScroll(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 8
    .param p1    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->redrawSignal:Landroidx/compose/runtime/MutableState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->ignoreOverscroll()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Landroidx/compose/ui/graphics/AndroidCanvas_androidKt;->getNativeCanvas(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;

    move-result-object v0

    sget-object v1, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v2}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v2

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v5

    :goto_0
    if-nez v2, :cond_2

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffectNegation:Landroid/widget/EdgeEffect;

    invoke-direct {p0, p1, v2, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->drawRight(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_2
    iget-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-direct {p0, p1, v2, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->drawLeft(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v2

    if-nez v2, :cond_3

    move v2, v5

    goto :goto_1

    :cond_3
    move v2, v4

    :goto_1
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffectNegation:Landroid/widget/EdgeEffect;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v7}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v7

    invoke-virtual {v1, v6, v7, v3}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    goto :goto_2

    :cond_4
    move v2, v5

    :goto_2
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v6}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v6

    cmpg-float v6, v6, v3

    if-nez v6, :cond_5

    move v6, v4

    goto :goto_3

    :cond_5
    move v6, v5

    :goto_3
    if-nez v6, :cond_6

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffectNegation:Landroid/widget/EdgeEffect;

    invoke-direct {p0, p1, v6, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->drawBottom(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->finish()V

    :cond_6
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v6

    if-nez v6, :cond_9

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-direct {p0, p1, v6, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->drawTop(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v6

    if-nez v6, :cond_8

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    move v2, v5

    goto :goto_5

    :cond_8
    :goto_4
    move v2, v4

    :goto_5
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffectNegation:Landroid/widget/EdgeEffect;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v7}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v7

    invoke-virtual {v1, v6, v7, v3}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    :cond_9
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v6}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v6

    cmpg-float v6, v6, v3

    if-nez v6, :cond_a

    move v6, v4

    goto :goto_6

    :cond_a
    move v6, v5

    :goto_6
    if-nez v6, :cond_b

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffectNegation:Landroid/widget/EdgeEffect;

    invoke-direct {p0, p1, v6, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->drawLeft(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->finish()V

    :cond_b
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v6

    if-nez v6, :cond_e

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-direct {p0, p1, v6, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->drawRight(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v6

    if-nez v6, :cond_d

    if-eqz v2, :cond_c

    goto :goto_7

    :cond_c
    move v2, v5

    goto :goto_8

    :cond_d
    :goto_7
    move v2, v4

    :goto_8
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffectNegation:Landroid/widget/EdgeEffect;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v7}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v7

    invoke-virtual {v1, v6, v7, v3}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    :cond_e
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v6}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v6

    cmpg-float v6, v6, v3

    if-nez v6, :cond_f

    move v6, v4

    goto :goto_9

    :cond_f
    move v6, v5

    :goto_9
    if-nez v6, :cond_10

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffectNegation:Landroid/widget/EdgeEffect;

    invoke-direct {p0, p1, v6, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->drawTop(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffectNegation:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->finish()V

    :cond_10
    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v6

    if-nez v6, :cond_13

    iget-object v6, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-direct {p0, p1, v6, v0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->drawBottom(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    if-nez p1, :cond_12

    if-eqz v2, :cond_11

    goto :goto_a

    :cond_11
    move v4, v5

    :cond_12
    :goto_a
    iget-object p1, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffectNegation:Landroid/widget/EdgeEffect;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v0}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v0

    invoke-virtual {v1, p1, v0, v3}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    move v2, v4

    :cond_13
    if-eqz v2, :cond_14

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->invalidateOverScroll()V

    :cond_14
    return-void
.end method

.method public final getOverScrollConfig()Landroidx/compose/foundation/gestures/OverScrollConfiguration;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->overScrollConfig:Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    return-object p0
.end method

.method public refreshContainerInfo-TmRCtEA(JZ)V
    .locals 4

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Landroidx/compose/ui/geometry/Size;->equals-impl0(JJ)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->isContentScrolls()Z

    move-result v2

    if-eq v2, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->setContainerSize-uvyYCjk(J)V

    invoke-direct {p0, p3}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->setContentScrolls(Z)V

    if-eqz v0, :cond_1

    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {p3, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {p3, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {p3, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {p3, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffectNegation:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {p3, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffectNegation:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {p3, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffectNegation:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {p3, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffectNegation:Landroid/widget/EdgeEffect;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result p1

    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p1

    invoke-virtual {p3, v2, p1}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_1
    if-nez v1, :cond_2

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->release()V

    :cond_3
    return-void
.end method

.method public release()V
    .locals 6

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->ignoreOverscroll()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->allEffects:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_3

    add-int/lit8 v5, v3, 0x1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move v4, v2

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v3, 0x1

    move v4, v3

    :goto_2
    move v3, v5

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->invalidateOverScroll()V

    :cond_4
    return-void
.end method

.method public stopOverscrollAnimation()Z
    .locals 9

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->getContainerSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/SizeKt;->getCenter-uvyYCjk(J)J

    move-result-wide v0

    sget-object v2, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/gestures/EdgeEffectCompat;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->leftEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, v3}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v3, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    if-nez v3, :cond_1

    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v7

    invoke-direct {p0, v7, v8, v0, v1}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullLeft-0a9Yr6o(JJ)F

    move v3, v6

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    iget-object v7, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->rightEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, v7}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v7

    cmpg-float v7, v7, v4

    if-nez v7, :cond_2

    move v7, v6

    goto :goto_2

    :cond_2
    move v7, v5

    :goto_2
    if-nez v7, :cond_3

    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v7

    invoke-direct {p0, v7, v8, v0, v1}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullRight-0a9Yr6o(JJ)F

    move v3, v6

    :cond_3
    iget-object v7, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->topEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, v7}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v7

    cmpg-float v7, v7, v4

    if-nez v7, :cond_4

    move v7, v6

    goto :goto_3

    :cond_4
    move v7, v5

    :goto_3
    if-nez v7, :cond_5

    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v7

    invoke-direct {p0, v7, v8, v0, v1}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullTop-0a9Yr6o(JJ)F

    move v3, v6

    :cond_5
    iget-object v7, p0, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->bottomEffect:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, v7}, Landroidx/compose/foundation/gestures/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v2

    cmpg-float v2, v2, v4

    if-nez v2, :cond_6

    move v5, v6

    :cond_6
    if-nez v5, :cond_7

    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v2

    invoke-direct {p0, v2, v3, v0, v1}, Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;->pullBottom-0a9Yr6o(JJ)F

    goto :goto_4

    :cond_7
    move v6, v3

    :goto_4
    return v6
.end method
