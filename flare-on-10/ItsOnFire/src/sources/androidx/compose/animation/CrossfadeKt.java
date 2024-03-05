package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��8\n��\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\u001aN\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0086\u0001\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n2&\u0010\t\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/CrossfadeKt.class */
public final class CrossfadeKt {
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0275, code lost:
        if (r0 == r0.getEmpty()) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0526  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void Crossfade(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<T> r11, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r12, @org.jetbrains.annotations.Nullable androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r13, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final <T> void Crossfade(final T t2, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @NotNull final Function3<? super T, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Modifier modifier2;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1621451783);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(t2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i5 = i4 | 48;
        } else {
            i5 = i4;
            if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i5 = i4 | (startRestartGroup.changed(modifier) ? 32 : 16);
            }
        }
        int i8 = i3 & 4;
        int i9 = i5;
        if (i8 != 0) {
            i9 = i5 | 128;
        }
        if ((i3 & 8) != 0) {
            i6 = i9 | 3072;
        } else {
            i6 = i9;
            if ((i2 & 7168) == 0) {
                i6 = i9 | (startRestartGroup.changed(content) ? 2048 : 1024);
            }
        }
        if ((4 & i3) == 0 && ((i6 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            finiteAnimationSpec2 = finiteAnimationSpec;
        } else {
            if (i7 != 0) {
                modifier = Modifier.Companion;
            }
            if (i8 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t2, (String) null, startRestartGroup, (i6 & 8) | (i6 & 14), 2), modifier, finiteAnimationSpec, null, content, startRestartGroup, (i6 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 512 | ((i6 << 3) & 57344), 4);
            modifier2 = modifier;
            finiteAnimationSpec2 = finiteAnimationSpec;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final FiniteAnimationSpec<Float> finiteAnimationSpec3 = finiteAnimationSpec2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i10) {
                CrossfadeKt.Crossfade(t2, modifier3, finiteAnimationSpec3, content, composer2, i2 | 1, i3);
            }
        });
    }
}
