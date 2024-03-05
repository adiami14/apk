package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import java.util.ArrayList;
/* loaded from: ItsOnFire.jar:androidx/core/graphics/PathParser.class */
public class PathParser {
    private static final String LOGTAG = "PathParser";

    /* loaded from: ItsOnFire.jar:androidx/core/graphics/PathParser$ExtractFloatResult.class */
    public static class ExtractFloatResult {
        public int mEndPosition;
        public boolean mEndWithNegOrDot;
    }

    /* loaded from: ItsOnFire.jar:androidx/core/graphics/PathParser$PathDataNode.class */
    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        public PathDataNode(char c2, float[] fArr) {
            this.mType = c2;
            this.mParams = fArr;
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x03a1, code lost:
            if (r28 == 'T') goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0410, code lost:
            if (r28 == 'S') goto L102;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void addCommand(android.graphics.Path r11, float[] r12, char r13, char r14, float[] r15) {
            /*
                Method dump skipped, instructions count: 2124
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.PathDataNode.addCommand(android.graphics.Path, float[], char, char, float[]):void");
        }

        private static void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            int ceil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d8);
            double sin = Math.sin(d8);
            double cos2 = Math.cos(d9);
            double sin2 = Math.sin(d9);
            double d11 = -d4;
            double d12 = d11 * cos;
            double d13 = d5 * sin;
            double d14 = d11 * sin;
            double d15 = d5 * cos;
            double d16 = d10 / ceil;
            double d17 = (sin2 * d14) + (cos2 * d15);
            int i2 = 0;
            double d18 = d9;
            double d19 = (d12 * sin2) - (d13 * cos2);
            double d20 = d7;
            while (i2 < ceil) {
                double d21 = d18 + d16;
                double sin3 = Math.sin(d21);
                double cos3 = Math.cos(d21);
                double d22 = (d2 + ((d4 * cos) * cos3)) - (d13 * sin3);
                double d23 = d3 + (d4 * sin * cos3) + (d15 * sin3);
                double d24 = (d12 * sin3) - (d13 * cos3);
                double d25 = (sin3 * d14) + (cos3 * d15);
                double d26 = d21 - d18;
                double tan = Math.tan(d26 / 2.0d);
                double sin4 = (Math.sin(d26) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d6 + (d19 * sin4)), (float) (d20 + (d17 * sin4)), (float) (d22 - (sin4 * d24)), (float) (d23 - (sin4 * d25)), (float) d22, (float) d23);
                i2++;
                d6 = d22;
                d18 = d21;
                d17 = d25;
                d19 = d24;
                d20 = d23;
            }
        }

        private static void drawArc(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d2;
            double d3;
            double radians = Math.toRadians(f8);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d4 = f2;
            double d5 = f3;
            double d6 = f6;
            double d7 = ((d4 * cos) + (d5 * sin)) / d6;
            double d8 = f7;
            double d9 = (((-f2) * sin) + (d5 * cos)) / d8;
            double d10 = f5;
            double d11 = ((f4 * cos) + (d10 * sin)) / d6;
            double d12 = (((-f4) * sin) + (d10 * cos)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d13 * d13) + (d14 * d14);
            if (d17 == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d17);
                float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
                drawArc(path, f2, f3, f4, f5, f6 * sqrt, f7 * sqrt, f8, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d18);
            double d19 = d13 * sqrt2;
            double d20 = sqrt2 * d14;
            if (z == z2) {
                d2 = d15 - d20;
                d3 = d16 + d19;
            } else {
                d2 = d15 + d20;
                d3 = d16 - d19;
            }
            double atan2 = Math.atan2(d9 - d3, d7 - d2);
            double atan22 = Math.atan2(d12 - d3, d11 - d2) - atan2;
            int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            double d21 = atan22;
            if (z2 != (i2 >= 0)) {
                d21 = i2 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d22 = d2 * d6;
            double d23 = d3 * d8;
            arcToBezier(path, (d22 * cos) - (d23 * sin), (d22 * sin) + (d23 * cos), d6, d8, d4, d5, radians, atan2, d21);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            int i2 = 0;
            while (true) {
                char c3 = c2;
                if (i2 >= pathDataNodeArr.length) {
                    return;
                }
                PathDataNode pathDataNode = pathDataNodeArr[i2];
                addCommand(path, fArr, c3, pathDataNode.mType, pathDataNode.mParams);
                c2 = pathDataNodeArr[i2].mType;
                i2++;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f2) {
            this.mType = pathDataNode.mType;
            int i2 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i2 >= fArr.length) {
                    return;
                }
                this.mParams[i2] = (fArr[i2] * (1.0f - f2)) + (pathDataNode2.mParams[i2] * f2);
                i2++;
            }
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c2, float[] fArr) {
        arrayList.add(new PathDataNode(c2, fArr));
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            PathDataNode pathDataNode = pathDataNodeArr[i2];
            char c2 = pathDataNode.mType;
            PathDataNode pathDataNode2 = pathDataNodeArr2[i2];
            if (c2 != pathDataNode2.mType || pathDataNode.mParams.length != pathDataNode2.mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i2, int i3) {
        if (i2 <= i3) {
            int length = fArr.length;
            if (i2 < 0 || i2 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = i3 - i2;
            int min = Math.min(i4, length - i2);
            float[] fArr2 = new float[i4];
            System.arraycopy(fArr, i2, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            int nextStart = nextStart(str, i2);
            String trim = str.substring(i3, nextStart).trim();
            if (trim.length() > 0) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i3 = nextStart;
            i2 = nextStart + 1;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            addNode(arrayList, str.charAt(i3), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] createNodesFromPathData = createNodesFromPathData(str);
        if (createNodesFromPathData != null) {
            try {
                PathDataNode.nodesToPath(createNodesFromPathData, path);
                return path;
            } catch (RuntimeException e2) {
                throw new RuntimeException("Error in parsing " + str, e2);
            }
        }
        return null;
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr2[i2] = new PathDataNode(pathDataNodeArr[i2]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r8 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[LOOP:0: B:3:0x001a->B:29:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r3, int r4, androidx.core.graphics.PathParser.ExtractFloatResult r5) {
        /*
            r0 = r5
            r1 = 0
            r0.mEndWithNegOrDot = r1
            r0 = r4
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r7
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r8
            r10 = r0
            r0 = r7
            r8 = r0
        L1a:
            r0 = r6
            r1 = r3
            int r1 = r1.length()
            if (r0 >= r1) goto La2
            r0 = r3
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 32
            if (r0 == r1) goto L8e
            r0 = r7
            r1 = 69
            if (r0 == r1) goto L88
            r0 = r7
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L88
            r0 = r7
            switch(r0) {
                case 44: goto L8e;
                case 45: goto L75;
                case 46: goto L5f;
                default: goto L5c;
            }
        L5c:
            goto L82
        L5f:
            r0 = r10
            if (r0 != 0) goto L6d
            r0 = 0
            r8 = r0
            r0 = 1
            r10 = r0
            goto L94
        L6d:
            r0 = r5
            r1 = 1
            r0.mEndWithNegOrDot = r1
            goto L8e
        L75:
            r0 = r6
            r1 = r4
            if (r0 == r1) goto L82
            r0 = r8
            if (r0 != 0) goto L82
            goto L6d
        L82:
            r0 = 0
            r8 = r0
            goto L94
        L88:
            r0 = 1
            r8 = r0
            goto L94
        L8e:
            r0 = 0
            r8 = r0
            r0 = 1
            r9 = r0
        L94:
            r0 = r9
            if (r0 == 0) goto L9c
            goto La2
        L9c:
            int r6 = r6 + 1
            goto L1a
        La2:
            r0 = r5
            r1 = r6
            r0.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i2 >= length) {
                    return copyOfRange(fArr, 0, i4);
                }
                extract(str, i2, extractFloatResult);
                int i5 = extractFloatResult.mEndPosition;
                int i6 = i4;
                if (i2 < i5) {
                    fArr[i4] = Float.parseFloat(str.substring(i2, i5));
                    i6 = i4 + 1;
                }
                if (extractFloatResult.mEndWithNegOrDot) {
                    i2 = i5;
                    i3 = i6;
                } else {
                    i2 = i5 + 1;
                    i3 = i6;
                }
            }
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
            if (canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                    pathDataNodeArr[i2].interpolatePathDataNode(pathDataNodeArr2[i2], pathDataNodeArr3[i2], f2);
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }

    private static int nextStart(String str, int i2) {
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - R.styleable.AppCompatTheme_windowFixedWidthMajor) <= 0) && charAt != 'e' && charAt != 'E') {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i2 = 0; i2 < pathDataNodeArr2.length; i2++) {
            pathDataNodeArr[i2].mType = pathDataNodeArr2[i2].mType;
            int i3 = 0;
            while (true) {
                float[] fArr = pathDataNodeArr2[i2].mParams;
                if (i3 < fArr.length) {
                    pathDataNodeArr[i2].mParams[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }
}
