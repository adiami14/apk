.class public final synthetic Lv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lj/z;


# direct methods
.method public synthetic constructor <init>(Lj/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/b;->a:Lj/z;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iget-object p0, p0, Lv/b;->a:Lj/z;

    invoke-static {p0, p1}, Lv/c;->a(Lj/z;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
