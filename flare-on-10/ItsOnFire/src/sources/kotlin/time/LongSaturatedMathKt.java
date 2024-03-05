package kotlin.time;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.time.Duration;
@Metadata(d1 = {"��\u0012\n��\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H��ø\u0001��¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002ø\u0001��¢\u0006\u0004\b\f\u0010\n\u001a \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H��ø\u0001��¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"checkInfiniteSumDefined", "", "longNs", "duration", "Lkotlin/time/Duration;", "durationNs", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAdd", "saturatingAdd-pTJri5U", "(JJ)J", "saturatingAddInHalves", "saturatingAddInHalves-pTJri5U", "saturatingDiff", "valueNs", "originNs", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/time/LongSaturatedMathKt.class */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4  reason: not valid java name */
    private static final long m7430checkInfiniteSumDefinedPjuGub4(long j2, long j3, long j4) {
        if (!Duration.m7331isInfiniteimpl(j3) || (j2 ^ j4) >= 0) {
            return j2;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* renamed from: saturatingAdd-pTJri5U  reason: not valid java name */
    public static final long m7431saturatingAddpTJri5U(long j2, long j3) {
        long m7319getInWholeNanosecondsimpl = Duration.m7319getInWholeNanosecondsimpl(j3);
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            return m7430checkInfiniteSumDefinedPjuGub4(j2, j3, m7319getInWholeNanosecondsimpl);
        }
        if ((1 | (m7319getInWholeNanosecondsimpl - 1)) == Long.MAX_VALUE) {
            return m7432saturatingAddInHalvespTJri5U(j2, j3);
        }
        long j4 = j2 + m7319getInWholeNanosecondsimpl;
        if (((j2 ^ j4) & (m7319getInWholeNanosecondsimpl ^ j4)) < 0) {
            long j5 = Long.MAX_VALUE;
            if (j2 < 0) {
                j5 = Long.MIN_VALUE;
            }
            return j5;
        }
        return j4;
    }

    /* renamed from: saturatingAddInHalves-pTJri5U  reason: not valid java name */
    private static final long m7432saturatingAddInHalvespTJri5U(long j2, long j3) {
        long m7302divUwyO8pc = Duration.m7302divUwyO8pc(j3, 2);
        return ((Duration.m7319getInWholeNanosecondsimpl(m7302divUwyO8pc) - 1) | 1) == Long.MAX_VALUE ? (long) (j2 + Duration.m7342toDoubleimpl(j3, DurationUnit.NANOSECONDS)) : m7431saturatingAddpTJri5U(m7431saturatingAddpTJri5U(j2, m7302divUwyO8pc), m7302divUwyO8pc);
    }

    public static final long saturatingDiff(long j2, long j3) {
        if ((1 | (j3 - 1)) == Long.MAX_VALUE) {
            return Duration.m7351unaryMinusUwyO8pc(DurationKt.toDuration(j3, DurationUnit.DAYS));
        }
        long j4 = j2 - j3;
        if (((j4 ^ j2) & (j4 ^ j3)) >= 0) {
            Duration.Companion companion = Duration.Companion;
            return DurationKt.toDuration(j4, DurationUnit.NANOSECONDS);
        }
        long j5 = (long) DurationKt.NANOS_IN_MILLIS;
        long j6 = j2 / j5;
        long j7 = j3 / j5;
        Duration.Companion companion2 = Duration.Companion;
        return Duration.m7335plusLRDsOJo(DurationKt.toDuration(j6 - j7, DurationUnit.MILLISECONDS), DurationKt.toDuration((j2 % j5) - (j3 % j5), DurationUnit.NANOSECONDS));
    }
}
