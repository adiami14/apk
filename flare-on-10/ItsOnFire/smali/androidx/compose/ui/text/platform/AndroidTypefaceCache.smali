.class public final Landroidx/compose/ui/text/platform/AndroidTypefaceCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/text/platform/AndroidTypefaceCache;",
        "",
        "()V",
        "cache",
        "Landroidx/collection/LruCache;",
        "",
        "Landroid/graphics/Typeface;",
        "getKey",
        "context",
        "Landroid/content/Context;",
        "font",
        "Landroidx/compose/ui/text/font/Font;",
        "getOrCreate",
        "ui-text_release"
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
.field public static final INSTANCE:Landroidx/compose/ui/text/platform/AndroidTypefaceCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final cache:Landroidx/collection/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LruCache<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/text/platform/AndroidTypefaceCache;

    invoke-direct {v0}, Landroidx/compose/ui/text/platform/AndroidTypefaceCache;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/platform/AndroidTypefaceCache;->INSTANCE:Landroidx/compose/ui/text/platform/AndroidTypefaceCache;

    new-instance v0, Landroidx/collection/LruCache;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Landroidx/collection/LruCache;-><init>(I)V

    sput-object v0, Landroidx/compose/ui/text/platform/AndroidTypefaceCache;->cache:Landroidx/collection/LruCache;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getKey(Landroid/content/Context;Landroidx/compose/ui/text/font/Font;)Ljava/lang/String;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/font/Font;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "font"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p2, Landroidx/compose/ui/text/font/ResourceFont;

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    new-instance p0, Landroid/util/TypedValue;

    invoke-direct {p0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    check-cast p2, Landroidx/compose/ui/text/font/ResourceFont;

    invoke-virtual {p2}, Landroidx/compose/ui/text/font/ResourceFont;->getResId()I

    move-result p2

    const/4 v1, 0x1

    invoke-virtual {p1, p2, p0, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object p0, p0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string p0, "res:"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    instance-of p0, p2, Landroidx/compose/ui/text/font/AndroidAssetFont;

    if-eqz p0, :cond_2

    check-cast p2, Landroidx/compose/ui/text/font/AndroidAssetFont;

    invoke-virtual {p2}, Landroidx/compose/ui/text/font/AndroidAssetFont;->getPath()Ljava/lang/String;

    move-result-object p0

    const-string p1, "asset:"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    instance-of p0, p2, Landroidx/compose/ui/text/font/AndroidFileFont;

    if-eqz p0, :cond_3

    goto :goto_1

    :cond_3
    instance-of p0, p2, Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;

    if-eqz p0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unknown font type: "

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final getOrCreate(Landroid/content/Context;Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/font/Font;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "font"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/text/platform/AndroidTypefaceCache;->getKey(Landroid/content/Context;Landroidx/compose/ui/text/font/Font;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/compose/ui/text/platform/AndroidTypefaceCache;->cache:Landroidx/collection/LruCache;

    invoke-virtual {v0, p0}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    if-nez v0, :cond_4

    :goto_0
    instance-of v0, p2, Landroidx/compose/ui/text/font/ResourceFont;

    if-eqz v0, :cond_1

    sget-object v0, Landroidx/compose/ui/text/platform/AndroidResourceFontLoaderHelper;->INSTANCE:Landroidx/compose/ui/text/platform/AndroidResourceFontLoaderHelper;

    check-cast p2, Landroidx/compose/ui/text/font/ResourceFont;

    invoke-virtual {p2}, Landroidx/compose/ui/text/font/ResourceFont;->getResId()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/text/platform/AndroidResourceFontLoaderHelper;->create(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of p1, p2, Landroidx/compose/ui/text/font/AndroidFont;

    if-eqz p1, :cond_3

    check-cast p2, Landroidx/compose/ui/text/font/AndroidFont;

    invoke-interface {p2}, Landroidx/compose/ui/text/font/AndroidFont;->getTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    :goto_1
    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    sget-object p2, Landroidx/compose/ui/text/platform/AndroidTypefaceCache;->cache:Landroidx/collection/LruCache;

    invoke-virtual {p2, p0, p1}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Typeface;

    :goto_2
    return-object p1

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unknown font type: "

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-object v0
.end method
