package q;

import j.z2;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lq/e0;", "", "Lj/z2;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lj/z2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/e0.class */
public final class e0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f2045a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2046b;
    @JvmField
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final z2 f2047c;

    static {
        e0 e0Var = new e0();
        f2045a = e0Var;
        f2046b = t0.e(f0.f2052a, true);
        f2047c = e0Var.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r0 == 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [j.z2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j.z2 a() {
        /*
            r5 = this;
            boolean r0 = q.e0.f2046b     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L10
            q.o r0 = q.o.f2082a     // Catch: java.lang.Throwable -> Lb3
            java.util.List r0 = r0.d()     // Catch: java.lang.Throwable -> Lb3
            r6 = r0
            goto L24
        L10:
            java.lang.Class<q.d0> r0 = q.d0.class
            java.lang.Class<q.d0> r1 = q.d0.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> Lb3
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)     // Catch: java.lang.Throwable -> Lb3
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb3
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)     // Catch: java.lang.Throwable -> Lb3
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)     // Catch: java.lang.Throwable -> Lb3
            r6 = r0
        L24:
            r0 = r6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb3
            r7 = r0
            r0 = r7
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto L39
            r0 = 0
            r8 = r0
            goto L93
        L39:
            r0 = r7
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lb3
            r8 = r0
            r0 = r7
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto L4c
            goto L93
        L4c:
            r0 = r8
            q.d0 r0 = (q.d0) r0     // Catch: java.lang.Throwable -> Lb3
            int r0 = r0.c()     // Catch: java.lang.Throwable -> Lb3
            r9 = r0
            r0 = r8
            r10 = r0
        L5a:
            r0 = r7
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lb3
            r11 = r0
            r0 = r11
            q.d0 r0 = (q.d0) r0     // Catch: java.lang.Throwable -> Lb3
            int r0 = r0.c()     // Catch: java.lang.Throwable -> Lb3
            r12 = r0
            r0 = r10
            r8 = r0
            r0 = r9
            r13 = r0
            r0 = r9
            r1 = r12
            if (r0 >= r1) goto L83
            r0 = r11
            r8 = r0
            r0 = r12
            r13 = r0
        L83:
            r0 = r8
            r10 = r0
            r0 = r13
            r9 = r0
            r0 = r7
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto L5a
        L93:
            r0 = r8
            q.d0 r0 = (q.d0) r0     // Catch: java.lang.Throwable -> Lb3
            r8 = r0
            r0 = r8
            if (r0 == 0) goto La8
            r0 = r8
            r1 = r6
            j.z2 r0 = q.f0.f(r0, r1)     // Catch: java.lang.Throwable -> Lb3
            r6 = r0
            r0 = r6
            r8 = r0
            r0 = r6
            if (r0 != 0) goto Lbc
        La8:
            r0 = 0
            r1 = 0
            r2 = 3
            r3 = 0
            q.g0 r0 = q.f0.b(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lb3
            r8 = r0
            goto Lbc
        Lb3:
            r8 = move-exception
            r0 = r8
            r1 = 0
            r2 = 2
            r3 = 0
            q.g0 r0 = q.f0.b(r0, r1, r2, r3)
            r8 = r0
        Lbc:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e0.a():j.z2");
    }
}
