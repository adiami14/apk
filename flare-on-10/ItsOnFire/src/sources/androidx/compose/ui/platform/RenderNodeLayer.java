package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018�� \\2\u00020\u00012\u00020\u0002:\u0002\\]B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\bH\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0007H\u0016J\b\u0010,\u001a\u00020\bH\u0016J\u001d\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020/H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\b2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000fH\u0016J%\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020/2\u0006\u00105\u001a\u00020\u000fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\b2\u0006\u0010.\u001a\u00020;H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020@H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bA\u0010=J*\u0010B\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016J\b\u0010C\u001a\u00020\bH\u0002J\b\u0010D\u001a\u00020\bH\u0016J\u0097\u0001\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020G2\u0006\u0010M\u001a\u00020G2\u0006\u0010N\u001a\u00020G2\u0006\u0010O\u001a\u00020G2\u0006\u0010P\u001a\u00020G2\u0006\u0010%\u001a\u00020&2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u000f2\b\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bZ\u0010[R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n��R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n��R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n��R\u001e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f@BX\u0082\u000e¢\u0006\b\n��\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u000e\u0010\"\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n��R\u0019\u0010%\u001a\u00020&X\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "drawnWithZ", "", "isDestroyed", "value", "isDirty", "setDirty", "(Z)V", "layerId", "", "getLayerId", "()J", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId", "renderNode", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "clipRenderNode", "canvas", "destroy", "drawLayer", "invalidate", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "triggerRepaint", "updateDisplayList", "updateLayerProperties", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "updateLayerProperties-YPkPJjM", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@RequiresApi(23)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/RenderNodeLayer.class */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Function2<DeviceRenderNode, Matrix, Unit> getMatrix = new Function2<DeviceRenderNode, Matrix, Unit>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            invoke2(deviceRenderNode, matrix);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DeviceRenderNode rn, @NotNull Matrix matrix) {
            Intrinsics.checkNotNullParameter(rn, "rn");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            rn.getMatrix(matrix);
        }
    };
    @NotNull
    private final CanvasHolder canvasHolder;
    @Nullable
    private Function1<? super Canvas, Unit> drawBlock;
    private boolean drawnWithZ;
    @Nullable
    private Function0<Unit> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    @NotNull
    private final LayerMatrixCache<DeviceRenderNode> matrixCache;
    @NotNull
    private final OutlineResolver outlineResolver;
    @NotNull
    private final AndroidComposeView ownerView;
    @NotNull
    private final DeviceRenderNode renderNode;
    @Nullable
    private Paint softwareLayerPaint;
    private long transformOrigin;

    @Metadata(d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n��¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$Companion;", "", "()V", "getMatrix", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroid/graphics/Matrix;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/RenderNodeLayer$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\b\u0003\u0018�� \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @RequiresApi(29)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29.class */
    public static final class UniqueDrawingIdApi29 {
        @NotNull
        public static final Companion Companion = new Companion(null);

        @Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n��\b\u0087\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29$Companion;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @RequiresApi(29)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final long getUniqueDrawingId(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return view.getUniqueDrawingId();
            }
        }

        @JvmStatic
        public static final long getUniqueDrawingId(@NotNull View view) {
            return Companion.getUniqueDrawingId(view);
        }
    }

    public RenderNodeLayer(@NotNull AndroidComposeView ownerView, @NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.outlineResolver = new OutlineResolver(ownerView.getDensity());
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.canvasHolder = new CanvasHolder();
        this.transformOrigin = TransformOrigin.Companion.m2753getCenterSzJe1aQ();
        RenderNodeApi29 renderNodeApi29 = new RenderNodeApi29(ownerView);
        renderNodeApi29.setHasOverlappingRendering(true);
        this.renderNode = renderNodeApi29;
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean z = false;
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            if (this.renderNode.getElevation() > 0.0f) {
                z = true;
            }
            this.drawnWithZ = z;
            if (z) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            Paint paint2 = paint;
            if (paint == null) {
                paint2 = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint2;
            }
            paint2.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint2.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo2267concat58bKbWc(this.matrixCache.m4231calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        Function1<? super Canvas, Unit> function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return UniqueDrawingIdApi29.Companion.getUniqueDrawingId(this.ownerView);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo4101isInLayerk4lQ0M(long j2) {
        float m2167getXimpl = Offset.m2167getXimpl(j2);
        float m2168getYimpl = Offset.m2168getYimpl(j2);
        boolean z = true;
        if (!this.renderNode.getClipToBounds()) {
            if (this.renderNode.getClipToOutline()) {
                return this.outlineResolver.m4249isInOutlinek4lQ0M(j2);
            }
            return true;
        }
        if (0.0f > m2167getXimpl || m2167getXimpl >= this.renderNode.getWidth() || 0.0f > m2168getYimpl || m2168getYimpl >= this.renderNode.getHeight()) {
            z = false;
        }
        return z;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!z) {
            androidx.compose.ui.graphics.Matrix.m2597mapimpl(this.matrixCache.m4231calculateMatrixGrdbGEg(this.renderNode), rect);
            return;
        }
        float[] m4230calculateInverseMatrixbWbORWo = this.matrixCache.m4230calculateInverseMatrixbWbORWo(this.renderNode);
        if (m4230calculateInverseMatrixbWbORWo == null) {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            androidx.compose.ui.graphics.Matrix.m2597mapimpl(m4230calculateInverseMatrixbWbORWo, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo4102mapOffset8S9VItk(long j2, boolean z) {
        long m2595mapMKHz9U;
        if (z) {
            float[] m4230calculateInverseMatrixbWbORWo = this.matrixCache.m4230calculateInverseMatrixbWbORWo(this.renderNode);
            Offset m2156boximpl = m4230calculateInverseMatrixbWbORWo == null ? null : Offset.m2156boximpl(androidx.compose.ui.graphics.Matrix.m2595mapMKHz9U(m4230calculateInverseMatrixbWbORWo, j2));
            m2595mapMKHz9U = m2156boximpl == null ? Offset.Companion.m2181getInfiniteF1C5BW0() : m2156boximpl.m2177unboximpl();
        } else {
            m2595mapMKHz9U = androidx.compose.ui.graphics.Matrix.m2595mapMKHz9U(this.matrixCache.m4231calculateMatrixGrdbGEg(this.renderNode), j2);
        }
        return m2595mapMKHz9U;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo4103movegyyYBs(long j2) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int m4907getXimpl = IntOffset.m4907getXimpl(j2);
        int m4908getYimpl = IntOffset.m4908getYimpl(j2);
        if (left == m4907getXimpl && top == m4908getYimpl) {
            return;
        }
        this.renderNode.offsetLeftAndRight(m4907getXimpl - left);
        this.renderNode.offsetTopAndBottom(m4908getYimpl - top);
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo4104resizeozmzZPI(long j2) {
        int m4951getWidthimpl = IntSize.m4951getWidthimpl(j2);
        int m4950getHeightimpl = IntSize.m4950getHeightimpl(j2);
        float f2 = m4951getWidthimpl;
        this.renderNode.setPivotX(TransformOrigin.m2748getPivotFractionXimpl(this.transformOrigin) * f2);
        float f3 = m4950getHeightimpl;
        this.renderNode.setPivotY(TransformOrigin.m2749getPivotFractionYimpl(this.transformOrigin) * f3);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + m4951getWidthimpl, this.renderNode.getTop() + m4950getHeightimpl)) {
            this.outlineResolver.m4250updateuvyYCjk(SizeKt.Size(f2, f3));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m2753getCenterSzJe1aQ();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            setDirty(false);
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            Function1<? super Canvas, Unit> function1 = this.drawBlock;
            if (function1 == null) {
                return;
            }
            this.renderNode.record(this.canvasHolder, clipPath, function1);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: updateLayerProperties-YPkPJjM */
    public void mo4105updateLayerPropertiesYPkPJjM(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, @NotNull Shape shape, boolean z, @Nullable RenderEffect renderEffect, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.transformOrigin = j2;
        boolean z2 = true;
        boolean z3 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        this.renderNode.setScaleX(f2);
        this.renderNode.setScaleY(f3);
        this.renderNode.setAlpha(f4);
        this.renderNode.setTranslationX(f5);
        this.renderNode.setTranslationY(f6);
        this.renderNode.setElevation(f7);
        this.renderNode.setRotationZ(f10);
        this.renderNode.setRotationX(f8);
        this.renderNode.setRotationY(f9);
        this.renderNode.setCameraDistance(f11);
        this.renderNode.setPivotX(TransformOrigin.m2748getPivotFractionXimpl(j2) * this.renderNode.getWidth());
        this.renderNode.setPivotY(TransformOrigin.m2749getPivotFractionYimpl(j2) * this.renderNode.getHeight());
        this.renderNode.setClipToOutline(z && shape != RectangleShapeKt.getRectangleShape());
        this.renderNode.setClipToBounds(z && shape == RectangleShapeKt.getRectangleShape());
        this.renderNode.setRenderEffect(renderEffect);
        boolean update = this.outlineResolver.update(shape, this.renderNode.getAlpha(), this.renderNode.getClipToOutline(), this.renderNode.getElevation(), layoutDirection, density);
        this.renderNode.setOutline(this.outlineResolver.getOutline());
        if (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            z2 = false;
        }
        if (z3 != z2 || (z2 && update)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        this.matrixCache.invalidate();
    }
}
