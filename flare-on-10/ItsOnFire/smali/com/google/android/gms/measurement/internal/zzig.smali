.class final Lcom/google/android/gms/measurement/internal/zzig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/measurement/internal/zzhb;

.field public final synthetic zzb:J

.field public final synthetic zzc:Z

.field public final synthetic zzd:Lcom/google/android/gms/measurement/internal/zzhb;

.field public final synthetic zze:Lcom/google/android/gms/measurement/internal/zzik;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzik;Lcom/google/android/gms/measurement/internal/zzhb;JZLcom/google/android/gms/measurement/internal/zzhb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzig;->zze:Lcom/google/android/gms/measurement/internal/zzik;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->zza:Lcom/google/android/gms/measurement/internal/zzhb;

    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/zzig;->zzb:J

    iput-boolean p5, p0, Lcom/google/android/gms/measurement/internal/zzig;->zzc:Z

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/zzig;->zzd:Lcom/google/android/gms/measurement/internal/zzhb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->zze:Lcom/google/android/gms/measurement/internal/zzik;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzig;->zza:Lcom/google/android/gms/measurement/internal/zzhb;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzik;->zzV(Lcom/google/android/gms/measurement/internal/zzhb;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzig;->zze:Lcom/google/android/gms/measurement/internal/zzik;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzig;->zza:Lcom/google/android/gms/measurement/internal/zzhb;

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/zzig;->zzb:J

    iget-boolean v7, p0, Lcom/google/android/gms/measurement/internal/zzig;->zzc:Z

    const/4 v6, 0x0

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzik;->zzw(Lcom/google/android/gms/measurement/internal/zzik;Lcom/google/android/gms/measurement/internal/zzhb;JZZ)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqu;->zzc()Z

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->zze:Lcom/google/android/gms/measurement/internal/zzik;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/zzeg;->zzan:Lcom/google/android/gms/measurement/internal/zzef;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/zzag;->zzs(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzef;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->zze:Lcom/google/android/gms/measurement/internal/zzik;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzig;->zza:Lcom/google/android/gms/measurement/internal/zzhb;

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzig;->zzd:Lcom/google/android/gms/measurement/internal/zzhb;

    invoke-static {v0, v1, p0}, Lcom/google/android/gms/measurement/internal/zzik;->zzv(Lcom/google/android/gms/measurement/internal/zzik;Lcom/google/android/gms/measurement/internal/zzhb;Lcom/google/android/gms/measurement/internal/zzhb;)V

    :cond_0
    return-void
.end method
