package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.Typography;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018��2\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lo/s0;", "Lo/o0;", "Lo/t0;", "", "subscriptionCount", "Lo/i;", "Lo/m0;", "a", "", "toString", "", "other", "", "equals", "hashCode", "", "b", "J", "stopTimeout", "c", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/s0.class */
public final class s0 implements o0 {

    /* renamed from: b  reason: collision with root package name */
    public final long f1544b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1545c;

    @Metadata(bv = {}, d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u0002\n��\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010��2\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lo/j;", "Lo/m0;", "", "count", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, Typography.paragraph, Typography.middleDot, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: ItsOnFire.jar:o/s0$a.class */
    public static final class a extends SuspendLambda implements Function3<j<? super m0>, Integer, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1546j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1547k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ int f1548l;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Nullable
        public final Object i(@NotNull j<? super m0> jVar, int i2, @Nullable Continuation<? super Unit> continuation) {
            a aVar = new a(continuation);
            aVar.f1547k = jVar;
            aVar.f1548l = i2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(j<? super m0> jVar, Integer num, Continuation<? super Unit> continuation) {
            return i(jVar, num.intValue(), continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                Method dump skipped, instructions count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\f\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020��H\u008a@"}, d2 = {"Lo/m0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/s0$b.class */
    public static final class b extends SuspendLambda implements Function2<m0, Continuation<? super Boolean>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1550j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1551k;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f1551k = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull m0 m0Var, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(m0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1550j == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((m0) this.f1551k) != m0.START);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public s0(long j2, long j3) {
        this.f1544b = j2;
        this.f1545c = j3;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j2 + " ms) cannot be negative").toString());
        }
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j3 + " ms) cannot be negative").toString());
    }

    @Override // o.o0
    @NotNull
    public i<m0> a(@NotNull t0<Integer> t0Var) {
        return k.g0(k.k0(k.b2(t0Var, new a(null)), new b(null)));
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f1544b == s0Var.f1544b && this.f1545c == s0Var.f1545c) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f1544b) * 31) + Long.hashCode(this.f1545c);
    }

    @NotNull
    public String toString() {
        List createListBuilder;
        List build;
        String joinToString$default;
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(2);
        if (this.f1544b > 0) {
            createListBuilder.add("stopTimeout=" + this.f1544b + "ms");
        }
        if (this.f1545c < Long.MAX_VALUE) {
            createListBuilder.add("replayExpiration=" + this.f1545c + "ms");
        }
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default);
        sb.append(')');
        return sb.toString();
    }
}
