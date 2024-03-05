package kotlin.time;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.SinceKotlin;
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001��¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001��¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalTime
/* loaded from: ItsOnFire.jar:kotlin/time/TestTimeSource.class */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }

    /* renamed from: overflow-LRDsOJo  reason: not valid java name */
    private final void m7437overflowLRDsOJo(long j2) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + "ns is advanced by " + ((Object) Duration.m7348toStringimpl(j2)) + '.');
    }

    /* renamed from: plusAssign-LRDsOJo  reason: not valid java name */
    public final void m7438plusAssignLRDsOJo(long j2) {
        long j3;
        long m7345toLongimpl = Duration.m7345toLongimpl(j2, getUnit());
        if (m7345toLongimpl == Long.MIN_VALUE || m7345toLongimpl == Long.MAX_VALUE) {
            double m7342toDoubleimpl = this.reading + Duration.m7342toDoubleimpl(j2, getUnit());
            if (m7342toDoubleimpl > 9.223372036854776E18d || m7342toDoubleimpl < -9.223372036854776E18d) {
                m7437overflowLRDsOJo(j2);
            }
            j3 = (long) m7342toDoubleimpl;
        } else {
            long j4 = this.reading;
            long j5 = j4 + m7345toLongimpl;
            j3 = j5;
            if ((m7345toLongimpl ^ j4) >= 0) {
                j3 = j5;
                if ((j4 ^ j5) < 0) {
                    m7437overflowLRDsOJo(j2);
                    j3 = j5;
                }
            }
        }
        this.reading = j3;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.reading;
    }
}
