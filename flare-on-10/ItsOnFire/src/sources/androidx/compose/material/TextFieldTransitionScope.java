package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��H\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÊ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2z\u0010\u000f\u001av\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "Landroidx/compose/ui/unit/Dp;", "indicatorWidth", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/TextFieldTransitionScope.class */
public final class TextFieldTransitionScope {
    @NotNull
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/material/TextFieldTransitionScope$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* renamed from: Transition_DTcfvLk$lambda-1  reason: not valid java name */
    private static final float m1614Transition_DTcfvLk$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-3  reason: not valid java name */
    private static final float m1615Transition_DTcfvLk$lambda3(State<Dp> state) {
        return state.getValue().m4799unboximpl();
    }

    /* renamed from: Transition_DTcfvLk$lambda-5  reason: not valid java name */
    private static final float m1616Transition_DTcfvLk$lambda5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-7  reason: not valid java name */
    private static final long m1617Transition_DTcfvLk$lambda7(State<Color> state) {
        return state.getValue().m2424unboximpl();
    }

    /* renamed from: Transition_DTcfvLk$lambda-8  reason: not valid java name */
    private static final long m1618Transition_DTcfvLk$lambda8(State<Color> state) {
        return state.getValue().m2424unboximpl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x03aa, code lost:
        if (r21 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04c1, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0608, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038e  */
    @androidx.compose.runtime.Composable
    /* renamed from: Transition-DTcfvLk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1619TransitionDTcfvLk(@org.jetbrains.annotations.NotNull final androidx.compose.material.InputPhase r15, final long r16, final long r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r20, final boolean r21, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function7<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.unit.Dp, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, final int r24) {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.m1619TransitionDTcfvLk(androidx.compose.material.InputPhase, long, long, kotlin.jvm.functions.Function3, boolean, kotlin.jvm.functions.Function7, androidx.compose.runtime.Composer, int):void");
    }
}
