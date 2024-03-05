package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0001\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\b��\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\nH\u0010¢\u0006\u0002\b\u0013J4\u0010\u0014\u001a\u00020\u00012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016J\u001e\u0010\u0019\u001a\u00020\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "", "nestedActivated", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "takeNestedMutableSnapshot", "readObserver", "Lkotlin/Function1;", "", "writeObserver", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/GlobalSnapshot.class */
public final class GlobalSnapshot extends MutableSnapshot {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GlobalSnapshot(int r7, @org.jetbrains.annotations.NotNull androidx.compose.runtime.snapshots.SnapshotIdSet r8) {
        /*
            r6 = this;
            r0 = r8
            java.lang.String r1 = "invalid"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            r9 = r0
            r0 = r9
            monitor-enter(r0)
            java.util.List r0 = androidx.compose.runtime.snapshots.SnapshotKt.access$getGlobalWriteObservers$p()     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5c
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L24
            java.util.List r0 = androidx.compose.runtime.snapshots.SnapshotKt.access$getGlobalWriteObservers$p()     // Catch: java.lang.Throwable -> L5c
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)     // Catch: java.lang.Throwable -> L5c
            r10 = r0
            goto L27
        L24:
            r0 = 0
            r10 = r0
        L27:
            r0 = r10
            if (r0 != 0) goto L32
            r0 = 0
            r11 = r0
            goto L50
        L32:
            r0 = r10
            java.lang.Object r0 = kotlin.collections.CollectionsKt.singleOrNull(r0)     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch: java.lang.Throwable -> L5c
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L50
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r0 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch: java.lang.Throwable -> L5c
            r1 = r0
            r2 = r10
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            r11 = r0
        L50:
            r0 = r9
            monitor-exit(r0)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = r11
            r0.<init>(r1, r2, r3, r4)
            return
        L5c:
            r8 = move-exception
            r0 = r9
            monitor-exit(r0)
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* renamed from: nestedActivated$runtime_release */
    public Void mo2026nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* renamed from: nestedDeactivated$runtime_release */
    public Void mo2027nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.access$advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable final Function1<Object, Unit> function1, @Nullable final Function1<Object, Unit> function12) {
        return (MutableSnapshot) SnapshotKt.access$takeNewSnapshot(new Function1<SnapshotIdSet, MutableSnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final MutableSnapshot invoke(@NotNull SnapshotIdSet invalid) {
                int i2;
                Intrinsics.checkNotNullParameter(invalid, "invalid");
                synchronized (SnapshotKt.getLock()) {
                    i2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i2 + 1;
                }
                return new MutableSnapshot(i2, invalid, function1, function12);
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable final Function1<Object, Unit> function1) {
        return SnapshotKt.access$takeNewSnapshot(new Function1<SnapshotIdSet, ReadonlySnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ReadonlySnapshot invoke(@NotNull SnapshotIdSet invalid) {
                int i2;
                Intrinsics.checkNotNullParameter(invalid, "invalid");
                synchronized (SnapshotKt.getLock()) {
                    i2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i2 + 1;
                }
                return new ReadonlySnapshot(i2, invalid, function1);
            }
        });
    }
}
