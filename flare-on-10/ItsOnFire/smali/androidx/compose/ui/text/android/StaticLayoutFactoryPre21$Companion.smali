.class public final Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21$Companion;",
        "",
        "()V",
        "isInitialized",
        "",
        "staticLayoutConstructor",
        "Ljava/lang/reflect/Constructor;",
        "Landroid/text/StaticLayout;",
        "getStaticLayoutConstructor",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getStaticLayoutConstructor(Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21$Companion;)Ljava/lang/reflect/Constructor;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21$Companion;->getStaticLayoutConstructor()Ljava/lang/reflect/Constructor;

    move-result-object p0

    return-object p0
.end method

.method private final getStaticLayoutConstructor()Ljava/lang/reflect/Constructor;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor<",
            "Landroid/text/StaticLayout;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;->access$isInitialized$cp()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;->access$getStaticLayoutConstructor$cp()Ljava/lang/reflect/Constructor;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x1

    invoke-static {p0}, Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;->access$setInitialized$cp(Z)V

    :try_start_0
    const-class v0, Landroid/text/StaticLayout;

    const/16 v1, 0xd

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Ljava/lang/CharSequence;

    aput-object v3, v1, v2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, p0

    const/4 p0, 0x2

    aput-object v2, v1, p0

    const/4 p0, 0x3

    const-class v3, Landroid/text/TextPaint;

    aput-object v3, v1, p0

    const/4 p0, 0x4

    aput-object v2, v1, p0

    const/4 p0, 0x5

    const-class v3, Landroid/text/Layout$Alignment;

    aput-object v3, v1, p0

    const/4 p0, 0x6

    const-class v3, Landroid/text/TextDirectionHeuristic;

    aput-object v3, v1, p0

    const/4 p0, 0x7

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, p0

    const/16 p0, 0x8

    aput-object v3, v1, p0

    const/16 p0, 0x9

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, p0

    const/16 p0, 0xa

    const-class v3, Landroid/text/TextUtils$TruncateAt;

    aput-object v3, v1, p0

    const/16 p0, 0xb

    aput-object v2, v1, p0

    const/16 p0, 0xc

    aput-object v2, v1, p0

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;->access$setStaticLayoutConstructor$cp(Ljava/lang/reflect/Constructor;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    invoke-static {p0}, Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;->access$setStaticLayoutConstructor$cp(Ljava/lang/reflect/Constructor;)V

    const-string p0, "StaticLayoutFactory"

    const-string v0, "unable to collect necessary constructor."

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-static {}, Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;->access$getStaticLayoutConstructor$cp()Ljava/lang/reflect/Constructor;

    move-result-object p0

    return-object p0
.end method
