package l;

import androidx.appcompat.R;
import j.u0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"��\u0014\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0002\u001a\u00028��ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0002\u001a\u00028��H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"E", "Ll/m0;", "element", "Ll/r;", "", "b", "(Ll/m0;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Ll/m0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: ItsOnFire.jar:l/t.class */
public final /* synthetic */ class t {

    @Metadata(bv = {}, d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0003\u001a\u00020\u0002\"\u0004\b��\u0010��*\u00020\u0001H\u008a@"}, d2 = {"E", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:l/t$a.class */
    public static final class a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f772j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ m0<E> f773k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ E f774l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m0<? super E> m0Var, E e2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f773k = m0Var;
            this.f774l = e2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f773k, this.f774l, continuation);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f772j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                m0<E> m0Var = this.f773k;
                E e2 = this.f774l;
                this.f772j = 1;
                if (m0Var.U(e2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b��\u0010��*\u00020\u0001H\u008a@"}, d2 = {"E", "Lj/u0;", "Ll/r;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:l/t$b.class */
    public static final class b extends SuspendLambda implements Function2<u0, Continuation<? super r<? extends Unit>>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f775j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f776k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ m0<E> f777l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ E f778m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(m0<? super E> m0Var, E e2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f777l = m0Var;
            this.f778m = e2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f777l, this.f778m, continuation);
            bVar.f776k = obj;
            return bVar;
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super r<Unit>> continuation) {
            return ((b) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super r<? extends Unit>> continuation) {
            return invoke2(u0Var, (Continuation<? super r<Unit>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            Object m5849constructorimpl;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f775j;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    u0 u0Var = (u0) this.f776k;
                    m0<E> m0Var = this.f777l;
                    E e2 = this.f778m;
                    Result.Companion companion = Result.Companion;
                    this.f775j = 1;
                    if (m0Var.U(e2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                m5849constructorimpl = Result.m5849constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th));
            }
            return r.b(Result.m5856isSuccessimpl(m5849constructorimpl) ? r.f767b.c(Unit.INSTANCE) : r.f767b.a(Result.m5852exceptionOrNullimpl(m5849constructorimpl)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void a(@NotNull m0<? super E> m0Var, E e2) {
        if (r.m(m0Var.T(e2))) {
            return;
        }
        j.k.b(null, new a(m0Var, e2, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object b(@NotNull m0<? super E> m0Var, E e2) {
        Object b2;
        Object T = m0Var.T(e2);
        if (T instanceof r.c) {
            b2 = j.k.b(null, new b(m0Var, e2, null), 1, null);
            return ((r) b2).o();
        }
        Unit unit = (Unit) T;
        return r.f767b.c(Unit.INSTANCE);
    }
}
