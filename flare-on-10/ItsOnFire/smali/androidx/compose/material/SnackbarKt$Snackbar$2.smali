.class final Landroidx/compose/material/SnackbarKt$Snackbar$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SnackbarKt;->Snackbar-7zSek6w(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
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

.field public final synthetic $$default:I

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

.field public final synthetic $backgroundColor:J

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

.field public final synthetic $contentColor:J

.field public final synthetic $elevation:F

.field public final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field public final synthetic $shape:Landroidx/compose/ui/graphics/Shape;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$action:Lkotlin/jvm/functions/Function2;

    iput-boolean p3, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$actionOnNewLine:Z

    iput-object p4, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$shape:Landroidx/compose/ui/graphics/Shape;

    iput-wide p5, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$backgroundColor:J

    iput-wide p7, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$contentColor:J

    iput p9, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$elevation:F

    iput-object p10, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$content:Lkotlin/jvm/functions/Function2;

    iput p11, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$$changed:I

    iput p12, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SnackbarKt$Snackbar$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 13
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$action:Lkotlin/jvm/functions/Function2;

    iget-boolean v2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$actionOnNewLine:Z

    iget-object v3, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$shape:Landroidx/compose/ui/graphics/Shape;

    iget-wide v4, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$backgroundColor:J

    iget-wide v6, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$contentColor:J

    iget v8, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$elevation:F

    iget-object v9, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$content:Lkotlin/jvm/functions/Function2;

    iget p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$$changed:I

    or-int/lit8 v11, p2, 0x1

    iget v12, p0, Landroidx/compose/material/SnackbarKt$Snackbar$2;->$$default:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, Landroidx/compose/material/SnackbarKt;->Snackbar-7zSek6w(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
