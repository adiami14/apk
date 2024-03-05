.class public final synthetic Landroidx/core/location/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:I

.field public final synthetic m:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/location/r;->j:Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;

    iput-object p2, p0, Landroidx/core/location/r;->k:Ljava/lang/String;

    iput p3, p0, Landroidx/core/location/r;->l:I

    iput-object p4, p0, Landroidx/core/location/r;->m:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/core/location/r;->j:Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;

    iget-object v1, p0, Landroidx/core/location/r;->k:Ljava/lang/String;

    iget v2, p0, Landroidx/core/location/r;->l:I

    iget-object p0, p0, Landroidx/core/location/r;->m:Landroid/os/Bundle;

    invoke-static {v0, v1, v2, p0}, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->b(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method
