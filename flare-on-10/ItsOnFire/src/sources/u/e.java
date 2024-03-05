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
@Metadata(bv = {}, d1 = {"��,\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020��\u001aD\u0010\t\u001a\u00028��\"\u0004\b��\u0010\u0004*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028��0\u0007H\u0086Hø\u0001��\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u0012\u0004\b\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0011\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0014\u0010\u000e\"\u001a\u0010\u0018\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u0012\u0004\b\u0017\u0010\u000e\"\u001a\u0010\u001d\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u000e\"\u001a\u0010 \u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"", "locked", "Lu/c;", "a", "T", "", "owner", "Lkotlin/Function0;", "action", "o", "(Lu/c;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lq/r0;", "Lq/r0;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "c", "getLOCKED$annotations", "LOCKED", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "getUNLOCKED$annotations", "UNLOCKED", "Lu/b;", "e", "Lu/b;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:u/e.class */
public final class e {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f2263a = new r0("LOCK_FAIL");
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f2264b = new r0("UNLOCK_FAIL");
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f2265c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final r0 f2266d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final b f2267e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final b f2268f;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
    @DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: ItsOnFire.jar:u/e$a.class */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f2269j;

        /* renamed from: k  reason: collision with root package name */
        public Object f2270k;

        /* renamed from: l  reason: collision with root package name */
        public Object f2271l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f2272m;

        /* renamed from: n  reason: collision with root package name */
        public int f2273n;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2272m = obj;
            this.f2273n |= Integer.MIN_VALUE;
            return e.o(null, null, null, this);
        }
    }

    static {
        r0 r0Var = new r0("LOCKED");
        f2265c = r0Var;
        r0 r0Var2 = new r0("UNLOCKED");
        f2266d = r0Var2;
        f2267e = new b(r0Var);
        f2268f = new b(r0Var2);
    }

    @NotNull
    public static final c a(boolean z) {
        return new d(z);
    }

    public static /* synthetic */ c b(boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return a(z);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object o(@org.jetbrains.annotations.NotNull u.c r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r7) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.o(u.c, java.lang.Object, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object p(c cVar, Object obj, Function0<? extends T> function0, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        cVar.c(obj, continuation);
        InlineMarker.mark(1);
        try {
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            cVar.d(obj);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            cVar.d(obj);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static /* synthetic */ Object q(c cVar, Object obj, Function0 function0, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        InlineMarker.mark(0);
        cVar.c(obj, continuation);
        InlineMarker.mark(1);
        try {
            Object invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            cVar.d(obj);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            cVar.d(obj);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
