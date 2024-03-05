package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0088\u0001\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001al\u0010��\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001al\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010\u001b\u001a\u00020\u0001\"\u0004\b��\u0010\u001c*\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001d2%\b\n\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"\u0018\u00010\u001123\b\u0004\u0010#\u001a-\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010$¢\u0006\u0002\b&¢\u0006\u0002\b\u0013H\u0086\bø\u0001��¢\u0006\u0002\u0010'\u001a\u0085\u0001\u0010\u001b\u001a\u00020\u0001\"\u0004\b��\u0010\u001c*\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0(2%\b\n\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"\u0018\u00010\u001123\b\u0004\u0010#\u001a-\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010$¢\u0006\u0002\b&¢\u0006\u0002\b\u0013H\u0086\bø\u0001��¢\u0006\u0002\u0010)\u001a¯\u0001\u0010*\u001a\u00020\u0001\"\u0004\b��\u0010\u001c*\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001d2:\b\n\u0010\u001e\u001a4\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"\u0018\u00010$2H\b\u0004\u0010#\u001aB\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010-¢\u0006\u0002\b&¢\u0006\u0002\b\u0013H\u0086\bø\u0001��¢\u0006\u0002\u0010.\u001a¯\u0001\u0010*\u001a\u00020\u0001\"\u0004\b��\u0010\u001c*\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0(2:\b\n\u0010\u001e\u001a4\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"\u0018\u00010$2H\b\u0004\u0010#\u001aB\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010-¢\u0006\u0002\b&¢\u0006\u0002\b\u0013H\u0086\bø\u0001��¢\u0006\u0002\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.ITEMS, "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/LazyDslKt.class */
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyColumn(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r16, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.LazyListState r17, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r18, boolean r19, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r20, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r21, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r22, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0239  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyRow(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.LazyListState r18, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r19, boolean r20, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r21, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r23, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$1(function1, items) : null, ComposableLambdaKt.composableLambdaInstance(-985537722, true, new LazyDslKt$items$2(itemContent, items)));
    }

    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$3(function1, items) : null, ComposableLambdaKt.composableLambdaInstance(-985536307, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function4 itemContent, int i2, Object obj) {
        LazyDslKt$items$1 lazyDslKt$items$1 = null;
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        int size = items.size();
        if (function1 != null) {
            lazyDslKt$items$1 = new LazyDslKt$items$1(function1, items);
        }
        lazyListScope.items(size, lazyDslKt$items$1, ComposableLambdaKt.composableLambdaInstance(-985537722, true, new LazyDslKt$items$2(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function4 itemContent, int i2, Object obj) {
        LazyDslKt$items$3 lazyDslKt$items$3 = null;
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        int length = items.length;
        if (function1 != null) {
            lazyDslKt$items$3 = new LazyDslKt$items$3(function1, items);
        }
        lazyListScope.items(length, lazyDslKt$items$3, ComposableLambdaKt.composableLambdaInstance(-985536307, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(-985537359, true, new LazyDslKt$itemsIndexed$2(itemContent, items)));
    }

    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$3(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(-985535428, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function5 itemContent, int i2, Object obj) {
        LazyDslKt$itemsIndexed$1 lazyDslKt$itemsIndexed$1 = null;
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        int size = items.size();
        if (function2 != null) {
            lazyDslKt$itemsIndexed$1 = new LazyDslKt$itemsIndexed$1(function2, items);
        }
        lazyListScope.items(size, lazyDslKt$itemsIndexed$1, ComposableLambdaKt.composableLambdaInstance(-985537359, true, new LazyDslKt$itemsIndexed$2(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function5 itemContent, int i2, Object obj) {
        LazyDslKt$itemsIndexed$3 lazyDslKt$itemsIndexed$3 = null;
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        int length = items.length;
        if (function2 != null) {
            lazyDslKt$itemsIndexed$3 = new LazyDslKt$itemsIndexed$3(function2, items);
        }
        lazyListScope.items(length, lazyDslKt$itemsIndexed$3, ComposableLambdaKt.composableLambdaInstance(-985535428, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }
}
