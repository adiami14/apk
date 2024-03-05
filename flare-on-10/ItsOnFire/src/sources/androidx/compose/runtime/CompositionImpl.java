package androidx.compose.runtime;

import androidx.compose.animation.core.a;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.snapshots.StateObject;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\b��\u0018��2\u00020\u0001:\u0001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010E\u001a\u00020\u001b2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002030GH\u0002J\b\u0010H\u001a\u00020\u001bH\u0016J \u0010I\u001a\u00020\u001b2\u0011\u0010J\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010#J\b\u0010K\u001a\u00020\u001bH\u0016J\b\u0010L\u001a\u00020\u001bH\u0002J\b\u0010M\u001a\u00020\u001bH\u0002J\u0018\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u0002012\b\u0010Q\u001a\u0004\u0018\u000103J\b\u0010R\u001a\u00020\u001bH\u0016J\u0010\u0010S\u001a\u00020\u001b2\u0006\u0010T\u001a\u000203H\u0002J\u0016\u0010U\u001a\u00020\u000f2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002030GH\u0016J\u0016\u0010V\u001a\u00020\u001b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016J\b\u0010X\u001a\u00020\u000fH\u0016J\u0016\u0010Y\u001a\u00020\u001b2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002030GH\u0016J\u0010\u0010Z\u001a\u00020\u001b2\u0006\u0010T\u001a\u000203H\u0016J\u0010\u0010[\u001a\u00020\u001b2\u0006\u0010T\u001a\u000203H\u0016J\u001d\u0010\\\u001a\u00020\u001b2\u0006\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u000201H��¢\u0006\u0002\b]J \u0010^\u001a\u00020\u001b2\u0011\u0010J\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010#J\u001c\u0010_\u001a\u0016\u0012\u0004\u0012\u000201\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010200H\u0002J\"\u0010`\u001a\u0002Ha\"\u0004\b��\u0010a2\f\u0010W\u001a\b\u0012\u0004\u0012\u0002Ha0\u001eH\u0082\b¢\u0006\u0002\u0010bJ\u0010\u0010c\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010d\u001a\u00020\u001bH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n��R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n��R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011Ra\u0010\u0012\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0014j\u0002`\u001c0\u0013X\u0082\u0004¢\u0006\u0002\n��R'\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n��R\u0018\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0(X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010*\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010+\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0011R\u0014\u0010-\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0011R\"\u0010/\u001a\u0016\u0012\u0004\u0012\u000201\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010200X\u0082\u000e¢\u0006\u0002\n��R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0011R\u0014\u00105\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0011R\u0011\u00106\u001a\u00020\u000f¢\u0006\b\n��\u001a\u0004\b6\u0010\u0011R\u000e\u00107\u001a\u000203X\u0082\u0004¢\u0006\u0002\n��R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002010(X\u0082\u0004¢\u0006\u0002\n��R\u0014\u00109\u001a\b\u0012\u0004\u0012\u0002010(X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010:\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010=R\"\u0010>\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001030?j\n\u0012\u0006\u0012\u0004\u0018\u000103`@X\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n��¨\u0006f"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "derivedStates", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "", "isComposing", "isDisposed", "isRoot", "lock", "observations", "observationsProcessed", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "addPendingInvalidationsLocked", "values", "", "applyChanges", "composeContent", FirebaseAnalytics.Param.CONTENT, "dispose", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateScopeOfLocked", "value", "observesAnyOf", "prepareCompose", "block", "recompose", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeObservation", "removeObservation$runtime_release", "setContent", "takeInvalidations", "trackAbandonedValues", "T", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/CompositionImpl.class */
public final class CompositionImpl implements ControlledComposition {
    @Nullable
    private final CoroutineContext _recomposeContext;
    @NotNull
    private final HashSet<RememberObserver> abandonSet;
    @NotNull
    private final Applier<?> applier;
    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    @NotNull
    private Function2<? super Composer, ? super Integer, Unit> composable;
    @NotNull
    private final ComposerImpl composer;
    @NotNull
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;
    @NotNull
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;
    @NotNull
    private final Object lock;
    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observations;
    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;
    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    @NotNull
    private final AtomicReference<Object> pendingModifications;
    @NotNull
    private final SlotTable slotTable;

    @Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018��2\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "forgetting", "", "remembering", "sideEffects", "Lkotlin/Function0;", "", "dispatchAbandons", "dispatchRememberObservers", "dispatchSideEffects", "instance", "sideEffect", "effect", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/CompositionImpl$RememberEventDispatcher.class */
    public static final class RememberEventDispatcher implements RememberManager {
        @NotNull
        private final Set<RememberObserver> abandoning;
        @NotNull
        private final List<RememberObserver> forgetting;
        @NotNull
        private final List<RememberObserver> remembering;
        @NotNull
        private final List<Function0<Unit>> sideEffects;

        public RememberEventDispatcher(@NotNull Set<RememberObserver> abandoning) {
            Intrinsics.checkNotNullParameter(abandoning, "abandoning");
            this.abandoning = abandoning;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Iterator<RememberObserver> it = this.abandoning.iterator();
                while (it.hasNext()) {
                    it.remove();
                    it.next().onAbandoned();
                }
            }
        }

        public final void dispatchRememberObservers() {
            if (!this.forgetting.isEmpty()) {
                int size = this.forgetting.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        RememberObserver rememberObserver = this.forgetting.get(size);
                        if (!this.abandoning.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
            if (!this.remembering.isEmpty()) {
                List<RememberObserver> list = this.remembering;
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    RememberObserver rememberObserver2 = list.get(i3);
                    this.abandoning.remove(rememberObserver2);
                    rememberObserver2.onRemembered();
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                List<Function0<Unit>> list = this.sideEffects;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invoke();
                }
                this.sideEffects.clear();
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(@NotNull RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int lastIndexOf = this.remembering.lastIndexOf(instance);
            if (lastIndexOf < 0) {
                this.forgetting.add(instance);
                return;
            }
            this.remembering.remove(lastIndexOf);
            this.abandoning.remove(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(@NotNull RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int lastIndexOf = this.forgetting.lastIndexOf(instance);
            if (lastIndexOf < 0) {
                this.remembering.add(instance);
                return;
            }
            this.forgetting.remove(lastIndexOf);
            this.abandoning.remove(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(@NotNull Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.sideEffects.add(effect);
        }
    }

    public CompositionImpl(@NotNull CompositionContext parent, @NotNull Applier<?> applier, @Nullable CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.parent = parent;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new IdentityScopeMap<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, parent, slotTable, hashSet, arrayList, this);
        parent.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = parent instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1942getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i2 & 4) != 0 ? null : coroutineContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
        r0 = r0.size();
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
        if (r14 >= r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
        r0.getValues()[r14] = null;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012a, code lost:
        r0.setSize(r15);
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
        if (r0.size() <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013f, code lost:
        if (r9 == r11) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0142, code lost:
        r0 = r0.getValueOrder()[r9];
        r0.getValueOrder()[r9] = r0;
        r0.getValueOrder()[r11] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015d, code lost:
        r15 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r5) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, Ref.ObjectRef<HashSet<RecomposeScopeImpl>> objectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int find = identityScopeMap.find(obj);
        if (find >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : identityScopeMap.scopeSetAt(find)) {
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    HashSet<RecomposeScopeImpl> hashSet = objectRef.element;
                    HashSet<RecomposeScopeImpl> hashSet2 = hashSet;
                    if (hashSet == null) {
                        T hashSet3 = new HashSet();
                        objectRef.element = hashSet3;
                        hashSet2 = hashSet3;
                    }
                    hashSet2.add(recomposeScopeImpl);
                }
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.access$getPendingApplyNoModifications$p());
        if (andSet == null) {
            return;
        }
        if (Intrinsics.areEqual(andSet, CompositionKt.access$getPendingApplyNoModifications$p())) {
            throw new IllegalStateException("pending composition has not been applied".toString());
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet);
        } else if (!(andSet instanceof Object[])) {
            throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications drain: ", this.pendingModifications).toString());
        } else {
            Set<? extends Object>[] setArr = (Set[]) andSet;
            int i2 = 0;
            int length = setArr.length;
            while (i2 < length) {
                i2++;
                addPendingInvalidationsLocked(setArr[i2]);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.access$getPendingApplyNoModifications$p())) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet);
        } else if (!(andSet instanceof Object[])) {
            if (andSet != null) {
                throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications drain: ", this.pendingModifications).toString());
            }
            throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
        } else {
            Set<? extends Object>[] setArr = (Set[]) andSet;
            int i2 = 0;
            int length = setArr.length;
            while (i2 < length) {
                i2++;
                addPendingInvalidationsLocked(setArr[i2]);
            }
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final void invalidateScopeOfLocked(Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int find = identityScopeMap.find(obj);
        if (find >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : identityScopeMap.scopeSetAt(find)) {
                if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(obj, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> function0) {
        try {
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        int indexOf;
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        int length = slots.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = slots[i2];
            i2++;
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i3);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                indexOf = ArraysKt___ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2);
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + indexOf).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x028b, code lost:
        if (r12 == r14) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x028e, code lost:
        r0 = r0.getValueOrder()[r12];
        r0.getValueOrder()[r12] = r0;
        r0.getValueOrder()[r14] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ab, code lost:
        r11 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0130, code lost:
        if (r18 >= r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
        r0.getValues()[r18] = null;
        r18 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0142, code lost:
        r0.setSize(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014b, code lost:
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0152, code lost:
        if (r0.size() <= 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0159, code lost:
        if (r12 == r14) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015c, code lost:
        r0 = r0.getValueOrder()[r12];
        r0.getValueOrder()[r12] = r0;
        r0.getValueOrder()[r14] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017c, code lost:
        r11 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0255, code lost:
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x025c, code lost:
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0262, code lost:
        if (r18 >= r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0265, code lost:
        r0.getValues()[r18] = null;
        r18 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0274, code lost:
        r0.setSize(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x027d, code lost:
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0284, code lost:
        if (r0.size() <= 0) goto L119;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyChanges() {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.applyChanges():void");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                this.composer.composeContent$runtime_release(takeInvalidations(), content);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                setComposable(ComposableSingletons$CompositionKt.INSTANCE.m1943getLambda2$runtime_release());
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        SlotWriter openWriter = this.slotTable.openWriter();
                        ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                        Unit unit = Unit.INSTANCE;
                        openWriter.close();
                        this.applier.clear();
                        rememberEventDispatcher.dispatchRememberObservers();
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize$runtime_release() > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        CoroutineContext coroutineContext2 = coroutineContext;
        if (coroutineContext == null) {
            coroutineContext2 = this.parent.getRecomposeCoroutineContext$runtime_release();
        }
        return coroutineContext2;
    }

    @NotNull
    public final InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor != null && this.slotTable.ownsAnchor(anchor) && anchor.getValid()) {
            if (anchor.toIndexFor(this.slotTable) < 0) {
                return InvalidationResult.IGNORED;
            }
            if (isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, obj)) {
                return InvalidationResult.IMMINENT;
            }
            if (obj == null) {
                this.invalidations.set(scope, null);
            } else {
                CompositionKt.access$addValue(this.invalidations, scope, obj);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
        return InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            Object[] slots = this.slotTable.getSlots();
            int i2 = 0;
            int length = slots.length;
            while (i2 < length) {
                Object obj = slots[i2];
                i2++;
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean observesAnyOf(@org.jetbrains.annotations.NotNull java.util.Set<? extends java.lang.Object> r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        Le:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L36
            r0 = r5
            java.lang.Object r0 = r0.next()
            r4 = r0
            r0 = r3
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.RecomposeScopeImpl> r0 = r0.observations
            r1 = r4
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L34
            r0 = r3
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.DerivedState<?>> r0 = r0.derivedStates
            r1 = r4
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Le
        L34:
            r0 = 1
            return r0
        L36:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.composer.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations());
            if (!recompose$runtime_release) {
                drainPendingModificationsLocked();
            }
        }
        return recompose$runtime_release;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object obj;
        ?? plus;
        Set[] setArr;
        Intrinsics.checkNotNullParameter(values, "values");
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.access$getPendingApplyNoModifications$p())) {
                setArr = values;
            } else if (obj instanceof Set) {
                setArr = new Set[]{(Set) obj, values};
            } else if (!(obj instanceof Object[])) {
                throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications: ", this.pendingModifications).toString());
            } else {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                }
                plus = ArraysKt___ArraysJvmKt.plus((Set<? extends Object>[]) obj, values);
                setArr = plus;
            }
        } while (!a.a(this.pendingModifications, obj, setArr));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        Intrinsics.checkNotNullParameter(value, "value");
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            for (StateObject stateObject : ((DerivedState) value).getDependencies()) {
                this.derivedStates.add(stateObject, value);
            }
        }
        currentRecomposeScope$runtime_release.recordRead(value);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            invalidateScopeOfLocked(value);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int find = identityScopeMap.find(value);
            if (find >= 0) {
                for (DerivedState derivedState : identityScopeMap.scopeSetAt(find)) {
                    invalidateScopeOfLocked(derivedState);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.observations.remove(instance, scope);
    }

    public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
