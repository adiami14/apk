.class public interface abstract Landroidx/compose/foundation/gestures/OverScrollController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008`\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J7\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u001f\u001a\u00020\u0003H&J\u0008\u0010 \u001a\u00020\u001cH&J\u000c\u0010!\u001a\u00020\u0003*\u00020\"H&\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006#"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/OverScrollController;",
        "",
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


# virtual methods
.method public abstract consumePostFling-TH1AsA0(J)V
.end method

.method public abstract consumePostScroll-l7mfB5k(JJLandroidx/compose/ui/geometry/Offset;I)V
    .param p5    # Landroidx/compose/ui/geometry/Offset;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract consumePreFling-AH228Gc(J)J
.end method

.method public abstract consumePreScroll-A0NYTsA(JLandroidx/compose/ui/geometry/Offset;I)J
    .param p3    # Landroidx/compose/ui/geometry/Offset;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract drawOverScroll(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .param p1    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract refreshContainerInfo-TmRCtEA(JZ)V
.end method

.method public abstract release()V
.end method

.method public abstract stopOverscrollAnimation()Z
.end method
