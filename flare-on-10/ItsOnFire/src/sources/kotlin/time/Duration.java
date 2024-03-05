package kotlin.time;

import androidx.appcompat.R;
import j.x1;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SinceKotlin(version = "1.6")
@Metadata(d1 = {"��n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n��\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010��\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018�� ¤\u00012\b\u0012\u0004\u0012\u00020��0\u0001:\u0002¤\u0001B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010D\u001a\u00020��2\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020��H\u0096\u0002ø\u0001��¢\u0006\u0004\bK\u0010LJ\u001e\u0010M\u001a\u00020��2\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\bO\u0010PJ\u001e\u0010M\u001a\u00020��2\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\bO\u0010QJ\u001b\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020��H\u0086\u0002ø\u0001��¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u001b\u0010h\u001a\u00020��2\u0006\u0010J\u001a\u00020��H\u0086\u0002ø\u0001��¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020��2\u0006\u0010J\u001a\u00020��H\u0086\u0002ø\u0001��¢\u0006\u0004\bl\u0010jJ\u001e\u0010m\u001a\u00020��2\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\bn\u0010PJ\u001e\u0010m\u001a\u00020��2\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b��\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b��\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b��\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b��\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u0018\u0010\u0098\u0001\u001a\u00020��H\u0086\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0005\b\u0099\u0001\u0010\u0005JK\u0010\u009a\u0001\u001a\u00030\u009b\u0001*\b0\u009c\u0001j\u0003`\u009d\u00012\u0007\u0010\u009e\u0001\u001a\u00020\t2\u0007\u0010\u009f\u0001\u001a\u00020\t2\u0007\u0010 \u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010¡\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010\u0006\u001a\u00020��8Fø\u0001��ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006¥\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: ItsOnFire.jar:kotlin/time/Duration.class */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m7299constructorimpl(0);
    private static final long INFINITE = DurationKt.access$durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);

    @Metadata(d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b/\u0010\u0011J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b/\u0010\u0014J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b/\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b0\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b0\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b0\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b1\u0010\u0011J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b1\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b1\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b2\u0010\u0011J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b2\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b2\u0010\u0017J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b3\u0010\u0011J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b3\u0010\u0014J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b3\u0010\u0017J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b4\u0010\u0011J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b4\u0010\u0014J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b4\u0010\u0017J\u001b\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001��¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001��¢\u0006\u0004\b:\u00108J\u001b\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001��¢\u0006\u0002\b<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001��¢\u0006\u0002\b>J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b?\u0010\u0011J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b?\u0010\u0014J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001��¢\u0006\u0004\b?\u0010\u0017R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001��ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001��ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R%\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R%\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R%\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R%\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R%\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R%\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R%\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R%\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R%\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R%\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R%\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R%\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R%\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001��ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/time/Duration$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc  reason: not valid java name */
        private final long m7354getDaysUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc  reason: not valid java name */
        private final long m7355getDaysUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc  reason: not valid java name */
        private final long m7356getDaysUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7357getDaysUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7358getDaysUwyO8pc$annotations(int i2) {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7359getDaysUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getHours-UwyO8pc  reason: not valid java name */
        private final long m7360getHoursUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc  reason: not valid java name */
        private final long m7361getHoursUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc  reason: not valid java name */
        private final long m7362getHoursUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7363getHoursUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7364getHoursUwyO8pc$annotations(int i2) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7365getHoursUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getMicroseconds-UwyO8pc  reason: not valid java name */
        private final long m7366getMicrosecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc  reason: not valid java name */
        private final long m7367getMicrosecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc  reason: not valid java name */
        private final long m7368getMicrosecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7369getMicrosecondsUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7370getMicrosecondsUwyO8pc$annotations(int i2) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7371getMicrosecondsUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getMilliseconds-UwyO8pc  reason: not valid java name */
        private final long m7372getMillisecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc  reason: not valid java name */
        private final long m7373getMillisecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc  reason: not valid java name */
        private final long m7374getMillisecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7375getMillisecondsUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7376getMillisecondsUwyO8pc$annotations(int i2) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7377getMillisecondsUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getMinutes-UwyO8pc  reason: not valid java name */
        private final long m7378getMinutesUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc  reason: not valid java name */
        private final long m7379getMinutesUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc  reason: not valid java name */
        private final long m7380getMinutesUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7381getMinutesUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7382getMinutesUwyO8pc$annotations(int i2) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7383getMinutesUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getNanoseconds-UwyO8pc  reason: not valid java name */
        private final long m7384getNanosecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc  reason: not valid java name */
        private final long m7385getNanosecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc  reason: not valid java name */
        private final long m7386getNanosecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7387getNanosecondsUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7388getNanosecondsUwyO8pc$annotations(int i2) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7389getNanosecondsUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getSeconds-UwyO8pc  reason: not valid java name */
        private final long m7390getSecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc  reason: not valid java name */
        private final long m7391getSecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc  reason: not valid java name */
        private final long m7392getSecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7393getSecondsUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7394getSecondsUwyO8pc$annotations(int i2) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m7395getSecondsUwyO8pc$annotations(long j2) {
        }

        @ExperimentalTime
        public final double convert(double d2, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d2, sourceUnit, targetUnit);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m7396daysUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m7397daysUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m7398daysUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc  reason: not valid java name */
        public final long m7399getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib  reason: not valid java name */
        public final long m7400getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc  reason: not valid java name */
        public final long m7401getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m7402hoursUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m7403hoursUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m7404hoursUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m7405microsecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m7406microsecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m7407microsecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m7408millisecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m7409millisecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m7410millisecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m7411minutesUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m7412minutesUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m7413minutesUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m7414nanosecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m7415nanosecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m7416nanosecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc  reason: not valid java name */
        public final long m7417parseUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, false);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e2);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc  reason: not valid java name */
        public final long m7418parseIsoStringUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, true);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e2);
            }
        }

        @Nullable
        /* renamed from: parseIsoStringOrNull-FghU774  reason: not valid java name */
        public final Duration m7419parseIsoStringOrNullFghU774(@NotNull String value) {
            Duration duration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                duration = Duration.m7297boximpl(DurationKt.access$parseDuration(value, true));
            } catch (IllegalArgumentException e2) {
                duration = null;
            }
            return duration;
        }

        @Nullable
        /* renamed from: parseOrNull-FghU774  reason: not valid java name */
        public final Duration m7420parseOrNullFghU774(@NotNull String value) {
            Duration duration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                duration = Duration.m7297boximpl(DurationKt.access$parseDuration(value, false));
            } catch (IllegalArgumentException e2) {
                duration = null;
            }
            return duration;
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m7421secondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.SECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m7422secondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.SECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m7423secondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.SECONDS);
        }
    }

    private /* synthetic */ Duration(long j2) {
        this.rawValue = j2;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc  reason: not valid java name */
    private static final long m7295addValuesMixedRangesUwyO8pc(long j2, long j3, long j4) {
        long coerceIn;
        long access$durationOfMillis;
        long access$nanosToMillis = DurationKt.access$nanosToMillis(j4);
        long j5 = j3 + access$nanosToMillis;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(j5)) {
            access$durationOfMillis = DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(j5) + (j4 - DurationKt.access$millisToNanos(access$nanosToMillis)));
        } else {
            coerceIn = RangesKt___RangesKt.coerceIn(j5, -4611686018427387903L, 4611686018427387903L);
            access$durationOfMillis = DurationKt.access$durationOfMillis(coerceIn);
        }
        return access$durationOfMillis;
    }

    /* renamed from: appendFractional-impl  reason: not valid java name */
    private static final void m7296appendFractionalimpl(long j2, StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        String padStart;
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i3), i4, '0');
            int length = padStart.length() - 1;
            int i5 = -1;
            if (length >= 0) {
                int i6 = length;
                while (true) {
                    i5 = i6;
                    int i7 = i5 - 1;
                    if (padStart.charAt(i5) != '0') {
                        break;
                    } else if (i7 < 0) {
                        i5 = -1;
                        break;
                    } else {
                        i6 = i7;
                    }
                }
            }
            int i8 = i5 + 1;
            if (z || i8 >= 3) {
                i8 = ((i8 + 2) / 3) * 3;
            }
            sb.append((CharSequence) padStart, 0, i8);
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        }
        sb.append(str);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Duration m7297boximpl(long j2) {
        return new Duration(j2);
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public static int m7298compareToLRDsOJo(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return Intrinsics.compare(j2, j3);
        }
        int i2 = (((int) j2) & 1) - (((int) j3) & 1);
        int i3 = i2;
        if (m7332isNegativeimpl(j2)) {
            i3 = -i2;
        }
        return i3;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m7299constructorimpl(long j2) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m7330isInNanosimpl(j2)) {
                if (!new LongRange(-4611686018426999999L, DurationKt.MAX_NANOS).contains(m7326getValueimpl(j2))) {
                    throw new AssertionError(m7326getValueimpl(j2) + " ns is out of nanoseconds range");
                }
            } else if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(m7326getValueimpl(j2))) {
                throw new AssertionError(m7326getValueimpl(j2) + " ms is out of milliseconds range");
            } else if (new LongRange(-4611686018426L, 4611686018426L).contains(m7326getValueimpl(j2))) {
                throw new AssertionError(m7326getValueimpl(j2) + " ms is denormalized");
            }
        }
        return j2;
    }

    /* renamed from: div-LRDsOJo  reason: not valid java name */
    public static final double m7300divLRDsOJo(long j2, long j3) {
        Comparable maxOf;
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(m7324getStorageUnitimpl(j2), m7324getStorageUnitimpl(j3));
        DurationUnit durationUnit = (DurationUnit) maxOf;
        return m7342toDoubleimpl(j2, durationUnit) / m7342toDoubleimpl(j3, durationUnit);
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final long m7301divUwyO8pc(long j2, double d2) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(d2);
        if (!(((double) roundToInt) == d2) || roundToInt == 0) {
            DurationUnit m7324getStorageUnitimpl = m7324getStorageUnitimpl(j2);
            return DurationKt.toDuration(m7342toDoubleimpl(j2, m7324getStorageUnitimpl) / d2, m7324getStorageUnitimpl);
        }
        return m7302divUwyO8pc(j2, roundToInt);
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final long m7302divUwyO8pc(long j2, int i2) {
        int sign;
        long j3;
        if (i2 == 0) {
            if (m7333isPositiveimpl(j2)) {
                j3 = INFINITE;
            } else if (!m7332isNegativeimpl(j2)) {
                throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
            } else {
                j3 = NEG_INFINITE;
            }
            return j3;
        } else if (m7330isInNanosimpl(j2)) {
            return DurationKt.access$durationOfNanos(m7326getValueimpl(j2) / i2);
        } else {
            if (m7331isInfiniteimpl(j2)) {
                sign = MathKt__MathJVMKt.getSign(i2);
                return m7337timesUwyO8pc(j2, sign);
            }
            long j4 = i2;
            long m7326getValueimpl = m7326getValueimpl(j2) / j4;
            if (new LongRange(-4611686018426L, 4611686018426L).contains(m7326getValueimpl)) {
                return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(m7326getValueimpl) + (DurationKt.access$millisToNanos(m7326getValueimpl(j2) - (m7326getValueimpl * j4)) / j4));
            }
            return DurationKt.access$durationOfMillis(m7326getValueimpl);
        }
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m7303equalsimpl(long j2, Object obj) {
        return (obj instanceof Duration) && j2 == ((Duration) obj).m7353unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m7304equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc  reason: not valid java name */
    public static final long m7305getAbsoluteValueUwyO8pc(long j2) {
        long j3 = j2;
        if (m7332isNegativeimpl(j2)) {
            j3 = m7351unaryMinusUwyO8pc(j2);
        }
        return j3;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl  reason: not valid java name */
    public static final int m7306getHoursComponentimpl(long j2) {
        return m7331isInfiniteimpl(j2) ? 0 : (int) (m7315getInWholeHoursimpl(j2) % 24);
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    /* renamed from: getInDays-impl  reason: not valid java name */
    public static final double m7307getInDaysimpl(long j2) {
        return m7342toDoubleimpl(j2, DurationUnit.DAYS);
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    /* renamed from: getInHours-impl  reason: not valid java name */
    public static final double m7308getInHoursimpl(long j2) {
        return m7342toDoubleimpl(j2, DurationUnit.HOURS);
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    /* renamed from: getInMicroseconds-impl  reason: not valid java name */
    public static final double m7309getInMicrosecondsimpl(long j2) {
        return m7342toDoubleimpl(j2, DurationUnit.MICROSECONDS);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    /* renamed from: getInMilliseconds-impl  reason: not valid java name */
    public static final double m7310getInMillisecondsimpl(long j2) {
        return m7342toDoubleimpl(j2, DurationUnit.MILLISECONDS);
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    /* renamed from: getInMinutes-impl  reason: not valid java name */
    public static final double m7311getInMinutesimpl(long j2) {
        return m7342toDoubleimpl(j2, DurationUnit.MINUTES);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    /* renamed from: getInNanoseconds-impl  reason: not valid java name */
    public static final double m7312getInNanosecondsimpl(long j2) {
        return m7342toDoubleimpl(j2, DurationUnit.NANOSECONDS);
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* renamed from: getInSeconds-impl  reason: not valid java name */
    public static final double m7313getInSecondsimpl(long j2) {
        return m7342toDoubleimpl(j2, DurationUnit.SECONDS);
    }

    /* renamed from: getInWholeDays-impl  reason: not valid java name */
    public static final long m7314getInWholeDaysimpl(long j2) {
        return m7345toLongimpl(j2, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl  reason: not valid java name */
    public static final long m7315getInWholeHoursimpl(long j2) {
        return m7345toLongimpl(j2, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl  reason: not valid java name */
    public static final long m7316getInWholeMicrosecondsimpl(long j2) {
        return m7345toLongimpl(j2, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl  reason: not valid java name */
    public static final long m7317getInWholeMillisecondsimpl(long j2) {
        return (m7329isInMillisimpl(j2) && m7328isFiniteimpl(j2)) ? m7326getValueimpl(j2) : m7345toLongimpl(j2, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl  reason: not valid java name */
    public static final long m7318getInWholeMinutesimpl(long j2) {
        return m7345toLongimpl(j2, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl  reason: not valid java name */
    public static final long m7319getInWholeNanosecondsimpl(long j2) {
        long m7326getValueimpl = m7326getValueimpl(j2);
        return m7330isInNanosimpl(j2) ? m7326getValueimpl : m7326getValueimpl > x1.f614f ? Long.MAX_VALUE : m7326getValueimpl < -9223372036854L ? Long.MIN_VALUE : DurationKt.access$millisToNanos(m7326getValueimpl);
    }

    /* renamed from: getInWholeSeconds-impl  reason: not valid java name */
    public static final long m7320getInWholeSecondsimpl(long j2) {
        return m7345toLongimpl(j2, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl  reason: not valid java name */
    public static final int m7321getMinutesComponentimpl(long j2) {
        return m7331isInfiniteimpl(j2) ? 0 : (int) (m7318getInWholeMinutesimpl(j2) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl  reason: not valid java name */
    public static final int m7322getNanosecondsComponentimpl(long j2) {
        int access$millisToNanos;
        if (m7331isInfiniteimpl(j2)) {
            access$millisToNanos = 0;
        } else {
            boolean m7329isInMillisimpl = m7329isInMillisimpl(j2);
            long m7326getValueimpl = m7326getValueimpl(j2);
            access$millisToNanos = (int) (m7329isInMillisimpl ? DurationKt.access$millisToNanos(m7326getValueimpl % 1000) : m7326getValueimpl % 1000000000);
        }
        return access$millisToNanos;
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl  reason: not valid java name */
    public static final int m7323getSecondsComponentimpl(long j2) {
        return m7331isInfiniteimpl(j2) ? 0 : (int) (m7320getInWholeSecondsimpl(j2) % 60);
    }

    /* renamed from: getStorageUnit-impl  reason: not valid java name */
    private static final DurationUnit m7324getStorageUnitimpl(long j2) {
        return m7330isInNanosimpl(j2) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl  reason: not valid java name */
    private static final int m7325getUnitDiscriminatorimpl(long j2) {
        return ((int) j2) & 1;
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    private static final long m7326getValueimpl(long j2) {
        return j2 >> 1;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m7327hashCodeimpl(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m7328isFiniteimpl(long j2) {
        return !m7331isInfiniteimpl(j2);
    }

    /* renamed from: isInMillis-impl  reason: not valid java name */
    private static final boolean m7329isInMillisimpl(long j2) {
        boolean z = true;
        if ((((int) j2) & 1) != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: isInNanos-impl  reason: not valid java name */
    private static final boolean m7330isInNanosimpl(long j2) {
        boolean z = true;
        if ((((int) j2) & 1) != 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m7331isInfiniteimpl(long j2) {
        return j2 == INFINITE || j2 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl  reason: not valid java name */
    public static final boolean m7332isNegativeimpl(long j2) {
        return j2 < 0;
    }

    /* renamed from: isPositive-impl  reason: not valid java name */
    public static final boolean m7333isPositiveimpl(long j2) {
        return j2 > 0;
    }

    /* renamed from: minus-LRDsOJo  reason: not valid java name */
    public static final long m7334minusLRDsOJo(long j2, long j3) {
        return m7335plusLRDsOJo(j2, m7351unaryMinusUwyO8pc(j3));
    }

    /* renamed from: plus-LRDsOJo  reason: not valid java name */
    public static final long m7335plusLRDsOJo(long j2, long j3) {
        long m7295addValuesMixedRangesUwyO8pc;
        if (m7331isInfiniteimpl(j2)) {
            if (m7328isFiniteimpl(j3) || (j3 ^ j2) >= 0) {
                return j2;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (m7331isInfiniteimpl(j3)) {
            return j3;
        } else {
            if ((((int) j2) & 1) == (((int) j3) & 1)) {
                long m7326getValueimpl = m7326getValueimpl(j2) + m7326getValueimpl(j3);
                m7295addValuesMixedRangesUwyO8pc = m7330isInNanosimpl(j2) ? DurationKt.access$durationOfNanosNormalized(m7326getValueimpl) : DurationKt.access$durationOfMillisNormalized(m7326getValueimpl);
            } else {
                m7295addValuesMixedRangesUwyO8pc = m7329isInMillisimpl(j2) ? m7295addValuesMixedRangesUwyO8pc(j2, m7326getValueimpl(j2), m7326getValueimpl(j3)) : m7295addValuesMixedRangesUwyO8pc(j2, m7326getValueimpl(j3), m7326getValueimpl(j2));
            }
            return m7295addValuesMixedRangesUwyO8pc;
        }
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final long m7336timesUwyO8pc(long j2, double d2) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(d2);
        if (((double) roundToInt) == d2) {
            return m7337timesUwyO8pc(j2, roundToInt);
        }
        DurationUnit m7324getStorageUnitimpl = m7324getStorageUnitimpl(j2);
        return DurationKt.toDuration(m7342toDoubleimpl(j2, m7324getStorageUnitimpl) * d2, m7324getStorageUnitimpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if ((r0 * r1) > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
        if ((r0 * r1) > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
        r9 = kotlin.time.Duration.INFINITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
        r9 = kotlin.time.Duration.NEG_INFINITE;
     */
    /* renamed from: times-UwyO8pc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m7337timesUwyO8pc(long r9, int r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Duration.m7337timesUwyO8pc(long, int):long");
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m7338toComponentsimpl(long j2, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m7320getInWholeSecondsimpl(j2)), Integer.valueOf(m7322getNanosecondsComponentimpl(j2)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m7339toComponentsimpl(long j2, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m7318getInWholeMinutesimpl(j2)), Integer.valueOf(m7323getSecondsComponentimpl(j2)), Integer.valueOf(m7322getNanosecondsComponentimpl(j2)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m7340toComponentsimpl(long j2, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m7315getInWholeHoursimpl(j2)), Integer.valueOf(m7321getMinutesComponentimpl(j2)), Integer.valueOf(m7323getSecondsComponentimpl(j2)), Integer.valueOf(m7322getNanosecondsComponentimpl(j2)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m7341toComponentsimpl(long j2, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m7314getInWholeDaysimpl(j2)), Integer.valueOf(m7306getHoursComponentimpl(j2)), Integer.valueOf(m7321getMinutesComponentimpl(j2)), Integer.valueOf(m7323getSecondsComponentimpl(j2)), Integer.valueOf(m7322getNanosecondsComponentimpl(j2)));
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m7342toDoubleimpl(long j2, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return j2 == INFINITE ? Double.POSITIVE_INFINITY : j2 == NEG_INFINITE ? Double.NEGATIVE_INFINITY : DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m7326getValueimpl(j2), m7324getStorageUnitimpl(j2), unit);
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m7343toIntimpl(long j2, @NotNull DurationUnit unit) {
        long coerceIn;
        Intrinsics.checkNotNullParameter(unit, "unit");
        coerceIn = RangesKt___RangesKt.coerceIn(m7345toLongimpl(j2, unit), -2147483648L, 2147483647L);
        return (int) coerceIn;
    }

    @NotNull
    /* renamed from: toIsoString-impl  reason: not valid java name */
    public static final String m7344toIsoStringimpl(long j2) {
        StringBuilder sb = new StringBuilder();
        if (m7332isNegativeimpl(j2)) {
            sb.append('-');
        }
        sb.append("PT");
        long m7305getAbsoluteValueUwyO8pc = m7305getAbsoluteValueUwyO8pc(j2);
        long m7315getInWholeHoursimpl = m7315getInWholeHoursimpl(m7305getAbsoluteValueUwyO8pc);
        int m7321getMinutesComponentimpl = m7321getMinutesComponentimpl(m7305getAbsoluteValueUwyO8pc);
        int m7323getSecondsComponentimpl = m7323getSecondsComponentimpl(m7305getAbsoluteValueUwyO8pc);
        int m7322getNanosecondsComponentimpl = m7322getNanosecondsComponentimpl(m7305getAbsoluteValueUwyO8pc);
        if (m7331isInfiniteimpl(j2)) {
            m7315getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = m7315getInWholeHoursimpl != 0;
        boolean z2 = (m7323getSecondsComponentimpl == 0 && m7322getNanosecondsComponentimpl == 0) ? false : true;
        boolean z3 = true;
        if (m7321getMinutesComponentimpl == 0) {
            z3 = z2 && z;
        }
        if (z) {
            sb.append(m7315getInWholeHoursimpl);
            sb.append('H');
        }
        if (z3) {
            sb.append(m7321getMinutesComponentimpl);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            m7296appendFractionalimpl(j2, sb, m7323getSecondsComponentimpl, m7322getNanosecondsComponentimpl, 9, "S", true);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m7345toLongimpl(long j2, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return j2 == INFINITE ? Long.MAX_VALUE : j2 == NEG_INFINITE ? Long.MIN_VALUE : DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m7326getValueimpl(j2), m7324getStorageUnitimpl(j2), unit);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @ExperimentalTime
    /* renamed from: toLongMilliseconds-impl  reason: not valid java name */
    public static final long m7346toLongMillisecondsimpl(long j2) {
        return m7317getInWholeMillisecondsimpl(j2);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @ExperimentalTime
    /* renamed from: toLongNanoseconds-impl  reason: not valid java name */
    public static final long m7347toLongNanosecondsimpl(long j2) {
        return m7319getInWholeNanosecondsimpl(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
        if (r26 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
        if (r23 != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0203  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m7348toStringimpl(long r9) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Duration.m7348toStringimpl(long):java.lang.String");
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static final String m7349toStringimpl(long j2, @NotNull DurationUnit unit, int i2) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i2).toString());
        }
        double m7342toDoubleimpl = m7342toDoubleimpl(j2, unit);
        if (Double.isInfinite(m7342toDoubleimpl)) {
            return String.valueOf(m7342toDoubleimpl);
        }
        StringBuilder sb = new StringBuilder();
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(i2, 12);
        sb.append(DurationJvmKt.formatToExactDecimals(m7342toDoubleimpl, coerceAtMost));
        sb.append(DurationUnitKt__DurationUnitKt.shortName(unit));
        return sb.toString();
    }

    /* renamed from: toString-impl$default  reason: not valid java name */
    public static /* synthetic */ String m7350toStringimpl$default(long j2, DurationUnit durationUnit, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m7349toStringimpl(j2, durationUnit, i2);
    }

    /* renamed from: unaryMinus-UwyO8pc  reason: not valid java name */
    public static final long m7351unaryMinusUwyO8pc(long j2) {
        return DurationKt.access$durationOf(-m7326getValueimpl(j2), ((int) j2) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m7352compareToLRDsOJo(duration.m7353unboximpl());
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public int m7352compareToLRDsOJo(long j2) {
        return m7298compareToLRDsOJo(this.rawValue, j2);
    }

    public boolean equals(Object obj) {
        return m7303equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m7327hashCodeimpl(this.rawValue);
    }

    @NotNull
    public String toString() {
        return m7348toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m7353unboximpl() {
        return this.rawValue;
    }
}
