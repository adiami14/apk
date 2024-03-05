package o;

import androidx.appcompat.R;
import j.d2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@d2
@Metadata(bv = {}, d1 = {"��\u001c\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0006\b'\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u00022\b\u0012\u0004\u0012\u00028��0\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028��0\u0004H\u0086@ø\u0001��¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028��0\u0004H¦@ø\u0001��¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lo/a;", "T", "Lo/i;", "Lo/c;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/a.class */
public abstract class a<T> implements i<T>, c<T> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    /* renamed from: o.a$a  reason: collision with other inner class name */
    /* loaded from: ItsOnFire.jar:o/a$a.class */
    public static final class C0061a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1086j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1087k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ a<T> f1088l;

        /* renamed from: m  reason: collision with root package name */
        public int f1089m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0061a(a<T> aVar, Continuation<? super C0061a> continuation) {
            super(continuation);
            this.f1088l = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1087k = obj;
            this.f1089m |= Integer.MIN_VALUE;
            return this.f1088l.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    @Override // o.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof o.a.C0061a
            if (r0 == 0) goto L28
            r0 = r7
            o.a$a r0 = (o.a.C0061a) r0
            r8 = r0
            r0 = r8
            int r0 = r0.f1089m
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r8
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1089m = r1
            r0 = r8
            r7 = r0
            goto L32
        L28:
            o.a$a r0 = new o.a$a
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L32:
            r0 = r7
            java.lang.Object r0 = r0.f1087k
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r7
            int r0 = r0.f1089m
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6b
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L61
            r0 = r7
            java.lang.Object r0 = r0.f1086j
            p.v r0 = (p.v) r0
            r6 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5d
            goto L97
        L5d:
            r7 = move-exception
            goto La0
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            p.v r0 = new p.v
            r1 = r0
            r2 = r6
            r3 = r7
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r7
            r1 = r6
            r0.f1086j = r1     // Catch: java.lang.Throwable -> L9f
            r0 = r7
            r1 = 1
            r0.f1089m = r1     // Catch: java.lang.Throwable -> L9f
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.e(r1, r2)     // Catch: java.lang.Throwable -> L9f
            r7 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L97
            r0 = r8
            return r0
        L97:
            r0 = r6
            r0.releaseIntercepted()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9f:
            r7 = move-exception
        La0:
            r0 = r6
            r0.releaseIntercepted()
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public abstract Object e(@NotNull j<? super T> jVar, @NotNull Continuation<? super Unit> continuation);
}
