.class public final Lcom/google/android/gms/internal/measurement/zzrj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzim;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/zzrj;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/measurement/zzim;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzrj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzrj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzrj;->zza:Lcom/google/android/gms/internal/measurement/zzrj;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzrl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzrl;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzir;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzim;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzir;->zza(Lcom/google/android/gms/internal/measurement/zzim;)Lcom/google/android/gms/internal/measurement/zzim;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzrj;->zzb:Lcom/google/android/gms/internal/measurement/zzim;

    return-void
.end method

.method public static zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzrj;->zza:Lcom/google/android/gms/internal/measurement/zzrj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzrj;->zzb()Lcom/google/android/gms/internal/measurement/zzrk;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzrk;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static zzd()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzrj;->zza:Lcom/google/android/gms/internal/measurement/zzrj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzrj;->zzb()Lcom/google/android/gms/internal/measurement/zzrk;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzrk;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzrj;->zzb()Lcom/google/android/gms/internal/measurement/zzrk;

    move-result-object p0

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/measurement/zzrk;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzrj;->zzb:Lcom/google/android/gms/internal/measurement/zzim;

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzim;->zza()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzrk;

    return-object p0
.end method