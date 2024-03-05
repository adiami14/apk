package l;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.p1;
import j.z0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import l.m0;
import l.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.d1;
import q.r0;
import q.y;
@Metadata(bv = {}, d1 = {"��ª\u0001\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002:\u0004hijkB)\u0012 \u0010L\u001a\u001c\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028��\u0018\u0001`J¢\u0006\u0004\bg\u0010>J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028��2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028��H\u0082@ø\u0001��¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\b\u001a\u00028��2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\b\u001a\u00028��2(\u0010\u001b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002ø\u0001��¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028��H\u0014¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028��2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010\b\u001a\u00028��H\u0004¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,2\u0006\u0010\b\u001a\u00028��H\u0004¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028��H\u0086@ø\u0001��¢\u0006\u0004\b/\u0010\rJ\u0017\u00101\u001a\u0002002\u0006\u0010\b\u001a\u00028��H\u0016¢\u0006\u0004\b1\u00102J$\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b032\u0006\u0010\b\u001a\u00028��ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u0010\"J\u0019\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u00020%H\u0014¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0002002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\u000b2\u0018\u0010<\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b0:j\u0002`;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\n\u0012\u0004\u0012\u00028��\u0018\u00010(H\u0014¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00028��0D2\u0006\u0010\b\u001a\u00028��H\u0004¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IR.\u0010L\u001a\u001c\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028��\u0018\u0001`J8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bE\u0010KR\u001a\u0010Q\u001a\u00020M8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b6\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010RR\u0014\u0010U\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010IR\u0014\u0010W\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bV\u0010RR\u0014\u0010Y\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bX\u0010RR\u001a\u0010\\\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001a\u0010^\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[R\u0011\u0010`\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b_\u0010RR#\u0010d\u001a\u0014\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020G8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\be\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Ll/c;", "E", "Ll/m0;", "Ll/w;", "closed", "", "x", "(Ll/w;)Ljava/lang/Throwable;", "element", "u", "(Ljava/lang/Object;Ll/w;)Ljava/lang/Throwable;", "", "N", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "y", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Ll/w;)V", "cause", "A", "(Ljava/lang/Throwable;)V", "t", "(Ll/w;)V", "R", "Lt/f;", "select", "Lkotlin/Function2;", "", "block", "L", "(Lt/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "g", "()I", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "I", "(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;", "Ll/l0;", "P", "()Ll/l0;", "Ll/j0;", "M", "(Ljava/lang/Object;)Ll/j0;", "Lq/y$b;", "Lkotlinx/coroutines/internal/AddLastDesc;", "h", "(Ljava/lang/Object;)Lq/y$b;", "U", "", "offer", "(Ljava/lang/Object;)Z", "Ll/r;", "T", "send", "k", "(Ll/l0;)Ljava/lang/Object;", "G", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "Q", "(Lkotlin/jvm/functions/Function1;)V", "Lq/y;", "K", "(Lq/y;)V", "O", "()Ll/j0;", "Ll/c$d;", "j", "(Ljava/lang/Object;)Ll/c$d;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "Lq/w;", "Lq/w;", "r", "()Lq/w;", "queue", "()Z", "isFullImpl", "s", "queueDebugStateString", "B", "isBufferAlwaysFull", "C", "isBufferFull", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "()Ll/w;", "closedForSend", "m", "closedForReceive", "V", "isClosedForSend", "Lt/e;", "D", "()Lt/e;", "onSend", "l", "bufferDebugString", "<init>", "a", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/c.class */
public abstract class c<E> implements m0<E> {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f681l = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    @JvmField
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final Function1<E, Unit> f682j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final q.w f683k = new q.w();
    @NotNull
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(bv = {}, d1 = {"��4\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010��\n\u0002\b\u0006\b��\u0018��*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Ll/c$a;", "E", "Ll/l0;", "Lq/y$d;", "otherOp", "Lq/r0;", "j0", "", "g0", "Ll/w;", "closed", "i0", "", "toString", "m", "Ljava/lang/Object;", "element", "", "h0", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:l/c$a.class */
    public static final class a<E> extends l0 {
        @JvmField

        /* renamed from: m  reason: collision with root package name */
        public final E f684m;

        public a(E e2) {
            this.f684m = e2;
        }

        @Override // l.l0
        public void g0() {
        }

        @Override // l.l0
        @Nullable
        public Object h0() {
            return this.f684m;
        }

        @Override // l.l0
        public void i0(@NotNull w<?> wVar) {
        }

        @Override // l.l0
        @Nullable
        public r0 j0(@Nullable y.d dVar) {
            r0 r0Var = j.s.f553d;
            if (dVar != null) {
                dVar.d();
            }
            return r0Var;
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "SendBuffered@" + z0.b(this) + '(' + this.f684m + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"��&\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018��*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Ll/c$b;", "E", "Lq/y$b;", "Ll/c$a;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lq/y;", "affected", "", "e", "Lq/w;", "queue", "element", "<init>", "(Lq/w;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:l/c$b.class */
    public static class b<E> extends y.b<a<? extends E>> {
        public b(@NotNull q.w wVar, E e2) {
            super(wVar, new a(e2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [q.r0] */
        @Override // q.y.a
        @Nullable
        public Object e(@NotNull q.y yVar) {
            if (!(yVar instanceof w)) {
                yVar = yVar instanceof j0 ? l.b.f676e : null;
            }
            return yVar;
        }
    }

    @Metadata(bv = {}, d1 = {"��X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0006\b\u0002\u0018��*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BX\u0012\u0006\u0010\u0016\u001a\u00028\u0001\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\u0012(\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001fø\u0001��¢\u0006\u0004\b&\u0010'J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0016\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR9\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f8\u0006X\u0087\u0004ø\u0001��¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Ll/c$c;", "E", "R", "Ll/l0;", "Lj/p1;", "Lq/y$d;", "otherOp", "Lq/r0;", "j0", "", "g0", "dispose", "Ll/w;", "closed", "i0", "k0", "", "toString", "m", "Ljava/lang/Object;", "h0", "()Ljava/lang/Object;", "pollResult", "Ll/c;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ll/c;", "channel", "Lt/f;", "o", "Lt/f;", "select", "Lkotlin/Function2;", "Ll/m0;", "Lkotlin/coroutines/Continuation;", "", "p", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Ljava/lang/Object;Ll/c;Lt/f;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: l.c$c  reason: collision with other inner class name */
    /* loaded from: ItsOnFire.jar:l/c$c.class */
    public static final class C0053c<E, R> extends l0 implements p1 {

        /* renamed from: m  reason: collision with root package name */
        public final E f685m;
        @JvmField
        @NotNull

        /* renamed from: n  reason: collision with root package name */
        public final c<E> f686n;
        @JvmField
        @NotNull

        /* renamed from: o  reason: collision with root package name */
        public final t.f<R> f687o;
        @JvmField
        @NotNull

        /* renamed from: p  reason: collision with root package name */
        public final Function2<m0<? super E>, Continuation<? super R>, Object> f688p;

        /* JADX WARN: Multi-variable type inference failed */
        public C0053c(E e2, @NotNull c<E> cVar, @NotNull t.f<? super R> fVar, @NotNull Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f685m = e2;
            this.f686n = cVar;
            this.f687o = fVar;
            this.f688p = function2;
        }

        @Override // j.p1
        public void dispose() {
            if (Y()) {
                k0();
            }
        }

        @Override // l.l0
        public void g0() {
            r.a.f(this.f688p, this.f686n, this.f687o.o(), null, 4, null);
        }

        @Override // l.l0
        public E h0() {
            return this.f685m;
        }

        @Override // l.l0
        public void i0(@NotNull w<?> wVar) {
            if (this.f687o.i()) {
                this.f687o.v(wVar.o0());
            }
        }

        @Override // l.l0
        @Nullable
        public r0 j0(@Nullable y.d dVar) {
            return (r0) this.f687o.d(dVar);
        }

        @Override // l.l0
        public void k0() {
            Function1<E, Unit> function1 = this.f686n.f682j;
            if (function1 != null) {
                q.i0.b(function1, h0(), this.f687o.o().getContext());
            }
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "SendSelect@" + z0.b(this) + '(' + h0() + ")[" + this.f686n + ", " + this.f687o + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"��2\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018��*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0014\u0010\u000e\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0013"}, d2 = {"Ll/c$d;", "E", "Lq/y$e;", "Ll/j0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lq/y;", "affected", "", "e", "Lq/y$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Ljava/lang/Object;", "element", "Lq/w;", "queue", "<init>", "(Ljava/lang/Object;Lq/w;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:l/c$d.class */
    public static final class d<E> extends y.e<j0<? super E>> {
        @JvmField

        /* renamed from: e  reason: collision with root package name */
        public final E f689e;

        public d(E e2, @NotNull q.w wVar) {
            super(wVar);
            this.f689e = e2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [q.r0] */
        @Override // q.y.e, q.y.a
        @Nullable
        public Object e(@NotNull q.y yVar) {
            if (!(yVar instanceof w)) {
                yVar = !(yVar instanceof j0) ? l.b.f676e : null;
            }
            return yVar;
        }

        @Override // q.y.a
        @Nullable
        public Object j(@NotNull y.d dVar) {
            r0 c2 = ((j0) dVar.f2123a).c(this.f689e, dVar);
            if (c2 == null) {
                return q.z.f2131a;
            }
            Object obj = q.c.f2037b;
            if (c2 == obj) {
                return obj;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u001b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002*\u0001��\b\n\u0018��2\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006��"}, d2 = {"q/y$f", "Lq/y$c;", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:l/c$e.class */
    public static final class e extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f690d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q.y yVar, c cVar) {
            super(yVar);
            this.f690d = cVar;
        }

        @Override // q.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull q.y yVar) {
            return this.f690d.C() ? null : q.x.a();
        }
    }

    @Metadata(bv = {}, d1 = {"��-\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\u0014\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028��2(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001��¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"l/c$f", "Lt/e;", "Ll/m0;", "R", "Lt/f;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "S", "(Lt/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:l/c$f.class */
    public static final class f implements t.e<E, m0<? super E>> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c<E> f691j;

        public f(c<E> cVar) {
            this.f691j = cVar;
        }

        @Override // t.e
        public <R> void S(@NotNull t.f<? super R> fVar, E e2, @NotNull Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f691j.L(fVar, e2, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Nullable Function1<? super E, Unit> function1) {
        this.f682j = function1;
    }

    public final void A(Throwable th) {
        r0 r0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (r0Var = l.b.f679h) || !androidx.concurrent.futures.a.a(f681l, this, obj, r0Var)) {
            return;
        }
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(th);
    }

    public abstract boolean B();

    public abstract boolean C();

    @Override // l.m0
    @NotNull
    public final t.e<E, m0<E>> D() {
        return new f(this);
    }

    public final boolean E() {
        return !(this.f683k.R() instanceof j0) && C();
    }

    @Override // l.m0
    public boolean G(@Nullable Throwable th) {
        boolean z;
        w<?> wVar = new w<>(th);
        q.y yVar = this.f683k;
        while (true) {
            q.y S = yVar.S();
            z = true;
            if (!(!(S instanceof w))) {
                z = false;
                break;
            } else if (S.I(wVar, yVar)) {
                break;
            }
        }
        if (!z) {
            wVar = (w) this.f683k.S();
        }
        t(wVar);
        if (z) {
            A(th);
        }
        return z;
    }

    @NotNull
    public Object H(E e2) {
        j0<E> O;
        do {
            O = O();
            if (O == null) {
                return l.b.f676e;
            }
        } while (O.c(e2, null) == null);
        O.q(e2);
        return O.h();
    }

    @NotNull
    public Object I(E e2, @NotNull t.f<?> fVar) {
        d<E> j2 = j(e2);
        Object r2 = fVar.r(j2);
        if (r2 != null) {
            return r2;
        }
        j0<? super E> o2 = j2.o();
        o2.q(e2);
        return o2.h();
    }

    public void K(@NotNull q.y yVar) {
    }

    public final <R> void L(t.f<? super R> fVar, E e2, Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!fVar.l()) {
            if (E()) {
                C0053c c0053c = new C0053c(e2, this, fVar, function2);
                Object k2 = k(c0053c);
                if (k2 == null) {
                    fVar.m(c0053c);
                    return;
                } else if (k2 instanceof w) {
                    throw q.q0.p(u(e2, (w) k2));
                } else {
                    if (k2 != l.b.f678g && !(k2 instanceof h0)) {
                        throw new IllegalStateException(("enqueueSend returned " + k2 + ' ').toString());
                    }
                }
            }
            Object I = I(e2, fVar);
            if (I == t.g.d()) {
                return;
            }
            if (I != l.b.f676e && I != q.c.f2037b) {
                if (I == l.b.f675d) {
                    r.b.d(function2, this, fVar.o());
                    return;
                } else if (I instanceof w) {
                    throw q.q0.p(u(e2, (w) I));
                } else {
                    throw new IllegalStateException(("offerSelectInternal returned " + I).toString());
                }
            }
        }
    }

    @Nullable
    public final j0<?> M(E e2) {
        q.y S;
        q.y yVar = this.f683k;
        a aVar = new a(e2);
        do {
            S = yVar.S();
            if (S instanceof j0) {
                return (j0) S;
            }
        } while (!S.I(aVar, yVar));
        return null;
    }

    public final Object N(E e2, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        j.r b2 = j.t.b(intercepted);
        while (true) {
            if (E()) {
                l0 n0Var = this.f682j == null ? new n0(e2, b2) : new o0(e2, b2, this.f682j);
                Object k2 = k(n0Var);
                if (k2 == null) {
                    j.t.c(b2, n0Var);
                    break;
                } else if (k2 instanceof w) {
                    y(b2, e2, (w) k2);
                    break;
                } else if (k2 != l.b.f678g && !(k2 instanceof h0)) {
                    throw new IllegalStateException(("enqueueSend returned " + k2).toString());
                }
            }
            Object H = H(e2);
            if (H == l.b.f675d) {
                Result.Companion companion = Result.Companion;
                b2.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
                break;
            } else if (H != l.b.f676e) {
                if (!(H instanceof w)) {
                    throw new IllegalStateException(("offerInternal returned " + H).toString());
                }
                y(b2, e2, (w) H);
            }
        }
        Object x = b2.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [q.y] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.j0<E> O() {
        /*
            r3 = this;
            r0 = r3
            q.w r0 = r0.f683k
            r4 = r0
        L5:
            r0 = r4
            java.lang.Object r0 = r0.Q()
            q.y r0 = (q.y) r0
            r5 = r0
            r0 = r5
            r1 = r4
            if (r0 != r1) goto L17
        L12:
            r0 = 0
            r5 = r0
            goto L3e
        L17:
            r0 = r5
            boolean r0 = r0 instanceof l.j0
            if (r0 != 0) goto L21
            goto L12
        L21:
            r0 = r5
            l.j0 r0 = (l.j0) r0
            boolean r0 = r0 instanceof l.w
            if (r0 == 0) goto L35
            r0 = r5
            boolean r0 = r0.V()
            if (r0 != 0) goto L35
            goto L3e
        L35:
            r0 = r5
            q.y r0 = r0.c0()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L43
        L3e:
            r0 = r5
            l.j0 r0 = (l.j0) r0
            return r0
        L43:
            r0 = r6
            r0.U()
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.O():l.j0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [q.y] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.l0 P() {
        /*
            r3 = this;
            r0 = r3
            q.w r0 = r0.f683k
            r4 = r0
        L5:
            r0 = r4
            java.lang.Object r0 = r0.Q()
            q.y r0 = (q.y) r0
            r5 = r0
            r0 = r5
            r1 = r4
            if (r0 != r1) goto L17
        L12:
            r0 = 0
            r5 = r0
            goto L3e
        L17:
            r0 = r5
            boolean r0 = r0 instanceof l.l0
            if (r0 != 0) goto L21
            goto L12
        L21:
            r0 = r5
            l.l0 r0 = (l.l0) r0
            boolean r0 = r0 instanceof l.w
            if (r0 == 0) goto L35
            r0 = r5
            boolean r0 = r0.V()
            if (r0 != 0) goto L35
            goto L3e
        L35:
            r0 = r5
            q.y r0 = r0.c0()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L43
        L3e:
            r0 = r5
            l.l0 r0 = (l.l0) r0
            return r0
        L43:
            r0 = r6
            r0.U()
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.P():l.l0");
    }

    @Override // l.m0
    public void Q(@NotNull Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f681l;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, function1)) {
            w<?> n2 = n();
            if (n2 == null || !androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, function1, l.b.f679h)) {
                return;
            }
            function1.invoke(n2.f986m);
            return;
        }
        Object obj = this.onCloseHandler;
        if (obj == l.b.f679h) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj);
    }

    @Override // l.m0
    @NotNull
    public final Object T(E e2) {
        r.b bVar;
        w<?> wVar;
        Object a2;
        Object H = H(e2);
        if (H == l.b.f675d) {
            a2 = r.f767b.c(Unit.INSTANCE);
        } else {
            if (H == l.b.f676e) {
                wVar = n();
                if (wVar == null) {
                    return r.f767b.b();
                }
                bVar = r.f767b;
            } else if (!(H instanceof w)) {
                throw new IllegalStateException(("trySend returned " + H).toString());
            } else {
                bVar = r.f767b;
                wVar = (w) H;
            }
            a2 = bVar.a(x(wVar));
        }
        return a2;
    }

    @Override // l.m0
    @Nullable
    public final Object U(E e2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (H(e2) == l.b.f675d) {
            return Unit.INSTANCE;
        }
        Object N = N(e2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return N == coroutine_suspended ? N : Unit.INSTANCE;
    }

    @Override // l.m0
    public final boolean V() {
        return n() != null;
    }

    public final int g() {
        q.w wVar = this.f683k;
        q.y yVar = (q.y) wVar.Q();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (Intrinsics.areEqual(yVar, wVar)) {
                return i3;
            }
            int i4 = i3;
            if (yVar instanceof q.y) {
                i4 = i3 + 1;
            }
            yVar = yVar.R();
            i2 = i4;
        }
    }

    @NotNull
    public final y.b<?> h(E e2) {
        return new b(this.f683k, e2);
    }

    @NotNull
    public final d<E> j(E e2) {
        return new d<>(e2, this.f683k);
    }

    @Nullable
    public Object k(@NotNull l0 l0Var) {
        boolean z;
        q.y S;
        if (B()) {
            q.y yVar = this.f683k;
            do {
                S = yVar.S();
                if (S instanceof j0) {
                    return S;
                }
            } while (!S.I(l0Var, yVar));
            return null;
        }
        q.y yVar2 = this.f683k;
        e eVar = new e(l0Var, this);
        while (true) {
            q.y S2 = yVar2.S();
            if (!(S2 instanceof j0)) {
                int e0 = S2.e0(l0Var, yVar2, eVar);
                z = true;
                if (e0 != 1) {
                    if (e0 == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return S2;
            }
        }
        if (z) {
            return null;
        }
        return l.b.f678g;
    }

    @NotNull
    public String l() {
        return "";
    }

    @Nullable
    public final w<?> m() {
        q.y R = this.f683k.R();
        w<?> wVar = null;
        w<?> wVar2 = R instanceof w ? (w) R : null;
        if (wVar2 != null) {
            t(wVar2);
            wVar = wVar2;
        }
        return wVar;
    }

    @Nullable
    public final w<?> n() {
        q.y S = this.f683k.S();
        w<?> wVar = null;
        w<?> wVar2 = S instanceof w ? (w) S : null;
        if (wVar2 != null) {
            t(wVar2);
            wVar = wVar2;
        }
        return wVar;
    }

    @Override // l.m0
    public boolean offer(E e2) {
        d1 d2;
        try {
            return m0.a.c(this, e2);
        } catch (Throwable th) {
            Function1<E, Unit> function1 = this.f682j;
            if (function1 == null || (d2 = q.i0.d(function1, e2, null, 2, null)) == null) {
                throw th;
            }
            ExceptionsKt__ExceptionsKt.addSuppressed(d2, th);
            throw d2;
        }
    }

    @NotNull
    public final q.w r() {
        return this.f683k;
    }

    public final String s() {
        String str;
        q.y R = this.f683k.R();
        if (R == this.f683k) {
            return "EmptyQueue";
        }
        if (R instanceof w) {
            str = R.toString();
        } else if (R instanceof h0) {
            str = "ReceiveQueued";
        } else if (R instanceof l0) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + R;
        }
        q.y S = this.f683k.S();
        String str2 = str;
        if (S != R) {
            String str3 = str + ",queueSize=" + g();
            str2 = str3;
            if (S instanceof w) {
                str2 = str3 + ",closedForSend=" + S;
            }
        }
        return str2;
    }

    public final void t(w<?> wVar) {
        Object c2 = q.q.c(null, 1, null);
        while (true) {
            q.y S = wVar.S();
            h0 h0Var = S instanceof h0 ? (h0) S : null;
            if (h0Var == null) {
                break;
            } else if (h0Var.Y()) {
                c2 = q.q.h(c2, h0Var);
            } else {
                h0Var.T();
            }
        }
        if (c2 != null) {
            if (c2 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) c2;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((h0) arrayList.get(size)).i0(wVar);
                }
            } else {
                ((h0) c2).i0(wVar);
            }
        }
        K(wVar);
    }

    @NotNull
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + '{' + s() + '}' + l();
    }

    public final Throwable u(E e2, w<?> wVar) {
        d1 d2;
        t(wVar);
        Function1<E, Unit> function1 = this.f682j;
        if (function1 == null || (d2 = q.i0.d(function1, e2, null, 2, null)) == null) {
            return wVar.o0();
        }
        ExceptionsKt__ExceptionsKt.addSuppressed(d2, wVar.o0());
        throw d2;
    }

    public final Throwable x(w<?> wVar) {
        t(wVar);
        return wVar.o0();
    }

    public final void y(Continuation<?> continuation, E e2, w<?> wVar) {
        Object createFailure;
        d1 d2;
        t(wVar);
        Throwable o0 = wVar.o0();
        Function1<E, Unit> function1 = this.f682j;
        if (function1 == null || (d2 = q.i0.d(function1, e2, null, 2, null)) == null) {
            Result.Companion companion = Result.Companion;
            createFailure = ResultKt.createFailure(o0);
        } else {
            ExceptionsKt__ExceptionsKt.addSuppressed(d2, o0);
            Result.Companion companion2 = Result.Companion;
            createFailure = ResultKt.createFailure(d2);
        }
        continuation.resumeWith(Result.m5849constructorimpl(createFailure));
    }
}
