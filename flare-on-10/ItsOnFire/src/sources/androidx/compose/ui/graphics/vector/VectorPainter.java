package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\b\u0007\u0018��2\u00020\u0001B\u0007\b��¢\u0006\u0002\u0010\u0002Jd\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062;\u0010(\u001a7\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b*\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b*\u0012\b\b$\u0012\u0004\b\b('\u0012\u0004\u0012\u00020#0)¢\u0006\u0002\b+H\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0006H\u0014J\u0012\u00100\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u00010\bH\u0014JR\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u0002042;\u00105\u001a7\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b*\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b*\u0012\b\b$\u0012\u0004\b\b('\u0012\u0004\u0012\u00020#0)¢\u0006\u0002\b+H\u0002¢\u0006\u0002\u00106J\f\u00107\u001a\u00020#*\u000208H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n��R(\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R4\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00108@@@X\u0080\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "()V", "composition", "Landroidx/compose/runtime/Composition;", "currentAlpha", "", "currentColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "intrinsicColorFilter", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "<set-?>", "", "isDirty", "()Z", "setDirty", "(Z)V", "isDirty$delegate", "Landroidx/compose/runtime/MutableState;", "size", "getSize-NH-jbRc$ui_release", "setSize-uvyYCjk$ui_release", "(J)V", "size$delegate", "vector", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "RenderVector", "", "name", "", "viewportWidth", "viewportHeight", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/runtime/Composable;", "RenderVector$ui_release", "(Ljava/lang/String;FFLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "applyAlpha", "alpha", "applyColorFilter", "colorFilter", "composeVector", "parent", "Landroidx/compose/runtime/CompositionContext;", "composable", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function4;)Landroidx/compose/runtime/Composition;", "onDraw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/VectorPainter.class */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    @Nullable
    private Composition composition;
    private float currentAlpha;
    @Nullable
    private ColorFilter currentColorFilter;
    @NotNull
    private final MutableState isDirty$delegate;
    @NotNull
    private final MutableState size$delegate;
    @NotNull
    private final VectorComponent vector;

    public VectorPainter() {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2227boximpl(Size.Companion.m2248getZeroNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.setInvalidateCallback$ui_release(new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                VectorPainter.this.setDirty(true);
            }
        });
        this.vector = vectorComponent;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isDirty$delegate = mutableStateOf$default2;
        this.currentAlpha = 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.isDisposed() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.Composition composeVector(androidx.compose.runtime.CompositionContext r9, final kotlin.jvm.functions.Function4<? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r10) {
        /*
            r8 = this;
            r0 = r8
            androidx.compose.runtime.Composition r0 = r0.composition
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L15
            r0 = r11
            r12 = r0
            r0 = r11
            boolean r0 = r0.isDisposed()
            if (r0 == 0) goto L29
        L15:
            androidx.compose.ui.graphics.vector.VectorApplier r0 = new androidx.compose.ui.graphics.vector.VectorApplier
            r1 = r0
            r2 = r8
            androidx.compose.ui.graphics.vector.VectorComponent r2 = r2.vector
            androidx.compose.ui.graphics.vector.GroupComponent r2 = r2.getRoot()
            r1.<init>(r2)
            r1 = r9
            androidx.compose.runtime.Composition r0 = androidx.compose.runtime.CompositionKt.Composition(r0, r1)
            r12 = r0
        L29:
            r0 = r8
            r1 = r12
            r0.composition = r1
            r0 = r12
            r1 = -985537011(0xffffffffc541e60d, float:-3102.3782)
            r2 = 1
            androidx.compose.ui.graphics.vector.VectorPainter$composeVector$1 r3 = new androidx.compose.ui.graphics.vector.VectorPainter$composeVector$1
            r4 = r3
            r5 = r10
            r6 = r8
            r4.<init>()
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r2, r3)
            r0.setContent(r1)
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainter.composeVector(androidx.compose.runtime.CompositionContext, kotlin.jvm.functions.Function4):androidx.compose.runtime.Composition");
    }

    private final boolean isDirty() {
        return ((Boolean) this.isDirty$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDirty(boolean z) {
        this.isDirty$delegate.setValue(Boolean.valueOf(z));
    }

    @Composable
    public final void RenderVector$ui_release(@NotNull final String name, final float f2, final float f3, @NotNull final Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(625569543);
        VectorComponent vectorComponent = this.vector;
        vectorComponent.setName(name);
        vectorComponent.setViewportWidth(f2);
        vectorComponent.setViewportHeight(f3);
        final Composition composeVector = composeVector(ComposablesKt.rememberCompositionContext(startRestartGroup, 0), content);
        EffectsKt.DisposableEffect(composeVector, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final Composition composition = Composition.this;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Composition.this.dispose();
                    }
                };
            }
        }, startRestartGroup, 8);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$3
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

            public final void invoke(@Nullable Composer composer2, int i3) {
                VectorPainter.this.RenderVector$ui_release(name, f2, f3, content, composer2, i2 | 1);
            }
        });
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f2) {
        this.currentAlpha = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2940getIntrinsicSizeNHjbRc() {
        return m3016getSizeNHjbRc$ui_release();
    }

    /* renamed from: getSize-NH-jbRc$ui_release  reason: not valid java name */
    public final long m3016getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m2244unboximpl();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        VectorComponent vectorComponent = this.vector;
        float f2 = this.currentAlpha;
        ColorFilter colorFilter = this.currentColorFilter;
        ColorFilter colorFilter2 = colorFilter;
        if (colorFilter == null) {
            colorFilter2 = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        vectorComponent.draw(drawScope, f2, colorFilter2);
        if (isDirty()) {
            setDirty(false);
        }
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    /* renamed from: setSize-uvyYCjk$ui_release  reason: not valid java name */
    public final void m3017setSizeuvyYCjk$ui_release(long j2) {
        this.size$delegate.setValue(Size.m2227boximpl(j2));
    }
}
