package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��6\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0087\bø\u0001��¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0015\"\u001c\u0010��\u001a\u00020\u00018��X\u0081\u0004¢\u0006\u000e\n��\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"DefaultRowMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy$annotations", "()V", "getDefaultRowMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "Row", "", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rowMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/RowKt.class */
public final class RowKt {
    @NotNull
    private static final MeasurePolicy DefaultRowMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        float mo588getSpacingD9Ej5fM = Arrangement.INSTANCE.getStart().mo588getSpacingD9Ej5fM();
        CrossAxisAlignment vertical$foundation_layout_release = CrossAxisAlignment.Companion.vertical$foundation_layout_release(Alignment.Companion.getTop());
        DefaultRowMeasurePolicy = RowColumnImplKt.m705rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new Function5<Integer, int[], LayoutDirection, Density, int[], Unit>() { // from class: androidx.compose.foundation.layout.RowKt$DefaultRowMeasurePolicy$1
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                invoke(num.intValue(), iArr, layoutDirection, density, iArr2);
                return Unit.INSTANCE;
            }

            public final void invoke(int i2, @NotNull int[] size, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull int[] outPosition) {
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                Intrinsics.checkNotNullParameter(outPosition, "outPosition");
                Arrangement.INSTANCE.getStart().arrange(density, i2, size, layoutDirection, outPosition);
            }
        }, mo588getSpacingD9Ej5fM, SizeMode.Wrap, vertical$foundation_layout_release);
    }

    @Composable
    public static final void Row(@Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontal, @Nullable Alignment.Vertical vertical, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1989997165);
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i3 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i3 & 4) != 0) {
            vertical = Alignment.Companion.getTop();
        }
        int i4 = i2 >> 3;
        MeasurePolicy rowMeasurePolicy = rowMeasurePolicy(horizontal, vertical, composer, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14));
        composer.startReplaceableGroup(1376089394);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
        int i5 = ((((i2 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1989constructorimpl = Updater.m1989constructorimpl(composer);
        Updater.m1996setimpl(m1989constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
        Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer)), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-326682362);
        if (((((i5 >> 9) & 14) & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            content.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @NotNull
    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return DefaultRowMeasurePolicy;
    }

    @PublishedApi
    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x004e, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.Arrangement.Horizontal r6, @org.jetbrains.annotations.NotNull androidx.compose.ui.Alignment.Vertical r7, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r8, int r9) {
        /*
            r0 = r6
            java.lang.String r1 = "horizontalArrangement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            java.lang.String r1 = "verticalAlignment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r8
            r1 = 495203992(0x1d843698, float:3.4996558E-21)
            r0.startReplaceableGroup(r1)
            r0 = r8
            r1 = -3686552(0xffffffffffc7bf68, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r8
            r1 = r6
            boolean r0 = r0.changed(r1)
            r10 = r0
            r0 = r8
            r1 = r7
            boolean r0 = r0.changed(r1)
            r11 = r0
            r0 = r8
            java.lang.Object r0 = r0.rememberedValue()
            r12 = r0
            r0 = r10
            r1 = r11
            r0 = r0 | r1
            if (r0 != 0) goto L51
            r0 = r12
            r13 = r0
            r0 = r12
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto La9
        L51:
            r0 = r6
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r1 = r1.getStart()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L72
            r0 = r7
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r1 = r1.getTop()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L72
            androidx.compose.ui.layout.MeasurePolicy r0 = getDefaultRowMeasurePolicy()
            r6 = r0
            goto L9f
        L72:
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Horizontal
            r13 = r0
            r0 = r6
            float r0 = r0.mo588getSpacingD9Ej5fM()
            r14 = r0
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r0 = androidx.compose.foundation.layout.CrossAxisAlignment.Companion
            r1 = r7
            androidx.compose.foundation.layout.CrossAxisAlignment r0 = r0.vertical$foundation_layout_release(r1)
            r7 = r0
            androidx.compose.foundation.layout.SizeMode r0 = androidx.compose.foundation.layout.SizeMode.Wrap
            r12 = r0
            r0 = r13
            androidx.compose.foundation.layout.RowKt$rowMeasurePolicy$1$1 r1 = new androidx.compose.foundation.layout.RowKt$rowMeasurePolicy$1$1
            r2 = r1
            r3 = r6
            r2.<init>()
            r2 = r14
            r3 = r12
            r4 = r7
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.RowColumnImplKt.m705rowColumnMeasurePolicyTDGSqEk(r0, r1, r2, r3, r4)
            r6 = r0
        L9f:
            r0 = r8
            r1 = r6
            r0.updateRememberedValue(r1)
            r0 = r6
            r13 = r0
        La9:
            r0 = r8
            r0.endReplaceableGroup()
            r0 = r13
            androidx.compose.ui.layout.MeasurePolicy r0 = (androidx.compose.ui.layout.MeasurePolicy) r0
            r6 = r0
            r0 = r8
            r0.endReplaceableGroup()
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }
}
