package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��V\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a*\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH��\u001aB\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010��\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"ExtraItemsNearTheSlidingWindow", "", "VisibleItemsSlidingWindowSize", "calculateNearestItemsRange", "Lkotlin/ranges/IntRange;", "firstVisibleItem", "generateKeyToIndexMap", "", "", "range", "list", "Landroidx/compose/foundation/lazy/list/IntervalList;", "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;", "rememberStateOfItemsProvider", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "itemScope", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/node/Ref;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyListItemsProviderImplKt.class */
public final class LazyListItemsProviderImplKt {
    private static final int ExtraItemsNearTheSlidingWindow = 100;
    private static final int VisibleItemsSlidingWindowSize = 30;

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange calculateNearestItemsRange(int i2) {
        IntRange until;
        int i3 = VisibleItemsSlidingWindowSize;
        int i4 = (i2 / i3) * i3;
        int i5 = ExtraItemsNearTheSlidingWindow;
        until = RangesKt___RangesKt.until(Math.max(i4 - i5, 0), i4 + i3 + i5);
        return until;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.Map] */
    @NotNull
    public static final Map<Object, Integer> generateKeyToIndexMap(@NotNull IntRange range, @NotNull IntervalList<LazyListIntervalContent> list) {
        HashMap hashMap;
        ?? emptyMap;
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(list, "list");
        int first = range.getFirst();
        if (first >= 0) {
            int min = Math.min(range.getLast(), list.getTotalSize() - 1);
            if (min < first) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                hashMap = emptyMap;
            } else {
                hashMap = new HashMap();
                int intervalIndexForItemIndex = IntervalListKt.intervalIndexForItemIndex(list, first);
                int i2 = first;
                while (i2 <= min) {
                    IntervalHolder<LazyListIntervalContent> intervalHolder = list.getIntervals().get(intervalIndexForItemIndex);
                    Function1<Integer, Object> key = intervalHolder.getContent().getKey();
                    if (key != null) {
                        int startIndex = i2 - intervalHolder.getStartIndex();
                        if (startIndex == intervalHolder.getSize()) {
                            intervalIndexForItemIndex++;
                        } else {
                            hashMap.put(key.invoke(Integer.valueOf(startIndex)), Integer.valueOf(i2));
                            i2++;
                        }
                    } else {
                        intervalIndexForItemIndex++;
                        i2 = intervalHolder.getStartIndex() + intervalHolder.getSize();
                    }
                }
            }
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ae, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L13;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.State<androidx.compose.foundation.lazy.list.LazyListItemsProvider> rememberStateOfItemsProvider(@org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyListState r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull final androidx.compose.ui.node.Ref<androidx.compose.foundation.lazy.list.LazyItemScopeImpl> r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, int r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListItemsProviderImplKt.rememberStateOfItemsProvider(androidx.compose.foundation.lazy.LazyListState, kotlin.jvm.functions.Function1, androidx.compose.ui.node.Ref, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }
}
