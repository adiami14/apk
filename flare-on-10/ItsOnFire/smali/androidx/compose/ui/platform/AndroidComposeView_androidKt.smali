.class public final Landroidx/compose/ui/platform/AndroidComposeView_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a5\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002\u001a!\u0010\u001b\u001a\u00020\u001c*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\"0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\u000c8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006 "
    }
    d2 = {
        "textInputServiceFactory",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/text/input/PlatformTextInputService;",
        "Landroidx/compose/ui/text/input/TextInputService;",
        "getTextInputServiceFactory$annotations",
        "()V",
        "getTextInputServiceFactory",
        "()Lkotlin/jvm/functions/Function1;",
        "setTextInputServiceFactory",
        "(Lkotlin/jvm/functions/Function1;)V",
        "localeLayoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "Landroid/content/res/Configuration;",
        "getLocaleLayoutDirection",
        "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;",
        "dot",
        "",
        "m1",
        "Landroidx/compose/ui/graphics/Matrix;",
        "row",
        "",
        "m2",
        "column",
        "dot-p89u6pk",
        "([FI[FI)F",
        "layoutDirectionFromInt",
        "layoutDirection",
        "preTransform",
        "",
        "other",
        "preTransform-JiSxe2E",
        "([F[F)V",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static textInputServiceFactory:Lkotlin/jvm/functions/Function1;
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/PlatformTextInputService;",
            "+",
            "Landroidx/compose/ui/text/input/TextInputService;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView_androidKt$textInputServiceFactory$1;->INSTANCE:Landroidx/compose/ui/platform/AndroidComposeView_androidKt$textInputServiceFactory$1;

    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->textInputServiceFactory:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final synthetic access$layoutDirectionFromInt(I)Landroidx/compose/ui/unit/LayoutDirection;
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->layoutDirectionFromInt(I)Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$preTransform-JiSxe2E([F[F)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->preTransform-JiSxe2E([F[F)V

    return-void
.end method

.method private static final dot-p89u6pk([FI[FI)F
    .locals 3

    const/4 v0, 0x4

    mul-int/2addr p1, v0

    add-int/lit8 v1, p1, 0x0

    aget v1, p0, v1

    const/4 v2, 0x0

    add-int/2addr v2, p3

    aget v2, p2, v2

    mul-float/2addr v1, v2

    add-int/lit8 v2, p1, 0x1

    aget v2, p0, v2

    add-int/2addr v0, p3

    aget v0, p2, v0

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    add-int/lit8 v0, p1, 0x2

    aget v0, p0, v0

    const/16 v2, 0x8

    add-int/2addr v2, p3

    aget v2, p2, v2

    mul-float/2addr v0, v2

    add-float/2addr v1, v0

    add-int/lit8 p1, p1, 0x3

    aget p0, p0, p1

    const/16 p1, 0xc

    add-int/2addr p1, p3

    aget p1, p2, p1

    mul-float/2addr p0, p1

    add-float/2addr v1, p0

    return v1
.end method

.method public static final getLocaleLayoutDirection(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1
    .param p0    # Landroid/content/res/Configuration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->layoutDirectionFromInt(I)Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p0

    return-object p0
.end method

.method public static final getTextInputServiceFactory()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/text/input/PlatformTextInputService;",
            "Landroidx/compose/ui/text/input/TextInputService;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->textInputServiceFactory:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static synthetic getTextInputServiceFactory$annotations()V
    .locals 0
    .annotation runtime Landroidx/compose/ui/InternalComposeUiApi;
    .end annotation

    return-void
.end method

.method private static final layoutDirectionFromInt(I)Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    :goto_1
    return-object p0
.end method

.method private static final preTransform-JiSxe2E([F[F)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v0, v4}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v5

    const/4 v6, 0x2

    invoke-static {v1, v2, v0, v6}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v7

    const/4 v8, 0x3

    invoke-static {v1, v2, v0, v8}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v9

    invoke-static {v1, v4, v0, v2}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v10

    invoke-static {v1, v4, v0, v4}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v11

    invoke-static {v1, v4, v0, v6}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v12

    invoke-static {v1, v4, v0, v8}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v13

    invoke-static {v1, v6, v0, v2}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v14

    invoke-static {v1, v6, v0, v4}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v15

    invoke-static {v1, v6, v0, v6}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v16

    invoke-static {v1, v6, v0, v8}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v17

    invoke-static {v1, v8, v0, v2}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v18

    invoke-static {v1, v8, v0, v4}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v19

    invoke-static {v1, v8, v0, v6}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v20

    invoke-static {v1, v8, v0, v8}, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->dot-p89u6pk([FI[FI)F

    move-result v1

    aput v3, v0, v2

    aput v5, v0, v4

    aput v7, v0, v6

    aput v9, v0, v8

    const/4 v2, 0x4

    aput v10, v0, v2

    const/4 v2, 0x5

    aput v11, v0, v2

    const/4 v2, 0x6

    aput v12, v0, v2

    const/4 v2, 0x7

    aput v13, v0, v2

    const/16 v2, 0x8

    aput v14, v0, v2

    const/16 v2, 0x9

    aput v15, v0, v2

    const/16 v2, 0xa

    aput v16, v0, v2

    const/16 v2, 0xb

    aput v17, v0, v2

    const/16 v2, 0xc

    aput v18, v0, v2

    const/16 v2, 0xd

    aput v19, v0, v2

    const/16 v2, 0xe

    aput v20, v0, v2

    const/16 v2, 0xf

    aput v1, v0, v2

    return-void
.end method

.method public static final setTextInputServiceFactory(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/PlatformTextInputService;",
            "+",
            "Landroidx/compose/ui/text/input/TextInputService;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, Landroidx/compose/ui/platform/AndroidComposeView_androidKt;->textInputServiceFactory:Lkotlin/jvm/functions/Function1;

    return-void
.end method