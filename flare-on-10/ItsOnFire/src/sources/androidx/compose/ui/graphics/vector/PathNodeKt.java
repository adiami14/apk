package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��0\n��\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\b2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020!0&H\u0082\b\u001a\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u00012\u0006\u0010\"\u001a\u00020#H��\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��¨\u0006+"}, d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathNodesFromArgs", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "numArgs", "nodeFor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "subArray", "toPathNodes", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/PathNodeKt.class */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [float[], java.lang.Object] */
    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i2, Function1<? super float[], ? extends PathNode> function1) {
        IntProgression step;
        int collectionSizeOrDefault;
        IntRange until;
        List slice;
        ?? floatArray;
        PathNode.LineTo lineTo;
        step = RangesKt___RangesKt.step(new IntRange(0, fArr.length - i2), i2);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(step, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = step.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            until = RangesKt___RangesKt.until(nextInt, nextInt + i2);
            slice = ArraysKt___ArraysKt.slice(fArr, until);
            floatArray = CollectionsKt___CollectionsKt.toFloatArray(slice);
            PathNode invoke = function1.invoke(floatArray);
            if (!(invoke instanceof PathNode.MoveTo) || nextInt <= 0) {
                lineTo = invoke;
                if (invoke instanceof PathNode.RelativeMoveTo) {
                    lineTo = invoke;
                    if (nextInt > 0) {
                        lineTo = new PathNode.RelativeLineTo(floatArray[0], floatArray[1]);
                    }
                }
            } else {
                lineTo = new PathNode.LineTo(floatArray[0], floatArray[1]);
            }
            arrayList.add(lineTo);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v107, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v132, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v136, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v159, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v163, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v186, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v190, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v213, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v217, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v240, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v244, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v267, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v271, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v294, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v298, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v319, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v323, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v346, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v350, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v373, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v377, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v400, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v404, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v427, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v431, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v454, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v485, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v507, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v510, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v529, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v533, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARN: Type inference failed for: r0v536, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v60, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARN: Type inference failed for: r0v64, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    @NotNull
    public static final List<PathNode> toPathNodes(char c2, @NotNull float[] args) {
        IntProgression step;
        int collectionSizeOrDefault;
        ArrayList arrayList;
        IntRange until;
        List slice;
        float[] floatArray;
        PathNode.ArcTo arcTo;
        IntProgression step2;
        int collectionSizeOrDefault2;
        IntRange until2;
        List slice2;
        float[] floatArray2;
        PathNode.RelativeArcTo relativeArcTo;
        IntProgression step3;
        int collectionSizeOrDefault3;
        IntRange until3;
        List slice3;
        float[] floatArray3;
        PathNode.ReflectiveQuadTo reflectiveQuadTo;
        IntProgression step4;
        int collectionSizeOrDefault4;
        IntRange until4;
        List slice4;
        float[] floatArray4;
        PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo;
        IntProgression step5;
        int collectionSizeOrDefault5;
        IntRange until5;
        List slice5;
        float[] floatArray5;
        PathNode.QuadTo quadTo;
        IntProgression step6;
        int collectionSizeOrDefault6;
        IntRange until6;
        List slice6;
        float[] floatArray6;
        PathNode.RelativeQuadTo relativeQuadTo;
        IntProgression step7;
        int collectionSizeOrDefault7;
        IntRange until7;
        List slice7;
        float[] floatArray7;
        PathNode.ReflectiveCurveTo reflectiveCurveTo;
        IntProgression step8;
        int collectionSizeOrDefault8;
        IntRange until8;
        List slice8;
        float[] floatArray8;
        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo;
        IntProgression step9;
        int collectionSizeOrDefault9;
        IntRange until9;
        List slice9;
        float[] floatArray9;
        PathNode.CurveTo curveTo;
        IntProgression step10;
        int collectionSizeOrDefault10;
        IntRange until10;
        List slice10;
        float[] floatArray10;
        IntProgression step11;
        int collectionSizeOrDefault11;
        IntRange until11;
        List slice11;
        float[] floatArray11;
        PathNode.VerticalTo verticalTo;
        IntProgression step12;
        int collectionSizeOrDefault12;
        IntRange until12;
        List slice12;
        float[] floatArray12;
        PathNode.RelativeVerticalTo relativeVerticalTo;
        IntProgression step13;
        int collectionSizeOrDefault13;
        IntRange until13;
        List slice13;
        float[] floatArray13;
        PathNode.HorizontalTo horizontalTo;
        IntProgression step14;
        int collectionSizeOrDefault14;
        IntRange until14;
        List slice14;
        float[] floatArray14;
        PathNode.RelativeHorizontalTo relativeHorizontalTo;
        IntProgression step15;
        int collectionSizeOrDefault15;
        IntRange until15;
        List slice15;
        float[] floatArray15;
        PathNode.LineTo lineTo;
        IntProgression step16;
        int collectionSizeOrDefault16;
        IntRange until16;
        List slice16;
        float[] floatArray16;
        PathNode.RelativeLineTo relativeLineTo;
        IntProgression step17;
        int collectionSizeOrDefault17;
        IntRange until17;
        List slice17;
        float[] floatArray17;
        PathNode.MoveTo moveTo;
        IntProgression step18;
        int collectionSizeOrDefault18;
        IntRange until18;
        List slice18;
        float[] floatArray18;
        ?? listOf;
        Intrinsics.checkNotNullParameter(args, "args");
        if (c2 == 'z' || c2 == 'Z') {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(PathNode.Close.INSTANCE);
            arrayList = listOf;
        } else if (c2 == 'm') {
            step18 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault18 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step18, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault18);
            Iterator<Integer> it = step18.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                int nextInt = ((IntIterator) it).nextInt();
                until18 = RangesKt___RangesKt.until(nextInt, nextInt + 2);
                slice18 = ArraysKt___ArraysKt.slice(args, until18);
                floatArray18 = CollectionsKt___CollectionsKt.toFloatArray(slice18);
                PathNode.RelativeMoveTo relativeMoveTo = new PathNode.RelativeMoveTo(floatArray18[0], floatArray18[1]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && nextInt > 0) {
                    relativeMoveTo = new PathNode.LineTo(floatArray18[0], floatArray18[1]);
                } else if (nextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(floatArray18[0], floatArray18[1]);
                }
                arrayList2.add(relativeMoveTo);
            }
        } else if (c2 == 'M') {
            step17 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault17 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step17, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault17);
            Iterator<Integer> it2 = step17.iterator();
            while (true) {
                arrayList = arrayList3;
                if (!it2.hasNext()) {
                    break;
                }
                int nextInt2 = ((IntIterator) it2).nextInt();
                until17 = RangesKt___RangesKt.until(nextInt2, nextInt2 + 2);
                slice17 = ArraysKt___ArraysKt.slice(args, until17);
                floatArray17 = CollectionsKt___CollectionsKt.toFloatArray(slice17);
                PathNode.MoveTo moveTo2 = new PathNode.MoveTo(floatArray17[0], floatArray17[1]);
                if (nextInt2 > 0) {
                    moveTo = new PathNode.LineTo(floatArray17[0], floatArray17[1]);
                } else {
                    moveTo = moveTo2;
                    if (moveTo2 instanceof PathNode.RelativeMoveTo) {
                        moveTo = moveTo2;
                        if (nextInt2 > 0) {
                            moveTo = new PathNode.RelativeLineTo(floatArray17[0], floatArray17[1]);
                        }
                    }
                }
                arrayList3.add(moveTo);
            }
        } else if (c2 == 'l') {
            step16 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault16 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step16, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault16);
            Iterator<Integer> it3 = step16.iterator();
            while (true) {
                arrayList = arrayList4;
                if (!it3.hasNext()) {
                    break;
                }
                int nextInt3 = ((IntIterator) it3).nextInt();
                until16 = RangesKt___RangesKt.until(nextInt3, nextInt3 + 2);
                slice16 = ArraysKt___ArraysKt.slice(args, until16);
                floatArray16 = CollectionsKt___CollectionsKt.toFloatArray(slice16);
                PathNode.RelativeLineTo relativeLineTo2 = new PathNode.RelativeLineTo(floatArray16[0], floatArray16[1]);
                if (!(relativeLineTo2 instanceof PathNode.MoveTo) || nextInt3 <= 0) {
                    relativeLineTo = relativeLineTo2;
                    if (relativeLineTo2 instanceof PathNode.RelativeMoveTo) {
                        relativeLineTo = relativeLineTo2;
                        if (nextInt3 > 0) {
                            relativeLineTo = new PathNode.RelativeLineTo(floatArray16[0], floatArray16[1]);
                        }
                    }
                } else {
                    relativeLineTo = new PathNode.LineTo(floatArray16[0], floatArray16[1]);
                }
                arrayList4.add(relativeLineTo);
            }
        } else if (c2 == 'L') {
            step15 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault15 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step15, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault15);
            Iterator<Integer> it4 = step15.iterator();
            while (true) {
                arrayList = arrayList5;
                if (!it4.hasNext()) {
                    break;
                }
                int nextInt4 = ((IntIterator) it4).nextInt();
                until15 = RangesKt___RangesKt.until(nextInt4, nextInt4 + 2);
                slice15 = ArraysKt___ArraysKt.slice(args, until15);
                floatArray15 = CollectionsKt___CollectionsKt.toFloatArray(slice15);
                PathNode.LineTo lineTo2 = new PathNode.LineTo(floatArray15[0], floatArray15[1]);
                if (!(lineTo2 instanceof PathNode.MoveTo) || nextInt4 <= 0) {
                    lineTo = lineTo2;
                    if (lineTo2 instanceof PathNode.RelativeMoveTo) {
                        lineTo = lineTo2;
                        if (nextInt4 > 0) {
                            lineTo = new PathNode.RelativeLineTo(floatArray15[0], floatArray15[1]);
                        }
                    }
                } else {
                    lineTo = new PathNode.LineTo(floatArray15[0], floatArray15[1]);
                }
                arrayList5.add(lineTo);
            }
        } else if (c2 == 'h') {
            step14 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault14 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step14, 10);
            ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault14);
            Iterator<Integer> it5 = step14.iterator();
            while (true) {
                arrayList = arrayList6;
                if (!it5.hasNext()) {
                    break;
                }
                int nextInt5 = ((IntIterator) it5).nextInt();
                until14 = RangesKt___RangesKt.until(nextInt5, nextInt5 + 1);
                slice14 = ArraysKt___ArraysKt.slice(args, until14);
                floatArray14 = CollectionsKt___CollectionsKt.toFloatArray(slice14);
                PathNode.RelativeHorizontalTo relativeHorizontalTo2 = new PathNode.RelativeHorizontalTo(floatArray14[0]);
                if (!(relativeHorizontalTo2 instanceof PathNode.MoveTo) || nextInt5 <= 0) {
                    relativeHorizontalTo = relativeHorizontalTo2;
                    if (relativeHorizontalTo2 instanceof PathNode.RelativeMoveTo) {
                        relativeHorizontalTo = relativeHorizontalTo2;
                        if (nextInt5 > 0) {
                            relativeHorizontalTo = new PathNode.RelativeLineTo(floatArray14[0], floatArray14[1]);
                        }
                    }
                } else {
                    relativeHorizontalTo = new PathNode.LineTo(floatArray14[0], floatArray14[1]);
                }
                arrayList6.add(relativeHorizontalTo);
            }
        } else if (c2 == 'H') {
            step13 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault13 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step13, 10);
            ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault13);
            Iterator<Integer> it6 = step13.iterator();
            while (true) {
                arrayList = arrayList7;
                if (!it6.hasNext()) {
                    break;
                }
                int nextInt6 = ((IntIterator) it6).nextInt();
                until13 = RangesKt___RangesKt.until(nextInt6, nextInt6 + 1);
                slice13 = ArraysKt___ArraysKt.slice(args, until13);
                floatArray13 = CollectionsKt___CollectionsKt.toFloatArray(slice13);
                PathNode.HorizontalTo horizontalTo2 = new PathNode.HorizontalTo(floatArray13[0]);
                if (!(horizontalTo2 instanceof PathNode.MoveTo) || nextInt6 <= 0) {
                    horizontalTo = horizontalTo2;
                    if (horizontalTo2 instanceof PathNode.RelativeMoveTo) {
                        horizontalTo = horizontalTo2;
                        if (nextInt6 > 0) {
                            horizontalTo = new PathNode.RelativeLineTo(floatArray13[0], floatArray13[1]);
                        }
                    }
                } else {
                    horizontalTo = new PathNode.LineTo(floatArray13[0], floatArray13[1]);
                }
                arrayList7.add(horizontalTo);
            }
        } else if (c2 == 'v') {
            step12 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault12 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step12, 10);
            ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault12);
            Iterator<Integer> it7 = step12.iterator();
            while (true) {
                arrayList = arrayList8;
                if (!it7.hasNext()) {
                    break;
                }
                int nextInt7 = ((IntIterator) it7).nextInt();
                until12 = RangesKt___RangesKt.until(nextInt7, nextInt7 + 1);
                slice12 = ArraysKt___ArraysKt.slice(args, until12);
                floatArray12 = CollectionsKt___CollectionsKt.toFloatArray(slice12);
                PathNode.RelativeVerticalTo relativeVerticalTo2 = new PathNode.RelativeVerticalTo(floatArray12[0]);
                if (!(relativeVerticalTo2 instanceof PathNode.MoveTo) || nextInt7 <= 0) {
                    relativeVerticalTo = relativeVerticalTo2;
                    if (relativeVerticalTo2 instanceof PathNode.RelativeMoveTo) {
                        relativeVerticalTo = relativeVerticalTo2;
                        if (nextInt7 > 0) {
                            relativeVerticalTo = new PathNode.RelativeLineTo(floatArray12[0], floatArray12[1]);
                        }
                    }
                } else {
                    relativeVerticalTo = new PathNode.LineTo(floatArray12[0], floatArray12[1]);
                }
                arrayList8.add(relativeVerticalTo);
            }
        } else if (c2 == 'V') {
            step11 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault11 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step11, 10);
            ArrayList arrayList9 = new ArrayList(collectionSizeOrDefault11);
            Iterator<Integer> it8 = step11.iterator();
            while (true) {
                arrayList = arrayList9;
                if (!it8.hasNext()) {
                    break;
                }
                int nextInt8 = ((IntIterator) it8).nextInt();
                until11 = RangesKt___RangesKt.until(nextInt8, nextInt8 + 1);
                slice11 = ArraysKt___ArraysKt.slice(args, until11);
                floatArray11 = CollectionsKt___CollectionsKt.toFloatArray(slice11);
                PathNode.VerticalTo verticalTo2 = new PathNode.VerticalTo(floatArray11[0]);
                if (!(verticalTo2 instanceof PathNode.MoveTo) || nextInt8 <= 0) {
                    verticalTo = verticalTo2;
                    if (verticalTo2 instanceof PathNode.RelativeMoveTo) {
                        verticalTo = verticalTo2;
                        if (nextInt8 > 0) {
                            verticalTo = new PathNode.RelativeLineTo(floatArray11[0], floatArray11[1]);
                        }
                    }
                } else {
                    verticalTo = new PathNode.LineTo(floatArray11[0], floatArray11[1]);
                }
                arrayList9.add(verticalTo);
            }
        } else if (c2 == 'c') {
            step10 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
            collectionSizeOrDefault10 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step10, 10);
            ArrayList arrayList10 = new ArrayList(collectionSizeOrDefault10);
            Iterator<Integer> it9 = step10.iterator();
            while (true) {
                arrayList = arrayList10;
                if (!it9.hasNext()) {
                    break;
                }
                int nextInt9 = ((IntIterator) it9).nextInt();
                until10 = RangesKt___RangesKt.until(nextInt9, nextInt9 + 6);
                slice10 = ArraysKt___ArraysKt.slice(args, until10);
                floatArray10 = CollectionsKt___CollectionsKt.toFloatArray(slice10);
                PathNode.RelativeCurveTo relativeCurveTo = new PathNode.RelativeCurveTo(floatArray10[0], floatArray10[1], floatArray10[2], floatArray10[3], floatArray10[4], floatArray10[5]);
                if ((relativeCurveTo instanceof PathNode.MoveTo) && nextInt9 > 0) {
                    relativeCurveTo = new PathNode.LineTo(floatArray10[0], floatArray10[1]);
                } else if ((relativeCurveTo instanceof PathNode.RelativeMoveTo) && nextInt9 > 0) {
                    relativeCurveTo = new PathNode.RelativeLineTo(floatArray10[0], floatArray10[1]);
                }
                arrayList10.add(relativeCurveTo);
            }
        } else if (c2 == 'C') {
            step9 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
            collectionSizeOrDefault9 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step9, 10);
            ArrayList arrayList11 = new ArrayList(collectionSizeOrDefault9);
            Iterator<Integer> it10 = step9.iterator();
            while (true) {
                arrayList = arrayList11;
                if (!it10.hasNext()) {
                    break;
                }
                int nextInt10 = ((IntIterator) it10).nextInt();
                until9 = RangesKt___RangesKt.until(nextInt10, nextInt10 + 6);
                slice9 = ArraysKt___ArraysKt.slice(args, until9);
                floatArray9 = CollectionsKt___CollectionsKt.toFloatArray(slice9);
                PathNode.CurveTo curveTo2 = new PathNode.CurveTo(floatArray9[0], floatArray9[1], floatArray9[2], floatArray9[3], floatArray9[4], floatArray9[5]);
                if (!(curveTo2 instanceof PathNode.MoveTo) || nextInt10 <= 0) {
                    curveTo = curveTo2;
                    if (curveTo2 instanceof PathNode.RelativeMoveTo) {
                        curveTo = curveTo2;
                        if (nextInt10 > 0) {
                            curveTo = new PathNode.RelativeLineTo(floatArray9[0], floatArray9[1]);
                        }
                    }
                } else {
                    curveTo = new PathNode.LineTo(floatArray9[0], floatArray9[1]);
                }
                arrayList11.add(curveTo);
            }
        } else if (c2 == 's') {
            step8 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
            collectionSizeOrDefault8 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step8, 10);
            ArrayList arrayList12 = new ArrayList(collectionSizeOrDefault8);
            Iterator<Integer> it11 = step8.iterator();
            while (true) {
                arrayList = arrayList12;
                if (!it11.hasNext()) {
                    break;
                }
                int nextInt11 = ((IntIterator) it11).nextInt();
                until8 = RangesKt___RangesKt.until(nextInt11, nextInt11 + 4);
                slice8 = ArraysKt___ArraysKt.slice(args, until8);
                floatArray8 = CollectionsKt___CollectionsKt.toFloatArray(slice8);
                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo2 = new PathNode.RelativeReflectiveCurveTo(floatArray8[0], floatArray8[1], floatArray8[2], floatArray8[3]);
                if (!(relativeReflectiveCurveTo2 instanceof PathNode.MoveTo) || nextInt11 <= 0) {
                    relativeReflectiveCurveTo = relativeReflectiveCurveTo2;
                    if (relativeReflectiveCurveTo2 instanceof PathNode.RelativeMoveTo) {
                        relativeReflectiveCurveTo = relativeReflectiveCurveTo2;
                        if (nextInt11 > 0) {
                            relativeReflectiveCurveTo = new PathNode.RelativeLineTo(floatArray8[0], floatArray8[1]);
                        }
                    }
                } else {
                    relativeReflectiveCurveTo = new PathNode.LineTo(floatArray8[0], floatArray8[1]);
                }
                arrayList12.add(relativeReflectiveCurveTo);
            }
        } else if (c2 == 'S') {
            step7 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
            collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step7, 10);
            ArrayList arrayList13 = new ArrayList(collectionSizeOrDefault7);
            Iterator<Integer> it12 = step7.iterator();
            while (true) {
                arrayList = arrayList13;
                if (!it12.hasNext()) {
                    break;
                }
                int nextInt12 = ((IntIterator) it12).nextInt();
                until7 = RangesKt___RangesKt.until(nextInt12, nextInt12 + 4);
                slice7 = ArraysKt___ArraysKt.slice(args, until7);
                floatArray7 = CollectionsKt___CollectionsKt.toFloatArray(slice7);
                PathNode.ReflectiveCurveTo reflectiveCurveTo2 = new PathNode.ReflectiveCurveTo(floatArray7[0], floatArray7[1], floatArray7[2], floatArray7[3]);
                if (!(reflectiveCurveTo2 instanceof PathNode.MoveTo) || nextInt12 <= 0) {
                    reflectiveCurveTo = reflectiveCurveTo2;
                    if (reflectiveCurveTo2 instanceof PathNode.RelativeMoveTo) {
                        reflectiveCurveTo = reflectiveCurveTo2;
                        if (nextInt12 > 0) {
                            reflectiveCurveTo = new PathNode.RelativeLineTo(floatArray7[0], floatArray7[1]);
                        }
                    }
                } else {
                    reflectiveCurveTo = new PathNode.LineTo(floatArray7[0], floatArray7[1]);
                }
                arrayList13.add(reflectiveCurveTo);
            }
        } else if (c2 == 'q') {
            step6 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
            collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step6, 10);
            ArrayList arrayList14 = new ArrayList(collectionSizeOrDefault6);
            Iterator<Integer> it13 = step6.iterator();
            while (true) {
                arrayList = arrayList14;
                if (!it13.hasNext()) {
                    break;
                }
                int nextInt13 = ((IntIterator) it13).nextInt();
                until6 = RangesKt___RangesKt.until(nextInt13, nextInt13 + 4);
                slice6 = ArraysKt___ArraysKt.slice(args, until6);
                floatArray6 = CollectionsKt___CollectionsKt.toFloatArray(slice6);
                PathNode.RelativeQuadTo relativeQuadTo2 = new PathNode.RelativeQuadTo(floatArray6[0], floatArray6[1], floatArray6[2], floatArray6[3]);
                if (!(relativeQuadTo2 instanceof PathNode.MoveTo) || nextInt13 <= 0) {
                    relativeQuadTo = relativeQuadTo2;
                    if (relativeQuadTo2 instanceof PathNode.RelativeMoveTo) {
                        relativeQuadTo = relativeQuadTo2;
                        if (nextInt13 > 0) {
                            relativeQuadTo = new PathNode.RelativeLineTo(floatArray6[0], floatArray6[1]);
                        }
                    }
                } else {
                    relativeQuadTo = new PathNode.LineTo(floatArray6[0], floatArray6[1]);
                }
                arrayList14.add(relativeQuadTo);
            }
        } else if (c2 == 'Q') {
            step5 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
            collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step5, 10);
            ArrayList arrayList15 = new ArrayList(collectionSizeOrDefault5);
            Iterator<Integer> it14 = step5.iterator();
            while (true) {
                arrayList = arrayList15;
                if (!it14.hasNext()) {
                    break;
                }
                int nextInt14 = ((IntIterator) it14).nextInt();
                until5 = RangesKt___RangesKt.until(nextInt14, nextInt14 + 4);
                slice5 = ArraysKt___ArraysKt.slice(args, until5);
                floatArray5 = CollectionsKt___CollectionsKt.toFloatArray(slice5);
                PathNode.QuadTo quadTo2 = new PathNode.QuadTo(floatArray5[0], floatArray5[1], floatArray5[2], floatArray5[3]);
                if (!(quadTo2 instanceof PathNode.MoveTo) || nextInt14 <= 0) {
                    quadTo = quadTo2;
                    if (quadTo2 instanceof PathNode.RelativeMoveTo) {
                        quadTo = quadTo2;
                        if (nextInt14 > 0) {
                            quadTo = new PathNode.RelativeLineTo(floatArray5[0], floatArray5[1]);
                        }
                    }
                } else {
                    quadTo = new PathNode.LineTo(floatArray5[0], floatArray5[1]);
                }
                arrayList15.add(quadTo);
            }
        } else if (c2 == 't') {
            step4 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step4, 10);
            ArrayList arrayList16 = new ArrayList(collectionSizeOrDefault4);
            Iterator<Integer> it15 = step4.iterator();
            while (true) {
                arrayList = arrayList16;
                if (!it15.hasNext()) {
                    break;
                }
                int nextInt15 = ((IntIterator) it15).nextInt();
                until4 = RangesKt___RangesKt.until(nextInt15, nextInt15 + 2);
                slice4 = ArraysKt___ArraysKt.slice(args, until4);
                floatArray4 = CollectionsKt___CollectionsKt.toFloatArray(slice4);
                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo2 = new PathNode.RelativeReflectiveQuadTo(floatArray4[0], floatArray4[1]);
                if (!(relativeReflectiveQuadTo2 instanceof PathNode.MoveTo) || nextInt15 <= 0) {
                    relativeReflectiveQuadTo = relativeReflectiveQuadTo2;
                    if (relativeReflectiveQuadTo2 instanceof PathNode.RelativeMoveTo) {
                        relativeReflectiveQuadTo = relativeReflectiveQuadTo2;
                        if (nextInt15 > 0) {
                            relativeReflectiveQuadTo = new PathNode.RelativeLineTo(floatArray4[0], floatArray4[1]);
                        }
                    }
                } else {
                    relativeReflectiveQuadTo = new PathNode.LineTo(floatArray4[0], floatArray4[1]);
                }
                arrayList16.add(relativeReflectiveQuadTo);
            }
        } else if (c2 == 'T') {
            step3 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step3, 10);
            ArrayList arrayList17 = new ArrayList(collectionSizeOrDefault3);
            Iterator<Integer> it16 = step3.iterator();
            while (true) {
                arrayList = arrayList17;
                if (!it16.hasNext()) {
                    break;
                }
                int nextInt16 = ((IntIterator) it16).nextInt();
                until3 = RangesKt___RangesKt.until(nextInt16, nextInt16 + 2);
                slice3 = ArraysKt___ArraysKt.slice(args, until3);
                floatArray3 = CollectionsKt___CollectionsKt.toFloatArray(slice3);
                PathNode.ReflectiveQuadTo reflectiveQuadTo2 = new PathNode.ReflectiveQuadTo(floatArray3[0], floatArray3[1]);
                if (!(reflectiveQuadTo2 instanceof PathNode.MoveTo) || nextInt16 <= 0) {
                    reflectiveQuadTo = reflectiveQuadTo2;
                    if (reflectiveQuadTo2 instanceof PathNode.RelativeMoveTo) {
                        reflectiveQuadTo = reflectiveQuadTo2;
                        if (nextInt16 > 0) {
                            reflectiveQuadTo = new PathNode.RelativeLineTo(floatArray3[0], floatArray3[1]);
                        }
                    }
                } else {
                    reflectiveQuadTo = new PathNode.LineTo(floatArray3[0], floatArray3[1]);
                }
                arrayList17.add(reflectiveQuadTo);
            }
        } else if (c2 == 'a') {
            step2 = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step2, 10);
            ArrayList arrayList18 = new ArrayList(collectionSizeOrDefault2);
            Iterator<Integer> it17 = step2.iterator();
            while (true) {
                arrayList = arrayList18;
                if (!it17.hasNext()) {
                    break;
                }
                int nextInt17 = ((IntIterator) it17).nextInt();
                until2 = RangesKt___RangesKt.until(nextInt17, nextInt17 + 7);
                slice2 = ArraysKt___ArraysKt.slice(args, until2);
                floatArray2 = CollectionsKt___CollectionsKt.toFloatArray(slice2);
                PathNode.RelativeArcTo relativeArcTo2 = new PathNode.RelativeArcTo(floatArray2[0], floatArray2[1], floatArray2[2], Float.compare(floatArray2[3], 0.0f) != 0, Float.compare(floatArray2[4], 0.0f) != 0, floatArray2[5], floatArray2[6]);
                if (!(relativeArcTo2 instanceof PathNode.MoveTo) || nextInt17 <= 0) {
                    relativeArcTo = relativeArcTo2;
                    if (relativeArcTo2 instanceof PathNode.RelativeMoveTo) {
                        relativeArcTo = relativeArcTo2;
                        if (nextInt17 > 0) {
                            relativeArcTo = new PathNode.RelativeLineTo(floatArray2[0], floatArray2[1]);
                        }
                    }
                } else {
                    relativeArcTo = new PathNode.LineTo(floatArray2[0], floatArray2[1]);
                }
                arrayList18.add(relativeArcTo);
            }
        } else if (c2 != 'A') {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown command for: ", Character.valueOf(c2)));
        } else {
            step = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(step, 10);
            ArrayList arrayList19 = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it18 = step.iterator();
            while (true) {
                arrayList = arrayList19;
                if (!it18.hasNext()) {
                    break;
                }
                int nextInt18 = ((IntIterator) it18).nextInt();
                until = RangesKt___RangesKt.until(nextInt18, nextInt18 + 7);
                slice = ArraysKt___ArraysKt.slice(args, until);
                floatArray = CollectionsKt___CollectionsKt.toFloatArray(slice);
                PathNode.ArcTo arcTo2 = new PathNode.ArcTo(floatArray[0], floatArray[1], floatArray[2], Float.compare(floatArray[3], 0.0f) != 0, Float.compare(floatArray[4], 0.0f) != 0, floatArray[5], floatArray[6]);
                if (!(arcTo2 instanceof PathNode.MoveTo) || nextInt18 <= 0) {
                    arcTo = arcTo2;
                    if (arcTo2 instanceof PathNode.RelativeMoveTo) {
                        arcTo = arcTo2;
                        if (nextInt18 > 0) {
                            arcTo = new PathNode.RelativeLineTo(floatArray[0], floatArray[1]);
                        }
                    }
                } else {
                    arcTo = new PathNode.LineTo(floatArray[0], floatArray[1]);
                }
                arrayList19.add(arcTo);
            }
        }
        return arrayList;
    }
}
