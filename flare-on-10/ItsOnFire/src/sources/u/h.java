package u;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.r0;
import q.v0;
@Metadata(bv = {}, d1 = {"��.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020��\u001a8\u0010\b\u001a\u00028��\"\u0004\b��\u0010\u0005*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028��0\u0006H\u0086Hø\u0001��\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\"\u001a\u0010\u0012\u001a\u00020��8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0011\"\u001a\u0010\u001a\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u0012\u0004\b\u0019\u0010\u0011\"\u001a\u0010\u001d\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u0012\u0004\b\u001c\u0010\u0011\"\u001a\u0010 \u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u0012\u0004\b\u001f\u0010\u0011\"\u001a\u0010#\u001a\u00020��8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u000f\u0012\u0004\b\"\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "permits", "acquiredPermits", "Lu/f;", "a", "T", "Lkotlin/Function0;", "action", "q", "(Lu/f;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lu/i;", "prev", "j", "I", "getMAX_SPIN_CYCLES$annotations", "()V", "MAX_SPIN_CYCLES", "Lq/r0;", "b", "Lq/r0;", "getPERMIT$annotations", "PERMIT", "c", "getTAKEN$annotations", "TAKEN", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "getBROKEN$annotations", "BROKEN", "e", "getCANCELLED$annotations", "CANCELLED", "f", "getSEGMENT_SIZE$annotations", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:u/h.class */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2282a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f2283b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f2284c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final r0 f2285d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final r0 f2286e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f2287f;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
    @DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    /* loaded from: ItsOnFire.jar:u/h$a.class */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f2288j;

        /* renamed from: k  reason: collision with root package name */
        public Object f2289k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f2290l;

        /* renamed from: m  reason: collision with root package name */
        public int f2291m;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2290l = obj;
            this.f2291m |= Integer.MIN_VALUE;
            return h.q(null, null, this);
        }
    }

    static {
        int d2;
        int d3;
        d2 = v0.d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f2282a = d2;
        f2283b = new r0("PERMIT");
        f2284c = new r0("TAKEN");
        f2285d = new r0("BROKEN");
        f2286e = new r0("CANCELLED");
        d3 = v0.d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f2287f = d3;
    }

    @NotNull
    public static final f a(int i2, int i3) {
        return new g(i2, i3);
    }

    public static /* synthetic */ f b(int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return a(i2, i3);
    }

    public static final i j(long j2, i iVar) {
        return new i(j2, iVar, 0);
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object q(@org.jetbrains.annotations.NotNull u.f r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof u.h.a
            if (r0 == 0) goto L26
            r0 = r6
            u.h$a r0 = (u.h.a) r0
            r7 = r0
            r0 = r7
            int r0 = r0.f2291m
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L26
            r0 = r7
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f2291m = r1
            goto L2f
        L26:
            u.h$a r0 = new u.h$a
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r7 = r0
        L2f:
            r0 = r7
            java.lang.Object r0 = r0.f2290l
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.f2291m
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6d
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L63
            r0 = r7
            java.lang.Object r0 = r0.f2289k
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r5 = r0
            r0 = r7
            java.lang.Object r0 = r0.f2288j
            u.f r0 = (u.f) r0
            r6 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L92
        L63:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6d:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = r4
            r0.f2288j = r1
            r0 = r7
            r1 = r5
            r0.f2289k = r1
            r0 = r7
            r1 = 1
            r0.f2291m = r1
            r0 = r4
            r6 = r0
            r0 = r4
            r1 = r7
            java.lang.Object r0 = r0.b(r1)
            r1 = r10
            if (r0 != r1) goto L92
            r0 = r10
            return r0
        L92:
            r0 = r5
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> La9
            r4 = r0
            r0 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r0 = r6
            r0.release()
            r0 = 1
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            r0 = r4
            return r0
        La9:
            r4 = move-exception
            r0 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r0 = r6
            r0.release()
            r0 = 1
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.q(u.f, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object r(f fVar, Function0<? extends T> function0, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        fVar.b(continuation);
        InlineMarker.mark(1);
        try {
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            fVar.release();
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            fVar.release();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
