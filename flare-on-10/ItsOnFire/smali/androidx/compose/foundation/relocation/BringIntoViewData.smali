.class final Landroidx/compose/foundation/relocation/BringIntoViewData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0083\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/compose/foundation/relocation/BringIntoViewData;",
        "",
        "bringRectangleOnScreenRequester",
        "Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;",
        "parent",
        "Landroidx/compose/foundation/relocation/BringIntoViewResponder;",
        "layoutCoordinates",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;)V",
        "getBringRectangleOnScreenRequester",
        "()Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;",
        "getLayoutCoordinates",
        "()Landroidx/compose/ui/layout/LayoutCoordinates;",
        "setLayoutCoordinates",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;)V",
        "getParent",
        "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;",
        "setParent",
        "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/relocation/BringIntoViewResponder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "bringRectangleOnScreenRequester"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    iput-object p3, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Landroidx/compose/foundation/relocation/BringIntoViewResponder;->Companion:Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;

    invoke-virtual {p2}, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;->getRootBringIntoViewResponder()Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/relocation/BringIntoViewData;-><init>(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;)V

    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/relocation/BringIntoViewData;Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;ILjava/lang/Object;)Landroidx/compose/foundation/relocation/BringIntoViewData;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/relocation/BringIntoViewData;->copy(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/foundation/relocation/BringIntoViewData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    return-object p0
.end method

.method public final component2()Landroidx/compose/foundation/relocation/BringIntoViewResponder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    return-object p0
.end method

.method public final component3()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-object p0
.end method

.method public final copy(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/foundation/relocation/BringIntoViewData;
    .locals 0
    .param p1    # Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/relocation/BringIntoViewResponder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "bringRectangleOnScreenRequester"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "parent"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Landroidx/compose/foundation/relocation/BringIntoViewData;

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/relocation/BringIntoViewData;-><init>(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/relocation/BringIntoViewData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/relocation/BringIntoViewData;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    iget-object v3, p1, Landroidx/compose/foundation/relocation/BringIntoViewData;->bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    iget-object v3, p1, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    iget-object p1, p1, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBringRectangleOnScreenRequester()Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    return-object p0
.end method

.method public final getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-object p0
.end method

.method public final getParent()Landroidx/compose/foundation/relocation/BringIntoViewResponder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    return-object p0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    :goto_0
    add-int/2addr v0, p0

    return v0
.end method

.method public final setLayoutCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-void
.end method

.method public final setParent(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/relocation/BringIntoViewResponder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BringIntoViewData(bringRectangleOnScreenRequester="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->bringRectangleOnScreenRequester:Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->parent:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layoutCoordinates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/compose/foundation/relocation/BringIntoViewData;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
