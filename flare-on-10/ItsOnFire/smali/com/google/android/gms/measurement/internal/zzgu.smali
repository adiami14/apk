.class final Lcom/google/android/gms/measurement/internal/zzgu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Ljava/lang/String;

.field public final synthetic zzb:Ljava/lang/String;

.field public final synthetic zzc:Ljava/lang/String;

.field public final synthetic zzd:J

.field public final synthetic zze:Lcom/google/android/gms/measurement/internal/zzgv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzgv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zze:Lcom/google/android/gms/measurement/internal/zzgv;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zza:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zzb:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zzc:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zzd:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zza:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zze:Lcom/google/android/gms/measurement/internal/zzgv;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgv;->zzc(Lcom/google/android/gms/measurement/internal/zzgv;)Lcom/google/android/gms/measurement/internal/zzlh;

    move-result-object v0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zzb:Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/measurement/internal/zzlh;->zzR(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzir;)V

    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzir;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zzc:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zzd:J

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzir;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zze:Lcom/google/android/gms/measurement/internal/zzgv;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgv;->zzc(Lcom/google/android/gms/measurement/internal/zzgv;)Lcom/google/android/gms/measurement/internal/zzlh;

    move-result-object v0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzgu;->zzb:Ljava/lang/String;

    goto :goto_0
.end method
