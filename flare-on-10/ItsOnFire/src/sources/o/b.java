package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��D\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002BW\u0012-\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001��¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u0094@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028��0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014R>\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u00138\u0002X\u0082\u0004ø\u0001��¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lo/b;", "T", "Lo/f;", "Ll/g0;", "scope", "", "i", "(Ll/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "Lp/e;", "j", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/b.class */
public final class b<T> extends f<T> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final Function2<l.g0<? super T>, Continuation<? super Unit>, Object> f1193n;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {336}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/b$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1194j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1195k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ b<T> f1196l;

        /* renamed from: m  reason: collision with root package name */
        public int f1197m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f1196l = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1195k = obj;
            this.f1197m |= Integer.MIN_VALUE;
            return this.f1196l.i(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function2<? super l.g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        super(function2, coroutineContext, i2, mVar);
        this.f1193n = function2;
    }

    public /* synthetic */ b(Function2 function2, CoroutineContext coroutineContext, int i2, l.m mVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i3 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 4) != 0 ? -2 : i2, (i3 & 8) != 0 ? l.m.SUSPEND : mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    @Override // o.f, p.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(@org.jetbrains.annotations.NotNull l.g0<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof o.b.a
            if (r0 == 0) goto L28
            r0 = r7
            o.b$a r0 = (o.b.a) r0
            r8 = r0
            r0 = r8
            int r0 = r0.f1197m
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r8
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1197m = r1
            r0 = r8
            r7 = r0
            goto L32
        L28:
            o.b$a r0 = new o.b$a
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L32:
            r0 = r7
            java.lang.Object r0 = r0.f1195k
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r7
            int r0 = r0.f1197m
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L68
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L5e
            r0 = r7
            java.lang.Object r0 = r0.f1194j
            l.g0 r0 = (l.g0) r0
            r8 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L87
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = r6
            r0.f1194j = r1
            r0 = r7
            r1 = 1
            r0.f1197m = r1
            r0 = r6
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Object r0 = super.i(r1, r2)
            r1 = r11
            if (r0 != r1) goto L87
            r0 = r11
            return r0
        L87:
            r0 = r8
            boolean r0 = r0.V()
            if (r0 == 0) goto L94
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L94:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.i(l.g0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // o.f, p.e
    @NotNull
    public p.e<T> j(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return new b(this.f1193n, coroutineContext, i2, mVar);
    }
}
