.class final Lcom/google/android/gms/measurement/internal/zzfa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Z

.field public final synthetic zzb:Lcom/google/android/gms/measurement/internal/zzfb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzfb;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zzb:Lcom/google/android/gms/measurement/internal/zzfb;

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zza:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zzb:Lcom/google/android/gms/measurement/internal/zzfb;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzfb;->zza(Lcom/google/android/gms/measurement/internal/zzfb;)Lcom/google/android/gms/measurement/internal/zzlh;

    move-result-object v0

    iget-boolean p0, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zza:Z

    invoke-virtual {v0, p0}, Lcom/google/android/gms/measurement/internal/zzlh;->zzJ(Z)V

    return-void
.end method
