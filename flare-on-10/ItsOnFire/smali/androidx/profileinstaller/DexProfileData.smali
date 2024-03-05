.class Landroidx/profileinstaller/DexProfileData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final apkName:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public classSetSize:I

.field public classes:[I
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final dexChecksum:J

.field public final dexName:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final hotMethodRegionSize:I

.field public final methods:Ljava/util/TreeMap;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final numMethodIds:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JIII[ILjava/util/TreeMap;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/TreeMap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JIII[I",
            "Ljava/util/TreeMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/profileinstaller/DexProfileData;->apkName:Ljava/lang/String;

    iput-object p2, p0, Landroidx/profileinstaller/DexProfileData;->dexName:Ljava/lang/String;

    iput-wide p3, p0, Landroidx/profileinstaller/DexProfileData;->dexChecksum:J

    iput p5, p0, Landroidx/profileinstaller/DexProfileData;->classSetSize:I

    iput p6, p0, Landroidx/profileinstaller/DexProfileData;->hotMethodRegionSize:I

    iput p7, p0, Landroidx/profileinstaller/DexProfileData;->numMethodIds:I

    iput-object p8, p0, Landroidx/profileinstaller/DexProfileData;->classes:[I

    iput-object p9, p0, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    return-void
.end method
