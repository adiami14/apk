package o;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��(\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0006\b��\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002BG\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fø\u0001��¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028��H\u0096Aø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001��¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001��¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lo/x0;", "T", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "Lo/j;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "k", "Lkotlin/jvm/functions/Function2;", "action", "<init>", "(Lo/j;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/x0.class */
public final class x0<T> implements j<T> {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final j<T> f1754j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final Function2<j<? super T>, Continuation<? super Unit>, Object> f1755k;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    /* loaded from: ItsOnFire.jar:o/x0$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1756j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1757k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f1758l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ x0<T> f1759m;

        /* renamed from: n  reason: collision with root package name */
        public int f1760n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0<T> x0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f1759m = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1758l = obj;
            this.f1760n |= Integer.MIN_VALUE;
            return this.f1759m.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@NotNull j<? super T> jVar, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f1754j = jVar;
        this.f1755k = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // o.j
    @Nullable
    public Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
        return this.f1754j.emit(t2, continuation);
    }
}
