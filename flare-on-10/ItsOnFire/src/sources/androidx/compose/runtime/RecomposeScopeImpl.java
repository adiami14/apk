package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import com.google.firebase.messaging.FirebaseMessagingService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b��\u0018��2\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u000eJ\u001c\u00106\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0010\u0018\u0001072\u0006\u00109\u001a\u00020\u000fJ\b\u0010:\u001a\u00020\u0010H\u0016J\u0010\u0010;\u001a\u00020<2\b\u0010\u0015\u001a\u0004\u0018\u00010,J\u0016\u0010=\u001a\u00020\u00162\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010?J\u000e\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020,J\u0006\u0010B\u001a\u00020\u0010J\u0006\u0010C\u001a\u00020\u0010J\u000e\u0010D\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u000fJ\"\u0010E\u001a\u00020\u00102\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n��R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0005R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n��R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u000e\u0010\u001f\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n��R$\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR$\u0010#\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR$\u0010&\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@BX\u0080\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\"\u0010)\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030+\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n��R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n��R$\u0010/\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u0011\u00102\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b3\u0010\u0019¨\u0006F"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "block", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "setComposition", "currentToken", "value", "", "defaultsInScope", "getDefaultsInScope", "()Z", "setDefaultsInScope", "(Z)V", "defaultsInvalid", "getDefaultsInvalid", "setDefaultsInvalid", "flags", "requiresRecompose", "getRequiresRecompose", "setRequiresRecompose", "rereading", "getRereading", "setRereading", "skipped", "getSkipped$runtime_release", "setSkipped", "trackedDependencies", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/DerivedState;", "", "trackedInstances", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "used", "getUsed", "setUsed", "valid", "getValid", "compose", "composer", "end", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", FirebaseMessagingService.EXTRA_TOKEN, "invalidate", "invalidateForResult", "Landroidx/compose/runtime/InvalidationResult;", "isInvalidFor", "instances", "Landroidx/compose/runtime/collection/IdentityArraySet;", "recordRead", "instance", "rereadTrackedInstances", "scopeSkipped", "start", "updateScope", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/RecomposeScopeImpl.class */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    @Nullable
    private Anchor anchor;
    @Nullable
    private Function2<? super Composer, ? super Integer, Unit> block;
    @Nullable
    private CompositionImpl composition;
    private int currentToken;
    private int flags;
    @Nullable
    private IdentityArrayMap<DerivedState<?>, Object> trackedDependencies;
    @Nullable
    private IdentityArrayIntMap trackedInstances;

    public RecomposeScopeImpl(@Nullable CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z) {
        this.flags = z ? this.flags | 32 : this.flags & (-33);
    }

    private final void setSkipped(boolean z) {
        this.flags = z ? this.flags | 16 : this.flags & (-17);
    }

    public final void compose(@NotNull Composer composer) {
        Unit unit;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Function2<? super Composer, ? super Integer, Unit> function2 = this.block;
        if (function2 == null) {
            unit = null;
        } else {
            function2.invoke(composer, 1);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    @Nullable
    public final Function1<Composition, Unit> end(final int i2) {
        Function1<Composition, Unit> function1;
        boolean z;
        final IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null) {
            function1 = null;
        } else {
            function1 = null;
            if (!getSkipped$runtime_release()) {
                int size = identityArrayIntMap.getSize();
                int i3 = 0;
                while (true) {
                    z = false;
                    if (i3 >= size) {
                        break;
                    } else if (identityArrayIntMap.getKeys()[i3] == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    } else {
                        if (identityArrayIntMap.getValues()[i3] != i2) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                }
                function1 = null;
                if (z) {
                    function1 = new Function1<Composition, Unit>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Composition composition) {
                            invoke2(composition);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
                            r0 = r0.trackedDependencies;
                         */
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.runtime.Composition r5) {
                            /*
                                Method dump skipped, instructions count: 316
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl$end$1$2.invoke2(androidx.compose.runtime.Composition):void");
                        }
                    };
                }
            }
        }
        return function1;
    }

    @Nullable
    public final Anchor getAnchor() {
        return this.anchor;
    }

    @Nullable
    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        boolean z = true;
        if ((this.flags & 1) == 0) {
            z = false;
        }
        return z;
    }

    public final boolean getValid() {
        boolean z = false;
        if (this.composition != null) {
            Anchor anchor = this.anchor;
            z = false;
            if (anchor == null ? false : anchor.getValid()) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null) {
            return;
        }
        compositionImpl.invalidate(this, null);
    }

    @NotNull
    public final InvalidationResult invalidateForResult(@Nullable Object obj) {
        CompositionImpl compositionImpl = this.composition;
        InvalidationResult invalidate = compositionImpl == null ? null : compositionImpl.invalidate(this, obj);
        InvalidationResult invalidationResult = invalidate;
        if (invalidate == null) {
            invalidationResult = InvalidationResult.IGNORED;
        }
        return invalidationResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInvalidFor(@Nullable IdentityArraySet<Object> identityArraySet) {
        IdentityArrayMap<DerivedState<?>, Object> identityArrayMap;
        boolean z;
        if (identityArraySet == null || (identityArrayMap = this.trackedDependencies) == 0 || !identityArraySet.isNotEmpty()) {
            return true;
        }
        if (!identityArraySet.isEmpty()) {
            for (Object obj : identityArraySet) {
                if (!((obj instanceof DerivedState) && Intrinsics.areEqual(identityArrayMap.get(obj), ((DerivedState) obj).getValue()))) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return !z;
    }

    public final void recordRead(@NotNull Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (getRereading()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        IdentityArrayIntMap identityArrayIntMap2 = identityArrayIntMap;
        if (identityArrayIntMap == null) {
            identityArrayIntMap2 = new IdentityArrayIntMap();
            this.trackedInstances = identityArrayIntMap2;
        }
        identityArrayIntMap2.add(instance, this.currentToken);
        if (instance instanceof DerivedState) {
            IdentityArrayMap<DerivedState<?>, Object> identityArrayMap = this.trackedDependencies;
            IdentityArrayMap<DerivedState<?>, Object> identityArrayMap2 = identityArrayMap;
            if (identityArrayMap == null) {
                identityArrayMap2 = new IdentityArrayMap<>(0, 1, null);
                this.trackedDependencies = identityArrayMap2;
            }
            identityArrayMap2.set(instance, ((DerivedState) instance).getCurrentValue());
        }
    }

    public final void rereadTrackedInstances() {
        IdentityArrayIntMap identityArrayIntMap;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null || (identityArrayIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            int size = identityArrayIntMap.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = identityArrayIntMap.getKeys()[i2];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                int i3 = identityArrayIntMap.getValues()[i2];
                compositionImpl.recordReadOf(obj);
            }
        } finally {
            setRereading(false);
        }
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(@Nullable Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setComposition(@Nullable CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    public final void setDefaultsInScope(boolean z) {
        this.flags = z ? this.flags | 2 : this.flags & (-3);
    }

    public final void setDefaultsInvalid(boolean z) {
        this.flags = z ? this.flags | 4 : this.flags & (-5);
    }

    public final void setRequiresRecompose(boolean z) {
        this.flags = z ? this.flags | 8 : this.flags & (-9);
    }

    public final void setUsed(boolean z) {
        this.flags = z ? this.flags | 1 : this.flags & (-2);
    }

    public final void start(int i2) {
        this.currentToken = i2;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }
}
