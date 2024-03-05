package o;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��8\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fø\u0001��¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u0096@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001��¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028��0\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lo/y0;", "T", "Lo/i0;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "Lo/i0;", "sharedFlow", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "k", "Lkotlin/jvm/functions/Function2;", "action", "", "a", "()Ljava/util/List;", "replayCache", "<init>", "(Lo/i0;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/y0.class */
public final class y0<T> implements i0<T> {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final i0<T> f1829j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final Function2<j<? super T>, Continuation<? super Unit>, Object> f1830k;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/y0$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f1831j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ y0<T> f1832k;

        /* renamed from: l  reason: collision with root package name */
        public int f1833l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0<T> y0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f1832k = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1831j = obj;
            this.f1833l |= Integer.MIN_VALUE;
            return this.f1832k.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@NotNull i0<? extends T> i0Var, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f1829j = i0Var;
        this.f1830k = function2;
    }

    @Override // o.i0
    @NotNull
    public List<T> a() {
        return this.f1829j.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    @Override // o.i0, o.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof o.y0.a
            if (r0 == 0) goto L28
            r0 = r7
            o.y0$a r0 = (o.y0.a) r0
            r8 = r0
            r0 = r8
            int r0 = r0.f1833l
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r8
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1833l = r1
            r0 = r8
            r7 = r0
            goto L32
        L28:
            o.y0$a r0 = new o.y0$a
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L32:
            r0 = r7
            java.lang.Object r0 = r0.f1831j
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r7
            int r0 = r0.f1833l
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L5f
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L57
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L57:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8b
        L5f:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            o.i0<T> r0 = r0.f1829j
            r10 = r0
            o.x0 r0 = new o.x0
            r1 = r0
            r2 = r6
            r3 = r5
            kotlin.jvm.functions.Function2<o.j<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r3.f1830k
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r7
            r1 = 1
            r0.f1833l = r1
            r0 = r10
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r8
            if (r0 != r1) goto L8b
            r0 = r8
            return r0
        L8b:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y0.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
