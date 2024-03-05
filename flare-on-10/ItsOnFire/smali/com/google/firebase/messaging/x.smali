.class public final synthetic Lcom/google/firebase/messaging/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Z

.field public final synthetic l:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/x;->j:Landroid/content/Context;

    iput-boolean p2, p0, Lcom/google/firebase/messaging/x;->k:Z

    iput-object p3, p0, Lcom/google/firebase/messaging/x;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/x;->j:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/google/firebase/messaging/x;->k:Z

    iget-object p0, p0, Lcom/google/firebase/messaging/x;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, p0}, Lcom/google/firebase/messaging/ProxyNotificationInitializer;->a(Landroid/content/Context;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
