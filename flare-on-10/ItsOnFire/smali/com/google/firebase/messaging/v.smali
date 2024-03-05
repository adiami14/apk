.class public final synthetic Lcom/google/firebase/messaging/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/firebase/messaging/ImageDownload;

.field public final synthetic k:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/ImageDownload;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/v;->j:Lcom/google/firebase/messaging/ImageDownload;

    iput-object p2, p0, Lcom/google/firebase/messaging/v;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/v;->j:Lcom/google/firebase/messaging/ImageDownload;

    iget-object p0, p0, Lcom/google/firebase/messaging/v;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, p0}, Lcom/google/firebase/messaging/ImageDownload;->a(Lcom/google/firebase/messaging/ImageDownload;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
