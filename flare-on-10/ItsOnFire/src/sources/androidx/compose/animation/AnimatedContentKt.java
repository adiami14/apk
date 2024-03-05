package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��p\n��\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u0083\u0001\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f21\u0010\r\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0012¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0013\u001aU\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172>\b\u0002\u0010\u0018\u001a8\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001c0\u000eH\u0007ø\u0001��\u001a¬\u0001\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u000721\u0010\r\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0012¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010 \u001a\u0015\u0010!\u001a\u00020\t*\u00020\"2\u0006\u0010#\u001a\u00020$H\u0087\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "contentKey", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "with", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedContentKt.class */
public final class AnimatedContentKt {
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0253, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02a7, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02fe, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04cc, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<S> r12, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r13, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r14, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment r15, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r16, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r17, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(final S r11, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r12, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r13, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalAnimationApi
    @NotNull
    public static final SizeTransform SizeTransform(boolean z, @NotNull Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        return new SizeTransformImpl(z, sizeAnimationSpec);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m88invokeTemP2vQ(intSize.m4955unboximpl(), intSize2.m4955unboximpl());
                }

                @NotNull
                /* renamed from: invoke-TemP2vQ  reason: not valid java name */
                public final SpringSpec<IntSize> m88invokeTemP2vQ(long j2, long j3) {
                    return AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    @ExperimentalAnimationApi
    @NotNull
    public static final ContentTransform with(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exit) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }
}
