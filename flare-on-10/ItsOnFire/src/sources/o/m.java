package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.d2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��2\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0086@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001��¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028��0\u000b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0002\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028��0\u000b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0002\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028��0\u000b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u000eH\u0007\u001a&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Lo/j;", "Ll/i0;", "channel", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lo/j;Ll/i0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consume", "e", "(Lo/j;Ll/i0;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo/i;", "g", "c", "Ll/i;", "b", "Lj/u0;", "scope", "f", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/m.class */
public final /* synthetic */ class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/m$a.class */
    public static final class a<T> implements i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ l.i f1437j;

        public a(l.i iVar) {
            this.f1437j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object l0 = k.l0(jVar, this.f1437j.J(), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return l0 == coroutine_suspended ? l0 : Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {R.styleable.AppCompatTheme_colorBackgroundFloating, 62}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    /* loaded from: ItsOnFire.jar:o/m$b.class */
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1438j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1439k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1440l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f1441m;

        /* renamed from: n  reason: collision with root package name */
        public int f1442n;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1441m = obj;
            this.f1442n |= Integer.MIN_VALUE;
            return m.e(null, null, false, this);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @NotNull
    public static final <T> i<T> b(@NotNull l.i<T> iVar) {
        return new a(iVar);
    }

    @NotNull
    public static final <T> i<T> c(@NotNull l.i0<? extends T> i0Var) {
        return new e(i0Var, true, null, 0, null, 28, null);
    }

    @Nullable
    public static final <T> Object d(@NotNull j<? super T> jVar, @NotNull l.i0<? extends T> i0Var, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object e2 = e(jVar, i0Var, true, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return e2 == coroutine_suspended ? e2 : Unit.INSTANCE;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.i0] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0189 -> B:17:0x007e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(o.j<? super T> r4, l.i0<? extends T> r5, boolean r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.e(o.j, l.i0, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @d2
    @NotNull
    public static final <T> l.i0<T> f(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var) {
        return p.f.b(iVar).n(u0Var);
    }

    @NotNull
    public static final <T> i<T> g(@NotNull l.i0<? extends T> i0Var) {
        return new e(i0Var, false, null, 0, null, 28, null);
    }
}
