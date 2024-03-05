package q;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.o0;
@Metadata(bv = {}, d1 = {"��*\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b \u0018��*\u000e\b��\u0010\u0001*\b\u0012\u0004\u0012\u00028��0��2\b\u0012\u0004\u0012\u00028��0\u0002B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00018��\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H��¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H��¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u001a"}, d2 = {"Lq/o0;", "S", "Lq/h;", "", "r", "()Z", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "", "q", "()V", "", "c", "J", "o", "()J", "id", "", "p", "()I", "maxSlots", "g", "removed", "prev", "pointers", "<init>", "(JLq/o0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/o0.class */
public abstract class o0<S extends o0<S>> extends h<S> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2084d = AtomicIntegerFieldUpdater.newUpdater(o0.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f2085c;
    @NotNull
    private volatile /* synthetic */ int cleanedAndPointers;

    public o0(long j2, @Nullable S s2, int i2) {
        super(s2);
        this.f2085c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // q.h
    public boolean g() {
        return this.cleanedAndPointers == p() && !i();
    }

    public final boolean n() {
        return f2084d.addAndGet(this, SupportMenu.CATEGORY_MASK) == p() && !i();
    }

    public final long o() {
        return this.f2085c;
    }

    public abstract int p();

    public final void q() {
        if (f2084d.incrementAndGet(this) != p() || i()) {
            return;
        }
        l();
    }

    public final boolean r() {
        boolean z;
        while (true) {
            int i2 = this.cleanedAndPointers;
            z = false;
            if (!(i2 != p() || i())) {
                break;
            } else if (f2084d.compareAndSet(this, i2, 65536 + i2)) {
                z = true;
                break;
            }
        }
        return z;
    }
}
