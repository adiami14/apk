.class final Landroidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic $$this$callbackFlow:Ll/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/g0<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $view:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/g0;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/g0<",
            "-",
            "Landroid/graphics/Rect;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1;->$$this$callbackFlow:Ll/g0;

    iput-object p2, p0, Landroidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1;->$view:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollChanged()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1;->$$this$callbackFlow:Ll/g0;

    iget-object p0, p0, Landroidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1;->$view:Landroid/view/View;

    invoke-static {p0}, Landroidx/activity/PipHintTrackerKt;->access$trackPipAnimationHintView$positionInWindow(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p0

    invoke-interface {v0, p0}, Ll/m0;->offer(Ljava/lang/Object;)Z

    return-void
.end method
