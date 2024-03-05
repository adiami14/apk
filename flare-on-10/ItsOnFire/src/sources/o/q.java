package o;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\"\n��\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010��\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u0002\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0001H\u0086@ø\u0001��¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\n\u001a\u00020\u0002\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001��¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"T", "Lo/i;", "", "a", "(Lo/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "b", "(Lo/i;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/q.class */
public final /* synthetic */ class q {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {18}, m = "count", n = {"i"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/q$a.class */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1470j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1471k;

        /* renamed from: l  reason: collision with root package name */
        public int f1472l;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1471k = obj;
            this.f1472l |= Integer.MIN_VALUE;
            return k.Y(null, this);
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/q$b.class */
    public static final class b<T> implements j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1473j;

        public b(Ref.IntRef intRef) {
            this.f1473j = intRef;
        }

        @Override // o.j
        @Nullable
        public final Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
            this.f1473j.element++;
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {30}, m = "count", n = {"i"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/q$c.class */
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1474j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1475k;

        /* renamed from: l  reason: collision with root package name */
        public int f1476l;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1475k = obj;
            this.f1476l |= Integer.MIN_VALUE;
            return k.Z(null, null, this);
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/q$d.class */
    public static final class d<T> implements j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f1477j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1478k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {31}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/q$d$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1479j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f1480k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ d<T> f1481l;

            /* renamed from: m  reason: collision with root package name */
            public int f1482m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1481l = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1480k = obj;
                this.f1482m |= Integer.MIN_VALUE;
                return this.f1481l.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Ref.IntRef intRef) {
            this.f1477j = function2;
            this.f1478k = intRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
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
                boolean r0 = r0 instanceof o.q.d.a
                if (r0 == 0) goto L28
                r0 = r7
                o.q$d$a r0 = (o.q.d.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1482m
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1482m = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.q$d$a r0 = new o.q$d$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1480k
                r8 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.f1482m
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L68
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L5e
                r0 = r7
                java.lang.Object r0 = r0.f1479j
                o.q$d r0 = (o.q.d) r0
                r6 = r0
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r8
                r7 = r0
                goto L91
            L5e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L68:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r0.f1477j
                r8 = r0
                r0 = r7
                r1 = r5
                r0.f1479j = r1
                r0 = r7
                r1 = 1
                r0.f1482m = r1
                r0 = r8
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.invoke(r1, r2)
                r8 = r0
                r0 = r5
                r6 = r0
                r0 = r8
                r7 = r0
                r0 = r8
                r1 = r10
                if (r0 != r1) goto L91
                r0 = r10
                return r0
            L91:
                r0 = r7
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto Laa
                r0 = r6
                kotlin.jvm.internal.Ref$IntRef r0 = r0.f1478k
                r6 = r0
                r0 = r6
                r1 = r6
                int r1 = r1.element
                r2 = 1
                int r1 = r1 + r2
                r0.element = r1
            Laa:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.q.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull o.i<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Integer> r5) {
        /*
            r0 = r5
            boolean r0 = r0 instanceof o.q.a
            if (r0 == 0) goto L25
            r0 = r5
            o.q$a r0 = (o.q.a) r0
            r6 = r0
            r0 = r6
            int r0 = r0.f1472l
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r6
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1472l = r1
            r0 = r6
            r5 = r0
            goto L2e
        L25:
            o.q$a r0 = new o.q$a
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
        L2e:
            r0 = r5
            java.lang.Object r0 = r0.f1471k
            r6 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r5
            int r0 = r0.f1472l
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5f
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L55
            r0 = r5
            java.lang.Object r0 = r0.f1470j
            kotlin.jvm.internal.Ref$IntRef r0 = (kotlin.jvm.internal.Ref.IntRef) r0
            r4 = r0
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto L92
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r1 = r0
            r1.<init>()
            r6 = r0
            o.q$b r0 = new o.q$b
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r9 = r0
            r0 = r5
            r1 = r6
            r0.f1470j = r1
            r0 = r5
            r1 = 1
            r0.f1472l = r1
            r0 = r4
            r1 = r9
            r2 = r5
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r8
            if (r0 != r1) goto L90
            r0 = r8
            return r0
        L90:
            r0 = r6
            r4 = r0
        L92:
            r0 = r4
            int r0 = r0.element
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.a(o.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull o.i<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Integer> r7) {
        /*
            r0 = r7
            boolean r0 = r0 instanceof o.q.c
            if (r0 == 0) goto L28
            r0 = r7
            o.q$c r0 = (o.q.c) r0
            r8 = r0
            r0 = r8
            int r0 = r0.f1476l
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r8
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1476l = r1
            r0 = r8
            r7 = r0
            goto L31
        L28:
            o.q$c r0 = new o.q$c
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r7 = r0
        L31:
            r0 = r7
            java.lang.Object r0 = r0.f1475k
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.f1476l
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L65
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L5b
            r0 = r7
            java.lang.Object r0 = r0.f1474j
            kotlin.jvm.internal.Ref$IntRef r0 = (kotlin.jvm.internal.Ref.IntRef) r0
            r5 = r0
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L97
        L5b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L65:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r1 = r0
            r1.<init>()
            r8 = r0
            o.q$d r0 = new o.q$d
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r7
            r1 = r8
            r0.f1474j = r1
            r0 = r7
            r1 = 1
            r0.f1476l = r1
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r10
            if (r0 != r1) goto L95
            r0 = r10
            return r0
        L95:
            r0 = r8
            r5 = r0
        L97:
            r0 = r5
            int r0 = r0.element
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.b(o.i, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
