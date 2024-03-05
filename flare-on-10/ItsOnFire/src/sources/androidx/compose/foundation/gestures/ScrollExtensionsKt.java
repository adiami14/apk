package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��$\n��\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086@ø\u0001��¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086@ø\u0001��¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001��¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"animateScrollBy", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "value", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopScroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/ScrollExtensionsKt.class */
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollBy(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.ScrollableState r7, float r8, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.AnimationSpec<java.lang.Float> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Float> r10) {
        /*
            r0 = r10
            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            if (r0 == 0) goto L2c
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r12 = r0
            r0 = r12
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r11
            r1 = r12
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r11
            r10 = r0
            goto L35
        L2c:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r10 = r0
        L35:
            r0 = r10
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r13 = r0
            r0 = r10
            int r0 = r0.label
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L6b
            r0 = r12
            r1 = 1
            if (r0 != r1) goto L61
            r0 = r10
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            r7 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto La5
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r1 = r0
            r1.<init>()
            r11 = r0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r9 = r0
            r0 = r10
            r1 = r11
            r0.L$0 = r1
            r0 = r10
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = 0
            r2 = r9
            r3 = r10
            r4 = 1
            r5 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollableState.DefaultImpls.scroll$default(r0, r1, r2, r3, r4, r5)
            r1 = r13
            if (r0 != r1) goto La2
            r0 = r13
            return r0
        La2:
            r0 = r11
            r7 = r0
        La5:
            r0 = r7
            float r0 = r0.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(androidx.compose.foundation.gestures.ScrollableState, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f2, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f2, animationSpec, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scrollBy(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.ScrollableState r7, float r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Float> r9) {
        /*
            r0 = r9
            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            if (r0 == 0) goto L28
            r0 = r9
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r11 = r0
            r0 = r11
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r10
            r1 = r11
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r9 = r0
            goto L31
        L28:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r9 = r0
        L31:
            r0 = r9
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r9
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L65
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L5b
            r0 = r9
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9b
        L5b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L65:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r1 = r0
            r1.<init>()
            r10 = r0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2
            r1 = r0
            r2 = r10
            r3 = r8
            r4 = 0
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r9
            r1 = r10
            r0.L$0 = r1
            r0 = r9
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = 0
            r2 = r13
            r3 = r9
            r4 = 1
            r5 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollableState.DefaultImpls.scroll$default(r0, r1, r2, r3, r4, r5)
            r1 = r12
            if (r0 != r1) goto L99
            r0 = r12
            return r0
        L99:
            r0 = r10
            r7 = r0
        L9b:
            r0 = r7
            float r0 = r0.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(androidx.compose.foundation.gestures.ScrollableState, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object stopScroll(@NotNull ScrollableState scrollableState, @NotNull MutatePriority mutatePriority, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object scroll = scrollableState.scroll(mutatePriority, new ScrollExtensionsKt$stopScroll$2(null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return scroll == coroutine_suspended ? scroll : Unit.INSTANCE;
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, continuation);
    }
}
