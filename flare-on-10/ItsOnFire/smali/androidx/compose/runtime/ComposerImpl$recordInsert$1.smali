.class final Landroidx/compose/runtime/ComposerImpl$recordInsert$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/ComposerImpl;->recordInsert(Landroidx/compose/runtime/Anchor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/runtime/Applier<",
        "*>;",
        "Landroidx/compose/runtime/SlotWriter;",
        "Landroidx/compose/runtime/RememberManager;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<anonymous parameter 0>",
        "Landroidx/compose/runtime/Applier;",
        "slots",
        "Landroidx/compose/runtime/SlotWriter;",
        "<anonymous parameter 2>",
        "Landroidx/compose/runtime/RememberManager;",
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
.field public final synthetic $anchor:Landroidx/compose/runtime/Anchor;

.field public final synthetic $insertTable:Landroidx/compose/runtime/SlotTable;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/ComposerImpl$recordInsert$1;->$insertTable:Landroidx/compose/runtime/SlotTable;

    iput-object p2, p0, Landroidx/compose/runtime/ComposerImpl$recordInsert$1;->$anchor:Landroidx/compose/runtime/Anchor;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Applier;

    check-cast p2, Landroidx/compose/runtime/SlotWriter;

    check-cast p3, Landroidx/compose/runtime/RememberManager;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/runtime/ComposerImpl$recordInsert$1;->invoke(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
    .locals 1
    .param p1    # Landroidx/compose/runtime/Applier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/SlotWriter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/RememberManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Applier<",
            "*>;",
            "Landroidx/compose/runtime/SlotWriter;",
            "Landroidx/compose/runtime/RememberManager;",
            ")V"
        }
    .end annotation

    const-string v0, "$noName_0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "slots"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$noName_2"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/compose/runtime/SlotWriter;->beginInsert()V

    iget-object p1, p0, Landroidx/compose/runtime/ComposerImpl$recordInsert$1;->$insertTable:Landroidx/compose/runtime/SlotTable;

    iget-object p0, p0, Landroidx/compose/runtime/ComposerImpl$recordInsert$1;->$anchor:Landroidx/compose/runtime/Anchor;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/Anchor;->toIndexFor(Landroidx/compose/runtime/SlotTable;)I

    move-result p0

    invoke-virtual {p2, p1, p0}, Landroidx/compose/runtime/SlotWriter;->moveFrom(Landroidx/compose/runtime/SlotTable;I)Ljava/util/List;

    invoke-virtual {p2}, Landroidx/compose/runtime/SlotWriter;->endInsert()V

    return-void
.end method