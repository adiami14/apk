.class public final Lg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\"\u001a\u0010\u0004\u001a\u00020\u00008\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\"\u001a\u0010\u0006\u001a\u00020\u00008\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0005\u0010\u0003\"\u001a\u0010\u0008\u001a\u00020\u00008\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0003\"\u001a\u0010\n\u001a\u00020\u00008\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u001a\u0004\u0008\t\u0010\u0003\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/Color;",
        "a",
        "J",
        "()J",
        "Purple200",
        "b",
        "Purple500",
        "c",
        "Purple700",
        "d",
        "Teal200",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0xffbb86fcL

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lg/a;->a:J

    const-wide v0, 0xff6200eeL

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lg/a;->b:J

    const-wide v0, 0xff3700b3L

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lg/a;->c:J

    const-wide v0, 0xff03dac5L

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lg/a;->d:J

    return-void
.end method

.method public static final a()J
    .locals 2

    sget-wide v0, Lg/a;->a:J

    return-wide v0
.end method

.method public static final b()J
    .locals 2

    sget-wide v0, Lg/a;->b:J

    return-wide v0
.end method

.method public static final c()J
    .locals 2

    sget-wide v0, Lg/a;->c:J

    return-wide v0
.end method

.method public static final d()J
    .locals 2

    sget-wide v0, Lg/a;->d:J

    return-wide v0
.end method
