package l;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.c2;
import j.i2;
import j.u0;
import j.w0;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030��2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028��0\u0010\"\u0004\b��\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001��¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028��0\u0010\"\u0004\b��\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001��¢\u0006\u0004\b\u001c\u0010\u001d\u001aª\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028��0\u0010\"\u0004\b��\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH��ø\u0001��¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Ll/g0;", "Lkotlin/Function0;", "", "block", "a", "(Ll/g0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lj/u0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Ll/i0;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Ll/i0;", "Lj/w0;", "start", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILj/w0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ll/i0;", "Ll/m;", "onBufferOverflow", "e", "(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILl/m;Lj/w0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ll/i0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/e0.class */
public final class e0 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    /* loaded from: ItsOnFire.jar:l/e0$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j */
        public Object f693j;

        /* renamed from: k */
        public Object f694k;

        /* renamed from: l */
        public /* synthetic */ Object f695l;

        /* renamed from: m */
        public int f696m;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f695l = obj;
            this.f696m |= Integer.MIN_VALUE;
            return e0.a(null, null, this);
        }
    }

    @Metadata(d1 = {"��\b\n��\n\u0002\u0010\u0002\n��\u0010��\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:l/e0$b.class */
    public static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: j */
        public static final b f697j = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
        }
    }

    @Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0003\n��\u0010��\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:l/e0$c.class */
    public static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: j */
        public final /* synthetic */ j.q<Unit> f698j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(j.q<? super Unit> qVar) {
            super(1);
            this.f698j = qVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable Throwable th) {
            j.q<Unit> qVar = this.f698j;
            Result.Companion companion = Result.Companion;
            qVar.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0073  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull l.g0<?> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e0.a(l.g0, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object b(g0 g0Var, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = b.f697j;
        }
        return a(g0Var, function0, continuation);
    }

    @i2
    @NotNull
    public static final <E> i0<E> c(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext, int i2, @NotNull w0 w0Var, @Nullable Function1<? super Throwable, Unit> function1, @BuilderInference @NotNull Function2<? super g0<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return e(u0Var, coroutineContext, i2, m.SUSPEND, w0Var, function1, function2);
    }

    @c2
    @NotNull
    public static final <E> i0<E> d(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext, int i2, @BuilderInference @NotNull Function2<? super g0<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return e(u0Var, coroutineContext, i2, m.SUSPEND, w0.DEFAULT, null, function2);
    }

    @NotNull
    public static final <E> i0<E> e(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext, int i2, @NotNull m mVar, @NotNull w0 w0Var, @Nullable Function1<? super Throwable, Unit> function1, @BuilderInference @NotNull Function2<? super g0<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        f0 f0Var = new f0(j.n0.d(u0Var, coroutineContext), q.d(i2, mVar, null, 4, null));
        if (function1 != null) {
            f0Var.H(function1);
        }
        f0Var.w1(w0Var, f0Var, function2);
        return f0Var;
    }

    public static /* synthetic */ i0 f(u0 u0Var, CoroutineContext coroutineContext, int i2, w0 w0Var, Function1 function1, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            w0Var = w0.DEFAULT;
        }
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        return c(u0Var, coroutineContext, i2, w0Var, function1, function2);
    }

    public static /* synthetic */ i0 g(u0 u0Var, CoroutineContext coroutineContext, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return d(u0Var, coroutineContext, i2, function2);
    }

    public static /* synthetic */ i0 h(u0 u0Var, CoroutineContext coroutineContext, int i2, m mVar, w0 w0Var, Function1 function1, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            mVar = m.SUSPEND;
        }
        if ((i3 & 8) != 0) {
            w0Var = w0.DEFAULT;
        }
        if ((i3 & 16) != 0) {
            function1 = null;
        }
        return e(u0Var, coroutineContext, i2, mVar, w0Var, function1, function2);
    }
}
