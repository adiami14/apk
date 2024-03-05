.class public interface abstract Landroidx/compose/foundation/lazy/LazyGridScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/LazyGridScope$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008g\u0018\u00002\u00020\u0001JK\u0010\u0002\u001a\u00020\u00032\u001b\u0008\u0002\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00a2\u0006\u0002\u0008\u00082\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0008\u000b\u00a2\u0006\u0002\u0008\u0008H&\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000cJ}\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f20\u0008\u0002\u0010\u0004\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u000821\u0010\u0014\u001a-\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00030\u0010\u00a2\u0006\u0002\u0008\u000b\u00a2\u0006\u0002\u0008\u0008H&\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/LazyGridScope;",
        "",
        "item",
        "",
        "span",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;",
        "Landroidx/compose/foundation/lazy/GridItemSpan;",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Landroidx/compose/runtime/Composable;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V",
        "items",
        "count",
        "",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "index",
        "itemContent",
        "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V",
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


# virtual methods
.method public abstract item(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;",
            "Landroidx/compose/foundation/lazy/GridItemSpan;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract items(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/foundation/lazy/GridItemSpan;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyItemScope;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method
