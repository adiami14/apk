package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018��2\u00020\u0001BC\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010(\u001a\u00020\tH\u0002J\r\u0010)\u001a\u00020\tH��¢\u0006\u0002\b*J'\u0010)\u001a\u0002H+\"\u0004\b��\u0010+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H+0-H\u0080\bø\u0001��¢\u0006\u0004\b*\u0010.J\b\u0010/\u001a\u000200H\u0016J\r\u00101\u001a\u00020\tH\u0010¢\u0006\u0002\b2J\b\u00103\u001a\u00020\tH\u0016J\b\u00104\u001a\u00020\rH\u0016J3\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u00032\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000209\u0018\u0001082\u0006\u0010:\u001a\u00020\u0005H��¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0001H\u0010¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0001H\u0010¢\u0006\u0002\b@J\r\u0010A\u001a\u00020\tH\u0010¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u0014H\u0010¢\u0006\u0002\bEJ\u0015\u0010F\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H��¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0005H��¢\u0006\u0002\bIJ8\u0010J\u001a\u00020��2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\u001e\u0010K\u001a\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\r\u0010L\u001a\u00020\tH��¢\u0006\u0002\bMR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R4\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013@VX\u0090\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n��\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000fR\u0014\u0010#\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n��R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n��\u001a\u0004\b'\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006N"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applied", "", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "<set-?>", "", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "getModified$runtime_release", "()Ljava/util/Set;", "setModified", "(Ljava/util/Set;)V", "previousIds", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshots", "getWriteObserver$runtime_release", "abandon", "advance", "advance$runtime_release", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "close", "close$runtime_release", "dispose", "hasPendingChanges", "innerApply", "snapshotId", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "invalidSnapshots", "innerApply$runtime_release", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "recordPrevious", "recordPrevious$runtime_release", "recordPreviousList", "recordPreviousList$runtime_release", "takeNestedMutableSnapshot", "takeNestedSnapshot", "validateNotApplied", "validateNotApplied$runtime_release", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/MutableSnapshot.class */
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    private boolean applied;
    @Nullable
    private Set<StateObject> modified;
    @NotNull
    private SnapshotIdSet previousIds;
    @Nullable
    private final Function1<Object, Unit> readObserver;
    private int snapshots;
    @Nullable
    private final Function1<Object, Unit> writeObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSnapshot(int i2, @NotNull SnapshotIdSet invalid, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12) {
        super(i2, invalid, null);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.snapshots = 1;
    }

    private final void abandon() {
        boolean contains;
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied$runtime_release();
            setModified(null);
            int id = getId();
            for (StateObject stateObject : modified$runtime_release) {
                StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                while (true) {
                    StateRecord stateRecord = firstStateRecord;
                    if (stateRecord != null) {
                        if (stateRecord.getSnapshotId$runtime_release() != id) {
                            contains = CollectionsKt___CollectionsKt.contains(this.previousIds, Integer.valueOf(stateRecord.getSnapshotId$runtime_release()));
                            if (!contains) {
                                firstStateRecord = stateRecord.getNext$runtime_release();
                            }
                        }
                        stateRecord.setSnapshotId$runtime_release(0);
                        firstStateRecord = stateRecord.getNext$runtime_release();
                    }
                }
            }
        }
        close$runtime_release();
    }

    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            if ((i2 & 2) != 0) {
                function12 = null;
            }
            return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
    }

    public final <T> T advance$runtime_release(@NotNull Function0<? extends T> block) {
        int i2;
        SnapshotIdSet snapshotIdSet;
        Intrinsics.checkNotNullParameter(block, "block");
        recordPrevious$runtime_release(getId());
        T invoke = block.invoke();
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            try {
                i2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i2 + 1;
                setId$runtime_release(i2);
                snapshotIdSet = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet.set(getId());
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        return invoke;
    }

    public final void advance$runtime_release() {
        int i2;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getId());
        Unit unit = Unit.INSTANCE;
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            setId$runtime_release(i2);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b A[LOOP:0: B:35:0x0134->B:37:0x013b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178 A[LOOP:1: B:43:0x0171->B:45:0x0178, LOOP_END] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void close$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        synchronized (SnapshotKt.getLock()) {
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.clear(getId()).andNot(getPreviousIds$runtime_release());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        mo2027nestedDeactivated$runtime_release(this);
    }

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Set<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    @NotNull
    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        Set<StateObject> modified$runtime_release;
        boolean z = false;
        if (getModified$runtime_release() != null && (!modified$runtime_release.isEmpty())) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
        r0 = androidx.compose.runtime.snapshots.SnapshotKt.readable(r0, getId(), r0);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.SnapshotApplyResult innerApply$runtime_release(int r6, @org.jetbrains.annotations.Nullable java.util.Map<androidx.compose.runtime.snapshots.StateRecord, ? extends androidx.compose.runtime.snapshots.StateRecord> r7, @org.jetbrains.annotations.NotNull androidx.compose.runtime.snapshots.SnapshotIdSet r8) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.innerApply$runtime_release(int, java.util.Map, androidx.compose.runtime.snapshots.SnapshotIdSet):androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo2026nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo2027nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i2 = this.snapshots;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i2 - 1;
        this.snapshots = i3;
        if (i3 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed$runtime_release()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo2029recordModified$runtime_release(@NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        HashSet hashSet = modified$runtime_release;
        if (modified$runtime_release == null) {
            hashSet = new HashSet();
            setModified(hashSet);
        }
        hashSet.add(state);
    }

    public final void recordPrevious$runtime_release(int i2) {
        synchronized (SnapshotKt.getLock()) {
            setPreviousIds$runtime_release(getPreviousIds$runtime_release().set(i2));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime_release(@NotNull SnapshotIdSet snapshots) {
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        synchronized (SnapshotKt.getLock()) {
            setPreviousIds$runtime_release(getPreviousIds$runtime_release().or(snapshots));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setApplied$runtime_release(boolean z) {
        this.applied = z;
    }

    public void setModified(@Nullable Set<StateObject> set) {
        this.modified = set;
    }

    public final void setPreviousIds$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<set-?>");
        this.previousIds = snapshotIdSet;
    }

    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12) {
        int i2;
        SnapshotIdSet snapshotIdSet;
        NestedMutableSnapshot nestedMutableSnapshot;
        Function1 mergedReadObserver;
        Function1 mergedWriteObserver;
        int i3;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotApplied$runtime_release();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(i2);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(i2));
            SnapshotIdSet addRange = SnapshotKt.addRange(invalid$runtime_release, getId() + 1, i2);
            mergedReadObserver = SnapshotKt.mergedReadObserver(function1, getReadObserver$runtime_release());
            mergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime_release());
            nestedMutableSnapshot = new NestedMutableSnapshot(i2, addRange, mergedReadObserver, mergedWriteObserver, this);
        }
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            i3 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i3 + 1;
            setId$runtime_release(i3);
            snapshotIdSet2 = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet2.set(getId());
            Unit unit = Unit.INSTANCE;
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> function1) {
        int i2;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        int i3;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotApplied$runtime_release();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(i2);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i2, SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, i2), function1, this);
        }
        int id2 = getId();
        synchronized (SnapshotKt.getLock()) {
            i3 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i3 + 1;
            setId$runtime_release(i3);
            snapshotIdSet2 = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet2.set(getId());
            Unit unit = Unit.INSTANCE;
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        return nestedReadonlySnapshot;
    }

    public final void validateNotApplied$runtime_release() {
        if (!(!this.applied)) {
            throw new IllegalArgumentException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }
}
