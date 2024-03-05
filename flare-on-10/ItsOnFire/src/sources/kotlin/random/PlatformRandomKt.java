package kotlin.random;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
@Metadata(d1 = {"��\u001e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010��\u001a\u00020\u0001H\u0081\b\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H��\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0007\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0007¨\u0006\n"}, d2 = {"defaultPlatformRandom", "Lkotlin/random/Random;", "doubleFromParts", "", "hi26", "", "low27", "asJavaRandom", "Ljava/util/Random;", "asKotlinRandom", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/random/PlatformRandomKt.class */
public final class PlatformRandomKt {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r0 == 0) goto L11;
     */
    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Random asJavaRandom(@org.jetbrains.annotations.NotNull kotlin.random.Random r4) {
        /*
            r0 = r4
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            boolean r0 = r0 instanceof kotlin.random.AbstractPlatformRandom
            if (r0 == 0) goto L15
            r0 = r4
            kotlin.random.AbstractPlatformRandom r0 = (kotlin.random.AbstractPlatformRandom) r0
            r5 = r0
            goto L17
        L15:
            r0 = 0
            r5 = r0
        L17:
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r5
            java.util.Random r0 = r0.getImpl()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L2f
        L26:
            kotlin.random.KotlinRandom r0 = new kotlin.random.KotlinRandom
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
        L2f:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.PlatformRandomKt.asJavaRandom(kotlin.random.Random):java.util.Random");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r0 == 0) goto L11;
     */
    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.random.Random asKotlinRandom(@org.jetbrains.annotations.NotNull java.util.Random r4) {
        /*
            r0 = r4
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            boolean r0 = r0 instanceof kotlin.random.KotlinRandom
            if (r0 == 0) goto L15
            r0 = r4
            kotlin.random.KotlinRandom r0 = (kotlin.random.KotlinRandom) r0
            r5 = r0
            goto L17
        L15:
            r0 = 0
            r5 = r0
        L17:
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r5
            kotlin.random.Random r0 = r0.getImpl()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L2f
        L26:
            kotlin.random.PlatformRandom r0 = new kotlin.random.PlatformRandom
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
        L2f:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.PlatformRandomKt.asKotlinRandom(java.util.Random):kotlin.random.Random");
    }

    @InlineOnly
    private static final Random defaultPlatformRandom() {
        return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }

    public static final double doubleFromParts(int i2, int i3) {
        return ((i2 << 27) + i3) / 9.007199254740992E15d;
    }
}
