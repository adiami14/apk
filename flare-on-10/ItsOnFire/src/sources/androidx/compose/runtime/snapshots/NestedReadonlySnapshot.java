package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import java.util.HashSet;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u000b\b��\u0018��2\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u0015\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0001H\u0010¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0001H\u0010¢\u0006\u0002\b%J\r\u0010&\u001a\u00020\tH\u0010¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u000eH\u0010¢\u0006\u0002\b*J\u001e\u0010+\u001a\u00020��2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016R(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\"\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015¨\u0006,"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "parent", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/Snapshot;)V", "modified", "Ljava/util/HashSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "Lkotlin/collections/HashSet;", "getModified$runtime_release", "()Ljava/util/HashSet;", "getParent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "", "getReadOnly", "()Z", "root", "getRoot", "writeObserver", "getWriteObserver$runtime_release", "dispose", "hasPendingChanges", "nestedActivated", "", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/NestedReadonlySnapshot.class */
public final class NestedReadonlySnapshot extends Snapshot {
    @NotNull
    private final Snapshot parent;
    @Nullable
    private final Function1<Object, Unit> readObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i2, @NotNull SnapshotIdSet invalid, @Nullable final Function1<Object, Unit> function1, @NotNull Snapshot parent) {
        super(i2, invalid, null);
        Function1<Object, Unit> function12;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        parent.mo2026nestedActivated$runtime_release(this);
        if (function1 == null) {
            function12 = null;
        } else {
            final Function1<Object, Unit> readObserver$runtime_release = getParent().getReadObserver$runtime_release();
            function12 = readObserver$runtime_release != null ? new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.NestedReadonlySnapshot$readObserver$1$1$1
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
                public final void invoke2(@NotNull Object state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    function1.invoke(state);
                    readObserver$runtime_release.invoke(state);
                }
            } : function1;
        }
        this.readObserver = function12 == null ? parent.getReadObserver$runtime_release() : function12;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        if (getId() != this.parent.getId()) {
            close$runtime_release();
        }
        this.parent.mo2027nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public HashSet<StateObject> getModified$runtime_release() {
        return null;
    }

    @NotNull
    public final Snapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* renamed from: nestedActivated$runtime_release */
    public Void mo2026nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* renamed from: nestedDeactivated$runtime_release */
    public Void mo2027nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* renamed from: recordModified$runtime_release */
    public Void mo2029recordModified$runtime_release(@NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public NestedReadonlySnapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> function1) {
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), function1, this.parent);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public /* bridge */ /* synthetic */ Snapshot takeNestedSnapshot(Function1 function1) {
        return takeNestedSnapshot((Function1<Object, Unit>) function1);
    }
}
