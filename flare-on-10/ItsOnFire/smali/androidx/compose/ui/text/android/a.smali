.class public final synthetic Landroidx/compose/ui/text/android/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lkotlin/Pair;

    check-cast p2, Lkotlin/Pair;

    invoke-static {p1, p2}, Landroidx/compose/ui/text/android/LayoutIntrinsicsKt;->a(Lkotlin/Pair;Lkotlin/Pair;)I

    move-result p0

    return p0
.end method
