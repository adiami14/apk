.class final Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/BorderKt;->drawRoundRectBorder-SYlcjDY(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $borderSize:J

.field public final synthetic $borderStroke:Landroidx/compose/ui/graphics/drawscope/Stroke;

.field public final synthetic $brush:Landroidx/compose/ui/graphics/Brush;

.field public final synthetic $cornerRadius:J

.field public final synthetic $fillArea:Z

.field public final synthetic $halfStroke:F

.field public final synthetic $strokeWidth:F

.field public final synthetic $topLeft:J


# direct methods
.method public constructor <init>(ZLandroidx/compose/ui/graphics/Brush;JFFJJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$fillArea:Z

    iput-object p2, p0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$brush:Landroidx/compose/ui/graphics/Brush;

    iput-wide p3, p0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$cornerRadius:J

    iput p5, p0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$halfStroke:F

    iput p6, p0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$strokeWidth:F

    iput-wide p7, p0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$topLeft:J

    iput-wide p9, p0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$borderSize:J

    iput-object p11, p0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$borderStroke:Landroidx/compose/ui/graphics/drawscope/Stroke;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->invoke(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 19
    .param p1    # Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "$this$onDrawWithContent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    iget-boolean v1, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$fillArea:Z

    if-eqz v1, :cond_0

    iget-object v3, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$brush:Landroidx/compose/ui/graphics/Brush;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    iget-wide v8, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$cornerRadius:J

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xf6

    const/4 v15, 0x0

    move-object/from16 v2, p1

    :goto_0
    invoke-static/range {v2 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope$DefaultImpls;->drawRoundRect-ZuiqVtQ$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    iget-wide v3, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$cornerRadius:J

    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/CornerRadius;->getX-impl(J)F

    move-result v1

    iget v3, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$halfStroke:F

    cmpg-float v1, v1, v3

    if-gez v1, :cond_1

    iget v6, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$strokeWidth:F

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v1

    iget v3, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$strokeWidth:F

    sub-float v7, v1, v3

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v1

    iget v3, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$strokeWidth:F

    sub-float v8, v1, v3

    sget-object v1, Landroidx/compose/ui/graphics/ClipOp;->Companion:Landroidx/compose/ui/graphics/ClipOp$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/ClipOp$Companion;->getDifference-rtfAjoo()I

    move-result v9

    iget-object v3, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$brush:Landroidx/compose/ui/graphics/Brush;

    iget-wide v0, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$cornerRadius:J

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v15

    invoke-interface {v15}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    move-result-wide v13

    invoke-interface {v15}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/ui/graphics/Canvas;->save()V

    invoke-interface {v15}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v4

    move v5, v6

    invoke-interface/range {v4 .. v9}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->clipRect-N_I0leg(FFFFI)V

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xf6

    const/16 v18, 0x0

    move-object/from16 v2, p1

    move-wide v8, v0

    move-wide v0, v13

    move/from16 v13, v16

    move/from16 v14, v17

    move-object/from16 p0, v15

    move-object/from16 v15, v18

    invoke-static/range {v2 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope$DefaultImpls;->drawRoundRect-ZuiqVtQ$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$brush:Landroidx/compose/ui/graphics/Brush;

    iget-wide v4, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$topLeft:J

    iget-wide v6, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$borderSize:J

    iget-wide v8, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$cornerRadius:J

    invoke-static {v8, v9, v3}, Landroidx/compose/foundation/BorderKt;->access$shrink-Kibmq7A(JF)J

    move-result-wide v8

    const/4 v10, 0x0

    iget-object v11, v0, Landroidx/compose/foundation/BorderKt$drawRoundRectBorder$1;->$borderStroke:Landroidx/compose/ui/graphics/drawscope/Stroke;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xd0

    const/4 v15, 0x0

    move-object/from16 v2, p1

    move-object v3, v1

    goto/16 :goto_0

    :goto_1
    return-void
.end method
