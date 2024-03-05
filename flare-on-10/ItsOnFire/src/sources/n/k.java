package n;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.s0;
import j.t0;
import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018��2\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Ln/k;", "Ljava/io/Serializable;", "", "j", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "coroutineId", "", "k", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "dispatcher", "l", "f", "name", "m", "h", "state", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "e", "lastObservedThreadState", "o", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "lastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "p", "Ljava/util/List;", "c", "()Ljava/util/List;", "lastObservedStackTrace", "q", "J", "g", "()J", "sequenceNumber", "Ln/f;", "source", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Ln/f;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: ItsOnFire.jar:n/k.class */
public final class k implements Serializable {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final Long f1074j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f1075k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f1076l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final String f1077m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final String f1078n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public final String f1079o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public final List<StackTraceElement> f1080p;

    /* renamed from: q  reason: collision with root package name */
    public final long f1081q;

    public k(@NotNull f fVar, @NotNull CoroutineContext coroutineContext) {
        Thread.State state;
        s0 s0Var = (s0) coroutineContext.get(s0.f554k);
        this.f1074j = s0Var != null ? Long.valueOf(s0Var.v()) : null;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        this.f1075k = continuationInterceptor != null ? continuationInterceptor.toString() : null;
        t0 t0Var = (t0) coroutineContext.get(t0.f557k);
        this.f1076l = t0Var != null ? t0Var.v() : null;
        this.f1077m = fVar.g();
        Thread thread = fVar.f1041e;
        this.f1078n = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = fVar.f1041e;
        this.f1079o = thread2 != null ? thread2.getName() : null;
        this.f1080p = fVar.h();
        this.f1081q = fVar.f1038b;
    }

    @Nullable
    public final Long a() {
        return this.f1074j;
    }

    @Nullable
    public final String b() {
        return this.f1075k;
    }

    @NotNull
    public final List<StackTraceElement> c() {
        return this.f1080p;
    }

    @Nullable
    public final String d() {
        return this.f1079o;
    }

    @Nullable
    public final String e() {
        return this.f1078n;
    }

    @Nullable
    public final String f() {
        return this.f1076l;
    }

    public final long g() {
        return this.f1081q;
    }

    @NotNull
    public final String h() {
        return this.f1077m;
    }
}
