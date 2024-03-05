package kotlin;

import androidx.appcompat.R;
import kotlin.internal.InlineOnly;
@Metadata(d1 = {"��,\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\b\n��\n\u0002\u0010\t\n��\n\u0002\u0010\n\n\u0002\b\u0002\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001��¢\u0006\u0002\u0010\u0003\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u0004H\u0087\bø\u0001��¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u0006H\u0087\bø\u0001��¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\bH\u0087\bø\u0001��¢\u0006\u0002\u0010\t\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\nH\u0087\bø\u0001��¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\fH\u0087\bø\u0001��¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"toUInt", "Lkotlin/UInt;", "", "(B)I", "", "(D)I", "", "(F)I", "", "(I)I", "", "(J)I", "", "(S)I", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/UIntKt.class */
public final class UIntKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(byte b2) {
        return UInt.m5946constructorimpl(b2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(double d2) {
        return UnsignedKt.doubleToUInt(d2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(float f2) {
        return UnsignedKt.doubleToUInt(f2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(int i2) {
        return UInt.m5946constructorimpl(i2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(long j2) {
        return UInt.m5946constructorimpl((int) j2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(short s2) {
        return UInt.m5946constructorimpl(s2);
    }
}
