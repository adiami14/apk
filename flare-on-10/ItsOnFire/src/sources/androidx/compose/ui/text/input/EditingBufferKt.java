package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
@Metadata(d1 = {"��\n\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/EditingBufferKt.class */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M  reason: not valid java name */
    public static final long m4554updateRangeAfterDeletepWDy79M(long j2, long j3) {
        int m4473getMinimpl = TextRange.m4473getMinimpl(j2);
        int m4472getMaximpl = TextRange.m4472getMaximpl(j2);
        if (TextRange.m4477intersects5zctL8(j3, j2)) {
            if (TextRange.m4465contains5zctL8(j3, j2)) {
                m4473getMinimpl = TextRange.m4473getMinimpl(j3);
                m4472getMaximpl = m4473getMinimpl;
            } else {
                if (!TextRange.m4465contains5zctL8(j2, j3)) {
                    if (TextRange.m4466containsimpl(j3, m4473getMinimpl)) {
                        m4473getMinimpl = TextRange.m4473getMinimpl(j3);
                    } else {
                        m4472getMaximpl = TextRange.m4473getMinimpl(j3);
                    }
                }
                m4472getMaximpl -= TextRange.m4471getLengthimpl(j3);
            }
        } else if (m4472getMaximpl > TextRange.m4473getMinimpl(j3)) {
            m4473getMinimpl -= TextRange.m4471getLengthimpl(j3);
            m4472getMaximpl -= TextRange.m4471getLengthimpl(j3);
        }
        return TextRangeKt.TextRange(m4473getMinimpl, m4472getMaximpl);
    }
}
