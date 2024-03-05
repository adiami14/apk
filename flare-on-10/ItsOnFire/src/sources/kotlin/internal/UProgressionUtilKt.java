package kotlin.internal;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;
@Metadata(d1 = {"�� \n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n��\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010��\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001��¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001��¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001��¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/internal/UProgressionUtilKt.class */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA  reason: not valid java name */
    private static final int m7114differenceModuloWZ9TVnA(int i2, int i3, int i4) {
        int m6204uintRemainderJ1ME1BU = UnsignedKt.m6204uintRemainderJ1ME1BU(i2, i4);
        int m6204uintRemainderJ1ME1BU2 = UnsignedKt.m6204uintRemainderJ1ME1BU(i3, i4);
        int uintCompare = UnsignedKt.uintCompare(m6204uintRemainderJ1ME1BU, m6204uintRemainderJ1ME1BU2);
        int m5946constructorimpl = UInt.m5946constructorimpl(m6204uintRemainderJ1ME1BU - m6204uintRemainderJ1ME1BU2);
        if (uintCompare < 0) {
            m5946constructorimpl = UInt.m5946constructorimpl(m5946constructorimpl + i4);
        }
        return m5946constructorimpl;
    }

    /* renamed from: differenceModulo-sambcqE  reason: not valid java name */
    private static final long m7115differenceModulosambcqE(long j2, long j3, long j4) {
        long m6206ulongRemaindereb3DHEI = UnsignedKt.m6206ulongRemaindereb3DHEI(j2, j4);
        long m6206ulongRemaindereb3DHEI2 = UnsignedKt.m6206ulongRemaindereb3DHEI(j3, j4);
        int ulongCompare = UnsignedKt.ulongCompare(m6206ulongRemaindereb3DHEI, m6206ulongRemaindereb3DHEI2);
        long m6025constructorimpl = ULong.m6025constructorimpl(m6206ulongRemaindereb3DHEI - m6206ulongRemaindereb3DHEI2);
        if (ulongCompare < 0) {
            m6025constructorimpl = ULong.m6025constructorimpl(m6025constructorimpl + j4);
        }
        return m6025constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g  reason: not valid java name */
    public static final long m7116getProgressionLastElement7ftBX0g(long j2, long j3, long j4) {
        long m7115differenceModulosambcqE;
        int i2 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        if (i2 > 0) {
            if (UnsignedKt.ulongCompare(j2, j3) < 0) {
                m7115differenceModulosambcqE = j3 - m7115differenceModulosambcqE(j3, j2, ULong.m6025constructorimpl(j4));
                j3 = ULong.m6025constructorimpl(m7115differenceModulosambcqE);
            }
            return j3;
        } else if (i2 < 0) {
            if (UnsignedKt.ulongCompare(j2, j3) > 0) {
                m7115differenceModulosambcqE = j3 + m7115differenceModulosambcqE(j2, j3, ULong.m6025constructorimpl(-j4));
                j3 = ULong.m6025constructorimpl(m7115differenceModulosambcqE);
            }
            return j3;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs  reason: not valid java name */
    public static final int m7117getProgressionLastElementNkh28Cs(int i2, int i3, int i4) {
        int m7114differenceModuloWZ9TVnA;
        if (i4 > 0) {
            if (UnsignedKt.uintCompare(i2, i3) < 0) {
                m7114differenceModuloWZ9TVnA = i3 - m7114differenceModuloWZ9TVnA(i3, i2, UInt.m5946constructorimpl(i4));
                i3 = UInt.m5946constructorimpl(m7114differenceModuloWZ9TVnA);
            }
            return i3;
        } else if (i4 < 0) {
            if (UnsignedKt.uintCompare(i2, i3) > 0) {
                m7114differenceModuloWZ9TVnA = i3 + m7114differenceModuloWZ9TVnA(i2, i3, UInt.m5946constructorimpl(-i4));
                i3 = UInt.m5946constructorimpl(m7114differenceModuloWZ9TVnA);
            }
            return i3;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
