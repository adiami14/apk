package kotlin;

import androidx.appcompat.R;
import kotlin.internal.InlineOnly;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"�� \n��\n\u0002\u0010\b\n\u0002\u0010\u0005\n��\n\u0002\u0010\t\n\u0002\u0010\n\n��\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n��\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010��\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "", "", "mod", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/NumbersKt")
/* loaded from: ItsOnFire.jar:kotlin/NumbersKt__FloorDivModKt.class */
public class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(byte b2, byte b3) {
        int i2 = b2 / b3;
        int i3 = i2;
        if ((b2 ^ b3) < 0) {
            i3 = i2;
            if (b3 * i2 != b2) {
                i3 = i2 - 1;
            }
        }
        return i3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(byte b2, int i2) {
        int i3 = b2 / i2;
        int i4 = i3;
        if ((b2 ^ i2) < 0) {
            i4 = i3;
            if (i2 * i3 != b2) {
                i4 = i3 - 1;
            }
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(byte b2, short s2) {
        int i2 = b2 / s2;
        int i3 = i2;
        if ((b2 ^ s2) < 0) {
            i3 = i2;
            if (s2 * i2 != b2) {
                i3 = i2 - 1;
            }
        }
        return i3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(int i2, byte b2) {
        int i3 = i2 / b2;
        int i4 = i3;
        if ((i2 ^ b2) < 0) {
            i4 = i3;
            if (b2 * i3 != i2) {
                i4 = i3 - 1;
            }
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(int i2, int i3) {
        int i4 = i2 / i3;
        int i5 = i4;
        if ((i2 ^ i3) < 0) {
            i5 = i4;
            if (i3 * i4 != i2) {
                i5 = i4 - 1;
            }
        }
        return i5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(int i2, short s2) {
        int i3 = i2 / s2;
        int i4 = i3;
        if ((i2 ^ s2) < 0) {
            i4 = i3;
            if (s2 * i3 != i2) {
                i4 = i3 - 1;
            }
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(short s2, byte b2) {
        int i2 = s2 / b2;
        int i3 = i2;
        if ((s2 ^ b2) < 0) {
            i3 = i2;
            if (b2 * i2 != s2) {
                i3 = i2 - 1;
            }
        }
        return i3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(short s2, int i2) {
        int i3 = s2 / i2;
        int i4 = i3;
        if ((s2 ^ i2) < 0) {
            i4 = i3;
            if (i2 * i3 != s2) {
                i4 = i3 - 1;
            }
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(short s2, short s3) {
        int i2 = s2 / s3;
        int i3 = i2;
        if ((s2 ^ s3) < 0) {
            i3 = i2;
            if (s3 * i2 != s2) {
                i3 = i2 - 1;
            }
        }
        return i3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(byte b2, long j2) {
        long j3 = b2;
        long j4 = j3 / j2;
        long j5 = j4;
        if ((j3 ^ j2) < 0) {
            j5 = j4;
            if (j2 * j4 != j3) {
                j5 = j4 - 1;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / j2;
        long j5 = j4;
        if ((j3 ^ j2) < 0) {
            j5 = j4;
            if (j2 * j4 != j3) {
                j5 = j4 - 1;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(long j2, byte b2) {
        long j3 = b2;
        long j4 = j2 / j3;
        long j5 = j4;
        if ((j2 ^ j3) < 0) {
            j5 = j4;
            if (j3 * j4 != j2) {
                j5 = j4 - 1;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(long j2, int i2) {
        long j3 = i2;
        long j4 = j2 / j3;
        long j5 = j4;
        if ((j2 ^ j3) < 0) {
            j5 = j4;
            if (j3 * j4 != j2) {
                j5 = j4 - 1;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(long j2, long j3) {
        long j4 = j2 / j3;
        long j5 = j4;
        if ((j2 ^ j3) < 0) {
            j5 = j4;
            if (j3 * j4 != j2) {
                j5 = j4 - 1;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(long j2, short s2) {
        long j3 = s2;
        long j4 = j2 / j3;
        long j5 = j4;
        if ((j2 ^ j3) < 0) {
            j5 = j4;
            if (j3 * j4 != j2) {
                j5 = j4 - 1;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(short s2, long j2) {
        long j3 = s2;
        long j4 = j3 / j2;
        long j5 = j4;
        if ((j3 ^ j2) < 0) {
            j5 = j4;
            if (j2 * j4 != j3) {
                j5 = j4 - 1;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte mod(byte b2, byte b3) {
        int i2 = b2 % b3;
        return (byte) (i2 + (b3 & (((i2 ^ b3) & ((-i2) | i2)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte mod(int i2, byte b2) {
        int i3 = i2 % b2;
        return (byte) (i3 + (b2 & (((i3 ^ b2) & ((-i3) | i3)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte mod(long j2, byte b2) {
        long j3;
        long j4 = j2 % b2;
        return (byte) (j4 + (j3 & (((j4 ^ j3) & ((-j4) | j4)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte mod(short s2, byte b2) {
        int i2 = s2 % b2;
        return (byte) (i2 + (b2 & (((i2 ^ b2) & ((-i2) | i2)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double mod(double d2, double d3) {
        double d4 = d2 % d3;
        double d5 = d4;
        if (!(d4 == 0.0d)) {
            d5 = d4;
            if (!(Math.signum(d4) == Math.signum(d3))) {
                d5 = d4 + d3;
            }
        }
        return d5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double mod(double d2, float f2) {
        double d3 = f2;
        double d4 = d2 % d3;
        double d5 = d4;
        if (!(d4 == 0.0d)) {
            d5 = d4;
            if (!(Math.signum(d4) == Math.signum(d3))) {
                d5 = d4 + d3;
            }
        }
        return d5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double mod(float f2, double d2) {
        double d3 = f2 % d2;
        double d4 = d3;
        if (!(d3 == 0.0d)) {
            d4 = d3;
            if (!(Math.signum(d3) == Math.signum(d2))) {
                d4 = d3 + d2;
            }
        }
        return d4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final float mod(float f2, float f3) {
        float f4 = f2 % f3;
        float f5 = f4;
        if (!(f4 == 0.0f)) {
            f5 = f4;
            if (!(Math.signum(f4) == Math.signum(f3))) {
                f5 = f4 + f3;
            }
        }
        return f5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int mod(byte b2, int i2) {
        int i3 = b2 % i2;
        return i3 + (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int mod(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 + (i3 & (((i4 ^ i3) & ((-i4) | i4)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int mod(long j2, int i2) {
        long j3 = i2;
        long j4 = j2 % j3;
        return (int) (j4 + (j3 & (((j4 ^ j3) & ((-j4) | j4)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int mod(short s2, int i2) {
        int i3 = s2 % i2;
        return i3 + (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long mod(byte b2, long j2) {
        long j3 = b2 % j2;
        return j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long mod(int i2, long j2) {
        long j3 = i2 % j2;
        return j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long mod(long j2, long j3) {
        long j4 = j2 % j3;
        return j4 + (j3 & (((j4 ^ j3) & ((-j4) | j4)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long mod(short s2, long j2) {
        long j3 = s2 % j2;
        return j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short mod(byte b2, short s2) {
        int i2 = b2 % s2;
        return (short) (i2 + (s2 & (((i2 ^ s2) & ((-i2) | i2)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short mod(int i2, short s2) {
        int i3 = i2 % s2;
        return (short) (i3 + (s2 & (((i3 ^ s2) & ((-i3) | i3)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short mod(long j2, short s2) {
        long j3;
        long j4 = j2 % s2;
        return (short) (j4 + (j3 & (((j4 ^ j3) & ((-j4) | j4)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short mod(short s2, short s3) {
        int i2 = s2 % s3;
        return (short) (i2 + (s3 & (((i2 ^ s3) & ((-i2) | i2)) >> 31)));
    }
}
