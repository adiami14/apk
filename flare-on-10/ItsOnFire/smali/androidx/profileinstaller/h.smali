.class public final synthetic Landroidx/profileinstaller/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic j:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/profileinstaller/h;->j:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 0

    iget-object p0, p0, Landroidx/profileinstaller/h;->j:Ljava/lang/Runnable;

    invoke-static {p0, p1, p2}, Landroidx/profileinstaller/ProfileInstallerInitializer$Choreographer16Impl;->a(Ljava/lang/Runnable;J)V

    return-void
.end method
