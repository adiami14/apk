.class public final synthetic Lcom/google/firebase/installations/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/firebase/installations/FirebaseInstallations;

.field public final synthetic k:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/installations/FirebaseInstallations;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/installations/c;->j:Lcom/google/firebase/installations/FirebaseInstallations;

    iput-boolean p2, p0, Lcom/google/firebase/installations/c;->k:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/installations/c;->j:Lcom/google/firebase/installations/FirebaseInstallations;

    iget-boolean p0, p0, Lcom/google/firebase/installations/c;->k:Z

    invoke-static {v0, p0}, Lcom/google/firebase/installations/FirebaseInstallations;->d(Lcom/google/firebase/installations/FirebaseInstallations;Z)V

    return-void
.end method