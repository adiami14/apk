.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u0008\u0000\u00a2\u0006\u0002\u0010\u0002J\r\u0010\"\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u0010$R \u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\r\"\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0013X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!\u00a8\u0006%"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutState;",
        "",
        "()V",
        "itemsProvider",
        "Lkotlin/Function0;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;",
        "getItemsProvider$foundation_release",
        "()Lkotlin/jvm/functions/Function0;",
        "setItemsProvider$foundation_release",
        "(Lkotlin/jvm/functions/Function0;)V",
        "layoutInfo",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;",
        "getLayoutInfo",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;",
        "layoutInfoNonObservable",
        "getLayoutInfoNonObservable$foundation_release",
        "setLayoutInfoNonObservable$foundation_release",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;)V",
        "layoutInfoState",
        "Landroidx/compose/runtime/MutableState;",
        "getLayoutInfoState$foundation_release",
        "()Landroidx/compose/runtime/MutableState;",
        "onPostMeasureListener",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;",
        "getOnPostMeasureListener$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;",
        "setOnPostMeasureListener$foundation_release",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;)V",
        "remeasurement",
        "Landroidx/compose/ui/layout/Remeasurement;",
        "remeasurementModifier",
        "Landroidx/compose/ui/layout/RemeasurementModifier;",
        "getRemeasurementModifier$foundation_release",
        "()Landroidx/compose/ui/layout/RemeasurementModifier;",
        "remeasure",
        "",
        "()Lkotlin/Unit;",
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
.field private itemsProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private layoutInfoNonObservable:Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final layoutInfoState:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private onPostMeasureListener:Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private remeasurement:Landroidx/compose/ui/layout/Remeasurement;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroidx/compose/foundation/lazy/layout/EmptyLazyLayoutInfo;->INSTANCE:Landroidx/compose/foundation/lazy/layout/EmptyLazyLayoutInfo;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->layoutInfoNonObservable:Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;

    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState$remeasurementModifier$1;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutState$remeasurementModifier$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutState;)V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    sget-object v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState$itemsProvider$1;->INSTANCE:Landroidx/compose/foundation/lazy/layout/LazyLayoutState$itemsProvider$1;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->itemsProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static final synthetic access$setRemeasurement$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutState;Landroidx/compose/ui/layout/Remeasurement;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    return-void
.end method


# virtual methods
.method public final getItemsProvider$foundation_release()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->itemsProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public final getLayoutInfo()Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    invoke-interface {p0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;

    return-object p0
.end method

.method public final getLayoutInfoNonObservable$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->layoutInfoNonObservable:Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;

    return-object p0
.end method

.method public final getLayoutInfoState$foundation_release()Landroidx/compose/runtime/MutableState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    return-object p0
.end method

.method public final getOnPostMeasureListener$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->onPostMeasureListener:Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;

    return-object p0
.end method

.method public final getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    return-object p0
.end method

.method public final remeasure()Lkotlin/Unit;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/layout/Remeasurement;->forceRemeasure()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_0
    return-object p0
.end method

.method public final setItemsProvider$foundation_release(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->itemsProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setLayoutInfoNonObservable$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->layoutInfoNonObservable:Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;

    return-void
.end method

.method public final setOnPostMeasureListener$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutState;->onPostMeasureListener:Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;

    return-void
.end method
