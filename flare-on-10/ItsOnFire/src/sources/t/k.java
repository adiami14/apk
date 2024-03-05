package t;

import j.c2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030��¢\u0006\u0002\b\u0004H\u0087Hø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lt/a;", "", "", "Lkotlin/ExtensionFunctionType;", "builder", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:t/k.class */
public final class k {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
    @DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:t/k$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f2237j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f2238k;

        /* renamed from: l  reason: collision with root package name */
        public int f2239l;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2238k = obj;
            this.f2239l |= Integer.MIN_VALUE;
            return k.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a2 -> B:27:0x00a8). Please submit an issue!!! */
    @j.c2
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super t.a<? super java.lang.Boolean>, kotlin.Unit> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r0 = r5
            boolean r0 = r0 instanceof t.k.a
            if (r0 == 0) goto L25
            r0 = r5
            t.k$a r0 = (t.k.a) r0
            r6 = r0
            r0 = r6
            int r0 = r0.f2239l
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r6
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f2239l = r1
            r0 = r6
            r5 = r0
            goto L2e
        L25:
            t.k$a r0 = new t.k$a
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
        L2e:
            r0 = r5
            java.lang.Object r0 = r0.f2238k
            r6 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r5
            int r0 = r0.f2239l
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5f
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L55
            r0 = r5
            java.lang.Object r0 = r0.f2237j
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r4 = r0
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto La8
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
        L63:
            r0 = r5
            r1 = r4
            r0.f2237j = r1
            r0 = r5
            r1 = 1
            r0.f2239l = r1
            t.b r0 = new t.b
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            r1 = r6
            java.lang.Object r0 = r0.invoke(r1)     // Catch: java.lang.Throwable -> L81
            goto L89
        L81:
            r9 = move-exception
            r0 = r6
            r1 = r9
            r0.p0(r1)
        L89:
            r0 = r6
            java.lang.Object r0 = r0.o0()
            r9 = r0
            r0 = r9
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L9b
            r0 = r5
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L9b:
            r0 = r9
            r6 = r0
            r0 = r9
            r1 = r8
            if (r0 != r1) goto La8
            r0 = r8
            return r0
        La8:
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L63
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.a(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @c2
    public static final Object b(Function1<? super t.a<? super Boolean>, Unit> function1, Continuation<? super Unit> continuation) {
        Object o0;
        Object coroutine_suspended;
        do {
            InlineMarker.mark(0);
            b bVar = new b(continuation);
            try {
                function1.invoke(bVar);
            } catch (Throwable th) {
                bVar.p0(th);
            }
            o0 = bVar.o0();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (o0 == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            InlineMarker.mark(1);
        } while (((Boolean) o0).booleanValue());
        return Unit.INSTANCE;
    }
}
