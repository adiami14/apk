package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2864}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: ItsOnFire.jar:kotlin/sequences/SequencesKt___SequencesKt$zipWithNext$2.class */
public final class SequencesKt___SequencesKt$zipWithNext$2<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Sequence<T> $this_zipWithNext;
    public final /* synthetic */ Function2<T, T, R> $transform;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$zipWithNext$2(Sequence<? extends T> sequence, Function2<? super T, ? super T, ? extends R> function2, Continuation<? super SequencesKt___SequencesKt$zipWithNext$2> continuation) {
        super(2, continuation);
        this.$this_zipWithNext = sequence;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, continuation);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((SequenceScope) ((SequenceScope) obj), continuation);
    }

    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super R> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b8 -> B:7:0x0031). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r6 = r0
            r0 = r4
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L42
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L38
            r0 = r4
            java.lang.Object r0 = r0.L$2
            r8 = r0
            r0 = r4
            java.lang.Object r0 = r0.L$1
            java.util.Iterator r0 = (java.util.Iterator) r0
            r9 = r0
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            r10 = r0
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r5 = r0
        L31:
            r0 = r10
            r8 = r0
            goto L70
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L42:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            r8 = r0
            r0 = r4
            kotlin.sequences.Sequence<T> r0 = r0.$this_zipWithNext
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L68
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L68:
            r0 = r9
            java.lang.Object r0 = r0.next()
            r5 = r0
        L70:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lbd
            r0 = r9
            java.lang.Object r0 = r0.next()
            r10 = r0
            r0 = r4
            kotlin.jvm.functions.Function2<T, T, R> r0 = r0.$transform
            r1 = r5
            r2 = r10
            java.lang.Object r0 = r0.invoke(r1, r2)
            r11 = r0
            r0 = r4
            r1 = r8
            r0.L$0 = r1
            r0 = r4
            r1 = r9
            r0.L$1 = r1
            r0 = r4
            r1 = r10
            r0.L$2 = r1
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r10
            r5 = r0
            r0 = r8
            r10 = r0
            r0 = r8
            r1 = r11
            r2 = r4
            java.lang.Object r0 = r0.yield(r1, r2)
            r1 = r6
            if (r0 != r1) goto L31
            r0 = r6
            return r0
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
