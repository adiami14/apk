.class public final Lt/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/b;->p(JLkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "run",
        "()V",
        "j/k3$a",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic j:Lt/b;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lt/b;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lt/b$e;->j:Lt/b;

    iput-object p2, p0, Lt/b$e;->k:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lt/b$e;->j:Lt/b;

    invoke-virtual {v0}, Lt/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt/b$e;->k:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lt/b$e;->j:Lt/b;

    invoke-virtual {p0}, Lt/b;->o()Lkotlin/coroutines/Continuation;

    move-result-object p0

    invoke-static {v0, p0}, Lr/a;->d(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-void
.end method
