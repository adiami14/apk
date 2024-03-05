package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b��\u0018��2\u00020\u0001B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0001H��¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\u0005H��¢\u0006\u0002\b\u0014J#\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H��¢\u0006\u0002\b\u0018J#\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H��¢\u0006\u0002\b\u001aJ#\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H��¢\u0006\u0002\b\u001cJC\u0010\u001d\u001a\u00020\u0005\"\b\b��\u0010\u001e*\u00020\u001f2\u0006\u0010\u0011\u001a\u0002H\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H��¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0005H��¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u0005H��¢\u0006\u0002\b&J\u001b\u0010'\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H��¢\u0006\u0002\b(R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006)"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingLayout", "Landroidx/compose/ui/node/LayoutNode;", "onCommitAffectingLayoutModifier", "onCommitAffectingMeasure", "clear", "target", "clear$ui_release", "clearInvalidObservations", "clearInvalidObservations$ui_release", "observeLayoutModifierSnapshotReads", "node", "block", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutSnapshotReads", "observeLayoutSnapshotReads$ui_release", "observeMeasureSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeReads", "T", "Landroidx/compose/ui/node/OwnerScope;", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "startObserving", "startObserving$ui_release", "stopObserving", "stopObserving$ui_release", "withNoSnapshotReadObservation", "withNoSnapshotReadObservation$ui_release", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/OwnerSnapshotObserver.class */
public final class OwnerSnapshotObserver {
    @NotNull
    private final SnapshotStateObserver observer;
    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingLayout;
    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifier;
    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingMeasure;

    public OwnerSnapshotObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.observer = new SnapshotStateObserver(onChangedExecutor);
        this.onCommitAffectingMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    layoutNode.requestRemeasure$ui_release();
                }
            }
        };
        this.onCommitAffectingLayout = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    layoutNode.requestRelayout$ui_release();
                }
            }
        };
        this.onCommitAffectingLayoutModifier = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    layoutNode.requestRelayout$ui_release();
                }
            }
        };
    }

    public final void clear$ui_release(@NotNull Object target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.observer.clear(target);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new Function1<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!((OwnerScope) it).isValid());
            }
        });
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(@NotNull LayoutNode node, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingLayoutModifier, block);
    }

    public final void observeLayoutSnapshotReads$ui_release(@NotNull LayoutNode node, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingLayout, block);
    }

    public final void observeMeasureSnapshotReads$ui_release(@NotNull LayoutNode node, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingMeasure, block);
    }

    public final <T extends OwnerScope> void observeReads$ui_release(@NotNull T target, @NotNull Function1<? super T, Unit> onChanged, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Intrinsics.checkNotNullParameter(block, "block");
        this.observer.observeReads(target, onChanged, block);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }

    public final void withNoSnapshotReadObservation$ui_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.observer.withNoObservations(block);
    }
}
