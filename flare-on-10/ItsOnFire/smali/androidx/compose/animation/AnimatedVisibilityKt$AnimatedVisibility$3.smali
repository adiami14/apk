.class final Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
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


# static fields
.field public static final INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;

    invoke-direct {v0}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;-><init>()V

    sput-object v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;->INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Z)Ljava/lang/Boolean;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;->invoke(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
