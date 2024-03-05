.class public final Landroidx/compose/ui/focus/DefaultFocusProperties;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/FocusProperties;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e\u00a2\u0006\u0012\u0012\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/focus/DefaultFocusProperties;",
        "Landroidx/compose/ui/focus/FocusProperties;",
        "()V",
        "value",
        "",
        "canFocus",
        "getCanFocus$annotations",
        "getCanFocus",
        "()Z",
        "setCanFocus",
        "(Z)V",
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
.field public static final INSTANCE:Landroidx/compose/ui/focus/DefaultFocusProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/focus/DefaultFocusProperties;

    invoke-direct {v0}, Landroidx/compose/ui/focus/DefaultFocusProperties;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/DefaultFocusProperties;->INSTANCE:Landroidx/compose/ui/focus/DefaultFocusProperties;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getCanFocus$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public getCanFocus()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public setCanFocus(Z)V
    .locals 0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Attempting to change DefaultFocusProperties"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
