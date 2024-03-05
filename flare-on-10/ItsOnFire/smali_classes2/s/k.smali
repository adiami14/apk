.class public abstract Ls/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008 \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000b8\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Ls/k;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "",
        "j",
        "J",
        "submissionTime",
        "Ls/l;",
        "k",
        "Ls/l;",
        "taskContext",
        "",
        "c",
        "()I",
        "mode",
        "<init>",
        "(JLs/l;)V",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public j:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public k:Ls/l;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Ls/o;->i:Ls/l;

    const-wide/16 v1, 0x0

    invoke-direct {p0, v1, v2, v0}, Ls/k;-><init>(JLs/l;)V

    return-void
.end method

.method public constructor <init>(JLs/l;)V
    .locals 0
    .param p3    # Ls/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ls/k;->j:J

    iput-object p3, p0, Ls/k;->k:Ls/l;

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 0

    iget-object p0, p0, Ls/k;->k:Ls/l;

    invoke-interface {p0}, Ls/l;->f()I

    move-result p0

    return p0
.end method
