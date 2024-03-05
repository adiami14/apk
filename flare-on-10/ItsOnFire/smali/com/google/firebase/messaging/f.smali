.class public final synthetic Lcom/google/firebase/messaging/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/firebase/messaging/FcmLifecycleCallbacks;

.field public final synthetic k:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/FcmLifecycleCallbacks;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/f;->j:Lcom/google/firebase/messaging/FcmLifecycleCallbacks;

    iput-object p2, p0, Lcom/google/firebase/messaging/f;->k:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/f;->j:Lcom/google/firebase/messaging/FcmLifecycleCallbacks;

    iget-object p0, p0, Lcom/google/firebase/messaging/f;->k:Landroid/content/Intent;

    invoke-static {v0, p0}, Lcom/google/firebase/messaging/FcmLifecycleCallbacks;->a(Lcom/google/firebase/messaging/FcmLifecycleCallbacks;Landroid/content/Intent;)V

    return-void
.end method
