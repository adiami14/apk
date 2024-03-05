.class final Lcom/google/android/gms/internal/measurement/zzma;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzmu;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/zzmg;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/measurement/zzmg;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzly;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzly;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzma;->zza:Lcom/google/android/gms/internal/measurement/zzmg;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzlz;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzmg;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkw;->zza()Lcom/google/android/gms/internal/measurement/zzkw;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getInstance"

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v4, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzmg;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzma;->zza:Lcom/google/android/gms/internal/measurement/zzmg;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzlz;-><init>([Lcom/google/android/gms/internal/measurement/zzmg;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzlj;->zzd:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzma;->zzb:Lcom/google/android/gms/internal/measurement/zzmg;

    return-void
.end method

.method private static zzb(Lcom/google/android/gms/internal/measurement/zzmf;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzmf;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zzmt;
    .locals 8

    const-class v0, Lcom/google/android/gms/internal/measurement/zzlb;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzmv;->zzC(Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzma;->zzb:Lcom/google/android/gms/internal/measurement/zzmg;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/measurement/zzmg;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zzmf;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/zzmf;->zzb()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzmv;->zzz()Lcom/google/android/gms/internal/measurement/zznk;

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkq;->zzb()Lcom/google/android/gms/internal/measurement/zzko;

    move-result-object p1

    :goto_0
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/zzmf;->zza()Lcom/google/android/gms/internal/measurement/zzmi;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzmm;->zzc(Lcom/google/android/gms/internal/measurement/zznk;Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/android/gms/internal/measurement/zzmi;)Lcom/google/android/gms/internal/measurement/zzmm;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzmv;->zzy()Lcom/google/android/gms/internal/measurement/zznk;

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkq;->zza()Lcom/google/android/gms/internal/measurement/zzko;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzb(Lcom/google/android/gms/internal/measurement/zzmf;)Z

    move-result p0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzmo;->zzb()Lcom/google/android/gms/internal/measurement/zzmn;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzlw;->zzd()Lcom/google/android/gms/internal/measurement/zzlw;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzmv;->zzz()Lcom/google/android/gms/internal/measurement/zznk;

    move-result-object v5

    if-eqz p0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkq;->zzb()Lcom/google/android/gms/internal/measurement/zzko;

    move-result-object v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzme;->zzb()Lcom/google/android/gms/internal/measurement/zzmd;

    move-result-object v7

    goto :goto_3

    :cond_3
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzb(Lcom/google/android/gms/internal/measurement/zzmf;)Z

    move-result p0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzmo;->zza()Lcom/google/android/gms/internal/measurement/zzmn;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzlw;->zzc()Lcom/google/android/gms/internal/measurement/zzlw;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzmv;->zzy()Lcom/google/android/gms/internal/measurement/zznk;

    move-result-object v5

    if-eqz p0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkq;->zza()Lcom/google/android/gms/internal/measurement/zzko;

    move-result-object v6

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzme;->zza()Lcom/google/android/gms/internal/measurement/zzmd;

    move-result-object v7

    :goto_3
    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/zzml;->zzl(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzmf;Lcom/google/android/gms/internal/measurement/zzmn;Lcom/google/android/gms/internal/measurement/zzlw;Lcom/google/android/gms/internal/measurement/zznk;Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/android/gms/internal/measurement/zzmd;)Lcom/google/android/gms/internal/measurement/zzml;

    move-result-object p0

    return-object p0
.end method
