.class final Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/LazyGridKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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

.field public final synthetic $cells:Landroidx/compose/foundation/lazy/GridCells;

.field public final synthetic $content:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/foundation/lazy/LazyGridScope;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic $horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field public final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field public final synthetic $state:Landroidx/compose/foundation/lazy/LazyListState;

.field public final synthetic $verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/GridCells;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyGridScope;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$cells:Landroidx/compose/foundation/lazy/GridCells;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iput-object p4, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p5, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    iput-object p6, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iput-object p7, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$content:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$$changed:I

    iput p9, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$cells:Landroidx/compose/foundation/lazy/GridCells;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iget-object v4, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    iget-object v5, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iget-object v6, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$content:Lkotlin/jvm/functions/Function1;

    iget p2, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$$changed:I

    or-int/lit8 v8, p2, 0x1

    iget v9, p0, Landroidx/compose/foundation/lazy/LazyGridKt$LazyVerticalGrid$2;->$$default:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/lazy/LazyGridKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method