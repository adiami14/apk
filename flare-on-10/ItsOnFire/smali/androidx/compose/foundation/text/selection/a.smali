.class public final synthetic Landroidx/compose/foundation/text/selection/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/layout/LayoutCoordinates;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/selection/a;->a:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/selection/a;->a:Landroidx/compose/ui/layout/LayoutCoordinates;

    check-cast p1, Landroidx/compose/foundation/text/selection/Selectable;

    check-cast p2, Landroidx/compose/foundation/text/selection/Selectable;

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->a(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/foundation/text/selection/Selectable;Landroidx/compose/foundation/text/selection/Selectable;)I

    move-result p0

    return p0
.end method
