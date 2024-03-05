package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018��2\u00020\u0001:\u0001*B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0005H\u0002J\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0001J)\u0010\u001b\u001a\u00020\u00052!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0003J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001e0\f\"\b\b��\u0010\u001e*\u00020\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001c\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\"\u001a\u00020\u0010J?\u0010#\u001a\u00020\u0005\"\b\b��\u0010\u001e*\u00020\u00012\u0006\u0010\u001a\u001a\u0002H\u001e2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u0005J\u0006\u0010(\u001a\u00020\u0005J\u0014\u0010)\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0018\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bX\u0082\u0004¢\u0006\u0002\n��R&\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n��R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006+"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "isObserving", "", "isPaused", "readObserver", "callOnChanged", "clear", "scope", "clearIf", "predicate", "ensureMap", "T", "onChanged", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "block", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "start", "stop", "withNoObservations", "ApplyMap", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/SnapshotStateObserver.class */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    @NotNull
    private final MutableVector<ApplyMap<?>> applyMaps;
    @NotNull
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver;
    @Nullable
    private ObserverHandle applyUnsubscribe;
    @Nullable
    private ApplyMap<?> currentMap;
    private boolean isObserving;
    private boolean isPaused;
    @NotNull
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    @NotNull
    private final Function1<Object, Unit> readObserver;

    @Metadata(d1 = {"��2\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n��\b\u0002\u0018��*\b\b��\u0010\u0001*\u00020\u00022\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00018��X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u0013¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "T", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "getCurrentScope", "()Ljava/lang/Object;", "setCurrentScope", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "invalidated", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getInvalidated", "()Ljava/util/HashSet;", "map", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "getMap", "()Landroidx/compose/runtime/collection/IdentityScopeMap;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "addValue", "value", "callOnChanged", "scopes", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap.class */
    public static final class ApplyMap<T> {
        @Nullable
        private T currentScope;
        @NotNull
        private final HashSet<Object> invalidated;
        @NotNull
        private final IdentityScopeMap<T> map;
        @NotNull
        private final Function1<T, Unit> onChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public ApplyMap(@NotNull Function1<? super T, Unit> onChanged) {
            Intrinsics.checkNotNullParameter(onChanged, "onChanged");
            this.onChanged = onChanged;
            this.map = new IdentityScopeMap<>();
            this.invalidated = new HashSet<>();
        }

        public final void addValue(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            IdentityScopeMap<T> identityScopeMap = this.map;
            T t2 = this.currentScope;
            Intrinsics.checkNotNull(t2);
            identityScopeMap.add(value, t2);
        }

        public final void callOnChanged(@NotNull Collection<? extends Object> scopes) {
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            Iterator<T> it = scopes.iterator();
            while (it.hasNext()) {
                getOnChanged().invoke(it.next());
            }
        }

        @Nullable
        public final T getCurrentScope() {
            return this.currentScope;
        }

        @NotNull
        public final HashSet<Object> getInvalidated() {
            return this.invalidated;
        }

        @NotNull
        public final IdentityScopeMap<T> getMap() {
            return this.map;
        }

        @NotNull
        public final Function1<T, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final void setCurrentScope(@Nullable T t2) {
            this.currentScope = t2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.onChangedExecutor = onChangedExecutor;
        this.applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
                invoke2(set, snapshot);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Set<? extends Object> applied, @NotNull Snapshot noName_1) {
                MutableVector mutableVector;
                MutableVector mutableVector2;
                boolean z;
                Function1 function1;
                int i2;
                Intrinsics.checkNotNullParameter(applied, "applied");
                Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
                mutableVector = SnapshotStateObserver.this.applyMaps;
                SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                synchronized (mutableVector) {
                    mutableVector2 = snapshotStateObserver.applyMaps;
                    int size = mutableVector2.getSize();
                    z = false;
                    int i3 = 0;
                    if (size > 0) {
                        Object[] content = mutableVector2.getContent();
                        boolean z2 = false;
                        do {
                            SnapshotStateObserver.ApplyMap applyMap = (SnapshotStateObserver.ApplyMap) content[i3];
                            HashSet<Object> invalidated = applyMap.getInvalidated();
                            IdentityScopeMap map = applyMap.getMap();
                            z = z2;
                            for (Object obj : applied) {
                                int find = map.find(obj);
                                if (find >= 0) {
                                    for (Object obj2 : map.scopeSetAt(find)) {
                                        invalidated.add(obj2);
                                        z = true;
                                    }
                                }
                            }
                            i2 = i3 + 1;
                            i3 = i2;
                            z2 = z;
                        } while (i2 < size);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                if (z) {
                    function1 = SnapshotStateObserver.this.onChangedExecutor;
                    final SnapshotStateObserver snapshotStateObserver2 = SnapshotStateObserver.this;
                    function1.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            SnapshotStateObserver.this.callOnChanged();
                        }
                    });
                }
            }
        };
        this.readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
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
                boolean z;
                MutableVector mutableVector;
                SnapshotStateObserver.ApplyMap applyMap;
                Intrinsics.checkNotNullParameter(state, "state");
                z = SnapshotStateObserver.this.isPaused;
                if (z) {
                    return;
                }
                mutableVector = SnapshotStateObserver.this.applyMaps;
                SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                synchronized (mutableVector) {
                    applyMap = snapshotStateObserver.currentMap;
                    Intrinsics.checkNotNull(applyMap);
                    applyMap.addValue(state);
                    Unit unit = Unit.INSTANCE;
                }
            }
        };
        this.applyMaps = new MutableVector<>(new ApplyMap[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callOnChanged() {
        int i2;
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i3 = 0;
            ApplyMap<?>[] content = mutableVector.getContent();
            do {
                ApplyMap<?> applyMap = content[i3];
                HashSet<Object> invalidated = applyMap.getInvalidated();
                if (!invalidated.isEmpty()) {
                    applyMap.callOnChanged(invalidated);
                    invalidated.clear();
                }
                i2 = i3 + 1;
                i3 = i2;
            } while (i2 < size);
        }
    }

    private final <T> ApplyMap<T> ensureMap(Function1<? super T, Unit> function1) {
        int i2;
        int i3;
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ApplyMap<?>[] content = mutableVector.getContent();
            i2 = 0;
            do {
                if (content[i2].getOnChanged() == function1) {
                    break;
                }
                i3 = i2 + 1;
                i2 = i3;
            } while (i3 < size);
            i2 = -1;
        } else {
            i2 = -1;
        }
        if (i2 == -1) {
            ApplyMap<T> applyMap = new ApplyMap<>(function1);
            this.applyMaps.add(applyMap);
            return applyMap;
        }
        return (ApplyMap<T>) this.applyMaps.getContent()[i2];
    }

    public final void clear() {
        int i2;
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                int i3 = 0;
                ApplyMap<?>[] content = mutableVector.getContent();
                do {
                    content[i3].getMap().clear();
                    i2 = i3 + 1;
                    i3 = i2;
                } while (i2 < size);
                Unit unit = Unit.INSTANCE;
            } else {
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
        r0 = r0.getSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
        r17 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013e, code lost:
        if (r17 >= r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
        r0.getValues()[r0.getValueOrder()[r17]] = null;
        r17 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
        r0.setSize(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:
        r0 = r9 + 1;
        r9 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.clear(java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
        r0 = r0.getSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
        r18 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
        if (r18 >= r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
        r0.getValues()[r0.getValueOrder()[r18]] = null;
        r18 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0151, code lost:
        r0.setSize(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015a, code lost:
        r0 = r10 + 1;
        r10 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clearIf(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r5) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.clearIf(kotlin.jvm.functions.Function1):void");
    }

    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Function0<Unit> block) {
        ApplyMap<?> ensureMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onValueChangedForScope, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(block, "block");
        ApplyMap<?> applyMap = this.currentMap;
        boolean z = this.isPaused;
        synchronized (this.applyMaps) {
            ensureMap = ensureMap(onValueChangedForScope);
        }
        Object currentScope = ensureMap.getCurrentScope();
        ensureMap.setCurrentScope(scope);
        this.currentMap = ensureMap;
        this.isPaused = false;
        synchronized (this.applyMaps) {
            IdentityScopeMap<?> map = ensureMap.getMap();
            int size = map.getSize();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i2 < size) {
                    int i5 = map.getValueOrder()[i2];
                    IdentityArraySet<?> identityArraySet = map.getScopeSets()[i5];
                    Intrinsics.checkNotNull(identityArraySet);
                    int size2 = identityArraySet.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj = identityArraySet.getValues()[i7];
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        int i8 = i6;
                        if (!(obj == scope)) {
                            if (i6 != i7) {
                                identityArraySet.getValues()[i6] = obj;
                            }
                            i8 = i6 + 1;
                        }
                        i7++;
                        i6 = i8;
                    }
                    int size3 = identityArraySet.size();
                    for (int i9 = i6; i9 < size3; i9++) {
                        identityArraySet.getValues()[i9] = null;
                    }
                    identityArraySet.setSize(i6);
                    int i10 = i4;
                    if (identityArraySet.size() > 0) {
                        if (i4 != i2) {
                            int i11 = map.getValueOrder()[i4];
                            map.getValueOrder()[i4] = i5;
                            map.getValueOrder()[i2] = i11;
                        }
                        i10 = i4 + 1;
                    }
                    i2++;
                    i3 = i10;
                } else {
                    int size4 = map.getSize();
                    for (int i12 = i4; i12 < size4; i12++) {
                        map.getValues()[map.getValueOrder()[i12]] = null;
                    }
                    map.setSize(i4);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (this.isObserving) {
            block.invoke();
        } else {
            this.isObserving = true;
            try {
                Snapshot.Companion.observe(this.readObserver, null, block);
            } finally {
                this.isObserving = false;
            }
        }
        this.currentMap = applyMap;
        ensureMap.setCurrentScope(currentScope);
        this.isPaused = z;
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle == null) {
            return;
        }
        observerHandle.dispose();
    }

    public final void withNoObservations(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }
}
