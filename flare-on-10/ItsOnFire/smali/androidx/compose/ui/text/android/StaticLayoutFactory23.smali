.class final Landroidx/compose/ui/text/android/StaticLayoutFactory23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x17
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/StaticLayoutFactory23;",
        "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;",
        "()V",
        "create",
        "Landroid/text/StaticLayout;",
        "params",
        "Landroidx/compose/ui/text/android/StaticLayoutParams;",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;
    .locals 4
    .param p1    # Landroidx/compose/ui/text/android/StaticLayoutParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p0, "params"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getStart()I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEnd()I

    move-result v1

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getWidth()I

    move-result v3

    invoke-static {p0, v0, v1, v2, v3}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getTextDir()Landroid/text/TextDirectionHeuristic;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getAlignment()Landroid/text/Layout$Alignment;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getMaxLines()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getEllipsizedWidth()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setEllipsizedWidth(I)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getLineSpacingExtra()F

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getLineSpacingMultiplier()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getIncludePadding()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getBreakStrategy()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getHyphenationFrequency()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getLeftIndents()[I

    move-result-object v0

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getRightIndents()[I

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/text/StaticLayout$Builder;->setIndents([I[I)Landroid/text/StaticLayout$Builder;

    sget-object v0, Landroidx/compose/ui/text/android/StaticLayoutFactory26;->INSTANCE:Landroidx/compose/ui/text/android/StaticLayoutFactory26;

    const-string v1, "this"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getJustificationMode()I

    move-result v2

    invoke-virtual {v0, p0, v2}, Landroidx/compose/ui/text/android/StaticLayoutFactory26;->setJustificationMode(Landroid/text/StaticLayout$Builder;I)V

    sget-object v0, Landroidx/compose/ui/text/android/StaticLayoutFactory28;->INSTANCE:Landroidx/compose/ui/text/android/StaticLayoutFactory28;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/compose/ui/text/android/StaticLayoutParams;->getUseFallbackLineSpacing()Z

    move-result p1

    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/text/android/StaticLayoutFactory28;->setUseLineSpacingFromFallbacks(Landroid/text/StaticLayout$Builder;Z)V

    invoke-virtual {p0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p0

    const-string p1, "obtain(params.text, para\u2026  }\n            }.build()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
