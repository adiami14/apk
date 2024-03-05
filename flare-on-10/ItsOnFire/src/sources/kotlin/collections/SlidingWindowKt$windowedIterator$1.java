package kotlin.collections;

import androidx.appcompat.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(bv = {}, d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, R.styleable.AppCompatTheme_checkedTextViewStyle, R.styleable.AppCompatTheme_colorControlNormal, R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: ItsOnFire.jar:kotlin/collections/SlidingWindowKt$windowedIterator$1.class */
public final class SlidingWindowKt$windowedIterator$1<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Iterator<T> $iterator;
    public final /* synthetic */ boolean $partialWindows;
    public final /* synthetic */ boolean $reuseBuffer;
    public final /* synthetic */ int $size;
    public final /* synthetic */ int $step;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SlidingWindowKt$windowedIterator$1(int i2, int i3, Iterator<? extends T> it, boolean z, boolean z2, Continuation<? super SlidingWindowKt$windowedIterator$1> continuation) {
        super(2, continuation);
        this.$size = i2;
        this.$step = i3;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((SequenceScope) ((SequenceScope) obj), continuation);
    }

    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super List<? extends T>> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SlidingWindowKt$windowedIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0245, code lost:
        if (r4.$partialWindows == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a0  */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v119, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v142, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v151, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v70, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v71, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v73, types: [kotlin.collections.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v90, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v91, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v92, types: [kotlin.collections.RingBuffer] */
    /* JADX WARN: Type inference failed for: r0v95, types: [kotlin.collections.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x013c -> B:35:0x0141). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x022d -> B:66:0x0232). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x028c -> B:79:0x0291). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
