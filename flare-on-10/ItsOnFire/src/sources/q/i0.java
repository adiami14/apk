package q;

import androidx.appcompat.R;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"��(\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b��\u0010��*\u0018\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028��`\u00032\u0006\u0010\u0004\u001a\u00028��2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H��¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b��\u0010��*\u0018\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028��`\u00032\u0006\u0010\u0004\u001a\u00028��2\u0006\u0010\n\u001a\u00020\tH��¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b��\u0010��*\u0018\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028��`\u00032\u0006\u0010\u0004\u001a\u00028��2\u0006\u0010\n\u001a\u00020\tH��¢\u0006\u0004\b\u000e\u0010\u000f**\b��\u0010\u0010\u001a\u0004\b��\u0010��\"\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {"E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lq/d1;", "undeliveredElementException", "c", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lq/d1;)Lq/d1;", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "", "a", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/i0.class */
public final class i0 {

    @Metadata(d1 = {"��\u0010\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n��\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "<anonymous parameter 0>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:q/i0$a.class */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function1<E, Unit> f2061j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ E f2062k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f2063l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super E, Unit> function1, E e2, CoroutineContext coroutineContext) {
            super(1);
            this.f2061j = function1;
            this.f2062k = e2;
            this.f2063l = coroutineContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            i0.b(this.f2061j, this.f2062k, this.f2063l);
        }
    }

    @NotNull
    public static final <E> Function1<Throwable, Unit> a(@NotNull Function1<? super E, Unit> function1, E e2, @NotNull CoroutineContext coroutineContext) {
        return new a(function1, e2, coroutineContext);
    }

    public static final <E> void b(@NotNull Function1<? super E, Unit> function1, E e2, @NotNull CoroutineContext coroutineContext) {
        d1 c2 = c(function1, e2, null);
        if (c2 != null) {
            j.r0.b(coroutineContext, c2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E> d1 c(@NotNull Function1<? super E, Unit> function1, E e2, @Nullable d1 d1Var) {
        try {
            function1.invoke(e2);
        } catch (Throwable th) {
            if (d1Var == null || d1Var.getCause() == th) {
                return new d1("Exception in undelivered element handler for " + e2, th);
            }
            ExceptionsKt__ExceptionsKt.addSuppressed(d1Var, th);
        }
        return d1Var;
    }

    public static /* synthetic */ d1 d(Function1 function1, Object obj, d1 d1Var, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            d1Var = null;
        }
        return c(function1, obj, d1Var);
    }
}
