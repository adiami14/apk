package l;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.e2;
import j.e3;
import j.m1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020��2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020��2\u0006\u0010\u0002\u001a\u00020��2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001��¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020��2\u0006\u0010\u0002\u001a\u00020��2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001��¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/CoroutineContext;", "context", "Ll/q0;", "mode", "Ll/i0;", "", "e", "Ll/m0;", "channel", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(JJLl/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/p0.class */
public final class p0 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* loaded from: ItsOnFire.jar:l/p0$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public long f749j;

        /* renamed from: k  reason: collision with root package name */
        public Object f750k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f751l;

        /* renamed from: m  reason: collision with root package name */
        public int f752m;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f751l = obj;
            this.f752m |= Integer.MIN_VALUE;
            return p0.c(0L, 0L, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {R.styleable.AppCompatTheme_listPreferredItemPaddingRight, R.styleable.AppCompatTheme_panelMenuListWidth, R.styleable.AppCompatTheme_ratingBarStyleSmall, R.styleable.AppCompatTheme_seekBarStyle}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* loaded from: ItsOnFire.jar:l/p0$b.class */
    public static final class b extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public long f753j;

        /* renamed from: k  reason: collision with root package name */
        public long f754k;

        /* renamed from: l  reason: collision with root package name */
        public Object f755l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f756m;

        /* renamed from: n  reason: collision with root package name */
        public int f757n;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f756m = obj;
            this.f757n |= Integer.MIN_VALUE;
            return p0.d(0L, 0L, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010��H\u008a@"}, d2 = {"Ll/g0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {R.styleable.AppCompatTheme_imageButtonStyle, R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:l/p0$c.class */
    public static final class c extends SuspendLambda implements Function2<g0<? super Unit>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f758j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f759k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ q0 f760l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ long f761m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ long f762n;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:l/p0$c$a.class */
        public final /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f763a;

            static {
                int[] iArr = new int[q0.values().length];
                iArr[q0.FIXED_PERIOD.ordinal()] = 1;
                iArr[q0.FIXED_DELAY.ordinal()] = 2;
                f763a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q0 q0Var, long j2, long j3, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f760l = q0Var;
            this.f761m = j2;
            this.f762n = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f760l, this.f761m, this.f762n, continuation);
            cVar.f759k = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull g0<? super Unit> g0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f758j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                g0 g0Var = (g0) this.f759k;
                int i3 = a.f763a[this.f760l.ordinal()];
                if (i3 == 1) {
                    long j2 = this.f761m;
                    long j3 = this.f762n;
                    m0 c2 = g0Var.c();
                    this.f758j = 1;
                    if (p0.d(j2, j3, c2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i3 == 2) {
                    long j4 = this.f761m;
                    long j5 = this.f762n;
                    m0 c3 = g0Var.c();
                    this.f758j = 2;
                    if (p0.c(j4, j5, c3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x013a -> B:17:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r4, long r6, l.m0<? super kotlin.Unit> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.p0.c(long, long, l.m0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01f3 -> B:36:0x014b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0227 -> B:57:0x022d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r7, long r9, l.m0<? super kotlin.Unit> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.p0.d(long, long, l.m0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @e3
    @NotNull
    public static final i0<Unit> e(long j2, long j3, @NotNull CoroutineContext coroutineContext, @NotNull q0 q0Var) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j2 + " ms").toString());
        }
        if (j3 >= 0) {
            return e0.d(e2.f468j, m1.g().plus(coroutineContext), 0, new c(q0Var, j2, j3, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j3 + " ms").toString());
    }

    public static /* synthetic */ i0 f(long j2, long j3, CoroutineContext coroutineContext, q0 q0Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = j2;
        }
        if ((i2 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            q0Var = q0.FIXED_PERIOD;
        }
        return e(j2, j3, coroutineContext, q0Var);
    }
}
