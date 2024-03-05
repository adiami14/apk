package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;", "it", "", "invoke-OHRMr_U", "(Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 6, 0}, xi = Typography.degree)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/LazyGridKt$itemsIndexed$1$1.class */
public final class LazyGridKt$itemsIndexed$1$1 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    public final /* synthetic */ List<T> $items;
    public final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $spans;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridKt$itemsIndexed$1$1(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, List<? extends T> list) {
        super(2);
        this.$spans = function3;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m749boximpl(m760invokeOHRMr_U(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-OHRMr_U  reason: not valid java name */
    public final long m760invokeOHRMr_U(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
        return this.$spans.invoke(lazyGridItemSpanScope, Integer.valueOf(i2), this.$items.get(i2)).m756unboximpl();
    }
}
