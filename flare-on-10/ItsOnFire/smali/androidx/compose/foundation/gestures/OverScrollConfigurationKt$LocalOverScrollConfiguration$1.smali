.class final Landroidx/compose/foundation/gestures/OverScrollConfigurationKt$LocalOverScrollConfiguration$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/gestures/OverScrollConfigurationKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/compose/foundation/gestures/OverScrollConfiguration;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/gestures/OverScrollConfiguration;",
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
.field public static final INSTANCE:Landroidx/compose/foundation/gestures/OverScrollConfigurationKt$LocalOverScrollConfiguration$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/OverScrollConfigurationKt$LocalOverScrollConfiguration$1;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/OverScrollConfigurationKt$LocalOverScrollConfiguration$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/OverScrollConfigurationKt$LocalOverScrollConfiguration$1;->INSTANCE:Landroidx/compose/foundation/gestures/OverScrollConfigurationKt$LocalOverScrollConfiguration$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/foundation/gestures/OverScrollConfiguration;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance p0, Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/gestures/OverScrollConfiguration;-><init>(JZLandroidx/compose/foundation/layout/PaddingValues;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/OverScrollConfigurationKt$LocalOverScrollConfiguration$1;->invoke()Landroidx/compose/foundation/gestures/OverScrollConfiguration;

    move-result-object p0

    return-object p0
.end method
