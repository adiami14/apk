.class final Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/LazyGridScopeImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LazyGridItemSpanScopeImpl"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0006\"\u0004\u0008\u000b\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u0006\"\u0004\u0008\u000e\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;",
        "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;",
        "()V",
        "itemColumn",
        "",
        "getItemColumn",
        "()I",
        "setItemColumn",
        "(I)V",
        "itemRow",
        "getItemRow",
        "setItemRow",
        "maxCurrentLineSpan",
        "getMaxCurrentLineSpan",
        "setMaxCurrentLineSpan",
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
.field public static final INSTANCE:Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static itemColumn:I

.field private static itemRow:I

.field private static maxCurrentLineSpan:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;

    invoke-direct {v0}, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;-><init>()V

    sput-object v0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->INSTANCE:Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemColumn()I
    .locals 0

    sget p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->itemColumn:I

    return p0
.end method

.method public getItemRow()I
    .locals 0

    sget p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->itemRow:I

    return p0
.end method

.method public getMaxCurrentLineSpan()I
    .locals 0

    sget p0, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->maxCurrentLineSpan:I

    return p0
.end method

.method public setItemColumn(I)V
    .locals 0

    sput p1, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->itemColumn:I

    return-void
.end method

.method public setItemRow(I)V
    .locals 0

    sput p1, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->itemRow:I

    return-void
.end method

.method public setMaxCurrentLineSpan(I)V
    .locals 0

    sput p1, Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;->maxCurrentLineSpan:I

    return-void
.end method
