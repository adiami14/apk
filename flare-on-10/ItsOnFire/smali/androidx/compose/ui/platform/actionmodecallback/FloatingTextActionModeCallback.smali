.class public final Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;
.super Landroid/view/ActionMode$Callback2;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x17
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016J&\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;",
        "Landroid/view/ActionMode$Callback2;",
        "callback",
        "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;",
        "(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V",
        "onActionItemClicked",
        "",
        "mode",
        "Landroid/view/ActionMode;",
        "item",
        "Landroid/view/MenuItem;",
        "onCreateActionMode",
        "menu",
        "Landroid/view/Menu;",
        "onDestroyActionMode",
        "",
        "onGetContentRect",
        "view",
        "Landroid/view/View;",
        "outRect",
        "Landroid/graphics/Rect;",
        "onPrepareActionMode",
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
.field private final callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/view/ActionMode$Callback2;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    return-void
.end method


# virtual methods
.method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 0
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuItem;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p0, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/Menu;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p0, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p0

    return p0
.end method

.method public onDestroyActionMode(Landroid/view/ActionMode;)V
    .locals 0
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p0, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->onDestroyActionMode()V

    return-void
.end method

.method public onGetContentRect(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p0, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->getRect()Landroidx/compose/ui/geometry/Rect;

    move-result-object p0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result p0

    float-to-int p0, p0

    invoke-virtual {p3, p1, p2, v0, p0}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    return-void
.end method

.method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/Menu;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p0, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->onPrepareActionMode()Z

    move-result p0

    return p0
.end method