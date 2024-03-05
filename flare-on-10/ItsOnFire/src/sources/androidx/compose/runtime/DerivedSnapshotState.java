package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��B\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018��*\u0004\b��\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001#B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0005¢\u0006\u0002\u0010\u0006J2\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028��0\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028��0\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0005X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0007\u001a\u00028��8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u0004\u0018\u00018��8G¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u0013X\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00028��8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\t¨\u0006$"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/DerivedState;", "calculation", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "dependencies", "", "getDependencies", "()Ljava/util/Set;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "value", "getValue", "currentRecord", "readable", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "displayValue", "", "prependStateRecord", "", "toString", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/DerivedSnapshotState.class */
public final class DerivedSnapshotState<T> implements StateObject, DerivedState<T> {
    @NotNull
    private final Function0<T> calculation;
    @NotNull
    private ResultRecord<T> first;

    @Metadata(d1 = {"��B\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018��*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010 \u001a\u00020!J\u001a\u0010\"\u001a\u00020\u00132\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010 \u001a\u00020!R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00018\u0001X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "()V", "dependencies", "Ljava/util/HashSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "Lkotlin/collections/HashSet;", "getDependencies", "()Ljava/util/HashSet;", "setDependencies", "(Ljava/util/HashSet;)V", "result", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "resultHash", "", "getResultHash", "()I", "setResultHash", "(I)V", "assign", "", "value", "create", "isValid", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readableHash", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/DerivedSnapshotState$ResultRecord.class */
    public static final class ResultRecord<T> extends StateRecord {
        @Nullable
        private HashSet<StateObject> dependencies;
        @Nullable
        private T result;
        private int resultHash;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ResultRecord resultRecord = (ResultRecord) value;
            this.dependencies = resultRecord.dependencies;
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new ResultRecord();
        }

        @Nullable
        public final HashSet<StateObject> getDependencies() {
            return this.dependencies;
        }

        @Nullable
        public final T getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final boolean isValid(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            return this.result != null && this.resultHash == readableHash(derivedState, snapshot);
        }

        public final int readableHash(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            HashSet<StateObject> dependencies;
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            int i2 = 7;
            int i3 = 7;
            if (dependencies != null) {
                PersistentList persistentList = (PersistentList) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
                PersistentList persistentList2 = persistentList;
                if (persistentList == null) {
                    persistentList2 = ExtensionsKt.persistentListOf();
                }
                int size = persistentList2.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    ((Function1) ((Pair) persistentList2.get(i5)).component1()).invoke(derivedState);
                }
                try {
                    Iterator<StateObject> it = dependencies.iterator();
                    while (it.hasNext()) {
                        StateObject stateObject = it.next();
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        Intrinsics.checkNotNullExpressionValue(stateObject, "stateObject");
                        StateRecord readable = SnapshotKt.readable(firstStateRecord, stateObject, snapshot);
                        i2 = (((i2 * 31) + ActualJvm_jvmKt.identityHashCode(readable)) * 31) + readable.getSnapshotId$runtime_release();
                    }
                    Unit unit = Unit.INSTANCE;
                    int size2 = persistentList2.size();
                    while (true) {
                        i3 = i2;
                        if (i4 >= size2) {
                            break;
                        }
                        ((Function1) ((Pair) persistentList2.get(i4)).component2()).invoke(derivedState);
                        i4++;
                    }
                } catch (Throwable th) {
                    int size3 = persistentList2.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        ((Function1) ((Pair) persistentList2.get(i6)).component2()).invoke(derivedState);
                    }
                    throw th;
                }
            }
            return i3;
        }

        public final void setDependencies(@Nullable HashSet<StateObject> hashSet) {
            this.dependencies = hashSet;
        }

        public final void setResult(@Nullable T t2) {
            this.result = t2;
        }

        public final void setResultHash(int i2) {
            this.resultHash = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(@NotNull Function0<? extends T> calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.calculation = calculation;
        this.first = new ResultRecord<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, Function0<? extends T> function0) {
        SnapshotThreadLocal snapshotThreadLocal;
        SnapshotThreadLocal snapshotThreadLocal2;
        Snapshot.Companion companion;
        ResultRecord<T> resultRecord2;
        SnapshotThreadLocal snapshotThreadLocal3;
        if (resultRecord.isValid(this, snapshot)) {
            return resultRecord;
        }
        snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning;
        Boolean bool = (Boolean) snapshotThreadLocal.get();
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        final HashSet hashSet = new HashSet();
        PersistentList persistentList = (PersistentList) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
        PersistentList persistentList2 = persistentList;
        if (persistentList == null) {
            persistentList2 = ExtensionsKt.persistentListOf();
        }
        int size = persistentList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Function1) ((Pair) persistentList2.get(i2)).component1()).invoke(this);
        }
        if (!booleanValue) {
            try {
                snapshotThreadLocal2 = SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning;
                snapshotThreadLocal2.set(Boolean.TRUE);
            } catch (Throwable th) {
                int size2 = persistentList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((Function1) ((Pair) persistentList2.get(i3)).component2()).invoke(this);
                }
                throw th;
            }
        }
        Object observe = Snapshot.Companion.observe(new Function1<Object, Unit>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$result$1
            public final /* synthetic */ DerivedSnapshotState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it == this.this$0) {
                    throw new IllegalStateException("A derived state calculation cannot read itself".toString());
                }
                if (it instanceof StateObject) {
                    hashSet.add(it);
                }
            }
        }, null, function0);
        if (!booleanValue) {
            snapshotThreadLocal3 = SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning;
            snapshotThreadLocal3.set(Boolean.FALSE);
        }
        int size3 = persistentList2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((Function1) ((Pair) persistentList2.get(i4)).component2()).invoke(this);
        }
        synchronized (SnapshotKt.getLock()) {
            companion = Snapshot.Companion;
            Snapshot current = companion.getCurrent();
            resultRecord2 = (ResultRecord<T>) ((ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current));
            resultRecord2.setDependencies(hashSet);
            resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
            resultRecord2.setResult(observe);
        }
        if (!booleanValue) {
            companion.notifyObjectsInitialized();
        }
        return resultRecord2;
    }

    private final String displayValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.Companion;
        ResultRecord resultRecord2 = (ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent());
        return resultRecord2.isValid(this, companion.getCurrent()) ? String.valueOf(resultRecord2.getResult()) : "<Not calculated>";
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.DerivedState
    public T getCurrentValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.Companion;
        return currentRecord((ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent()), companion.getCurrent(), this.calculation).getResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName(name = "getDebuggerDisplayValue")
    @Nullable
    public final T getDebuggerDisplayValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.Companion;
        ResultRecord resultRecord2 = (ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent());
        return resultRecord2.isValid(this, companion.getCurrent()) ? resultRecord2.getResult() : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.runtime.DerivedSnapshotState<T>, androidx.compose.runtime.DerivedSnapshotState] */
    @Override // androidx.compose.runtime.DerivedState
    @NotNull
    public Set<StateObject> getDependencies() {
        ?? emptySet;
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.Companion;
        HashSet<StateObject> dependencies = currentRecord((ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent()), companion.getCurrent(), this.calculation).getDependencies();
        HashSet<StateObject> hashSet = dependencies;
        if (dependencies == null) {
            emptySet = SetsKt__SetsKt.emptySet();
            hashSet = emptySet;
        }
        return hashSet;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Function1<Object, Unit> readObserver$runtime_release = Snapshot.Companion.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return getCurrentValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord stateRecord, @NotNull StateRecord stateRecord2, @NotNull StateRecord stateRecord3) {
        return StateObject.DefaultImpls.mergeRecords(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.first = (ResultRecord) value;
    }

    @NotNull
    public String toString() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first, Snapshot.Companion.getCurrent());
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }
}
