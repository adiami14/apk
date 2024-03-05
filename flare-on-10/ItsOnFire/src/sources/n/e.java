package n;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018��2\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0014\u0010\nR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Ln/e;", "", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "b", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "creationStackBottom", "", "c", "J", "f", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Ljava/util/List;", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "lastObservedThread", "lastObservedFrame", "h", "lastObservedStackTrace", "Ln/f;", "source", "<init>", "(Ln/f;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: ItsOnFire.jar:n/e.class */
public final class e {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f1029a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineStackFrame f1030b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1031c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final List<StackTraceElement> f1032d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f1033e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final Thread f1034f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final CoroutineStackFrame f1035g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public final List<StackTraceElement> f1036h;

    public e(@NotNull f fVar, @NotNull CoroutineContext coroutineContext) {
        this.f1029a = coroutineContext;
        this.f1030b = fVar.d();
        this.f1031c = fVar.f1038b;
        this.f1032d = fVar.e();
        this.f1033e = fVar.g();
        this.f1034f = fVar.f1041e;
        this.f1035g = fVar.f();
        this.f1036h = fVar.h();
    }

    @NotNull
    public final CoroutineContext a() {
        return this.f1029a;
    }

    @Nullable
    public final CoroutineStackFrame b() {
        return this.f1030b;
    }

    @NotNull
    public final List<StackTraceElement> c() {
        return this.f1032d;
    }

    @Nullable
    public final CoroutineStackFrame d() {
        return this.f1035g;
    }

    @Nullable
    public final Thread e() {
        return this.f1034f;
    }

    public final long f() {
        return this.f1031c;
    }

    @NotNull
    public final String g() {
        return this.f1033e;
    }

    @JvmName(name = "lastObservedStackTrace")
    @NotNull
    public final List<StackTraceElement> h() {
        return this.f1036h;
    }
}
