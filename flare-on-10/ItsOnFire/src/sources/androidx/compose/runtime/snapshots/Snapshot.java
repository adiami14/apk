package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\b7\u0018�� ?2\u00020\u0001:\u0001?B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010'\u001a\u00020\u001dH\u0010¢\u0006\u0002\b(J\b\u0010)\u001a\u00020\u001dH\u0016J%\u0010*\u001a\u0002H+\"\u0004\b��\u0010+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H+0-H\u0086\bø\u0001��¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\bH&J\n\u00100\u001a\u0004\u0018\u00010��H\u0011J\u0015\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020��H ¢\u0006\u0002\b3J\u0015\u00104\u001a\u00020\u001d2\u0006\u00102\u001a\u00020��H ¢\u0006\u0002\b5J\r\u00106\u001a\u00020\u001dH ¢\u0006\u0002\b7J\u0015\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u0018H ¢\u0006\u0002\b:J\u0012\u0010;\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u00010��H\u0011J \u0010<\u001a\u00020��2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH&J\r\u0010=\u001a\u00020\u001dH��¢\u0006\u0002\b>R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003@PX\u0096\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0090\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X \u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX \u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010 \u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\nR\u0012\u0010\"\u001a\u00020��X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R \u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX \u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001f\u0082\u0001\u0003@AB\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "disposed", "", "getDisposed$runtime_release", "()Z", "setDisposed$runtime_release", "(Z)V", "<set-?>", "getId", "()I", "setId$runtime_release", "(I)V", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "modified", "", "Landroidx/compose/runtime/snapshots/StateObject;", "getModified$runtime_release", "()Ljava/util/Set;", "readObserver", "Lkotlin/Function1;", "", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "getWriteObserver$runtime_release", "close", "close$runtime_release", "dispose", "enter", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasPendingChanges", "makeCurrent", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "restoreCurrent", "takeNestedSnapshot", "validateNotDisposed", "validateNotDisposed$runtime_release", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/Snapshot.class */
public abstract class Snapshot {
    private boolean disposed;
    private int id;
    @NotNull
    private SnapshotIdSet invalid;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"��L\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0007\u001a\u0002H\b\"\u0004\b��\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0086\bø\u0001��¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJO\u0010\u000e\u001a\u0002H\b\"\u0004\b��\u0010\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0007J&\u0010\u0015\u001a\u00020\u00162\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0018J\u001a\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0010J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0001J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0001J\u0006\u0010\u001e\u001a\u00020\rJ6\u0010\u001f\u001a\u00020 2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010J\u001e\u0010!\u001a\u00020\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010J%\u0010\"\u001a\u0002H#\"\u0004\b��\u0010#2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\nH\u0086\bø\u0001��¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "()V", "current", "Landroidx/compose/runtime/snapshots/Snapshot;", "getCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "global", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "notifyObjectsInitialized", "", "observe", "readObserver", "Lkotlin/Function1;", "writeObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "openSnapshotCount", "", "registerApplyObserver", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "observer", "Lkotlin/Function2;", "", "registerGlobalWriteObserver", "removeCurrent", "restoreCurrent", "previous", "sendApplyNotifications", "takeMutableSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeSnapshot", "withMutableSnapshot", "R", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/Snapshot$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object observe$default(Companion companion, Function1 function1, Function1 function12, Function0 function0, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            if ((i2 & 2) != 0) {
                function12 = null;
            }
            return companion.observe(function1, function12, function0);
        }

        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, Function1 function1, Function1 function12, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            if ((i2 & 2) != 0) {
                function12 = null;
            }
            return companion.takeMutableSnapshot(function1, function12);
        }

        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, Function1 function1, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            return companion.takeSnapshot(function1);
        }

        @NotNull
        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final <T> T global(@NotNull Function0<? extends T> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Snapshot removeCurrent = removeCurrent();
            T invoke = block.invoke();
            Snapshot.Companion.restoreCurrent(removeCurrent);
            return invoke;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12, @NotNull Function0<? extends T> block) {
            SnapshotThreadLocal snapshotThreadLocal;
            TransparentObserverMutableSnapshot transparentObserverMutableSnapshot;
            Intrinsics.checkNotNullParameter(block, "block");
            if (function1 == null && function12 == null) {
                return block.invoke();
            }
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, function1, function12);
            } else if (function1 == null) {
                return block.invoke();
            } else {
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(function1);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                T invoke = block.invoke();
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                transparentObserverMutableSnapshot.dispose();
                return invoke;
            } catch (Throwable th) {
                transparentObserverMutableSnapshot.dispose();
                throw th;
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            SnapshotIdSet snapshotIdSet;
            List list;
            snapshotIdSet = SnapshotKt.openSnapshots;
            list = CollectionsKt___CollectionsKt.toList(snapshotIdSet);
            return list.size();
        }

        @NotNull
        public final ObserverHandle registerApplyObserver(@NotNull final Function2<? super Set<? extends Object>, ? super Snapshot, Unit> observer) {
            Function1 function1;
            List list;
            Intrinsics.checkNotNullParameter(observer, "observer");
            function1 = SnapshotKt.emptyLambda;
            SnapshotKt.advanceGlobalSnapshot(function1);
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.applyObservers;
                list.add(observer);
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$registerApplyObserver$2
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    List list2;
                    Function2<Set<? extends Object>, Snapshot, Unit> function2 = observer;
                    synchronized (SnapshotKt.getLock()) {
                        list2 = SnapshotKt.applyObservers;
                        list2.remove(function2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            };
        }

        @NotNull
        public final ObserverHandle registerGlobalWriteObserver(@NotNull final Function1<Object, Unit> observer) {
            List list;
            Intrinsics.checkNotNullParameter(observer, "observer");
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.globalWriteObservers;
                list.add(observer);
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$registerGlobalWriteObserver$2
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    List list2;
                    Function1<Object, Unit> function1 = observer;
                    synchronized (SnapshotKt.getLock()) {
                        list2 = SnapshotKt.globalWriteObservers;
                        list2.remove(function1);
                    }
                    SnapshotKt.advanceGlobalSnapshot();
                }
            };
        }

        @PublishedApi
        @Nullable
        public final Snapshot removeCurrent() {
            SnapshotThreadLocal snapshotThreadLocal;
            SnapshotThreadLocal snapshotThreadLocal2;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot != null) {
                snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
                snapshotThreadLocal2.set(null);
            }
            return snapshot;
        }

        @PublishedApi
        public final void restoreCurrent(@Nullable Snapshot snapshot) {
            SnapshotThreadLocal snapshotThreadLocal;
            if (snapshot != null) {
                snapshotThreadLocal = SnapshotKt.threadSnapshot;
                snapshotThreadLocal.set(snapshot);
            }
        }

        public final void sendApplyNotifications() {
            AtomicReference atomicReference;
            Set<StateObject> modified$runtime_release;
            boolean z;
            synchronized (SnapshotKt.getLock()) {
                atomicReference = SnapshotKt.currentGlobalSnapshot;
                z = false;
                if (((GlobalSnapshot) atomicReference.get()).getModified$runtime_release() != null) {
                    if (!modified$runtime_release.isEmpty()) {
                        z = true;
                    }
                }
            }
            if (z) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        @NotNull
        public final MutableSnapshot takeMutableSnapshot(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12) {
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            MutableSnapshot takeNestedMutableSnapshot = mutableSnapshot == null ? null : mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
            if (takeNestedMutableSnapshot != null) {
                return takeNestedMutableSnapshot;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        @NotNull
        public final Snapshot takeSnapshot(@Nullable Function1<Object, Unit> function1) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(function1);
        }

        public final <R> R withMutableSnapshot(@NotNull Function0<? extends R> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                R invoke = block.invoke();
                InlineMarker.finallyStart(1);
                takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                InlineMarker.finallyEnd(1);
                takeMutableSnapshot$default.apply().check();
                InlineMarker.finallyStart(1);
                takeMutableSnapshot$default.dispose();
                InlineMarker.finallyEnd(1);
                return invoke;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                takeMutableSnapshot$default.dispose();
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    private Snapshot(int i2, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.id = i2;
    }

    public /* synthetic */ Snapshot(int i2, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, snapshotIdSet);
    }

    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            return snapshot.takeNestedSnapshot(function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
    }

    public void close$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        synchronized (SnapshotKt.getLock()) {
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.clear(getId());
            Unit unit = Unit.INSTANCE;
        }
    }

    public void dispose() {
        this.disposed = true;
    }

    public final <T> T enter(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Snapshot makeCurrent = makeCurrent();
        try {
            T invoke = block.invoke();
            InlineMarker.finallyStart(1);
            restoreCurrent(makeCurrent);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            restoreCurrent(makeCurrent);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return this.id;
    }

    @NotNull
    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    @Nullable
    public abstract Set<StateObject> getModified$runtime_release();

    @Nullable
    public abstract Function1<Object, Unit> getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    @NotNull
    public abstract Snapshot getRoot();

    @Nullable
    public abstract Function1<Object, Unit> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    @PublishedApi
    @Nullable
    public Snapshot makeCurrent() {
        SnapshotThreadLocal snapshotThreadLocal;
        SnapshotThreadLocal snapshotThreadLocal2;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
        snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
        snapshotThreadLocal2.set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo2026nestedActivated$runtime_release(@NotNull Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo2027nestedDeactivated$runtime_release(@NotNull Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo2029recordModified$runtime_release(@NotNull StateObject stateObject);

    @PublishedApi
    public void restoreCurrent(@Nullable Snapshot snapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        snapshotThreadLocal.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z) {
        this.disposed = z;
    }

    public void setId$runtime_release(int i2) {
        this.id = i2;
    }

    public void setInvalid$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<set-?>");
        this.invalid = snapshotIdSet;
    }

    @NotNull
    public abstract Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> function1);

    public final void validateNotDisposed$runtime_release() {
        if (!(!this.disposed)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}
