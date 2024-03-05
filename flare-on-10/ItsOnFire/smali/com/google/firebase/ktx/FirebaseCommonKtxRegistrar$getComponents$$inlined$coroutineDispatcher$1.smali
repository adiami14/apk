.class public final Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;->getComponents()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/firebase/components/ComponentFactory;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\t\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "T",
        "Lcom/google/firebase/components/ComponentContainer;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lj/o0;",
        "create",
        "(Lcom/google/firebase/components/ComponentContainer;)Lj/o0;",
        "com/google/firebase/ktx/FirebaseKt$coroutineDispatcher$1",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;

    invoke-direct {v0}, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;-><init>()V

    sput-object v0, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;->INSTANCE:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/google/firebase/components/ComponentContainer;)Lj/o0;
    .locals 1

    const-class p0, Lcom/google/firebase/annotations/concurrent/Background;

    const-class v0, Ljava/util/concurrent/Executor;

    invoke-static {p0, v0}, Lcom/google/firebase/components/Qualified;->qualified(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/firebase/components/Qualified;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/google/firebase/components/ComponentContainer;->get(Lcom/google/firebase/components/Qualified;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "c.get(Qualified.qualifie\u2026a, Executor::class.java))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lj/b2;->c(Ljava/util/concurrent/Executor;)Lj/o0;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;->create(Lcom/google/firebase/components/ComponentContainer;)Lj/o0;

    move-result-object p0

    return-object p0
.end method
