.class public final Lcom/google/android/gms/internal/measurement/zzod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzim;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/zzod;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/measurement/zzim;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzod;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzod;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzod;->zza:Lcom/google/android/gms/internal/measurement/zzod;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzof;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzof;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzir;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzim;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzir;->zza(Lcom/google/android/gms/internal/measurement/zzim;)Lcom/google/android/gms/internal/measurement/zzim;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzod;->zzb:Lcom/google/android/gms/internal/measurement/zzim;

    return-void
.end method

.method public static zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzod;->zza:Lcom/google/android/gms/internal/measurement/zzod;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzod;->zzb()Lcom/google/android/gms/internal/measurement/zzoe;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzoe;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzod;->zzb()Lcom/google/android/gms/internal/measurement/zzoe;

    move-result-object p0

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/measurement/zzoe;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzod;->zzb:Lcom/google/android/gms/internal/measurement/zzim;

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzim;->zza()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzoe;

    return-object p0
.end method
