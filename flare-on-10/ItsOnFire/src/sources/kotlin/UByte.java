package kotlin;

import androidx.appcompat.R;
import com.google.firebase.messaging.Constants;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"��n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n��\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010��\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018�� t2\b\u0012\u0004\u0012\u00020��0\u0001:\u0001tB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\fø\u0001��¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020��H\u0097\nø\u0001��¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001��¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001��¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001��¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020��H\u0087\nø\u0001\u0001ø\u0001��¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001��¢\u0006\u0004\b\u001d\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001��¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001��¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020��H\u0087\bø\u0001��¢\u0006\u0004\b'\u0010\u000fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001��¢\u0006\u0004\b(\u0010\u0012J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001��¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001��¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020��H\u0087\nø\u0001\u0001ø\u0001��¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020��H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\b3\u0010\u000fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001��¢\u0006\u0004\b4\u0010\u0012J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001��¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001��¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\bø\u0001��¢\u0006\u0004\b8\u0010\u000bJ\u001b\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001��¢\u0006\u0004\b9\u0010\u0012J\u001b\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001��¢\u0006\u0004\b:\u0010\u001fJ\u001b\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001��¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\fø\u0001��¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\b@\u0010\u000fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001��¢\u0006\u0004\bA\u0010\u0012J\u001b\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001��¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001��¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\bI\u0010\u000fJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001��¢\u0006\u0004\bJ\u0010\u0012J\u001b\u0010H\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001��¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001��¢\u0006\u0004\bL\u0010\u0018J\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020��H\u0087\nø\u0001��¢\u0006\u0004\bN\u0010\u000fJ\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001��¢\u0006\u0004\bO\u0010\u0012J\u001b\u0010M\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001��¢\u0006\u0004\bP\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001��¢\u0006\u0004\bQ\u0010\u0018J\u0010\u0010R\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bS\u0010\u0005J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\rH\u0087\b¢\u0006\u0004\b]\u0010-J\u0010\u0010^\u001a\u00020_H\u0087\b¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\u00020��H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\bk\u0010\u0005J\u0016\u0010l\u001a\u00020\u0010H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\bm\u0010-J\u0016\u0010n\u001a\u00020\u0013H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\bo\u0010aJ\u0016\u0010p\u001a\u00020\u0016H\u0087\bø\u0001\u0001ø\u0001��¢\u0006\u0004\bq\u0010eJ\u001b\u0010r\u001a\u00020��2\u0006\u0010\t\u001a\u00020��H\u0087\fø\u0001��¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, d2 = {"Lkotlin/UByte;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: ItsOnFire.jar:kotlin/UByte.class */
public final class UByte implements Comparable<UByte> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @Metadata(d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/UByte$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ UByte(byte b2) {
        this.data = b2;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU  reason: not valid java name */
    private static final byte m5862and7apg3OU(byte b2, byte b3) {
        return m5869constructorimpl((byte) (b2 & b3));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UByte m5863boximpl(byte b2) {
        return new UByte(b2);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private int m5864compareTo7apg3OU(byte b2) {
        return Intrinsics.compare(m5918unboximpl() & 255, b2 & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static int m5865compareTo7apg3OU(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, b3 & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m5866compareToVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.ulongCompare(ULong.m6025constructorimpl(b2 & 255), j2);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static final int m5867compareToWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.uintCompare(UInt.m5946constructorimpl(b2 & 255), i2);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static final int m5868compareToxj2QHRw(byte b2, short s2) {
        return Intrinsics.compare(b2 & 255, s2 & 65535);
    }

    @PublishedApi
    /* renamed from: constructor-impl  reason: not valid java name */
    public static byte m5869constructorimpl(byte b2) {
        return b2;
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ  reason: not valid java name */
    private static final byte m5870decw2LRezQ(byte b2) {
        return m5869constructorimpl((byte) (b2 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m5871div7apg3OU(byte b2, byte b3) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m5872divVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.m6205ulongDivideeb3DHEI(ULong.m6025constructorimpl(b2 & 255), j2);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m5873divWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), i2);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m5874divxj2QHRw(byte b2, short s2) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(s2 & 65535));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m5875equalsimpl(byte b2, Object obj) {
        return (obj instanceof UByte) && b2 == ((UByte) obj).m5918unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m5876equalsimpl0(byte b2, byte b3) {
        return b2 == b3;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m5877floorDiv7apg3OU(byte b2, byte b3) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m5878floorDivVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.m6205ulongDivideeb3DHEI(ULong.m6025constructorimpl(b2 & 255), j2);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m5879floorDivWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), i2);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m5880floorDivxj2QHRw(byte b2, short s2) {
        return UnsignedKt.m6203uintDivideJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(s2 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m5881hashCodeimpl(byte b2) {
        return b2;
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ  reason: not valid java name */
    private static final byte m5882incw2LRezQ(byte b2) {
        return m5869constructorimpl((byte) (b2 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ  reason: not valid java name */
    private static final byte m5883invw2LRezQ(byte b2) {
        return m5869constructorimpl(b2);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m5884minus7apg3OU(byte b2, byte b3) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) - UInt.m5946constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m5885minusVKZWuLQ(byte b2, long j2) {
        return ULong.m6025constructorimpl(ULong.m6025constructorimpl(b2 & 255) - j2);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m5886minusWZ4Q5Ns(byte b2, int i2) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) - i2);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m5887minusxj2QHRw(byte b2, short s2) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) - UInt.m5946constructorimpl(s2 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m5888mod7apg3OU(byte b2, byte b3) {
        return m5869constructorimpl((byte) UnsignedKt.m6204uintRemainderJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(b3 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m5889modVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.m6206ulongRemaindereb3DHEI(ULong.m6025constructorimpl(b2 & 255), j2);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m5890modWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.m6204uintRemainderJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), i2);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m5891modxj2QHRw(byte b2, short s2) {
        return UShort.m6133constructorimpl((short) UnsignedKt.m6204uintRemainderJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(s2 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU  reason: not valid java name */
    private static final byte m5892or7apg3OU(byte b2, byte b3) {
        return m5869constructorimpl((byte) (b2 | b3));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m5893plus7apg3OU(byte b2, byte b3) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) + UInt.m5946constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m5894plusVKZWuLQ(byte b2, long j2) {
        return ULong.m6025constructorimpl(ULong.m6025constructorimpl(b2 & 255) + j2);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m5895plusWZ4Q5Ns(byte b2, int i2) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) + i2);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m5896plusxj2QHRw(byte b2, short s2) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) + UInt.m5946constructorimpl(s2 & 65535));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU  reason: not valid java name */
    private static final UIntRange m5897rangeTo7apg3OU(byte b2, byte b3) {
        return new UIntRange(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(b3 & 255), null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m5898rem7apg3OU(byte b2, byte b3) {
        return UnsignedKt.m6204uintRemainderJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m5899remVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.m6206ulongRemaindereb3DHEI(ULong.m6025constructorimpl(b2 & 255), j2);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m5900remWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.m6204uintRemainderJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), i2);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m5901remxj2QHRw(byte b2, short s2) {
        return UnsignedKt.m6204uintRemainderJ1ME1BU(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(s2 & 65535));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m5902times7apg3OU(byte b2, byte b3) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) * UInt.m5946constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m5903timesVKZWuLQ(byte b2, long j2) {
        return ULong.m6025constructorimpl(ULong.m6025constructorimpl(b2 & 255) * j2);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m5904timesWZ4Q5Ns(byte b2, int i2) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) * i2);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m5905timesxj2QHRw(byte b2, short s2) {
        return UInt.m5946constructorimpl(UInt.m5946constructorimpl(b2 & 255) * UInt.m5946constructorimpl(s2 & 65535));
    }

    @InlineOnly
    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m5906toByteimpl(byte b2) {
        return b2;
    }

    @InlineOnly
    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m5907toDoubleimpl(byte b2) {
        return b2 & 255;
    }

    @InlineOnly
    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m5908toFloatimpl(byte b2) {
        return b2 & 255;
    }

    @InlineOnly
    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m5909toIntimpl(byte b2) {
        return b2 & 255;
    }

    @InlineOnly
    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m5910toLongimpl(byte b2) {
        return b2 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m5911toShortimpl(byte b2) {
        return (short) (b2 & 255);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m5912toStringimpl(byte b2) {
        return String.valueOf(b2 & 255);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m5913toUBytew2LRezQ(byte b2) {
        return b2;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m5914toUIntpVg5ArA(byte b2) {
        return UInt.m5946constructorimpl(b2 & 255);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m5915toULongsVKNKU(byte b2) {
        return ULong.m6025constructorimpl(b2 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m5916toUShortMh2AYeg(byte b2) {
        return UShort.m6133constructorimpl((short) (b2 & 255));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU  reason: not valid java name */
    private static final byte m5917xor7apg3OU(byte b2, byte b3) {
        return m5869constructorimpl((byte) (b2 ^ b3));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(m5918unboximpl() & 255, uByte.m5918unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m5875equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m5881hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m5912toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ byte m5918unboximpl() {
        return this.data;
    }
}
