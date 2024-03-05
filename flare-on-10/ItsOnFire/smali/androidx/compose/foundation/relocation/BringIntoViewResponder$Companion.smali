.class public final Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/relocation/BringIntoViewResponder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;",
        "",
        "()V",
        "ModifierLocalBringIntoViewResponder",
        "Landroidx/compose/ui/modifier/ProvidableModifierLocal;",
        "Landroidx/compose/foundation/relocation/BringIntoViewResponder;",
        "getModifierLocalBringIntoViewResponder",
        "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;",
        "RootBringIntoViewResponder",
        "getRootBringIntoViewResponder",
        "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;",
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


# static fields
.field public static final synthetic $$INSTANCE:Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;

.field private static final ModifierLocalBringIntoViewResponder:Landroidx/compose/ui/modifier/ProvidableModifierLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/modifier/ProvidableModifierLocal<",
            "Landroidx/compose/foundation/relocation/BringIntoViewResponder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final RootBringIntoViewResponder:Landroidx/compose/foundation/relocation/BringIntoViewResponder;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;

    invoke-direct {v0}, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;-><init>()V

    sput-object v0, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;->$$INSTANCE:Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;

    sget-object v0, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion$ModifierLocalBringIntoViewResponder$1;->INSTANCE:Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion$ModifierLocalBringIntoViewResponder$1;

    invoke-static {v0}, Landroidx/compose/ui/modifier/ModifierLocalKt;->modifierLocalOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;->ModifierLocalBringIntoViewResponder:Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    new-instance v0, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion$RootBringIntoViewResponder$1;

    invoke-direct {v0}, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion$RootBringIntoViewResponder$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;->RootBringIntoViewResponder:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getModifierLocalBringIntoViewResponder()Landroidx/compose/ui/modifier/ProvidableModifierLocal;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/modifier/ProvidableModifierLocal<",
            "Landroidx/compose/foundation/relocation/BringIntoViewResponder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;->ModifierLocalBringIntoViewResponder:Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    return-object p0
.end method

.method public final getRootBringIntoViewResponder()Landroidx/compose/foundation/relocation/BringIntoViewResponder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;->RootBringIntoViewResponder:Landroidx/compose/foundation/relocation/BringIntoViewResponder;

    return-object p0
.end method
