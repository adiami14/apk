.class final Landroidx/compose/material/DrawerKt$ModalDrawer$1$2$5$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/DrawerKt$ModalDrawer$1;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/unit/Density;",
        "Landroidx/compose/ui/unit/IntOffset;",
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
.field public final synthetic $drawerState:Landroidx/compose/material/DrawerState;


# direct methods
.method public constructor <init>(Landroidx/compose/material/DrawerState;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/DrawerKt$ModalDrawer$1$2$5$1;->$drawerState:Landroidx/compose/material/DrawerState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/unit/Density;

    invoke-virtual {p0, p1}, Landroidx/compose/material/DrawerKt$ModalDrawer$1$2$5$1;->invoke-Bjo55l4(Landroidx/compose/ui/unit/Density;)J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/compose/ui/unit/IntOffset;->box-impl(J)Landroidx/compose/ui/unit/IntOffset;

    move-result-object p0

    return-object p0
.end method

.method public final invoke-Bjo55l4(Landroidx/compose/ui/unit/Density;)J
    .locals 1
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$offset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/compose/material/DrawerKt$ModalDrawer$1$2$5$1;->$drawerState:Landroidx/compose/material/DrawerState;

    invoke-virtual {p0}, Landroidx/compose/material/DrawerState;->getOffset()Landroidx/compose/runtime/State;

    move-result-object p0

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    move-result-wide p0

    return-wide p0
.end method
