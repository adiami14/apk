.class final Landroidx/compose/ui/node/ModifierLocalConsumerNode$Companion$onReadValuesChanged$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/node/ModifierLocalConsumerNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/node/ModifierLocalConsumerNode;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "node",
        "Landroidx/compose/ui/node/ModifierLocalConsumerNode;",
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


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/node/ModifierLocalConsumerNode$Companion$onReadValuesChanged$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/node/ModifierLocalConsumerNode$Companion$onReadValuesChanged$1;

    invoke-direct {v0}, Landroidx/compose/ui/node/ModifierLocalConsumerNode$Companion$onReadValuesChanged$1;-><init>()V

    sput-object v0, Landroidx/compose/ui/node/ModifierLocalConsumerNode$Companion$onReadValuesChanged$1;->INSTANCE:Landroidx/compose/ui/node/ModifierLocalConsumerNode$Companion$onReadValuesChanged$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/node/ModifierLocalConsumerNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/ModifierLocalConsumerNode$Companion$onReadValuesChanged$1;->invoke(Landroidx/compose/ui/node/ModifierLocalConsumerNode;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/node/ModifierLocalConsumerNode;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/node/ModifierLocalConsumerNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "node"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/compose/ui/node/ModifierLocalConsumerNode;->access$notifyConsumerOfChanges(Landroidx/compose/ui/node/ModifierLocalConsumerNode;)V

    return-void
.end method
