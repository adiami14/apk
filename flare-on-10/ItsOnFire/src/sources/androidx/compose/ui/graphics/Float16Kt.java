package androidx.compose.ui.graphics;

import kotlin.Metadata;
@Metadata(d1 = {"��\n\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"max", "Landroidx/compose/ui/graphics/Float16;", "x", "y", "max-AoSsdG0", "(SS)S", "min", "min-AoSsdG0", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Float16Kt.class */
public final class Float16Kt {
    /* renamed from: max-AoSsdG0  reason: not valid java name */
    public static final short m2549maxAoSsdG0(short s2, short s3) {
        if (Float16.m2522isNaNimpl(s2) || Float16.m2522isNaNimpl(s3)) {
            return Float16.Companion.m2544getNaNslo4al4();
        }
        if (Float16.m2509compareTo41bOqos(s2, s3) < 0) {
            s2 = s3;
        }
        return s2;
    }

    /* renamed from: min-AoSsdG0  reason: not valid java name */
    public static final short m2550minAoSsdG0(short s2, short s3) {
        if (Float16.m2522isNaNimpl(s2) || Float16.m2522isNaNimpl(s3)) {
            return Float16.Companion.m2544getNaNslo4al4();
        }
        if (Float16.m2509compareTo41bOqos(s2, s3) > 0) {
            s2 = s3;
        }
        return s2;
    }
}
