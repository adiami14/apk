.class final Landroidx/compose/material/SliderKt$Track$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt;->Track(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V
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

.field public final synthetic $colors:Landroidx/compose/material/SliderColors;

.field public final synthetic $enabled:Z

.field public final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field public final synthetic $positionFractionEnd:F

.field public final synthetic $positionFractionStart:F

.field public final synthetic $thumbPx:F

.field public final synthetic $tickFractions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $trackStrokeWidth:F


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material/SliderColors;",
            "ZFF",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;FFI)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SliderKt$Track$2;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Landroidx/compose/material/SliderKt$Track$2;->$colors:Landroidx/compose/material/SliderColors;

    iput-boolean p3, p0, Landroidx/compose/material/SliderKt$Track$2;->$enabled:Z

    iput p4, p0, Landroidx/compose/material/SliderKt$Track$2;->$positionFractionStart:F

    iput p5, p0, Landroidx/compose/material/SliderKt$Track$2;->$positionFractionEnd:F

    iput-object p6, p0, Landroidx/compose/material/SliderKt$Track$2;->$tickFractions:Ljava/util/List;

    iput p7, p0, Landroidx/compose/material/SliderKt$Track$2;->$thumbPx:F

    iput p8, p0, Landroidx/compose/material/SliderKt$Track$2;->$trackStrokeWidth:F

    iput p9, p0, Landroidx/compose/material/SliderKt$Track$2;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SliderKt$Track$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/material/SliderKt$Track$2;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Landroidx/compose/material/SliderKt$Track$2;->$colors:Landroidx/compose/material/SliderColors;

    iget-boolean v2, p0, Landroidx/compose/material/SliderKt$Track$2;->$enabled:Z

    iget v3, p0, Landroidx/compose/material/SliderKt$Track$2;->$positionFractionStart:F

    iget v4, p0, Landroidx/compose/material/SliderKt$Track$2;->$positionFractionEnd:F

    iget-object v5, p0, Landroidx/compose/material/SliderKt$Track$2;->$tickFractions:Ljava/util/List;

    iget v6, p0, Landroidx/compose/material/SliderKt$Track$2;->$thumbPx:F

    iget v7, p0, Landroidx/compose/material/SliderKt$Track$2;->$trackStrokeWidth:F

    iget p0, p0, Landroidx/compose/material/SliderKt$Track$2;->$$changed:I

    or-int/lit8 v9, p0, 0x1

    move-object v8, p1

    invoke-static/range {v0 .. v9}, Landroidx/compose/material/SliderKt;->access$Track(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V

    return-void
.end method
