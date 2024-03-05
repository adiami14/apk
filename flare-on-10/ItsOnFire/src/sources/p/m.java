package p;

import androidx.appcompat.R;
import j.c0;
import j.t2;
import j.u0;
import j.v0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import l.e0;
import l.g0;
import l.i0;
import l.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.w0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T1
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"��8\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001��¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b��\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010��2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH��ø\u0001��¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", "T", "Lo/j;", "", "Lo/i;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "a", "(Lo/j;[Lo/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Lo/i;Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:p/m.class */
public final class m {

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {R.styleable.AppCompatTheme_colorPrimary, R.styleable.AppCompatTheme_listPreferredItemHeight, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    /* loaded from: ItsOnFire.jar:p/m$a.class */
    public static final class a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public Object f1919j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1920k;

        /* renamed from: l  reason: collision with root package name */
        public int f1921l;

        /* renamed from: m  reason: collision with root package name */
        public int f1922m;

        /* renamed from: n  reason: collision with root package name */
        public int f1923n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f1924o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ o.i<T>[] f1925p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ Function0<T[]> f1926q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1927r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ o.j<R> f1928s;

        @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: p.m$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:p/m$a$a.class */
        public static final class C0089a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f1929j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.i<T>[] f1930k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ int f1931l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f1932m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ l.n<IndexedValue<Object>> f1933n;

            @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: p.m$a$a$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:p/m$a$a$a.class */
            public static final class C0090a<T> implements o.j {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ l.n<IndexedValue<Object>> f1934j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ int f1935k;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {35, 36}, m = "emit", n = {}, s = {})
                /* renamed from: p.m$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: ItsOnFire.jar:p/m$a$a$a$a.class */
                public static final class C0091a extends ContinuationImpl {

                    /* renamed from: j  reason: collision with root package name */
                    public /* synthetic */ Object f1936j;

                    /* renamed from: k  reason: collision with root package name */
                    public final /* synthetic */ C0090a<T> f1937k;

                    /* renamed from: l  reason: collision with root package name */
                    public int f1938l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0091a(C0090a<? super T> c0090a, Continuation<? super C0091a> continuation) {
                        super(continuation);
                        this.f1937k = c0090a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1936j = obj;
                        this.f1938l |= Integer.MIN_VALUE;
                        return this.f1937k.emit(null, this);
                    }
                }

                public C0090a(l.n<IndexedValue<Object>> nVar, int i2) {
                    this.f1934j = nVar;
                    this.f1935k = i2;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
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
                        boolean r0 = r0 instanceof p.m.a.C0089a.C0090a.C0091a
                        if (r0 == 0) goto L28
                        r0 = r7
                        p.m$a$a$a$a r0 = (p.m.a.C0089a.C0090a.C0091a) r0
                        r8 = r0
                        r0 = r8
                        int r0 = r0.f1938l
                        r9 = r0
                        r0 = r9
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L28
                        r0 = r8
                        r1 = r9
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.f1938l = r1
                        r0 = r8
                        r7 = r0
                        goto L32
                    L28:
                        p.m$a$a$a$a r0 = new p.m$a$a$a$a
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L32:
                        r0 = r7
                        java.lang.Object r0 = r0.f1936j
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r8 = r0
                        r0 = r7
                        int r0 = r0.f1938l
                        r9 = r0
                        r0 = r9
                        if (r0 == 0) goto L6d
                        r0 = r9
                        r1 = 1
                        if (r0 == r1) goto L65
                        r0 = r9
                        r1 = 2
                        if (r0 != r1) goto L5b
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto La8
                    L5b:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L65:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L99
                    L6d:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r5
                        l.n<kotlin.collections.IndexedValue<java.lang.Object>> r0 = r0.f1934j
                        r10 = r0
                        kotlin.collections.IndexedValue r0 = new kotlin.collections.IndexedValue
                        r1 = r0
                        r2 = r5
                        int r2 = r2.f1935k
                        r3 = r6
                        r1.<init>(r2, r3)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.f1938l = r1
                        r0 = r10
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.U(r1, r2)
                        r1 = r8
                        if (r0 != r1) goto L99
                        r0 = r8
                        return r0
                    L99:
                        r0 = r7
                        r1 = 2
                        r0.f1938l = r1
                        r0 = r7
                        java.lang.Object r0 = j.f4.a(r0)
                        r1 = r8
                        if (r0 != r1) goto La8
                        r0 = r8
                        return r0
                    La8:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.m.a.C0089a.C0090a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0089a(o.i<? extends T>[] iVarArr, int i2, AtomicInteger atomicInteger, l.n<IndexedValue<Object>> nVar, Continuation<? super C0089a> continuation) {
                super(2, continuation);
                this.f1930k = iVarArr;
                this.f1931l = i2;
                this.f1932m = atomicInteger;
                this.f1933n = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0089a(this.f1930k, this.f1931l, this.f1932m, this.f1933n, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C0089a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                AtomicInteger atomicInteger;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1929j;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        o.i[] iVarArr = this.f1930k;
                        int i3 = this.f1931l;
                        o.i iVar = iVarArr[i3];
                        C0090a c0090a = new C0090a(this.f1933n, i3);
                        this.f1929j = 1;
                        if (iVar.collect(c0090a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        m0.a.a(this.f1933n, null, 1, null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (this.f1932m.decrementAndGet() == 0) {
                        m0.a.a(this.f1933n, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o.i<? extends T>[] iVarArr, Function0<T[]> function0, Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, o.j<? super R> jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1925p = iVarArr;
            this.f1926q = function0;
            this.f1927r = function3;
            this.f1928s = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1925p, this.f1926q, this.f1927r, this.f1928s, continuation);
            aVar.f1924o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0178 A[LOOP:0: B:33:0x0178->B:39:0x01ca, LOOP_START, PHI: r17 r20 
          PHI: (r17v4 kotlin.collections.IndexedValue) = (r17v3 kotlin.collections.IndexedValue), (r17v8 kotlin.collections.IndexedValue) binds: [B:30:0x0171, B:39:0x01ca] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r20v2 int) = (r20v1 int), (r20v4 int) binds: [B:30:0x0171, B:39:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r0v10, types: [o.i<T>[]] */
        /* JADX WARN: Type inference failed for: r0v115, types: [int] */
        /* JADX WARN: Type inference failed for: r0v134, types: [int] */
        /* JADX WARN: Type inference failed for: r5v2, types: [o.i<T>[], o.i[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x026f -> B:24:0x0114). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 646
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:p/m$b.class */
    public static final class b<R> implements o.i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1939j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ o.i f1940k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function3 f1941l;

        public b(o.i iVar, o.i iVar2, Function3 function3) {
            this.f1939j = iVar;
            this.f1940k = iVar2;
            this.f1941l = function3;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object g2 = v0.g(new c(jVar, this.f1939j, this.f1940k, this.f1941l, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0005\u001a\u00020\u0004\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:p/m$c.class */
    public static final class c extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1942j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1943k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<R> f1944l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ o.i<T2> f1945m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ o.i<T1> f1946n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1947o;

        @Metadata(d1 = {"��\u0010\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n��\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:p/m$c$a.class */
        public static final class a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ c0 f1948j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.j<R> f1949k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c0 c0Var, o.j<? super R> jVar) {
                super(1);
                this.f1948j = c0Var;
                this.f1949k = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (this.f1948j.b()) {
                    this.f1948j.cancel(new p.a(this.f1949k));
                }
            }
        }

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:p/m$c$b.class */
        public static final class b extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f1950j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.i<T1> f1951k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ CoroutineContext f1952l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ Object f1953m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ i0<Object> f1954n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ o.j<R> f1955o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1956p;

            @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* loaded from: ItsOnFire.jar:p/m$c$b$a.class */
            public static final class a<T> implements o.j {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ CoroutineContext f1957j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ Object f1958k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ i0<Object> f1959l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ o.j<R> f1960m;

                /* renamed from: n  reason: collision with root package name */
                public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1961n;

                @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: p.m$c$b$a$a  reason: collision with other inner class name */
                /* loaded from: ItsOnFire.jar:p/m$c$b$a$a.class */
                public static final class C0092a extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

                    /* renamed from: j  reason: collision with root package name */
                    public Object f1962j;

                    /* renamed from: k  reason: collision with root package name */
                    public int f1963k;

                    /* renamed from: l  reason: collision with root package name */
                    public final /* synthetic */ i0<Object> f1964l;

                    /* renamed from: m  reason: collision with root package name */
                    public final /* synthetic */ o.j<R> f1965m;

                    /* renamed from: n  reason: collision with root package name */
                    public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1966n;

                    /* renamed from: o  reason: collision with root package name */
                    public final /* synthetic */ T1 f1967o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0092a(i0<? extends Object> i0Var, o.j<? super R> jVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, T1 t1, Continuation<? super C0092a> continuation) {
                        super(2, continuation);
                        this.f1964l = i0Var;
                        this.f1965m = jVar;
                        this.f1966n = function3;
                        this.f1967o = t1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0092a(this.f1964l, this.f1965m, this.f1966n, this.f1967o, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                        return invoke2(unit, continuation);
                    }

                    @Nullable
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final Object invoke2(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                        return ((C0092a) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                        /*
                            Method dump skipped, instructions count: 243
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.m.c.b.a.C0092a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {131}, m = "emit", n = {}, s = {})
                /* renamed from: p.m$c$b$a$b  reason: collision with other inner class name */
                /* loaded from: ItsOnFire.jar:p/m$c$b$a$b.class */
                public static final class C0093b extends ContinuationImpl {

                    /* renamed from: j  reason: collision with root package name */
                    public /* synthetic */ Object f1968j;

                    /* renamed from: k  reason: collision with root package name */
                    public final /* synthetic */ a<T> f1969k;

                    /* renamed from: l  reason: collision with root package name */
                    public int f1970l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0093b(a<? super T> aVar, Continuation<? super C0093b> continuation) {
                        super(continuation);
                        this.f1969k = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1968j = obj;
                        this.f1970l |= Integer.MIN_VALUE;
                        return this.f1969k.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a(CoroutineContext coroutineContext, Object obj, i0<? extends Object> i0Var, o.j<? super R> jVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
                    this.f1957j = coroutineContext;
                    this.f1958k = obj;
                    this.f1959l = i0Var;
                    this.f1960m = jVar;
                    this.f1961n = function3;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T1 r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
                    /*
                        r8 = this;
                        r0 = r10
                        boolean r0 = r0 instanceof p.m.c.b.a.C0093b
                        if (r0 == 0) goto L28
                        r0 = r10
                        p.m$c$b$a$b r0 = (p.m.c.b.a.C0093b) r0
                        r11 = r0
                        r0 = r11
                        int r0 = r0.f1970l
                        r12 = r0
                        r0 = r12
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L28
                        r0 = r11
                        r1 = r12
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.f1970l = r1
                        r0 = r11
                        r10 = r0
                        goto L32
                    L28:
                        p.m$c$b$a$b r0 = new p.m$c$b$a$b
                        r1 = r0
                        r2 = r8
                        r3 = r10
                        r1.<init>(r2, r3)
                        r10 = r0
                    L32:
                        r0 = r10
                        java.lang.Object r0 = r0.f1968j
                        r13 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r11 = r0
                        r0 = r10
                        int r0 = r0.f1970l
                        r12 = r0
                        r0 = r12
                        if (r0 == 0) goto L5f
                        r0 = r12
                        r1 = 1
                        if (r0 != r1) goto L55
                        r0 = r13
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto La1
                    L55:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5f:
                        r0 = r13
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r8
                        kotlin.coroutines.CoroutineContext r0 = r0.f1957j
                        r14 = r0
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        r15 = r0
                        r0 = r8
                        java.lang.Object r0 = r0.f1958k
                        r13 = r0
                        p.m$c$b$a$a r0 = new p.m$c$b$a$a
                        r1 = r0
                        r2 = r8
                        l.i0<java.lang.Object> r2 = r2.f1959l
                        r3 = r8
                        o.j<R> r3 = r3.f1960m
                        r4 = r8
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r4.f1961n
                        r5 = r9
                        r6 = 0
                        r1.<init>(r2, r3, r4, r5, r6)
                        r9 = r0
                        r0 = r10
                        r1 = 1
                        r0.f1970l = r1
                        r0 = r14
                        r1 = r15
                        r2 = r13
                        r3 = r9
                        r4 = r10
                        java.lang.Object r0 = p.f.c(r0, r1, r2, r3, r4)
                        r1 = r11
                        if (r0 != r1) goto La1
                        r0 = r11
                        return r0
                    La1:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.m.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(o.i<? extends T1> iVar, CoroutineContext coroutineContext, Object obj, i0<? extends Object> i0Var, o.j<? super R> jVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f1951k = iVar;
                this.f1952l = coroutineContext;
                this.f1953m = obj;
                this.f1954n = i0Var;
                this.f1955o = jVar;
                this.f1956p = function3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f1951k, this.f1952l, this.f1953m, this.f1954n, this.f1955o, this.f1956p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return invoke2(unit, continuation);
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1950j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.i<T1> iVar = this.f1951k;
                    a aVar = new a(this.f1952l, this.f1953m, this.f1954n, this.f1955o, this.f1956p);
                    this.f1950j = 1;
                    if (iVar.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"��\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\u0002\n��\u0010\u0006\u001a\u00020\u0005\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Ll/g0;", "", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: p.m$c$c  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:p/m$c$c.class */
        public static final class C0094c extends SuspendLambda implements Function2<g0<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f1971j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f1972k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ o.i<T2> f1973l;

            @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: p.m$c$c$a */
            /* loaded from: ItsOnFire.jar:p/m$c$c$a.class */
            public static final class a<T> implements o.j {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ g0<Object> f1974j;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "emit", n = {}, s = {})
                /* renamed from: p.m$c$c$a$a  reason: collision with other inner class name */
                /* loaded from: ItsOnFire.jar:p/m$c$c$a$a.class */
                public static final class C0095a extends ContinuationImpl {

                    /* renamed from: j  reason: collision with root package name */
                    public /* synthetic */ Object f1975j;

                    /* renamed from: k  reason: collision with root package name */
                    public final /* synthetic */ a<T> f1976k;

                    /* renamed from: l  reason: collision with root package name */
                    public int f1977l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0095a(a<? super T> aVar, Continuation<? super C0095a> continuation) {
                        super(continuation);
                        this.f1976k = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1975j = obj;
                        this.f1977l |= Integer.MIN_VALUE;
                        return this.f1976k.emit(null, this);
                    }
                }

                public a(g0<Object> g0Var) {
                    this.f1974j = g0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T2 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof p.m.c.C0094c.a.C0095a
                        if (r0 == 0) goto L28
                        r0 = r7
                        p.m$c$c$a$a r0 = (p.m.c.C0094c.a.C0095a) r0
                        r8 = r0
                        r0 = r8
                        int r0 = r0.f1977l
                        r9 = r0
                        r0 = r9
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L28
                        r0 = r8
                        r1 = r9
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.f1977l = r1
                        r0 = r8
                        r7 = r0
                        goto L32
                    L28:
                        p.m$c$c$a$a r0 = new p.m$c$c$a$a
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L32:
                        r0 = r7
                        java.lang.Object r0 = r0.f1975j
                        r8 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r10 = r0
                        r0 = r7
                        int r0 = r0.f1977l
                        r9 = r0
                        r0 = r9
                        if (r0 == 0) goto L5e
                        r0 = r9
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r8
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L8d
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r8
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r5
                        l.g0<java.lang.Object> r0 = r0.f1974j
                        l.m0 r0 = r0.c()
                        r11 = r0
                        r0 = r6
                        r8 = r0
                        r0 = r6
                        if (r0 != 0) goto L77
                        q.r0 r0 = p.u.f1988a
                        r8 = r0
                    L77:
                        r0 = r7
                        r1 = 1
                        r0.f1977l = r1
                        r0 = r11
                        r1 = r8
                        r2 = r7
                        java.lang.Object r0 = r0.U(r1, r2)
                        r1 = r10
                        if (r0 != r1) goto L8d
                        r0 = r10
                        return r0
                    L8d:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.m.c.C0094c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0094c(o.i<? extends T2> iVar, Continuation<? super C0094c> continuation) {
                super(2, continuation);
                this.f1973l = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0094c c0094c = new C0094c(this.f1973l, continuation);
                c0094c.f1972k = obj;
                return c0094c;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(g0<? super Object> g0Var, Continuation<? super Unit> continuation) {
                return invoke2((g0<Object>) g0Var, continuation);
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull g0<Object> g0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C0094c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1971j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    g0 g0Var = (g0) this.f1972k;
                    o.i<T2> iVar = this.f1973l;
                    a aVar = new a(g0Var);
                    this.f1971j = 1;
                    if (iVar.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(o.j<? super R> jVar, o.i<? extends T2> iVar, o.i<? extends T1> iVar2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f1944l = jVar;
            this.f1945m = iVar;
            this.f1946n = iVar2;
            this.f1947o = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f1944l, this.f1945m, this.f1946n, this.f1947o, continuation);
            cVar.f1943k = obj;
            return cVar;
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            i0 g2;
            c0 c2;
            Throwable th;
            i0 i0Var;
            p.a e2;
            CoroutineContext plus;
            Unit unit;
            b bVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1942j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                u0 u0Var = (u0) this.f1943k;
                g2 = e0.g(u0Var, null, 0, new C0094c(this.f1945m, null), 3, null);
                c2 = t2.c(null, 1, null);
                ((m0) g2).Q(new a(c2, this.f1944l));
                try {
                    CoroutineContext coroutineContext = u0Var.getCoroutineContext();
                    Object b2 = w0.b(coroutineContext);
                    plus = u0Var.getCoroutineContext().plus(c2);
                    unit = Unit.INSTANCE;
                    bVar = new b(this.f1946n, coroutineContext, b2, g2, this.f1944l, this.f1947o, null);
                    this.f1943k = g2;
                    this.f1942j = 1;
                } catch (p.a e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    if (f.d(plus, unit, null, bVar, this, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (p.a e4) {
                    e = e4;
                    e2 = e;
                    i0Var = g2;
                    q.b(e2, this.f1944l);
                    i0.a.b(g2, null, 1, null);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    i0Var = g2;
                    i0.a.b(i0Var, null, 1, null);
                    throw th;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i0 i0Var2 = (i0) this.f1943k;
                i0Var = i0Var2;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                        g2 = i0Var2;
                    } catch (p.a e5) {
                        e2 = e5;
                        g2 = i0Var2;
                        i0Var = g2;
                        q.b(e2, this.f1944l);
                        i0.a.b(g2, null, 1, null);
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i0.a.b(i0Var, null, 1, null);
                    throw th;
                }
            }
            i0.a.b(g2, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    @PublishedApi
    @Nullable
    public static final <R, T> Object a(@NotNull o.j<? super R> jVar, @NotNull o.i<? extends T>[] iVarArr, @NotNull Function0<T[]> function0, @NotNull Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a2 = p.a(new a(iVarArr, function0, function3, jVar, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
    }

    @NotNull
    public static final <T1, T2, R> o.i<R> b(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new b(iVar2, iVar, function3);
    }
}
