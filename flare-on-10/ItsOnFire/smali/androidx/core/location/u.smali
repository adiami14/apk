.class public final synthetic Landroidx/core/location/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;

.field public final synthetic k:Ljava/util/concurrent/Executor;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;Ljava/util/concurrent/Executor;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/location/u;->j:Landroidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;

    iput-object p2, p0, Landroidx/core/location/u;->k:Ljava/util/concurrent/Executor;

    iput p3, p0, Landroidx/core/location/u;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/location/u;->j:Landroidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;

    iget-object v1, p0, Landroidx/core/location/u;->k:Ljava/util/concurrent/Executor;

    iget p0, p0, Landroidx/core/location/u;->l:I

    invoke-static {v0, v1, p0}, Landroidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;->c(Landroidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;Ljava/util/concurrent/Executor;I)V

    return-void
.end method