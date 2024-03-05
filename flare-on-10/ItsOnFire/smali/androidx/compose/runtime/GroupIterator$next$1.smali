.class public final Landroidx/compose/runtime/GroupIterator$next$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/tooling/CompositionGroup;
.implements Ljava/lang/Iterable;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/GroupIterator;->next()Landroidx/compose/runtime/tooling/CompositionGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/tooling/CompositionGroup;",
        "Ljava/lang/Iterable<",
        "Landroidx/compose/runtime/tooling/CompositionGroup;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00010\u0002J\u000f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0016H\u0096\u0002R\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "androidx/compose/runtime/GroupIterator$next$1",
        "Landroidx/compose/runtime/tooling/CompositionGroup;",
        "",
        "compositionGroups",
        "getCompositionGroups",
        "()Ljava/lang/Iterable;",
        "data",
        "",
        "getData",
        "isEmpty",
        "",
        "()Z",
        "key",
        "getKey",
        "()Ljava/lang/Object;",
        "node",
        "getNode",
        "sourceInfo",
        "",
        "getSourceInfo",
        "()Ljava/lang/String;",
        "iterator",
        "",
        "runtime_release"
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
.field public final synthetic $group:I

.field public final synthetic this$0:Landroidx/compose/runtime/GroupIterator;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/GroupIterator;I)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    iput p2, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCompositionGroups()Ljava/lang/Iterable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Landroidx/compose/runtime/tooling/CompositionGroup;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public getData()Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v0, v1}, Landroidx/compose/runtime/SlotTableKt;->access$dataAnchor([II)I

    move-result v0

    iget v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v2}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/runtime/SlotTable;->getGroupsSize()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v1}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v1

    iget v2, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, Landroidx/compose/runtime/SlotTableKt;->access$dataAnchor([II)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v1}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/SlotTable;->getSlotsSize()I

    move-result v1

    :goto_0
    new-instance v2, Landroidx/compose/runtime/GroupIterator$next$1$data$1;

    iget-object p0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-direct {v2, v0, v1, p0}, Landroidx/compose/runtime/GroupIterator$next$1$data$1;-><init>(IILandroidx/compose/runtime/GroupIterator;)V

    return-object v2
.end method

.method public getKey()Ljava/lang/Object;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v0, v1}, Landroidx/compose/runtime/SlotTableKt;->access$hasObjectKey([II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getSlots()[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v1}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v1

    iget p0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v1, p0}, Landroidx/compose/runtime/SlotTableKt;->access$objectKeyIndex([II)I

    move-result p0

    aget-object p0, v0, p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v0

    iget p0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v0, p0}, Landroidx/compose/runtime/SlotTableKt;->access$key([II)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public getNode()Ljava/lang/Object;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v0, v1}, Landroidx/compose/runtime/SlotTableKt;->access$isNode([II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getSlots()[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v1}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v1

    iget p0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v1, p0}, Landroidx/compose/runtime/SlotTableKt;->access$nodeIndex([II)I

    move-result p0

    aget-object p0, v0, p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public getSourceInfo()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v0, v1}, Landroidx/compose/runtime/SlotTableKt;->access$hasAux([II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getSlots()[Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v2}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v2

    iget p0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v2, p0}, Landroidx/compose/runtime/SlotTableKt;->access$auxIndex([II)I

    move-result p0

    aget-object p0, v0, p0

    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Ljava/lang/String;

    :cond_0
    return-object v1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v0}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v0

    iget p0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v0, p0}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroidx/compose/runtime/tooling/CompositionGroup;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-static {v0}, Landroidx/compose/runtime/GroupIterator;->access$validateRead(Landroidx/compose/runtime/GroupIterator;)V

    new-instance v0, Landroidx/compose/runtime/GroupIterator;

    iget-object v1, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v1}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v1

    iget v2, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    add-int/lit8 v3, v2, 0x1

    iget-object v4, p0, Landroidx/compose/runtime/GroupIterator$next$1;->this$0:Landroidx/compose/runtime/GroupIterator;

    invoke-virtual {v4}, Landroidx/compose/runtime/GroupIterator;->getTable()Landroidx/compose/runtime/SlotTable;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v4

    iget p0, p0, Landroidx/compose/runtime/GroupIterator$next$1;->$group:I

    invoke-static {v4, p0}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result p0

    add-int/2addr v2, p0

    invoke-direct {v0, v1, v3, v2}, Landroidx/compose/runtime/GroupIterator;-><init>(Landroidx/compose/runtime/SlotTable;II)V

    return-object v0
.end method
