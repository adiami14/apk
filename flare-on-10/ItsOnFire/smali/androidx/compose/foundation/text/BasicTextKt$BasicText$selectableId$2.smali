.class final Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectableId$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/BasicTextKt;->BasicText-4YKlhWE(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Long;",
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
.field public final synthetic $selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectableId$2;->$selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Long;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectableId$2;->$selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->nextSelectableId()J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectableId$2;->invoke()Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method
