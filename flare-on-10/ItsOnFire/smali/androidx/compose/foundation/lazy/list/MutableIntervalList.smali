.class public final Landroidx/compose/foundation/lazy/list/MutableIntervalList;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/list/IntervalList;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/foundation/lazy/list/IntervalList<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001b\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00060\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u000c@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/list/MutableIntervalList;",
        "T",
        "Landroidx/compose/foundation/lazy/list/IntervalList;",
        "()V",
        "_intervals",
        "",
        "Landroidx/compose/foundation/lazy/list/IntervalHolder;",
        "intervals",
        "",
        "getIntervals",
        "()Ljava/util/List;",
        "<set-?>",
        "",
        "totalSize",
        "getTotalSize",
        "()I",
        "add",
        "",
        "size",
        "content",
        "(ILjava/lang/Object;)V",
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


# instance fields
.field private final _intervals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/IntervalHolder<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final intervals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/IntervalHolder<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private totalSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->_intervals:Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->intervals:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/compose/foundation/lazy/list/IntervalHolder;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->getTotalSize()I

    move-result v1

    invoke-direct {v0, v1, p1, p2}, Landroidx/compose/foundation/lazy/list/IntervalHolder;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->getTotalSize()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->totalSize:I

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->_intervals:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getIntervals()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/list/IntervalHolder<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p0, p0, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->intervals:Ljava/util/List;

    return-object p0
.end method

.method public getTotalSize()I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/lazy/list/MutableIntervalList;->totalSize:I

    return p0
.end method
