.class final Lcom/google/android/gms/measurement/internal/zzkl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/measurement/internal/zzkp;

.field private zzb:Lcom/google/android/gms/measurement/internal/zzkk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzkp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zza:Lcom/google/android/gms/measurement/internal/zzkp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(J)V
    .locals 7
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    new-instance v6, Lcom/google/android/gms/measurement/internal/zzkk;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zza:Lcom/google/android/gms/measurement/internal/zzkp;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzax()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    move-object v0, v6

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzkk;-><init>(Lcom/google/android/gms/measurement/internal/zzkl;JJ)V

    iput-object v6, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zzb:Lcom/google/android/gms/measurement/internal/zzkk;

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zza:Lcom/google/android/gms/measurement/internal/zzkp;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/zzkp;->zzh(Lcom/google/android/gms/measurement/internal/zzkp;)Landroid/os/Handler;

    move-result-object p1

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zzb:Lcom/google/android/gms/measurement/internal/zzkk;

    const-wide/16 v0, 0x7d0

    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final zzb()V
    .locals 2
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zza:Lcom/google/android/gms/measurement/internal/zzkp;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zzb:Lcom/google/android/gms/measurement/internal/zzkk;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zza:Lcom/google/android/gms/measurement/internal/zzkp;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zzkp;->zzh(Lcom/google/android/gms/measurement/internal/zzkp;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zza:Lcom/google/android/gms/measurement/internal/zzkp;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzm()Lcom/google/android/gms/measurement/internal/zzfi;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfi;->zzm:Lcom/google/android/gms/measurement/internal/zzfc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfc;->zza(Z)V

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzkl;->zza:Lcom/google/android/gms/measurement/internal/zzkp;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/zzkp;->zzm(Z)V

    return-void
.end method
