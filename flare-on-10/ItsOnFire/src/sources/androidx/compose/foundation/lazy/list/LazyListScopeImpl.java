package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J5\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0016¢\u0006\u0002\u0010\u001aJm\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00052#\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001621\u0010 \u001a-\u0012\u0004\u0012\u00020\u0017\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00120!¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0016¢\u0006\u0002\u0010\"J5\u0010#\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0017¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n��R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyListScopeImpl;", "Landroidx/compose/foundation/lazy/LazyListScope;", "()V", "_headerIndexes", "", "", "_intervals", "Landroidx/compose/foundation/lazy/list/MutableIntervalList;", "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;", "headerIndexes", "", "getHeaderIndexes", "()Ljava/util/List;", "intervals", "Landroidx/compose/foundation/lazy/list/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/list/IntervalList;", "item", "", "key", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", FirebaseAnalytics.Param.ITEMS, "count", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyListScopeImpl.class */
public final class LazyListScopeImpl implements LazyListScope {
    @Nullable
    private List<Integer> _headerIndexes;
    @NotNull
    private final MutableIntervalList<LazyListIntervalContent> _intervals;
    @NotNull
    private final IntervalList<LazyListIntervalContent> intervals;

    public LazyListScopeImpl() {
        MutableIntervalList<LazyListIntervalContent> mutableIntervalList = new MutableIntervalList<>();
        this._intervals = mutableIntervalList;
        this.intervals = mutableIntervalList;
    }

    @NotNull
    public final List<Integer> getHeaderIndexes() {
        List<Integer> emptyList;
        List<Integer> list = this._headerIndexes;
        List<Integer> list2 = list;
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList;
        }
        return list2;
    }

    @NotNull
    public final IntervalList<LazyListIntervalContent> getIntervals() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(@Nullable final Object obj, @NotNull final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this._intervals.add(1, new LazyListIntervalContent(obj != null ? new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.list.LazyListScopeImpl$item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Object invoke(int i2) {
                return obj;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        } : null, new Function2<LazyItemScope, Integer, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.lazy.list.LazyListScopeImpl$item$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Function2<? super Composer, ? super Integer, ? extends Unit> invoke(LazyItemScope lazyItemScope, Integer num) {
                return invoke(lazyItemScope, num.intValue());
            }

            @NotNull
            public final Function2<Composer, Integer, Unit> invoke(@NotNull final LazyItemScope $receiver, int i2) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                final Function3<LazyItemScope, Composer, Integer, Unit> function3 = content;
                return ComposableLambdaKt.composableLambdaInstance(-985532813, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.list.LazyListScopeImpl$item$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        if (((i3 & 11) ^ 2) == 0 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                        } else {
                            function3.invoke($receiver, composer, 0);
                        }
                    }
                });
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i2, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull final Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this._intervals.add(i2, new LazyListIntervalContent(function1, new Function2<LazyItemScope, Integer, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.lazy.list.LazyListScopeImpl$items$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Function2<? super Composer, ? super Integer, ? extends Unit> invoke(LazyItemScope lazyItemScope, Integer num) {
                return invoke(lazyItemScope, num.intValue());
            }

            @NotNull
            public final Function2<Composer, Integer, Unit> invoke(@NotNull final LazyItemScope $receiver, final int i3) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                final Function4<LazyItemScope, Integer, Composer, Integer, Unit> function4 = itemContent;
                return ComposableLambdaKt.composableLambdaInstance(-985533267, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.list.LazyListScopeImpl$items$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer, int i4) {
                        if (((i4 & 11) ^ 2) == 0 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                        } else {
                            function4.invoke($receiver, Integer.valueOf(i3), composer, 0);
                        }
                    }
                });
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(@Nullable Object obj, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        List<Integer> list = this._headerIndexes;
        ArrayList arrayList = list;
        if (list == null) {
            arrayList = new ArrayList();
            this._headerIndexes = arrayList;
        }
        arrayList.add(Integer.valueOf(this._intervals.getTotalSize()));
        item(obj, content);
    }
}
