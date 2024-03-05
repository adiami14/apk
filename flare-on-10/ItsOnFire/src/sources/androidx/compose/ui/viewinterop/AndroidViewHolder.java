package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.R;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0017\b \u0018��2\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010H\u001a\u00020\u000f2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\n\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u001e\u0010M\u001a\u0004\u0018\u00010N2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J \u0010Q\u001a\u00020\u00112\u0006\u0010R\u001a\u00020\u00112\u0006\u0010S\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u0011H\u0002J\b\u0010U\u001a\u00020'H\u0014J\u0018\u0010V\u001a\u00020'2\u0006\u0010W\u001a\u00020B2\u0006\u0010X\u001a\u00020BH\u0016J\b\u0010Y\u001a\u00020'H\u0014J0\u0010Z\u001a\u00020'2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u00112\u0006\u0010]\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u0011H\u0014J\u0018\u0010`\u001a\u00020'2\u0006\u0010a\u001a\u00020\u00112\u0006\u0010b\u001a\u00020\u0011H\u0014J\u0006\u0010c\u001a\u00020'J\u0010\u0010d\u001a\u00020'2\u0006\u0010e\u001a\u00020\u000fH\u0016J\b\u0010f\u001a\u00020\u000fH\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n��R$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020��\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n��R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020'\u0018\u00010&X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020'\u0018\u00010&X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R(\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020'\u0018\u00010&X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020'04X\u0082\u0004¢\u0006\u0002\n��R(\u00106\u001a\u0004\u0018\u0001052\b\u0010\u0007\u001a\u0004\u0018\u000105@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n��R0\u0010=\u001a\b\u0012\u0004\u0012\u00020'042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020'04@DX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010C\u001a\u0004\u0018\u00010B2\b\u0010\u0007\u001a\u0004\u0018\u00010B@@X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006g"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;)V", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "hasUpdateBlock", "", "lastHeightMeasureSpec", "", "lastWidthMeasureSpec", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", FirebaseAnalytics.Param.LOCATION, "", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "onCommitAffectingUpdate", "Lkotlin/Function1;", "", "onDensityChanged", "getOnDensityChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnDensityChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "getOnModifierChanged$ui_release", "setOnModifierChanged$ui_release", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "runUpdate", "Lkotlin/Function0;", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "snapshotObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "update", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "view", "getView", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", "gatherTransparentRegion", "region", "Landroid/graphics/Region;", "getLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "invalidateChildInParent", "Landroid/view/ViewParent;", "dirty", "Landroid/graphics/Rect;", "obtainMeasureSpec", "min", "max", "preferred", "onAttachedToWindow", "onDescendantInvalidated", "child", "target", "onDetachedFromWindow", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "remeasure", "requestDisallowInterceptTouchEvent", "disallowIntercept", "shouldDelayChildPressedState", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/viewinterop/AndroidViewHolder.class */
public abstract class AndroidViewHolder extends ViewGroup {
    @NotNull
    private Density density;
    private boolean hasUpdateBlock;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    @NotNull
    private final LayoutNode layoutNode;
    @Nullable
    private LifecycleOwner lifecycleOwner;
    @NotNull
    private final int[] location;
    @NotNull
    private Modifier modifier;
    @NotNull
    private final Function1<AndroidViewHolder, Unit> onCommitAffectingUpdate;
    @Nullable
    private Function1<? super Density, Unit> onDensityChanged;
    @Nullable
    private Function1<? super Modifier, Unit> onModifierChanged;
    @Nullable
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;
    @NotNull
    private final Function0<Unit> runUpdate;
    @Nullable
    private SavedStateRegistryOwner savedStateRegistryOwner;
    @NotNull
    private final SnapshotStateObserver snapshotObserver;
    @NotNull
    private Function0<Unit> update;
    @Nullable
    private View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(@NotNull Context context, @Nullable CompositionContext compositionContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        this.update = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        };
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.snapshotObserver = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.onCommitAffectingUpdate = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.runUpdate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
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
                boolean z;
                SnapshotStateObserver snapshotStateObserver;
                Function1 function1;
                z = AndroidViewHolder.this.hasUpdateBlock;
                if (z) {
                    snapshotStateObserver = AndroidViewHolder.this.snapshotObserver;
                    AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                    function1 = androidViewHolder.onCommitAffectingUpdate;
                    snapshotStateObserver.observeReads(androidViewHolder, function1, AndroidViewHolder.this.getUpdate());
                }
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        final LayoutNode layoutNode = new LayoutNode(false, 1, null);
        final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(companion, this), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawBehind) {
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                LayoutNode layoutNode2 = LayoutNode.this;
                AndroidViewHolder androidViewHolder = this;
                Canvas canvas = drawBehind.getDrawContext().getCanvas();
                Owner owner$ui_release = layoutNode2.getOwner$ui_release();
                AndroidComposeView androidComposeView = owner$ui_release instanceof AndroidComposeView ? (AndroidComposeView) owner$ui_release : null;
                if (androidComposeView == null) {
                    return;
                }
                androidComposeView.drawAndroidView(androidViewHolder, AndroidCanvas_androidKt.getNativeCanvas(canvas));
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AndroidViewHolder_androidKt.access$layoutAccordingTo(AndroidViewHolder.this, layoutNode);
            }
        });
        layoutNode.setModifier(getModifier().then(onGloballyPositioned));
        setOnModifierChanged$ui_release(new Function1<Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier) {
                invoke2(modifier);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Modifier it) {
                Intrinsics.checkNotNullParameter(it, "it");
                LayoutNode.this.setModifier(it.then(onGloballyPositioned));
            }
        });
        layoutNode.setDensity(getDensity());
        setOnDensityChanged$ui_release(new Function1<Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Density density) {
                invoke2(density);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Density it) {
                Intrinsics.checkNotNullParameter(it, "it");
                LayoutNode.this.setDensity(it);
            }
        });
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        layoutNode.setOnAttach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner) {
                invoke2(owner);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Owner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(AndroidViewHolder.this, layoutNode);
                }
                View view = objectRef.element;
                if (view != null) {
                    AndroidViewHolder.this.setView$ui_release(view);
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner) {
                invoke2(owner);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [T, android.view.View] */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Owner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(AndroidViewHolder.this);
                }
                objectRef.element = AndroidViewHolder.this.getView();
                AndroidViewHolder.this.setView$ui_release(null);
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int i2) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i2, layoutParams.width);
                androidViewHolder.measure(obtainMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                return AndroidViewHolder.this.getMeasuredHeight();
            }

            private final int intrinsicWidth(int i2) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                obtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(0, i2, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
                return AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return intrinsicWidth(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo89measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
                int obtainMeasureSpec;
                int obtainMeasureSpec2;
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (Constraints.m4754getMinWidthimpl(j2) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumWidth(Constraints.m4754getMinWidthimpl(j2));
                }
                if (Constraints.m4753getMinHeightimpl(j2) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumHeight(Constraints.m4753getMinHeightimpl(j2));
                }
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int m4754getMinWidthimpl = Constraints.m4754getMinWidthimpl(j2);
                int m4752getMaxWidthimpl = Constraints.m4752getMaxWidthimpl(j2);
                ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(m4754getMinWidthimpl, m4752getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                int m4753getMinHeightimpl = Constraints.m4753getMinHeightimpl(j2);
                int m4751getMaxHeightimpl = Constraints.m4751getMaxHeightimpl(j2);
                ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                obtainMeasureSpec2 = androidViewHolder2.obtainMeasureSpec(m4753getMinHeightimpl, m4751getMaxHeightimpl, layoutParams2.height);
                androidViewHolder.measure(obtainMeasureSpec, obtainMeasureSpec2);
                int measuredWidth = AndroidViewHolder.this.getMeasuredWidth();
                int measuredHeight = AndroidViewHolder.this.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = AndroidViewHolder.this;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.DefaultImpls.layout$default(receiver, measuredWidth, measuredHeight, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        AndroidViewHolder_androidKt.access$layoutAccordingTo(AndroidViewHolder.this, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return intrinsicWidth(i2);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i2, int i3, int i4) {
        int coerceIn;
        int makeMeasureSpec;
        int i5;
        if (i4 >= 0 || i2 == i3) {
            coerceIn = RangesKt___RangesKt.coerceIn(i4, i2, i3);
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(coerceIn, 1073741824);
        } else {
            if (i4 == -2 && i3 != Integer.MAX_VALUE) {
                i5 = Integer.MIN_VALUE;
            } else if (i4 != -1 || i3 == Integer.MAX_VALUE) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                i5 = 1073741824;
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i5);
        }
        return makeMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@Nullable Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i2 = iArr[0];
        region.op(i2, iArr[1], i2 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        View view = this.view;
        ViewGroup.LayoutParams layoutParams = view == null ? null : view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (layoutParams == null) {
            layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams2;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Nullable
    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    @Nullable
    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    @Nullable
    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] iArr, @Nullable Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.layoutNode.invalidateLayer$ui_release();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotObserver.start();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@NotNull View child, @NotNull View target) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onDescendantInvalidated(child, target);
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotObserver.stop();
        this.snapshotObserver.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view = this.view;
        if (view == null) {
            return;
        }
        view.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        View view = this.view;
        if (view != null) {
            view.measure(i2, i3);
        }
        View view2 = this.view;
        int i4 = 0;
        int measuredWidth = view2 == null ? 0 : view2.getMeasuredWidth();
        View view3 = this.view;
        if (view3 != null) {
            i4 = view3.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, i4);
        this.lastWidthMeasureSpec = i2;
        this.lastHeightMeasureSpec = i3;
    }

    public final void remeasure() {
        int i2;
        int i3 = this.lastWidthMeasureSpec;
        if (i3 == Integer.MIN_VALUE || (i2 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i3, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(@NotNull Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.density) {
            this.density = value;
            Function1<? super Density, Unit> function1 = this.onDensityChanged;
            if (function1 == null) {
                return;
            }
            function1.invoke(value);
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull Modifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.modifier) {
            this.modifier = value;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 == null) {
                return;
            }
            function1.invoke(value);
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.update = value;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final void setView$ui_release(@Nullable View view) {
        if (view != this.view) {
            this.view = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.runUpdate.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }
}
