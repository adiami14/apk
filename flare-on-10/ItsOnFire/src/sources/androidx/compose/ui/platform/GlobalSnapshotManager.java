package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.snapshots.Snapshot;
import j.l;
import j.v0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.n;
import l.q;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\bÀ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "()V", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ensureStarted", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/GlobalSnapshotManager.class */
public final class GlobalSnapshotManager {
    @NotNull
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    @NotNull
    private static final AtomicBoolean started = new AtomicBoolean(false);

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final n d2 = q.d(-1, null, null, 6, null);
            l.f(v0.a(AndroidUiDispatcher.Companion.getMain()), null, null, new GlobalSnapshotManager$ensureStarted$1(d2, null), 3, null);
            Snapshot.Companion.registerGlobalWriteObserver(new Function1<Object, Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    d2.T(Unit.INSTANCE);
                }
            });
        }
    }
}
