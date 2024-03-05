package o;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"�� \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u0096@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lo/d;", "T", "Lo/c;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo/i;", "j", "Lo/i;", "flow", "<init>", "(Lo/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/d.class */
public final class d<T> implements c<T> {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final i<T> f1320j;

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/d$a.class */
    public static final class a<T> implements j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ j<T> f1321j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        /* renamed from: o.d$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:o/d$a$a.class */
        public static final class C0068a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1322j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ a<T> f1323k;

            /* renamed from: l  reason: collision with root package name */
            public int f1324l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0068a(a<? super T> aVar, Continuation<? super C0068a> continuation) {
                super(continuation);
                this.f1323k = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1322j = obj;
                this.f1324l |= Integer.MIN_VALUE;
                return this.f1323k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(j<? super T> jVar) {
            this.f1321j = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.d.a.C0068a
                if (r0 == 0) goto L28
                r0 = r7
                o.d$a$a r0 = (o.d.a.C0068a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1324l
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1324l = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.d$a$a r0 = new o.d$a$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1322j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r7
                int r0 = r0.f1324l
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L5f
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L55
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L87
            L55:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L5f:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r7
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                j.r2.A(r0)
                r0 = r5
                o.j<T> r0 = r0.f1321j
                r10 = r0
                r0 = r7
                r1 = 1
                r0.f1324l = r1
                r0 = r10
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r8
                if (r0 != r1) goto L87
                r0 = r8
                return r0
            L87:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull i<? extends T> iVar) {
        this.f1320j = iVar;
    }

    @Override // o.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = this.f1320j.collect(new a(jVar), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }
}
