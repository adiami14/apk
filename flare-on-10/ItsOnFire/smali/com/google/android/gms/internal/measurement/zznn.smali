.class final Lcom/google/android/gms/internal/measurement/zznn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final zza:Ljava/util/ListIterator;

.field public final synthetic zzb:I

.field public final synthetic zzc:Lcom/google/android/gms/internal/measurement/zznp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zznp;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zznn;->zzc:Lcom/google/android/gms/internal/measurement/zznp;

    iput p2, p0, Lcom/google/android/gms/internal/measurement/zznn;->zzb:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zznp;->zza(Lcom/google/android/gms/internal/measurement/zznp;)Lcom/google/android/gms/internal/measurement/zzlq;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zznn;->zza:Ljava/util/ListIterator;

    return-void
.end method


# virtual methods
.method public final synthetic add(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public final hasNext()Z
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zznn;->zza:Ljava/util/ListIterator;

    invoke-interface {p0}, Ljava/util/ListIterator;->hasNext()Z

    move-result p0

    return p0
.end method

.method public final hasPrevious()Z
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zznn;->zza:Ljava/util/ListIterator;

    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result p0

    return p0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zznn;->zza:Ljava/util/ListIterator;

    invoke-interface {p0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public final nextIndex()I
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zznn;->zza:Ljava/util/ListIterator;

    invoke-interface {p0}, Ljava/util/ListIterator;->nextIndex()I

    move-result p0

    return p0
.end method

.method public final bridge synthetic previous()Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zznn;->zza:Ljava/util/ListIterator;

    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public final previousIndex()I
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zznn;->zza:Ljava/util/ListIterator;

    invoke-interface {p0}, Ljava/util/ListIterator;->previousIndex()I

    move-result p0

    return p0
.end method

.method public final remove()V
    .locals 0

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public final synthetic set(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method