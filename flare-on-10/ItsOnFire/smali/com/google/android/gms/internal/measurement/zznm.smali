.class final Lcom/google/android/gms/internal/measurement/zznm;
.super Lcom/google/android/gms/internal/measurement/zznk;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zznk;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zznl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zznl;->zza()I

    move-result p0

    return p0
.end method

.method public final synthetic zzb(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zznl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zznl;->zzb()I

    move-result p0

    return p0
.end method

.method public final bridge synthetic zzc(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzlb;

    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzlb;->zzc:Lcom/google/android/gms/internal/measurement/zznl;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznl;->zzc()Lcom/google/android/gms/internal/measurement/zznl;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznl;->zzf()Lcom/google/android/gms/internal/measurement/zznl;

    move-result-object p0

    iput-object p0, p1, Lcom/google/android/gms/internal/measurement/zzlb;->zzc:Lcom/google/android/gms/internal/measurement/zznl;

    :cond_0
    return-object p0
.end method

.method public final synthetic zzd(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzlb;

    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzlb;->zzc:Lcom/google/android/gms/internal/measurement/zznl;

    return-object p0
.end method

.method public final bridge synthetic zze(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznl;->zzc()Lcom/google/android/gms/internal/measurement/zznl;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zznl;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznl;->zzc()Lcom/google/android/gms/internal/measurement/zznl;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zznl;->equals(Ljava/lang/Object;)Z

    move-result p0

    check-cast p2, Lcom/google/android/gms/internal/measurement/zznl;

    if-eqz p0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zznl;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/zznl;->zze(Lcom/google/android/gms/internal/measurement/zznl;Lcom/google/android/gms/internal/measurement/zznl;)Lcom/google/android/gms/internal/measurement/zznl;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p0, p1

    check-cast p0, Lcom/google/android/gms/internal/measurement/zznl;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zznl;->zzd(Lcom/google/android/gms/internal/measurement/zznl;)Lcom/google/android/gms/internal/measurement/zznl;

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final bridge synthetic zzf(Ljava/lang/Object;IJ)V
    .locals 0

    shl-int/lit8 p0, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    check-cast p1, Lcom/google/android/gms/internal/measurement/zznl;

    invoke-virtual {p1, p0, p2}, Lcom/google/android/gms/internal/measurement/zznl;->zzj(ILjava/lang/Object;)V

    return-void
.end method

.method public final zzg(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzlb;

    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzlb;->zzc:Lcom/google/android/gms/internal/measurement/zznl;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zznl;->zzh()V

    return-void
.end method

.method public final synthetic zzh(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzlb;

    check-cast p2, Lcom/google/android/gms/internal/measurement/zznl;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/zzlb;->zzc:Lcom/google/android/gms/internal/measurement/zznl;

    return-void
.end method

.method public final synthetic zzi(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/zzoc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/measurement/zznl;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/zznl;->zzk(Lcom/google/android/gms/internal/measurement/zzoc;)V

    return-void
.end method
