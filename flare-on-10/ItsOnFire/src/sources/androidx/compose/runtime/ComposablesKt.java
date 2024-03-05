package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��n\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ab\u0010\u0012\u001a\u00020\u0013\"\b\b��\u0010\u0014*\u00020\u0015\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\u001f\u001aq\u0010\u0012\u001a\u00020\u0013\"\u0004\b��\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\"\u001a\u0097\u0001\u0010\u0012\u001a\u00020\u0013\"\u0004\b��\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2$\b\b\u0010#\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140$\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b!¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010%\u001ab\u0010&\u001a\u00020\u0013\"\b\b��\u0010\u0014*\u00020\u0015\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\u001f\u001aq\u0010&\u001a\u00020\u0013\"\u0004\b��\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\"\u001a\u0097\u0001\u0010&\u001a\u00020\u0013\"\u0004\b��\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2$\b\b\u0010#\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140$\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b!¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010%\u001a.\u0010'\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\bø\u0001\u0001¢\u0006\u0002\u0010)\u001a\b\u0010*\u001a\u00020\u0013H\u0001\u001aB\u0010(\u001a\u0002H\u0014\"\u0004\b��\u0010\u00142\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150,\"\u0004\u0018\u00010\u00152\u0011\u0010-\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b!H\u0087\bø\u0001\u0001¢\u0006\u0002\u0010.\u001a*\u0010/\u001a\u0002H\u0014\"\u0004\b��\u0010\u00142\u0011\u00100\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\bø\u0001\u0001¢\u0006\u0002\u00101\u001a4\u0010/\u001a\u0002H\u0014\"\u0004\b��\u0010\u00142\b\u00102\u001a\u0004\u0018\u00010\u00152\u0011\u00100\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\bø\u0001\u0001¢\u0006\u0002\u00103\u001a>\u0010/\u001a\u0002H\u0014\"\u0004\b��\u0010\u00142\b\u00102\u001a\u0004\u0018\u00010\u00152\b\u00104\u001a\u0004\u0018\u00010\u00152\u0011\u00100\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\bø\u0001\u0001¢\u0006\u0002\u00105\u001aH\u0010/\u001a\u0002H\u0014\"\u0004\b��\u0010\u00142\b\u00102\u001a\u0004\u0018\u00010\u00152\b\u00104\u001a\u0004\u0018\u00010\u00152\b\u00106\u001a\u0004\u0018\u00010\u00152\u0011\u00100\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\bø\u0001\u0001¢\u0006\u0002\u00107\u001aB\u0010/\u001a\u0002H\u0014\"\u0004\b��\u0010\u00142\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150,\"\u0004\u0018\u00010\u00152\u0011\u00100\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\bø\u0001\u0001¢\u0006\u0002\u00108\u001a\r\u00109\u001a\u00020:H\u0007¢\u0006\u0002\u0010;\"\u0011\u0010��\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001a\u00020\t8G¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006<"}, d2 = {"currentComposer", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentCompositeKeyHash", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositionLocalContext", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "()V", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "ComposeNode", "", "T", "", "E", "Landroidx/compose/runtime/Applier;", "factory", "Lkotlin/Function0;", "update", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Landroidx/compose/runtime/DisallowComposableCalls;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "skippableUpdate", "Landroidx/compose/runtime/SkippableUpdater;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "ReusableContent", "key", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "keys", "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "remember", "calculation", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "rememberCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/ComposablesKt.class */
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(final Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        composer.startReplaceableGroup(-2103250935);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<T>() { // from class: androidx.compose.runtime.ComposablesKt$ComposeNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final T invoke() {
                    return factory.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1988boximpl(Updater.m1989constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-2103248186);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(factory);
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1988boximpl(Updater.m1989constructorimpl(composer)));
        content.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> skippableUpdate, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(skippableUpdate, "skippableUpdate");
        Intrinsics.checkNotNullParameter(content, "content");
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(factory);
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1988boximpl(Updater.m1989constructorimpl(composer)));
        skippableUpdate.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer)), composer, Integer.valueOf((i2 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        composer.startReplaceableGroup(2058660585);
        content.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(final Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        composer.startReplaceableGroup(1546164872);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<T>() { // from class: androidx.compose.runtime.ComposablesKt$ReusableComposeNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final T invoke() {
                    return factory.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        update.invoke(Updater.m1988boximpl(Updater.m1989constructorimpl(composer)));
        composer.enableReusing();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1546167803);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(factory);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        update.invoke(Updater.m1988boximpl(Updater.m1989constructorimpl(composer)));
        composer.enableReusing();
        content.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> skippableUpdate, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(skippableUpdate, "skippableUpdate");
        Intrinsics.checkNotNullParameter(content, "content");
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(factory);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        update.invoke(Updater.m1988boximpl(Updater.m1989constructorimpl(composer)));
        composer.enableReusing();
        skippableUpdate.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer)), composer, Integer.valueOf((i2 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        composer.startReplaceableGroup(2058660585);
        content.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final void ReusableContent(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1530021272);
        composer.startReusableGroup(ComposerKt.reuseKey, obj);
        content.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
    }

    @JvmName(name = "getCurrentComposer")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public static final Composer getCurrentComposer(@Nullable Composer composer, int i2) {
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @Composable
    @JvmName(name = "getCurrentCompositeKeyHash")
    public static final int getCurrentCompositeKeyHash(@Nullable Composer composer, int i2) {
        return composer.getCompoundKeyHash();
    }

    @Composable
    @JvmName(name = "getCurrentCompositionLocalContext")
    @NotNull
    public static final CompositionLocalContext getCurrentCompositionLocalContext(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(550242516);
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        composer.endReplaceableGroup();
        return compositionLocalContext;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @JvmName(name = "getCurrentRecomposeScope")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public static final RecomposeScope getCurrentRecomposeScope(@Nullable Composer composer, int i2) {
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope != null) {
            composer.recordUsed(recomposeScope);
            return recomposeScope;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    @PublishedApi
    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @Composable
    public static final <T> T key(@NotNull Object[] keys, @NotNull Function2<? super Composer, ? super Integer, ? extends T> block, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(-1542330587);
        T invoke = block.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        composer.endReplaceableGroup();
        return invoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T remember(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r7, int r8) {
        /*
            r0 = r6
            java.lang.String r1 = "calculation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            r1 = -3686095(0xffffffffffc7c131, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r7
            r1 = r3
            boolean r0 = r0.changed(r1)
            r9 = r0
            r0 = r7
            r1 = r4
            boolean r0 = r0.changed(r1)
            r10 = r0
            r0 = r7
            r1 = r5
            boolean r0 = r0.changed(r1)
            r11 = r0
            r0 = r7
            java.lang.Object r0 = r0.rememberedValue()
            r4 = r0
            r0 = r9
            r1 = r10
            r0 = r0 | r1
            r1 = r11
            r0 = r0 | r1
            if (r0 != 0) goto L4e
            r0 = r4
            r3 = r0
            r0 = r4
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L5d
        L4e:
            r0 = r6
            java.lang.Object r0 = r0.invoke()
            r3 = r0
            r0 = r7
            r1 = r3
            r0.updateRememberedValue(r1)
        L5d:
            r0 = r7
            r0.endReplaceableGroup()
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposablesKt.remember(java.lang.Object, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T remember(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r5, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r6, int r7) {
        /*
            r0 = r5
            java.lang.String r1 = "calculation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r6
            r1 = -3686552(0xffffffffffc7bf68, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r6
            r1 = r3
            boolean r0 = r0.changed(r1)
            r8 = r0
            r0 = r6
            r1 = r4
            boolean r0 = r0.changed(r1)
            r9 = r0
            r0 = r6
            java.lang.Object r0 = r0.rememberedValue()
            r4 = r0
            r0 = r8
            r1 = r9
            r0 = r0 | r1
            if (r0 != 0) goto L3d
            r0 = r4
            r3 = r0
            r0 = r4
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L4b
        L3d:
            r0 = r5
            java.lang.Object r0 = r0.invoke()
            r3 = r0
            r0 = r6
            r1 = r3
            r0.updateRememberedValue(r1)
        L4b:
            r0 = r6
            r0.endReplaceableGroup()
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposablesKt.remember(java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T remember(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r4, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r5, int r6) {
        /*
            r0 = r4
            java.lang.String r1 = "calculation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r5
            r1 = r3
            boolean r0 = r0.changed(r1)
            r7 = r0
            r0 = r5
            java.lang.Object r0 = r0.rememberedValue()
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L34
            r0 = r8
            r3 = r0
            r0 = r8
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L42
        L34:
            r0 = r4
            java.lang.Object r0 = r0.invoke()
            r3 = r0
            r0 = r5
            r1 = r3
            r0.updateRememberedValue(r1)
        L42:
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposablesKt.remember(java.lang.Object, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):java.lang.Object");
    }

    @Composable
    public static final <T> T remember(@NotNull Function0<? extends T> calculation, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        T t2 = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            t2 = calculation.invoke();
            composer.updateRememberedValue(t2);
        }
        composer.endReplaceableGroup();
        return (T) t2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L13;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T remember(@org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r5, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r6, int r7) {
        /*
            r0 = r4
            java.lang.String r1 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            java.lang.String r1 = "calculation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r6
            r1 = -3685570(0xffffffffffc7c33e, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r4
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r7 = r0
        L1f:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L3d
            r0 = r4
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            int r9 = r9 + 1
            r0 = r7
            r1 = r6
            r2 = r10
            boolean r1 = r1.changed(r2)
            r0 = r0 | r1
            r7 = r0
            goto L1f
        L3d:
            r0 = r6
            java.lang.Object r0 = r0.rememberedValue()
            r10 = r0
            r0 = r7
            if (r0 != 0) goto L57
            r0 = r10
            r4 = r0
            r0 = r10
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L65
        L57:
            r0 = r5
            java.lang.Object r0 = r0.invoke()
            r4 = r0
            r0 = r6
            r1 = r4
            r0.updateRememberedValue(r1)
        L65:
            r0 = r6
            r0.endReplaceableGroup()
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposablesKt.remember(java.lang.Object[], kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):java.lang.Object");
    }

    @Composable
    @NotNull
    public static final CompositionContext rememberCompositionContext(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-1359197906);
        CompositionContext buildContext = composer.buildContext();
        composer.endReplaceableGroup();
        return buildContext;
    }
}
