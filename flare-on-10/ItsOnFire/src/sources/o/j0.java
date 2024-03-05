package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u0084\u0001\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\u000b\b\u0010\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028��0\u00042\b\u0012\u0004\u0012\u00028��0\u00052\b\u0012\u0004\u0012\u00028��0\u0006:\u0001eB\u001f\u0012\u0006\u0010J\u001a\u00020\u0016\u0012\u0006\u0010L\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bm\u0010nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028��H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028��H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028��H\u0082@ø\u0001��¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001��¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028��01H\u0096@ø\u0001��¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028��H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH��¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH��¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028��0G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010J\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010L\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010?R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\rR\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010\rR\u0016\u0010W\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010?R\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0014\u0010[\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u00109R\u0014\u0010^\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0014\u0010b\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u00109R\u0014\u0010c\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u00109R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00028��0d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010l\u001a\u00028��8DX\u0084\u0004¢\u0006\f\u0012\u0004\bj\u0010k\u001a\u0004\bh\u0010i\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lo/j0;", "T", "Lp/b;", "Lo/l0;", "Lo/d0;", "Lo/c;", "Lp/r;", "value", "", "X", "(Ljava/lang/Object;)Z", "Y", "", "J", "", "newHead", "G", "", "item", "M", "", "curBuffer", "", "curSize", "newSize", "W", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "L", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo/j0$a;", "emitter", "D", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "b0", "E", "slot", "a0", "Z", FirebaseAnalytics.Param.INDEX, "S", "C", "(Lo/l0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "N", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "emit", "d0", "()J", "oldIndex", "c0", "(J)[Lkotlin/coroutines/Continuation;", "H", "size", "I", "(I)[Lo/l0;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Ll/m;", "onBufferOverflow", "Lo/i;", "b", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "replay", "o", "bufferCapacity", "p", "Ll/m;", "q", "[Ljava/lang/Object;", "buffer", "r", "replayIndex", "s", "minCollectorIndex", "t", "bufferSize", "u", "queueSize", "P", "head", "U", "()I", "replaySize", "V", "totalSize", "O", "bufferEndIndex", "queueEndIndex", "", "a", "()Ljava/util/List;", "replayCache", "Q", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/j0.class */
public class j0<T> extends p.b<l0> implements d0<T>, o.c<T>, p.r<T> {

    /* renamed from: n  reason: collision with root package name */
    public final int f1344n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1345o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public final l.m f1346p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    public Object[] f1347q;

    /* renamed from: r  reason: collision with root package name */
    public long f1348r;

    /* renamed from: s  reason: collision with root package name */
    public long f1349s;

    /* renamed from: t  reason: collision with root package name */
    public int f1350t;

    /* renamed from: u  reason: collision with root package name */
    public int f1351u;

    @Metadata(bv = {}, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018��2\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lo/j0$a;", "Lj/p1;", "", "dispose", "Lo/j0;", "j", "Lo/j0;", "flow", "", "k", "J", FirebaseAnalytics.Param.INDEX, "", "l", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/Continuation;", "m", "Lkotlin/coroutines/Continuation;", "cont", "<init>", "(Lo/j0;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/j0$a.class */
    public static final class a implements p1 {
        @JvmField
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final j0<?> f1352j;
        @JvmField

        /* renamed from: k  reason: collision with root package name */
        public long f1353k;
        @JvmField
        @Nullable

        /* renamed from: l  reason: collision with root package name */
        public final Object f1354l;
        @JvmField
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final Continuation<Unit> f1355m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull j0<?> j0Var, long j2, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.f1352j = j0Var;
            this.f1353k = j2;
            this.f1354l = obj;
            this.f1355m = continuation;
        }

        @Override // j.p1
        public void dispose() {
            this.f1352j.D(this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/j0$b.class */
    public final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1356a;

        static {
            int[] iArr = new int[l.m.values().length];
            iArr[l.m.SUSPEND.ordinal()] = 1;
            iArr[l.m.DROP_LATEST.ordinal()] = 2;
            iArr[l.m.DROP_OLDEST.ordinal()] = 3;
            f1356a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: ItsOnFire.jar:o/j0$c.class */
    public static final class c extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1357j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1358k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1359l;

        /* renamed from: m  reason: collision with root package name */
        public Object f1360m;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f1361n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ j0<T> f1362o;

        /* renamed from: p  reason: collision with root package name */
        public int f1363p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j0<T> j0Var, Continuation<? super c> continuation) {
            super(continuation);
            this.f1362o = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1361n = obj;
            this.f1363p |= Integer.MIN_VALUE;
            return j0.F(this.f1362o, null, this);
        }
    }

    public j0(int i2, int i3, @NotNull l.m mVar) {
        this.f1344n = i2;
        this.f1345o = i3;
        this.f1346p = mVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(4:8|(7:10|(2:12|(1:14)(2:76|77))(1:78)|15|16|17|18|(6:19|20|21|22|(15:50|51|52|53|54|55|56|57|58|59|60|61|62|63|(3:65|66|67)(1:68))(18:24|25|(2:27|28)|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(3:44|45|46)(1:48))|49))(4:79|80|81|82)|72|73)(5:90|91|92|(3:94|95|(2:97|98))|100)|83|84|85|86|18|(6:19|20|21|22|(0)(0)|49)))|103|6|(0)(0)|83|84|85|86|18|(6:19|20|21|22|(0)(0)|49)) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021d, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021e, code lost:
        r6 = r7;
        r7 = r5;
        r5 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object F(o.j0 r5, o.j r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j0.F(o.j0, o.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object K(j0 j0Var, Object obj, Continuation continuation) {
        Object coroutine_suspended;
        if (j0Var.g(obj)) {
            return Unit.INSTANCE;
        }
        Object L = j0Var.L(obj, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return L == coroutine_suspended ? L : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long P() {
        return Math.min(this.f1349s, this.f1348r);
    }

    public static /* synthetic */ void R() {
    }

    public final Object C(l0 l0Var, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Unit unit;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        j.r rVar = new j.r(intercepted, 1);
        rVar.E();
        synchronized (this) {
            if (Z(l0Var) < 0) {
                l0Var.f1436b = rVar;
            } else {
                Result.Companion companion = Result.Companion;
                rVar.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            }
            unit = Unit.INSTANCE;
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : unit;
    }

    public final void D(a aVar) {
        Object f2;
        synchronized (this) {
            if (aVar.f1353k < P()) {
                return;
            }
            Object[] objArr = this.f1347q;
            Intrinsics.checkNotNull(objArr);
            f2 = k0.f(objArr, aVar.f1353k);
            if (f2 != aVar) {
                return;
            }
            k0.h(objArr, aVar.f1353k, k0.f1365a);
            E();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void E() {
        Object f2;
        if (this.f1345o != 0 || this.f1351u > 1) {
            Object[] objArr = this.f1347q;
            Intrinsics.checkNotNull(objArr);
            while (this.f1351u > 0) {
                f2 = k0.f(objArr, (P() + V()) - 1);
                if (f2 != k0.f1365a) {
                    return;
                }
                this.f1351u--;
                k0.h(objArr, P() + V(), null);
            }
        }
    }

    public final void G(long j2) {
        p.d[] f2;
        if (p.b.e(this) != 0 && (f2 = p.b.f(this)) != null) {
            for (p.d dVar : f2) {
                if (dVar != null) {
                    l0 l0Var = (l0) dVar;
                    long j3 = l0Var.f1435a;
                    if (j3 >= 0 && j3 < j2) {
                        l0Var.f1435a = j2;
                    }
                }
            }
        }
        this.f1349s = j2;
    }

    @Override // p.b
    @NotNull
    /* renamed from: H */
    public l0 j() {
        return new l0();
    }

    @Override // p.b
    @NotNull
    /* renamed from: I */
    public l0[] k(int i2) {
        return new l0[i2];
    }

    public final void J() {
        Object[] objArr = this.f1347q;
        Intrinsics.checkNotNull(objArr);
        k0.h(objArr, P(), null);
        this.f1350t--;
        long P = P() + 1;
        if (this.f1348r < P) {
            this.f1348r = P;
        }
        if (this.f1349s < P) {
            G(P);
        }
    }

    public final Object L(T t2, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        a aVar;
        Continuation<Unit>[] continuationArr;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        j.r rVar = new j.r(intercepted, 1);
        rVar.E();
        Continuation<Unit>[] continuationArr2 = p.c.f1866a;
        synchronized (this) {
            if (X(t2)) {
                Result.Companion companion = Result.Companion;
                rVar.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
                continuationArr = N(continuationArr2);
                aVar = null;
            } else {
                aVar = new a(this, V() + P(), t2, rVar);
                M(aVar);
                this.f1351u++;
                continuationArr = continuationArr2;
                if (this.f1345o == 0) {
                    continuationArr = N(continuationArr2);
                }
            }
        }
        if (aVar != null) {
            j.t.a(rVar, aVar);
        }
        for (Continuation<Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            }
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : Unit.INSTANCE;
    }

    public final void M(Object obj) {
        Object[] objArr;
        int V = V();
        Object[] objArr2 = this.f1347q;
        if (objArr2 == null) {
            objArr = W(null, 0, 2);
        } else {
            objArr = objArr2;
            if (V >= objArr2.length) {
                objArr = W(objArr2, V, objArr2.length * 2);
            }
        }
        k0.h(objArr, P() + V, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object[]] */
    public final Continuation<Unit>[] N(Continuation<Unit>[] continuationArr) {
        int length = continuationArr.length;
        Continuation<Unit>[] continuationArr2 = continuationArr;
        if (p.b.e(this) != 0) {
            p.d[] f2 = p.b.f(this);
            continuationArr2 = continuationArr;
            if (f2 != null) {
                int i2 = 0;
                int length2 = f2.length;
                while (true) {
                    continuationArr2 = continuationArr;
                    if (i2 >= length2) {
                        break;
                    }
                    p.d dVar = f2[i2];
                    int i3 = length;
                    Continuation<Unit>[] continuationArr3 = continuationArr;
                    if (dVar != null) {
                        l0 l0Var = (l0) dVar;
                        Continuation<? super Unit> continuation = l0Var.f1436b;
                        if (continuation == null) {
                            i3 = length;
                            continuationArr3 = continuationArr;
                        } else {
                            i3 = length;
                            continuationArr3 = continuationArr;
                            if (Z(l0Var) >= 0) {
                                continuationArr3 = continuationArr;
                                if (length >= continuationArr.length) {
                                    continuationArr3 = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                                    Intrinsics.checkNotNullExpressionValue(continuationArr3, "copyOf(this, newSize)");
                                }
                                continuationArr3[length] = continuation;
                                l0Var.f1436b = null;
                                i3 = length + 1;
                            }
                        }
                    }
                    i2++;
                    length = i3;
                    continuationArr = continuationArr3;
                }
            }
        }
        return continuationArr2;
    }

    public final long O() {
        return P() + this.f1350t;
    }

    public final T Q() {
        Object f2;
        Object[] objArr = this.f1347q;
        Intrinsics.checkNotNull(objArr);
        f2 = k0.f(objArr, (this.f1348r + U()) - 1);
        return (T) f2;
    }

    public final Object S(long j2) {
        Object f2;
        Object[] objArr = this.f1347q;
        Intrinsics.checkNotNull(objArr);
        f2 = k0.f(objArr, j2);
        Object obj = f2;
        if (f2 instanceof a) {
            obj = ((a) f2).f1354l;
        }
        return obj;
    }

    public final long T() {
        return P() + this.f1350t + this.f1351u;
    }

    public final int U() {
        return (int) ((P() + this.f1350t) - this.f1348r);
    }

    public final int V() {
        return this.f1350t + this.f1351u;
    }

    public final Object[] W(Object[] objArr, int i2, int i3) {
        Object f2;
        if (i3 > 0) {
            Object[] objArr2 = new Object[i3];
            this.f1347q = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long P = P();
            for (int i4 = 0; i4 < i2; i4++) {
                long j2 = i4 + P;
                f2 = k0.f(objArr, j2);
                k0.h(objArr2, j2, f2);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean X(T t2) {
        if (n() == 0) {
            return Y(t2);
        }
        if (this.f1350t >= this.f1345o && this.f1349s <= this.f1348r) {
            int i2 = b.f1356a[this.f1346p.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
        }
        M(t2);
        int i3 = this.f1350t + 1;
        this.f1350t = i3;
        if (i3 > this.f1345o) {
            J();
        }
        if (U() > this.f1344n) {
            b0(this.f1348r + 1, this.f1349s, O(), T());
            return true;
        }
        return true;
    }

    public final boolean Y(T t2) {
        if (this.f1344n == 0) {
            return true;
        }
        M(t2);
        int i2 = this.f1350t + 1;
        this.f1350t = i2;
        if (i2 > this.f1344n) {
            J();
        }
        this.f1349s = P() + this.f1350t;
        return true;
    }

    public final long Z(l0 l0Var) {
        long j2 = l0Var.f1435a;
        if (j2 < O()) {
            return j2;
        }
        if (this.f1345o <= 0 && j2 <= P() && this.f1351u != 0) {
            return j2;
        }
        return -1L;
    }

    @Override // o.i0
    @NotNull
    public List<T> a() {
        Object f2;
        List<T> emptyList;
        synchronized (this) {
            int U = U();
            if (U == 0) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(U);
            Object[] objArr = this.f1347q;
            Intrinsics.checkNotNull(objArr);
            for (int i2 = 0; i2 < U; i2++) {
                f2 = k0.f(objArr, this.f1348r + i2);
                arrayList.add(f2);
            }
            return arrayList;
        }
    }

    public final Object a0(l0 l0Var) {
        q.r0 r0Var;
        Continuation<Unit>[] continuationArr = p.c.f1866a;
        synchronized (this) {
            long Z = Z(l0Var);
            if (Z < 0) {
                r0Var = k0.f1365a;
            } else {
                long j2 = l0Var.f1435a;
                Object S = S(Z);
                l0Var.f1435a = Z + 1;
                continuationArr = c0(j2);
                r0Var = S;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            }
        }
        return r0Var;
    }

    @Override // p.r
    @NotNull
    public i<T> b(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return k0.e(this, coroutineContext, i2, mVar);
    }

    public final void b0(long j2, long j3, long j4, long j5) {
        long min = Math.min(j3, j2);
        long P = P();
        while (true) {
            long j6 = P;
            if (j6 >= min) {
                this.f1348r = j2;
                this.f1349s = j3;
                this.f1350t = (int) (j4 - min);
                this.f1351u = (int) (j5 - j4);
                return;
            }
            Object[] objArr = this.f1347q;
            Intrinsics.checkNotNull(objArr);
            k0.h(objArr, j6, null);
            P = j6 + 1;
        }
    }

    @NotNull
    public final Continuation<Unit>[] c0(long j2) {
        long j3;
        long j4;
        long j5;
        Object f2;
        Object f3;
        if (j2 > this.f1349s) {
            return p.c.f1866a;
        }
        long P = P();
        long j6 = this.f1350t + P;
        long j7 = j6;
        if (this.f1345o == 0) {
            j7 = j6;
            if (this.f1351u > 0) {
                j7 = j6 + 1;
            }
        }
        long j8 = j7;
        if (p.b.e(this) != 0) {
            p.d[] f4 = p.b.f(this);
            j8 = j7;
            if (f4 != null) {
                int length = f4.length;
                int i2 = 0;
                while (true) {
                    j8 = j7;
                    if (i2 >= length) {
                        break;
                    }
                    p.d dVar = f4[i2];
                    long j9 = j7;
                    if (dVar != null) {
                        long j10 = ((l0) dVar).f1435a;
                        j9 = j7;
                        if (j10 >= 0) {
                            j9 = j7;
                            if (j10 < j7) {
                                j9 = j10;
                            }
                        }
                    }
                    i2++;
                    j7 = j9;
                }
            }
        }
        if (j8 <= this.f1349s) {
            return p.c.f1866a;
        }
        long O = O();
        int min = n() > 0 ? Math.min(this.f1351u, this.f1345o - ((int) (O - j8))) : this.f1351u;
        Continuation<Unit>[] continuationArr = p.c.f1866a;
        long j11 = this.f1351u + O;
        if (min > 0) {
            continuationArr = new Continuation[min];
            Object[] objArr = this.f1347q;
            Intrinsics.checkNotNull(objArr);
            int i3 = 0;
            long j12 = O;
            for (long j13 = O; j13 < j11; j13++) {
                f3 = k0.f(objArr, j13);
                q.r0 r0Var = k0.f1365a;
                if (f3 != r0Var) {
                    if (f3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    }
                    a aVar = (a) f3;
                    int i4 = i3 + 1;
                    continuationArr[i3] = aVar.f1355m;
                    k0.h(objArr, j13, r0Var);
                    k0.h(objArr, j12, aVar.f1354l);
                    long j14 = j12 + 1;
                    j12 = j14;
                    if (i4 >= min) {
                        break;
                    }
                    i3 = i4;
                    j12 = j14;
                }
            }
            j3 = j11;
            j4 = j8;
            j5 = j12;
        } else {
            j3 = j11;
            j4 = j8;
            j5 = O;
        }
        int i5 = (int) (j5 - P);
        if (n() == 0) {
            j4 = j5;
        }
        long max = Math.max(this.f1348r, j5 - Math.min(this.f1344n, i5));
        long j15 = max;
        long j16 = j5;
        if (this.f1345o == 0) {
            j15 = max;
            j16 = j5;
            if (max < j3) {
                Object[] objArr2 = this.f1347q;
                Intrinsics.checkNotNull(objArr2);
                j15 = max;
                j16 = j5;
                f2 = k0.f(objArr2, max);
                if (Intrinsics.areEqual(f2, k0.f1365a)) {
                    j16 = j5 + 1;
                    j15 = max + 1;
                }
            }
        }
        b0(j15, j4, j16, j3);
        E();
        Continuation<Unit>[] continuationArr2 = continuationArr;
        if (!(continuationArr.length == 0)) {
            continuationArr2 = N(continuationArr);
        }
        return continuationArr2;
    }

    @Override // o.i0, o.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<?> continuation) {
        return F(this, jVar, continuation);
    }

    @Override // o.d0
    public void d() {
        synchronized (this) {
            b0(O(), this.f1349s, O(), T());
            Unit unit = Unit.INSTANCE;
        }
    }

    public final long d0() {
        long j2 = this.f1348r;
        if (j2 < this.f1349s) {
            this.f1349s = j2;
        }
        return j2;
    }

    @Override // o.d0, o.j
    @Nullable
    public Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
        return K(this, t2, continuation);
    }

    @Override // o.d0
    public boolean g(T t2) {
        int i2;
        boolean z;
        Continuation<Unit>[] continuationArr;
        Continuation<Unit>[] continuationArr2 = p.c.f1866a;
        synchronized (this) {
            if (X(t2)) {
                continuationArr = N(continuationArr2);
                z = true;
            } else {
                z = false;
                continuationArr = continuationArr2;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }
}
