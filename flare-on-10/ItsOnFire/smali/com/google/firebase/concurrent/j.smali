.class public final synthetic Lcom/google/firebase/concurrent/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

.field public final synthetic k:Ljava/lang/Runnable;

.field public final synthetic l:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/concurrent/j;->j:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

    iput-object p2, p0, Lcom/google/firebase/concurrent/j;->k:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/google/firebase/concurrent/j;->l:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/concurrent/j;->j:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

    iget-object v1, p0, Lcom/google/firebase/concurrent/j;->k:Ljava/lang/Runnable;

    iget-object p0, p0, Lcom/google/firebase/concurrent/j;->l:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;

    invoke-static {v0, v1, p0}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->k(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V

    return-void
.end method
