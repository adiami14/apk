.class final Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/graphics/vector/VectorPainterKt;->rememberVectorPainter-mlNsNFs(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
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
.field public final synthetic $painter:Landroidx/compose/ui/graphics/vector/VectorPainter;

.field public final synthetic $tintBlendMode:I

.field public final synthetic $tintColor:J


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/vector/VectorPainter;JI)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;->$painter:Landroidx/compose/ui/graphics/vector/VectorPainter;

    iput-wide p2, p0, Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;->$tintColor:J

    iput p4, p0, Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;->$tintBlendMode:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;->$painter:Landroidx/compose/ui/graphics/vector/VectorPainter;

    iget-wide v1, p0, Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;->$tintColor:J

    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Landroidx/compose/ui/graphics/ColorFilter;->Companion:Landroidx/compose/ui/graphics/ColorFilter$Companion;

    iget-wide v2, p0, Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;->$tintColor:J

    iget p0, p0, Landroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$1;->$tintBlendMode:I

    invoke-virtual {v1, v2, v3, p0}, Landroidx/compose/ui/graphics/ColorFilter$Companion;->tint-xETnrds(JI)Landroidx/compose/ui/graphics/ColorFilter;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Landroidx/compose/ui/graphics/vector/VectorPainter;->setIntrinsicColorFilter$ui_release(Landroidx/compose/ui/graphics/ColorFilter;)V

    return-void
.end method
