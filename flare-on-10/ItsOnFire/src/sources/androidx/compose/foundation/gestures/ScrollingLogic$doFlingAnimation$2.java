package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {317}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$2.class */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ long $available;
    public final /* synthetic */ Ref.LongRef $result;
    public long J$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j2, Continuation<? super ScrollingLogic$doFlingAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
        this.$result = longRef;
        this.$available = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, continuation);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        Ref.LongRef longRef;
        long j2;
        Object performFling;
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            final Function1<Float, Float> function1 = new Function1<Float, Float>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final Float invoke(float f2) {
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return Float.valueOf(f2 - ScrollingLogic.this.reverseIfNeeded(scrollingLogic4.m537dispatchScrolliGfEq8s(scrollScope, scrollingLogic4.reverseIfNeeded(f2), null, NestedScrollSource.Companion.m3701getFlingWNlRxjI())));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                    return invoke(f2.floatValue());
                }
            };
            ScrollScope scrollScope2 = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f2) {
                    return function1.invoke(Float.valueOf(f2)).floatValue();
                }
            };
            ScrollingLogic scrollingLogic4 = this.this$0;
            longRef = this.$result;
            long j3 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic4.getFlingBehavior();
            j2 = longRef.element;
            float reverseIfNeeded = scrollingLogic4.reverseIfNeeded(scrollingLogic4.m540toFloatTH1AsA0(j3));
            this.L$0 = scrollingLogic4;
            this.L$1 = scrollingLogic4;
            this.L$2 = longRef;
            this.J$0 = j2;
            this.label = 1;
            performFling = flingBehavior.performFling(scrollScope2, reverseIfNeeded, this);
            if (performFling == coroutine_suspended) {
                return coroutine_suspended;
            }
            scrollingLogic = scrollingLogic4;
            scrollingLogic2 = scrollingLogic4;
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            j2 = this.J$0;
            longRef = (Ref.LongRef) this.L$2;
            scrollingLogic2 = (ScrollingLogic) this.L$1;
            scrollingLogic = (ScrollingLogic) this.L$0;
            ResultKt.throwOnFailure(obj);
            performFling = obj;
        }
        longRef.element = scrollingLogic2.m544updateQWom1Mo(j2, scrollingLogic.reverseIfNeeded(((Number) performFling).floatValue()));
        return Unit.INSTANCE;
    }
}
