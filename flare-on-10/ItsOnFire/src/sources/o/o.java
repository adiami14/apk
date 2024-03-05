package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��(\n��\n\u0002\u0018\u0002\n\u0002\u0010!\n��\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028��0\u0004\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0086@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0007H\u0086@ø\u0001��¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b��\u0010��\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b��\u0012\u00028��0\u000b*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@ø\u0001��¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lo/i;", "", FirebaseAnalytics.Param.DESTINATION, "", "b", "(Lo/i;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lo/i;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "C", "a", "(Lo/i;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/o.class */
public final /* synthetic */ class o {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {FirebaseAnalytics.Param.DESTINATION}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/o$a.class */
    public static final class a<T, C extends Collection<? super T>> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1462j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1463k;

        /* renamed from: l  reason: collision with root package name */
        public int f1464l;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1463k = obj;
            this.f1464l |= Integer.MIN_VALUE;
            return k.V1(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    @Metadata(d1 = {"��\u0012\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b��\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "C", "", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/o$b.class */
    public static final class b<T> implements j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Collection f1465j;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public b(Collection collection) {
            this.f1465j = collection;
        }

        @Override // o.j
        @Nullable
        public final Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
            this.f1465j.add(t2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Collection] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@org.jetbrains.annotations.NotNull o.i<? extends T> r4, @org.jetbrains.annotations.NotNull C r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super C> r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof o.o.a
            if (r0 == 0) goto L28
            r0 = r6
            o.o$a r0 = (o.o.a) r0
            r7 = r0
            r0 = r7
            int r0 = r0.f1464l
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r7
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1464l = r1
            r0 = r7
            r6 = r0
            goto L31
        L28:
            o.o$a r0 = new o.o$a
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
        L31:
            r0 = r6
            java.lang.Object r0 = r0.f1463k
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r7 = r0
            r0 = r6
            int r0 = r0.f1464l
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L66
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5c
            r0 = r6
            java.lang.Object r0 = r0.f1462j
            java.util.Collection r0 = (java.util.Collection) r0
            r5 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8e
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            o.o$b r0 = new o.o$b
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r9 = r0
            r0 = r6
            r1 = r5
            r0.f1462j = r1
            r0 = r6
            r1 = 1
            r0.f1464l = r1
            r0 = r4
            r1 = r9
            r2 = r6
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r7
            if (r0 != r1) goto L8e
            r0 = r7
            return r0
        L8e:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o.a(o.i, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final <T> Object b(@NotNull i<? extends T> iVar, @NotNull List<T> list, @NotNull Continuation<? super List<? extends T>> continuation) {
        return k.V1(iVar, list, continuation);
    }

    public static /* synthetic */ Object c(i iVar, List list, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = new ArrayList();
        }
        return k.W1(iVar, list, continuation);
    }

    @Nullable
    public static final <T> Object d(@NotNull i<? extends T> iVar, @NotNull Set<T> set, @NotNull Continuation<? super Set<? extends T>> continuation) {
        return k.V1(iVar, set, continuation);
    }

    public static /* synthetic */ Object e(i iVar, Set set, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return k.Y1(iVar, set, continuation);
    }
}
