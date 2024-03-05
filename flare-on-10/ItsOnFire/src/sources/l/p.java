package l;

import androidx.appcompat.R;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u0012\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018��*\u0006\b��\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028��H\u0097@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028��H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Ll/p;", "E", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/p.class */
public interface p<E> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:l/p$a.class */
    public static final class a {

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = "next", n = {"this"}, s = {"L$0"})
        /* renamed from: l.p$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:l/p$a$a.class */
        public static final class C0056a<E> extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f746j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f747k;

            /* renamed from: l  reason: collision with root package name */
            public int f748l;

            public C0056a(Continuation<? super C0056a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f747k = obj;
                this.f748l |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @kotlin.jvm.JvmName(name = "next")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(l.p r4, kotlin.coroutines.Continuation r5) {
            /*
                r0 = r5
                boolean r0 = r0 instanceof l.p.a.C0056a
                if (r0 == 0) goto L25
                r0 = r5
                l.p$a$a r0 = (l.p.a.C0056a) r0
                r6 = r0
                r0 = r6
                int r0 = r0.f748l
                r7 = r0
                r0 = r7
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L25
                r0 = r6
                r1 = r7
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f748l = r1
                r0 = r6
                r5 = r0
                goto L2e
            L25:
                l.p$a$a r0 = new l.p$a$a
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                r5 = r0
            L2e:
                r0 = r5
                java.lang.Object r0 = r0.f747k
                r6 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r5
                int r0 = r0.f748l
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L61
                r0 = r7
                r1 = 1
                if (r0 != r1) goto L57
                r0 = r5
                java.lang.Object r0 = r0.f746j
                l.p r0 = (l.p) r0
                r4 = r0
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r6
                r5 = r0
                goto L82
            L57:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L61:
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                r1 = r4
                r0.f746j = r1
                r0 = r5
                r1 = 1
                r0.f748l = r1
                r0 = r4
                r1 = r5
                java.lang.Object r0 = r0.a(r1)
                r6 = r0
                r0 = r6
                r5 = r0
                r0 = r6
                r1 = r8
                if (r0 != r1) goto L82
                r0 = r8
                return r0
            L82:
                r0 = r5
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L93
                r0 = r4
                java.lang.Object r0 = r0.next()
                return r0
            L93:
                l.x r0 = new l.x
                r1 = r0
                java.lang.String r2 = "Channel was closed"
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: l.p.a.a(l.p, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Nullable
    Object a(@NotNull Continuation<? super Boolean> continuation);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @JvmName(name = "next")
    /* synthetic */ Object b(Continuation continuation);

    E next();
}
