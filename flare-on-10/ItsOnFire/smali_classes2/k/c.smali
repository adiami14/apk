.class public final synthetic Lk/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/p1;


# instance fields
.field public final synthetic j:Lk/d;

.field public final synthetic k:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lk/d;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/c;->j:Lk/d;

    iput-object p2, p0, Lk/c;->k:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    iget-object v0, p0, Lk/c;->j:Lk/d;

    iget-object p0, p0, Lk/c;->k:Ljava/lang/Runnable;

    invoke-static {v0, p0}, Lk/d;->v(Lk/d;Ljava/lang/Runnable;)V

    return-void
.end method
