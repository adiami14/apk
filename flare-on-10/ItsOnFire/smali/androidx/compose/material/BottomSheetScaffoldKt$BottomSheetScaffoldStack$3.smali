.class final Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/BottomSheetScaffoldKt;->BottomSheetScaffoldStack-SlNgfk0(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/State;ILandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
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
.field public final synthetic $$changed:I

.field public final synthetic $body:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $bottomSheet:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $bottomSheetOffset:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $floatingActionButton:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $floatingActionButtonPosition:I

.field public final synthetic $snackbarHost:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/State;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$body:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$bottomSheet:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$floatingActionButton:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$snackbarHost:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$bottomSheetOffset:Landroidx/compose/runtime/State;

    iput p6, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$floatingActionButtonPosition:I

    iput p7, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$$changed:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$body:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$bottomSheet:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$floatingActionButton:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$snackbarHost:Lkotlin/jvm/functions/Function2;

    iget-object v4, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$bottomSheetOffset:Landroidx/compose/runtime/State;

    iget v5, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$floatingActionButtonPosition:I

    iget p0, p0, Landroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldStack$3;->$$changed:I

    or-int/lit8 v7, p0, 0x1

    move-object v6, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/material/BottomSheetScaffoldKt;->access$BottomSheetScaffoldStack-SlNgfk0(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/State;ILandroidx/compose/runtime/Composer;I)V

    return-void
.end method