package androidx.compose.ui.hapticfeedback;

import androidx.appcompat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;", "", "()V", "LongPress", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getLongPress-5zf0vsI", "()I", "I", "TextHandleMove", "getTextHandleMove-5zf0vsI", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType.class */
public final class PlatformHapticFeedbackType {
    @NotNull
    public static final PlatformHapticFeedbackType INSTANCE = new PlatformHapticFeedbackType();
    private static final int LongPress = HapticFeedbackType.m3048constructorimpl(0);
    private static final int TextHandleMove = HapticFeedbackType.m3048constructorimpl(9);

    private PlatformHapticFeedbackType() {
    }

    /* renamed from: getLongPress-5zf0vsI  reason: not valid java name */
    public final int m3057getLongPress5zf0vsI() {
        return LongPress;
    }

    /* renamed from: getTextHandleMove-5zf0vsI  reason: not valid java name */
    public final int m3058getTextHandleMove5zf0vsI() {
        return TextHandleMove;
    }
}
