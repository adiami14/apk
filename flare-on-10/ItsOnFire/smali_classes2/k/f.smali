.class public final synthetic Lk/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic j:Lj/q;


# direct methods
.method public synthetic constructor <init>(Lj/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/f;->j:Lj/q;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 0

    iget-object p0, p0, Lk/f;->j:Lj/q;

    invoke-static {p0, p1, p2}, Lk/g;->a(Lj/q;J)V

    return-void
.end method
