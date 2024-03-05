package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import o.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(bv = {}, d1 = {"��\u0013\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006��"}, d2 = {"o/n$a", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableState$animateTo$$inlined$collect$1.class */
public final class SwipeableState$animateTo$$inlined$collect$1<T> implements j<Map<Float, ? extends T>> {
    public final /* synthetic */ AnimationSpec $anim$inlined;
    public final /* synthetic */ Object $targetValue$inlined;
    public final /* synthetic */ SwipeableState this$0;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1", f = "Swipeable.kt", i = {0, 0}, l = {140}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableState$animateTo$$inlined$collect$1$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SwipeableState$animateTo$$inlined$collect$1.this.emit(null, this);
        }
    }

    public SwipeableState$animateTo$$inlined$collect$1(Object obj, SwipeableState swipeableState, AnimationSpec animationSpec) {
        this.$targetValue$inlined = obj;
        this.this$0 = swipeableState;
        this.$anim$inlined = animationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    @Override // o.j
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
