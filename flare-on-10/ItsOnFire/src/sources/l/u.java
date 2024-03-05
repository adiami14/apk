package l;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.e3;
import j.y1;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.text.Typography;
import l.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0004\u0018\u00018��\"\b\b��\u0010��*\u00020\t*\b\u0012\u0004\u0012\u00028��0\u0004H\u0087@ø\u0001��¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018��0\f\"\b\b��\u0010��*\u00020\t*\b\u0012\u0004\u0012\u00028��0\u0004H\u0007\u001aR\u0010\u000e\u001a\u00028\u0001\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\u00020\u0010\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00100\u0003H\u0086Hø\u0001��¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028��0\u0014\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0004H\u0086@ø\u0001��¢\u0006\u0004\b\u0015\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0010\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00100\u0003H\u0087Hø\u0001��¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001a\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001\"\u0014\u0010\u001c\u001a\u00020\u001b8��X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"E", "R", "Ll/i;", "Lkotlin/Function1;", "Ll/i0;", "Lkotlin/ExtensionFunctionType;", "block", "b", "(Ll/i;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "i", "(Ll/i0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt/d;", "h", "c", "(Ll/i0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "action", "e", "(Ll/i0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "j", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ll/i;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "a", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: ItsOnFire.jar:l/u.class */
public final /* synthetic */ class u {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {104}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    /* loaded from: ItsOnFire.jar:l/u$a.class */
    public static final class a<E> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f779j;

        /* renamed from: k  reason: collision with root package name */
        public Object f780k;

        /* renamed from: l  reason: collision with root package name */
        public Object f781l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f782m;

        /* renamed from: n  reason: collision with root package name */
        public int f783n;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f782m = obj;
            this.f783n |= Integer.MIN_VALUE;
            return u.e(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {129}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    /* loaded from: ItsOnFire.jar:l/u$b.class */
    public static final class b<E> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f784j;

        /* renamed from: k  reason: collision with root package name */
        public Object f785k;

        /* renamed from: l  reason: collision with root package name */
        public Object f786l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f787m;

        /* renamed from: n  reason: collision with root package name */
        public int f788n;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f787m = obj;
            this.f788n |= Integer.MIN_VALUE;
            return u.d(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    /* loaded from: ItsOnFire.jar:l/u$c.class */
    public static final class c<E> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f789j;

        /* renamed from: k  reason: collision with root package name */
        public Object f790k;

        /* renamed from: l  reason: collision with root package name */
        public Object f791l;

        /* renamed from: m  reason: collision with root package name */
        public Object f792m;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f793n;

        /* renamed from: o  reason: collision with root package name */
        public int f794o;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f793n = obj;
            this.f794o |= Integer.MIN_VALUE;
            return s.g0(null, this);
        }
    }

    @PublishedApi
    public static final void a(@NotNull i0<?> i0Var, @Nullable Throwable th) {
        CancellationException cancellationException = null;
        CancellationException cancellationException2 = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException2 = (CancellationException) th;
            }
            cancellationException = cancellationException2;
            if (cancellationException2 == null) {
                cancellationException = y1.a("Channel was consumed, consumer had failed", th);
            }
        }
        i0Var.cancel(cancellationException);
    }

    @e3
    public static final <E, R> R b(@NotNull i<E> iVar, @NotNull Function1<? super i0<? extends E>, ? extends R> function1) {
        i0<E> J = iVar.J();
        try {
            R invoke = function1.invoke(J);
            InlineMarker.finallyStart(1);
            i0.a.b(J, null, 1, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            i0.a.b(J, null, 1, null);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final <E, R> R c(@NotNull i0<? extends E> i0Var, @NotNull Function1<? super i0<? extends E>, ? extends R> function1) {
        try {
            R invoke = function1.invoke(i0Var);
            InlineMarker.finallyStart(1);
            s.b(i0Var, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                s.b(i0Var, th);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #2 {all -> 0x00f6, blocks: (B:29:0x00c4, B:31:0x00cf, B:32:0x00e1), top: B:47:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[Catch: all -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00f6, blocks: (B:29:0x00c4, B:31:0x00cf, B:32:0x00e1), top: B:47:0x00c4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bc -> B:47:0x00c4). Please submit an issue!!! */
    @j.e3
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object d(@org.jetbrains.annotations.NotNull l.i<E> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.u.d(l.i, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ce -> B:37:0x00d3). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object e(@org.jetbrains.annotations.NotNull l.i0<? extends E> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.u.e(l.i0, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @e3
    public static final <E> Object f(i<E> iVar, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) {
        i0<E> J = iVar.J();
        try {
            p<E> it = J.iterator();
            while (true) {
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object a2 = it.a(null);
                InlineMarker.mark(1);
                if (!((Boolean) a2).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    i0.a.b(J, null, 1, null);
                    InlineMarker.finallyEnd(1);
                    return unit;
                }
                function1.invoke(it.next());
            }
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            i0.a.b(J, null, 1, null);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final <E> Object g(i0<? extends E> i0Var, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) {
        try {
            p<? extends E> it = i0Var.iterator();
            while (true) {
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object a2 = it.a(null);
                InlineMarker.mark(1);
                if (!((Boolean) a2).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    s.b(i0Var, null);
                    InlineMarker.finallyEnd(1);
                    return unit;
                }
                function1.invoke((E) it.next());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                s.b(i0Var, th);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @NotNull
    public static final <E> t.d<E> h(@NotNull i0<? extends E> i0Var) {
        return (t.d<? extends E>) i0Var.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public static final <E> Object i(@NotNull i0<? extends E> i0Var, @NotNull Continuation<? super E> continuation) {
        return i0Var.w(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d3 -> B:28:0x00dd). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object j(@org.jetbrains.annotations.NotNull l.i0<? extends E> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends E>> r5) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.u.j(l.i0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
