package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.d2;
import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��t\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n��\n\u0002\u0010(\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\u0010\b\n��\n\u0002\u0010\u0016\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��2/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001��¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u000bH\u0007\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rH\u0007ø\u0001��¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0010\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0012\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028��0\u0016\"\u00028��¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��2\u0006\u0010\u001a\u001a\u00028��¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0016¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020\"\u001a\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020%\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020'\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��2/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001��¢\u0006\u0004\b*\u0010\n\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��2/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001��¢\u0006\u0004\b+\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"T", "Lkotlin/Function2;", "Lo/j;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lo/i;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lkotlin/jvm/functions/Function2;)Lo/i;", "Lkotlin/Function0;", "c", "Lkotlin/Function1;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lkotlin/jvm/functions/Function1;)Lo/i;", "", "a", "", "b", "Lkotlin/sequences/Sequence;", "g", "", "elements", "p", "([Ljava/lang/Object;)Lo/i;", "value", "o", "(Ljava/lang/Object;)Lo/i;", "m", "j", "", "", "h", "", "", "i", "Lkotlin/ranges/IntRange;", "e", "Lkotlin/ranges/LongRange;", "f", "Ll/g0;", "l", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/l.class */
public final /* synthetic */ class l {

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$a.class */
    public static final class a implements o.i<Long> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ LongRange f1366j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d19"}, s = {"L$0"})
        /* renamed from: o.l$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:o/l$a$a.class */
        public static final class C0070a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1367j;

            /* renamed from: k  reason: collision with root package name */
            public int f1368k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1370m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1371n;

            public C0070a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1367j = obj;
                this.f1368k |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(LongRange longRange) {
            this.f1366j = longRange;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super java.lang.Long> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.l.a.C0070a
                if (r0 == 0) goto L28
                r0 = r7
                o.l$a$a r0 = (o.l.a.C0070a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1368k
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1368k = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.l$a$a r0 = new o.l$a$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1367j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r11 = r0
                r0 = r7
                int r0 = r0.f1368k
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L70
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L66
                r0 = r7
                java.lang.Object r0 = r0.f1371n
                java.util.Iterator r0 = (java.util.Iterator) r0
                r6 = r0
                r0 = r7
                java.lang.Object r0 = r0.f1370m
                o.j r0 = (o.j) r0
                r8 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L85
            L66:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L70:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                kotlin.ranges.LongRange r0 = r0.f1366j
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r0 = r6
                r8 = r0
                r0 = r10
                r6 = r0
            L85:
                r0 = r6
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lba
                r0 = r6
                kotlin.collections.LongIterator r0 = (kotlin.collections.LongIterator) r0
                long r0 = r0.nextLong()
                java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
                r10 = r0
                r0 = r7
                r1 = r8
                r0.f1370m = r1
                r0 = r7
                r1 = r6
                r0.f1371n = r1
                r0 = r7
                r1 = 1
                r0.f1368k = r1
                r0 = r8
                r1 = r10
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r11
                if (r0 != r1) goto L85
                r0 = r11
                return r0
            Lba:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.a.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$b.class */
    public static final class b<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function0 f1372j;

        public b(Function0 function0) {
            this.f1372j = function0;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object emit = jVar.emit((Object) this.f1372j.invoke(), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return emit == coroutine_suspended ? emit : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$c.class */
    public static final class c<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function1 f1373j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_toolbarStyle}, m = "collect", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/l$c$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1374j;

            /* renamed from: k  reason: collision with root package name */
            public int f1375k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1377m;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1374j = obj;
                this.f1375k |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function1 function1) {
            this.f1373j = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.l.c.a
                if (r0 == 0) goto L28
                r0 = r7
                o.l$c$a r0 = (o.l.c.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1375k
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1375k = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.l$c$a r0 = new o.l$c$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1374j
                r8 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.f1375k
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L73
                r0 = r9
                r1 = 1
                if (r0 == r1) goto L64
                r0 = r9
                r1 = 2
                if (r0 != r1) goto L5a
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                goto Lc0
            L5a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L64:
                r0 = r7
                java.lang.Object r0 = r0.f1377m
                o.j r0 = (o.j) r0
                r6 = r0
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                goto La6
            L73:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                kotlin.jvm.functions.Function1 r0 = r0.f1373j
                r8 = r0
                r0 = r7
                r1 = r6
                r0.f1377m = r1
                r0 = r7
                r1 = 1
                r0.f1375k = r1
                r0 = 6
                kotlin.jvm.internal.InlineMarker.mark(r0)
                r0 = r8
                r1 = r7
                java.lang.Object r0 = r0.invoke(r1)
                r11 = r0
                r0 = 7
                kotlin.jvm.internal.InlineMarker.mark(r0)
                r0 = r11
                r8 = r0
                r0 = r11
                r1 = r10
                if (r0 != r1) goto La6
                r0 = r10
                return r0
            La6:
                r0 = r7
                r1 = 0
                r0.f1377m = r1
                r0 = r7
                r1 = 2
                r0.f1375k = r1
                r0 = r6
                r1 = r8
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r10
                if (r0 != r1) goto Lc0
                r0 = r10
                return r0
            Lc0:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.c.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$d.class */
    public static final class d<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Iterable f1378j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d3"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/l$d$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1379j;

            /* renamed from: k  reason: collision with root package name */
            public int f1380k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1382m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1383n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1379j = obj;
                this.f1380k |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(Iterable iterable) {
            this.f1378j = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.l.d.a
                if (r0 == 0) goto L28
                r0 = r7
                o.l$d$a r0 = (o.l.d.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1380k
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1380k = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.l$d$a r0 = new o.l$d$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1379j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r11 = r0
                r0 = r7
                int r0 = r0.f1380k
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L70
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L66
                r0 = r7
                java.lang.Object r0 = r0.f1383n
                java.util.Iterator r0 = (java.util.Iterator) r0
                r8 = r0
                r0 = r7
                java.lang.Object r0 = r0.f1382m
                o.j r0 = (o.j) r0
                r6 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L7f
            L66:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L70:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                java.lang.Iterable r0 = r0.f1378j
                java.util.Iterator r0 = r0.iterator()
                r8 = r0
            L7f:
                r0 = r8
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lb0
                r0 = r8
                java.lang.Object r0 = r0.next()
                r10 = r0
                r0 = r7
                r1 = r6
                r0.f1382m = r1
                r0 = r7
                r1 = r8
                r0.f1383n = r1
                r0 = r7
                r1 = 1
                r0.f1380k = r1
                r0 = r6
                r1 = r10
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r11
                if (r0 != r1) goto L7f
                r0 = r11
                return r0
            Lb0:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.d.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$e.class */
    public static final class e<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Iterator f1384j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d5"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/l$e$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1385j;

            /* renamed from: k  reason: collision with root package name */
            public int f1386k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1388m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1389n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1385j = obj;
                this.f1386k |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(Iterator it) {
            this.f1384j = it;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.l.e.a
                if (r0 == 0) goto L28
                r0 = r7
                o.l$e$a r0 = (o.l.e.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1386k
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1386k = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.l$e$a r0 = new o.l$e$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1385j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r11 = r0
                r0 = r7
                int r0 = r0.f1386k
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L70
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L66
                r0 = r7
                java.lang.Object r0 = r0.f1389n
                java.util.Iterator r0 = (java.util.Iterator) r0
                r8 = r0
                r0 = r7
                java.lang.Object r0 = r0.f1388m
                o.j r0 = (o.j) r0
                r6 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L7a
            L66:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L70:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                java.util.Iterator r0 = r0.f1384j
                r8 = r0
            L7a:
                r0 = r8
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lab
                r0 = r8
                java.lang.Object r0 = r0.next()
                r10 = r0
                r0 = r7
                r1 = r6
                r0.f1388m = r1
                r0 = r7
                r1 = r8
                r0.f1389n = r1
                r0 = r7
                r1 = 1
                r0.f1386k = r1
                r0 = r6
                r1 = r10
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r11
                if (r0 != r1) goto L7a
                r0 = r11
                return r0
            Lab:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.e.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$f.class */
    public static final class f<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Sequence f1390j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d7"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/l$f$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1391j;

            /* renamed from: k  reason: collision with root package name */
            public int f1392k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1394m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1395n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1391j = obj;
                this.f1392k |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(Sequence sequence) {
            this.f1390j = sequence;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.l.f.a
                if (r0 == 0) goto L28
                r0 = r7
                o.l$f$a r0 = (o.l.f.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1392k
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1392k = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.l$f$a r0 = new o.l$f$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1391j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r11 = r0
                r0 = r7
                int r0 = r0.f1392k
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L70
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L66
                r0 = r7
                java.lang.Object r0 = r0.f1395n
                java.util.Iterator r0 = (java.util.Iterator) r0
                r8 = r0
                r0 = r7
                java.lang.Object r0 = r0.f1394m
                o.j r0 = (o.j) r0
                r6 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L7f
            L66:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L70:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                kotlin.sequences.Sequence r0 = r0.f1390j
                java.util.Iterator r0 = r0.iterator()
                r8 = r0
            L7f:
                r0 = r8
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lb0
                r0 = r8
                java.lang.Object r0 = r0.next()
                r10 = r0
                r0 = r7
                r1 = r6
                r0.f1394m = r1
                r0 = r7
                r1 = r8
                r0.f1395n = r1
                r0 = r7
                r1 = 1
                r0.f1392k = r1
                r0 = r6
                r1 = r10
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r11
                if (r0 != r1) goto L7f
                r0 = r11
                return r0
            Lb0:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.f.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$g.class */
    public static final class g<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object[] f1396j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d11", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: ItsOnFire.jar:o/l$g$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1397j;

            /* renamed from: k  reason: collision with root package name */
            public int f1398k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1400m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1401n;

            /* renamed from: o  reason: collision with root package name */
            public int f1402o;

            /* renamed from: p  reason: collision with root package name */
            public int f1403p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1397j = obj;
                this.f1398k |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        public g(Object[] objArr) {
            this.f1396j = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00d3 -> B:22:0x00d9). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.g.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$h.class */
    public static final class h implements o.i<Integer> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ int[] f1404j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d13", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: ItsOnFire.jar:o/l$h$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1405j;

            /* renamed from: k  reason: collision with root package name */
            public int f1406k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1408m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1409n;

            /* renamed from: o  reason: collision with root package name */
            public int f1410o;

            /* renamed from: p  reason: collision with root package name */
            public int f1411p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1405j = obj;
                this.f1406k |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(int[] iArr) {
            this.f1404j = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00d6 -> B:22:0x00dc). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super java.lang.Integer> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.h.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$i.class */
    public static final class i implements o.i<Long> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ long[] f1412j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d15", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: ItsOnFire.jar:o/l$i$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1413j;

            /* renamed from: k  reason: collision with root package name */
            public int f1414k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1416m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1417n;

            /* renamed from: o  reason: collision with root package name */
            public int f1418o;

            /* renamed from: p  reason: collision with root package name */
            public int f1419p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1413j = obj;
                this.f1414k |= Integer.MIN_VALUE;
                return i.this.collect(null, this);
            }
        }

        public i(long[] jArr) {
            this.f1412j = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00cd -> B:22:0x00d3). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super java.lang.Long> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.i.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$j.class */
    public static final class j implements o.i<Integer> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ IntRange f1420j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/l$j$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1421j;

            /* renamed from: k  reason: collision with root package name */
            public int f1422k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1424m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1425n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1421j = obj;
                this.f1422k |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public j(IntRange intRange) {
            this.f1420j = intRange;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super java.lang.Integer> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.l.j.a
                if (r0 == 0) goto L28
                r0 = r7
                o.l$j$a r0 = (o.l.j.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1422k
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1422k = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.l$j$a r0 = new o.l$j$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1421j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r11 = r0
                r0 = r7
                int r0 = r0.f1422k
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L70
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L66
                r0 = r7
                java.lang.Object r0 = r0.f1425n
                java.util.Iterator r0 = (java.util.Iterator) r0
                r6 = r0
                r0 = r7
                java.lang.Object r0 = r0.f1424m
                o.j r0 = (o.j) r0
                r8 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L85
            L66:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L70:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                kotlin.ranges.IntRange r0 = r0.f1420j
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r0 = r6
                r8 = r0
                r0 = r10
                r6 = r0
            L85:
                r0 = r6
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lba
                r0 = r6
                kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
                int r0 = r0.nextInt()
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                r10 = r0
                r0 = r7
                r1 = r8
                r0.f1424m = r1
                r0 = r7
                r1 = r6
                r0.f1425n = r1
                r0 = r7
                r1 = 1
                r0.f1422k = r1
                r0 = r8
                r1 = r10
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r11
                if (r0 != r1) goto L85
                r0 = r11
                return r0
            Lba:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.j.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/l$k.class */
    public static final class k<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object[] f1426j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u2d8"}, s = {"L$0", "L$1"})
        /* loaded from: ItsOnFire.jar:o/l$k$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1427j;

            /* renamed from: k  reason: collision with root package name */
            public int f1428k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1430m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1431n;

            /* renamed from: o  reason: collision with root package name */
            public int f1432o;

            /* renamed from: p  reason: collision with root package name */
            public int f1433p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1427j = obj;
                this.f1428k |= Integer.MIN_VALUE;
                return k.this.collect(null, this);
            }
        }

        public k(Object[] objArr) {
            this.f1426j = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00e5 -> B:22:0x00ea). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.k.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: o.l$l  reason: collision with other inner class name */
    /* loaded from: ItsOnFire.jar:o/l$l.class */
    public static final class C0071l<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f1434j;

        public C0071l(Object obj) {
            this.f1434j = obj;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object emit = jVar.emit((Object) this.f1434j, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return emit == coroutine_suspended ? emit : Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> o.i<T> a(@NotNull Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @NotNull
    public static final <T> o.i<T> b(@NotNull Iterator<? extends T> it) {
        return new e(it);
    }

    @d2
    @NotNull
    public static final <T> o.i<T> c(@NotNull Function0<? extends T> function0) {
        return new b(function0);
    }

    @d2
    @NotNull
    public static final <T> o.i<T> d(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1) {
        return new c(function1);
    }

    @NotNull
    public static final o.i<Integer> e(@NotNull IntRange intRange) {
        return new j(intRange);
    }

    @NotNull
    public static final o.i<Long> f(@NotNull LongRange longRange) {
        return new a(longRange);
    }

    @NotNull
    public static final <T> o.i<T> g(@NotNull Sequence<? extends T> sequence) {
        return new f(sequence);
    }

    @NotNull
    public static final o.i<Integer> h(@NotNull int[] iArr) {
        return new h(iArr);
    }

    @NotNull
    public static final o.i<Long> i(@NotNull long[] jArr) {
        return new i(jArr);
    }

    @NotNull
    public static final <T> o.i<T> j(@NotNull T[] tArr) {
        return new g(tArr);
    }

    @NotNull
    public static final <T> o.i<T> k(@BuilderInference @NotNull Function2<? super l.g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new o.b(function2, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> o.i<T> l(@BuilderInference @NotNull Function2<? super l.g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new o.f(function2, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> o.i<T> m() {
        return o.h.f1342j;
    }

    @NotNull
    public static final <T> o.i<T> n(@BuilderInference @NotNull Function2<? super o.j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new h0(function2);
    }

    @NotNull
    public static final <T> o.i<T> o(T t2) {
        return new C0071l(t2);
    }

    @NotNull
    public static final <T> o.i<T> p(@NotNull T... tArr) {
        return new k(tArr);
    }
}
