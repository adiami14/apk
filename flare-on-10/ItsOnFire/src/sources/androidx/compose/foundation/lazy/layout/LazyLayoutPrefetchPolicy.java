package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;
@Stable
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018��2\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014R%\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;", "", "()V", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-msEJaDk", "()J", "setConstraints-BRTryo0", "(J)V", "J", "prefetcher", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;", "getPrefetcher$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;", "setPrefetcher$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;)V", "removeFromPrefetch", "", FirebaseAnalytics.Param.INDEX, "", "(I)Lkotlin/Unit;", "scheduleForPrefetch", "Subscriber", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy.class */
public final class LazyLayoutPrefetchPolicy {
    private long constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    @Nullable
    private Subscriber prefetcher;

    @Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018��2\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;", "", "removeFromPrefetch", "", FirebaseAnalytics.Param.INDEX, "", "scheduleForPrefetch", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber.class */
    public interface Subscriber {
        void removeFromPrefetch(int i2);

        void scheduleForPrefetch(int i2);
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m774getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Nullable
    public final Subscriber getPrefetcher$foundation_release() {
        return this.prefetcher;
    }

    @Nullable
    public final Unit removeFromPrefetch(int i2) {
        Unit unit;
        Subscriber subscriber = this.prefetcher;
        if (subscriber == null) {
            unit = null;
        } else {
            subscriber.removeFromPrefetch(i2);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    @Nullable
    public final Unit scheduleForPrefetch(int i2) {
        Unit unit;
        Subscriber subscriber = this.prefetcher;
        if (subscriber == null) {
            unit = null;
        } else {
            subscriber.scheduleForPrefetch(i2);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    /* renamed from: setConstraints-BRTryo0  reason: not valid java name */
    public final void m775setConstraintsBRTryo0(long j2) {
        this.constraints = j2;
    }

    public final void setPrefetcher$foundation_release(@Nullable Subscriber subscriber) {
        this.prefetcher = subscriber;
    }
}
