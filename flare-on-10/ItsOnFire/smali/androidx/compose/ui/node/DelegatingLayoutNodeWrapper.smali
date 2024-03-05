.class public Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;
.super Landroidx/compose/ui/node/LayoutNodeWrapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroidx/compose/ui/Modifier$Element;",
        ">",
        "Landroidx/compose/ui/node/LayoutNodeWrapper;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0010\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\n\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010*\u001a\u00020\u0008H\u0016J\n\u0010+\u001a\u0004\u0018\u00010(H\u0016J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\n\u0010.\u001a\u0004\u0018\u00010&H\u0016J\n\u0010/\u001a\u0004\u0018\u00010(H\u0016J\n\u00100\u001a\u0004\u0018\u00010-H\u0016J;\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u00020\u00082\u0006\u00109\u001a\u00020\u0008H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008:\u0010;Je\u0010<\u001a\u000202\"\u0004\u0008\u0001\u0010\u00012\u0006\u00103\u001a\u0002042\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u0002H\u0001062\u0006\u0010=\u001a\u00020\u00082\u0006\u0010>\u001a\u00020\u00082\u0006\u00109\u001a\u00020\u00082\u0006\u0010?\u001a\u0002H\u00012\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u0002020AH\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008B\u0010CJ3\u0010D\u001a\u0002022\u0006\u00103\u001a\u0002042\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020F062\u0006\u00109\u001a\u00020\u0008H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008G\u0010HJ\u0010\u0010I\u001a\u00020\"2\u0006\u0010J\u001a\u00020\"H\u0016J\u0010\u0010K\u001a\u00020\"2\u0006\u0010L\u001a\u00020\"H\u0016J\u001d\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008Q\u0010RJ\u0010\u0010S\u001a\u00020\"2\u0006\u0010J\u001a\u00020\"H\u0016J\u0010\u0010T\u001a\u00020\"2\u0006\u0010L\u001a\u00020\"H\u0016J\u0008\u0010U\u001a\u000202H\u0016J\u0010\u0010V\u001a\u0002022\u0006\u0010W\u001a\u00020XH\u0016J@\u0010Y\u001a\u0002022\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0019\u0010^\u001a\u0015\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u000202\u0018\u00010A\u00a2\u0006\u0002\u0008`H\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008a\u0010bJ\u000e\u0010c\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u0002J\u0008\u0010d\u001a\u00020\u0008H\u0016R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\t\"\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u00028\u0000X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\t\"\u0004\u0008\u001b\u0010\u000bR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003@VX\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006e"
    }
    d2 = {
        "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;",
        "T",
        "Landroidx/compose/ui/Modifier$Element;",
        "Landroidx/compose/ui/node/LayoutNodeWrapper;",
        "wrapped",
        "modifier",
        "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier$Element;)V",
        "isChained",
        "",
        "()Z",
        "setChained",
        "(Z)V",
        "measureScope",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "getMeasureScope",
        "()Landroidx/compose/ui/layout/MeasureScope;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier$Element;",
        "setModifier",
        "(Landroidx/compose/ui/Modifier$Element;)V",
        "Landroidx/compose/ui/Modifier$Element;",
        "parentData",
        "",
        "getParentData",
        "()Ljava/lang/Object;",
        "toBeReusedForSameModifier",
        "getToBeReusedForSameModifier",
        "setToBeReusedForSameModifier",
        "<set-?>",
        "getWrapped$ui_release",
        "()Landroidx/compose/ui/node/LayoutNodeWrapper;",
        "setWrapped",
        "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V",
        "calculateAlignmentLine",
        "",
        "alignmentLine",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "findLastFocusWrapper",
        "Landroidx/compose/ui/node/ModifiedFocusNode;",
        "findLastKeyInputWrapper",
        "Landroidx/compose/ui/node/ModifiedKeyInputNode;",
        "findNextFocusWrapper",
        "excludeDeactivated",
        "findNextKeyInputWrapper",
        "findNextNestedScrollWrapper",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;",
        "findPreviousFocusWrapper",
        "findPreviousKeyInputWrapper",
        "findPreviousNestedScrollWrapper",
        "hitTest",
        "",
        "pointerPosition",
        "Landroidx/compose/ui/geometry/Offset;",
        "hitTestResult",
        "Landroidx/compose/ui/node/HitTestResult;",
        "Landroidx/compose/ui/input/pointer/PointerInputFilter;",
        "isTouchEvent",
        "isInLayer",
        "hitTest-M_7yMNQ",
        "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V",
        "hitTestInMinimumTouchTarget",
        "forceParentIntercept",
        "useTouchSize",
        "content",
        "block",
        "Lkotlin/Function1;",
        "hitTestInMinimumTouchTarget-7362WCg",
        "(JLandroidx/compose/ui/node/HitTestResult;ZZZLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "hitTestSemantics",
        "hitSemanticsWrappers",
        "Landroidx/compose/ui/semantics/SemanticsWrapper;",
        "hitTestSemantics-9KIMszo",
        "(JLandroidx/compose/ui/node/HitTestResult;Z)V",
        "maxIntrinsicHeight",
        "width",
        "maxIntrinsicWidth",
        "height",
        "measure",
        "Landroidx/compose/ui/layout/Placeable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-BRTryo0",
        "(J)Landroidx/compose/ui/layout/Placeable;",
        "minIntrinsicHeight",
        "minIntrinsicWidth",
        "onInitialize",
        "performDraw",
        "canvas",
        "Landroidx/compose/ui/graphics/Canvas;",
        "placeAt",
        "position",
        "Landroidx/compose/ui/unit/IntOffset;",
        "zIndex",
        "",
        "layerBlock",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
        "Lkotlin/ExtensionFunctionType;",
        "placeAt-f8xVGno",
        "(JFLkotlin/jvm/functions/Function1;)V",
        "setModifierTo",
        "shouldSharePointerInputWithSiblings",
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
.field private isChained:Z

.field private modifier:Landroidx/compose/ui/Modifier$Element;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private toBeReusedForSameModifier:Z

.field private wrapped:Landroidx/compose/ui/node/LayoutNodeWrapper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier$Element;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/node/LayoutNodeWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/node/LayoutNodeWrapper;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "wrapped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getLayoutNode$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;-><init>(Landroidx/compose/ui/node/LayoutNode;)V

    iput-object p1, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->wrapped:Landroidx/compose/ui/node/LayoutNodeWrapper;

    iput-object p2, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->modifier:Landroidx/compose/ui/Modifier$Element;

    return-void
.end method

.method public static final synthetic access$getApparentToRealOffset-nOcc-ac(Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;)J
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getApparentToRealOffset-nOcc-ac()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public calculateAlignmentLine(Landroidx/compose/ui/layout/AlignmentLine;)I
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/AlignmentLine;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "alignmentLine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result p0

    return p0
.end method

.method public findLastFocusWrapper()Landroidx/compose/ui/node/ModifiedFocusNode;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->findNextFocusWrapper(Z)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findNextFocusWrapper(Z)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object v1

    move-object v2, v1

    move-object v1, p0

    move-object p0, v2

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public findLastKeyInputWrapper()Landroidx/compose/ui/node/ModifiedKeyInputNode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getLayoutNode$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getInnerLayoutNodeWrapper$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findPreviousKeyInputWrapper()Landroidx/compose/ui/node/ModifiedKeyInputNode;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public findNextFocusWrapper(Z)Landroidx/compose/ui/node/ModifiedFocusNode;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findNextFocusWrapper(Z)Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    return-object p0
.end method

.method public findNextKeyInputWrapper()Landroidx/compose/ui/node/ModifiedKeyInputNode;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findNextKeyInputWrapper()Landroidx/compose/ui/node/ModifiedKeyInputNode;

    move-result-object p0

    return-object p0
.end method

.method public findNextNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findNextNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    move-result-object p0

    return-object p0
.end method

.method public findPreviousFocusWrapper()Landroidx/compose/ui/node/ModifiedFocusNode;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getWrappedBy$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findPreviousFocusWrapper()Landroidx/compose/ui/node/ModifiedFocusNode;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public findPreviousKeyInputWrapper()Landroidx/compose/ui/node/ModifiedKeyInputNode;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getWrappedBy$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findPreviousKeyInputWrapper()Landroidx/compose/ui/node/ModifiedKeyInputNode;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public findPreviousNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getWrappedBy$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->findPreviousNestedScrollWrapper()Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public getMeasureScope()Landroidx/compose/ui/layout/MeasureScope;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getMeasureScope()Landroidx/compose/ui/layout/MeasureScope;

    move-result-object p0

    return-object p0
.end method

.method public getModifier()Landroidx/compose/ui/Modifier$Element;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->modifier:Landroidx/compose/ui/Modifier$Element;

    return-object p0
.end method

.method public getParentData()Ljava/lang/Object;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-interface {p0}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final getToBeReusedForSameModifier()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->toBeReusedForSameModifier:Z

    return p0
.end method

.method public getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->wrapped:Landroidx/compose/ui/node/LayoutNodeWrapper;

    return-object p0
.end method

.method public hitTest-M_7yMNQ(JLandroidx/compose/ui/node/HitTestResult;ZZ)V
    .locals 10
    .param p3    # Landroidx/compose/ui/node/HitTestResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/node/HitTestResult<",
            "Landroidx/compose/ui/input/pointer/PointerInputFilter;",
            ">;ZZ)V"
        }
    .end annotation

    const-string v0, "hitTestResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->withinLayerBounds-k-4lQ0M(J)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    if-eqz p4, :cond_3

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getMinimumTouchTargetSize-NH-jbRc()J

    move-result-wide v3

    invoke-virtual {p0, p1, p2, v3, v4}, Landroidx/compose/ui/node/LayoutNodeWrapper;->distanceInMinimumTouchTarget-tz77jQw(JJ)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v3, :cond_3

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v3

    invoke-virtual {v3, p1, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->fromParentPosition-MK-Hz9U(J)J

    move-result-wide v5

    if-eqz p5, :cond_2

    if-eqz v0, :cond_2

    move v9, v1

    goto :goto_1

    :cond_2
    move v9, v2

    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v4

    move-object v7, p3

    move v8, p4

    invoke-virtual/range {v4 .. v9}, Landroidx/compose/ui/node/LayoutNodeWrapper;->hitTest-M_7yMNQ(JLandroidx/compose/ui/node/HitTestResult;ZZ)V

    :cond_3
    return-void
.end method

.method public final hitTestInMinimumTouchTarget-7362WCg(JLandroidx/compose/ui/node/HitTestResult;ZZZLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p3    # Landroidx/compose/ui/node/HitTestResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "Landroidx/compose/ui/node/HitTestResult<",
            "TT;>;ZZZTT;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "hitTestResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->withinLayerBounds-k-4lQ0M(J)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    if-eqz p5, :cond_7

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getMinimumTouchTargetSize-NH-jbRc()J

    move-result-wide p4

    invoke-virtual {p0, p1, p2, p4, p5}, Landroidx/compose/ui/node/LayoutNodeWrapper;->distanceInMinimumTouchTarget-tz77jQw(JJ)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_7

    invoke-virtual {p3, p0, v2}, Landroidx/compose/ui/node/HitTestResult;->isHitInMinimumTouchTargetBetter(FZ)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$1;

    invoke-direct {p1, p8}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, p7, p0, v2, p1}, Landroidx/compose/ui/node/HitTestResult;->hitInMinimumTouchTarget(Ljava/lang/Object;FZLkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->isPointerInBounds-k-4lQ0M(J)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$2;

    invoke-direct {p0, p8, p6}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$2;-><init>(Lkotlin/jvm/functions/Function1;Z)V

    invoke-virtual {p3, p7, p6, p0}, Landroidx/compose/ui/node/HitTestResult;->hit(Ljava/lang/Object;ZLkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_2
    if-nez p5, :cond_3

    const/high16 p0, 0x7f800000    # Float.POSITIVE_INFINITY

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getMinimumTouchTargetSize-NH-jbRc()J

    move-result-wide v3

    invoke-virtual {p0, p1, p2, v3, v4}, Landroidx/compose/ui/node/LayoutNodeWrapper;->distanceInMinimumTouchTarget-tz77jQw(JJ)F

    move-result p0

    :goto_1
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    if-eqz v1, :cond_5

    invoke-virtual {p3, p0, p6}, Landroidx/compose/ui/node/HitTestResult;->isHitInMinimumTouchTargetBetter(FZ)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$3;

    invoke-direct {p1, p8, p6}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$3;-><init>(Lkotlin/jvm/functions/Function1;Z)V

    invoke-virtual {p3, p7, p0, p6, p1}, Landroidx/compose/ui/node/HitTestResult;->hitInMinimumTouchTarget(Ljava/lang/Object;FZLkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_5
    if-eqz p4, :cond_6

    new-instance p1, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$4;

    invoke-direct {p1, p8, p6}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$4;-><init>(Lkotlin/jvm/functions/Function1;Z)V

    invoke-virtual {p3, p7, p0, p6, p1}, Landroidx/compose/ui/node/HitTestResult;->speculativeHit(Ljava/lang/Object;FZLkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_6
    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p8, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_3
    return-void
.end method

.method public hitTestSemantics-9KIMszo(JLandroidx/compose/ui/node/HitTestResult;Z)V
    .locals 5
    .param p3    # Landroidx/compose/ui/node/HitTestResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/node/HitTestResult<",
            "Landroidx/compose/ui/semantics/SemanticsWrapper;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "hitSemanticsWrappers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->withinLayerBounds-k-4lQ0M(J)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getMinimumTouchTargetSize-NH-jbRc()J

    move-result-wide v3

    invoke-virtual {p0, p1, p2, v3, v4}, Landroidx/compose/ui/node/LayoutNodeWrapper;->distanceInMinimumTouchTarget-tz77jQw(JJ)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v3, :cond_3

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v3

    invoke-virtual {v3, p1, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->fromParentPosition-MK-Hz9U(J)J

    move-result-wide p1

    if-eqz p4, :cond_2

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, v1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->hitTestSemantics-9KIMszo(JLandroidx/compose/ui/node/HitTestResult;Z)V

    :cond_3
    return-void
.end method

.method public final isChained()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->isChained:Z

    return p0
.end method

.method public maxIntrinsicHeight(I)I
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    move-result p0

    return p0
.end method

.method public maxIntrinsicWidth(I)I
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result p0

    return p0
.end method

.method public measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->access$setMeasurementConstraints-BRTryo0(Landroidx/compose/ui/node/LayoutNodeWrapper;J)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$measure$1$1;

    invoke-direct {p2, p0, p1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper$measure$1$1;-><init>(Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;Landroidx/compose/ui/layout/Placeable;)V

    invoke-virtual {p0, p2}, Landroidx/compose/ui/node/LayoutNodeWrapper;->setMeasureResult$ui_release(Landroidx/compose/ui/layout/MeasureResult;)V

    return-object p0
.end method

.method public minIntrinsicHeight(I)I
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    move-result p0

    return p0
.end method

.method public minIntrinsicWidth(I)I
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    move-result p0

    return p0
.end method

.method public onInitialize()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->onInitialize()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->setWrappedBy$ui_release(Landroidx/compose/ui/node/LayoutNodeWrapper;)V

    return-void
.end method

.method public performDraw(Landroidx/compose/ui/graphics/Canvas;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->draw(Landroidx/compose/ui/graphics/Canvas;)V

    return-void
.end method

.method public placeAt-f8xVGno(JFLkotlin/jvm/functions/Function1;)V
    .locals 0
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

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/compose/ui/node/LayoutNodeWrapper;->placeAt-f8xVGno(JFLkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getWrappedBy$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNodeWrapper;->isShallowPlacing()Z

    move-result p1

    if-ne p1, p3, :cond_1

    move p2, p3

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->onPlaced()V

    sget-object p1, Landroidx/compose/ui/layout/Placeable$PlacementScope;->Companion:Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredSize-YbymL2g()J

    move-result-wide p2

    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    move-result p2

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getMeasureScope()Landroidx/compose/ui/layout/MeasureScope;

    move-result-object p3

    invoke-interface {p3}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p3

    invoke-static {p1}, Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;->access$getParentWidth(Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;)I

    move-result p4

    invoke-static {p1}, Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;->access$getParentLayoutDirection(Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;)Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p1

    invoke-static {p2}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setParentWidth$cp(I)V

    invoke-static {p3}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setParentLayoutDirection$cp(Landroidx/compose/ui/unit/LayoutDirection;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->getMeasureResult()Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p0

    invoke-interface {p0}, Landroidx/compose/ui/layout/MeasureResult;->placeChildren()V

    invoke-static {p4}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setParentWidth$cp(I)V

    invoke-static {p1}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->access$setParentLayoutDirection$cp(Landroidx/compose/ui/unit/LayoutDirection;)V

    return-void
.end method

.method public final setChained(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->isChained:Z

    return-void
.end method

.method public setModifier(Landroidx/compose/ui/Modifier$Element;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->modifier:Landroidx/compose/ui/Modifier$Element;

    return-void
.end method

.method public final setModifierTo(Landroidx/compose/ui/Modifier$Element;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getModifier()Landroidx/compose/ui/Modifier$Element;

    move-result-object v0

    if-eq p1, v0, :cond_1

    invoke-static {p1}, Landroidx/compose/ui/platform/JvmActuals_jvmKt;->nativeClass(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getModifier()Landroidx/compose/ui/Modifier$Element;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/platform/JvmActuals_jvmKt;->nativeClass(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->setModifier(Landroidx/compose/ui/Modifier$Element;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public final setToBeReusedForSameModifier(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->toBeReusedForSameModifier:Z

    return-void
.end method

.method public setWrapped(Landroidx/compose/ui/node/LayoutNodeWrapper;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/node/LayoutNodeWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->wrapped:Landroidx/compose/ui/node/LayoutNodeWrapper;

    return-void
.end method

.method public shouldSharePointerInputWithSiblings()Z
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;->getWrapped$ui_release()Landroidx/compose/ui/node/LayoutNodeWrapper;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNodeWrapper;->shouldSharePointerInputWithSiblings()Z

    move-result p0

    return p0
.end method
