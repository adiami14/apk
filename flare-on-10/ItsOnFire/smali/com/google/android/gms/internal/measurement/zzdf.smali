.class final Lcom/google/android/gms/internal/measurement/zzdf;
.super Lcom/google/android/gms/internal/measurement/zzdu;
.source "SourceFile"


# instance fields
.field public final synthetic zza:Ljava/lang/String;

.field public final synthetic zzb:Ljava/lang/String;

.field public final synthetic zzc:Z

.field public final synthetic zzd:Lcom/google/android/gms/internal/measurement/zzbz;

.field public final synthetic zze:Lcom/google/android/gms/internal/measurement/zzef;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzef;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzbz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zze:Lcom/google/android/gms/internal/measurement/zzef;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zza:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzd:Lcom/google/android/gms/internal/measurement/zzbz;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzdu;-><init>(Lcom/google/android/gms/internal/measurement/zzef;Z)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zze:Lcom/google/android/gms/internal/measurement/zzef;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzef;->zze(Lcom/google/android/gms/internal/measurement/zzef;)Lcom/google/android/gms/internal/measurement/zzcc;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcc;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zza:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Z

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzd:Lcom/google/android/gms/internal/measurement/zzbz;

    invoke-interface {v0, v1, v2, v3, p0}, Lcom/google/android/gms/internal/measurement/zzcc;->getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzcf;)V

    return-void
.end method

.method public final zzb()V
    .locals 1

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzd:Lcom/google/android/gms/internal/measurement/zzbz;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzbz;->zze(Landroid/os/Bundle;)V

    return-void
.end method