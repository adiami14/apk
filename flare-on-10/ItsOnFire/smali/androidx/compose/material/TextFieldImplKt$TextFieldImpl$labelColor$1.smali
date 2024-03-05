.class final Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TextFieldImplKt;->TextFieldImpl(Landroidx/compose/material/TextFieldType;ZZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/material/InputPhase;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/ui/graphics/Color;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $$dirty:I

.field public final synthetic $$dirty1:I

.field public final synthetic $colors:Landroidx/compose/material/TextFieldColors;

.field public final synthetic $enabled:Z

.field public final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field public final synthetic $isError:Z


# direct methods
.method public constructor <init>(Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$colors:Landroidx/compose/material/TextFieldColors;

    iput-boolean p2, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$enabled:Z

    iput-boolean p3, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$isError:Z

    iput-object p4, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput p5, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$$dirty:I

    iput p6, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$$dirty1:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/material/InputPhase;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->invoke-XeAY9LY(Landroidx/compose/material/InputPhase;Landroidx/compose/runtime/Composer;I)J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object p0

    return-object p0
.end method

.method public final invoke-XeAY9LY(Landroidx/compose/material/InputPhase;Landroidx/compose/runtime/Composer;I)J
    .locals 6
    .param p1    # Landroidx/compose/material/InputPhase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, -0x3f3e5066

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v0, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v1, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$enabled:Z

    sget-object p3, Landroidx/compose/material/InputPhase;->UnfocusedEmpty:Landroidx/compose/material/InputPhase;

    if-ne p1, p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$isError:Z

    :goto_0
    move v2, p1

    iget-object v3, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget p1, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$$dirty:I

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0xe

    iget p0, p0, Landroidx/compose/material/TextFieldImplKt$TextFieldImpl$labelColor$1;->$$dirty1:I

    shr-int/lit8 p3, p0, 0xf

    and-int/lit16 p3, p3, 0x380

    or-int/2addr p1, p3

    shr-int/lit8 p0, p0, 0x12

    and-int/lit16 p0, p0, 0x1c00

    or-int v5, p1, p0

    move-object v4, p2

    invoke-interface/range {v0 .. v5}, Landroidx/compose/material/TextFieldColors;->labelColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p0

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide p0

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-wide p0
.end method
