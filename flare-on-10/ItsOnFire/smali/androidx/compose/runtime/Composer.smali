.class public interface abstract Landroidx/compose/runtime/Composer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/Composer$Companion;,
        Landroidx/compose/runtime/Composer$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000c\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008f\u0018\u0000 k2\u00020\u0001:\u0001kJ@\u0010*\u001a\u00020+\"\u0004\u0008\u0000\u0010,\"\u0004\u0008\u0001\u0010-2\u0006\u0010.\u001a\u0002H,2\u001d\u0010/\u001a\u0019\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020+00\u00a2\u0006\u0002\u00081H\'\u00a2\u0006\u0002\u00102J\u0008\u00103\u001a\u000204H\'J\u0012\u00105\u001a\u00020\u001b2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\'J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001bH\u0017J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010.\u001a\u000206H\u0017J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010.\u001a\u000207H\u0017J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010.\u001a\u000208H\u0017J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010.\u001a\u000209H\u0017J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u0016H\u0017J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020:H\u0017J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020;H\u0017J\u0008\u0010<\u001a\u00020+H&J!\u0010=\u001a\u0002H-\"\u0004\u0008\u0000\u0010-2\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u0002H-0?H\'\u00a2\u0006\u0002\u0010@J\u001c\u0010A\u001a\u00020+\"\u0004\u0008\u0000\u0010-2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u0002H-0CH\'J\u0008\u0010D\u001a\u00020+H\'J\u0008\u0010E\u001a\u00020+H\'J\u0008\u0010F\u001a\u00020+H\'J\u0008\u0010G\u001a\u00020+H\'J\u0008\u0010H\u001a\u00020+H\'J\u0008\u0010I\u001a\u00020+H\'J\u0008\u0010J\u001a\u00020+H\'J\n\u0010K\u001a\u0004\u0018\u00010LH\'J\u0008\u0010M\u001a\u00020+H\'J\u001c\u0010N\u001a\u00020\u00012\u0008\u0010O\u001a\u0004\u0018\u00010\u00012\u0008\u0010P\u001a\u0004\u0018\u00010\u0001H\'J\u0016\u0010Q\u001a\u00020+2\u000c\u0010R\u001a\u0008\u0012\u0004\u0012\u00020+0CH\'J\u0010\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020#H\'J\n\u0010U\u001a\u0004\u0018\u00010\u0001H\'J\u0008\u0010V\u001a\u00020+H\'J\u0008\u0010W\u001a\u00020+H\'J\u0010\u0010X\u001a\u00020+2\u0006\u0010X\u001a\u00020YH&J\u0008\u0010Z\u001a\u00020+H&J\u0018\u0010[\u001a\u00020+2\u0006\u0010>\u001a\u00020\u00162\u0006\u0010X\u001a\u00020YH&J\u0008\u0010\\\u001a\u00020+H\'J\u001a\u0010]\u001a\u00020+2\u0006\u0010>\u001a\u00020\u00162\u0008\u0010^\u001a\u0004\u0018\u00010\u0001H\'J\u0008\u0010_\u001a\u00020+H\'J!\u0010`\u001a\u00020+2\u0012\u0010a\u001a\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030c0bH\'\u00a2\u0006\u0002\u0010dJ\u0010\u0010e\u001a\u00020+2\u0006\u0010>\u001a\u00020\u0016H\'J\u0010\u0010f\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0016H\'J\u001a\u0010g\u001a\u00020+2\u0006\u0010>\u001a\u00020\u00162\u0008\u0010^\u001a\u0004\u0018\u00010\u0001H\'J\u0008\u0010h\u001a\u00020+H\'J\u0012\u0010i\u001a\u00020+2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\'J\u0008\u0010j\u001a\u00020+H\'R\u001e\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u00038&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u00020\t8fX\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\n\u0010\u0005\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u000e8fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00168&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0017\u0010\u0005\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001b8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001c\u0010\u0005\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001b8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008 \u0010\u0005\u001a\u0004\u0008!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010#8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008$\u0010\u0005\u001a\u0004\u0008%\u0010&R\u001a\u0010\'\u001a\u00020\u001b8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008(\u0010\u0005\u001a\u0004\u0008)\u0010\u001e\u00a8\u0006l"
    }
    d2 = {
        "Landroidx/compose/runtime/Composer;",
        "",
        "applier",
        "Landroidx/compose/runtime/Applier;",
        "getApplier$annotations",
        "()V",
        "getApplier",
        "()Landroidx/compose/runtime/Applier;",
        "applyCoroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "getApplyCoroutineContext$annotations",
        "getApplyCoroutineContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "composition",
        "Landroidx/compose/runtime/ControlledComposition;",
        "getComposition",
        "()Landroidx/compose/runtime/ControlledComposition;",
        "compositionData",
        "Landroidx/compose/runtime/tooling/CompositionData;",
        "getCompositionData",
        "()Landroidx/compose/runtime/tooling/CompositionData;",
        "compoundKeyHash",
        "",
        "getCompoundKeyHash$annotations",
        "getCompoundKeyHash",
        "()I",
        "defaultsInvalid",
        "",
        "getDefaultsInvalid$annotations",
        "getDefaultsInvalid",
        "()Z",
        "inserting",
        "getInserting$annotations",
        "getInserting",
        "recomposeScope",
        "Landroidx/compose/runtime/RecomposeScope;",
        "getRecomposeScope$annotations",
        "getRecomposeScope",
        "()Landroidx/compose/runtime/RecomposeScope;",
        "skipping",
        "getSkipping$annotations",
        "getSkipping",
        "apply",
        "",
        "V",
        "T",
        "value",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/ExtensionFunctionType;",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V",
        "buildContext",
        "Landroidx/compose/runtime/CompositionContext;",
        "changed",
        "",
        "",
        "",
        "",
        "",
        "",
        "collectParameterInformation",
        "consume",
        "key",
        "Landroidx/compose/runtime/CompositionLocal;",
        "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;",
        "createNode",
        "factory",
        "Lkotlin/Function0;",
        "disableReusing",
        "enableReusing",
        "endDefaults",
        "endMovableGroup",
        "endNode",
        "endProviders",
        "endReplaceableGroup",
        "endRestartGroup",
        "Landroidx/compose/runtime/ScopeUpdateScope;",
        "endReusableGroup",
        "joinKey",
        "left",
        "right",
        "recordSideEffect",
        "effect",
        "recordUsed",
        "scope",
        "rememberedValue",
        "skipCurrentGroup",
        "skipToGroupEnd",
        "sourceInformation",
        "",
        "sourceInformationMarkerEnd",
        "sourceInformationMarkerStart",
        "startDefaults",
        "startMovableGroup",
        "dataKey",
        "startNode",
        "startProviders",
        "values",
        "",
        "Landroidx/compose/runtime/ProvidedValue;",
        "([Landroidx/compose/runtime/ProvidedValue;)V",
        "startReplaceableGroup",
        "startRestartGroup",
        "startReusableGroup",
        "startReusableNode",
        "updateRememberedValue",
        "useNode",
        "Companion",
        "runtime_release"
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
.field public static final Companion:Landroidx/compose/runtime/Composer$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/runtime/Composer$Companion;->$$INSTANCE:Landroidx/compose/runtime/Composer$Companion;

    sput-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    return-void
.end method


# virtual methods
.method public abstract apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(TV;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-TV;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract buildContext()Landroidx/compose/runtime/CompositionContext;
    .annotation runtime Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract changed(B)Z
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract changed(C)Z
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract changed(D)Z
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract changed(F)Z
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract changed(I)Z
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract changed(J)Z
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract changed(Ljava/lang/Object;)Z
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract changed(S)Z
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract changed(Z)Z
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract collectParameterInformation()V
.end method

.method public abstract consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
    .param p1    # Landroidx/compose/runtime/CompositionLocal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/CompositionLocal<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract createNode(Lkotlin/jvm/functions/Function0;)V
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)V"
        }
    .end annotation
.end method

.method public abstract disableReusing()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract enableReusing()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endDefaults()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endMovableGroup()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endNode()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endProviders()V
    .annotation runtime Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method

.method public abstract endReplaceableGroup()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract endReusableGroup()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract getApplier()Landroidx/compose/runtime/Applier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/Applier<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getApplyCoroutineContext()Lkotlin/coroutines/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getComposition()Landroidx/compose/runtime/ControlledComposition;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getCompositionData()Landroidx/compose/runtime/tooling/CompositionData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getCompoundKeyHash()I
.end method

.method public abstract getDefaultsInvalid()Z
.end method

.method public abstract getInserting()Z
.end method

.method public abstract getRecomposeScope()Landroidx/compose/runtime/RecomposeScope;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSkipping()Z
.end method

.method public abstract joinKey(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract recordSideEffect(Lkotlin/jvm/functions/Function0;)V
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract recordUsed(Landroidx/compose/runtime/RecomposeScope;)V
    .param p1    # Landroidx/compose/runtime/RecomposeScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method

.method public abstract rememberedValue()Ljava/lang/Object;
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract skipCurrentGroup()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract skipToGroupEnd()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract sourceInformation(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract sourceInformationMarkerEnd()V
.end method

.method public abstract sourceInformationMarkerStart(ILjava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract startDefaults()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startMovableGroup(ILjava/lang/Object;)V
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startNode()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startProviders([Landroidx/compose/runtime/ProvidedValue;)V
    .param p1    # [Landroidx/compose/runtime/ProvidedValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroidx/compose/runtime/ProvidedValue<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract startReplaceableGroup(I)V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startRestartGroup(I)Landroidx/compose/runtime/Composer;
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract startReusableGroup(ILjava/lang/Object;)V
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startReusableNode()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract updateRememberedValue(Ljava/lang/Object;)V
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract useNode()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method
