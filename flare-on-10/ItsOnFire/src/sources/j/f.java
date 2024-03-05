package j;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��*\n��\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028��0\u0004\"\u0004\b��\u0010��2\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028��0\u00020\u0001\"\b\u0012\u0004\u0012\u00028��0\u0002H\u0086@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028��0\u0004\"\u0004\b��\u0010��*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00020\u0007H\u0086@ø\u0001��¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH\u0086@ø\u0001��¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@ø\u0001��¢\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "", "Lj/c1;", "deferreds", "", "b", "([Lj/c1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj/n2;", "jobs", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "([Lj/n2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/f.class */
public final class f {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {R.styleable.AppCompatTheme_colorControlHighlight}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:j/f$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f471j;

        /* renamed from: k  reason: collision with root package name */
        public int f472k;

        /* renamed from: l  reason: collision with root package name */
        public int f473l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f474m;

        /* renamed from: n  reason: collision with root package name */
        public int f475n;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f474m = obj;
            this.f475n |= Integer.MIN_VALUE;
            return f.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "joinAll", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:j/f$b.class */
    public static final class b extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f476j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f477k;

        /* renamed from: l  reason: collision with root package name */
        public int f478l;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f477k = obj;
            this.f478l |= Integer.MIN_VALUE;
            return f.c(null, this);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Collection<? extends c1<? extends T>> collection, @NotNull Continuation<? super List<? extends T>> continuation) {
        List emptyList;
        if (collection.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        Object[] array = collection.toArray(new c1[0]);
        if (array != null) {
            return new e((c1[]) array).b(continuation);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Nullable
    public static final <T> Object b(@NotNull c1<? extends T>[] c1VarArr, @NotNull Continuation<? super List<? extends T>> continuation) {
        List emptyList;
        if (c1VarArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new e(c1VarArr).b(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull java.util.Collection<? extends j.n2> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r0 = r5
            boolean r0 = r0 instanceof j.f.b
            if (r0 == 0) goto L25
            r0 = r5
            j.f$b r0 = (j.f.b) r0
            r6 = r0
            r0 = r6
            int r0 = r0.f478l
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r6
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f478l = r1
            r0 = r6
            r5 = r0
            goto L2e
        L25:
            j.f$b r0 = new j.f$b
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
        L2e:
            r0 = r5
            java.lang.Object r0 = r0.f477k
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r6 = r0
            r0 = r5
            int r0 = r0.f478l
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L60
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L56
            r0 = r5
            java.lang.Object r0 = r0.f476j
            java.util.Iterator r0 = (java.util.Iterator) r0
            r4 = r0
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L6c
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        L6c:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L98
            r0 = r4
            java.lang.Object r0 = r0.next()
            j.n2 r0 = (j.n2) r0
            r8 = r0
            r0 = r5
            r1 = r4
            r0.f476j = r1
            r0 = r5
            r1 = 1
            r0.f478l = r1
            r0 = r8
            r1 = r5
            java.lang.Object r0 = r0.n(r1)
            r1 = r6
            if (r0 != r1) goto L6c
            r0 = r6
            return r0
        L98:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.c(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a7 -> B:22:0x00ad). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@org.jetbrains.annotations.NotNull j.n2[] r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.d(j.n2[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
