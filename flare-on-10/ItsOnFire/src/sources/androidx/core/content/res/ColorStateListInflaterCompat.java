package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/core/content/res/ColorStateListInflaterCompat.class */
public final class ColorStateListInflaterCompat {
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();

    private ColorStateListInflaterCompat() {
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @NonNull
    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }

    @Nullable
    public static ColorStateList inflate(@NonNull Resources resources, @XmlRes int i2, @Nullable Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
        if (r0.hasValue(r15) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0121, code lost:
        if (r0.hasValue(r15) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be A[EDGE_INSN: B:65:0x01be->B:53:0x01be ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int[], int[][], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v72, types: [int[][]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList inflate(@androidx.annotation.NonNull android.content.res.Resources r6, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r7, @androidx.annotation.NonNull android.util.AttributeSet r8, @androidx.annotation.Nullable android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ColorStateListInflaterCompat.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static boolean isColorInt(@NonNull Resources resources, @ColorRes int i2) {
        TypedValue typedValue = getTypedValue();
        boolean z = true;
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            z = false;
        }
        return z;
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 100.0d) float f3) {
        boolean z = f3 >= 0.0f && f3 <= 100.0f;
        if (f2 != 1.0f || z) {
            int clamp = MathUtils.clamp((int) ((Color.alpha(i2) * f2) + 0.5f), 0, 255);
            int i3 = i2;
            if (z) {
                CamColor fromColor = CamColor.fromColor(i2);
                i3 = CamColor.toColor(fromColor.getHue(), fromColor.getChroma(), f3);
            }
            return (i3 & ViewCompat.MEASURED_SIZE_MASK) | (clamp << 24);
        }
        return i2;
    }

    private static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
