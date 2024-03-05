package androidx.compose.foundation;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��$\n��\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u001a\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0005*\u00020\rH\u0002\"\u0014\u0010��\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"TapIndicationDelay", "", "getTapIndicationDelay", "()J", "isClick", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isComposeRootInScrollableContainer", "Lkotlin/Function0;", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "isInScrollableViewGroup", "Landroid/view/View;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/Clickable_androidKt.class */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if ((r0 == 23 || r0 == 66 || r0 == 160) != false) goto L12;
     */
    /* renamed from: isClick-ZmokQxo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m384isClickZmokQxo(@org.jetbrains.annotations.NotNull android.view.KeyEvent r3) {
        /*
            r0 = r3
            java.lang.String r1 = "$this$isClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r3
            int r0 = androidx.compose.ui.input.key.KeyEvent_androidKt.m3673getTypeZmokQxo(r0)
            androidx.compose.ui.input.key.KeyEventType$Companion r1 = androidx.compose.ui.input.key.KeyEventType.Companion
            int r1 = r1.m3670getKeyUpCS__XNY()
            boolean r0 = androidx.compose.ui.input.key.KeyEventType.m3665equalsimpl0(r0, r1)
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L43
            r0 = r3
            long r0 = androidx.compose.ui.input.key.KeyEvent_androidKt.m3672getKeyZmokQxo(r0)
            int r0 = androidx.compose.ui.input.key.Key_androidKt.m3680getNativeKeyCodeYVgTNJs(r0)
            r6 = r0
            r0 = r6
            r1 = 23
            if (r0 == r1) goto L3a
            r0 = r6
            r1 = 66
            if (r0 == r1) goto L3a
            r0 = r6
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 == r1) goto L3a
            r0 = 0
            r6 = r0
            goto L3c
        L3a:
            r0 = 1
            r6 = r0
        L3c:
            r0 = r6
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = 0
            r5 = r0
        L45:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.Clickable_androidKt.m384isClickZmokQxo(android.view.KeyEvent):boolean");
    }

    @Composable
    @NotNull
    public static final Function0<Boolean> isComposeRootInScrollableContainer(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-184546112);
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Function0<Boolean> function0 = new Function0<Boolean>() { // from class: androidx.compose.foundation.Clickable_androidKt$isComposeRootInScrollableContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                boolean isInScrollableViewGroup;
                isInScrollableViewGroup = Clickable_androidKt.isInScrollableViewGroup(view);
                return Boolean.valueOf(isInScrollableViewGroup);
            }
        };
        composer.endReplaceableGroup();
        return function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInScrollableViewGroup(View view) {
        ViewGroup viewGroup;
        do {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                return false;
            }
            viewGroup = (ViewGroup) parent;
            view = viewGroup;
        } while (!viewGroup.shouldDelayChildPressedState());
        return true;
    }
}
