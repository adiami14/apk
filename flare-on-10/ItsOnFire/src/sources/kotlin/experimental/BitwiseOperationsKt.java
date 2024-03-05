package kotlin.experimental;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0010\u0005\n��\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010��\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f¨\u0006\u0007"}, d2 = {"and", "", "other", "", "inv", "or", "xor", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/experimental/BitwiseOperationsKt.class */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b2, byte b3) {
        return (byte) (b2 & b3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s2, short s3) {
        return (short) (s2 & s3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b2) {
        return b2;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s2) {
        return s2;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte or(byte b2, byte b3) {
        return (byte) (b2 | b3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short or(short s2, short s3) {
        return (short) (s2 | s3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b2, byte b3) {
        return (byte) (b2 ^ b3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s2, short s3) {
        return (short) (s2 ^ s3);
    }
}