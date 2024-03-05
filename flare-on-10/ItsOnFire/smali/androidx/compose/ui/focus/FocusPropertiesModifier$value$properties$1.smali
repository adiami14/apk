.class public final Landroidx/compose/ui/focus/FocusPropertiesModifier$value$properties$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/FocusProperties;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusPropertiesModifier;->getValue()Landroidx/compose/ui/focus/FocusProperties;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "androidx/compose/ui/focus/FocusPropertiesModifier$value$properties$1",
        "Landroidx/compose/ui/focus/FocusProperties;",
        "canFocus",
        "",
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


# instance fields
.field private canFocus:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroidx/compose/ui/focus/DefaultFocusProperties;->INSTANCE:Landroidx/compose/ui/focus/DefaultFocusProperties;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/DefaultFocusProperties;->getCanFocus()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/compose/ui/focus/FocusPropertiesModifier$value$properties$1;->canFocus:Z

    return-void
.end method


# virtual methods
.method public getCanFocus()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/focus/FocusPropertiesModifier$value$properties$1;->canFocus:Z

    return p0
.end method

.method public setCanFocus(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusPropertiesModifier$value$properties$1;->canFocus:Z

    return-void
.end method
