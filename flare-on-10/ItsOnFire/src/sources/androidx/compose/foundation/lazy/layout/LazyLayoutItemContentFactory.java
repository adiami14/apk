package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010%\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\t\b��\u0018��2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J&\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00110\u0005¢\u0006\u0002\b\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\tø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u00020\tX\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n��R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u000fR\u00020��0\u000eX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "itemsProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function0;)V", "constraintsOfCachedLambdas", "Landroidx/compose/ui/unit/Constraints;", "J", "densityOfCachedLambdas", "Landroidx/compose/ui/unit/Density;", "lambdasCache", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "getContent", "", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.INDEX, "", "key", "(ILjava/lang/Object;)Lkotlin/jvm/functions/Function2;", "onBeforeMeasure", "density", "constraints", "onBeforeMeasure-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)V", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory.class */
public final class LazyLayoutItemContentFactory {
    private long constraintsOfCachedLambdas;
    @NotNull
    private Density densityOfCachedLambdas;
    @NotNull
    private final Function0<LazyLayoutItemsProvider> itemsProvider;
    @NotNull
    private final Map<Object, CachedItemContent> lambdasCache;
    @NotNull
    private final SaveableStateHolder saveableStateHolder;

    @Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0082\u0004\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR+\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "initialIndex", "", "key", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;)V", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "getKey", "()Ljava/lang/Object;", "<set-?>", "lastKnownIndex", "getLastKnownIndex", "()I", "setLastKnownIndex", "(I)V", "lastKnownIndex$delegate", "Landroidx/compose/runtime/MutableState;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent.class */
    public final class CachedItemContent {
        @NotNull
        private final Function2<Composer, Integer, Unit> content;
        @NotNull
        private final Object key;
        @NotNull
        private final MutableState lastKnownIndex$delegate;
        public final /* synthetic */ LazyLayoutItemContentFactory this$0;

        public CachedItemContent(final LazyLayoutItemContentFactory this$0, @NotNull int i2, Object key) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(key, "key");
            this.this$0 = this$0;
            this.key = key;
            this.lastKnownIndex$delegate = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), null, 2, null);
            this.content = ComposableLambdaKt.composableLambdaInstance(-985530431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer, int i3) {
                    Function0 function0;
                    SaveableStateHolder saveableStateHolder;
                    if (((i3 & 11) ^ 2) == 0 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    function0 = LazyLayoutItemContentFactory.this.itemsProvider;
                    LazyLayoutItemsProvider lazyLayoutItemsProvider = (LazyLayoutItemsProvider) function0.invoke();
                    Integer num = lazyLayoutItemsProvider.getKeyToIndexMap().get(this.getKey());
                    if (num == null) {
                        num = null;
                    } else {
                        this.setLastKnownIndex(num.intValue());
                    }
                    int lastKnownIndex = num == null ? this.getLastKnownIndex() : num.intValue();
                    composer.startReplaceableGroup(494375263);
                    if (lastKnownIndex < lazyLayoutItemsProvider.getItemsCount()) {
                        Object key2 = lazyLayoutItemsProvider.getKey(lastKnownIndex);
                        if (Intrinsics.areEqual(key2, this.getKey())) {
                            Function2<Composer, Integer, Unit> mo780getContent = lazyLayoutItemsProvider.mo780getContent(lastKnownIndex);
                            saveableStateHolder = LazyLayoutItemContentFactory.this.saveableStateHolder;
                            saveableStateHolder.SaveableStateProvider(key2, mo780getContent, composer, 520);
                        }
                    }
                    composer.endReplaceableGroup();
                    Object key3 = this.getKey();
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                    EffectsKt.DisposableEffect(key3, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$content$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory2 = LazyLayoutItemContentFactory.this;
                            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = cachedItemContent;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$content$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    Map map;
                                    map = LazyLayoutItemContentFactory.this.lambdasCache;
                                    map.remove(cachedItemContent2.getKey());
                                }
                            };
                        }
                    }, composer, 8);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setLastKnownIndex(int i2) {
            this.lastKnownIndex$delegate.setValue(Integer.valueOf(i2));
        }

        @NotNull
        public final Function2<Composer, Integer, Unit> getContent() {
            return this.content;
        }

        @NotNull
        public final Object getKey() {
            return this.key;
        }

        public final int getLastKnownIndex() {
            return ((Number) this.lastKnownIndex$delegate.getValue()).intValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(@NotNull SaveableStateHolder saveableStateHolder, @NotNull Function0<? extends LazyLayoutItemsProvider> itemsProvider) {
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.saveableStateHolder = saveableStateHolder;
        this.itemsProvider = itemsProvider;
        this.lambdasCache = new LinkedHashMap();
        this.densityOfCachedLambdas = DensityKt.Density(0.0f, 0.0f);
        this.constraintsOfCachedLambdas = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getContent(int i2, @NotNull Object key) {
        CachedItemContent cachedItemContent;
        Intrinsics.checkNotNullParameter(key, "key");
        CachedItemContent cachedItemContent2 = this.lambdasCache.get(key);
        if (cachedItemContent2 == null || cachedItemContent2.getLastKnownIndex() != i2) {
            CachedItemContent cachedItemContent3 = new CachedItemContent(this, i2, key);
            this.lambdasCache.put(key, cachedItemContent3);
            cachedItemContent = cachedItemContent3;
        } else {
            cachedItemContent = cachedItemContent2;
        }
        return cachedItemContent.getContent();
    }

    /* renamed from: onBeforeMeasure-0kLqBqw  reason: not valid java name */
    public final void m771onBeforeMeasure0kLqBqw(@NotNull Density density, long j2) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (Intrinsics.areEqual(density, this.densityOfCachedLambdas) && Constraints.m4745equalsimpl0(j2, this.constraintsOfCachedLambdas)) {
            return;
        }
        this.densityOfCachedLambdas = density;
        this.constraintsOfCachedLambdas = j2;
        this.lambdasCache.clear();
    }
}
