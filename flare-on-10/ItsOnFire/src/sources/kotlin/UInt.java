package kotlin;

import androidx.appcompat.R;
import com.google.firebase.messaging.Constants;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"��n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n��\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010��\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018�� y2\b\u0012\u0004\u0012\u00020��0\u0001:\u0001yB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\fø\u0001��¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001��¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020��H\u0097\nø\u0001��¢\u0006\u0004\b\u0010\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001��¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001��¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020��H\u0087\nø\u0001\u0001ø\u0001��¢\u0006\u0004\b\u0018\u0010\u0005J\u001b\u0010\u0019\u001a\u00020��2\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001��¢\u0006\u0004\b\u001a\u0010\u000fJ\u001b\u0010\u0019\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\b\u001b\u0010\u000bJ\u001b\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001��¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0019\u001a\u00020��2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001��¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020��2\u0006\u0010\t\u001a\u00020\rH\u0087\bø\u0001��¢\u0006\u0004\b%\u0010\u000fJ\u001b\u0010$\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\bø\u0001��¢\u0006\u0004\b&\u0010\u000bJ\u001b\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001��¢\u0006\u0004\b'\u0010\u001dJ\u001b\u0010$\u001a\u00020��2\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001��¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0005J\u0016\u0010+\u001a\u00020��H\u0087\nø\u0001\u0001ø\u0001��¢\u0006\u0004\b,\u0010\u0005J\u0016\u0010-\u001a\u00020��H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\b.\u0010\u0005J\u001b\u0010/\u001a\u00020��2\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001��¢\u0006\u0004\b0\u0010\u000fJ\u001b\u0010/\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\b1\u0010\u000bJ\u001b\u0010/\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001��¢\u0006\u0004\b2\u0010\u001dJ\u001b\u0010/\u001a\u00020��2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001��¢\u0006\u0004\b3\u0010\u0016J\u001b\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0087\bø\u0001��¢\u0006\u0004\b5\u00106J\u001b\u00104\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\bø\u0001��¢\u0006\u0004\b7\u0010\u000bJ\u001b\u00104\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001��¢\u0006\u0004\b8\u0010\u001dJ\u001b\u00104\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001��¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\fø\u0001��¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020��2\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001��¢\u0006\u0004\b>\u0010\u000fJ\u001b\u0010=\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\b?\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001��¢\u0006\u0004\b@\u0010\u001dJ\u001b\u0010=\u001a\u00020��2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001��¢\u0006\u0004\bA\u0010\u0016J\u001b\u0010B\u001a\u00020C2\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020��2\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001��¢\u0006\u0004\bG\u0010\u000fJ\u001b\u0010F\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010F\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001��¢\u0006\u0004\bI\u0010\u001dJ\u001b\u0010F\u001a\u00020��2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001��¢\u0006\u0004\bJ\u0010\u0016J\u001e\u0010K\u001a\u00020��2\u0006\u0010L\u001a\u00020\u0003H\u0087\fø\u0001\u0001ø\u0001��¢\u0006\u0004\bM\u0010\u000bJ\u001e\u0010N\u001a\u00020��2\u0006\u0010L\u001a\u00020\u0003H\u0087\fø\u0001\u0001ø\u0001��¢\u0006\u0004\bO\u0010\u000bJ\u001b\u0010P\u001a\u00020��2\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001��¢\u0006\u0004\bQ\u0010\u000fJ\u001b\u0010P\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\bR\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001��¢\u0006\u0004\bS\u0010\u001dJ\u001b\u0010P\u001a\u00020��2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001��¢\u0006\u0004\bT\u0010\u0016J\u0010\u0010U\u001a\u00020VH\u0087\b¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020ZH\u0087\b¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020^H\u0087\b¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bb\u0010\u0005J\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0016\u0010o\u001a\u00020\rH\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\bp\u0010XJ\u0016\u0010q\u001a\u00020��H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\br\u0010\u0005J\u0016\u0010s\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\bt\u0010fJ\u0016\u0010u\u001a\u00020\u0014H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\bv\u0010jJ\u001b\u0010w\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\fø\u0001��¢\u0006\u0004\bx\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006z"}, d2 = {"Lkotlin/UInt;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "constructor-impl", "(I)I", "getData$annotations", "()V", "and", "other", "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-pVg5ArA", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "inc", "inc-pVg5ArA", "inv", "inv-pVg5ArA", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(IB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(IS)S", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toDouble", "", "toDouble-impl", "(I)D", "toFloat", "", "toFloat-impl", "(I)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: ItsOnFire.jar:kotlin/UInt.class */
public final class UInt implements Comparable<UInt> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    @Metadata(d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UInt$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UInt;", "I", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/UInt$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ UInt(int i2) {
        this.data = i2;
    }

    @InlineOnly
    /* renamed from: and-WZ4Q5Ns  reason: not valid java name */
    private static final int m5939andWZ4Q5Ns(int i2, int i3) {
        return m5946constructorimpl(i2 & i3);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UInt m5940boximpl(int i2) {
        return new UInt(i2);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static final int m5941compareTo7apg3OU(int i2, byte b2) {
        return UnsignedKt.uintCompare(i2, m5946constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m5942compareToVKZWuLQ(int i2, long j2) {
        return UnsignedKt.ulongCompare(ULong.m6025constructorimpl(i2 & 4294967295L), j2);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private int m5943compareToWZ4Q5Ns(int i2) {
        return UnsignedKt.uintCompare(m5997unboximpl(), i2);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static int m5944compareToWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.uintCompare(i2, i3);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static final int m5945compareToxj2QHRw(int i2, short s2) {
        return UnsignedKt.uintCompare(i2, m5946constructorimpl(s2 & 65535));
    }

    @PublishedApi
    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m5946constructorimpl(int i2) {
        return i2;
    }

    @InlineOnly
    /* renamed from: dec-pVg5ArA  reason: not valid java name */
    private static final int m5947decpVg5ArA(int i2) {
        return m5946constructorimpl(i2 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m5948div7apg3OU(int i2, byte b2) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(i2, m5946constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m5949divVKZWuLQ(int i2, long j2) {
        return UnsignedKt.m6205ulongDivideeb3DHEI(ULong.m6025constructorimpl(i2 & 4294967295L), j2);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m5950divWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(i2, i3);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m5951divxj2QHRw(int i2, short s2) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(i2, m5946constructorimpl(s2 & 65535));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m5952equalsimpl(int i2, Object obj) {
        return (obj instanceof UInt) && i2 == ((UInt) obj).m5997unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m5953equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m5954floorDiv7apg3OU(int i2, byte b2) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(i2, m5946constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m5955floorDivVKZWuLQ(int i2, long j2) {
        return UnsignedKt.m6205ulongDivideeb3DHEI(ULong.m6025constructorimpl(i2 & 4294967295L), j2);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m5956floorDivWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(i2, i3);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m5957floorDivxj2QHRw(int i2, short s2) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(i2, m5946constructorimpl(s2 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m5958hashCodeimpl(int i2) {
        return i2;
    }

    @InlineOnly
    /* renamed from: inc-pVg5ArA  reason: not valid java name */
    private static final int m5959incpVg5ArA(int i2) {
        return m5946constructorimpl(i2 + 1);
    }

    @InlineOnly
    /* renamed from: inv-pVg5ArA  reason: not valid java name */
    private static final int m5960invpVg5ArA(int i2) {
        return m5946constructorimpl(i2);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m5961minus7apg3OU(int i2, byte b2) {
        return m5946constructorimpl(i2 - m5946constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m5962minusVKZWuLQ(int i2, long j2) {
        return ULong.m6025constructorimpl(ULong.m6025constructorimpl(i2 & 4294967295L) - j2);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m5963minusWZ4Q5Ns(int i2, int i3) {
        return m5946constructorimpl(i2 - i3);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m5964minusxj2QHRw(int i2, short s2) {
        return m5946constructorimpl(i2 - m5946constructorimpl(s2 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m5965mod7apg3OU(int i2, byte b2) {
        return UByte.m5869constructorimpl((byte) UnsignedKt.m6204uintRemainderJ1ME1BU(i2, m5946constructorimpl(b2 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m5966modVKZWuLQ(int i2, long j2) {
        return UnsignedKt.m6206ulongRemaindereb3DHEI(ULong.m6025constructorimpl(i2 & 4294967295L), j2);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m5967modWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.m6204uintRemainderJ1ME1BU(i2, i3);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m5968modxj2QHRw(int i2, short s2) {
        return UShort.m6133constructorimpl((short) UnsignedKt.m6204uintRemainderJ1ME1BU(i2, m5946constructorimpl(s2 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-WZ4Q5Ns  reason: not valid java name */
    private static final int m5969orWZ4Q5Ns(int i2, int i3) {
        return m5946constructorimpl(i2 | i3);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m5970plus7apg3OU(int i2, byte b2) {
        return m5946constructorimpl(i2 + m5946constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m5971plusVKZWuLQ(int i2, long j2) {
        return ULong.m6025constructorimpl(ULong.m6025constructorimpl(i2 & 4294967295L) + j2);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m5972plusWZ4Q5Ns(int i2, int i3) {
        return m5946constructorimpl(i2 + i3);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m5973plusxj2QHRw(int i2, short s2) {
        return m5946constructorimpl(i2 + m5946constructorimpl(s2 & 65535));
    }

    @InlineOnly
    /* renamed from: rangeTo-WZ4Q5Ns  reason: not valid java name */
    private static final UIntRange m5974rangeToWZ4Q5Ns(int i2, int i3) {
        return new UIntRange(i2, i3, null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m5975rem7apg3OU(int i2, byte b2) {
        return UnsignedKt.m6204uintRemainderJ1ME1BU(i2, m5946constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m5976remVKZWuLQ(int i2, long j2) {
        return UnsignedKt.m6206ulongRemaindereb3DHEI(ULong.m6025constructorimpl(i2 & 4294967295L), j2);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m5977remWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.m6204uintRemainderJ1ME1BU(i2, i3);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m5978remxj2QHRw(int i2, short s2) {
        return UnsignedKt.m6204uintRemainderJ1ME1BU(i2, m5946constructorimpl(s2 & 65535));
    }

    @InlineOnly
    /* renamed from: shl-pVg5ArA  reason: not valid java name */
    private static final int m5979shlpVg5ArA(int i2, int i3) {
        return m5946constructorimpl(i2 << i3);
    }

    @InlineOnly
    /* renamed from: shr-pVg5ArA  reason: not valid java name */
    private static final int m5980shrpVg5ArA(int i2, int i3) {
        return m5946constructorimpl(i2 >>> i3);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m5981times7apg3OU(int i2, byte b2) {
        return m5946constructorimpl(i2 * m5946constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m5982timesVKZWuLQ(int i2, long j2) {
        return ULong.m6025constructorimpl(ULong.m6025constructorimpl(i2 & 4294967295L) * j2);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m5983timesWZ4Q5Ns(int i2, int i3) {
        return m5946constructorimpl(i2 * i3);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m5984timesxj2QHRw(int i2, short s2) {
        return m5946constructorimpl(i2 * m5946constructorimpl(s2 & 65535));
    }

    @InlineOnly
    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m5985toByteimpl(int i2) {
        return (byte) i2;
    }

    @InlineOnly
    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m5986toDoubleimpl(int i2) {
        return UnsignedKt.uintToDouble(i2);
    }

    @InlineOnly
    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m5987toFloatimpl(int i2) {
        return (float) UnsignedKt.uintToDouble(i2);
    }

    @InlineOnly
    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m5988toIntimpl(int i2) {
        return i2;
    }

    @InlineOnly
    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m5989toLongimpl(int i2) {
        return i2 & 4294967295L;
    }

    @InlineOnly
    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m5990toShortimpl(int i2) {
        return (short) i2;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m5991toStringimpl(int i2) {
        return String.valueOf(i2 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m5992toUBytew2LRezQ(int i2) {
        return UByte.m5869constructorimpl((byte) i2);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m5993toUIntpVg5ArA(int i2) {
        return i2;
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m5994toULongsVKNKU(int i2) {
        return ULong.m6025constructorimpl(i2 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m5995toUShortMh2AYeg(int i2) {
        return UShort.m6133constructorimpl((short) i2);
    }

    @InlineOnly
    /* renamed from: xor-WZ4Q5Ns  reason: not valid java name */
    private static final int m5996xorWZ4Q5Ns(int i2, int i3) {
        return m5946constructorimpl(i2 ^ i3);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(m5997unboximpl(), uInt.m5997unboximpl());
    }

    public boolean equals(Object obj) {
        return m5952equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m5958hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m5991toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m5997unboximpl() {
        return this.data;
    }
}
