.class public final synthetic Lcom/google/firebase/messaging/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/firebase/messaging/SharedPreferencesQueue;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/SharedPreferencesQueue;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/z;->j:Lcom/google/firebase/messaging/SharedPreferencesQueue;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/messaging/z;->j:Lcom/google/firebase/messaging/SharedPreferencesQueue;

    invoke-static {p0}, Lcom/google/firebase/messaging/SharedPreferencesQueue;->a(Lcom/google/firebase/messaging/SharedPreferencesQueue;)V

    return-void
.end method
