.class public final synthetic Lcom/google/android/gms/measurement/internal/zzcm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/zzec;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/measurement/internal/zzcm;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzcm;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/zzcm;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/zzcm;->zza:Lcom/google/android/gms/measurement/internal/zzcm;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 0

    sget-object p0, Lcom/google/android/gms/measurement/internal/zzeg;->zza:Lcom/google/android/gms/measurement/internal/zzef;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzos;->zzd()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
