package androidx.compose.material;

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
/* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableState$snapTo$$inlined$collect$1.class */
public final class SwipeableState$snapTo$$inlined$collect$1<T> implements j<Map<Float, ? extends T>> {
    public final /* synthetic */ Object $targetValue$inlined;
    public final /* synthetic */ SwipeableState this$0;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1", f = "Swipeable.kt", i = {0}, l = {139}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableState$snapTo$$inlined$collect$1$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
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
            return SwipeableState$snapTo$$inlined$collect$1.this.emit(null, this);
        }
    }

    public SwipeableState$snapTo$$inlined$collect$1(Object obj, SwipeableState swipeableState) {
        this.$targetValue$inlined = obj;
        this.this$0 = swipeableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    @Override // o.j
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L28
            r0 = r7
            androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1$1 r0 = (androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1.AnonymousClass1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r8
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r7 = r0
            goto L32
        L28:
            androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1$1 r0 = new androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r3)
            r7 = r0
        L32:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r7
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L67
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L5d
            r0 = r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1 r0 = (androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1) r0
            r6 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto La2
        L5d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L67:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            java.util.Map r0 = (java.util.Map) r0
            r1 = r5
            java.lang.Object r1 = r1.$targetValue$inlined
            java.lang.Float r0 = androidx.compose.material.SwipeableKt.access$getOffset(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto Lb1
            r0 = r5
            androidx.compose.material.SwipeableState r0 = r0.this$0
            r10 = r0
            r0 = r6
            float r0 = r0.floatValue()
            r11 = r0
            r0 = r7
            r1 = r5
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            r6 = r0
            r0 = r10
            r1 = r11
            r2 = r7
            java.lang.Object r0 = androidx.compose.material.SwipeableState.access$snapInternalToOffset(r0, r1, r2)
            r1 = r8
            if (r0 != r1) goto La2
            r0 = r8
            return r0
        La2:
            r0 = r6
            androidx.compose.material.SwipeableState r0 = r0.this$0
            r1 = r6
            java.lang.Object r1 = r1.$targetValue$inlined
            androidx.compose.material.SwipeableState.access$setCurrentValue(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lb1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The target value must have an associated anchor."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$snapTo$$inlined$collect$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
