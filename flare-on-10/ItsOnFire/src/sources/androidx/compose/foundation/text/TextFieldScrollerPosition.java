package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Stable
@Metadata(d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018�� 02\u00020\u0001:\u00010B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0002J\u001b\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001dø\u0001��ø\u0001\u0001¢\u0006\u0004\b+\u0010,J&\u0010-\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010/\u001a\u00020(R+\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n��R%\u0010\u001c\u001a\u00020\u001dX\u0086\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "()V", "initialOrientation", "Landroidx/compose/foundation/gestures/Orientation;", "initial", "", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "<set-?>", "maximum", "getMaximum", "()F", "setMaximum", "(F)V", "maximum$delegate", "Landroidx/compose/runtime/MutableState;", "offset", "getOffset", "setOffset", "offset$delegate", "orientation", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "orientation$delegate", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "Landroidx/compose/ui/text/TextRange;", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "J", "coerceOffset", "", "cursorStart", "cursorEnd", "containerSize", "", "getOffsetToFollow", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "update", "cursorRect", "textFieldSize", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldScrollerPosition.class */
public final class TextFieldScrollerPosition {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new Function2<SaverScope, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final List<Object> invoke(@NotNull SaverScope listSaver, @NotNull TextFieldScrollerPosition it) {
            List<Object> listOf;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            float offset = it.getOffset();
            boolean z = false;
            if (it.getOrientation() == Orientation.Vertical) {
                z = true;
            }
            listOf = CollectionsKt__CollectionsKt.listOf(Float.valueOf(offset), Boolean.valueOf(z));
            return listOf;
        }
    }, new Function1<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextFieldScrollerPosition invoke(@NotNull List<? extends Object> restored) {
            Intrinsics.checkNotNullParameter(restored, "restored");
            return new TextFieldScrollerPosition(((Boolean) restored.get(1)).booleanValue() ? Orientation.Vertical : Orientation.Horizontal, ((Float) restored.get(0)).floatValue());
        }
    });
    @NotNull
    private final MutableState maximum$delegate;
    @NotNull
    private final MutableState offset$delegate;
    @NotNull
    private final MutableState orientation$delegate;
    @NotNull
    private Rect previousCursorRect;
    private long previousSelection;

    @Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldScrollerPosition$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }

    public TextFieldScrollerPosition(@NotNull Orientation initialOrientation, float f2) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        Intrinsics.checkNotNullParameter(initialOrientation, "initialOrientation");
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f2), null, 2, null);
        this.offset$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.maximum$delegate = mutableStateOf$default2;
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m4480getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(initialOrientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i2 & 2) != 0 ? 0.0f : f2);
    }

    private final void coerceOffset(float f2, float f3, int i2) {
        float offset = getOffset();
        float f4 = i2 + offset;
        if (f2 < offset) {
            setOffset(getOffset() - (offset - f2));
        } else if (f3 > f4) {
            setOffset(getOffset() + (f3 - f4));
        }
    }

    private final void setMaximum(float f2) {
        this.maximum$delegate.setValue(Float.valueOf(f2));
    }

    public final float getMaximum() {
        return ((Number) this.maximum$delegate.getValue()).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.offset$delegate.getValue()).floatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8  reason: not valid java name */
    public final int m1012getOffsetToFollow5zctL8(long j2) {
        return TextRange.m4475getStartimpl(j2) != TextRange.m4475getStartimpl(m1013getPreviousSelectiond9O1mEE()) ? TextRange.m4475getStartimpl(j2) : TextRange.m4470getEndimpl(j2) != TextRange.m4470getEndimpl(m1013getPreviousSelectiond9O1mEE()) ? TextRange.m4470getEndimpl(j2) : TextRange.m4473getMinimpl(j2);
    }

    @NotNull
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE  reason: not valid java name */
    public final long m1013getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final void setOffset(float f2) {
        this.offset$delegate.setValue(Float.valueOf(f2));
    }

    public final void setOrientation(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8  reason: not valid java name */
    public final void m1014setPreviousSelection5zctL8(long j2) {
        this.previousSelection = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        if ((r7.getTop() == r5.previousCursorRect.getTop()) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.Orientation r6, @org.jetbrains.annotations.NotNull androidx.compose.ui.geometry.Rect r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r1 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            java.lang.String r1 = "cursorRect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r9
            r1 = r8
            int r0 = r0 - r1
            float r0 = (float) r0
            r10 = r0
            r0 = r5
            r1 = r10
            r0.setMaximum(r1)
            r0 = r7
            float r0 = r0.getLeft()
            r11 = r0
            r0 = r5
            androidx.compose.ui.geometry.Rect r0 = r0.previousCursorRect
            float r0 = r0.getLeft()
            r12 = r0
            r0 = 1
            r13 = r0
            r0 = r11
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L39
            r0 = 1
            r9 = r0
            goto L3c
        L39:
            r0 = 0
            r9 = r0
        L3c:
            r0 = r9
            if (r0 == 0) goto L5e
            r0 = r7
            float r0 = r0.getTop()
            r1 = r5
            androidx.compose.ui.geometry.Rect r1 = r1.previousCursorRect
            float r1 = r1.getTop()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L56
            r0 = 1
            r9 = r0
            goto L59
        L56:
            r0 = 0
            r9 = r0
        L59:
            r0 = r9
            if (r0 != 0) goto La5
        L5e:
            r0 = r6
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r0 != r1) goto L6c
            r0 = r13
            r9 = r0
            goto L6f
        L6c:
            r0 = 0
            r9 = r0
        L6f:
            r0 = r9
            if (r0 == 0) goto L7d
            r0 = r7
            float r0 = r0.getTop()
            r11 = r0
            goto L83
        L7d:
            r0 = r7
            float r0 = r0.getLeft()
            r11 = r0
        L83:
            r0 = r9
            if (r0 == 0) goto L91
            r0 = r7
            float r0 = r0.getBottom()
            r12 = r0
            goto L97
        L91:
            r0 = r7
            float r0 = r0.getRight()
            r12 = r0
        L97:
            r0 = r5
            r1 = r11
            r2 = r12
            r3 = r8
            r0.coerceOffset(r1, r2, r3)
            r0 = r5
            r1 = r7
            r0.previousCursorRect = r1
        La5:
            r0 = r5
            r1 = r5
            float r1 = r1.getOffset()
            r2 = 0
            r3 = r10
            float r1 = kotlin.ranges.RangesKt.coerceIn(r1, r2, r3)
            r0.setOffset(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollerPosition.update(androidx.compose.foundation.gestures.Orientation, androidx.compose.ui.geometry.Rect, int, int):void");
    }
}
