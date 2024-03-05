package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/CrossfadeKt$Crossfade$4$1.class */
public final class CrossfadeKt$Crossfade$4$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    public final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
    public final /* synthetic */ T $stateForContent;
    public final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CrossfadeKt$Crossfade$4$1(Transition<T> transition, int i2, FiniteAnimationSpec<Float> finiteAnimationSpec, T t2, Function3<? super T, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$this_Crossfade = transition;
        this.$$dirty = i2;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = t2;
        this.$content = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final float m139invoke$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0142, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L27;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt$Crossfade$4$1.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
