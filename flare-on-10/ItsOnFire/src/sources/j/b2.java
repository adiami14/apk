package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020��H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lj/z1;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/util/concurrent/ExecutorService;)Lj/z1;", "Ljava/util/concurrent/Executor;", "Lj/o0;", "c", "(Ljava/util/concurrent/Executor;)Lj/o0;", "b", "Lj/c2;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/b2.class */
public final class b2 {
    @c2
    public static /* synthetic */ void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 == 0) goto L11;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.concurrent.Executor b(@org.jetbrains.annotations.NotNull j.o0 r4) {
        /*
            r0 = r4
            boolean r0 = r0 instanceof j.z1
            if (r0 == 0) goto Lf
            r0 = r4
            j.z1 r0 = (j.z1) r0
            r5 = r0
            goto L11
        Lf:
            r0 = 0
            r5 = r0
        L11:
            r0 = r5
            if (r0 == 0) goto L20
            r0 = r5
            java.util.concurrent.Executor r0 = r0.q()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L29
        L20:
            j.l1 r0 = new j.l1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
        L29:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b2.b(j.o0):java.util.concurrent.Executor");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [j.o0] */
    @kotlin.jvm.JvmName(name = com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM)
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final j.o0 c(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r4) {
        /*
            r0 = r4
            boolean r0 = r0 instanceof j.l1
            if (r0 == 0) goto Lf
            r0 = r4
            j.l1 r0 = (j.l1) r0
            r5 = r0
            goto L11
        Lf:
            r0 = 0
            r5 = r0
        L11:
            r0 = r5
            if (r0 == 0) goto L20
            r0 = r5
            j.o0 r0 = r0.f513j
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L29
        L20:
            j.a2 r0 = new j.a2
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
        L29:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b2.c(java.util.concurrent.Executor):j.o0");
    }

    @JvmName(name = Constants.MessagePayloadKeys.FROM)
    @NotNull
    public static final z1 d(@NotNull ExecutorService executorService) {
        return new a2(executorService);
    }
}
