package l;

import androidx.appcompat.R;
import j.c2;
import j.i2;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��@\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018��*\u0006\b��\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028��H¦@ø\u0001��¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028��0\u0005H¦@ø\u0001��ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028��0\u0005H&ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\tH¦\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH&J\b\u0010\u000f\u001a\u00020\u000eH\u0017J\u0014\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0010H'J\u0011\u0010\u0013\u001a\u0004\u0018\u00018��H\u0017¢\u0006\u0004\b\u0013\u0010\bJ\u0015\u0010\u0014\u001a\u0004\u0018\u00018��H\u0097@ø\u0001��¢\u0006\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028��0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00050\u001c8&X¦\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018��0\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\"\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Ll/i0;", "E", "", "F", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/r;", "z", "v", "()Ljava/lang/Object;", "Ll/p;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "cancel", "", "", "a", "poll", "w", "i", "()Z", "isClosedForReceive$annotations", "()V", "isClosedForReceive", "isEmpty", "isEmpty$annotations", "Lt/d;", "o", "()Lt/d;", "onReceive", "p", "onReceiveCatching", "q", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/i0.class */
public interface i0<E> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:l/i0$a.class */
    public static final class a {

        @Metadata(bv = {}, d1 = {"��'\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\n\u0012\u0006\u0012\u0004\u0018\u00018��0\u0001JL\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032$\u0010\b\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018��\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0017ø\u0001��¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"l/i0$a$a", "Lt/d;", "R", "Lt/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "L", "(Lt/f;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: l.i0$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:l/i0$a$a.class */
        public static final class C0054a implements t.d<E> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ i0<E> f711j;

            /* JADX INFO: Add missing generic type declarations: [R] */
            @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028��\"\u0004\b��\u0010��\"\u0006\b\u0001\u0010\u0001 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"R", "E", "Ll/r;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: l.i0$a$a$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:l/i0$a$a$a.class */
            public static final class C0055a<R> extends SuspendLambda implements Function2<r<? extends E>, Continuation<? super R>, Object> {

                /* renamed from: j  reason: collision with root package name */
                public int f712j;

                /* renamed from: k  reason: collision with root package name */
                public /* synthetic */ Object f713k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ Function2<E, Continuation<? super R>, Object> f714l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0055a(Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C0055a> continuation) {
                    super(2, continuation);
                    this.f714l = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C0055a c0055a = new C0055a(this.f714l, continuation);
                    c0055a.f713k = obj;
                    return c0055a;
                }

                @Nullable
                public final Object i(@NotNull Object obj, @Nullable Continuation<? super R> continuation) {
                    return ((C0055a) create(r.b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return i(((r) obj).o(), (Continuation) obj2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f712j;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Object o2 = ((r) this.f713k).o();
                        Throwable f2 = r.f(o2);
                        if (f2 != null) {
                            throw f2;
                        }
                        Function2<E, Continuation<? super R>, Object> function2 = this.f714l;
                        Object h2 = r.h(o2);
                        this.f712j = 1;
                        Object invoke = function2.invoke(h2, this);
                        obj = invoke;
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0054a(i0<? extends E> i0Var) {
                this.f711j = i0Var;
            }

            @Override // t.d
            @i2
            public <R> void L(@NotNull t.f<? super R> fVar, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
                this.f711j.p().L(fVar, new C0055a(function2, null));
            }
        }

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {354}, m = "receiveOrNull", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:l/i0$a$b.class */
        public static final class b<E> extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f715j;

            /* renamed from: k  reason: collision with root package name */
            public int f716k;

            public b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f715j = obj;
                this.f716k |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(i0 i0Var, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            i0Var.cancel(cancellationException);
        }

        public static /* synthetic */ boolean c(i0 i0Var, Throwable th, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    th = null;
                }
                return i0Var.a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @NotNull
        public static <E> t.d<E> d(@NotNull i0<? extends E> i0Var) {
            return new C0054a(i0Var);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @ReplaceWith(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @c2
        public static /* synthetic */ void f() {
        }

        @c2
        public static /* synthetic */ void g() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E h(@NotNull i0<? extends E> i0Var) {
            Object v2 = i0Var.v();
            if (r.m(v2)) {
                return (E) r.i(v2);
            }
            Throwable f2 = r.f(v2);
            if (f2 == null) {
                return null;
            }
            throw q.q0.p(f2);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @kotlin.internal.LowPriorityInOverloadResolution
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object i(@org.jetbrains.annotations.NotNull l.i0<? extends E> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super E> r5) {
            /*
                r0 = r5
                boolean r0 = r0 instanceof l.i0.a.b
                if (r0 == 0) goto L25
                r0 = r5
                l.i0$a$b r0 = (l.i0.a.b) r0
                r6 = r0
                r0 = r6
                int r0 = r0.f716k
                r7 = r0
                r0 = r7
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L25
                r0 = r6
                r1 = r7
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f716k = r1
                r0 = r6
                r5 = r0
                goto L2e
            L25:
                l.i0$a$b r0 = new l.i0$a$b
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                r5 = r0
            L2e:
                r0 = r5
                java.lang.Object r0 = r0.f715j
                r8 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r6 = r0
                r0 = r5
                int r0 = r0.f716k
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L61
                r0 = r7
                r1 = 1
                if (r0 != r1) goto L57
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r8
                l.r r0 = (l.r) r0
                java.lang.Object r0 = r0.o()
                r4 = r0
                goto L7c
            L57:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L61:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                r1 = 1
                r0.f716k = r1
                r0 = r4
                r1 = r5
                java.lang.Object r0 = r0.z(r1)
                r5 = r0
                r0 = r5
                r4 = r0
                r0 = r5
                r1 = r6
                if (r0 != r1) goto L7c
                r0 = r6
                return r0
            L7c:
                r0 = r4
                java.lang.Object r0 = l.r.h(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: l.i0.a.i(l.i0, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Nullable
    Object F(@NotNull Continuation<? super E> continuation);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable th);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@Nullable CancellationException cancellationException);

    boolean i();

    boolean isEmpty();

    @NotNull
    p<E> iterator();

    @NotNull
    t.d<E> o();

    @NotNull
    t.d<r<E>> p();

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    E poll();

    @NotNull
    t.d<E> q();

    @NotNull
    Object v();

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    Object w(@NotNull Continuation<? super E> continuation);

    @Nullable
    Object z(@NotNull Continuation<? super r<? extends E>> continuation);
}
