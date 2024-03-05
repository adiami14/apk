package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.OverScrollController;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(d1 = {"��\u0094\u0001\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0086\u0001\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0001¢\u0006\u0002\u0010\u0019\u001a=\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0089\u0001\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a/\u00101\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020-0,2\u0006\u00102\u001a\u0002032\u0006\u0010\u001f\u001a\u00020 H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b4\u00105\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "refreshOverScrollInfo", "overScrollController", "Landroidx/compose/foundation/gestures/OverScrollController;", "result", "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "totalHorizontalPadding", "", "totalVerticalPadding", "refreshOverScrollInfo-L1NQ6kE", "(Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;JII)V", "rememberLazyListMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;", "stateOfItemsProvider", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "itemScope", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;", "placementAnimator", "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "(Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;", "update", "density", "Landroidx/compose/ui/unit/Density;", "update-3p2s80s", "(Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/unit/Density;J)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyListKt.class */
public final class LazyListKt {
    /* JADX WARN: Code restructure failed: missing block: B:143:0x043c, code lost:
        if (r0 == r0.getEmpty()) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x05c6, code lost:
        if (r0 == r0.getEmpty()) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0271  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyList(@org.jetbrains.annotations.NotNull final androidx.compose.ui.Modifier r18, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.LazyListState r19, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.PaddingValues r20, final boolean r21, final boolean r22, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.gestures.FlingBehavior r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r24, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r27, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshOverScrollInfo-L1NQ6kE  reason: not valid java name */
    public static final void m808refreshOverScrollInfoL1NQ6kE(OverScrollController overScrollController, LazyListMeasureResult lazyListMeasureResult, long j2, int i2, int i3) {
        boolean canScrollForward = lazyListMeasureResult.getCanScrollForward();
        LazyMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        boolean z = false;
        boolean z2 = ((firstVisibleItem == null ? 0 : firstVisibleItem.getIndex()) == 0 && lazyListMeasureResult.getFirstVisibleItemScrollOffset() == 0) ? false : true;
        long Size = SizeKt.Size(ConstraintsKt.m4766constrainWidthK40F9xA(j2, lazyListMeasureResult.getWidth() + i2), ConstraintsKt.m4765constrainHeightK40F9xA(j2, lazyListMeasureResult.getHeight() + i3));
        if (canScrollForward || z2) {
            z = true;
        }
        overScrollController.mo441refreshContainerInfoTmRCtEA(Size, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cf, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L25;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.layout.LazyMeasurePolicy rememberLazyListMeasurePolicy(final androidx.compose.runtime.State<? extends androidx.compose.foundation.lazy.list.LazyListItemsProvider> r15, final androidx.compose.ui.node.Ref<androidx.compose.foundation.lazy.list.LazyItemScopeImpl> r16, final androidx.compose.foundation.lazy.LazyListState r17, final androidx.compose.foundation.gestures.OverScrollController r18, final androidx.compose.foundation.layout.PaddingValues r19, final boolean r20, final boolean r21, androidx.compose.ui.Alignment.Horizontal r22, androidx.compose.ui.Alignment.Vertical r23, androidx.compose.foundation.layout.Arrangement.Horizontal r24, androidx.compose.foundation.layout.Arrangement.Vertical r25, final androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator r26, androidx.compose.runtime.Composer r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListKt.rememberLazyListMeasurePolicy(androidx.compose.runtime.State, androidx.compose.ui.node.Ref, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.gestures.OverScrollController, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator, androidx.compose.runtime.Composer, int, int, int):androidx.compose.foundation.lazy.layout.LazyMeasurePolicy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-3p2s80s  reason: not valid java name */
    public static final void m809update3p2s80s(Ref<LazyItemScopeImpl> ref, Density density, long j2) {
        LazyItemScopeImpl value = ref.getValue();
        if (value != null && Intrinsics.areEqual(value.getDensity(), density) && Constraints.m4745equalsimpl0(value.m799getConstraintsmsEJaDk(), j2)) {
            return;
        }
        ref.setValue(new LazyItemScopeImpl(density, j2, null));
    }
}
