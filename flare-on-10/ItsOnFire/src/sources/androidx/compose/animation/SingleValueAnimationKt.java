package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��2\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"colorDefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/graphics/Color;", "Animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "initialValue", "Animatable-8_81llA", "(J)Landroidx/compose/animation/core/Animatable;", "animateColorAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/SingleValueAnimationKt.class */
public final class SingleValueAnimationKt {
    @NotNull
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    @NotNull
    /* renamed from: Animatable-8_81llA  reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m201Animatable8_81llA(long j2) {
        return new Animatable<>(Color.m2404boximpl(j2), ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m2418getColorSpaceimpl(j2)), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L14;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* renamed from: animateColorAsState-KTwxG1Y  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m202animateColorAsStateKTwxG1Y(long r11, @org.jetbrains.annotations.Nullable androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.graphics.Color> r13, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Color, kotlin.Unit> r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, int r16, int r17) {
        /*
            r0 = r15
            r1 = -309953786(0xffffffffed867b06, float:-5.2024647E27)
            r0.startReplaceableGroup(r1)
            r0 = r17
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L14
            androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> r0 = androidx.compose.animation.SingleValueAnimationKt.colorDefaultSpring
            r13 = r0
        L14:
            r0 = r17
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L1d
            r0 = 0
            r14 = r0
        L1d:
            r0 = r11
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.Color.m2418getColorSpaceimpl(r0)
            r18 = r0
            r0 = r15
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r15
            r1 = r18
            boolean r0 = r0.changed(r1)
            r19 = r0
            r0 = r15
            java.lang.Object r0 = r0.rememberedValue()
            r20 = r0
            r0 = r19
            if (r0 != 0) goto L54
            r0 = r20
            r18 = r0
            r0 = r20
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L71
        L54:
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r0 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r0)
            r1 = r11
            androidx.compose.ui.graphics.colorspace.ColorSpace r1 = androidx.compose.ui.graphics.Color.m2418getColorSpaceimpl(r1)
            java.lang.Object r0 = r0.invoke(r1)
            androidx.compose.animation.core.TwoWayConverter r0 = (androidx.compose.animation.core.TwoWayConverter) r0
            r18 = r0
            r0 = r15
            r1 = r18
            r0.updateRememberedValue(r1)
        L71:
            r0 = r15
            r0.endReplaceableGroup()
            r0 = r18
            androidx.compose.animation.core.TwoWayConverter r0 = (androidx.compose.animation.core.TwoWayConverter) r0
            r18 = r0
            r0 = r11
            androidx.compose.ui.graphics.Color r0 = androidx.compose.ui.graphics.Color.m2404boximpl(r0)
            r1 = r18
            r2 = r13
            r3 = 0
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = 14
            r6 = r6 & r7
            r7 = 576(0x240, float:8.07E-43)
            r6 = r6 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = r16
            r9 = 6
            int r8 = r8 << r9
            r7 = r7 & r8
            r6 = r6 | r7
            r7 = 8
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState(r0, r1, r2, r3, r4, r5, r6, r7)
            r13 = r0
            r0 = r15
            r0.endReplaceableGroup()
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SingleValueAnimationKt.m202animateColorAsStateKTwxG1Y(long, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }
}
