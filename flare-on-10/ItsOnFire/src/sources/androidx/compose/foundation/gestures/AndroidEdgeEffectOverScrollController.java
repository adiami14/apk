package androidx.compose.foundation.gestures;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b*\u0010\u0012J7\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u000201H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020)2\u0006\u0010(\u001a\u00020)H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b5\u00106J/\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u000201H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0015H\u0002J\b\u0010<\u001a\u00020'H\u0002J%\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bD\u0010BJ%\u0010E\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bF\u0010BJ%\u0010G\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bH\u0010BJ%\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\b\u0010M\u001a\u00020'H\u0016J\u001d\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020-H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ\b\u0010R\u001a\u00020\u0015H\u0016J \u0010S\u001a\u00020\u0015*\u00020T2\u0006\u0010U\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J \u0010Y\u001a\u00020\u0015*\u00020T2\u0006\u0010Z\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J\f\u0010[\u001a\u00020'*\u00020TH\u0016J \u0010\\\u001a\u00020\u0015*\u00020T2\u0006\u0010]\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J \u0010^\u001a\u00020\u0015*\u00020T2\u0006\u0010_\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R4\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\"\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010#\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010$\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010%\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;", "Landroidx/compose/foundation/gestures/OverScrollController;", "context", "Landroid/content/Context;", "overScrollConfig", "Landroidx/compose/foundation/gestures/OverScrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/gestures/OverScrollConfiguration;)V", "allEffects", "", "Landroid/widget/EdgeEffect;", "bottomEffect", "bottomEffectNegation", "<set-?>", "Landroidx/compose/ui/geometry/Size;", "containerSize", "getContainerSize-NH-jbRc", "()J", "setContainerSize-uvyYCjk", "(J)V", "containerSize$delegate", "Landroidx/compose/runtime/MutableState;", "", "isContentScrolls", "()Z", "setContentScrolls", "(Z)V", "isContentScrolls$delegate", "leftEffect", "leftEffectNegation", "getOverScrollConfig", "()Landroidx/compose/foundation/gestures/OverScrollConfiguration;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "", "rightEffect", "rightEffectNegation", "topEffect", "topEffectNegation", "consumePostFling", "", "velocity", "Landroidx/compose/ui/unit/Velocity;", "consumePostFling-TH1AsA0", "consumePostScroll", "initialDragDelta", "Landroidx/compose/ui/geometry/Offset;", "overScrollDelta", "pointerPosition", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "consumePostScroll-l7mfB5k", "(JJLandroidx/compose/ui/geometry/Offset;I)V", "consumePreFling", "consumePreFling-AH228Gc", "(J)J", "consumePreScroll", "scrollDelta", "consumePreScroll-A0NYTsA", "(JLandroidx/compose/ui/geometry/Offset;I)J", "ignoreOverscroll", "invalidateOverScroll", "pullBottom", "", "scroll", "displacement", "pullBottom-0a9Yr6o", "(JJ)F", "pullLeft", "pullLeft-0a9Yr6o", "pullRight", "pullRight-0a9Yr6o", "pullTop", "pullTop-0a9Yr6o", "refreshContainerInfo", "size", "refreshContainerInfo-TmRCtEA", "(JZ)V", "release", "releaseOppositeOverscroll", "delta", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "drawBottom", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "bottom", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeft", "left", "drawOverScroll", "drawRight", "right", "drawTop", "top", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController.class */
public final class AndroidEdgeEffectOverScrollController implements OverScrollController {
    @NotNull
    private final List<EdgeEffect> allEffects;
    @NotNull
    private final EdgeEffect bottomEffect;
    @NotNull
    private final EdgeEffect bottomEffectNegation;
    @NotNull
    private final MutableState containerSize$delegate;
    @NotNull
    private final MutableState isContentScrolls$delegate;
    @NotNull
    private final EdgeEffect leftEffect;
    @NotNull
    private final EdgeEffect leftEffectNegation;
    @NotNull
    private final OverScrollConfiguration overScrollConfig;
    @NotNull
    private final MutableState<Integer> redrawSignal;
    @NotNull
    private final EdgeEffect rightEffect;
    @NotNull
    private final EdgeEffect rightEffectNegation;
    @NotNull
    private final EdgeEffect topEffect;
    @NotNull
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverScrollController(@NotNull Context context, @NotNull OverScrollConfiguration overScrollConfig) {
        List<EdgeEffect> listOf;
        MutableState<Integer> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overScrollConfig, "overScrollConfig");
        this.overScrollConfig = overScrollConfig;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect create = edgeEffectCompat.create(context, null);
        this.topEffect = create;
        EdgeEffect create2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = create2;
        EdgeEffect create3 = edgeEffectCompat.create(context, null);
        this.leftEffect = create3;
        EdgeEffect create4 = edgeEffectCompat.create(context, null);
        this.rightEffect = create4;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EdgeEffect[]{create3, create, create4, create2});
        this.allEffects = listOf;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = listOf.size();
        for (int i2 = 0; i2 < size; i2++) {
            listOf.get(i2).setColor(ColorKt.m2470toArgb8_81llA(getOverScrollConfig().m502getGlowColor0d7_KjU()));
        }
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.redrawSignal = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2227boximpl(Size.Companion.m2248getZeroNHjbRc()), null, 2, null);
        this.containerSize$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isContentScrolls$delegate = mutableStateOf$default3;
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m2239getWidthimpl(m430getContainerSizeNHjbRc()), (-Size.m2236getHeightimpl(m430getContainerSizeNHjbRc())) + drawScope.mo524toPx0680j_4(this.overScrollConfig.getDrawPadding().mo685calculateBottomPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m2236getHeightimpl(m430getContainerSizeNHjbRc()), drawScope.mo524toPx0680j_4(this.overScrollConfig.getDrawPadding().mo686calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int roundToInt;
        int save = canvas.save();
        roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(m430getContainerSizeNHjbRc()));
        float mo687calculateRightPaddingu2uoSUM = this.overScrollConfig.getDrawPadding().mo687calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-roundToInt) + drawScope.mo524toPx0680j_4(mo687calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo524toPx0680j_4(this.overScrollConfig.getDrawPadding().mo688calculateTopPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: getContainerSize-NH-jbRc  reason: not valid java name */
    private final long m430getContainerSizeNHjbRc() {
        return ((Size) this.containerSize$delegate.getValue()).m2244unboximpl();
    }

    private final boolean ignoreOverscroll() {
        return (this.overScrollConfig.getForceShowAlways() || isContentScrolls()) ? false : true;
    }

    private final void invalidateOverScroll() {
        MutableState<Integer> mutableState = this.redrawSignal;
        mutableState.setValue(Integer.valueOf(mutableState.getValue().intValue() + 1));
    }

    private final boolean isContentScrolls() {
        return ((Boolean) this.isContentScrolls$delegate.getValue()).booleanValue();
    }

    /* renamed from: pullBottom-0a9Yr6o  reason: not valid java name */
    private final float m431pullBottom0a9Yr6o(long j2, long j3) {
        float m2167getXimpl = Offset.m2167getXimpl(j3) / Size.m2239getWidthimpl(m430getContainerSizeNHjbRc());
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffect, -(Offset.m2168getYimpl(j2) / Size.m2236getHeightimpl(m430getContainerSizeNHjbRc())), 1 - m2167getXimpl)) * Size.m2236getHeightimpl(m430getContainerSizeNHjbRc());
    }

    /* renamed from: pullLeft-0a9Yr6o  reason: not valid java name */
    private final float m432pullLeft0a9Yr6o(long j2, long j3) {
        float m2168getYimpl = Offset.m2168getYimpl(j3) / Size.m2236getHeightimpl(m430getContainerSizeNHjbRc());
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffect, Offset.m2167getXimpl(j2) / Size.m2239getWidthimpl(m430getContainerSizeNHjbRc()), 1 - m2168getYimpl) * Size.m2239getWidthimpl(m430getContainerSizeNHjbRc());
    }

    /* renamed from: pullRight-0a9Yr6o  reason: not valid java name */
    private final float m433pullRight0a9Yr6o(long j2, long j3) {
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffect, -(Offset.m2167getXimpl(j2) / Size.m2239getWidthimpl(m430getContainerSizeNHjbRc())), Offset.m2168getYimpl(j3) / Size.m2236getHeightimpl(m430getContainerSizeNHjbRc()))) * Size.m2239getWidthimpl(m430getContainerSizeNHjbRc());
    }

    /* renamed from: pullTop-0a9Yr6o  reason: not valid java name */
    private final float m434pullTop0a9Yr6o(long j2, long j3) {
        float m2167getXimpl = Offset.m2167getXimpl(j3) / Size.m2239getWidthimpl(m430getContainerSizeNHjbRc());
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffect, Offset.m2168getYimpl(j2) / Size.m2236getHeightimpl(m430getContainerSizeNHjbRc()), m2167getXimpl) * Size.m2236getHeightimpl(m430getContainerSizeNHjbRc());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
        if (r3.bottomEffect.isFinished() != false) goto L34;
     */
    /* renamed from: releaseOppositeOverscroll-k-4lQ0M  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m435releaseOppositeOverscrollk4lQ0M(long r4) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.m435releaseOppositeOverscrollk4lQ0M(long):boolean");
    }

    /* renamed from: setContainerSize-uvyYCjk  reason: not valid java name */
    private final void m436setContainerSizeuvyYCjk(long j2) {
        this.containerSize$delegate.setValue(Size.m2227boximpl(j2));
    }

    private final void setContentScrolls(boolean z) {
        this.isContentScrolls$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: consumePostFling-TH1AsA0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo437consumePostFlingTH1AsA0(long r6) {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.ignoreOverscroll()
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r6
            float r0 = androidx.compose.ui.unit.Velocity.m5020getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            r8 = r0
            r0 = r5
            android.widget.EdgeEffect r0 = r0.leftEffect
            r9 = r0
            r0 = r6
            float r0 = androidx.compose.ui.unit.Velocity.m5020getXimpl(r0)
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            r10 = r0
        L24:
            r0 = r8
            r1 = r9
            r2 = r10
            r0.onAbsorbCompat(r1, r2)
            goto L4f
        L2f:
            r0 = r6
            float r0 = androidx.compose.ui.unit.Velocity.m5020getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4f
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            r8 = r0
            r0 = r5
            android.widget.EdgeEffect r0 = r0.rightEffect
            r9 = r0
            r0 = r6
            float r0 = androidx.compose.ui.unit.Velocity.m5020getXimpl(r0)
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            int r0 = -r0
            r10 = r0
            goto L24
        L4f:
            r0 = r6
            float r0 = androidx.compose.ui.unit.Velocity.m5021getYimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L76
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            r9 = r0
            r0 = r5
            android.widget.EdgeEffect r0 = r0.topEffect
            r8 = r0
            r0 = r6
            float r0 = androidx.compose.ui.unit.Velocity.m5021getYimpl(r0)
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            r10 = r0
        L6b:
            r0 = r9
            r1 = r8
            r2 = r10
            r0.onAbsorbCompat(r1, r2)
            goto L96
        L76:
            r0 = r6
            float r0 = androidx.compose.ui.unit.Velocity.m5021getYimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L96
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            r9 = r0
            r0 = r5
            android.widget.EdgeEffect r0 = r0.bottomEffect
            r8 = r0
            r0 = r6
            float r0 = androidx.compose.ui.unit.Velocity.m5021getYimpl(r0)
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            int r0 = -r0
            r10 = r0
            goto L6b
        L96:
            r0 = r6
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.Companion
            long r1 = r1.m5031getZero9UxMQ8M()
            boolean r0 = androidx.compose.ui.unit.Velocity.m5019equalsimpl0(r0, r1)
            if (r0 != 0) goto La7
            r0 = r5
            r0.invalidateOverScroll()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.mo437consumePostFlingTH1AsA0(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: consumePostScroll-l7mfB5k  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo438consumePostScrolll7mfB5k(long r7, long r9, @org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Offset r11, int r12) {
        /*
            r6 = this;
            r0 = r6
            boolean r0 = r0.ignoreOverscroll()
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollSource$Companion r1 = androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion
            int r1 = r1.m3700getDragWNlRxjI()
            boolean r0 = androidx.compose.ui.input.nestedscroll.NestedScrollSource.m3695equalsimpl0(r0, r1)
            r13 = r0
            r0 = 1
            r14 = r0
            r0 = r13
            if (r0 == 0) goto L95
            r0 = r11
            if (r0 != 0) goto L2e
            r0 = r6
            long r0 = r0.m430getContainerSizeNHjbRc()
            long r0 = androidx.compose.ui.geometry.SizeKt.m2249getCenteruvyYCjk(r0)
            r15 = r0
            goto L35
        L2e:
            r0 = r11
            long r0 = r0.m2177unboximpl()
            r15 = r0
        L35:
            r0 = r9
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L49
            r0 = r6
            r1 = r9
            r2 = r15
            float r0 = r0.m432pullLeft0a9Yr6o(r1, r2)
            goto L5a
        L49:
            r0 = r9
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5a
            r0 = r6
            r1 = r9
            r2 = r15
            float r0 = r0.m433pullRight0a9Yr6o(r1, r2)
        L5a:
            r0 = r9
            float r0 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6e
            r0 = r6
            r1 = r9
            r2 = r15
            float r0 = r0.m434pullTop0a9Yr6o(r1, r2)
            goto L7f
        L6e:
            r0 = r9
            float r0 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7f
            r0 = r6
            r1 = r9
            r2 = r15
            float r0 = r0.m431pullBottom0a9Yr6o(r1, r2)
        L7f:
            r0 = r9
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r1 = r1.m2183getZeroF1C5BW0()
            boolean r0 = androidx.compose.ui.geometry.Offset.m2164equalsimpl0(r0, r1)
            if (r0 == 0) goto L8f
            goto L95
        L8f:
            r0 = 1
            r12 = r0
            goto L98
        L95:
            r0 = 0
            r12 = r0
        L98:
            r0 = r14
            r17 = r0
            r0 = r6
            r1 = r7
            boolean r0 = r0.m435releaseOppositeOverscrollk4lQ0M(r1)
            if (r0 != 0) goto Lb3
            r0 = r12
            if (r0 == 0) goto Lb0
            r0 = r14
            r17 = r0
            goto Lb3
        Lb0:
            r0 = 0
            r17 = r0
        Lb3:
            r0 = r17
            if (r0 == 0) goto Lbc
            r0 = r6
            r0.invalidateOverScroll()
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.mo438consumePostScrolll7mfB5k(long, long, androidx.compose.ui.geometry.Offset, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: consumePreFling-AH228Gc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo439consumePreFlingAH228Gc(long r6) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.mo439consumePreFlingAH228Gc(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dd  */
    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: consumePreScroll-A0NYTsA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo440consumePreScrollA0NYTsA(long r7, @org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Offset r9, int r10) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.mo440consumePreScrollA0NYTsA(long, androidx.compose.ui.geometry.Offset, int):long");
    }

    @Override // androidx.compose.foundation.gestures.OverScrollController
    public void drawOverScroll(@NotNull DrawScope drawScope) {
        boolean z;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        if (ignoreOverscroll()) {
            return;
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (!(edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) == 0.0f)) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            z = false;
        } else {
            z = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffectNegation) == 0.0f)) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        boolean z2 = z;
        if (!this.topEffect.isFinished()) {
            z2 = drawTop(drawScope, this.topEffect, nativeCanvas) || z;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) == 0.0f)) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        boolean z3 = z2;
        if (!this.rightEffect.isFinished()) {
            z3 = drawRight(drawScope, this.rightEffect, nativeCanvas) || z2;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) == 0.0f)) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        boolean z4 = z3;
        if (!this.bottomEffect.isFinished()) {
            z4 = true;
            if (!drawBottom(drawScope, this.bottomEffect, nativeCanvas)) {
                z4 = z3;
            }
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
        }
        if (z4) {
            invalidateOverScroll();
        }
    }

    @NotNull
    public final OverScrollConfiguration getOverScrollConfig() {
        return this.overScrollConfig;
    }

    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: refreshContainerInfo-TmRCtEA  reason: not valid java name */
    public void mo441refreshContainerInfoTmRCtEA(long j2, boolean z) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        int roundToInt5;
        int roundToInt6;
        int roundToInt7;
        int roundToInt8;
        int roundToInt9;
        int roundToInt10;
        int roundToInt11;
        int roundToInt12;
        int roundToInt13;
        int roundToInt14;
        int roundToInt15;
        int roundToInt16;
        boolean z2 = true;
        boolean z3 = !Size.m2235equalsimpl0(j2, m430getContainerSizeNHjbRc());
        if (isContentScrolls() == z) {
            z2 = false;
        }
        m436setContainerSizeuvyYCjk(j2);
        setContentScrolls(z);
        if (z3) {
            EdgeEffect edgeEffect = this.topEffect;
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(j2));
            roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(j2));
            edgeEffect.setSize(roundToInt, roundToInt2);
            EdgeEffect edgeEffect2 = this.bottomEffect;
            roundToInt3 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(j2));
            roundToInt4 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(j2));
            edgeEffect2.setSize(roundToInt3, roundToInt4);
            EdgeEffect edgeEffect3 = this.leftEffect;
            roundToInt5 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(j2));
            roundToInt6 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(j2));
            edgeEffect3.setSize(roundToInt5, roundToInt6);
            EdgeEffect edgeEffect4 = this.rightEffect;
            roundToInt7 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(j2));
            roundToInt8 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(j2));
            edgeEffect4.setSize(roundToInt7, roundToInt8);
            EdgeEffect edgeEffect5 = this.topEffectNegation;
            roundToInt9 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(j2));
            roundToInt10 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(j2));
            edgeEffect5.setSize(roundToInt9, roundToInt10);
            EdgeEffect edgeEffect6 = this.bottomEffectNegation;
            roundToInt11 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(j2));
            roundToInt12 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(j2));
            edgeEffect6.setSize(roundToInt11, roundToInt12);
            EdgeEffect edgeEffect7 = this.leftEffectNegation;
            roundToInt13 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(j2));
            roundToInt14 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(j2));
            edgeEffect7.setSize(roundToInt13, roundToInt14);
            EdgeEffect edgeEffect8 = this.rightEffectNegation;
            roundToInt15 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(j2));
            roundToInt16 = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(j2));
            edgeEffect8.setSize(roundToInt15, roundToInt16);
        }
        if (z2 || z3) {
            release();
        }
    }

    @Override // androidx.compose.foundation.gestures.OverScrollController
    public void release() {
        if (ignoreOverscroll()) {
            return;
        }
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            EdgeEffect edgeEffect = list.get(i2);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverScroll();
        }
    }

    @Override // androidx.compose.foundation.gestures.OverScrollController
    public boolean stopOverscrollAnimation() {
        boolean z;
        long m2249getCenteruvyYCjk = SizeKt.m2249getCenteruvyYCjk(m430getContainerSizeNHjbRc());
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m432pullLeft0a9Yr6o(Offset.Companion.m2183getZeroF1C5BW0(), m2249getCenteruvyYCjk);
            z = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f)) {
            m433pullRight0a9Yr6o(Offset.Companion.m2183getZeroF1C5BW0(), m2249getCenteruvyYCjk);
            z = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f)) {
            m434pullTop0a9Yr6o(Offset.Companion.m2183getZeroF1C5BW0(), m2249getCenteruvyYCjk);
            z = true;
        }
        boolean z2 = false;
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            z2 = true;
        }
        if (!z2) {
            m431pullBottom0a9Yr6o(Offset.Companion.m2183getZeroF1C5BW0(), m2249getCenteruvyYCjk);
            z = true;
        }
        return z;
    }
}
