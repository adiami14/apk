.class public final synthetic Landroidx/core/location/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/core/location/LocationManagerCompat$GpsStatusTransport;

.field public final synthetic k:Ljava/util/concurrent/Executor;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/core/location/LocationManagerCompat$GpsStatusTransport;Ljava/util/concurrent/Executor;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/location/k;->j:Landroidx/core/location/LocationManagerCompat$GpsStatusTransport;

    iput-object p2, p0, Landroidx/core/location/k;->k:Ljava/util/concurrent/Executor;

    iput p3, p0, Landroidx/core/location/k;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/location/k;->j:Landroidx/core/location/LocationManagerCompat$GpsStatusTransport;

    iget-object v1, p0, Landroidx/core/location/k;->k:Ljava/util/concurrent/Executor;

    iget p0, p0, Landroidx/core/location/k;->l:I

    invoke-static {v0, v1, p0}, Landroidx/core/location/LocationManagerCompat$GpsStatusTransport;->a(Landroidx/core/location/LocationManagerCompat$GpsStatusTransport;Ljava/util/concurrent/Executor;I)V

    return-void
.end method
