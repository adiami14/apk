.class final Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/NavigationRailKt;->NavigationRailItem-0S3VyRs(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V
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

.field public final synthetic $alwaysShowLabel:Z

.field public final synthetic $enabled:Z

.field public final synthetic $icon:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field public final synthetic $label:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field public final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $selected:Z

.field public final synthetic $selectedContentColor:J

.field public final synthetic $unselectedContentColor:J


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "JJII)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$selected:Z

    iput-object p2, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$onClick:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$icon:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$modifier:Landroidx/compose/ui/Modifier;

    iput-boolean p5, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$enabled:Z

    iput-object p6, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$label:Lkotlin/jvm/functions/Function2;

    iput-boolean p7, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$alwaysShowLabel:Z

    iput-object p8, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-wide p9, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$selectedContentColor:J

    iput-wide p11, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$unselectedContentColor:J

    iput p13, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$$changed:I

    iput p14, p0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object v0, p0

    iget-boolean v1, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$selected:Z

    iget-object v2, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$onClick:Lkotlin/jvm/functions/Function0;

    iget-object v3, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$icon:Lkotlin/jvm/functions/Function2;

    iget-object v4, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v5, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$enabled:Z

    iget-object v6, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$label:Lkotlin/jvm/functions/Function2;

    iget-boolean v7, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$alwaysShowLabel:Z

    iget-object v8, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-wide v9, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$selectedContentColor:J

    iget-wide v11, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$unselectedContentColor:J

    iget v13, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$$changed:I

    or-int/lit8 v13, v13, 0x1

    iget v14, v0, Landroidx/compose/material/NavigationRailKt$NavigationRailItem$3;->$$default:I

    move v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move-object v5, v6

    move v6, v7

    move-object v7, v8

    move-wide v8, v9

    move-wide v10, v11

    move-object/from16 v12, p1

    invoke-static/range {v0 .. v14}, Landroidx/compose/material/NavigationRailKt;->NavigationRailItem-0S3VyRs(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
