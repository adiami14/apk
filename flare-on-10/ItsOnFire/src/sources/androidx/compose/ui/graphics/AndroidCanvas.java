package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020\u0015H\u0016JH\u0010*\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J-\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b5\u00106J-\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002032\u0006\u0010/\u001a\u000200H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b;\u0010<JE\u0010=\u001a\u00020\u00152\u0006\u00108\u001a\u0002092\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020A2\u0006\u0010/\u001a\u000200H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u00020\u00152\u0006\u0010G\u001a\u0002032\u0006\u0010H\u001a\u0002032\u0006\u0010/\u001a\u000200H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ)\u0010K\u001a\u00020\u00152\f\u0010L\u001a\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001a\u0002002\u0006\u0010N\u001a\u00020OH\u0002ø\u0001��J0\u0010P\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u0010Q\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010/\u001a\u000200H\u0016J3\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020T2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001a\u000200H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bU\u0010VJ!\u0010R\u001a\u00020\u00152\f\u0010L\u001a\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001a\u000200H\u0002ø\u0001��J \u0010W\u001a\u00020\u00152\u0006\u0010L\u001a\u00020X2\u0006\u0010/\u001a\u0002002\u0006\u0010N\u001a\u00020OH\u0002J-\u0010Y\u001a\u00020\u00152\u0006\u0010S\u001a\u00020T2\u0006\u0010L\u001a\u00020X2\u0006\u0010/\u001a\u000200H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bZ\u0010[J \u0010Y\u001a\u00020\u00152\u0006\u0010L\u001a\u00020X2\u0006\u0010/\u001a\u0002002\u0006\u0010N\u001a\u00020OH\u0002J0\u0010\\\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J@\u0010]\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010^\u001a\u00020\u001e2\u0006\u0010_\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J-\u0010`\u001a\u00020\u00152\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010/\u001a\u000200H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\be\u0010fJ\b\u0010g\u001a\u00020\u0015H\u0016J\b\u0010h\u001a\u00020\u0015H\u0016J\u0010\u0010i\u001a\u00020\u00152\u0006\u0010j\u001a\u00020\u001eH\u0016J\b\u0010k\u001a\u00020\u0015H\u0016J\u0018\u0010l\u001a\u00020\u00152\u0006\u0010m\u001a\u00020n2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u0010o\u001a\u00020\u00152\u0006\u0010p\u001a\u00020\u001e2\u0006\u0010q\u001a\u00020\u001eH\u0016J\u0018\u0010r\u001a\u00020\u00152\u0006\u0010p\u001a\u00020\u001e2\u0006\u0010q\u001a\u00020\u001eH\u0016J\u0018\u0010s\u001a\u00020\u00152\u0006\u0010t\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020\u001eH\u0016J\u0017\u0010v\u001a\u00020w*\u00020\u0019ø\u0001��ø\u0001\u0001¢\u0006\u0004\bx\u0010yR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R(\u0010\t\u001a\u00060\nj\u0002`\u000b8��@��X\u0081\u000e¢\u0006\u0014\n��\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006z"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "()V", "dstRect", "Landroid/graphics/Rect;", "getDstRect", "()Landroid/graphics/Rect;", "dstRect$delegate", "Lkotlin/Lazy;", "internalCanvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "getInternalCanvas$annotations", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "srcRect", "getSrcRect", "srcRect$delegate", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLines", "points", "", "stepBy", "", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawLines", "", "drawRawPoints", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "scale", "sx", "sy", "skew", "translate", "dx", "dy", "toRegionOp", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@PublishedApi
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/AndroidCanvas.class */
public final class AndroidCanvas implements Canvas {
    @NotNull
    private final Lazy dstRect$delegate;
    @NotNull
    private android.graphics.Canvas internalCanvas;
    @NotNull
    private final Lazy srcRect$delegate;

    public AndroidCanvas() {
        android.graphics.Canvas canvas;
        Lazy lazy;
        Lazy lazy2;
        canvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.internalCanvas = canvas;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Rect>() { // from class: androidx.compose.ui.graphics.AndroidCanvas$srcRect$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Rect invoke() {
                return new Rect();
            }
        });
        this.srcRect$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Rect>() { // from class: androidx.compose.ui.graphics.AndroidCanvas$dstRect$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Rect invoke() {
                return new Rect();
            }
        });
        this.dstRect$delegate = lazy2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (r0 > r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drawLines(java.util.List<androidx.compose.ui.geometry.Offset> r8, androidx.compose.ui.graphics.Paint r9, int r10) {
        /*
            r7 = this;
            r0 = r8
            int r0 = r0.size()
            r1 = 2
            if (r0 < r1) goto La1
            r0 = 0
            r1 = r8
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = r10
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r11 = r0
            r0 = r11
            int r0 = r0.getFirst()
            r12 = r0
            r0 = r11
            int r0 = r0.getLast()
            r13 = r0
            r0 = r11
            int r0 = r0.getStep()
            r14 = r0
            r0 = r14
            if (r0 <= 0) goto L40
            r0 = r12
            r10 = r0
            r0 = r12
            r1 = r13
            if (r0 <= r1) goto L4f
        L40:
            r0 = r14
            if (r0 >= 0) goto La1
            r0 = r13
            r1 = r12
            if (r0 > r1) goto La1
            r0 = r12
            r10 = r0
        L4f:
            r0 = r8
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
            long r0 = r0.m2177unboximpl()
            r15 = r0
            r0 = r8
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
            long r0 = r0.m2177unboximpl()
            r17 = r0
            r0 = r7
            android.graphics.Canvas r0 = r0.internalCanvas
            r1 = r15
            float r1 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r1)
            r2 = r15
            float r2 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r2)
            r3 = r17
            float r3 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r3)
            r4 = r17
            float r4 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r4)
            r5 = r9
            android.graphics.Paint r5 = r5.asFrameworkPaint()
            r0.drawLine(r1, r2, r3, r4, r5)
            r0 = r10
            r1 = r13
            if (r0 != r1) goto L99
            goto La1
        L99:
            r0 = r10
            r1 = r14
            int r0 = r0 + r1
            r10 = r0
            goto L4f
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidCanvas.drawLines(java.util.List, androidx.compose.ui.graphics.Paint, int):void");
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long m2177unboximpl = list.get(i2).m2177unboximpl();
            getInternalCanvas().drawPoint(Offset.m2167getXimpl(m2177unboximpl), Offset.m2168getYimpl(m2177unboximpl), paint.asFrameworkPaint());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (r0 > r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drawRawLines(float[] r8, androidx.compose.ui.graphics.Paint r9, int r10) {
        /*
            r7 = this;
            r0 = r8
            int r0 = r0.length
            r1 = 4
            if (r0 < r1) goto L90
            r0 = r8
            int r0 = r0.length
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L90
            r0 = 0
            r1 = r8
            int r1 = r1.length
            r2 = 3
            int r1 = r1 - r2
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = r10
            r2 = 2
            int r1 = r1 * r2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r11 = r0
            r0 = r11
            int r0 = r0.getFirst()
            r12 = r0
            r0 = r11
            int r0 = r0.getLast()
            r13 = r0
            r0 = r11
            int r0 = r0.getStep()
            r14 = r0
            r0 = r14
            if (r0 <= 0) goto L41
            r0 = r12
            r10 = r0
            r0 = r12
            r1 = r13
            if (r0 <= r1) goto L50
        L41:
            r0 = r14
            if (r0 >= 0) goto L90
            r0 = r13
            r1 = r12
            if (r0 > r1) goto L90
            r0 = r12
            r10 = r0
        L50:
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r15 = r0
            r0 = r8
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r16 = r0
            r0 = r8
            r1 = r10
            r2 = 2
            int r1 = r1 + r2
            r0 = r0[r1]
            r17 = r0
            r0 = r8
            r1 = r10
            r2 = 3
            int r1 = r1 + r2
            r0 = r0[r1]
            r18 = r0
            r0 = r7
            android.graphics.Canvas r0 = r0.internalCanvas
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r9
            android.graphics.Paint r5 = r5.asFrameworkPaint()
            r0.drawLine(r1, r2, r3, r4, r5)
            r0 = r10
            r1 = r13
            if (r0 != r1) goto L88
            goto L90
        L88:
            r0 = r10
            r1 = r14
            int r0 = r0 + r1
            r10 = r0
            goto L50
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidCanvas.drawRawLines(float[], androidx.compose.ui.graphics.Paint, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r0 > r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drawRawPoints(float[] r6, androidx.compose.ui.graphics.Paint r7, int r8) {
        /*
            r5 = this;
            r0 = r6
            int r0 = r0.length
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L76
            r0 = 0
            r1 = r6
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = r8
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r9 = r0
            r0 = r9
            int r0 = r0.getFirst()
            r10 = r0
            r0 = r9
            int r0 = r0.getLast()
            r11 = r0
            r0 = r9
            int r0 = r0.getStep()
            r12 = r0
            r0 = r12
            if (r0 <= 0) goto L39
            r0 = r10
            r8 = r0
            r0 = r10
            r1 = r11
            if (r0 <= r1) goto L48
        L39:
            r0 = r12
            if (r0 >= 0) goto L76
            r0 = r11
            r1 = r10
            if (r0 > r1) goto L76
            r0 = r10
            r8 = r0
        L48:
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r13 = r0
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r14 = r0
            r0 = r5
            android.graphics.Canvas r0 = r0.internalCanvas
            r1 = r13
            r2 = r14
            r3 = r7
            android.graphics.Paint r3 = r3.asFrameworkPaint()
            r0.drawPoint(r1, r2, r3)
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L6e
            goto L76
        L6e:
            r0 = r8
            r1 = r12
            int r0 = r0 + r1
            r8 = r0
            goto L48
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidCanvas.drawRawPoints(float[], androidx.compose.ui.graphics.Paint, int):void");
    }

    private final Rect getDstRect() {
        return (Rect) this.dstRect$delegate.getValue();
    }

    @PublishedApi
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    private final Rect getSrcRect() {
        return (Rect) this.srcRect$delegate.getValue();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    public void mo2264clipPathmtrdDE(@NotNull Path path, int i2) {
        Intrinsics.checkNotNullParameter(path, "path");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m2275toRegionOp7u2Bmg(i2));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    public void mo2265clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2) {
        this.internalCanvas.clipRect(f2, f3, f4, f5, m2275toRegionOp7u2Bmg(i2));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
    public void mo2266clipRectmtrdDE(@NotNull androidx.compose.ui.geometry.Rect rect, int i2) {
        Canvas.DefaultImpls.m2388clipRectmtrdDE(this, rect, i2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc  reason: not valid java name */
    public void mo2267concat58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (MatrixKt.m2613isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m2285setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawArc(f2, f3, f4, f5, f6, f7, z, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(@NotNull androidx.compose.ui.geometry.Rect rect, float f2, float f3, boolean z, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawArc(this, rect, f2, f3, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArcRad(@NotNull androidx.compose.ui.geometry.Rect rect, float f2, float f3, boolean z, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawArcRad(this, rect, f2, f3, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo  reason: not valid java name */
    public void mo2268drawCircle9KIMszo(long j2, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2), f2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I  reason: not valid java name */
    public void mo2269drawImaged4ec7I(@NotNull ImageBitmap image, long j2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0  reason: not valid java name */
    public void mo2270drawImageRectHPBpro0(@NotNull ImageBitmap image, long j2, long j3, long j4, long j5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect srcRect = getSrcRect();
        srcRect.left = IntOffset.m4907getXimpl(j2);
        srcRect.top = IntOffset.m4908getYimpl(j2);
        srcRect.right = IntOffset.m4907getXimpl(j2) + IntSize.m4951getWidthimpl(j3);
        srcRect.bottom = IntOffset.m4908getYimpl(j2) + IntSize.m4950getHeightimpl(j3);
        Unit unit = Unit.INSTANCE;
        Rect dstRect = getDstRect();
        dstRect.left = IntOffset.m4907getXimpl(j4);
        dstRect.top = IntOffset.m4908getYimpl(j4);
        dstRect.right = IntOffset.m4907getXimpl(j4) + IntSize.m4951getWidthimpl(j5);
        dstRect.bottom = IntOffset.m4908getYimpl(j4) + IntSize.m4950getHeightimpl(j5);
        canvas.drawBitmap(asAndroidBitmap, srcRect, dstRect, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g  reason: not valid java name */
    public void mo2271drawLineWko1d7g(long j2, long j3, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawLine(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2), Offset.m2167getXimpl(j3), Offset.m2168getYimpl(j3), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f2, float f3, float f4, float f5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawOval(f2, f3, f4, f5, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(@NotNull androidx.compose.ui.geometry.Rect rect, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawOval(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY  reason: not valid java name */
    public void mo2272drawPointsO7TthRY(int i2, @NotNull List<Offset> points, @NotNull Paint paint) {
        int i3;
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m2663equalsimpl0(i2, companion.m2667getLinesr_lszbg())) {
            i3 = 2;
        } else if (!PointMode.m2663equalsimpl0(i2, companion.m2669getPolygonr_lszbg())) {
            if (PointMode.m2663equalsimpl0(i2, companion.m2668getPointsr_lszbg())) {
                drawPoints(points, paint);
                return;
            }
            return;
        } else {
            i3 = 1;
        }
        drawLines(points, paint, i3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY  reason: not valid java name */
    public void mo2273drawRawPointsO7TthRY(int i2, @NotNull float[] points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m2663equalsimpl0(i2, companion.m2667getLinesr_lszbg())) {
            drawRawLines(points, paint, 2);
        } else if (PointMode.m2663equalsimpl0(i2, companion.m2669getPolygonr_lszbg())) {
            drawRawLines(points, paint, 1);
        } else if (PointMode.m2663equalsimpl0(i2, companion.m2668getPointsr_lszbg())) {
            drawRawPoints(points, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f2, float f3, float f4, float f5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRect(f2, f3, f4, f5, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(@NotNull androidx.compose.ui.geometry.Rect rect, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawRect(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRoundRect(f2, f3, f4, f5, f6, f7, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM  reason: not valid java name */
    public void mo2274drawVerticesTPEHhCM(@NotNull Vertices vertices, int i2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m2320toAndroidVertexModeJOOmi9M(vertices.m2765getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @NotNull
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f2) {
        this.internalCanvas.rotate(f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.ui.geometry.Rect bounds, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f2, float f3) {
        this.internalCanvas.scale(f2, f3);
    }

    public final void setInternalCanvas(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f2, float f3) {
        this.internalCanvas.skew(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skewRad(float f2, float f3) {
        Canvas.DefaultImpls.skewRad(this, f2, f3);
    }

    @NotNull
    /* renamed from: toRegionOp--7u2Bmg  reason: not valid java name */
    public final Region.Op m2275toRegionOp7u2Bmg(int i2) {
        return ClipOp.m2397equalsimpl0(i2, ClipOp.Companion.m2401getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f2, float f3) {
        this.internalCanvas.translate(f2, f3);
    }
}
