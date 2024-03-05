.class final Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SnackbarKt$Snackbar$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field public final synthetic $$dirty:I

.field public final synthetic $action:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic $actionOnNewLine:Z

.field public final synthetic $content:Lkotlin/jvm/functions/Function2;
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
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IZ)V
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
            ">;IZ)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$action:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$content:Lkotlin/jvm/functions/Function2;

    iput p3, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$$dirty:I

    iput-boolean p4, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$actionOnNewLine:Z

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    and-int/lit8 p2, p2, 0xb

    xor-int/lit8 p2, p2, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_2

    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$action:Lkotlin/jvm/functions/Function2;

    if-nez p2, :cond_2

    const p2, 0x38f13ba

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$content:Lkotlin/jvm/functions/Function2;

    iget p0, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$$dirty:I

    shr-int/lit8 p0, p0, 0x15

    and-int/lit8 p0, p0, 0xe

    invoke-static {p2, p1, p0}, Landroidx/compose/material/SnackbarKt;->access$TextOnlySnackbar(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto :goto_2

    :cond_2
    iget-boolean p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$actionOnNewLine:Z

    if-eqz p2, :cond_3

    const p2, 0x38f13fb

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$content:Lkotlin/jvm/functions/Function2;

    iget-object v0, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$action:Lkotlin/jvm/functions/Function2;

    iget p0, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$$dirty:I

    shr-int/lit8 v1, p0, 0x15

    and-int/lit8 v1, v1, 0xe

    and-int/lit8 p0, p0, 0x70

    or-int/2addr p0, v1

    invoke-static {p2, v0, p1, p0}, Landroidx/compose/material/SnackbarKt;->access$NewLineButtonSnackbar(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    const p2, 0x38f143e

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$content:Lkotlin/jvm/functions/Function2;

    iget-object v0, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$action:Lkotlin/jvm/functions/Function2;

    iget p0, p0, Landroidx/compose/material/SnackbarKt$Snackbar$1$1$1;->$$dirty:I

    shr-int/lit8 v1, p0, 0x15

    and-int/lit8 v1, v1, 0xe

    and-int/lit8 p0, p0, 0x70

    or-int/2addr p0, v1

    invoke-static {p2, v0, p1, p0}, Landroidx/compose/material/SnackbarKt;->access$OneRowSnackbar(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :goto_2
    return-void
.end method
