.class public final synthetic Lcom/google/android/gms/measurement/internal/zzdu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/zzec;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/measurement/internal/zzdu;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzdu;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/zzdu;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/zzdu;->zza:Lcom/google/android/gms/measurement/internal/zzdu;

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

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqx;->zzc()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
