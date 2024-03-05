package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.AnimationConstants;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/vectordrawable/graphics/drawable/AnimatorInflaterCompat.class */
public class AnimatorInflaterCompat {
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final int MAX_NUM_POINTS = 100;
    private static final String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_UNDEFINED = 4;

    /* loaded from: ItsOnFire.jar:androidx/vectordrawable/graphics/drawable/AnimatorInflaterCompat$PathDataEvaluator.class */
    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {
        private PathParser.PathDataNode[] mNodeArray;

        public PathDataEvaluator() {
        }

        public PathDataEvaluator(PathParser.PathDataNode[] pathDataNodeArr) {
            this.mNodeArray = pathDataNodeArr;
        }

        @Override // android.animation.TypeEvaluator
        public PathParser.PathDataNode[] evaluate(float f2, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            if (PathParser.canMorph(pathDataNodeArr, pathDataNodeArr2)) {
                if (!PathParser.canMorph(this.mNodeArray, pathDataNodeArr)) {
                    this.mNodeArray = PathParser.deepCopyNodes(pathDataNodeArr);
                }
                for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                    this.mNodeArray[i2].interpolatePathDataNode(pathDataNodeArr[i2], pathDataNodeArr2[i2], f2);
                }
                return this.mNodeArray;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private AnimatorInflaterCompat() {
    }

    private static Animator createAnimatorFromXml(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) throws XmlPullParserException, IOException {
        return createAnimatorFromXml(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x014c, code lost:
        if (r17 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0151, code lost:
        if (r22 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0154, code lost:
        r0 = new android.animation.Animator[r22.size()];
        r0 = r22.iterator();
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016d, code lost:
        if (r0.hasNext() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0170, code lost:
        r0[r25] = (android.animation.Animator) r0.next();
        r25 = r25 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0185, code lost:
        if (r18 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0188, code lost:
        r17.playTogether(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0191, code lost:
        r17.playSequentially(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0199, code lost:
        return r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r0v56, types: [android.animation.ObjectAnimator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator createAnimatorFromXml(android.content.Context r12, android.content.res.Resources r13, android.content.res.Resources.Theme r14, org.xmlpull.v1.XmlPullParser r15, android.util.AttributeSet r16, android.animation.AnimatorSet r17, int r18, float r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.createAnimatorFromXml(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe createNewKeyframe(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    private static void distributeKeyframes(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((i3 - i2) + 2);
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    private static void dumpKeyframes(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        Log.d(TAG, str);
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Keyframe keyframe = (Keyframe) objArr[i2];
            StringBuilder sb = new StringBuilder();
            sb.append("Keyframe ");
            sb.append(i2);
            sb.append(": fraction ");
            sb.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sb.append(", , value : ");
            Object obj = "null";
            if (keyframe.hasValue()) {
                obj = keyframe.getValue();
            }
            sb.append(obj);
            Log.d(TAG, sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (r0 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.PropertyValuesHolder getPVH(android.content.res.TypedArray r7, int r8, int r9, int r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.getPVH(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (isColorType(r7) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int inferValueTypeFromValues(android.content.res.TypedArray r3, int r4, int r5) {
        /*
            r0 = r3
            r1 = r4
            android.util.TypedValue r0 = r0.peekValue(r1)
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L15
            r0 = 1
            r4 = r0
            goto L17
        L15:
            r0 = 0
            r4 = r0
        L17:
            r0 = r4
            if (r0 == 0) goto L24
            r0 = r6
            int r0 = r0.type
            r9 = r0
            goto L27
        L24:
            r0 = 0
            r9 = r0
        L27:
            r0 = r3
            r1 = r5
            android.util.TypedValue r0 = r0.peekValue(r1)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L37
            r0 = r7
            r5 = r0
            goto L39
        L37:
            r0 = 0
            r5 = r0
        L39:
            r0 = r5
            if (r0 == 0) goto L46
            r0 = r3
            int r0 = r0.type
            r7 = r0
            goto L49
        L46:
            r0 = 0
            r7 = r0
        L49:
            r0 = r4
            if (r0 == 0) goto L55
            r0 = r9
            boolean r0 = isColorType(r0)
            if (r0 != 0) goto L67
        L55:
            r0 = r8
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L69
            r0 = r8
            r4 = r0
            r0 = r7
            boolean r0 = isColorType(r0)
            if (r0 == 0) goto L69
        L67:
            r0 = 3
            r4 = r0
        L69:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.inferValueTypeFromValues(android.content.res.TypedArray, int, int):int");
    }

    private static int inferValueTypeOfKeyframe(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, "value", 0);
        int i2 = 0;
        if (peekNamedValue != null) {
            i2 = 0;
            if (isColorType(peekNamedValue.type)) {
                i2 = 3;
            }
        }
        obtainAttributes.recycle();
        return i2;
    }

    private static boolean isColorType(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static Animator loadAnimator(Context context, @AnimatorRes int i2) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i2);
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i2) throws Resources.NotFoundException {
        return loadAnimator(context, resources, theme, i2, 1.0f);
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i2, float f2) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        XmlResourceParser xmlResourceParser2 = null;
        XmlResourceParser xmlResourceParser3 = null;
        try {
            try {
                XmlResourceParser animation = resources.getAnimation(i2);
                xmlResourceParser3 = animation;
                xmlResourceParser = animation;
                xmlResourceParser2 = animation;
                Animator createAnimatorFromXml = createAnimatorFromXml(context, resources, theme, animation, f2);
                if (animation != null) {
                    animation.close();
                }
                return createAnimatorFromXml;
            } catch (IOException e2) {
                XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                StringBuilder sb = new StringBuilder();
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                sb.append("Can't load animation resource ID #0x");
                XmlResourceParser xmlResourceParser7 = xmlResourceParser;
                sb.append(Integer.toHexString(i2));
                XmlResourceParser xmlResourceParser8 = xmlResourceParser;
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                XmlResourceParser xmlResourceParser9 = xmlResourceParser;
                notFoundException.initCause(e2);
                XmlResourceParser xmlResourceParser10 = xmlResourceParser;
                throw notFoundException;
            } catch (XmlPullParserException e3) {
                XmlResourceParser xmlResourceParser11 = xmlResourceParser2;
                XmlResourceParser xmlResourceParser12 = xmlResourceParser2;
                StringBuilder sb2 = new StringBuilder();
                XmlResourceParser xmlResourceParser13 = xmlResourceParser2;
                sb2.append("Can't load animation resource ID #0x");
                XmlResourceParser xmlResourceParser14 = xmlResourceParser2;
                sb2.append(Integer.toHexString(i2));
                XmlResourceParser xmlResourceParser15 = xmlResourceParser2;
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
                XmlResourceParser xmlResourceParser16 = xmlResourceParser2;
                notFoundException2.initCause(e3);
                XmlResourceParser xmlResourceParser17 = xmlResourceParser2;
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (xmlResourceParser3 != null) {
                xmlResourceParser3.close();
            }
            throw th;
        }
    }

    private static ValueAnimator loadAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_ANIMATOR);
        TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_ANIMATOR);
        ValueAnimator valueAnimator2 = valueAnimator;
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        parseAnimatorFromTypeArray(valueAnimator2, obtainAttributes, obtainAttributes2, f2, xmlPullParser);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            valueAnimator2.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        if (obtainAttributes2 != null) {
            obtainAttributes2.recycle();
        }
        return valueAnimator2;
    }

    private static Keyframe loadKeyframe(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i2, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, "value", 0);
        boolean z = peekNamedValue != null;
        int i3 = i2;
        if (i2 == 4) {
            i3 = (z && isColorType(peekNamedValue.type)) ? 3 : 0;
        }
        Keyframe ofInt = z ? i3 != 0 ? (i3 == 1 || i3 == 3) ? Keyframe.ofInt(namedFloat, TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(namedFloat, TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "value", 0, 0.0f)) : i3 == 0 ? Keyframe.ofFloat(namedFloat) : Keyframe.ofInt(namedFloat);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 1, 0);
        if (namedResourceId > 0) {
            ofInt.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        return ofInt;
    }

    private static ObjectAnimator loadObjectAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        loadAnimator(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder loadPvh(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i2) throws XmlPullParserException, IOException {
        ArrayList arrayList = null;
        int i3 = i2;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                int i4 = i3;
                if (i3 == 4) {
                    i4 = inferValueTypeOfKeyframe(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe loadKeyframe = loadKeyframe(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i4, xmlPullParser);
                ArrayList arrayList2 = arrayList;
                if (loadKeyframe != null) {
                    arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(loadKeyframe);
                }
                xmlPullParser.next();
                arrayList = arrayList2;
                i3 = i4;
            }
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolder = null;
            if (size > 0) {
                Keyframe keyframe = (Keyframe) arrayList.get(0);
                Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
                float fraction = keyframe2.getFraction();
                int i5 = size;
                if (fraction < 1.0f) {
                    if (fraction < 0.0f) {
                        keyframe2.setFraction(1.0f);
                        i5 = size;
                    } else {
                        arrayList.add(arrayList.size(), createNewKeyframe(keyframe2, 1.0f));
                        i5 = size + 1;
                    }
                }
                float fraction2 = keyframe.getFraction();
                int i6 = i5;
                if (fraction2 != 0.0f) {
                    if (fraction2 < 0.0f) {
                        keyframe.setFraction(0.0f);
                        i6 = i5;
                    } else {
                        arrayList.add(0, createNewKeyframe(keyframe, 0.0f));
                        i6 = i5 + 1;
                    }
                }
                Keyframe[] keyframeArr = new Keyframe[i6];
                arrayList.toArray(keyframeArr);
                for (int i7 = 0; i7 < i6; i7++) {
                    Keyframe keyframe3 = keyframeArr[i7];
                    if (keyframe3.getFraction() < 0.0f) {
                        if (i7 == 0) {
                            keyframe3.setFraction(0.0f);
                        } else {
                            int i8 = i6 - 1;
                            if (i7 == i8) {
                                keyframe3.setFraction(1.0f);
                            } else {
                                int i9 = i7;
                                for (int i10 = i7 + 1; i10 < i8 && keyframeArr[i10].getFraction() < 0.0f; i10++) {
                                    i9 = i10;
                                }
                                distributeKeyframes(keyframeArr, keyframeArr[i9 + 1].getFraction() - keyframeArr[i7 - 1].getFraction(), i7, i9);
                            }
                        }
                    }
                }
                PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
                propertyValuesHolder = ofKeyframe;
                if (i3 == 3) {
                    ofKeyframe.setEvaluator(ArgbEvaluator.getInstance());
                    propertyValuesHolder = ofKeyframe;
                }
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] loadValues(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i2;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            i2 = 0;
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
                String namedString = TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser, "propertyName", 3);
                int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder loadPvh = loadPvh(context, resources, theme, xmlPullParser, namedString, namedInt);
                PropertyValuesHolder propertyValuesHolder = loadPvh;
                if (loadPvh == null) {
                    propertyValuesHolder = getPVH(obtainAttributes, namedInt, 0, 1, namedString);
                }
                ArrayList arrayList2 = arrayList;
                if (propertyValuesHolder != null) {
                    arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(propertyValuesHolder);
                }
                obtainAttributes.recycle();
                arrayList = arrayList2;
            }
            xmlPullParser.next();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        if (arrayList != null) {
            int size = arrayList.size();
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[size];
            while (true) {
                propertyValuesHolderArr = propertyValuesHolderArr2;
                if (i2 >= size) {
                    break;
                }
                propertyValuesHolderArr2[i2] = (PropertyValuesHolder) arrayList.get(i2);
                i2++;
            }
        }
        return propertyValuesHolderArr;
    }

    private static void parseAnimatorFromTypeArray(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long namedInt = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "duration", 1, AnimationConstants.DefaultDurationMillis);
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "startOffset", 2, 0);
        int namedInt3 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "valueType", 7, 4);
        int i2 = namedInt3;
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "valueFrom")) {
            i2 = namedInt3;
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "valueTo")) {
                int i3 = namedInt3;
                if (namedInt3 == 4) {
                    i3 = inferValueTypeFromValues(typedArray, 5, 6);
                }
                PropertyValuesHolder pvh = getPVH(typedArray, i3, 5, 6, "");
                i2 = i3;
                if (pvh != null) {
                    valueAnimator.setValues(pvh);
                    i2 = i3;
                }
            }
        }
        valueAnimator.setDuration(namedInt);
        valueAnimator.setStartDelay(namedInt2);
        valueAnimator.setRepeatCount(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            setupObjectAnimator(valueAnimator, typedArray2, i2, f2, xmlPullParser);
        }
    }

    private static void setupObjectAnimator(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 1);
        if (namedString == null) {
            objectAnimator.setPropertyName(TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String namedString2 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyXName", 2);
        String namedString3 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyYName", 3);
        if (i2 != 2) {
        }
        if (namedString2 != null || namedString3 != null) {
            setupPathMotion(PathParser.createPathFromPathData(namedString), objectAnimator, f2 * 0.5f, namedString2, namedString3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void setupPathMotion(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        float length;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            length = f3 + pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
            f3 = length;
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (length / f2)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = length / (min - 1);
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        while (i2 < min) {
            pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f5 += f4;
            int i4 = i3 + 1;
            int i5 = i3;
            if (i4 < arrayList.size()) {
                i5 = i3;
                if (f5 > ((Float) arrayList.get(i4)).floatValue()) {
                    pathMeasure2.nextContour();
                    i5 = i4;
                }
            }
            i2++;
            i3 = i5;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolder = null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }
}
