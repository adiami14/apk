.class public final Landroidx/compose/material/ExposedDropdownMenuDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/material/ExperimentalMaterialApi;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008H\u0007\u00a2\u0006\u0002\u0010\tJ\u00f1\u0001\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\r2\u0008\u0008\u0002\u0010 \u001a\u00020\r2\u0008\u0008\u0002\u0010!\u001a\u00020\r2\u0008\u0008\u0002\u0010\"\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u00f1\u0001\u0010%\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r2\u0008\u0008\u0002\u0010&\u001a\u00020\r2\u0008\u0008\u0002\u0010\'\u001a\u00020\r2\u0008\u0008\u0002\u0010(\u001a\u00020\r2\u0008\u0008\u0002\u0010)\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\r2\u0008\u0008\u0002\u0010 \u001a\u00020\r2\u0008\u0008\u0002\u0010!\u001a\u00020\r2\u0008\u0008\u0002\u0010\"\u001a\u00020\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008*\u0010$\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006+"
    }
    d2 = {
        "Landroidx/compose/material/ExposedDropdownMenuDefaults;",
        "",
        "()V",
        "TrailingIcon",
        "",
        "expanded",
        "",
        "onIconClick",
        "Lkotlin/Function0;",
        "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V",
        "outlinedTextFieldColors",
        "Landroidx/compose/material/TextFieldColors;",
        "textColor",
        "Landroidx/compose/ui/graphics/Color;",
        "disabledTextColor",
        "backgroundColor",
        "cursorColor",
        "errorCursorColor",
        "focusedBorderColor",
        "unfocusedBorderColor",
        "disabledBorderColor",
        "errorBorderColor",
        "leadingIconColor",
        "disabledLeadingIconColor",
        "errorLeadingIconColor",
        "trailingIconColor",
        "focusedTrailingIconColor",
        "disabledTrailingIconColor",
        "errorTrailingIconColor",
        "focusedLabelColor",
        "unfocusedLabelColor",
        "disabledLabelColor",
        "errorLabelColor",
        "placeholderColor",
        "disabledPlaceholderColor",
        "outlinedTextFieldColors-DlUQjxs",
        "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;",
        "textFieldColors",
        "focusedIndicatorColor",
        "unfocusedIndicatorColor",
        "disabledIndicatorColor",
        "errorIndicatorColor",
        "textFieldColors-DlUQjxs",
        "material_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/material/ExposedDropdownMenuDefaults;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material/ExposedDropdownMenuDefaults;

    invoke-direct {v0}, Landroidx/compose/material/ExposedDropdownMenuDefaults;-><init>()V

    sput-object v0, Landroidx/compose/material/ExposedDropdownMenuDefaults;->INSTANCE:Landroidx/compose/material/ExposedDropdownMenuDefaults;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final TrailingIcon(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move v2, p1

    const v0, -0x22261718

    move-object v1, p3

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v0

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_2

    invoke-interface {v0, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_2
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p4, 0x70

    if-nez v4, :cond_5

    move-object v4, p2

    invoke-interface {v0, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    goto :goto_4

    :cond_5
    :goto_3
    move-object v4, p2

    :goto_4
    and-int/lit8 v5, v1, 0x5b

    xor-int/lit8 v5, v5, 0x12

    if-nez v5, :cond_7

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v4

    goto :goto_7

    :cond_7
    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$1;->INSTANCE:Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$1;

    move-object v11, v3

    goto :goto_6

    :cond_8
    move-object v11, v4

    :goto_6
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    sget-object v4, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$2;->INSTANCE:Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$2;

    invoke-static {v3, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->clearAndSetSemantics(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v3, -0x30deb53c

    new-instance v7, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$3;

    invoke-direct {v7, p1}, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$3;-><init>(Z)V

    const/4 v8, 0x1

    invoke-static {v0, v3, v8, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v7

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v9, v1, 0x6000

    const/16 v10, 0xc

    move-object v3, v11

    move-object v8, v0

    invoke-static/range {v3 .. v10}, Landroidx/compose/material/IconButtonKt;->IconButton(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    :goto_7
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-nez v6, :cond_9

    goto :goto_8

    :cond_9
    new-instance v7, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material/ExposedDropdownMenuDefaults$TrailingIcon$4;-><init>(Landroidx/compose/material/ExposedDropdownMenuDefaults;ZLkotlin/jvm/functions/Function0;II)V

    invoke-interface {v6, v7}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void
.end method

.method public final outlinedTextFieldColors-DlUQjxs(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;
    .locals 52
    .param p45    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p45

    move/from16 v1, p49

    const v2, -0x1624ebd7

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-static {}, Landroidx/compose/material/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v3

    invoke-static {}, Landroidx/compose/material/ContentAlphaKt;->getLocalContentAlpha()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    const/4 v12, 0x6

    if-eqz v4, :cond_1

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    move-wide v4, v2

    invoke-static/range {v4 .. v11}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide v7, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p3

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v4

    move-wide/from16 v35, v4

    goto :goto_2

    :cond_2
    move-wide/from16 v35, p5

    :goto_2
    and-int/lit8 v4, v1, 0x8

    if-eqz v4, :cond_3

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v4

    move-wide v9, v4

    goto :goto_3

    :cond_3
    move-wide/from16 v9, p7

    :goto_3
    and-int/lit8 v4, v1, 0x10

    if-eqz v4, :cond_4

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v4

    move-wide v13, v4

    goto :goto_4

    :cond_4
    move-wide/from16 v13, p9

    :goto_4
    and-int/lit8 v4, v1, 0x20

    if-eqz v4, :cond_5

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getHigh(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/16 v18, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v15

    move/from16 p5, v16

    move/from16 p6, v17

    move-object/from16 p7, v18

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide v15, v4

    goto :goto_5

    :cond_5
    move-wide/from16 v15, p11

    :goto_5
    and-int/lit8 v4, v1, 0x40

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v20, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v17

    move/from16 p5, v18

    move/from16 p6, v19

    move-object/from16 p7, v20

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v17, v4

    goto :goto_6

    :cond_6
    move-wide/from16 v17, p13

    :goto_6
    and-int/lit16 v4, v1, 0x80

    if-eqz v4, :cond_7

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v19, 0xe

    const/16 v20, 0x0

    move-wide/from16 p0, v17

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v19

    move-object/from16 p7, v20

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v19, v4

    goto :goto_7

    :cond_7
    move-wide/from16 v19, p15

    :goto_7
    and-int/lit16 v4, v1, 0x100

    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v4

    move-wide/from16 v21, v4

    goto :goto_8

    :cond_8
    move-wide/from16 v21, p17

    :goto_8
    and-int/lit16 v4, v1, 0x200

    if-eqz v4, :cond_9

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    const v6, 0x3f0a3d71    # 0.54f

    const/4 v11, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0xe

    const/16 v26, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v23

    move/from16 p5, v24

    move/from16 p6, v25

    move-object/from16 p7, v26

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v23, v4

    goto :goto_9

    :cond_9
    move-wide/from16 v23, p19

    :goto_9
    and-int/lit16 v4, v1, 0x400

    if-eqz v4, :cond_a

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v25, 0xe

    const/16 v26, 0x0

    move-wide/from16 p0, v23

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v25

    move-object/from16 p7, v26

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v25, v4

    goto :goto_a

    :cond_a
    move-wide/from16 v25, p21

    :goto_a
    and-int/lit16 v4, v1, 0x800

    if-eqz v4, :cond_b

    move-wide/from16 v27, v23

    goto :goto_b

    :cond_b
    move-wide/from16 v27, p23

    :goto_b
    and-int/lit16 v4, v1, 0x1000

    if-eqz v4, :cond_c

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    const v6, 0x3f0a3d71    # 0.54f

    const/4 v11, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0xe

    const/16 v32, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v29

    move/from16 p5, v30

    move/from16 p6, v31

    move-object/from16 p7, v32

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v29, v4

    goto :goto_c

    :cond_c
    move-wide/from16 v29, p25

    :goto_c
    and-int/lit16 v4, v1, 0x2000

    if-eqz v4, :cond_d

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getHigh(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0xe

    const/16 v34, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v31

    move/from16 p5, v32

    move/from16 p6, v33

    move-object/from16 p7, v34

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v31, v4

    goto :goto_d

    :cond_d
    move-wide/from16 v31, p27

    :goto_d
    and-int/lit16 v4, v1, 0x4000

    if-eqz v4, :cond_e

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v33, 0xe

    const/16 v34, 0x0

    move-wide/from16 p0, v29

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v33

    move-object/from16 p7, v34

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v33, v4

    goto :goto_e

    :cond_e
    move-wide/from16 v33, p29

    :goto_e
    const v4, 0x8000

    and-int/2addr v4, v1

    if-eqz v4, :cond_f

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v4

    move-wide/from16 v37, v4

    goto :goto_f

    :cond_f
    move-wide/from16 v37, p31

    :goto_f
    const/high16 v4, 0x10000

    and-int/2addr v4, v1

    if-eqz v4, :cond_10

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getHigh(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0xe

    const/16 v42, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v39

    move/from16 p5, v40

    move/from16 p6, v41

    move-object/from16 p7, v42

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v39, v4

    goto :goto_10

    :cond_10
    move-wide/from16 v39, p33

    :goto_10
    const/high16 v4, 0x20000

    and-int/2addr v4, v1

    if-eqz v4, :cond_11

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getMedium(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0xe

    const/16 v44, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v41

    move/from16 p5, v42

    move/from16 p6, v43

    move-object/from16 p7, v44

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v41, v4

    goto :goto_11

    :cond_11
    move-wide/from16 v41, p35

    :goto_11
    const/high16 v4, 0x40000

    and-int/2addr v4, v1

    if-eqz v4, :cond_12

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v43, 0xe

    const/16 v44, 0x0

    move-wide/from16 p0, v41

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v43

    move-object/from16 p7, v44

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v43, v4

    goto :goto_12

    :cond_12
    move-wide/from16 v43, p37

    :goto_12
    const/high16 v4, 0x80000

    and-int/2addr v4, v1

    if-eqz v4, :cond_13

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v4

    move-wide/from16 v45, v4

    goto :goto_13

    :cond_13
    move-wide/from16 v45, p39

    :goto_13
    const/high16 v4, 0x100000

    and-int/2addr v4, v1

    if-eqz v4, :cond_14

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getMedium(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0xe

    const/16 v50, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v47

    move/from16 p5, v48

    move/from16 p6, v49

    move-object/from16 p7, v50

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v47, v4

    goto :goto_14

    :cond_14
    move-wide/from16 v47, p41

    :goto_14
    const/high16 v4, 0x200000

    and-int/2addr v1, v4

    if-eqz v1, :cond_15

    sget-object v1, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v1, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v11, 0xe

    const/4 v12, 0x0

    move-wide/from16 p0, v47

    move/from16 p2, v1

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v11

    move-object/from16 p7, v12

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v50, v4

    goto :goto_15

    :cond_15
    move-wide/from16 v50, p43

    :goto_15
    new-instance v1, Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;

    move-object v4, v1

    const/16 v49, 0x0

    move-wide v5, v2

    move-wide v11, v13

    move-wide v13, v15

    move-wide/from16 v15, v17

    move-wide/from16 v17, v21

    move-wide/from16 v21, v23

    move-wide/from16 v23, v25

    move-wide/from16 v25, v27

    move-wide/from16 v27, v29

    move-wide/from16 v29, v31

    move-wide/from16 v31, v33

    move-wide/from16 v33, v37

    move-wide/from16 v37, v39

    move-wide/from16 v39, v41

    move-wide/from16 v41, v43

    move-wide/from16 v43, v45

    move-wide/from16 v45, v47

    move-wide/from16 v47, v50

    invoke-direct/range {v4 .. v49}, Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;-><init>(JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {p45 .. p45}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object v1
.end method

.method public final textFieldColors-DlUQjxs(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;
    .locals 52
    .param p45    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p45

    move/from16 v1, p49

    const v2, -0x52ca91b2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-static {}, Landroidx/compose/material/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v3

    invoke-static {}, Landroidx/compose/material/ContentAlphaKt;->getLocalContentAlpha()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    const/4 v12, 0x6

    if-eqz v4, :cond_1

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    move-wide v4, v2

    invoke-static/range {v4 .. v11}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide v7, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p3

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v13

    const v15, 0x3df5c28f    # 0.12f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v20, 0x0

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v35, v4

    goto :goto_2

    :cond_2
    move-wide/from16 v35, p5

    :goto_2
    and-int/lit8 v4, v1, 0x8

    if-eqz v4, :cond_3

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v4

    move-wide v9, v4

    goto :goto_3

    :cond_3
    move-wide/from16 v9, p7

    :goto_3
    and-int/lit8 v4, v1, 0x10

    if-eqz v4, :cond_4

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v4

    move-wide v13, v4

    goto :goto_4

    :cond_4
    move-wide/from16 v13, p9

    :goto_4
    and-int/lit8 v4, v1, 0x20

    if-eqz v4, :cond_5

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getHigh(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/16 v18, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v15

    move/from16 p5, v16

    move/from16 p6, v17

    move-object/from16 p7, v18

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide v15, v4

    goto :goto_5

    :cond_5
    move-wide/from16 v15, p11

    :goto_5
    and-int/lit8 v4, v1, 0x40

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    const v6, 0x3ed70a3d    # 0.42f

    const/4 v11, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v20, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v17

    move/from16 p5, v18

    move/from16 p6, v19

    move-object/from16 p7, v20

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v17, v4

    goto :goto_6

    :cond_6
    move-wide/from16 v17, p13

    :goto_6
    and-int/lit16 v4, v1, 0x80

    if-eqz v4, :cond_7

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v19, 0xe

    const/16 v20, 0x0

    move-wide/from16 p0, v17

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v19

    move-object/from16 p7, v20

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v19, v4

    goto :goto_7

    :cond_7
    move-wide/from16 v19, p15

    :goto_7
    and-int/lit16 v4, v1, 0x100

    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v4

    move-wide/from16 v21, v4

    goto :goto_8

    :cond_8
    move-wide/from16 v21, p17

    :goto_8
    and-int/lit16 v4, v1, 0x200

    if-eqz v4, :cond_9

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    const v6, 0x3f0a3d71    # 0.54f

    const/4 v11, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0xe

    const/16 v26, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v23

    move/from16 p5, v24

    move/from16 p6, v25

    move-object/from16 p7, v26

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v23, v4

    goto :goto_9

    :cond_9
    move-wide/from16 v23, p19

    :goto_9
    and-int/lit16 v4, v1, 0x400

    if-eqz v4, :cond_a

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v25, 0xe

    const/16 v26, 0x0

    move-wide/from16 p0, v23

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v25

    move-object/from16 p7, v26

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v25, v4

    goto :goto_a

    :cond_a
    move-wide/from16 v25, p21

    :goto_a
    and-int/lit16 v4, v1, 0x800

    if-eqz v4, :cond_b

    move-wide/from16 v27, v23

    goto :goto_b

    :cond_b
    move-wide/from16 v27, p23

    :goto_b
    and-int/lit16 v4, v1, 0x1000

    if-eqz v4, :cond_c

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    const v6, 0x3f0a3d71    # 0.54f

    const/4 v11, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0xe

    const/16 v32, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v29

    move/from16 p5, v30

    move/from16 p6, v31

    move-object/from16 p7, v32

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v29, v4

    goto :goto_c

    :cond_c
    move-wide/from16 v29, p25

    :goto_c
    and-int/lit16 v4, v1, 0x2000

    if-eqz v4, :cond_d

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getHigh(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0xe

    const/16 v34, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v31

    move/from16 p5, v32

    move/from16 p6, v33

    move-object/from16 p7, v34

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v31, v4

    goto :goto_d

    :cond_d
    move-wide/from16 v31, p27

    :goto_d
    and-int/lit16 v4, v1, 0x4000

    if-eqz v4, :cond_e

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v33, 0xe

    const/16 v34, 0x0

    move-wide/from16 p0, v29

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v33

    move-object/from16 p7, v34

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v33, v4

    goto :goto_e

    :cond_e
    move-wide/from16 v33, p29

    :goto_e
    const v4, 0x8000

    and-int/2addr v4, v1

    if-eqz v4, :cond_f

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v4

    move-wide/from16 v37, v4

    goto :goto_f

    :cond_f
    move-wide/from16 v37, p31

    :goto_f
    const/high16 v4, 0x10000

    and-int/2addr v4, v1

    if-eqz v4, :cond_10

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getHigh(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0xe

    const/16 v42, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v39

    move/from16 p5, v40

    move/from16 p6, v41

    move-object/from16 p7, v42

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v39, v4

    goto :goto_10

    :cond_10
    move-wide/from16 v39, p33

    :goto_10
    const/high16 v4, 0x20000

    and-int/2addr v4, v1

    if-eqz v4, :cond_11

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getMedium(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0xe

    const/16 v44, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v41

    move/from16 p5, v42

    move/from16 p6, v43

    move-object/from16 p7, v44

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v41, v4

    goto :goto_11

    :cond_11
    move-wide/from16 v41, p35

    :goto_11
    const/high16 v4, 0x40000

    and-int/2addr v4, v1

    if-eqz v4, :cond_12

    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/16 v43, 0xe

    const/16 v44, 0x0

    move-wide/from16 p0, v41

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v11

    move/from16 p6, v43

    move-object/from16 p7, v44

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v43, v4

    goto :goto_12

    :cond_12
    move-wide/from16 v43, p37

    :goto_12
    const/high16 v4, 0x80000

    and-int/2addr v4, v1

    if-eqz v4, :cond_13

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v4

    move-wide/from16 v45, v4

    goto :goto_13

    :cond_13
    move-wide/from16 v45, p39

    :goto_13
    const/high16 v4, 0x100000

    and-int/2addr v4, v1

    if-eqz v4, :cond_14

    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v12}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    sget-object v6, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v6, v0, v12}, Landroidx/compose/material/ContentAlpha;->getMedium(Landroidx/compose/runtime/Composer;I)F

    move-result v6

    const/4 v11, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0xe

    const/16 v50, 0x0

    move-wide/from16 p0, v4

    move/from16 p2, v6

    move/from16 p3, v11

    move/from16 p4, v47

    move/from16 p5, v48

    move/from16 p6, v49

    move-object/from16 p7, v50

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v47, v4

    goto :goto_14

    :cond_14
    move-wide/from16 v47, p41

    :goto_14
    const/high16 v4, 0x200000

    and-int/2addr v1, v4

    if-eqz v1, :cond_15

    sget-object v1, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v1, v0, v12}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v11, 0xe

    const/4 v12, 0x0

    move-wide/from16 p0, v47

    move/from16 p2, v1

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v11

    move-object/from16 p7, v12

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v50, v4

    goto :goto_15

    :cond_15
    move-wide/from16 v50, p43

    :goto_15
    new-instance v1, Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;

    move-object v4, v1

    const/16 v49, 0x0

    move-wide v5, v2

    move-wide v11, v13

    move-wide v13, v15

    move-wide/from16 v15, v17

    move-wide/from16 v17, v21

    move-wide/from16 v21, v23

    move-wide/from16 v23, v25

    move-wide/from16 v25, v27

    move-wide/from16 v27, v29

    move-wide/from16 v29, v31

    move-wide/from16 v31, v33

    move-wide/from16 v33, v37

    move-wide/from16 v37, v39

    move-wide/from16 v39, v41

    move-wide/from16 v41, v43

    move-wide/from16 v43, v45

    move-wide/from16 v45, v47

    move-wide/from16 v47, v50

    invoke-direct/range {v4 .. v49}, Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;-><init>(JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {p45 .. p45}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object v1
.end method
