.class public final Landroidx/compose/foundation/text/TextFieldMagnifierKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aa\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u000c\"\u0004\u0008\u0000\u0010\r\"\u0008\u0008\u0001\u0010\u000e*\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\n2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u0001H\r2\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u00132\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u0015H\u0003\u00a2\u0006\u0002\u0010\u0016\u001a\u0097\u0001\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00152\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e2#\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u001f\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(#\u0012\u0006\u0012\u0004\u0018\u00010$0\u001e2\'\u0010%\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010\'\u001a\u00020(H\u0000\u00f8\u0001\u0000\u001aJ\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\u0006\u0010)\u001a\u00020*2\'\u0010%\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u00180\u001e2\u0008\u0008\u0002\u0010\'\u001a\u00020(H\u0000\u00f8\u0001\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u001d\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00080\nX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006+"
    }
    d2 = {
        "OffsetDisplacementThreshold",
        "Landroidx/compose/ui/geometry/Offset;",
        "J",
        "TextFieldMagnifierOffsetProperty",
        "Landroidx/compose/ui/semantics/SemanticsPropertyKey;",
        "getTextFieldMagnifierOffsetProperty",
        "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;",
        "UnspecifiedAnimationVector2D",
        "Landroidx/compose/animation/core/AnimationVector2D;",
        "UnspecifiedSafeOffsetVectorConverter",
        "Landroidx/compose/animation/core/TwoWayConverter;",
        "rememberAnimatedDerivedStateOf",
        "Landroidx/compose/runtime/State;",
        "T",
        "V",
        "Landroidx/compose/animation/core/AnimationVector;",
        "typeConverter",
        "visibilityThreshold",
        "animationSpec",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "targetCalculation",
        "Lkotlin/Function0;",
        "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;",
        "textFieldMagnifierAndroidImpl",
        "Landroidx/compose/ui/Modifier;",
        "draggingHandle",
        "Landroidx/compose/foundation/text/Handle;",
        "fieldValue",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "transformTextOffset",
        "Lkotlin/Function1;",
        "",
        "getCursorRect",
        "Lkotlin/ParameterName;",
        "name",
        "offset",
        "Landroidx/compose/ui/geometry/Rect;",
        "androidMagnifier",
        "center",
        "isTextMagnifierSemanticsEnabled",
        "",
        "manager",
        "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final OffsetDisplacementThreshold:J

.field private static final TextFieldMagnifierOffsetProperty:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final UnspecifiedAnimationVector2D:Landroidx/compose/animation/core/AnimationVector2D;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final UnspecifiedSafeOffsetVectorConverter:Landroidx/compose/animation/core/TwoWayConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "Landroidx/compose/ui/geometry/Offset;",
            "Landroidx/compose/animation/core/AnimationVector2D;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    const-string v1, "TextFieldMagnifier"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Landroidx/compose/ui/semantics/SemanticsPropertyKey;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->TextFieldMagnifierOffsetProperty:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    new-instance v0, Landroidx/compose/animation/core/AnimationVector2D;

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v1, v1}, Landroidx/compose/animation/core/AnimationVector2D;-><init>(FF)V

    sput-object v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->UnspecifiedAnimationVector2D:Landroidx/compose/animation/core/AnimationVector2D;

    sget-object v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1;->INSTANCE:Landroidx/compose/foundation/text/TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1;

    sget-object v1, Landroidx/compose/foundation/text/TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2;->INSTANCE:Landroidx/compose/foundation/text/TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2;

    invoke-static {v0, v1}, Landroidx/compose/animation/core/VectorConvertersKt;->TwoWayConverter(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->UnspecifiedSafeOffsetVectorConverter:Landroidx/compose/animation/core/TwoWayConverter;

    const v0, 0x3c23d70a    # 0.01f

    invoke-static {v0, v0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->OffsetDisplacementThreshold:J

    return-void
.end method

.method public static final synthetic access$getOffsetDisplacementThreshold$p()J
    .locals 2

    sget-wide v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->OffsetDisplacementThreshold:J

    return-wide v0
.end method

.method public static final synthetic access$getUnspecifiedAnimationVector2D$p()Landroidx/compose/animation/core/AnimationVector2D;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->UnspecifiedAnimationVector2D:Landroidx/compose/animation/core/AnimationVector2D;

    return-object v0
.end method

.method public static final synthetic access$getUnspecifiedSafeOffsetVectorConverter$p()Landroidx/compose/animation/core/TwoWayConverter;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->UnspecifiedSafeOffsetVectorConverter:Landroidx/compose/animation/core/TwoWayConverter;

    return-object v0
.end method

.method public static final synthetic access$rememberAnimatedDerivedStateOf(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->rememberAnimatedDerivedStateOf(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$rememberAnimatedDerivedStateOf$lambda-1(Landroidx/compose/runtime/State;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->rememberAnimatedDerivedStateOf$lambda-1(Landroidx/compose/runtime/State;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final getTextFieldMagnifierOffsetProperty()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->TextFieldMagnifierOffsetProperty:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method private static final rememberAnimatedDerivedStateOf(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 7
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;TT;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    const p5, 0x5a31ee41

    invoke-interface {p4, p5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 p5, p6, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p6, 0x4

    if-eqz p5, :cond_1

    new-instance p2, Landroidx/compose/animation/core/SpringSpec;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, p2

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Landroidx/compose/animation/core/SpringSpec;-><init>(FFLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    const p5, -0x384349

    invoke-interface {p4, p5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p6

    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne p6, v2, :cond_2

    invoke-static {p3}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object p6

    invoke-interface {p4, p6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast p6, Landroidx/compose/runtime/State;

    invoke-interface {p4, p5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p5

    if-ne p3, p5, :cond_3

    new-instance p3, Landroidx/compose/animation/core/Animatable;

    invoke-static {p6}, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->rememberAnimatedDerivedStateOf$lambda-1(Landroidx/compose/runtime/State;)Ljava/lang/Object;

    move-result-object p5

    invoke-direct {p3, p5, p0, p1}, Landroidx/compose/animation/core/Animatable;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V

    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast p3, Landroidx/compose/animation/core/Animatable;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance p1, Landroidx/compose/foundation/text/TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1;

    invoke-direct {p1, p6, p3, p2, v0}, Landroidx/compose/foundation/text/TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)V

    const/4 p2, 0x0

    invoke-static {p0, p1, p4, p2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3}, Landroidx/compose/animation/core/Animatable;->asState()Landroidx/compose/runtime/State;

    move-result-object p0

    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object p0
.end method

.method private static final rememberAnimatedDerivedStateOf$lambda-1(Landroidx/compose/runtime/State;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/State<",
            "+TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final textFieldMagnifierAndroidImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/ui/Modifier;
    .locals 7
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;+",
            "Landroidx/compose/ui/Modifier;",
            ">;Z)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidMagnifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getState$foundation_release()Landroidx/compose/foundation/text/TextFieldState;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    return-object p0

    :cond_0
    new-instance v1, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$1;

    invoke-direct {v1, v0}, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$1;-><init>(Landroidx/compose/foundation/text/TextFieldState;)V

    new-instance v2, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$2;

    invoke-direct {v2, p1}, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$2;-><init>(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    new-instance v3, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$3;

    invoke-direct {v3, p1}, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$3;-><init>(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    new-instance v4, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$4;

    invoke-direct {v4, v0}, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$4;-><init>(Landroidx/compose/foundation/text/TextFieldState;)V

    move-object v0, p0

    move-object v5, p2

    move v6, p3

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->textFieldMagnifierAndroidImpl(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final textFieldMagnifierAndroidImpl(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/ui/Modifier;
    .locals 8
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/foundation/text/Handle;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;+",
            "Landroidx/compose/ui/Modifier;",
            ">;Z)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "draggingHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformTextOffset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCursorRect"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidMagnifier"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5;

    move-object v1, v0

    move-object v2, p5

    move v3, p6

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5;-><init>(Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p0, p1, v0, p2, p1}, Landroidx/compose/ui/ComposedModifierKt;->composed$default(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic textFieldMagnifierAndroidImpl$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/TextFieldMagnifierKt;->textFieldMagnifierAndroidImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
