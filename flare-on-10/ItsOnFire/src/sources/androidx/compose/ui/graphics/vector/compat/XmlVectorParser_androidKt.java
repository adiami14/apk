package androidx.compose.ui.graphics.vector.compat;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@Metadata(d1 = {"��\\\n��\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a'\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0013H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a*\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010 \u001a\u00020!H��\u001a\f\u0010\"\u001a\u00020#*\u00020$H��\u001a2\u0010%\u001a\u00020&*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020\u001aH��\u001a<\u0010(\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0001H��\u001a2\u0010*\u001a\u00020&*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020\u001aH��\u001a2\u0010+\u001a\u00020&*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020\u001aH��\u001a\f\u0010,\u001a\u00020$*\u00020$H��\"\u000e\u0010��\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"FILL_TYPE_WINDING", "", "LINECAP_BUTT", "LINECAP_ROUND", "LINECAP_SQUARE", "LINEJOIN_BEVEL", "LINEJOIN_MITER", "LINEJOIN_ROUND", "SHAPE_CLIP_PATH", "", "SHAPE_GROUP", "SHAPE_PATH", "getStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "id", "defValue", "getStrokeLineCap-CSYIeUk", "(II)I", "getStrokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeLineJoin-kLtJ_vA", "obtainBrushFromComplexColor", "Landroidx/compose/ui/graphics/Brush;", "complexColor", "Landroidx/core/content/res/ComplexColorCompat;", "createVectorImageBuilder", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "res", "Landroid/content/res/Resources;", "theme", "Landroid/content/res/Resources$Theme;", "attrs", "Landroid/util/AttributeSet;", "isAtEnd", "", "Lorg/xmlpull/v1/XmlPullParser;", "parseClipPath", "", "builder", "parseCurrentVectorNode", "nestedGroups", "parseGroup", "parsePath", "seekToStartTag", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt.class */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    @NotNull
    private static final String SHAPE_CLIP_PATH = "clip-path";
    @NotNull
    private static final String SHAPE_GROUP = "group";
    @NotNull
    private static final String SHAPE_PATH = "path";

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.vector.ImageVector.Builder createVectorImageBuilder(@org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.vector.compat.AndroidVectorParser r13, @org.jetbrains.annotations.NotNull android.content.res.Resources r14, @org.jetbrains.annotations.Nullable android.content.res.Resources.Theme r15, @org.jetbrains.annotations.NotNull android.util.AttributeSet r16) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt.createVectorImageBuilder(androidx.compose.ui.graphics.vector.compat.AndroidVectorParser, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet):androidx.compose.ui.graphics.vector.ImageVector$Builder");
    }

    /* renamed from: getStrokeLineCap-CSYIeUk  reason: not valid java name */
    private static final int m3041getStrokeLineCapCSYIeUk(int i2, int i3) {
        if (i2 == 0) {
            i3 = StrokeCap.Companion.m2711getButtKaPHkGw();
        } else if (i2 == 1) {
            i3 = StrokeCap.Companion.m2712getRoundKaPHkGw();
        } else if (i2 == 2) {
            i3 = StrokeCap.Companion.m2713getSquareKaPHkGw();
        }
        return i3;
    }

    /* renamed from: getStrokeLineCap-CSYIeUk$default  reason: not valid java name */
    public static /* synthetic */ int m3042getStrokeLineCapCSYIeUk$default(int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = StrokeCap.Companion.m2711getButtKaPHkGw();
        }
        return m3041getStrokeLineCapCSYIeUk(i2, i3);
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA  reason: not valid java name */
    private static final int m3043getStrokeLineJoinkLtJ_vA(int i2, int i3) {
        if (i2 == 0) {
            i3 = StrokeJoin.Companion.m2723getMiterLxFBmk8();
        } else if (i2 == 1) {
            i3 = StrokeJoin.Companion.m2724getRoundLxFBmk8();
        } else if (i2 == 2) {
            i3 = StrokeJoin.Companion.m2722getBevelLxFBmk8();
        }
        return i3;
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA$default  reason: not valid java name */
    public static /* synthetic */ int m3044getStrokeLineJoinkLtJ_vA$default(int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = StrokeJoin.Companion.m2723getMiterLxFBmk8();
        }
        return m3043getStrokeLineJoinkLtJ_vA(i2, i3);
    }

    public static final boolean isAtEnd(@NotNull XmlPullParser xmlPullParser) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        boolean z = true;
        if (xmlPullParser.getEventType() != 1) {
            z = xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return z;
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        ShaderBrush shaderBrush = null;
        if (complexColorCompat.willDraw()) {
            Shader shader = complexColorCompat.getShader();
            shaderBrush = shader != null ? BrushKt.ShaderBrush(shader) : new SolidColor(ColorKt.Color(complexColorCompat.getColor()), null);
        }
        return shaderBrush;
    }

    public static final void parseClipPath(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        String str = string;
        if (string == null) {
            str = "";
        }
        List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA()));
        obtainAttributes.recycle();
        ImageVector.Builder.addGroup$default(builder, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, addPathNodes, 254, null);
    }

    public static final int parseCurrentVectorNode(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @NotNull AttributeSet attrs, @Nullable Resources.Theme theme, @NotNull ImageVector.Builder builder, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType == 2) {
            String name = androidVectorParser.getXmlParser().getName();
            i3 = i2;
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1649314686) {
                    if (hashCode != 3433509) {
                        if (hashCode != 98629247) {
                            i3 = i2;
                        } else if (name.equals(SHAPE_GROUP)) {
                            parseGroup(androidVectorParser, res, theme, attrs, builder);
                            i3 = i2;
                        } else {
                            i3 = i2;
                        }
                    } else if (name.equals(SHAPE_PATH)) {
                        parsePath(androidVectorParser, res, theme, attrs, builder);
                        i3 = i2;
                    } else {
                        i3 = i2;
                    }
                } else if (name.equals(SHAPE_CLIP_PATH)) {
                    parseClipPath(androidVectorParser, res, theme, attrs, builder);
                    i3 = i2 + 1;
                } else {
                    i3 = i2;
                }
            }
        } else if (eventType != 3) {
            i3 = i2;
        } else {
            i3 = i2;
            if (Intrinsics.areEqual(SHAPE_GROUP, androidVectorParser.getXmlParser().getName())) {
                int i4 = 0;
                while (i4 < i2 + 1) {
                    i4++;
                    builder.clearGroup();
                }
                return 0;
            }
        }
        return i3;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i2);
    }

    public static final void parseGroup(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "rotation", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f2 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f3 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        String str = string;
        if (string == null) {
            str = "";
        }
        obtainAttributes.recycle();
        builder.addGroup(str, namedFloat, f2, f3, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        String str = string;
        if (string == null) {
            str = "";
        }
        List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA()));
        ComplexColorCompat namedComplexColor = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int m3041getStrokeLineCapCSYIeUk = m3041getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m2711getButtKaPHkGw());
        int m3043getStrokeLineJoinkLtJ_vA = m3043getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m2722getBevelLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(obtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        obtainAttributes.recycle();
        Brush obtainBrushFromComplexColor = obtainBrushFromComplexColor(namedComplexColor);
        Brush obtainBrushFromComplexColor2 = obtainBrushFromComplexColor(namedComplexColor2);
        PathFillType.Companion companion = PathFillType.Companion;
        builder.m2955addPathoIyEayM(addPathNodes, namedInt == 0 ? companion.m2644getNonZeroRgk1Os() : companion.m2643getEvenOddRgk1Os(), str, obtainBrushFromComplexColor, namedFloat, obtainBrushFromComplexColor2, namedFloat3, namedFloat4, m3041getStrokeLineCapCSYIeUk, m3043getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    @NotNull
    public static final XmlPullParser seekToStartTag(@NotNull XmlPullParser xmlPullParser) throws XmlPullParserException {
        int next;
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
