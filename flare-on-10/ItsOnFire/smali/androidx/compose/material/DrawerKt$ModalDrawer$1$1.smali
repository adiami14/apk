.class final Landroidx/compose/material/DrawerKt$ModalDrawer$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


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
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/material/DrawerValue;",
        "Landroidx/compose/material/DrawerValue;",
        "Landroidx/compose/material/ThresholdConfig;",
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


# static fields
.field public static final INSTANCE:Landroidx/compose/material/DrawerKt$ModalDrawer$1$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material/DrawerKt$ModalDrawer$1$1;

    invoke-direct {v0}, Landroidx/compose/material/DrawerKt$ModalDrawer$1$1;-><init>()V

    sput-object v0, Landroidx/compose/material/DrawerKt$ModalDrawer$1$1;->INSTANCE:Landroidx/compose/material/DrawerKt$ModalDrawer$1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/material/DrawerValue;Landroidx/compose/material/DrawerValue;)Landroidx/compose/material/ThresholdConfig;
    .locals 0
    .param p1    # Landroidx/compose/material/DrawerValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material/DrawerValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "$noName_0"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "$noName_1"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Landroidx/compose/material/FractionalThreshold;

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-direct {p0, p1}, Landroidx/compose/material/FractionalThreshold;-><init>(F)V

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/material/DrawerValue;

    check-cast p2, Landroidx/compose/material/DrawerValue;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/DrawerKt$ModalDrawer$1$1;->invoke(Landroidx/compose/material/DrawerValue;Landroidx/compose/material/DrawerValue;)Landroidx/compose/material/ThresholdConfig;

    move-result-object p0

    return-object p0
.end method
