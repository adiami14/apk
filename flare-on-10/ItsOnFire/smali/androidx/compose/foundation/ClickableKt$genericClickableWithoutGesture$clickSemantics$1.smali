.class final Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/ClickableKt;->genericClickableWithoutGesture_BI_LeDI$clickSemantics(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic $enabled:Z

.field public final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $onClickLabel:Ljava/lang/String;

.field public final synthetic $onLongClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic $onLongClickLabel:Ljava/lang/String;

.field public final synthetic $role:Landroidx/compose/ui/semantics/Role;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/semantics/Role;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$role:Landroidx/compose/ui/semantics/Role;

    iput-object p2, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$onClickLabel:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$onLongClick:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$onLongClickLabel:Ljava/lang/String;

    iput-boolean p5, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$enabled:Z

    iput-object p6, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$onClick:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 3
    .param p1    # Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$role:Landroidx/compose/ui/semantics/Role;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/semantics/Role;->unbox-impl()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setRole-kuIjeqM(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$onClickLabel:Ljava/lang/String;

    new-instance v1, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1$1;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$onClick:Lkotlin/jvm/functions/Function0;

    invoke-direct {v1, v2}, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {p1, v0, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onClick(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    iget-object v0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$onLongClick:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$onLongClickLabel:Ljava/lang/String;

    new-instance v2, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1$2;

    invoke-direct {v2, v0}, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {p1, v1, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onLongClick(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    :cond_1
    iget-boolean p0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$clickSemantics$1;->$enabled:Z

    if-nez p0, :cond_2

    invoke-static {p1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->disabled(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    :cond_2
    return-void
.end method
