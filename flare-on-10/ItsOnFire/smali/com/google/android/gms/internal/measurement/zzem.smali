.class public final Lcom/google/android/gms/internal/measurement/zzem;
.super Lcom/google/android/gms/internal/measurement/zzlb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzmj;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/zzem;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/measurement/zzey;

.field private zzf:Lcom/google/android/gms/internal/measurement/zzer;

.field private zzg:Z

.field private zzh:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzem;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzem;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzem;->zza:Lcom/google/android/gms/internal/measurement/zzem;

    const-class v1, Lcom/google/android/gms/internal/measurement/zzem;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/zzlb;->zzbO(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzlb;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzlb;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/gms/internal/measurement/zzem;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzem;->zza:Lcom/google/android/gms/internal/measurement/zzem;

    return-object v0
.end method

.method public static zzb()Lcom/google/android/gms/internal/measurement/zzem;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzem;->zza:Lcom/google/android/gms/internal/measurement/zzem;

    return-object v0
.end method

.method public static synthetic zzf(Lcom/google/android/gms/internal/measurement/zzem;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzh:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zzc()Lcom/google/android/gms/internal/measurement/zzer;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzf:Lcom/google/android/gms/internal/measurement/zzer;

    if-nez p0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzer;->zzb()Lcom/google/android/gms/internal/measurement/zzer;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public final zzd()Lcom/google/android/gms/internal/measurement/zzey;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zze:Lcom/google/android/gms/internal/measurement/zzey;

    if-nez p0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzey;->zzc()Lcom/google/android/gms/internal/measurement/zzey;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public final zze()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzh:Ljava/lang/String;

    return-object p0
.end method

.method public final zzg()Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzg:Z

    return p0
.end method

.method public final zzh()Z
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzd:I

    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final zzi()Z
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzd:I

    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final zzj()Z
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzd:I

    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final zzk()Z
    .locals 1

    iget p0, p0, Lcom/google/android/gms/internal/measurement/zzem;->zzd:I

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final zzl(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p0, 0x1

    if-eqz p1, :cond_4

    const/4 p2, 0x5

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p0, 0x0

    if-eq p1, p3, :cond_1

    if-eq p1, p2, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzem;->zza:Lcom/google/android/gms/internal/measurement/zzem;

    return-object p0

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzel;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzel;-><init>(Lcom/google/android/gms/internal/measurement/zzeg;)V

    return-object p1

    :cond_2
    new-instance p0, Lcom/google/android/gms/internal/measurement/zzem;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzem;-><init>()V

    return-object p0

    :cond_3
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v2, "zzd"

    aput-object v2, p1, p2

    const-string p2, "zze"

    aput-object p2, p1, p0

    const-string p0, "zzf"

    aput-object p0, p1, v1

    const-string p0, "zzg"

    aput-object p0, p1, v0

    const-string p0, "zzh"

    aput-object p0, p1, p3

    sget-object p0, Lcom/google/android/gms/internal/measurement/zzem;->zza:Lcom/google/android/gms/internal/measurement/zzem;

    const-string p2, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003"

    invoke-static {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzlb;->zzbL(Lcom/google/android/gms/internal/measurement/zzmi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0
.end method
