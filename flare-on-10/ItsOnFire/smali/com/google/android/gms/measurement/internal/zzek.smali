.class public final Lcom/google/android/gms/measurement/internal/zzek;
.super Lcom/google/android/gms/measurement/internal/zzf;
.source "SourceFile"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:I

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:J

.field private final zzg:J

.field private zzh:Ljava/util/List;

.field private zzi:Ljava/lang/String;

.field private zzj:I

.field private zzk:Ljava/lang/String;

.field private zzl:Ljava/lang/String;

.field private zzm:Ljava/lang/String;

.field private zzn:J

.field private zzo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzgd;J)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzf;-><init>(Lcom/google/android/gms/measurement/internal/zzgd;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzn:J

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzo:Ljava/lang/String;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzg:J

    return-void
.end method


# virtual methods
.method public final zzd()V
    .locals 11
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "appId",
            "appStore",
            "appName",
            "gmpAppId",
            "gaAppId"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "Unknown"

    const/high16 v3, -0x80000000

    const-string v4, ""

    const/4 v5, 0x0

    const-string v6, "unknown"

    if-nez v1, :cond_1

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzet;->zzd()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v7

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzet;->zzn(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "PackageManager is null, app identity information might be inaccurate. appId"

    invoke-virtual {v7, v9, v8}, Lcom/google/android/gms/measurement/internal/zzer;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    move-object v8, v2

    goto/16 :goto_4

    :cond_1
    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzet;->zzd()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v7

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzet;->zzn(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Error retrieving app installer package name. appId"

    invoke-virtual {v7, v9, v8}, Lcom/google/android/gms/measurement/internal/zzer;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    if-nez v6, :cond_2

    const-string v6, "manual_install"

    goto :goto_1

    :cond_2
    const-string v7, "com.android.vending"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v6, v4

    :cond_3
    :goto_1
    :try_start_1
    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7

    if-eqz v7, :cond_0

    iget-object v8, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v1, v8}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_4

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :cond_4
    move-object v8, v2

    :goto_2
    :try_start_2
    iget-object v2, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget v3, v7, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-object v7, v2

    move-object v2, v8

    goto :goto_3

    :catch_2
    move-object v7, v2

    :goto_3
    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzet;->zzd()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v8

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzet;->zzn(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "Error retrieving package info. appId, appName"

    invoke-virtual {v8, v10, v9, v2}, Lcom/google/android/gms/measurement/internal/zzer;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v2

    move-object v2, v7

    :goto_4
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zza:Ljava/lang/String;

    iput-object v6, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzd:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzb:Ljava/lang/String;

    iput v3, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzc:I

    iput-object v8, p0, Lcom/google/android/gms/measurement/internal/zzek;->zze:Ljava/lang/String;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzf:J

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgd;->zzw()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgd;->zzx()Ljava/lang/String;

    move-result-object v2

    const-string v3, "am"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    goto :goto_5

    :cond_5
    move v2, v5

    :goto_5
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgd;->zza()I

    move-result v3

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v6

    packed-switch v3, :pswitch_data_0

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzi()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement disabled due to denied storage consent"

    goto :goto_6

    :pswitch_0
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzi()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement disabled via the global data collection setting"

    goto :goto_6

    :pswitch_1
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzl()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    goto :goto_6

    :pswitch_2
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzj()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement disabled via the init parameters"

    goto :goto_6

    :pswitch_3
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzi()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement disabled via the manifest"

    goto :goto_6

    :pswitch_4
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzi()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    goto :goto_6

    :pswitch_5
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzj()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement deactivated via the init parameters"

    goto :goto_6

    :pswitch_6
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzi()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement deactivated via the manifest"

    goto :goto_6

    :pswitch_7
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzet;->zzj()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v6

    const-string v7, "App measurement collection enabled"

    :goto_6
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzer;->zza(Ljava/lang/String;)V

    iput-object v4, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzk:Ljava/lang/String;

    iput-object v4, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzl:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgd;->zzay()Lcom/google/android/gms/measurement/internal/zzab;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgd;->zzw()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzl:Ljava/lang/String;

    :cond_6
    :try_start_3
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v2

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgd;->zzz()Ljava/lang/String;

    move-result-object v6

    const-string v7, "google_app_id"

    invoke-static {v2, v7, v6}, Lcom/google/android/gms/measurement/internal/zziq;->zzc(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_7

    :cond_7
    move-object v4, v2

    :goto_7
    iput-object v4, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzk:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v2

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzgd;->zzz()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_8

    :cond_8
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/zzfv;->zza(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    :goto_8
    const-string v2, "admob_app_id"

    invoke-static {v2, v6, v4}, Lcom/google/android/gms/measurement/internal/zzfv;->zzb(Ljava/lang/String;Landroid/content/res/Resources;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzl:Ljava/lang/String;

    :cond_9
    if-nez v3, :cond_b

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzet;->zzj()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v2

    const-string v3, "App measurement enabled for app package, google app id"

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzek;->zza:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzk:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_a

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzl:Ljava/lang/String;

    goto :goto_9

    :cond_a
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzk:Ljava/lang/String;

    :goto_9
    invoke-virtual {v2, v3, v4, v6}, Lcom/google/android/gms/measurement/internal/zzer;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_a

    :catch_3
    move-exception v2

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzet;->zzd()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzet;->zzn(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v4, "Fetching Google App Id failed with exception. appId"

    invoke-virtual {v3, v4, v0, v2}, Lcom/google/android/gms/measurement/internal/zzer;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    :goto_a
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzh:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzay()Lcom/google/android/gms/measurement/internal/zzab;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v0

    const-string v2, "analytics.safelisted_events"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzag;->zzp(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_b

    :cond_c
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzet;->zzl()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v0

    const-string v2, "Safelisted event list is empty. Ignoring"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzer;->zza(Ljava/lang/String;)V

    goto :goto_c

    :cond_d
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzgd;->zzv()Lcom/google/android/gms/measurement/internal/zzlp;

    move-result-object v4

    const-string v6, "safelisted event"

    invoke-virtual {v4, v6, v3}, Lcom/google/android/gms/measurement/internal/zzlp;->zzac(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_c

    :cond_f
    :goto_b
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzh:Ljava/util/List;

    :goto_c
    if-eqz v1, :cond_10

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/InstantApps;->isInstantApp(Landroid/content/Context;)Z

    move-result v0

    iput v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzj:I

    return-void

    :cond_10
    iput v5, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzj:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzf()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public final zzh()I
    .locals 0
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget p0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzj:I

    return p0
.end method

.method public final zzi()I
    .locals 0
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget p0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzc:I

    return p0
.end method

.method public final zzj(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzq;
    .locals 40
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    new-instance v35, Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzek;->zzl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzek;->zzm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzb:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget v0, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzc:I

    int-to-long v5, v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzd:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzd:Ljava/lang/String;

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzag;->zzh()J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    iget-wide v8, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzf:J

    const-wide/16 v10, 0x0

    cmp-long v0, v8, v10

    const/4 v12, 0x0

    if-nez v0, :cond_4

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzv()Lcom/google/android/gms/measurement/internal/zzlp;

    move-result-object v8

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v0

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    invoke-static {}, Lcom/google/android/gms/measurement/internal/zzlp;->zzF()Ljava/security/MessageDigest;

    move-result-object v14

    const-wide/16 v15, -0x1

    if-nez v14, :cond_0

    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzet;->zzd()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v0

    const-string v8, "Could not get MD5 instance"

    invoke-virtual {v0, v8}, Lcom/google/android/gms/measurement/internal/zzer;->zza(Ljava/lang/String;)V

    :goto_0
    move-wide v8, v15

    goto :goto_1

    :cond_0
    if-eqz v13, :cond_3

    :try_start_0
    invoke-virtual {v8, v0, v9}, Lcom/google/android/gms/measurement/internal/zzlp;->zzah(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0x40

    invoke-virtual {v0, v9, v13}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v0, :cond_1

    array-length v9, v0

    if-lez v9, :cond_1

    aget-object v0, v0, v12

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzlp;->zzp([B)J

    move-result-wide v8

    move-wide v15, v8

    goto :goto_0

    :cond_1
    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzet;->zzk()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v0

    const-string v9, "Could not get signatures"

    invoke-virtual {v0, v9}, Lcom/google/android/gms/measurement/internal/zzer;->zza(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    move-wide v15, v10

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzet;->zzd()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v8

    const-string v9, "Package name not found"

    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/measurement/internal/zzer;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    move-wide v8, v10

    :goto_1
    iput-wide v8, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzf:J

    :cond_4
    move-wide v13, v8

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzJ()Z

    move-result v0

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzm()Lcom/google/android/gms/measurement/internal/zzfi;

    move-result-object v8

    iget-boolean v8, v8, Lcom/google/android/gms/measurement/internal/zzfi;->zzl:Z

    const/4 v9, 0x1

    xor-int/lit8 v15, v8, 0x1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzJ()Z

    move-result v8

    const/4 v10, 0x0

    if-nez v8, :cond_5

    :goto_2
    move-object/from16 v20, v10

    goto/16 :goto_5

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzrj;->zzc()Z

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v8

    sget-object v11, Lcom/google/android/gms/measurement/internal/zzeg;->zzac:Lcom/google/android/gms/measurement/internal/zzef;

    invoke-virtual {v8, v10, v11}, Lcom/google/android/gms/measurement/internal/zzag;->zzs(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzef;)Z

    move-result v8

    if-eqz v8, :cond_6

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzet;->zzj()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v8

    const-string v11, "Disabled IID for tests."

    invoke-virtual {v8, v11}, Lcom/google/android/gms/measurement/internal/zzer;->zza(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    :try_start_1
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    const-string v11, "com.google.firebase.analytics.FirebaseAnalytics"

    invoke-virtual {v8, v11}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_3

    if-nez v8, :cond_7

    goto :goto_2

    :cond_7
    :try_start_2
    const-string v11, "getInstance"

    new-array v10, v9, [Ljava/lang/Class;

    const-class v19, Landroid/content/Context;

    aput-object v19, v10, v12

    invoke-virtual {v8, v11, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    new-array v11, v9, [Ljava/lang/Object;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v9

    aput-object v9, v11, v12

    const/4 v9, 0x0

    invoke-virtual {v10, v9, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v10, :cond_8

    goto :goto_4

    :cond_8
    :try_start_3
    const-string v9, "getFirebaseInstanceId"

    new-array v11, v12, [Ljava/lang/Class;

    invoke-virtual {v8, v9, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    new-array v9, v12, [Ljava/lang/Object;

    invoke-virtual {v8, v10, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-object/from16 v20, v8

    goto :goto_5

    :catch_1
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzet;->zzl()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v8

    const-string v9, "Failed to retrieve Firebase Instance Id"

    goto :goto_3

    :catch_2
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzet;->zzm()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v8

    const-string v9, "Failed to obtain Firebase Analytics instance"

    :goto_3
    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/zzer;->zza(Ljava/lang/String;)V

    :catch_3
    :goto_4
    const/16 v20, 0x0

    :goto_5
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzm()Lcom/google/android/gms/measurement/internal/zzfi;

    move-result-object v9

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/zzfi;->zzc:Lcom/google/android/gms/measurement/internal/zzfe;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzfe;->zza()J

    move-result-wide v9

    const-wide/16 v16, 0x0

    cmp-long v11, v9, v16

    if-nez v11, :cond_9

    iget-wide v8, v8, Lcom/google/android/gms/measurement/internal/zzgd;->zzc:J

    move-wide/from16 v23, v8

    move-wide/from16 v21, v13

    goto :goto_6

    :cond_9
    move-wide/from16 v21, v13

    iget-wide v12, v8, Lcom/google/android/gms/measurement/internal/zzgd;->zzc:J

    invoke-static {v12, v13, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    move-wide/from16 v23, v8

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget v14, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzj:I

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzag;->zzr()Z

    move-result v25

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzm()Lcom/google/android/gms/measurement/internal/zzfi;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzfi;->zza()Landroid/content/SharedPreferences;

    move-result-object v8

    const-string v9, "deferred_analytics_collection"

    const/4 v10, 0x0

    invoke-interface {v8, v9, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v26

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzl:Ljava/lang/String;

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v8

    const-string v9, "google_analytics_default_allow_ad_personalization_signals"

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/zzag;->zzk(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v8

    if-nez v8, :cond_a

    const/16 v27, 0x0

    goto :goto_7

    :cond_a
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const/4 v9, 0x1

    xor-int/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    move-object/from16 v27, v8

    :goto_7
    iget-wide v8, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzg:J

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzh:Ljava/util/List;

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzgd;->zzm()Lcom/google/android/gms/measurement/internal/zzfi;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzfi;->zzc()Lcom/google/android/gms/measurement/internal/zzhb;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzhb;->zzi()Ljava/lang/String;

    move-result-object v29

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzi:Ljava/lang/String;

    if-nez v10, :cond_b

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzgd;->zzv()Lcom/google/android/gms/measurement/internal/zzlp;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzlp;->zzC()Ljava/lang/String;

    move-result-object v10

    iput-object v10, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzi:Ljava/lang/String;

    :cond_b
    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzi:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqu;->zzc()Z

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v11

    move-wide/from16 v30, v8

    sget-object v8, Lcom/google/android/gms/measurement/internal/zzeg;->zzan:Lcom/google/android/gms/measurement/internal/zzef;

    const/4 v9, 0x0

    invoke-virtual {v11, v9, v8}, Lcom/google/android/gms/measurement/internal/zzag;->zzs(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzef;)Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    iget-wide v8, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzn:J

    const-wide/16 v16, 0x0

    cmp-long v8, v8, v16

    if-nez v8, :cond_c

    move-object/from16 v32, v10

    goto :goto_8

    :cond_c
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzax()Lcom/google/android/gms/common/util/Clock;

    move-result-object v8

    invoke-interface {v8}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v8

    move-object/from16 v32, v10

    iget-wide v10, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzn:J

    sub-long/2addr v8, v10

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzm:Ljava/lang/String;

    if-eqz v10, :cond_d

    const-wide/32 v10, 0x5265c00

    cmp-long v8, v8, v10

    if-lez v8, :cond_d

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzo:Ljava/lang/String;

    if-nez v8, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzek;->zzo()V

    :cond_d
    :goto_8
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzm:Ljava/lang/String;

    if-nez v8, :cond_e

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzek;->zzo()V

    :cond_e
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzek;->zzm:Ljava/lang/String;

    move-object/from16 v33, v8

    goto :goto_9

    :cond_f
    move-object/from16 v32, v10

    const-wide/16 v16, 0x0

    const/16 v33, 0x0

    :goto_9
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v8

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    const-string v9, "google_analytics_sgtm_upload_enabled"

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/zzag;->zzk(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v8

    if-nez v8, :cond_10

    const/16 v34, 0x0

    goto :goto_a

    :cond_10
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    move/from16 v34, v8

    :goto_a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpz;->zzc()Z

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzf()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v8

    sget-object v9, Lcom/google/android/gms/measurement/internal/zzeg;->zzaD:Lcom/google/android/gms/measurement/internal/zzef;

    const/4 v10, 0x0

    invoke-virtual {v8, v10, v9}, Lcom/google/android/gms/measurement/internal/zzag;->zzs(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzef;)Z

    move-result v8

    if-eqz v8, :cond_13

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzv()Lcom/google/android/gms/measurement/internal/zzlp;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzek;->zzl()Ljava/lang/String;

    move-result-object v1

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v9

    if-nez v9, :cond_11

    move-wide/from16 v10, v16

    goto :goto_c

    :cond_11
    :try_start_4
    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaw()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v9
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v10, 0x0

    :try_start_5
    invoke-virtual {v9, v1, v10}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v9

    if-eqz v9, :cond_12

    iget v1, v9, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    move v10, v1

    goto :goto_b

    :catch_4
    const/4 v10, 0x0

    :catch_5
    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzgd;->zzay()Lcom/google/android/gms/measurement/internal/zzab;

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzet;->zzi()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v8

    const-string v9, "PackageManager failed to find running app: app_id"

    invoke-virtual {v8, v9, v1}, Lcom/google/android/gms/measurement/internal/zzer;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_12
    :goto_b
    int-to-long v10, v10

    :goto_c
    move-wide/from16 v36, v10

    goto :goto_d

    :cond_13
    move-wide/from16 v36, v16

    :goto_d
    const-wide/32 v8, 0x13498

    const-wide/16 v16, 0x0

    const/16 v28, 0x0

    move-object/from16 v1, v35

    move-wide/from16 v10, v21

    move-object/from16 v38, v12

    move-object/from16 v12, p1

    move-object/from16 v39, v13

    move v13, v0

    move v0, v14

    move v14, v15

    move-object/from16 v15, v20

    move-wide/from16 v18, v23

    move/from16 v20, v0

    move/from16 v21, v25

    move/from16 v22, v26

    move-object/from16 v23, v39

    move-object/from16 v24, v27

    move-wide/from16 v25, v30

    move-object/from16 v27, v38

    move-object/from16 v30, v32

    move-object/from16 v31, v33

    move/from16 v32, v34

    move-wide/from16 v33, v36

    invoke-direct/range {v1 .. v34}, Lcom/google/android/gms/measurement/internal/zzq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V

    return-object v35
.end method

.method public final zzk()Ljava/lang/String;
    .locals 0
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzl:Ljava/lang/String;

    return-object p0
.end method

.method public final zzl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zza:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zza:Ljava/lang/String;

    return-object p0
.end method

.method public final zzm()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzf;->zza()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzk:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzk:Ljava/lang/String;

    return-object p0
.end method

.method public final zzn()Ljava/util/List;
    .locals 0
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzh:Ljava/util/List;

    return-object p0
.end method

.method public final zzo()V
    .locals 6
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgw;->zzg()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzm()Lcom/google/android/gms/measurement/internal/zzfi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfi;->zzc()Lcom/google/android/gms/measurement/internal/zzhb;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/zzha;->zzb:Lcom/google/android/gms/measurement/internal/zzha;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzhb;->zzj(Lcom/google/android/gms/measurement/internal/zzha;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzet;->zzc()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v0

    const-string v3, "Analytics Storage consent is not granted"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/zzer;->zza(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    new-array v0, v0, [B

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgd;->zzv()Lcom/google/android/gms/measurement/internal/zzlp;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzlp;->zzG()Ljava/security/SecureRandom;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, v2, [Ljava/lang/Object;

    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v2, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v5, v4, v1

    const-string v0, "%032x"

    invoke-static {v3, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgd;->zzaA()Lcom/google/android/gms/measurement/internal/zzet;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzet;->zzc()Lcom/google/android/gms/measurement/internal/zzer;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    if-nez v0, :cond_1

    const-string v4, "null"

    goto :goto_1

    :cond_1
    const-string v4, "not null"

    :goto_1
    aput-object v4, v2, v1

    const-string v1, "Resetting session stitching token to %s"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/measurement/internal/zzer;->zza(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzm:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgw;->zzt:Lcom/google/android/gms/measurement/internal/zzgd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgd;->zzax()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzn:J

    return-void
.end method

.method public final zzp(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzo:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzek;->zzo:Ljava/lang/String;

    return v1
.end method
