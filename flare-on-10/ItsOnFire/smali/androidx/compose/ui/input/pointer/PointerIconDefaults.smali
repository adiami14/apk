.class public final Landroidx/compose/ui/input/pointer/PointerIconDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Landroidx/compose/ui/ExperimentalComposeUiApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0006\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/PointerIconDefaults;",
        "",
        "()V",
        "Crosshair",
        "Landroidx/compose/ui/input/pointer/PointerIcon;",
        "getCrosshair",
        "()Landroidx/compose/ui/input/pointer/PointerIcon;",
        "Default",
        "getDefault",
        "Hand",
        "getHand",
        "Text",
        "getText",
        "ui_release"
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
.field public static final $stable:I

.field private static final Crosshair:Landroidx/compose/ui/input/pointer/PointerIcon;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final Default:Landroidx/compose/ui/input/pointer/PointerIcon;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final Hand:Landroidx/compose/ui/input/pointer/PointerIcon;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Landroidx/compose/ui/input/pointer/PointerIconDefaults;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final Text:Landroidx/compose/ui/input/pointer/PointerIcon;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;

    invoke-direct {v0}, Landroidx/compose/ui/input/pointer/PointerIconDefaults;-><init>()V

    sput-object v0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->INSTANCE:Landroidx/compose/ui/input/pointer/PointerIconDefaults;

    invoke-static {}, Landroidx/compose/ui/input/pointer/PointerIcon_androidKt;->getPointerIconDefault()Landroidx/compose/ui/input/pointer/PointerIcon;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->Default:Landroidx/compose/ui/input/pointer/PointerIcon;

    invoke-static {}, Landroidx/compose/ui/input/pointer/PointerIcon_androidKt;->getPointerIconCrosshair()Landroidx/compose/ui/input/pointer/PointerIcon;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->Crosshair:Landroidx/compose/ui/input/pointer/PointerIcon;

    invoke-static {}, Landroidx/compose/ui/input/pointer/PointerIcon_androidKt;->getPointerIconText()Landroidx/compose/ui/input/pointer/PointerIcon;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->Text:Landroidx/compose/ui/input/pointer/PointerIcon;

    invoke-static {}, Landroidx/compose/ui/input/pointer/PointerIcon_androidKt;->getPointerIconHand()Landroidx/compose/ui/input/pointer/PointerIcon;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->Hand:Landroidx/compose/ui/input/pointer/PointerIcon;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCrosshair()Landroidx/compose/ui/input/pointer/PointerIcon;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->Crosshair:Landroidx/compose/ui/input/pointer/PointerIcon;

    return-object p0
.end method

.method public final getDefault()Landroidx/compose/ui/input/pointer/PointerIcon;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->Default:Landroidx/compose/ui/input/pointer/PointerIcon;

    return-object p0
.end method

.method public final getHand()Landroidx/compose/ui/input/pointer/PointerIcon;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->Hand:Landroidx/compose/ui/input/pointer/PointerIcon;

    return-object p0
.end method

.method public final getText()Landroidx/compose/ui/input/pointer/PointerIcon;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/ui/input/pointer/PointerIconDefaults;->Text:Landroidx/compose/ui/input/pointer/PointerIcon;

    return-object p0
.end method
