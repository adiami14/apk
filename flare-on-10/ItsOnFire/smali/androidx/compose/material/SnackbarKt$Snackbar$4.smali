.class final Landroidx/compose/material/SnackbarKt$Snackbar$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SnackbarKt;->Snackbar-sPrSdHI(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V
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

.field public final synthetic $actionColor:J

.field public final synthetic $actionOnNewLine:Z

.field public final synthetic $backgroundColor:J

.field public final synthetic $contentColor:J

.field public final synthetic $elevation:F

.field public final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field public final synthetic $shape:Landroidx/compose/ui/graphics/Shape;

.field public final synthetic $snackbarData:Landroidx/compose/material/SnackbarData;


# direct methods
.method public constructor <init>(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFII)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$snackbarData:Landroidx/compose/material/SnackbarData;

    iput-object p2, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$modifier:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$actionOnNewLine:Z

    iput-object p4, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$shape:Landroidx/compose/ui/graphics/Shape;

    iput-wide p5, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$backgroundColor:J

    iput-wide p7, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$contentColor:J

    iput-wide p9, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$actionColor:J

    iput p11, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$elevation:F

    iput p12, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$$changed:I

    iput p13, p0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SnackbarKt$Snackbar$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 14
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object v0, p0

    iget-object v1, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$snackbarData:Landroidx/compose/material/SnackbarData;

    iget-object v2, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v3, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$actionOnNewLine:Z

    iget-object v4, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$shape:Landroidx/compose/ui/graphics/Shape;

    iget-wide v5, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$backgroundColor:J

    iget-wide v7, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$contentColor:J

    iget-wide v9, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$actionColor:J

    iget v11, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$elevation:F

    iget v12, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$$changed:I

    or-int/lit8 v12, v12, 0x1

    iget v13, v0, Landroidx/compose/material/SnackbarKt$Snackbar$4;->$$default:I

    move-object v0, v1

    move-object v1, v2

    move v2, v3

    move-object v3, v4

    move-wide v4, v5

    move-wide v6, v7

    move-wide v8, v9

    move v10, v11

    move-object v11, p1

    invoke-static/range {v0 .. v13}, Landroidx/compose/material/SnackbarKt;->Snackbar-sPrSdHI(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
