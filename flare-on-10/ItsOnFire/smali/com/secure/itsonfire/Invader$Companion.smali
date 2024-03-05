.class public final Lcom/secure/itsonfire/Invader$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/secure/itsonfire/Invader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0006\"\u0004\u0008\u000b\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/secure/itsonfire/Invader$Companion;",
        "",
        "()V",
        "bitmap1",
        "Landroid/graphics/Bitmap;",
        "getBitmap1",
        "()Landroid/graphics/Bitmap;",
        "setBitmap1",
        "(Landroid/graphics/Bitmap;)V",
        "bitmap2",
        "getBitmap2",
        "setBitmap2",
        "numberOfInvaders",
        "",
        "getNumberOfInvaders",
        "()I",
        "setNumberOfInvaders",
        "(I)V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/secure/itsonfire/Invader$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBitmap1()Landroid/graphics/Bitmap;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Lcom/secure/itsonfire/Invader;->bitmap1:Landroid/graphics/Bitmap;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "bitmap1"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final getBitmap2()Landroid/graphics/Bitmap;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Lcom/secure/itsonfire/Invader;->bitmap2:Landroid/graphics/Bitmap;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "bitmap2"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final getNumberOfInvaders()I
    .locals 0

    invoke-static {}, Lcom/secure/itsonfire/Invader;->access$getNumberOfInvaders$cp()I

    move-result p0

    return p0
.end method

.method public final setBitmap1(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "<set-?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/secure/itsonfire/Invader;->bitmap1:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final setBitmap2(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "<set-?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/secure/itsonfire/Invader;->bitmap2:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final setNumberOfInvaders(I)V
    .locals 0

    invoke-static {p1}, Lcom/secure/itsonfire/Invader;->access$setNumberOfInvaders$cp(I)V

    return-void
.end method
