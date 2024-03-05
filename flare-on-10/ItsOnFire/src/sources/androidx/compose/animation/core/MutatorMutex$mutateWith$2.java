package androidx.compose.animation.core;

import androidx.compose.animation.core.MutatorMutex;
import j.n2;
import j.u0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.c;
/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(bv = {}, d1 = {"��\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u0010\u0003\u001a\u00028\u0001\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lj/u0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {171, 158}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/MutatorMutex$mutateWith$2.class */
public final class MutatorMutex$mutateWith$2<R> extends SuspendLambda implements Function2<u0, Continuation<? super R>, Object> {
    public final /* synthetic */ Function2<T, Continuation<? super R>, Object> $block;
    public final /* synthetic */ MutatePriority $priority;
    public final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t2, Continuation<? super MutatorMutex$mutateWith$2> continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = function2;
        this.$receiver = t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, continuation);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super R> continuation) {
        return ((MutatorMutex$mutateWith$2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Object obj) {
        return invoke(u0Var, (Continuation) ((Continuation) obj));
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0191: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:38:0x0191 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        c cVar;
        MutatorMutex.Mutator mutator;
        c cVar2;
        c cVar3;
        Function2 function2;
        Object obj2;
        MutatorMutex mutatorMutex;
        MutatorMutex mutatorMutex2;
        MutatorMutex.Mutator mutator2;
        c cVar4;
        MutatorMutex mutatorMutex3;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    u0 u0Var = (u0) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    CoroutineContext.Element element = u0Var.getCoroutineContext().get(n2.f531b);
                    Intrinsics.checkNotNull(element);
                    mutator = new MutatorMutex.Mutator(mutatePriority, (n2) element);
                    this.this$0.tryMutateOrCancel(mutator);
                    cVar2 = this.this$0.mutex;
                    cVar3 = cVar2;
                    function2 = this.$block;
                    obj2 = this.$receiver;
                    mutatorMutex = this.this$0;
                    this.L$0 = mutator;
                    this.L$1 = cVar3;
                    this.L$2 = function2;
                    this.L$3 = obj2;
                    this.L$4 = mutatorMutex;
                    this.label = 1;
                    if (cVar3.c(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        cVar4 = (c) this.L$1;
                        MutatorMutex.Mutator mutator3 = (MutatorMutex.Mutator) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            mutatorMutex3 = mutatorMutex2;
                            mutator2 = mutator3;
                            atomicReference2 = mutatorMutex3.currentMutator;
                            a.a(atomicReference2, mutator2, null);
                            cVar4.d(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            cVar3 = cVar4;
                            mutator = mutator3;
                            atomicReference = mutatorMutex2.currentMutator;
                            a.a(atomicReference, mutator, null);
                            c cVar5 = cVar3;
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mutatorMutex = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    function2 = (Function2) this.L$2;
                    c cVar6 = (c) this.L$1;
                    mutator = (MutatorMutex.Mutator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    cVar3 = cVar6;
                }
                this.L$0 = mutator;
                this.L$1 = cVar3;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = function2.invoke(obj2, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c cVar7 = cVar3;
                obj = invoke;
                mutator2 = mutator;
                cVar4 = cVar7;
                mutatorMutex3 = mutatorMutex;
                atomicReference2 = mutatorMutex3.currentMutator;
                a.a(atomicReference2, mutator2, null);
                cVar4.d(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                mutatorMutex2 = mutatorMutex;
                atomicReference = mutatorMutex2.currentMutator;
                a.a(atomicReference, mutator, null);
                c cVar52 = cVar3;
                throw th;
            }
        } catch (Throwable th3) {
            cVar.d(null);
            throw th3;
        }
    }
}
