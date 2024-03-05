package j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0003\n\u0002\b\u0005\b��\u0018��2\u00020\u0001B%\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lj/u;", "Lj/e0;", "", "c", "()Z", "Lkotlin/coroutines/Continuation;", "continuation", "", "cause", "handled", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/u.class */
public final class u extends e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f562c = AtomicIntegerFieldUpdater.newUpdater(u.class, "_resumed");
    @NotNull
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5, @org.jetbrains.annotations.Nullable java.lang.Throwable r6, boolean r7) {
        /*
            r4 = this;
            r0 = r6
            r8 = r0
            r0 = r6
            if (r0 != 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Continuation "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r1 = " was cancelled normally"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r8 = r0
        L30:
            r0 = r4
            r1 = r8
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = 0
            r0._resumed = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.u.<init>(kotlin.coroutines.Continuation, java.lang.Throwable, boolean):void");
    }

    public final boolean c() {
        return f562c.compareAndSet(this, 0, 1);
    }
}
