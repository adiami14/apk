.class public final Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/OverScrollController;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/gestures/AndroidOverScrollKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J7\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u001f\u001a\u00020\u0003H\u0016J\u0008\u0010 \u001a\u00020\u001cH\u0016J\u000c\u0010!\u001a\u00020\u0003*\u00020\"H\u0016\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006#"
    }
    d2 = {
        "androidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1",
        "Landroidx/compose/foundation/gestures/OverScrollController;",
        "consumePostFling",
        "",
        "velocity",
        "Landroidx/compose/ui/unit/Velocity;",
        "consumePostFling-TH1AsA0",
        "(J)V",
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
        "refreshContainerInfo",
        "size",
        "Landroidx/compose/ui/geometry/Size;",
        "isContentScrolls",
        "",
        "refreshContainerInfo-TmRCtEA",
        "(JZ)V",
        "release",
        "stopOverscrollAnimation",
        "drawOverScroll",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public consumePostFling-TH1AsA0(J)V
    .locals 0

    return-void
.end method

.method public consumePostScroll-l7mfB5k(JJLandroidx/compose/ui/geometry/Offset;I)V
    .locals 0
    .param p5    # Landroidx/compose/ui/geometry/Offset;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public consumePreFling-AH228Gc(J)J
    .locals 0

    sget-object p0, Landroidx/compose/ui/unit/Velocity;->Companion:Landroidx/compose/ui/unit/Velocity$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/unit/Velocity$Companion;->getZero-9UxMQ8M()J

    move-result-wide p0

    return-wide p0
.end method

.method public consumePreScroll-A0NYTsA(JLandroidx/compose/ui/geometry/Offset;I)J
    .locals 0
    .param p3    # Landroidx/compose/ui/geometry/Offset;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide p0

    return-wide p0
.end method

.method public drawOverScroll(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public refreshContainerInfo-TmRCtEA(JZ)V
    .locals 0

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public stopOverscrollAnimation()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method
