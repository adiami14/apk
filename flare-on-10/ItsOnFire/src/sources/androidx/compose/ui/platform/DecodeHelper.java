package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.OffsetKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��|\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\nH\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u0010ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u0016ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u001aø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\"J\n\u0010#\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0002J\u0016\u0010(\u001a\u00020)ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010\u0012J\u0018\u0010+\u001a\u00020,H\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b-\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "string", "", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "dataAvailable", "", "decodeBaselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "decodeBaselineShift-y9eOQZs", "()F", "decodeByte", "", "decodeColor", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeFloat", "", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "decodeInt", "decodeShadow", "Landroidx/compose/ui/graphics/Shadow;", "decodeSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "decodeString", "decodeTextDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "decodeTextGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "decodeTextUnit", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeULong", "Lkotlin/ULong;", "decodeULong-s-VKNKU", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/DecodeHelper.class */
public final class DecodeHelper {
    @NotNull
    private final Parcel parcel;

    public DecodeHelper(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
        byte[] decode = Base64.decode(string, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs  reason: not valid java name */
    private final float m4203decodeBaselineShifty9eOQZs() {
        return BaselineShift.m4675constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        return new Shadow(m4205decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        TextDecoration lineThrough;
        List<TextDecoration> listOf;
        int decodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        boolean z = (companion.getLineThrough().getMask() & decodeInt) != 0;
        boolean z2 = (decodeInt & companion.getUnderline().getMask()) != 0;
        if (z && z2) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TextDecoration[]{companion.getLineThrough(), companion.getUnderline()});
            lineThrough = companion.combine(listOf);
        } else {
            lineThrough = z ? companion.getLineThrough() : z2 ? companion.getUnderline() : companion.getNone();
        }
        return lineThrough;
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU  reason: not valid java name */
    private final long m4204decodeULongsVKNKU() {
        return ULong.m6025constructorimpl(this.parcel.readLong());
    }

    /* renamed from: decodeColor-0d7_KjU  reason: not valid java name */
    public final long m4205decodeColor0d7_KjU() {
        return Color.m2410constructorimpl(m4204decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA  reason: not valid java name */
    public final int m4206decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        return (decodeByte != 0 && decodeByte == 1) ? FontStyle.Companion.m4534getItalic_LCdwA() : FontStyle.Companion.m4535getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m4207decodeFontSynthesisGVVA2EU() {
        int m4549getWeightGVVA2EU;
        byte decodeByte = decodeByte();
        if (decodeByte != 0) {
            if (decodeByte == 1) {
                m4549getWeightGVVA2EU = FontSynthesis.Companion.m4546getAllGVVA2EU();
            } else if (decodeByte == 3) {
                m4549getWeightGVVA2EU = FontSynthesis.Companion.m4548getStyleGVVA2EU();
            } else if (decodeByte == 2) {
                m4549getWeightGVVA2EU = FontSynthesis.Companion.m4549getWeightGVVA2EU();
            }
            return m4549getWeightGVVA2EU;
        }
        m4549getWeightGVVA2EU = FontSynthesis.Companion.m4547getNoneGVVA2EU();
        return m4549getWeightGVVA2EU;
    }

    @NotNull
    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    @NotNull
    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte decodeByte = decodeByte();
            if (decodeByte != 1) {
                MutableSpanStyle mutableSpanStyle2 = mutableSpanStyle;
                if (decodeByte == 2) {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle2.m4244setFontSizeR2X_6o(m4208decodeTextUnitXSAIIZE());
                    mutableSpanStyle = mutableSpanStyle2;
                } else if (decodeByte == 3) {
                    if (dataAvailable() < 4) {
                        break;
                    }
                    mutableSpanStyle2.setFontWeight(decodeFontWeight());
                    mutableSpanStyle = mutableSpanStyle2;
                } else if (decodeByte == 4) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle2.m4245setFontStylemLjRB2g(FontStyle.m4527boximpl(m4206decodeFontStyle_LCdwA()));
                    mutableSpanStyle = mutableSpanStyle2;
                } else if (decodeByte != 5) {
                    if (decodeByte != 6) {
                        if (decodeByte != 7) {
                            if (decodeByte != 8) {
                                if (decodeByte != 9) {
                                    if (decodeByte != 10) {
                                        if (decodeByte != 11) {
                                            if (decodeByte == 12) {
                                                if (dataAvailable() < 20) {
                                                    break;
                                                }
                                                mutableSpanStyle2.setShadow(decodeShadow());
                                            }
                                        } else if (dataAvailable() < 4) {
                                            break;
                                        } else {
                                            mutableSpanStyle2.setTextDecoration(decodeTextDecoration());
                                        }
                                    } else if (dataAvailable() < 8) {
                                        break;
                                    } else {
                                        mutableSpanStyle2.m4241setBackground8_81llA(m4205decodeColor0d7_KjU());
                                    }
                                } else if (dataAvailable() < 8) {
                                    break;
                                } else {
                                    mutableSpanStyle2.setTextGeometricTransform(decodeTextGeometricTransform());
                                }
                            } else if (dataAvailable() < 4) {
                                break;
                            } else {
                                mutableSpanStyle2.m4242setBaselineShift_isdbwI(BaselineShift.m4674boximpl(m4203decodeBaselineShifty9eOQZs()));
                            }
                        } else if (dataAvailable() < 5) {
                            break;
                        } else {
                            mutableSpanStyle2.m4247setLetterSpacingR2X_6o(m4208decodeTextUnitXSAIIZE());
                        }
                    } else {
                        mutableSpanStyle2.setFontFeatureSettings(decodeString());
                    }
                    mutableSpanStyle = mutableSpanStyle2;
                } else if (dataAvailable() < 1) {
                    break;
                } else {
                    mutableSpanStyle2.m4246setFontSynthesistDdu0R4(FontSynthesis.m4537boximpl(m4207decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle = mutableSpanStyle2;
                }
            } else if (dataAvailable() < 8) {
                break;
            } else {
                mutableSpanStyle.m4243setColor8_81llA(m4205decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE  reason: not valid java name */
    public final long m4208decodeTextUnitXSAIIZE() {
        byte decodeByte = decodeByte();
        long m5008getSpUIouoOA = decodeByte == 1 ? TextUnitType.Companion.m5008getSpUIouoOA() : decodeByte == 2 ? TextUnitType.Companion.m5007getEmUIouoOA() : TextUnitType.Companion.m5009getUnspecifiedUIouoOA();
        return TextUnitType.m5003equalsimpl0(m5008getSpUIouoOA, TextUnitType.Companion.m5009getUnspecifiedUIouoOA()) ? TextUnit.Companion.m4985getUnspecifiedXSAIIZE() : TextUnitKt.m4986TextUnitanM5pPY(decodeFloat(), m5008getSpUIouoOA);
    }
}
