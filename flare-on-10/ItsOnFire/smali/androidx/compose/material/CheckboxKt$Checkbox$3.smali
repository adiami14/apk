.class final Landroidx/compose/material/CheckboxKt$Checkbox$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/CheckboxKt;->Checkbox(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
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
.field public final synthetic $$changed:I

.field public final synthetic $$default:I

.field public final synthetic $checked:Z

.field public final synthetic $colors:Landroidx/compose/material/CheckboxColors;

.field public final synthetic $enabled:Z

.field public final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field public final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field public final synthetic $onCheckedChange:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/material/CheckboxColors;",
            "II)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$checked:Z

    iput-object p2, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$onCheckedChange:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$modifier:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$enabled:Z

    iput-object p5, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p6, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$colors:Landroidx/compose/material/CheckboxColors;

    iput p7, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$$changed:I

    iput p8, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$$default:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/CheckboxKt$Checkbox$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-boolean v0, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$checked:Z

    iget-object v1, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$onCheckedChange:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$enabled:Z

    iget-object v4, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v5, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$colors:Landroidx/compose/material/CheckboxColors;

    iget p2, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$$changed:I

    or-int/lit8 v7, p2, 0x1

    iget v8, p0, Landroidx/compose/material/CheckboxKt$Checkbox$3;->$$default:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Landroidx/compose/material/CheckboxKt;->Checkbox(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
