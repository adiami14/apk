package n;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b��\u0018��2\u00020\u0001B#\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H��¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J'\u0010\u0010\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0082Pø\u0001��¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188��X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8��@��X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0013\u0010)\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010-R(\u00102\u001a\u0004\u0018\u00010\u000f2\b\u0010.\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b&\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Ln/f;", "", "", "Ljava/lang/StackTraceElement;", "h", "", "state", "Lkotlin/coroutines/Continuation;", "frame", "", "j", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V", "toString", "b", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "k", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln/n;", "a", "Ln/n;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Ln/n;", "creationStackBottom", "", "J", "sequenceNumber", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/CoroutineContext;", "c", "Ljava/lang/ref/WeakReference;", "_context", "Ljava/lang/String;", "_state", "Ljava/lang/Thread;", "e", "Ljava/lang/Thread;", "lastObservedThread", "f", "_lastObservedFrame", "()Lkotlin/coroutines/CoroutineContext;", "context", "()Ljava/util/List;", "creationStackTrace", "g", "()Ljava/lang/String;", "value", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "i", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedFrame", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ln/n;J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:n/f.class */
public final class f {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final n f1037a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final long f1038b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<CoroutineContext> f1039c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f1040d = g.f1053a;
    @JvmField
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public Thread f1041e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<CoroutineStackFrame> f1042f;

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010��H\u008a@"}, d2 = {"Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:n/f$a.class */
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super StackTraceElement>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1043j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1044k;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ n f1046m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1046m = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1046m, continuation);
            aVar.f1044k = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super StackTraceElement> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1043j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope = (SequenceScope) this.f1044k;
                f fVar = f.this;
                CoroutineStackFrame callerFrame = this.f1046m.getCallerFrame();
                this.f1043j = 1;
                if (fVar.k(sequenceScope, callerFrame, this) == coroutine_suspended) {
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

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "yieldFrames", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:n/f$b.class */
    public static final class b extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1047j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1048k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1049l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f1050m;

        /* renamed from: o  reason: collision with root package name */
        public int f1052o;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1050m = obj;
            this.f1052o |= Integer.MIN_VALUE;
            return f.this.k(null, null, this);
        }
    }

    public f(@Nullable CoroutineContext coroutineContext, @Nullable n nVar, long j2) {
        this.f1037a = nVar;
        this.f1038b = j2;
        this.f1039c = new WeakReference<>(coroutineContext);
    }

    public final List<StackTraceElement> b() {
        Sequence sequence;
        List<StackTraceElement> list;
        List<StackTraceElement> emptyList;
        n nVar = this.f1037a;
        if (nVar == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        sequence = SequencesKt__SequenceBuilderKt.sequence(new a(nVar, null));
        list = SequencesKt___SequencesKt.toList(sequence);
        return list;
    }

    @Nullable
    public final CoroutineContext c() {
        return this.f1039c.get();
    }

    @Nullable
    public final n d() {
        return this.f1037a;
    }

    @NotNull
    public final List<StackTraceElement> e() {
        return b();
    }

    @Nullable
    public final CoroutineStackFrame f() {
        WeakReference<CoroutineStackFrame> weakReference = this.f1042f;
        return weakReference != null ? weakReference.get() : null;
    }

    @NotNull
    public final String g() {
        return this.f1040d;
    }

    @NotNull
    public final List<StackTraceElement> h() {
        List<StackTraceElement> emptyList;
        CoroutineStackFrame f2 = f();
        if (f2 == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        while (f2 != null) {
            StackTraceElement stackTraceElement = f2.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            f2 = f2.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@Nullable CoroutineStackFrame coroutineStackFrame) {
        this.f1042f = coroutineStackFrame != null ? new WeakReference<>(coroutineStackFrame) : null;
    }

    public final void j(@NotNull String str, @NotNull Continuation<?> continuation) {
        if (Intrinsics.areEqual(this.f1040d, str) && Intrinsics.areEqual(str, g.f1055c) && f() != null) {
            return;
        }
        this.f1040d = str;
        i(continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null);
        Thread thread = null;
        if (Intrinsics.areEqual(str, g.f1054b)) {
            thread = Thread.currentThread();
        }
        this.f1041e = thread;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a4 -> B:28:0x00e2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00cb -> B:27:0x00d5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f.k(kotlin.sequences.SequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
