.class public final Landroidx/compose/foundation/layout/Arrangement;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/layout/Arrangement$Horizontal;,
        Landroidx/compose/foundation/layout/Arrangement$Vertical;,
        Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;,
        Landroidx/compose/foundation/layout/Arrangement$Absolute;,
        Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0005EFGHIB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020$H\u0007J-\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u0008.J%\u0010/\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00080J-\u00101\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00082J-\u00103\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00084J-\u00105\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00086J-\u00107\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00088J\u001d\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020;H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008<\u0010=J%\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;2\u0006\u0010\"\u001a\u00020#H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008>\u0010?J%\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020;2\u0006\u0010\"\u001a\u00020$H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008>\u0010@J/\u0010A\u001a\u00020&*\u00020*2\u0006\u0010B\u001a\u00020-2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&0DH\u0082\u0008R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\n\u0010\u0002\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u0002\u001a\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0013\u0010\u0002\u001a\u0004\u0008\u0014\u0010\u000cR\u001c\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0002\u001a\u0004\u0008\u0017\u0010\u000cR\u001c\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u0002\u001a\u0004\u0008\u001a\u0010\u000cR\u001c\u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001c\u0010\u0002\u001a\u0004\u0008\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001f\u0010\u0002\u001a\u0004\u0008 \u0010\u0007\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006J"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/Arrangement;",
        "",
        "()V",
        "Bottom",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "getBottom$annotations",
        "getBottom",
        "()Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "Center",
        "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "getCenter$annotations",
        "getCenter",
        "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "End",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "getEnd$annotations",
        "getEnd",
        "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "SpaceAround",
        "getSpaceAround$annotations",
        "getSpaceAround",
        "SpaceBetween",
        "getSpaceBetween$annotations",
        "getSpaceBetween",
        "SpaceEvenly",
        "getSpaceEvenly$annotations",
        "getSpaceEvenly",
        "Start",
        "getStart$annotations",
        "getStart",
        "Top",
        "getTop$annotations",
        "getTop",
        "aligned",
        "alignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "placeCenter",
        "",
        "totalSize",
        "",
        "size",
        "",
        "outPosition",
        "reverseInput",
        "",
        "placeCenter$foundation_layout_release",
        "placeLeftOrTop",
        "placeLeftOrTop$foundation_layout_release",
        "placeRightOrBottom",
        "placeRightOrBottom$foundation_layout_release",
        "placeSpaceAround",
        "placeSpaceAround$foundation_layout_release",
        "placeSpaceBetween",
        "placeSpaceBetween$foundation_layout_release",
        "placeSpaceEvenly",
        "placeSpaceEvenly$foundation_layout_release",
        "spacedBy",
        "space",
        "Landroidx/compose/ui/unit/Dp;",
        "spacedBy-0680j_4",
        "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "spacedBy-D5KLDUw",
        "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "forEachIndexed",
        "reversed",
        "action",
        "Lkotlin/Function2;",
        "Absolute",
        "Horizontal",
        "HorizontalOrVertical",
        "SpacedAligned",
        "Vertical",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Landroidx/compose/foundation/layout/Arrangement;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Start$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Start$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$End$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$End$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Top$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Top$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Bottom$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Bottom$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Center$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Center$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceBetween$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceBetween$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceAround$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceAround$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final forEachIndexed([IZLkotlin/jvm/functions/Function2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([IZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    array-length p0, p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge p2, p0, :cond_2

    aget v1, p1, p2

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 v2, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v2

    goto :goto_0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_2

    :goto_1
    add-int/lit8 p2, p0, -0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aget p0, p1, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p3, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-gez p2, :cond_1

    goto :goto_2

    :cond_1
    move p0, p2

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public static synthetic getBottom$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getCenter$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getEnd$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getSpaceAround$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getSpaceBetween$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getSpaceEvenly$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getStart$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getTop$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method


# virtual methods
.method public final aligned(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 3
    .param p1    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "alignment"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    new-instance v1, Landroidx/compose/foundation/layout/Arrangement$aligned$1;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/layout/Arrangement$aligned$1;-><init>(Landroidx/compose/ui/Alignment$Horizontal;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public final aligned(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 3
    .param p1    # Landroidx/compose/ui/Alignment$Vertical;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "alignment"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    const/4 v0, 0x0

    int-to-float v1, v0

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    new-instance v2, Landroidx/compose/foundation/layout/Arrangement$aligned$2;

    invoke-direct {v2, p1}, Landroidx/compose/foundation/layout/Arrangement$aligned$2;-><init>(Landroidx/compose/ui/Alignment$Vertical;)V

    const/4 p1, 0x0

    invoke-direct {p0, v1, v0, v2, p1}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public final getBottom()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-object p0
.end method

.method public final getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-object p0
.end method

.method public final getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    return-object p0
.end method

.method public final getSpaceAround()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-object p0
.end method

.method public final getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-object p0
.end method

.method public final getSpaceEvenly()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-object p0
.end method

.method public final getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    return-object p0
.end method

.method public final getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-object p0
.end method

.method public final placeCenter$foundation_layout_release(I[I[IZ)V
    .locals 4
    .param p2    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "size"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "outPosition"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p0, p2

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v1, p0, :cond_0

    aget v3, p2, v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v2

    int-to-float p0, p1

    const/4 p1, 0x2

    int-to-float p1, p1

    div-float/2addr p0, p1

    array-length p1, p2

    if-nez p4, :cond_1

    move p4, v0

    :goto_1
    if-ge v0, p1, :cond_3

    aget v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v2, p4, 0x1

    invoke-static {p0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    aput v3, p3, p4

    int-to-float p4, v1

    add-float/2addr p0, p4

    move p4, v2

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_3

    :goto_2
    add-int/lit8 p4, p1, -0x1

    aget v0, p2, p1

    invoke-static {p0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    aput v1, p3, p1

    int-to-float p1, v0

    add-float/2addr p0, p1

    if-gez p4, :cond_2

    goto :goto_3

    :cond_2
    move p1, p4

    goto :goto_2

    :cond_3
    :goto_3
    return-void
.end method

.method public final placeLeftOrTop$foundation_layout_release([I[IZ)V
    .locals 4
    .param p1    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "size"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "outPosition"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-nez p3, :cond_0

    array-length p3, p1

    move v0, p0

    move v1, v0

    :goto_0
    if-ge p0, p3, :cond_2

    aget v2, p1, p0

    add-int/lit8 p0, p0, 0x1

    add-int/lit8 v3, v0, 0x1

    aput v1, p2, v0

    add-int/2addr v1, v2

    move v0, v3

    goto :goto_0

    :cond_0
    array-length p3, p1

    add-int/lit8 p3, p3, -0x1

    if-ltz p3, :cond_2

    :goto_1
    add-int/lit8 v0, p3, -0x1

    aget v1, p1, p3

    aput p0, p2, p3

    add-int/2addr p0, v1

    if-gez v0, :cond_1

    goto :goto_2

    :cond_1
    move p3, v0

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public final placeRightOrBottom$foundation_layout_release(I[I[IZ)V
    .locals 4
    .param p2    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "size"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "outPosition"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p0, p2

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v1, p0, :cond_0

    aget v3, p2, v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v2

    array-length p0, p2

    if-nez p4, :cond_1

    move p4, v0

    :goto_1
    if-ge v0, p0, :cond_3

    aget v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v2, p4, 0x1

    aput p1, p3, p4

    add-int/2addr p1, v1

    move p4, v2

    goto :goto_1

    :cond_1
    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_3

    :goto_2
    add-int/lit8 p4, p0, -0x1

    aget v0, p2, p0

    aput p1, p3, p0

    add-int/2addr p1, v0

    if-gez p4, :cond_2

    goto :goto_3

    :cond_2
    move p0, p4

    goto :goto_2

    :cond_3
    :goto_3
    return-void
.end method

.method public final placeSpaceAround$foundation_layout_release(I[I[IZ)V
    .locals 5
    .param p2    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "size"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "outPosition"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p0, p2

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v1, p0, :cond_0

    aget v3, p2, v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    array-length p0, p2

    const/4 v1, 0x1

    if-nez p0, :cond_1

    move p0, v1

    goto :goto_1

    :cond_1
    move p0, v0

    :goto_1
    xor-int/2addr p0, v1

    if-eqz p0, :cond_2

    sub-int/2addr p1, v2

    int-to-float p0, p1

    array-length p1, p2

    int-to-float p1, p1

    div-float/2addr p0, p1

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    :goto_2
    const/4 p1, 0x2

    int-to-float p1, p1

    div-float p1, p0, p1

    if-nez p4, :cond_3

    array-length p4, p2

    move v1, v0

    :goto_3
    if-ge v0, p4, :cond_5

    aget v2, p2, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v3, v1, 0x1

    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    aput v4, p3, v1

    int-to-float v1, v2

    add-float/2addr v1, p0

    add-float/2addr p1, v1

    move v1, v3

    goto :goto_3

    :cond_3
    array-length p4, p2

    sub-int/2addr p4, v1

    if-ltz p4, :cond_5

    :goto_4
    add-int/lit8 v0, p4, -0x1

    aget v1, p2, p4

    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    aput v2, p3, p4

    int-to-float p4, v1

    add-float/2addr p4, p0

    add-float/2addr p1, p4

    if-gez v0, :cond_4

    goto :goto_5

    :cond_4
    move p4, v0

    goto :goto_4

    :cond_5
    :goto_5
    return-void
.end method

.method public final placeSpaceBetween$foundation_layout_release(I[I[IZ)V
    .locals 5
    .param p2    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "size"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "outPosition"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p0, p2

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v1, p0, :cond_0

    aget v3, p2, v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    array-length p0, p2

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-le p0, v3, :cond_1

    sub-int/2addr p1, v2

    int-to-float p0, p1

    array-length p1, p2

    sub-int/2addr p1, v3

    int-to-float p1, p1

    div-float/2addr p0, p1

    goto :goto_1

    :cond_1
    move p0, v1

    :goto_1
    array-length p1, p2

    if-nez p4, :cond_2

    move p4, v0

    :goto_2
    if-ge v0, p1, :cond_4

    aget v2, p2, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v3, p4, 0x1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    aput v4, p3, p4

    int-to-float p4, v2

    add-float/2addr p4, p0

    add-float/2addr v1, p4

    move p4, v3

    goto :goto_2

    :cond_2
    sub-int/2addr p1, v3

    if-ltz p1, :cond_4

    :goto_3
    add-int/lit8 p4, p1, -0x1

    aget v0, p2, p1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    aput v2, p3, p1

    int-to-float p1, v0

    add-float/2addr p1, p0

    add-float/2addr v1, p1

    if-gez p4, :cond_3

    goto :goto_4

    :cond_3
    move p1, p4

    goto :goto_3

    :cond_4
    :goto_4
    return-void
.end method

.method public final placeSpaceEvenly$foundation_layout_release(I[I[IZ)V
    .locals 5
    .param p2    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p0, "size"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "outPosition"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p0, p2

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v1, p0, :cond_0

    aget v3, p2, v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v2

    int-to-float p0, p1

    array-length p1, p2

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    div-float/2addr p0, p1

    array-length p1, p2

    if-nez p4, :cond_1

    move v1, p0

    move p4, v0

    :goto_1
    if-ge v0, p1, :cond_3

    aget v2, p2, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v3, p4, 0x1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    aput v4, p3, p4

    int-to-float p4, v2

    add-float/2addr p4, p0

    add-float/2addr v1, p4

    move p4, v3

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_3

    move p4, p0

    :goto_2
    add-int/lit8 v0, p1, -0x1

    aget v1, p2, p1

    invoke-static {p4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    aput v2, p3, p1

    int-to-float p1, v1

    add-float/2addr p1, p0

    add-float/2addr p4, p1

    if-gez v0, :cond_2

    goto :goto_3

    :cond_2
    move p1, v0

    goto :goto_2

    :cond_3
    :goto_3
    return-void
.end method

.method public final spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 3
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    sget-object v0, Landroidx/compose/foundation/layout/Arrangement$spacedBy$1;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement$spacedBy$1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v0, v2}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public final spacedBy-D5KLDUw(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 2
    .param p2    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "alignment"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$spacedBy$2;

    invoke-direct {v0, p2}, Landroidx/compose/foundation/layout/Arrangement$spacedBy$2;-><init>(Landroidx/compose/ui/Alignment$Horizontal;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public final spacedBy-D5KLDUw(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 2
    .param p2    # Landroidx/compose/ui/Alignment$Vertical;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "alignment"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$spacedBy$3;

    invoke-direct {v0, p2}, Landroidx/compose/foundation/layout/Arrangement$spacedBy$3;-><init>(Landroidx/compose/ui/Alignment$Vertical;)V

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method
