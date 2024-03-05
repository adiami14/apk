package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��~\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\b��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001��ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001��ø\u0001\u0001¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", "float", "", "int", "", "string", "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/EncodeHelper.class */
public final class EncodeHelper {
    @NotNull
    private Parcel parcel;

    public EncodeHelper() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
    }

    public final void encode(byte b2) {
        this.parcel.writeByte(b2);
    }

    public final void encode(float f2) {
        this.parcel.writeFloat(f2);
    }

    public final void encode(int i2) {
        this.parcel.writeInt(i2);
    }

    public final void encode(@NotNull Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        m4215encode8_81llA(shadow.m2689getColor0d7_KjU());
        encode(Offset.m2167getXimpl(shadow.m2690getOffsetF1C5BW0()));
        encode(Offset.m2168getYimpl(shadow.m2690getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        long m4443getColor0d7_KjU = spanStyle.m4443getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2415equalsimpl0(m4443getColor0d7_KjU, companion.m2450getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m4215encode8_81llA(spanStyle.m4443getColor0d7_KjU());
        }
        long m4444getFontSizeXSAIIZE = spanStyle.m4444getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m4971equalsimpl0(m4444getFontSizeXSAIIZE, companion2.m4985getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m4212encodeR2X_6o(spanStyle.m4444getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m4445getFontStyle4Lr2A7w = spanStyle.m4445getFontStyle4Lr2A7w();
        if (m4445getFontStyle4Lr2A7w != null) {
            int m4533unboximpl = m4445getFontStyle4Lr2A7w.m4533unboximpl();
            encode((byte) 4);
            m4217encodenzbMABs(m4533unboximpl);
        }
        FontSynthesis m4446getFontSynthesisZQGJjVo = spanStyle.m4446getFontSynthesisZQGJjVo();
        if (m4446getFontSynthesisZQGJjVo != null) {
            int m4545unboximpl = m4446getFontSynthesisZQGJjVo.m4545unboximpl();
            encode((byte) 5);
            m4214encode6p3vJLY(m4545unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m4971equalsimpl0(spanStyle.m4447getLetterSpacingXSAIIZE(), companion2.m4985getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m4212encodeR2X_6o(spanStyle.m4447getLetterSpacingXSAIIZE());
        }
        BaselineShift m4442getBaselineShift5SSeXJ0 = spanStyle.m4442getBaselineShift5SSeXJ0();
        if (m4442getBaselineShift5SSeXJ0 != null) {
            float m4680unboximpl = m4442getBaselineShift5SSeXJ0.m4680unboximpl();
            encode((byte) 8);
            m4213encode4Dl_Bck(m4680unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m2415equalsimpl0(spanStyle.m4441getBackground0d7_KjU(), companion.m2450getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m4215encode8_81llA(spanStyle.m4441getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            return;
        }
        encode((byte) 12);
        encode(shadow);
    }

    public final void encode(@NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(@NotNull TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(@NotNull TextGeometricTransform textGeometricTransform) {
        Intrinsics.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.parcel.writeString(string);
    }

    /* renamed from: encode--R2X_6o  reason: not valid java name */
    public final void m4212encodeR2X_6o(long j2) {
        byte b2;
        long m4973getTypeUIouoOA = TextUnit.m4973getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5009getUnspecifiedUIouoOA())) {
            b2 = 0;
        } else if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5008getSpUIouoOA())) {
            b2 = 1;
        } else {
            b2 = 0;
            if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5007getEmUIouoOA())) {
                b2 = 2;
            }
        }
        encode(b2);
        if (TextUnitType.m5003equalsimpl0(TextUnit.m4973getTypeUIouoOA(j2), companion.m5009getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m4974getValueimpl(j2));
    }

    /* renamed from: encode-4Dl_Bck  reason: not valid java name */
    public final void m4213encode4Dl_Bck(float f2) {
        encode(f2);
    }

    /* renamed from: encode-6p3vJLY  reason: not valid java name */
    public final void m4214encode6p3vJLY(int i2) {
        byte b2;
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        if (FontSynthesis.m4540equalsimpl0(i2, companion.m4547getNoneGVVA2EU())) {
            b2 = 0;
        } else if (FontSynthesis.m4540equalsimpl0(i2, companion.m4546getAllGVVA2EU())) {
            b2 = 1;
        } else if (FontSynthesis.m4540equalsimpl0(i2, companion.m4549getWeightGVVA2EU())) {
            b2 = 2;
        } else {
            b2 = 0;
            if (FontSynthesis.m4540equalsimpl0(i2, companion.m4548getStyleGVVA2EU())) {
                b2 = 3;
            }
        }
        encode(b2);
    }

    /* renamed from: encode-8_81llA  reason: not valid java name */
    public final void m4215encode8_81llA(long j2) {
        m4216encodeVKZWuLQ(j2);
    }

    /* renamed from: encode-VKZWuLQ  reason: not valid java name */
    public final void m4216encodeVKZWuLQ(long j2) {
        this.parcel.writeLong(j2);
    }

    /* renamed from: encode-nzbMABs  reason: not valid java name */
    public final void m4217encodenzbMABs(int i2) {
        byte b2;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m4530equalsimpl0(i2, companion.m4535getNormal_LCdwA())) {
            b2 = 0;
        } else {
            b2 = 0;
            if (FontStyle.m4530equalsimpl0(i2, companion.m4534getItalic_LCdwA())) {
                b2 = 1;
            }
        }
        encode(b2);
    }

    @NotNull
    public final String encodedString() {
        String encodeToString = Base64.encodeToString(this.parcel.marshall(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void reset() {
        this.parcel.recycle();
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
    }
}
