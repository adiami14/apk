.class public final Lcom/google/android/gms/internal/measurement/zzfn;
.super Lcom/google/android/gms/internal/measurement/zzlb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzmj;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/zzfn;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;

.field private zzk:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzfn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzfn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzfn;->zza:Lcom/google/android/gms/internal/measurement/zzfn;

    const-class v1, Lcom/google/android/gms/internal/measurement/zzfn;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/zzlb;->zzbO(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzlb;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzlb;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfn;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfn;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfn;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfn;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfn;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfn;->zzj:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfn;->zzk:Ljava/lang/String;

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/gms/internal/measurement/zzfn;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzfn;->zza:Lcom/google/android/gms/internal/measurement/zzfn;

    return-object v0
.end method


# virtual methods
.method public final zzl(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzfn;->zza:Lcom/google/android/gms/internal/measurement/zzfn;

    return-object p0

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzfm;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzfm;-><init>(Lcom/google/android/gms/internal/measurement/zzfk;)V

    return-object p1

    :cond_2
    new-instance p0, Lcom/google/android/gms/internal/measurement/zzfn;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzfn;-><init>()V

    return-object p0

    :cond_3
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, v2

    const-string v2, "zze"

    aput-object v2, p1, p0

    const-string p0, "zzf"

    aput-object p0, p1, v1

    const-string p0, "zzg"

    aput-object p0, p1, v0

    const-string p0, "zzh"

    aput-object p0, p1, p3

    const-string p0, "zzi"

    aput-object p0, p1, p2

    const/4 p0, 0x6

    const-string p2, "zzj"

    aput-object p2, p1, p0

    const/4 p0, 0x7

    const-string p2, "zzk"

    aput-object p2, p1, p0

    sget-object p0, Lcom/google/android/gms/internal/measurement/zzfn;->zza:Lcom/google/android/gms/internal/measurement/zzfn;

    const-string p2, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006"

    invoke-static {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzlb;->zzbL(Lcom/google/android/gms/internal/measurement/zzmi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0
.end method