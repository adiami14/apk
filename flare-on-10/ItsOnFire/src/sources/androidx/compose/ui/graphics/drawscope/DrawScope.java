package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@DrawScopeMarker
@Metadata(d1 = {"��¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018�� l2\u00020\u0001:\u0001lJs\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\"\u0010#Js\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b&\u0010'J[\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b*\u0010+J[\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b,\u0010-JQ\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b1\u00102Jo\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H'ø\u0001��ø\u0001\u0001¢\u0006\u0004\b9\u0010:Jy\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020<H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b=\u0010>Jm\u0010?\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bG\u0010HJm\u0010?\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ[\u0010K\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ[\u0010K\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bN\u0010OJO\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bS\u0010TJO\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bU\u0010VJs\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\\\u0010]Js\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b^\u0010_J[\u0010`\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\ba\u0010MJ[\u0010`\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bb\u0010OJe\u0010c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bf\u0010gJe\u0010c\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\bh\u0010iJ\u001a\u0010j\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010k\u001a\u00020\u0003H\u0002ø\u0001��ø\u0001\u0001R\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "drawArc", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "offsetSize", "offset", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/drawscope/DrawScope.class */
public interface DrawScope extends Density {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\tø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/drawscope/DrawScope$Companion.class */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m2358getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m2502getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU  reason: not valid java name */
        public final int m2874getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I  reason: not valid java name */
        public final int m2875getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/drawscope/DrawScope$DefaultImpls.class */
    public static final class DefaultImpls {
        /* renamed from: drawArc-illE91I$default  reason: not valid java name */
        public static /* synthetic */ void m2876drawArcillE91I$default(DrawScope drawScope, Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
            }
            if ((i3 & 16) != 0) {
                j2 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 32) != 0) {
                j3 = m2898offsetSizePENXr5M(drawScope, drawScope.mo2841getSizeNHjbRc(), j2);
            }
            if ((i3 & 64) != 0) {
                f4 = 1.0f;
            }
            if ((i3 & 128) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 256) != 0) {
                colorFilter = null;
            }
            if ((i3 & 512) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2821drawArcillE91I(brush, f2, f3, z, j2, j3, f4, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawArc-yD3GUKo$default  reason: not valid java name */
        public static /* synthetic */ void m2877drawArcyD3GUKo$default(DrawScope drawScope, long j2, float f2, float f3, boolean z, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
            }
            if ((i3 & 16) != 0) {
                j3 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 32) != 0) {
                j4 = m2898offsetSizePENXr5M(drawScope, drawScope.mo2841getSizeNHjbRc(), j3);
            }
            if ((i3 & 64) != 0) {
                f4 = 1.0f;
            }
            if ((i3 & 128) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 256) != 0) {
                colorFilter = null;
            }
            if ((i3 & 512) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2822drawArcyD3GUKo(j2, f2, f3, z, j3, j4, f4, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawCircle-V9BoPsw$default  reason: not valid java name */
        public static /* synthetic */ void m2878drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
            }
            if ((i3 & 2) != 0) {
                f2 = Size.m2238getMinDimensionimpl(drawScope.mo2841getSizeNHjbRc()) / 2.0f;
            }
            if ((i3 & 4) != 0) {
                j2 = drawScope.mo2840getCenterF1C5BW0();
            }
            if ((i3 & 8) != 0) {
                f3 = 1.0f;
            }
            if ((i3 & 16) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 32) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2823drawCircleV9BoPsw(brush, f2, j2, f3, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawCircle-VaOC9Bg$default  reason: not valid java name */
        public static /* synthetic */ void m2879drawCircleVaOC9Bg$default(DrawScope drawScope, long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            }
            if ((i3 & 2) != 0) {
                f2 = Size.m2238getMinDimensionimpl(drawScope.mo2841getSizeNHjbRc()) / 2.0f;
            }
            if ((i3 & 4) != 0) {
                j3 = drawScope.mo2840getCenterF1C5BW0();
            }
            if ((i3 & 8) != 0) {
                f3 = 1.0f;
            }
            if ((i3 & 16) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 32) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2824drawCircleVaOC9Bg(j2, f2, j3, f3, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawImage-9jGpkUE$default  reason: not valid java name */
        public static /* synthetic */ void m2880drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
            }
            long m4917getZeronOccac = (i3 & 2) != 0 ? IntOffset.Companion.m4917getZeronOccac() : j2;
            long IntSize = (i3 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3;
            long m4917getZeronOccac2 = (i3 & 8) != 0 ? IntOffset.Companion.m4917getZeronOccac() : j4;
            if ((i3 & 16) != 0) {
                j5 = IntSize;
            }
            if ((i3 & 32) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 64) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 128) != 0) {
                colorFilter = null;
            }
            if ((i3 & 256) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2825drawImage9jGpkUE(imageBitmap, m4917getZeronOccac, IntSize, m4917getZeronOccac2, j5, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
        public static void m2881drawImageAZ2fEMs(@NotNull DrawScope drawScope, @NotNull ImageBitmap image, long j2, long j3, long j4, long j5, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2, int i3) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            m2882drawImageAZ2fEMs$default(drawScope, image, j2, j3, j4, j5, f2, style, colorFilter, i2, 0, 512, null);
        }

        /* renamed from: drawImage-AZ2fEMs$default  reason: not valid java name */
        public static /* synthetic */ void m2882drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
            }
            long m4917getZeronOccac = (i4 & 2) != 0 ? IntOffset.Companion.m4917getZeronOccac() : j2;
            long IntSize = (i4 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3;
            long m4917getZeronOccac2 = (i4 & 8) != 0 ? IntOffset.Companion.m4917getZeronOccac() : j4;
            if ((i4 & 16) != 0) {
                j5 = IntSize;
            }
            if ((i4 & 32) != 0) {
                f2 = 1.0f;
            }
            if ((i4 & 64) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i4 & 128) != 0) {
                colorFilter = null;
            }
            if ((i4 & 256) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            if ((i4 & 512) != 0) {
                i3 = DrawScope.Companion.m2875getDefaultFilterQualityfv9h1I();
            }
            drawScope.mo2826drawImageAZ2fEMs(imageBitmap, m4917getZeronOccac, IntSize, m4917getZeronOccac2, j5, f2, drawStyle, colorFilter, i2, i3);
        }

        /* renamed from: drawImage-gbVJVH8$default  reason: not valid java name */
        public static /* synthetic */ void m2883drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
            }
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 4) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 16) != 0) {
                colorFilter = null;
            }
            if ((i3 & 32) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2827drawImagegbVJVH8(imageBitmap, j2, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawLine-1RTmtNc$default  reason: not valid java name */
        public static /* synthetic */ void m2884drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
            }
            if ((i4 & 8) != 0) {
                f2 = 0.0f;
            }
            if ((i4 & 16) != 0) {
                i2 = Stroke.Companion.m2936getDefaultCapKaPHkGw();
            }
            if ((i4 & 32) != 0) {
                pathEffect = null;
            }
            if ((i4 & 64) != 0) {
                f3 = 1.0f;
            }
            if ((i4 & 128) != 0) {
                colorFilter = null;
            }
            if ((i4 & 256) != 0) {
                i3 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2828drawLine1RTmtNc(brush, j2, j3, f2, i2, pathEffect, f3, colorFilter, i3);
        }

        /* renamed from: drawLine-NGM6Ib0$default  reason: not valid java name */
        public static /* synthetic */ void m2885drawLineNGM6Ib0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
            }
            if ((i4 & 8) != 0) {
                f2 = 0.0f;
            }
            if ((i4 & 16) != 0) {
                i2 = Stroke.Companion.m2936getDefaultCapKaPHkGw();
            }
            if ((i4 & 32) != 0) {
                pathEffect = null;
            }
            if ((i4 & 64) != 0) {
                f3 = 1.0f;
            }
            if ((i4 & 128) != 0) {
                colorFilter = null;
            }
            if ((i4 & 256) != 0) {
                i3 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2829drawLineNGM6Ib0(j2, j3, j4, f2, i2, pathEffect, f3, colorFilter, i3);
        }

        /* renamed from: drawOval-AsUm42w$default  reason: not valid java name */
        public static /* synthetic */ void m2886drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
            }
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 4) != 0) {
                j3 = m2898offsetSizePENXr5M(drawScope, drawScope.mo2841getSizeNHjbRc(), j2);
            }
            if ((i3 & 8) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 16) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 32) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2830drawOvalAsUm42w(brush, j2, j3, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawOval-n-J9OG0$default  reason: not valid java name */
        public static /* synthetic */ void m2887drawOvalnJ9OG0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
            }
            if ((i3 & 2) != 0) {
                j3 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 4) != 0) {
                j4 = m2898offsetSizePENXr5M(drawScope, drawScope.mo2841getSizeNHjbRc(), j3);
            }
            if ((i3 & 8) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 16) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 32) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2831drawOvalnJ9OG0(j2, j3, j4, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawPath-GBMwjPU$default  reason: not valid java name */
        public static /* synthetic */ void m2888drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            }
            if ((i3 & 4) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 16) != 0) {
                colorFilter = null;
            }
            if ((i3 & 32) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2832drawPathGBMwjPU(path, brush, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawPath-LG529CI$default  reason: not valid java name */
        public static /* synthetic */ void m2889drawPathLG529CI$default(DrawScope drawScope, Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
            }
            if ((i3 & 4) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 16) != 0) {
                colorFilter = null;
            }
            if ((i3 & 32) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2833drawPathLG529CI(path, j2, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawPoints-F8ZwMP8$default  reason: not valid java name */
        public static /* synthetic */ void m2890drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
            }
            if ((i5 & 8) != 0) {
                f2 = 0.0f;
            }
            if ((i5 & 16) != 0) {
                i3 = StrokeCap.Companion.m2711getButtKaPHkGw();
            }
            if ((i5 & 32) != 0) {
                pathEffect = null;
            }
            if ((i5 & 64) != 0) {
                f3 = 1.0f;
            }
            if ((i5 & 128) != 0) {
                colorFilter = null;
            }
            if ((i5 & 256) != 0) {
                i4 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2834drawPointsF8ZwMP8(list, i2, j2, f2, i3, pathEffect, f3, colorFilter, i4);
        }

        /* renamed from: drawPoints-Gsft0Ws$default  reason: not valid java name */
        public static /* synthetic */ void m2891drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
            }
            if ((i5 & 8) != 0) {
                f2 = 0.0f;
            }
            if ((i5 & 16) != 0) {
                i3 = StrokeCap.Companion.m2711getButtKaPHkGw();
            }
            if ((i5 & 32) != 0) {
                pathEffect = null;
            }
            if ((i5 & 64) != 0) {
                f3 = 1.0f;
            }
            if ((i5 & 128) != 0) {
                colorFilter = null;
            }
            if ((i5 & 256) != 0) {
                i4 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2835drawPointsGsft0Ws(list, i2, brush, f2, i3, pathEffect, f3, colorFilter, i4);
        }

        /* renamed from: drawRect-AsUm42w$default  reason: not valid java name */
        public static /* synthetic */ void m2892drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
            }
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 4) != 0) {
                j3 = m2898offsetSizePENXr5M(drawScope, drawScope.mo2841getSizeNHjbRc(), j2);
            }
            if ((i3 & 8) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 16) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 32) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2836drawRectAsUm42w(brush, j2, j3, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawRect-n-J9OG0$default  reason: not valid java name */
        public static /* synthetic */ void m2893drawRectnJ9OG0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
            }
            if ((i3 & 2) != 0) {
                j3 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 4) != 0) {
                j4 = m2898offsetSizePENXr5M(drawScope, drawScope.mo2841getSizeNHjbRc(), j3);
            }
            if ((i3 & 8) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 16) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 32) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2837drawRectnJ9OG0(j2, j3, j4, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawRoundRect-ZuiqVtQ$default  reason: not valid java name */
        public static /* synthetic */ void m2894drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
            }
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 4) != 0) {
                j3 = m2898offsetSizePENXr5M(drawScope, drawScope.mo2841getSizeNHjbRc(), j2);
            }
            if ((i3 & 8) != 0) {
                j4 = CornerRadius.Companion.m2151getZerokKHJgLs();
            }
            if ((i3 & 16) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 32) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 64) != 0) {
                colorFilter = null;
            }
            if ((i3 & 128) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2838drawRoundRectZuiqVtQ(brush, j2, j3, j4, f2, drawStyle, colorFilter, i2);
        }

        /* renamed from: drawRoundRect-u-Aw5IA$default  reason: not valid java name */
        public static /* synthetic */ void m2895drawRoundRectuAw5IA$default(DrawScope drawScope, long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
            }
            if ((i3 & 2) != 0) {
                j3 = Offset.Companion.m2183getZeroF1C5BW0();
            }
            if ((i3 & 4) != 0) {
                j4 = m2898offsetSizePENXr5M(drawScope, drawScope.mo2841getSizeNHjbRc(), j3);
            }
            if ((i3 & 8) != 0) {
                j5 = CornerRadius.Companion.m2151getZerokKHJgLs();
            }
            if ((i3 & 16) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 & 32) != 0) {
                f2 = 1.0f;
            }
            if ((i3 & 64) != 0) {
                colorFilter = null;
            }
            if ((i3 & 128) != 0) {
                i2 = DrawScope.Companion.m2874getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2839drawRoundRectuAw5IA(j2, j3, j4, j5, drawStyle, f2, colorFilter, i2);
        }

        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m2896getCenterF1C5BW0(@NotNull DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return SizeKt.m2249getCenteruvyYCjk(drawScope.getDrawContext().mo2847getSizeNHjbRc());
        }

        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public static long m2897getSizeNHjbRc(@NotNull DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return drawScope.getDrawContext().mo2847getSizeNHjbRc();
        }

        /* renamed from: offsetSize-PENXr5M  reason: not valid java name */
        private static long m2898offsetSizePENXr5M(DrawScope drawScope, long j2, long j3) {
            return SizeKt.Size(Size.m2239getWidthimpl(j2) - Offset.m2167getXimpl(j3), Size.m2236getHeightimpl(j2) - Offset.m2168getYimpl(j3));
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m2899roundToPxR2X_6o(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4770roundToPxR2X_6o(drawScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m2900roundToPx0680j_4(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4771roundToPx0680j_4(drawScope, f2);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m2901toDpGaN1DYA(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4772toDpGaN1DYA(drawScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2902toDpu2uoSUM(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4773toDpu2uoSUM(drawScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2903toDpu2uoSUM(@NotNull DrawScope drawScope, int i2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4774toDpu2uoSUM((Density) drawScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m2904toDpSizekrfVVM(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4775toDpSizekrfVVM(drawScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m2905toPxR2X_6o(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4776toPxR2X_6o(drawScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m2906toPx0680j_4(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4777toPx0680j_4(drawScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull DrawScope drawScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return Density.DefaultImpls.toRect(drawScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m2907toSizeXkaWNTQ(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4778toSizeXkaWNTQ(drawScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m2908toSp0xMU5do(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4779toSp0xMU5do(drawScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2909toSpkPz2Gy4(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4780toSpkPz2Gy4(drawScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2910toSpkPz2Gy4(@NotNull DrawScope drawScope, int i2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m4781toSpkPz2Gy4((Density) drawScope, i2);
        }
    }

    /* renamed from: drawArc-illE91I */
    void mo2821drawArcillE91I(@NotNull Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawArc-yD3GUKo */
    void mo2822drawArcyD3GUKo(long j2, float f2, float f3, boolean z, long j3, long j4, float f4, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawCircle-V9BoPsw */
    void mo2823drawCircleV9BoPsw(@NotNull Brush brush, float f2, long j2, float f3, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo2824drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo2825drawImage9jGpkUE(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawImage-AZ2fEMs */
    void mo2826drawImageAZ2fEMs(@NotNull ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2, int i3);

    /* renamed from: drawImage-gbVJVH8 */
    void mo2827drawImagegbVJVH8(@NotNull ImageBitmap imageBitmap, long j2, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawLine-1RTmtNc */
    void mo2828drawLine1RTmtNc(@NotNull Brush brush, long j2, long j3, float f2, int i2, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i3);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo2829drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i3);

    /* renamed from: drawOval-AsUm42w */
    void mo2830drawOvalAsUm42w(@NotNull Brush brush, long j2, long j3, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawOval-n-J9OG0 */
    void mo2831drawOvalnJ9OG0(long j2, long j3, long j4, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawPath-GBMwjPU */
    void mo2832drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawPath-LG529CI */
    void mo2833drawPathLG529CI(@NotNull Path path, long j2, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo2834drawPointsF8ZwMP8(@NotNull List<Offset> list, int i2, long j2, float f2, int i3, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i4);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo2835drawPointsGsft0Ws(@NotNull List<Offset> list, int i2, @NotNull Brush brush, float f2, int i3, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i4);

    /* renamed from: drawRect-AsUm42w */
    void mo2836drawRectAsUm42w(@NotNull Brush brush, long j2, long j3, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawRect-n-J9OG0 */
    void mo2837drawRectnJ9OG0(long j2, long j3, long j4, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo2838drawRoundRectZuiqVtQ(@NotNull Brush brush, long j2, long j3, long j4, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo2839drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, @NotNull DrawStyle drawStyle, float f2, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: getCenter-F1C5BW0 */
    long mo2840getCenterF1C5BW0();

    @NotNull
    DrawContext getDrawContext();

    @NotNull
    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo2841getSizeNHjbRc();
}
