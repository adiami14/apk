package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.FirebaseMessagingService;
import j.n2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��¸\u0001\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0011\u0018��*\u0006\b��\u0010\u0001 ��2\b\u0012\u0004\u0012\u00028��0\u00022\b\u0012\u0004\u0012\u00028��0\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010u\u001a\b\u0012\u0004\u0012\u00028��0q\u0012\u0006\u0010-\u001a\u00020'¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010\"\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J8\u0010%\u001a\u00020$2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*JZ\u00100\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101JH\u00102\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b2\u00103JJ\u00105\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010,\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u000f\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0004\b<\u0010\bJ\u0017\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bF\u0010\fJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH��¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bI\u0010JJ8\u0010K\u001a\u00020\u000e2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\bP\u0010BJ \u0010S\u001a\u00020\u000e2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028��0QH\u0016ø\u0001��¢\u0006\u0004\bS\u0010TJ<\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00028��2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\bV\u0010WJ8\u0010X\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000eH��¢\u0006\u0004\bZ\u0010\u001fJ#\u0010[\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028��2\b\u0010/\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b[\u0010\\JH\u0010]\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028��2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u0004\u0018\u00010 2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020 H\u0016¢\u0006\u0004\bc\u0010TJ\u001b\u0010e\u001a\u00020\u000e*\u00020d2\u0006\u0010U\u001a\u00028��H\u0016¢\u0006\u0004\be\u0010fJ\u001b\u0010g\u001a\u00020\u000e*\u00020d2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\bg\u0010hJ\u001f\u0010i\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bk\u0010lJ\u000f\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020mH\u0014¢\u0006\u0004\bp\u0010oR \u0010u\u001a\b\u0012\u0004\u0012\u00028��0q8��X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010z\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010w\u001a\u0004\bx\u0010yR\u0018\u0010|\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010{R\u0014\u0010~\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010oR\u0016\u0010!\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010BR\u0016\u0010\u0081\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\bR\u0016\u0010\u0084\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\bR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008a\u0001"}, d2 = {"Lj/r;", "T", "Lj/j1;", "Lj/q;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "F", "()Z", "", "cause", "q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "", "block", "o", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "S", "Q", "Lj/p1;", "D", "()Lj/p1;", "K", "()V", "", "state", "H", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "Lj/o;", "G", "(Lkotlin/jvm/functions/Function1;)Lj/o;", "", "mode", "v", "(I)V", "Lj/d3;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "P", "(Lj/d3;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "M", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lq/r0;", "R", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lq/r0;", "", "l", "(Ljava/lang/Object;)Ljava/lang/Void;", "u", "E", "L", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "k", "()Ljava/lang/Object;", "takenState", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "a", "J", "(Ljava/lang/Throwable;)V", "m", "(Lj/o;Ljava/lang/Throwable;)V", "p", "Lj/n2;", "parent", "w", "(Lj/n2;)Ljava/lang/Throwable;", "x", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "O", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "A", "(Lkotlin/jvm/functions/Function1;)V", "r", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "C", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "B", "(Ljava/lang/Throwable;)Ljava/lang/Object;", FirebaseMessagingService.EXTRA_TOKEN, "Z", "Lj/o0;", "t", "(Lj/o0;Ljava/lang/Object;)V", "s", "(Lj/o0;Ljava/lang/Throwable;)V", "i", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "I", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/Continuation;", "g", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lj/p1;", "parentHandle", "z", "stateDebugRepresentation", "y", "b", "isActive", "e", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: ItsOnFire.jar:j/r.class */
public class r<T> extends j1<T> implements q<T>, CoroutineStackFrame {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f543p = AtomicIntegerFieldUpdater.newUpdater(r.class, "_decision");

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f544q = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ int _decision;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final Continuation<T> f545m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final CoroutineContext f546n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public p1 f547o;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull Continuation<? super T> continuation, int i2) {
        super(i2);
        this.f545m = continuation;
        this.f546n = continuation.getContext();
        this._decision = 0;
        this._state = d.f452j;
    }

    public static /* synthetic */ void N(r rVar, Object obj, int i2, Function1 function1, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        rVar.M(obj, i2, function1);
    }

    @Override // j.q
    public void A(@NotNull Function1<? super Throwable, Unit> function1) {
        o G = G(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (androidx.concurrent.futures.a.a(f544q, this, obj, G)) {
                    return;
                }
            } else if (obj instanceof o) {
                H(function1, obj);
            } else {
                boolean z = obj instanceof e0;
                if (z) {
                    e0 e0Var = (e0) obj;
                    if (!e0Var.b()) {
                        H(function1, obj);
                    }
                    if (obj instanceof u) {
                        Throwable th = null;
                        if (!z) {
                            e0Var = null;
                        }
                        if (e0Var != null) {
                            th = e0Var.f467a;
                        }
                        n(function1, th);
                        return;
                    }
                    return;
                } else if (obj instanceof d0) {
                    d0 d0Var = (d0) obj;
                    if (d0Var.f454b != null) {
                        H(function1, obj);
                    }
                    if (G instanceof g) {
                        return;
                    }
                    if (d0Var.h()) {
                        n(function1, d0Var.f457e);
                        return;
                    }
                    if (androidx.concurrent.futures.a.a(f544q, this, obj, d0.g(d0Var, null, G, null, null, null, 29, null))) {
                        return;
                    }
                } else if (G instanceof g) {
                    return;
                } else {
                    if (androidx.concurrent.futures.a.a(f544q, this, obj, new d0(obj, G, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // j.q
    @Nullable
    public Object B(@NotNull Throwable th) {
        return R(new e0(th, false, 2, null), null, null);
    }

    @Override // j.q
    @Nullable
    public Object C(T t2, @Nullable Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        return R(t2, obj, function1);
    }

    public final p1 D() {
        n2 n2Var = (n2) getContext().get(n2.f531b);
        if (n2Var == null) {
            return null;
        }
        p1 f2 = n2.a.f(n2Var, true, false, new v(this), 2, null);
        this.f547o = f2;
        return f2;
    }

    @Override // j.q
    public void E() {
        p1 D = D();
        if (D != null && e()) {
            D.dispose();
            this.f547o = c3.f450j;
        }
    }

    public final boolean F() {
        return k1.d(this.f493l) && ((q.l) this.f545m).q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j.o] */
    public final o G(Function1<? super Throwable, Unit> function1) {
        return function1 instanceof o ? (o) function1 : new k2(function1);
    }

    public final void H(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    @NotNull
    public String I() {
        return "CancellableContinuation";
    }

    public final void J(@NotNull Throwable th) {
        if (q(th)) {
            return;
        }
        a(th);
        u();
    }

    public final void K() {
        Throwable y;
        Continuation<T> continuation = this.f545m;
        q.l lVar = continuation instanceof q.l ? (q.l) continuation : null;
        if (lVar == null || (y = lVar.y(this)) == null) {
            return;
        }
        r();
        a(y);
    }

    @JvmName(name = "resetStateReusable")
    public final boolean L() {
        Object obj = this._state;
        if ((obj instanceof d0) && ((d0) obj).f456d != null) {
            r();
            return false;
        }
        this._decision = 0;
        this._state = d.f452j;
        return true;
    }

    public final void M(Object obj, int i2, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof d3)) {
                if (obj2 instanceof u) {
                    u uVar = (u) obj2;
                    if (uVar.c()) {
                        if (function1 != null) {
                            p(function1, uVar.f467a);
                            return;
                        }
                        return;
                    }
                }
                l(obj);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.a.a(f544q, this, obj2, P((d3) obj2, obj, i2, function1, null)));
        u();
        v(i2);
    }

    @Override // j.q
    public void O(T t2, @Nullable Function1<? super Throwable, Unit> function1) {
        M(t2, this.f493l, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r15 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(j.d3 r11, java.lang.Object r12, int r13, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r14, java.lang.Object r15) {
        /*
            r10 = this;
            r0 = r12
            boolean r0 = r0 instanceof j.e0
            if (r0 == 0) goto Ld
            r0 = r12
            r16 = r0
            goto L5e
        Ld:
            r0 = r13
            boolean r0 = j.k1.c(r0)
            if (r0 != 0) goto L1f
            r0 = r15
            if (r0 != 0) goto L1f
            r0 = r12
            r16 = r0
            goto L5e
        L1f:
            r0 = r14
            if (r0 != 0) goto L3a
            r0 = r11
            boolean r0 = r0 instanceof j.o
            if (r0 == 0) goto L32
            r0 = r11
            boolean r0 = r0 instanceof j.g
            if (r0 == 0) goto L3a
        L32:
            r0 = r12
            r16 = r0
            r0 = r15
            if (r0 == 0) goto L5e
        L3a:
            r0 = r11
            boolean r0 = r0 instanceof j.o
            if (r0 == 0) goto L49
            r0 = r11
            j.o r0 = (j.o) r0
            r11 = r0
            goto L4b
        L49:
            r0 = 0
            r11 = r0
        L4b:
            j.d0 r0 = new j.d0
            r1 = r0
            r2 = r12
            r3 = r11
            r4 = r14
            r5 = r15
            r6 = 0
            r7 = 16
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r16 = r0
        L5e:
            r0 = r16
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.r.P(j.d3, java.lang.Object, int, kotlin.jvm.functions.Function1, java.lang.Object):java.lang.Object");
    }

    public final boolean Q() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f543p.compareAndSet(this, 0, 2));
        return true;
    }

    public final q.r0 R(Object obj, Object obj2, Function1<? super Throwable, Unit> function1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof d3)) {
                q.r0 r0Var = null;
                if (obj3 instanceof d0) {
                    r0Var = null;
                    if (obj2 != null) {
                        r0Var = null;
                        if (((d0) obj3).f456d == obj2) {
                            r0Var = s.f553d;
                        }
                    }
                }
                return r0Var;
            }
        } while (!androidx.concurrent.futures.a.a(f544q, this, obj3, P((d3) obj3, obj, this.f493l, function1, obj2)));
        u();
        return s.f553d;
    }

    public final boolean S() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f543p.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // j.q
    public void Z(@NotNull Object obj) {
        v(this.f493l);
    }

    @Override // j.q
    public boolean a(@Nullable Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof d3)) {
                return false;
            }
            z = obj instanceof o;
        } while (!androidx.concurrent.futures.a.a(f544q, this, obj, new u(this, th, z)));
        o oVar = z ? (o) obj : null;
        if (oVar != null) {
            m(oVar, th);
        }
        u();
        v(this.f493l);
        return true;
    }

    @Override // j.q
    public boolean b() {
        return y() instanceof d3;
    }

    @Override // j.j1
    public void d(@Nullable Object obj, @NotNull Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof d3) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof e0) {
                return;
            }
            if (obj2 instanceof d0) {
                d0 d0Var = (d0) obj2;
                if (!(!d0Var.h())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.a.a(f544q, this, obj2, d0.g(d0Var, null, null, null, null, th, 15, null))) {
                    d0Var.i(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.a.a(f544q, this, obj2, new d0(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // j.q
    public boolean e() {
        return !(y() instanceof d3);
    }

    @Override // j.q
    @Nullable
    public Object f(T t2, @Nullable Object obj) {
        return R(t2, obj, null);
    }

    @Override // j.j1
    @NotNull
    public final Continuation<T> g() {
        return this.f545m;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f545m;
        return continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f546n;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // j.j1
    @Nullable
    public Throwable h(@Nullable Object obj) {
        Throwable h2 = super.h(obj);
        if (h2 == null) {
            h2 = null;
        }
        return h2;
    }

    @Override // j.j1
    public <T> T i(@Nullable Object obj) {
        Object obj2 = obj;
        if (obj instanceof d0) {
            obj2 = ((d0) obj).f453a;
        }
        return (T) obj2;
    }

    @Override // j.q
    public boolean isCancelled() {
        return y() instanceof u;
    }

    @Override // j.j1
    @Nullable
    public Object k() {
        return y();
    }

    public final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void m(@NotNull o oVar, @Nullable Throwable th) {
        try {
            oVar.a(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            r0.b(context, new h0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            r0.b(context, new h0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            CoroutineContext context = getContext();
            r0.b(context, new h0("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void p(@NotNull Function1<? super Throwable, Unit> function1, @NotNull Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            r0.b(context, new h0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final boolean q(Throwable th) {
        if (F()) {
            return ((q.l) this.f545m).r(th);
        }
        return false;
    }

    public final void r() {
        p1 p1Var = this.f547o;
        if (p1Var == null) {
            return;
        }
        p1Var.dispose();
        this.f547o = c3.f450j;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        N(this, k0.b(obj, this), this.f493l, null, 4, null);
    }

    @Override // j.q
    public void s(@NotNull o0 o0Var, @NotNull Throwable th) {
        Continuation<T> continuation = this.f545m;
        q.l lVar = continuation instanceof q.l ? (q.l) continuation : null;
        e0 e0Var = new e0(th, false, 2, null);
        o0 o0Var2 = null;
        if (lVar != null) {
            o0Var2 = lVar.f2066m;
        }
        N(this, e0Var, o0Var2 == o0Var ? 4 : this.f493l, null, 4, null);
    }

    @Override // j.q
    public void t(@NotNull o0 o0Var, T t2) {
        Continuation<T> continuation = this.f545m;
        o0 o0Var2 = null;
        q.l lVar = continuation instanceof q.l ? (q.l) continuation : null;
        if (lVar != null) {
            o0Var2 = lVar.f2066m;
        }
        N(this, t2, o0Var2 == o0Var ? 4 : this.f493l, null, 4, null);
    }

    @NotNull
    public String toString() {
        return I() + '(' + z0.c(this.f545m) + "){" + z() + "}@" + z0.b(this);
    }

    public final void u() {
        if (F()) {
            return;
        }
        r();
    }

    public final void v(int i2) {
        if (Q()) {
            return;
        }
        k1.a(this, i2);
    }

    @NotNull
    public Throwable w(@NotNull n2 n2Var) {
        return n2Var.u();
    }

    @PublishedApi
    @Nullable
    public final Object x() {
        n2 n2Var;
        Object coroutine_suspended;
        boolean F = F();
        if (S()) {
            if (this.f547o == null) {
                D();
            }
            if (F) {
                K();
            }
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended;
        }
        if (F) {
            K();
        }
        Object y = y();
        if (y instanceof e0) {
            throw ((e0) y).f467a;
        }
        if (!k1.c(this.f493l) || (n2Var = (n2) getContext().get(n2.f531b)) == null || n2Var.b()) {
            return i(y);
        }
        CancellationException u2 = n2Var.u();
        d(y, u2);
        throw u2;
    }

    @Nullable
    public final Object y() {
        return this._state;
    }

    public final String z() {
        Object y = y();
        return y instanceof d3 ? "Active" : y instanceof u ? "Cancelled" : "Completed";
    }
}
