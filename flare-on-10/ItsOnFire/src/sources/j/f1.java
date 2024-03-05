package j;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020��H\u0086@ø\u0001��¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\bH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "duration", "c", "e", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lj/e1;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lkotlin/coroutines/CoroutineContext;)Lj/e1;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/f1.class */
public final class f1 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {148}, m = "awaitCancellation", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:j/f1$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f481j;

        /* renamed from: k  reason: collision with root package name */
        public int f482k;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f481j = obj;
            this.f482k |= Integer.MIN_VALUE;
            return f1.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
        /*
            r0 = r5
            boolean r0 = r0 instanceof j.f1.a
            if (r0 == 0) goto L25
            r0 = r5
            j.f1$a r0 = (j.f1.a) r0
            r6 = r0
            r0 = r6
            int r0 = r0.f482k
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r6
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f482k = r1
            r0 = r6
            r5 = r0
            goto L2e
        L25:
            j.f1$a r0 = new j.f1$a
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
        L2e:
            r0 = r5
            java.lang.Object r0 = r0.f481j
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r6 = r0
            r0 = r5
            int r0 = r0.f482k
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L56
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L4f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L4f:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L87
        L56:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = 1
            r0.f482k = r1
            j.r r0 = new j.r
            r1 = r0
            r2 = r5
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r3 = 1
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            r0.E()
            r0 = r8
            java.lang.Object r0 = r0.x()
            r8 = r0
            r0 = r8
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L80
            r0 = r5
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L80:
            r0 = r8
            r1 = r6
            if (r0 != r1) goto L87
            r0 = r6
            return r0
        L87:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object b(long j2, @NotNull Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (j2 <= 0) {
            return Unit.INSTANCE;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        r rVar = new r(intercepted, 1);
        rVar.E();
        if (j2 < Long.MAX_VALUE) {
            d(rVar.getContext()).i(j2, rVar);
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : Unit.INSTANCE;
    }

    @Nullable
    public static final Object c(long j2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object b2 = b(e(j2), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return b2 == coroutine_suspended ? b2 : Unit.INSTANCE;
    }

    @NotNull
    public static final e1 d(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.Key);
        e1 e1Var = element instanceof e1 ? (e1) element : null;
        e1 e1Var2 = e1Var;
        if (e1Var == null) {
            e1Var2 = b1.a();
        }
        return e1Var2;
    }

    public static final long e(long j2) {
        long j3;
        long coerceAtLeast;
        if (Duration.m7298compareToLRDsOJo(j2, Duration.Companion.m7401getZEROUwyO8pc()) > 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Duration.m7317getInWholeMillisecondsimpl(j2), 1L);
            j3 = coerceAtLeast;
        } else {
            j3 = 0;
        }
        return j3;
    }
}
