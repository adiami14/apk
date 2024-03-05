package p;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p.d;
@Metadata(bv = {}, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018��*\f\b��\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010\u0005\u001a\u00028��H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018��0\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028��H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028��H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u000e0\u0011H\u0084\bR>\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018��\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018��\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lp/b;", "Lp/d;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "j", "()Lp/d;", "", "size", "", "k", "(I)[Lp/d;", "i", "slot", "", "m", "(Lp/d;)V", "Lkotlin/Function1;", "block", "l", "<set-?>", "[Lp/d;", "o", "()[Lp/d;", "getSlots$annotations", "()V", "slots", "I", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "()I", "nCollectors", "nextIndex", "Lp/a0;", "Lp/a0;", "_subscriptionCount", "Lo/t0;", "h", "()Lo/t0;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:p/b.class */
public abstract class b<S extends d<?>> {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public S[] f1856j;

    /* renamed from: k  reason: collision with root package name */
    public int f1857k;

    /* renamed from: l  reason: collision with root package name */
    public int f1858l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public a0 f1859m;

    public static final /* synthetic */ int e(b bVar) {
        return bVar.f1857k;
    }

    public static final /* synthetic */ d[] f(b bVar) {
        return bVar.f1856j;
    }

    public static /* synthetic */ void p() {
    }

    @NotNull
    public final t0<Integer> h() {
        a0 a0Var;
        synchronized (this) {
            a0 a0Var2 = this.f1859m;
            a0Var = a0Var2;
            if (a0Var2 == null) {
                a0Var = new a0(this.f1857k);
                this.f1859m = a0Var;
            }
        }
        return a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [p.d[]] */
    @NotNull
    public final S i() {
        S[] sArr;
        S s2;
        int i2;
        a0 a0Var;
        synchronized (this) {
            S[] sArr2 = this.f1856j;
            if (sArr2 == null) {
                sArr = k(2);
                this.f1856j = sArr;
            } else {
                sArr = sArr2;
                if (this.f1857k >= sArr2.length) {
                    Object[] copyOf = Arrays.copyOf(sArr2, sArr2.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    this.f1856j = (S[]) ((d[]) copyOf);
                    sArr = (d[]) copyOf;
                }
            }
            int i3 = this.f1858l;
            do {
                S s3 = sArr[i3];
                s2 = s3;
                if (s3 == null) {
                    s2 = j();
                    sArr[i3] = s2;
                }
                int i4 = i3 + 1;
                i2 = i4;
                if (i4 >= sArr.length) {
                    i2 = 0;
                }
                i3 = i2;
            } while (!s2.a(this));
            this.f1858l = i2;
            this.f1857k++;
            a0Var = this.f1859m;
        }
        if (a0Var != null) {
            a0Var.f0(1);
        }
        return s2;
    }

    @NotNull
    public abstract S j();

    @NotNull
    public abstract S[] k(int i2);

    public final void l(@NotNull Function1<? super S, Unit> function1) {
        d[] dVarArr;
        if (this.f1857k == 0 || (dVarArr = this.f1856j) == null) {
            return;
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                function1.invoke(dVar);
            }
        }
    }

    public final void m(@NotNull S s2) {
        a0 a0Var;
        int i2;
        Continuation<Unit>[] b2;
        synchronized (this) {
            int i3 = this.f1857k - 1;
            this.f1857k = i3;
            a0Var = this.f1859m;
            if (i3 == 0) {
                this.f1858l = 0;
            }
            b2 = s2.b(this);
        }
        for (Continuation<Unit> continuation : b2) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            }
        }
        if (a0Var != null) {
            a0Var.f0(-1);
        }
    }

    public final int n() {
        return this.f1857k;
    }

    @Nullable
    public final S[] o() {
        return this.f1856j;
    }
}
