.class public final Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
.field public final synthetic $connection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

.field public final synthetic $resolvedDispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

.field public final synthetic $scope:Lj/u0;

.field private final connection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lj/u0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2$1$1;->$resolvedDispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    iput-object p2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2$1$1;->$connection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    iput-object p3, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2$1$1;->$scope:Lj/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p3}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->setOriginNestedScrollScope$ui_release(Lj/u0;)V

    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2$1$1;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    iput-object p2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2$1$1;->connection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    return-void
.end method


# virtual methods
.method public all(Lkotlin/jvm/functions/Function1;)Z
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/Modifier$Element;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier$DefaultImpls;->all(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;Lkotlin/jvm/functions/Function1;)Z

    move-result p0

    return p0
.end method

.method public any(Lkotlin/jvm/functions/Function1;)Z
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/Modifier$Element;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier$DefaultImpls;->any(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;Lkotlin/jvm/functions/Function1;)Z

    move-result p0

    return p0
.end method

.method public foldIn(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Landroidx/compose/ui/Modifier$Element;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier$DefaultImpls;->foldIn(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public foldOut(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/Modifier$Element;",
            "-TR;+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier$DefaultImpls;->foldOut(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getConnection()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2$1$1;->connection:Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    return-object p0
.end method

.method public getDispatcher()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2$1$1;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    return-object p0
.end method

.method public then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier$DefaultImpls;->then(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
