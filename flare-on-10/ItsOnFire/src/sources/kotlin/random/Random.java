package kotlin.random;

import androidx.appcompat.R;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018�� \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", Constants.MessagePayloadKeys.FROM, "nextFloat", "", "nextInt", "nextLong", "", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/random/Random.class */
public abstract class Random {
    @NotNull
    public static final Default Default = new Default(null);
    @NotNull
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    @Metadata(d1 = {"��H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0010��\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u001d"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", Constants.MessagePayloadKeys.FROM, "nextFloat", "", "nextInt", "nextLong", "", "writeReplace", "", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/random/Random$Default.class */
    public static final class Default extends Random implements Serializable {

        @Metadata(d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0010��\n��\bÂ\u0002\u0018��2\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n��¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:kotlin/random/Random$Default$Serialized.class */
        public static final class Serialized implements Serializable {
            @NotNull
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i2) {
            return Random.defaultRandom.nextBits(i2);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(int i2) {
            return Random.defaultRandom.nextBytes(i2);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array, int i2, int i3) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array, i2, i3);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d2) {
            return Random.defaultRandom.nextDouble(d2);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d2, double d3) {
            return Random.defaultRandom.nextDouble(d2, d3);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int i2) {
            return Random.defaultRandom.nextInt(i2);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i2, int i3) {
            return Random.defaultRandom.nextInt(i2, i3);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long j2) {
            return Random.defaultRandom.nextLong(j2);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j2, long j3) {
            return Random.defaultRandom.nextLong(j2, j3);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return random.nextBytes(bArr, i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i2);

    public boolean nextBoolean() {
        boolean z = true;
        if (nextBits(1) == 0) {
            z = false;
        }
        return z;
    }

    @NotNull
    public byte[] nextBytes(int i2) {
        return nextBytes(new byte[i2]);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!(new IntRange(0, array.length).contains(i2) && new IntRange(0, array.length).contains(i3))) {
            throw new IllegalArgumentException(("fromIndex (" + i2 + ") or toIndex (" + i3 + ") are out of range: 0.." + array.length + '.').toString());
        }
        if (!(i2 <= i3)) {
            throw new IllegalArgumentException(("fromIndex (" + i2 + ") must be not greater than toIndex (" + i3 + ").").toString());
        }
        int i4 = (i3 - i2) / 4;
        for (int i5 = 0; i5 < i4; i5++) {
            int nextInt = nextInt();
            array[i2] = (byte) nextInt;
            array[i2 + 1] = (byte) (nextInt >>> 8);
            array[i2 + 2] = (byte) (nextInt >>> 16);
            array[i2 + 3] = (byte) (nextInt >>> 24);
            i2 += 4;
        }
        int i6 = i3 - i2;
        int nextBits = nextBits(i6 * 8);
        for (int i7 = 0; i7 < i6; i7++) {
            array[i2 + i7] = (byte) (nextBits >>> (i7 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public double nextDouble(double d2) {
        return nextDouble(0.0d, d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double nextDouble(double r10, double r12) {
        /*
            r9 = this;
            r0 = r10
            r1 = r12
            kotlin.random.RandomKt.checkRangeBounds(r0, r1)
            r0 = r12
            r1 = r10
            double r0 = r0 - r1
            r14 = r0
            r0 = r14
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 == 0) goto L75
            r0 = r10
            boolean r0 = java.lang.Double.isInfinite(r0)
            r16 = r0
            r0 = 1
            r17 = r0
            r0 = r16
            if (r0 != 0) goto L2d
            r0 = r10
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 != 0) goto L2d
            r0 = 1
            r18 = r0
            goto L30
        L2d:
            r0 = 0
            r18 = r0
        L30:
            r0 = r18
            if (r0 == 0) goto L75
            r0 = r12
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 != 0) goto L4a
            r0 = r12
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 != 0) goto L4a
            r0 = r17
            r18 = r0
            goto L4d
        L4a:
            r0 = 0
            r18 = r0
        L4d:
            r0 = r18
            if (r0 == 0) goto L75
            r0 = r9
            double r0 = r0.nextDouble()
            r19 = r0
            r0 = 2
            double r0 = (double) r0
            r14 = r0
            r0 = r19
            r1 = r12
            r2 = r14
            double r1 = r1 / r2
            r2 = r10
            r3 = r14
            double r2 = r2 / r3
            double r1 = r1 - r2
            double r0 = r0 * r1
            r14 = r0
            r0 = r10
            r1 = r14
            double r0 = r0 + r1
            r1 = r14
            double r0 = r0 + r1
            r10 = r0
            goto L7f
        L75:
            r0 = r10
            r1 = r9
            double r1 = r1.nextDouble()
            r2 = r14
            double r1 = r1 * r2
            double r0 = r0 + r1
            r10 = r0
        L7f:
            r0 = r10
            r14 = r0
            r0 = r10
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L91
            r0 = r12
            r1 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r0 = java.lang.Math.nextAfter(r0, r1)
            r14 = r0
        L91:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int i2) {
        return nextInt(0, i2);
    }

    public int nextInt(int i2, int i3) {
        int nextInt;
        int i4;
        int nextInt2;
        boolean z;
        RandomKt.checkRangeBounds(i2, i3);
        int i5 = i3 - i2;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = nextBits(RandomKt.fastLog2(i5));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i4 = nextInt % i5;
                } while ((nextInt - i4) + (i5 - 1) < 0);
            }
            return i2 + i4;
        }
        do {
            nextInt2 = nextInt();
            z = false;
            if (i2 <= nextInt2) {
                z = false;
                if (nextInt2 < i3) {
                    z = true;
                }
            }
        } while (!z);
        return nextInt2;
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public long nextLong(long j2) {
        return nextLong(0L, j2);
    }

    public long nextLong(long j2, long j3) {
        long nextLong;
        boolean z;
        long nextLong2;
        long j4;
        int nextInt;
        RandomKt.checkRangeBounds(j2, j3);
        long j5 = j3 - j2;
        if (j5 <= 0) {
            do {
                nextLong = nextLong();
                z = false;
                if (j2 <= nextLong) {
                    z = false;
                    if (nextLong < j3) {
                        z = true;
                    }
                }
            } while (!z);
            return nextLong;
        }
        if (((-j5) & j5) == j5) {
            int i2 = (int) j5;
            int i3 = (int) (j5 >>> 32);
            if (i2 != 0) {
                nextInt = nextBits(RandomKt.fastLog2(i2));
            } else if (i3 == 1) {
                nextInt = nextInt();
            } else {
                j4 = (nextBits(RandomKt.fastLog2(i3)) << 32) + (nextInt() & 4294967295L);
            }
            j4 = nextInt & 4294967295L;
        } else {
            do {
                nextLong2 = nextLong() >>> 1;
                j4 = nextLong2 % j5;
            } while ((nextLong2 - j4) + (j5 - 1) < 0);
        }
        return j2 + j4;
    }
}
