package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018��2\u00020\u0001:\u0002\u0092\u0001B\u0005¢\u0006\u0002\u0010\u0002JK\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b%\u0010&JI\u0010\u0019\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b)\u0010*Jm\u0010+\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b4\u00105Jk\u0010+\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b6\u00107JR\u00108\u001a\u0002092\u0006\u0010\u0003\u001a\u00020:2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002090@¢\u0006\u0002\bAH\u0086\bø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bB\u0010CJg\u0010D\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bK\u0010LJg\u0010D\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bM\u0010NJO\u0010O\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020J2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bR\u0010SJO\u0010O\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020J2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bT\u0010UJG\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010I\u001a\u00020J2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bY\u0010ZJ_\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020^2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\ba\u0010bJg\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020^2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bc\u0010dJa\u0010e\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020J2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bh\u0010iJa\u0010e\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020J2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bj\u0010kJO\u0010l\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bm\u0010nJO\u0010l\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bo\u0010pJG\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020s2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bt\u0010uJG\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020s2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bv\u0010wJg\u0010x\u001a\u0002092\f\u0010y\u001a\b\u0012\u0004\u0012\u00020J0z2\u0006\u0010{\u001a\u00020|2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b}\u0010~Jh\u0010x\u001a\u0002092\f\u0010y\u001a\b\u0012\u0004\u0012\u00020J0z2\u0006\u0010{\u001a\u00020|2\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001JQ\u0010\u0081\u0001\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0005\b\u0082\u0001\u0010nJQ\u0010\u0081\u0001\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0005\b\u0083\u0001\u0010pJ\\\u0010\u0084\u0001\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\\\u0010\u0084\u0001\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\t\u0010\u008b\u0001\u001a\u00020\u0011H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010\u008d\u0001\u001a\u00020\u00112\u0007\u0010\u008e\u0001\u001a\u00020\u001dH\u0002J$\u0010\u008f\u0001\u001a\u00020(*\u00020(2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8��X\u0081\u0004¢\u0006\u000e\n��\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n��\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006\u0093\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "()V", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "strokePaint", "configurePaint", "brush", "Landroidx/compose/ui/graphics/Brush;", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "alpha", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "color", "Landroidx/compose/ui/graphics/Color;", "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "strokeWidth", "miter", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "draw", "", "Landroidx/compose/ui/unit/Density;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "obtainFillPaint", "obtainStrokePaint", "selectPaint", "drawStyle", "modulate", "modulate-5vOe2sY", "(JF)J", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/drawscope/CanvasDrawScope.class */
public final class CanvasDrawScope implements DrawScope {
    @Nullable
    private Paint fillPaint;
    @Nullable
    private Paint strokePaint;
    @NotNull
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    @NotNull
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        @NotNull
        private final DrawTransform transform;

        {
            DrawTransform asDrawTransform;
            asDrawTransform = CanvasDrawScopeKt.asDrawTransform(this);
            this.transform = asDrawTransform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @NotNull
        public Canvas getCanvas() {
            return CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public long mo2847getSizeNHjbRc() {
            return CanvasDrawScope.this.getDrawParams().m2845getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @NotNull
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk  reason: not valid java name */
        public void mo2848setSizeuvyYCjk(long j2) {
            CanvasDrawScope.this.getDrawParams().m2846setSizeuvyYCjk(j2);
        }
    };

    @Metadata(d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0081\b\u0018��2\u00020\u0001B0\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\tø\u0001��¢\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\u001f\u001a\u00020\tHÆ\u0003ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b \u0010\u0018J>\u0010!\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R%\u0010\b\u001a\u00020\tX\u0086\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "J", "component1", "component2", "component3", "component4", "component4-NH-jbRc", "copy", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @PublishedApi
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams.class */
    public static final class DrawParams {
        @NotNull
        private Canvas canvas;
        @NotNull
        private Density density;
        @NotNull
        private LayoutDirection layoutDirection;
        private long size;

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ DrawParams(androidx.compose.ui.unit.Density r9, androidx.compose.ui.unit.LayoutDirection r10, androidx.compose.ui.graphics.Canvas r11, long r12, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r8 = this;
                r0 = r14
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto Lb
                androidx.compose.ui.unit.Density r0 = androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.access$getDefaultDensity$p()
                r9 = r0
            Lb:
                r0 = r14
                r1 = 2
                r0 = r0 & r1
                if (r0 == 0) goto L16
                androidx.compose.ui.unit.LayoutDirection r0 = androidx.compose.ui.unit.LayoutDirection.Ltr
                r10 = r0
            L16:
                r0 = r14
                r1 = 4
                r0 = r0 & r1
                if (r0 == 0) goto L25
                androidx.compose.ui.graphics.drawscope.EmptyCanvas r0 = new androidx.compose.ui.graphics.drawscope.EmptyCanvas
                r1 = r0
                r1.<init>()
                r11 = r0
            L25:
                r0 = r14
                r1 = 8
                r0 = r0 & r1
                if (r0 == 0) goto L35
                androidx.compose.ui.geometry.Size$Companion r0 = androidx.compose.ui.geometry.Size.Companion
                long r0 = r0.m2248getZeroNHjbRc()
                r12 = r0
            L35:
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams.<init>(androidx.compose.ui.unit.Density, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.graphics.Canvas, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j2);
        }

        /* renamed from: copy-Ug5Nnss$default  reason: not valid java name */
        public static /* synthetic */ DrawParams m2842copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i2 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            if ((i2 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            if ((i2 & 8) != 0) {
                j2 = drawParams.size;
            }
            return drawParams.m2844copyUg5Nnss(density, layoutDirection, canvas, j2);
        }

        @NotNull
        public final Density component1() {
            return this.density;
        }

        @NotNull
        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        @NotNull
        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc  reason: not valid java name */
        public final long m2843component4NHjbRc() {
            return this.size;
        }

        @NotNull
        /* renamed from: copy-Ug5Nnss  reason: not valid java name */
        public final DrawParams m2844copyUg5Nnss(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long j2) {
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            return new DrawParams(density, layoutDirection, canvas, j2, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DrawParams) {
                DrawParams drawParams = (DrawParams) obj;
                return Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.areEqual(this.canvas, drawParams.canvas) && Size.m2235equalsimpl0(this.size, drawParams.size);
            }
            return false;
        }

        @NotNull
        public final Canvas getCanvas() {
            return this.canvas;
        }

        @NotNull
        public final Density getDensity() {
            return this.density;
        }

        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public final long m2845getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m2240hashCodeimpl(this.size);
        }

        public final void setCanvas(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "<set-?>");
            this.canvas = canvas;
        }

        public final void setDensity(@NotNull Density density) {
            Intrinsics.checkNotNullParameter(density, "<set-?>");
            this.density = density;
        }

        public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk  reason: not valid java name */
        public final void m2846setSizeuvyYCjk(long j2) {
            this.size = j2;
        }

        @NotNull
        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m2243toStringimpl(this.size)) + ')';
        }
    }

    /* renamed from: configurePaint-2qPWKa0  reason: not valid java name */
    private final Paint m2811configurePaint2qPWKa0(long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint selectPaint = selectPaint(drawStyle);
        long m2819modulate5vOe2sY = m2819modulate5vOe2sY(j2, f2);
        if (!Color.m2415equalsimpl0(selectPaint.mo2288getColor0d7_KjU(), m2819modulate5vOe2sY)) {
            selectPaint.mo2294setColor8_81llA(m2819modulate5vOe2sY);
        }
        if (selectPaint.getShader() != null) {
            selectPaint.setShader(null);
        }
        if (!Intrinsics.areEqual(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2327equalsimpl0(selectPaint.mo2287getBlendMode0nO6VwU(), i2)) {
            selectPaint.mo2293setBlendModes9anfk8(i2);
        }
        if (!FilterQuality.m2497equalsimpl0(selectPaint.mo2289getFilterQualityfv9h1I(), i3)) {
            selectPaint.mo2295setFilterQualityvDHp3xo(i3);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default  reason: not valid java name */
    public static /* synthetic */ Paint m2812configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = DrawScope.Companion.m2875getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m2811configurePaint2qPWKa0(j2, drawStyle, f2, colorFilter, i2, i3);
    }

    /* renamed from: configurePaint-swdJneE  reason: not valid java name */
    private final Paint m2813configurePaintswdJneE(Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint selectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo2363applyToPq9zytI(mo2841getSizeNHjbRc(), selectPaint, f2);
        } else {
            if (!(selectPaint.getAlpha() == f2)) {
                selectPaint.setAlpha(f2);
            }
        }
        if (!Intrinsics.areEqual(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2327equalsimpl0(selectPaint.mo2287getBlendMode0nO6VwU(), i2)) {
            selectPaint.mo2293setBlendModes9anfk8(i2);
        }
        if (!FilterQuality.m2497equalsimpl0(selectPaint.mo2289getFilterQualityfv9h1I(), i3)) {
            selectPaint.mo2295setFilterQualityvDHp3xo(i3);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default  reason: not valid java name */
    public static /* synthetic */ Paint m2814configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = DrawScope.Companion.m2875getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m2813configurePaintswdJneE(brush, drawStyle, f2, colorFilter, i2, i3);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI  reason: not valid java name */
    private final Paint m2815configureStrokePaintQ_0CZUI(long j2, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5) {
        Paint obtainStrokePaint = obtainStrokePaint();
        long m2819modulate5vOe2sY = m2819modulate5vOe2sY(j2, f4);
        if (!Color.m2415equalsimpl0(obtainStrokePaint.mo2288getColor0d7_KjU(), m2819modulate5vOe2sY)) {
            obtainStrokePaint.mo2294setColor8_81llA(m2819modulate5vOe2sY);
        }
        if (obtainStrokePaint.getShader() != null) {
            obtainStrokePaint.setShader(null);
        }
        if (!Intrinsics.areEqual(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2327equalsimpl0(obtainStrokePaint.mo2287getBlendMode0nO6VwU(), i4)) {
            obtainStrokePaint.mo2293setBlendModes9anfk8(i4);
        }
        if (!(obtainStrokePaint.getStrokeWidth() == f2)) {
            obtainStrokePaint.setStrokeWidth(f2);
        }
        if (!(obtainStrokePaint.getStrokeMiterLimit() == f3)) {
            obtainStrokePaint.setStrokeMiterLimit(f3);
        }
        if (!StrokeCap.m2707equalsimpl0(obtainStrokePaint.mo2290getStrokeCapKaPHkGw(), i2)) {
            obtainStrokePaint.mo2296setStrokeCapBeK7IIE(i2);
        }
        if (!StrokeJoin.m2718equalsimpl0(obtainStrokePaint.mo2291getStrokeJoinLxFBmk8(), i3)) {
            obtainStrokePaint.mo2297setStrokeJoinWw9F2mQ(i3);
        }
        if (!Intrinsics.areEqual(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m2497equalsimpl0(obtainStrokePaint.mo2289getFilterQualityfv9h1I(), i5)) {
            obtainStrokePaint.mo2295setFilterQualityvDHp3xo(i5);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default  reason: not valid java name */
    public static /* synthetic */ Paint m2816configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j2, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        if ((i6 & 512) != 0) {
            i5 = DrawScope.Companion.m2875getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m2815configureStrokePaintQ_0CZUI(j2, f2, f3, i2, i3, pathEffect, f4, colorFilter, i4, i5);
    }

    /* renamed from: configureStrokePaint-ho4zsrM  reason: not valid java name */
    private final Paint m2817configureStrokePaintho4zsrM(Brush brush, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5) {
        Paint obtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo2363applyToPq9zytI(mo2841getSizeNHjbRc(), obtainStrokePaint, f4);
        } else {
            if (!(obtainStrokePaint.getAlpha() == f4)) {
                obtainStrokePaint.setAlpha(f4);
            }
        }
        if (!Intrinsics.areEqual(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2327equalsimpl0(obtainStrokePaint.mo2287getBlendMode0nO6VwU(), i4)) {
            obtainStrokePaint.mo2293setBlendModes9anfk8(i4);
        }
        if (!(obtainStrokePaint.getStrokeWidth() == f2)) {
            obtainStrokePaint.setStrokeWidth(f2);
        }
        if (!(obtainStrokePaint.getStrokeMiterLimit() == f3)) {
            obtainStrokePaint.setStrokeMiterLimit(f3);
        }
        if (!StrokeCap.m2707equalsimpl0(obtainStrokePaint.mo2290getStrokeCapKaPHkGw(), i2)) {
            obtainStrokePaint.mo2296setStrokeCapBeK7IIE(i2);
        }
        if (!StrokeJoin.m2718equalsimpl0(obtainStrokePaint.mo2291getStrokeJoinLxFBmk8(), i3)) {
            obtainStrokePaint.mo2297setStrokeJoinWw9F2mQ(i3);
        }
        if (!Intrinsics.areEqual(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m2497equalsimpl0(obtainStrokePaint.mo2289getFilterQualityfv9h1I(), i5)) {
            obtainStrokePaint.mo2295setFilterQualityvDHp3xo(i5);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default  reason: not valid java name */
    public static /* synthetic */ Paint m2818configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        if ((i6 & 512) != 0) {
            i5 = DrawScope.Companion.m2875getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m2817configureStrokePaintho4zsrM(brush, f2, f3, i2, i3, pathEffect, f4, colorFilter, i4, i5);
    }

    @PublishedApi
    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* renamed from: modulate-5vOe2sY  reason: not valid java name */
    private final long m2819modulate5vOe2sY(long j2, float f2) {
        long j3 = j2;
        if (!(f2 == 1.0f)) {
            j3 = Color.m2413copywmQWz5c$default(j2, Color.m2416getAlphaimpl(j2) * f2, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j3;
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        Paint paint2 = paint;
        if (paint == null) {
            paint2 = AndroidPaint_androidKt.Paint();
            paint2.mo2298setStylek9PVt8s(PaintingStyle.Companion.m2626getFillTiuSbCo());
            this.fillPaint = paint2;
        }
        return paint2;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        Paint paint2 = paint;
        if (paint == null) {
            paint2 = AndroidPaint_androidKt.Paint();
            paint2.mo2298setStylek9PVt8s(PaintingStyle.Companion.m2627getStrokeTiuSbCo());
            this.strokePaint = paint2;
        }
        return paint2;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        Paint paint;
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            paint = obtainFillPaint();
        } else if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        } else {
            Paint obtainStrokePaint = obtainStrokePaint();
            float strokeWidth = obtainStrokePaint.getStrokeWidth();
            Stroke stroke = (Stroke) drawStyle;
            if (!(strokeWidth == stroke.getWidth())) {
                obtainStrokePaint.setStrokeWidth(stroke.getWidth());
            }
            if (!StrokeCap.m2707equalsimpl0(obtainStrokePaint.mo2290getStrokeCapKaPHkGw(), stroke.m2934getCapKaPHkGw())) {
                obtainStrokePaint.mo2296setStrokeCapBeK7IIE(stroke.m2934getCapKaPHkGw());
            }
            if (!(obtainStrokePaint.getStrokeMiterLimit() == stroke.getMiter())) {
                obtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
            }
            if (!StrokeJoin.m2718equalsimpl0(obtainStrokePaint.mo2291getStrokeJoinLxFBmk8(), stroke.m2935getJoinLxFBmk8())) {
                obtainStrokePaint.mo2297setStrokeJoinWw9F2mQ(stroke.m2935getJoinLxFBmk8());
            }
            paint = obtainStrokePaint;
            if (!Intrinsics.areEqual(obtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
                obtainStrokePaint.setPathEffect(stroke.getPathEffect());
                paint = obtainStrokePaint;
            }
        }
        return paint;
    }

    /* renamed from: draw-yzxVdVo  reason: not valid java name */
    public final void m2820drawyzxVdVo(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long j2, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawParams drawParams = getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m2843component4NHjbRc = drawParams.m2843component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2846setSizeuvyYCjk(j2);
        canvas.save();
        block.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m2846setSizeuvyYCjk(m2843component4NHjbRc);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I  reason: not valid java name */
    public void mo2821drawArcillE91I(@NotNull Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawArc(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2), Offset.m2167getXimpl(j2) + Size.m2239getWidthimpl(j3), Offset.m2168getYimpl(j2) + Size.m2236getHeightimpl(j3), f2, f3, z, m2814configurePaintswdJneE$default(this, brush, style, f4, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo  reason: not valid java name */
    public void mo2822drawArcyD3GUKo(long j2, float f2, float f3, boolean z, long j3, long j4, float f4, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawArc(Offset.m2167getXimpl(j3), Offset.m2168getYimpl(j3), Offset.m2167getXimpl(j3) + Size.m2239getWidthimpl(j4), Offset.m2168getYimpl(j3) + Size.m2236getHeightimpl(j4), f2, f3, z, m2812configurePaint2qPWKa0$default(this, j2, style, f4, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw  reason: not valid java name */
    public void mo2823drawCircleV9BoPsw(@NotNull Brush brush, float f2, long j2, float f3, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2268drawCircle9KIMszo(j2, f2, m2814configurePaintswdJneE$default(this, brush, style, f3, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg  reason: not valid java name */
    public void mo2824drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2268drawCircle9KIMszo(j3, f2, m2812configurePaint2qPWKa0$default(this, j2, style, f3, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-9jGpkUE  reason: not valid java name */
    public /* synthetic */ void mo2825drawImage9jGpkUE(ImageBitmap image, long j2, long j3, long j4, long j5, float f2, DrawStyle style, ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2270drawImageRectHPBpro0(image, j2, j3, j4, j5, m2814configurePaintswdJneE$default(this, null, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
    public void mo2826drawImageAZ2fEMs(@NotNull ImageBitmap image, long j2, long j3, long j4, long j5, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2, int i3) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2270drawImageRectHPBpro0(image, j2, j3, j4, j5, m2813configurePaintswdJneE(null, style, f2, colorFilter, i2, i3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8  reason: not valid java name */
    public void mo2827drawImagegbVJVH8(@NotNull ImageBitmap image, long j2, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2269drawImaged4ec7I(image, j2, m2814configurePaintswdJneE$default(this, null, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc  reason: not valid java name */
    public void mo2828drawLine1RTmtNc(@NotNull Brush brush, long j2, long j3, float f2, int i2, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i3) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.drawParams.getCanvas().mo2271drawLineWko1d7g(j2, j3, m2818configureStrokePaintho4zsrM$default(this, brush, f2, 4.0f, i2, StrokeJoin.Companion.m2723getMiterLxFBmk8(), pathEffect, f3, colorFilter, i3, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0  reason: not valid java name */
    public void mo2829drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo2271drawLineWko1d7g(j3, j4, m2816configureStrokePaintQ_0CZUI$default(this, j2, f2, 4.0f, i2, StrokeJoin.Companion.m2723getMiterLxFBmk8(), pathEffect, f3, colorFilter, i3, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w  reason: not valid java name */
    public void mo2830drawOvalAsUm42w(@NotNull Brush brush, long j2, long j3, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawOval(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2), Offset.m2167getXimpl(j2) + Size.m2239getWidthimpl(j3), Offset.m2168getYimpl(j2) + Size.m2236getHeightimpl(j3), m2814configurePaintswdJneE$default(this, brush, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0  reason: not valid java name */
    public void mo2831drawOvalnJ9OG0(long j2, long j3, long j4, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawOval(Offset.m2167getXimpl(j3), Offset.m2168getYimpl(j3), Offset.m2167getXimpl(j3) + Size.m2239getWidthimpl(j4), Offset.m2168getYimpl(j3) + Size.m2236getHeightimpl(j4), m2812configurePaint2qPWKa0$default(this, j2, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU  reason: not valid java name */
    public void mo2832drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawPath(path, m2814configurePaintswdJneE$default(this, brush, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI  reason: not valid java name */
    public void mo2833drawPathLG529CI(@NotNull Path path, long j2, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawPath(path, m2812configurePaint2qPWKa0$default(this, j2, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8  reason: not valid java name */
    public void mo2834drawPointsF8ZwMP8(@NotNull List<Offset> points, int i2, long j2, float f2, int i3, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i4) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.drawParams.getCanvas().mo2272drawPointsO7TthRY(i2, points, m2816configureStrokePaintQ_0CZUI$default(this, j2, f2, 4.0f, i3, StrokeJoin.Companion.m2723getMiterLxFBmk8(), pathEffect, f3, colorFilter, i4, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws  reason: not valid java name */
    public void mo2835drawPointsGsft0Ws(@NotNull List<Offset> points, int i2, @NotNull Brush brush, float f2, int i3, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i4) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.drawParams.getCanvas().mo2272drawPointsO7TthRY(i2, points, m2818configureStrokePaintho4zsrM$default(this, brush, f2, 4.0f, i3, StrokeJoin.Companion.m2723getMiterLxFBmk8(), pathEffect, f3, colorFilter, i4, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w  reason: not valid java name */
    public void mo2836drawRectAsUm42w(@NotNull Brush brush, long j2, long j3, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRect(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2), Offset.m2167getXimpl(j2) + Size.m2239getWidthimpl(j3), Offset.m2168getYimpl(j2) + Size.m2236getHeightimpl(j3), m2814configurePaintswdJneE$default(this, brush, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0  reason: not valid java name */
    public void mo2837drawRectnJ9OG0(long j2, long j3, long j4, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRect(Offset.m2167getXimpl(j3), Offset.m2168getYimpl(j3), Offset.m2167getXimpl(j3) + Size.m2239getWidthimpl(j4), Offset.m2168getYimpl(j3) + Size.m2236getHeightimpl(j4), m2812configurePaint2qPWKa0$default(this, j2, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ  reason: not valid java name */
    public void mo2838drawRoundRectZuiqVtQ(@NotNull Brush brush, long j2, long j3, long j4, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRoundRect(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2), Offset.m2167getXimpl(j2) + Size.m2239getWidthimpl(j3), Offset.m2168getYimpl(j2) + Size.m2236getHeightimpl(j3), CornerRadius.m2141getXimpl(j4), CornerRadius.m2142getYimpl(j4), m2814configurePaintswdJneE$default(this, brush, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA  reason: not valid java name */
    public void mo2839drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, @NotNull DrawStyle style, float f2, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRoundRect(Offset.m2167getXimpl(j3), Offset.m2168getYimpl(j3), Offset.m2167getXimpl(j3) + Size.m2239getWidthimpl(j4), Offset.m2168getYimpl(j3) + Size.m2236getHeightimpl(j4), CornerRadius.m2141getXimpl(j5), CornerRadius.m2142getYimpl(j5), m2812configurePaint2qPWKa0$default(this, j2, style, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    public long mo2840getCenterF1C5BW0() {
        return DrawScope.DefaultImpls.m2896getCenterF1C5BW0(this);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    @NotNull
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public long mo2841getSizeNHjbRc() {
        return DrawScope.DefaultImpls.m2897getSizeNHjbRc(this);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo517roundToPxR2X_6o(long j2) {
        return DrawScope.DefaultImpls.m2899roundToPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo518roundToPx0680j_4(float f2) {
        return DrawScope.DefaultImpls.m2900roundToPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo519toDpGaN1DYA(long j2) {
        return DrawScope.DefaultImpls.m2901toDpGaN1DYA(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo520toDpu2uoSUM(float f2) {
        return DrawScope.DefaultImpls.m2902toDpu2uoSUM(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo521toDpu2uoSUM(int i2) {
        return DrawScope.DefaultImpls.m2903toDpu2uoSUM((DrawScope) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo522toDpSizekrfVVM(long j2) {
        return DrawScope.DefaultImpls.m2904toDpSizekrfVVM(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo523toPxR2X_6o(long j2) {
        return DrawScope.DefaultImpls.m2905toPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo524toPx0680j_4(float f2) {
        return DrawScope.DefaultImpls.m2906toPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return DrawScope.DefaultImpls.toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo525toSizeXkaWNTQ(long j2) {
        return DrawScope.DefaultImpls.m2907toSizeXkaWNTQ(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo526toSp0xMU5do(float f2) {
        return DrawScope.DefaultImpls.m2908toSp0xMU5do(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo527toSpkPz2Gy4(float f2) {
        return DrawScope.DefaultImpls.m2909toSpkPz2Gy4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo528toSpkPz2Gy4(int i2) {
        return DrawScope.DefaultImpls.m2910toSpkPz2Gy4((DrawScope) this, i2);
    }
}
