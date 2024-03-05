package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0019\n��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u001a\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H��\"\u0010\u0010��\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\t"}, d2 = {"NoOpOverscrollController", "androidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1", "Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;", "rememberOverScrollController", "Landroidx/compose/foundation/gestures/OverScrollController;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/OverScrollController;", "overScroll", "Landroidx/compose/ui/Modifier;", "overScrollController", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/AndroidOverScrollKt.class */
public final class AndroidOverScrollKt {
    @NotNull
    private static final AndroidOverScrollKt$NoOpOverscrollController$1 NoOpOverscrollController = new OverScrollController() { // from class: androidx.compose.foundation.gestures.AndroidOverScrollKt$NoOpOverscrollController$1
        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: consumePostFling-TH1AsA0 */
        public void mo437consumePostFlingTH1AsA0(long j2) {
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: consumePostScroll-l7mfB5k */
        public void mo438consumePostScrolll7mfB5k(long j2, long j3, @Nullable Offset offset, int i2) {
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: consumePreFling-AH228Gc */
        public long mo439consumePreFlingAH228Gc(long j2) {
            return Velocity.Companion.m5031getZero9UxMQ8M();
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: consumePreScroll-A0NYTsA */
        public long mo440consumePreScrollA0NYTsA(long j2, @Nullable Offset offset, int i2) {
            return Offset.Companion.m2183getZeroF1C5BW0();
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        public void drawOverScroll(@NotNull DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "<this>");
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: refreshContainerInfo-TmRCtEA */
        public void mo441refreshContainerInfoTmRCtEA(long j2, boolean z) {
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        public void release() {
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        public boolean stopOverscrollAnimation() {
            return false;
        }
    };

    @NotNull
    public static final Modifier overScroll(@NotNull Modifier modifier, @NotNull final OverScrollController overScrollController) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(overScrollController, "overScrollController");
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.gestures.AndroidOverScrollKt$overScroll$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                OverScrollController.this.drawOverScroll(drawWithContent);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0058, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.gestures.OverScrollController rememberOverScrollController(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r5, int r6) {
        /*
            r0 = r5
            r1 = -1658914945(0xffffffff9d1ef77f, float:-2.1039078E-21)
            r0.startReplaceableGroup(r1)
            r0 = r5
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r0 = r0.consume(r1)
            android.content.Context r0 = (android.content.Context) r0
            r7 = r0
            r0 = r5
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.foundation.gestures.OverScrollConfigurationKt.getLocalOverScrollConfiguration()
            java.lang.Object r0 = r0.consume(r1)
            androidx.compose.foundation.gestures.OverScrollConfiguration r0 = (androidx.compose.foundation.gestures.OverScrollConfiguration) r0
            r8 = r0
            r0 = r5
            r1 = -3686552(0xffffffffffc7bf68, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r5
            r1 = r7
            boolean r0 = r0.changed(r1)
            r9 = r0
            r0 = r5
            r1 = r8
            boolean r0 = r0.changed(r1)
            r10 = r0
            r0 = r5
            java.lang.Object r0 = r0.rememberedValue()
            r11 = r0
            r0 = r9
            r1 = r10
            r0 = r0 | r1
            if (r0 != 0) goto L5b
            r0 = r11
            r12 = r0
            r0 = r11
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L7a
        L5b:
            r0 = r8
            if (r0 == 0) goto L6d
            androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController r0 = new androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            r12 = r0
            goto L72
        L6d:
            androidx.compose.foundation.gestures.AndroidOverScrollKt$NoOpOverscrollController$1 r0 = androidx.compose.foundation.gestures.AndroidOverScrollKt.NoOpOverscrollController
            r12 = r0
        L72:
            r0 = r5
            r1 = r12
            r0.updateRememberedValue(r1)
        L7a:
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r12
            androidx.compose.foundation.gestures.OverScrollController r0 = (androidx.compose.foundation.gestures.OverScrollController) r0
            r12 = r0
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidOverScrollKt.rememberOverScrollController(androidx.compose.runtime.Composer, int):androidx.compose.foundation.gestures.OverScrollController");
    }
}
