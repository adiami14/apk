.class final Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
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
.field public final synthetic $drawerState:Landroidx/compose/material/BottomDrawerState;

.field public final synthetic $scope:Lj/u0;


# direct methods
.method public constructor <init>(Landroidx/compose/material/BottomDrawerState;Lj/u0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1;->$drawerState:Landroidx/compose/material/BottomDrawerState;

    iput-object p2, p0, Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1;->$scope:Lj/u0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1;->$drawerState:Landroidx/compose/material/BottomDrawerState;

    invoke-virtual {v0}, Landroidx/compose/material/SwipeableState;->getConfirmStateChange$material_release()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    sget-object v1, Landroidx/compose/material/BottomDrawerValue;->Closed:Landroidx/compose/material/BottomDrawerValue;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1;->$scope:Lj/u0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1$1;

    iget-object p0, p0, Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1;->$drawerState:Landroidx/compose/material/BottomDrawerState;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1$1;-><init>(Landroidx/compose/material/BottomDrawerState;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lj/j;->e(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lj/n2;

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/material/DrawerKt$BottomDrawer$1$1$4$1;->invoke()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
