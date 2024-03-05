package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {R.styleable.AppCompatTheme_viewInflaterClass, ComposerKt.reuseKey}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "forward"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "I$0"})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyListScrollingKt$doSmoothScrollToItem$3.class */
public final class LazyListScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public final /* synthetic */ LazyListState $this_doSmoothScrollToItem;
    public float F$0;
    public float F$1;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListScrollingKt$doSmoothScrollToItem$3(LazyListState lazyListState, int i2, int i3, Continuation<? super LazyListScrollingKt$doSmoothScrollToItem$3> continuation) {
        super(2, continuation);
        this.$this_doSmoothScrollToItem = lazyListState;
        this.$index = i2;
        this.$scrollOffset = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r4.getFirstVisibleItemScrollOffset() > r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r4.getFirstVisibleItemScrollOffset() < r6) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean invokeSuspend$isOvershot(boolean r3, androidx.compose.foundation.lazy.LazyListState r4, int r5, int r6) {
        /*
            r0 = 0
            r7 = r0
            r0 = r3
            if (r0 == 0) goto L2b
            r0 = r4
            int r0 = r0.getFirstVisibleItemIndex()
            r1 = r5
            if (r0 <= r1) goto L12
            goto L33
        L12:
            r0 = r7
            r3 = r0
            r0 = r4
            int r0 = r0.getFirstVisibleItemIndex()
            r1 = r5
            if (r0 != r1) goto L51
            r0 = r7
            r3 = r0
            r0 = r4
            int r0 = r0.getFirstVisibleItemScrollOffset()
            r1 = r6
            if (r0 <= r1) goto L51
            goto L33
        L2b:
            r0 = r4
            int r0 = r0.getFirstVisibleItemIndex()
            r1 = r5
            if (r0 >= r1) goto L38
        L33:
            r0 = 1
            r3 = r0
            goto L51
        L38:
            r0 = r7
            r3 = r0
            r0 = r4
            int r0 = r0.getFirstVisibleItemIndex()
            r1 = r5
            if (r0 != r1) goto L51
            r0 = r7
            r3 = r0
            r0 = r4
            int r0 = r0.getFirstVisibleItemScrollOffset()
            r1 = r6
            if (r0 >= r1) goto L51
            goto L33
        L51:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(boolean, androidx.compose.foundation.lazy.LazyListState, int, int):boolean");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        LazyListScrollingKt$doSmoothScrollToItem$3 lazyListScrollingKt$doSmoothScrollToItem$3 = new LazyListScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset, continuation);
        lazyListScrollingKt$doSmoothScrollToItem$3.L$0 = obj;
        return lazyListScrollingKt$doSmoothScrollToItem$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LazyListScrollingKt$doSmoothScrollToItem$3) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0260  */
    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Type inference failed for: r1v45, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x02fa -> B:131:0x02ff). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
