.class public final Lf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Lf/e;",
        "",
        "",
        "id",
        "",
        "m",
        "Landroid/media/SoundPool;",
        "a",
        "Landroid/media/SoundPool;",
        "soundPool",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "b",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final b:Lf/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:I

.field public static d:I

.field public static e:I

.field public static f:I

.field public static g:I

.field public static h:I

.field public static i:I


# instance fields
.field public final a:Landroid/media/SoundPool;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf/e;->b:Lf/e$a;

    const/16 v0, 0x8

    sput v0, Lf/e;->c:I

    const/4 v0, -0x1

    sput v0, Lf/e;->d:I

    sput v0, Lf/e;->e:I

    sput v0, Lf/e;->f:I

    sput v0, Lf/e;->g:I

    sput v0, Lf/e;->h:I

    sput v0, Lf/e;->i:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "assetManager.openFd(\"damageshelter.ogg\")"

    const-string v1, "damageshelter.ogg"

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Landroid/media/SoundPool;

    const/16 v3, 0xa

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Landroid/media/SoundPool;-><init>(III)V

    iput-object v2, p0, Lf/e;->a:Landroid/media/SoundPool;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    const-string p1, "shoot.ogg"

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    const-string v3, "assetManager.openFd(\"shoot.ogg\")"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v5}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p1

    sput p1, Lf/e;->f:I

    const-string p1, "invaderexplode.ogg"

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    const-string v3, "assetManager.openFd(\"invaderexplode.ogg\")"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v5}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p1

    sput p1, Lf/e;->e:I

    invoke-virtual {p0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v5}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p1

    sput p1, Lf/e;->g:I

    const-string p1, "playerexplode.ogg"

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    const-string v3, "assetManager.openFd(\"playerexplode.ogg\")"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v5}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p1

    sput p1, Lf/e;->d:I

    invoke-virtual {p0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v5}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p1

    sput p1, Lf/e;->g:I

    const-string p1, "uh.ogg"

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    const-string v0, "assetManager.openFd(\"uh.ogg\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v5}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p1

    sput p1, Lf/e;->h:I

    const-string p1, "oh.ogg"

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p0

    const-string p1, "assetManager.openFd(\"oh.ogg\")"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p0, v5}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p0

    sput p0, Lf/e;->i:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "error"

    const-string p1, "failed to load sound files"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lf/e;->g:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, Lf/e;->e:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Lf/e;->i:I

    return v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, Lf/e;->d:I

    return v0
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, Lf/e;->f:I

    return v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, Lf/e;->h:I

    return v0
.end method

.method public static final synthetic g(I)V
    .locals 0

    sput p0, Lf/e;->g:I

    return-void
.end method

.method public static final synthetic h(I)V
    .locals 0

    sput p0, Lf/e;->e:I

    return-void
.end method

.method public static final synthetic i(I)V
    .locals 0

    sput p0, Lf/e;->i:I

    return-void
.end method

.method public static final synthetic j(I)V
    .locals 0

    sput p0, Lf/e;->d:I

    return-void
.end method

.method public static final synthetic k(I)V
    .locals 0

    sput p0, Lf/e;->f:I

    return-void
.end method

.method public static final synthetic l(I)V
    .locals 0

    sput p0, Lf/e;->h:I

    return-void
.end method


# virtual methods
.method public final m(I)V
    .locals 7

    iget-object v0, p0, Lf/e;->a:Landroid/media/SoundPool;

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move v1, p1

    invoke-virtual/range {v0 .. v6}, Landroid/media/SoundPool;->play(IFFIIF)I

    return-void
.end method
