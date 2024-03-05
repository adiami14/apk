package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\b��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010R\u001a\u00020\u0014H\u0016J\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020TH\u0002J\f\u0010V\u001a\u00020T*\u00020WH\u0016R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n��R0\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020%@FX\u0086\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u000e\u00102\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n��R(\u00103\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR$\u00106\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010\u000fR/\u0010:\u001a\u0002092\u0006\u0010\u0003\u001a\u000209@FX\u0086\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R/\u0010>\u001a\u00020=2\u0006\u0010\u0003\u001a\u00020=@FX\u0086\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R$\u0010A\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bB\u0010\r\"\u0004\bC\u0010\u000fR$\u0010D\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010\u000fR\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e¢\u0006\u0002\n��R$\u0010I\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bJ\u0010\r\"\u0004\bK\u0010\u000fR$\u0010L\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bM\u0010\r\"\u0004\bN\u0010\u000fR$\u0010O\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bP\u0010\r\"\u0004\bQ\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "()V", "value", "Landroidx/compose/ui/graphics/Brush;", "fill", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "setFill", "(Landroidx/compose/ui/graphics/Brush;)V", "", "fillAlpha", "getFillAlpha", "()F", "setFillAlpha", "(F)V", "isPathDirty", "", "isStrokeDirty", "isTrimPathDirty", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "parser", "Landroidx/compose/ui/graphics/vector/PathParser;", "path", "Landroidx/compose/ui/graphics/Path;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "getPathData", "()Ljava/util/List;", "setPathData", "(Ljava/util/List;)V", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "getPathFillType-Rg-k1Os", "()I", "setPathFillType-oQ8Xj4U", "(I)V", "I", "pathMeasure", "Landroidx/compose/ui/graphics/PathMeasure;", "getPathMeasure", "()Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure$delegate", "Lkotlin/Lazy;", "renderPath", "stroke", "getStroke", "setStroke", "strokeAlpha", "getStrokeAlpha", "setStrokeAlpha", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "getStrokeLineCap-KaPHkGw", "setStrokeLineCap-BeK7IIE", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "getStrokeLineJoin-LxFBmk8", "setStrokeLineJoin-Ww9F2mQ", "strokeLineMiter", "getStrokeLineMiter", "setStrokeLineMiter", "strokeLineWidth", "getStrokeLineWidth", "setStrokeLineWidth", "strokeStyle", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "trimPathEnd", "getTrimPathEnd", "setTrimPathEnd", "trimPathOffset", "getTrimPathOffset", "setTrimPathOffset", "trimPathStart", "getTrimPathStart", "setTrimPathStart", "toString", "updatePath", "", "updateRenderPath", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/PathComponent.class */
public final class PathComponent extends VNode {
    @Nullable
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;
    @NotNull
    private String name;
    @NotNull
    private final PathParser parser;
    @NotNull
    private final Path path;
    @NotNull
    private List<? extends PathNode> pathData;
    private int pathFillType;
    @NotNull
    private final Lazy pathMeasure$delegate;
    @NotNull
    private final Path renderPath;
    @Nullable
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;
    @Nullable
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super(null);
        Lazy lazy;
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        this.isTrimPathDirty = true;
        this.path = AndroidPath_androidKt.Path();
        this.renderPath = AndroidPath_androidKt.Path();
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<PathMeasure>() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PathMeasure invoke() {
                return AndroidPathMeasure_androidKt.PathMeasure();
            }
        });
        this.pathMeasure$delegate = lazy;
        this.parser = new PathParser();
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure$delegate.getValue();
    }

    private final void updatePath() {
        this.parser.clear();
        this.path.reset();
        this.parser.addPathNodes(this.pathData).toPath(this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        this.renderPath.reset();
        if (this.trimPathStart == 0.0f) {
            if (this.trimPathEnd == 1.0f) {
                Path.DefaultImpls.m2631addPathUv8p0NA$default(this.renderPath, this.path, 0L, 2, null);
                return;
            }
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f2 = this.trimPathStart;
        float f3 = this.trimPathOffset;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.trimPathEnd + f3) % 1.0f) * length;
        if (f4 <= f5) {
            getPathMeasure().getSegment(f4, f5, this.renderPath, true);
            return;
        }
        getPathMeasure().getSegment(f4, length, this.renderPath, true);
        getPathMeasure().getSegment(0.0f, f5, this.renderPath, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r0 == null) goto L16;
     */
    @Override // androidx.compose.ui.graphics.vector.VNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(@org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.drawscope.DrawScope r11) {
        /*
            r10 = this;
            r0 = r11
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r10
            boolean r0 = r0.isPathDirty
            if (r0 == 0) goto L14
            r0 = r10
            r0.updatePath()
            goto L1f
        L14:
            r0 = r10
            boolean r0 = r0.isTrimPathDirty
            if (r0 == 0) goto L1f
            r0 = r10
            r0.updateRenderPath()
        L1f:
            r0 = r10
            r1 = 0
            r0.isPathDirty = r1
            r0 = r10
            r1 = 0
            r0.isTrimPathDirty = r1
            r0 = r10
            androidx.compose.ui.graphics.Brush r0 = r0.fill
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L35
            goto L48
        L35:
            r0 = r11
            r1 = r10
            androidx.compose.ui.graphics.Path r1 = r1.renderPath
            r2 = r12
            r3 = r10
            float r3 = r3.getFillAlpha()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.m2888drawPathGBMwjPU$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L48:
            r0 = r10
            androidx.compose.ui.graphics.Brush r0 = r0.stroke
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L54
            goto La2
        L54:
            r0 = r10
            androidx.compose.ui.graphics.drawscope.Stroke r0 = r0.strokeStyle
            r14 = r0
            r0 = r10
            boolean r0 = r0.isStrokeDirty
            if (r0 != 0) goto L69
            r0 = r14
            r12 = r0
            r0 = r14
            if (r0 != 0) goto L8f
        L69:
            androidx.compose.ui.graphics.drawscope.Stroke r0 = new androidx.compose.ui.graphics.drawscope.Stroke
            r1 = r0
            r2 = r10
            float r2 = r2.getStrokeLineWidth()
            r3 = r10
            float r3 = r3.getStrokeLineMiter()
            r4 = r10
            int r4 = r4.m2959getStrokeLineCapKaPHkGw()
            r5 = r10
            int r5 = r5.m2960getStrokeLineJoinLxFBmk8()
            r6 = 0
            r7 = 16
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12 = r0
            r0 = r10
            r1 = r12
            r0.strokeStyle = r1
            r0 = r10
            r1 = 0
            r0.isStrokeDirty = r1
        L8f:
            r0 = r11
            r1 = r10
            androidx.compose.ui.graphics.Path r1 = r1.renderPath
            r2 = r13
            r3 = r10
            float r3 = r3.getStrokeAlpha()
            r4 = r12
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.m2888drawPathGBMwjPU$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathComponent.draw(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }

    @Nullable
    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os  reason: not valid java name */
    public final int m2958getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    @Nullable
    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw  reason: not valid java name */
    public final int m2959getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8  reason: not valid java name */
    public final int m2960getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setFill(@Nullable Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f2) {
        this.fillAlpha = f2;
        invalidate();
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = value;
        invalidate();
    }

    public final void setPathData(@NotNull List<? extends PathNode> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.pathData = value;
        this.isPathDirty = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U  reason: not valid java name */
    public final void m2961setPathFillTypeoQ8Xj4U(int i2) {
        this.pathFillType = i2;
        this.renderPath.mo2309setFillTypeoQ8Xj4U(i2);
        invalidate();
    }

    public final void setStroke(@Nullable Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f2) {
        this.strokeAlpha = f2;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE  reason: not valid java name */
    public final void m2962setStrokeLineCapBeK7IIE(int i2) {
        this.strokeLineCap = i2;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ  reason: not valid java name */
    public final void m2963setStrokeLineJoinWw9F2mQ(int i2) {
        this.strokeLineJoin = i2;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f2) {
        this.strokeLineMiter = f2;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f2) {
        this.strokeLineWidth = f2;
        invalidate();
    }

    public final void setTrimPathEnd(float f2) {
        if (this.trimPathEnd == f2) {
            return;
        }
        this.trimPathEnd = f2;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f2) {
        if (this.trimPathOffset == f2) {
            return;
        }
        this.trimPathOffset = f2;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathStart(float f2) {
        if (this.trimPathStart == f2) {
            return;
        }
        this.trimPathStart = f2;
        this.isTrimPathDirty = true;
        invalidate();
    }

    @NotNull
    public String toString() {
        return this.path.toString();
    }
}
