.class public final Lo/a0$c$b$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/a0$c$b;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0xb0
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2"
    f = "Transform.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xdf,
        0xdf
    }
    m = "emit"
    n = {
        "value",
        "$this$filterNot_u24lambda_u2d1"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public synthetic j:Ljava/lang/Object;

.field public k:I

.field public final synthetic l:Lo/a0$c$b;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo/a0$c$b;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lo/a0$c$b$a;->l:Lo/a0$c$b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lo/a0$c$b$a;->j:Ljava/lang/Object;

    iget p1, p0, Lo/a0$c$b$a;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo/a0$c$b$a;->k:I

    iget-object p1, p0, Lo/a0$c$b$a;->l:Lo/a0$c$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lo/a0$c$b;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
