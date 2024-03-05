package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.appcompat.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@InternalPlatformTextApi
@Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\r\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001d\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "charSequence", "", "textPaint", "Landroid/text/TextPaint;", "textDirectionHeuristic", "", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "boringMetrics", "Landroid/text/BoringLayout$Metrics;", "getBoringMetrics", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics$delegate", "Lkotlin/Lazy;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth$delegate", "minIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth$delegate", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/LayoutIntrinsics.class */
public final class LayoutIntrinsics {
    @NotNull
    private final Lazy boringMetrics$delegate;
    @NotNull
    private final Lazy maxIntrinsicWidth$delegate;
    @NotNull
    private final Lazy minIntrinsicWidth$delegate;

    public LayoutIntrinsics(@NotNull final CharSequence charSequence, @NotNull final TextPaint textPaint, final int i2) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BoringLayout.Metrics>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$boringMetrics$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final BoringLayout.Metrics invoke() {
                return BoringLayoutFactory.INSTANCE.measure(charSequence, textPaint, TextLayoutKt.getTextDirectionHeuristic(i2));
            }
        });
        this.boringMetrics$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Float>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$minIntrinsicWidth$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(LayoutIntrinsicsKt.minIntrinsicWidth(charSequence, textPaint));
            }
        });
        this.minIntrinsicWidth$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Float>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$maxIntrinsicWidth$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                float floatValue;
                boolean shouldIncreaseMaxIntrinsic;
                BoringLayout.Metrics boringMetrics = LayoutIntrinsics.this.getBoringMetrics();
                Float valueOf = boringMetrics == null ? null : Float.valueOf(boringMetrics.width);
                if (valueOf == null) {
                    CharSequence charSequence2 = charSequence;
                    floatValue = Layout.getDesiredWidth(charSequence2, 0, charSequence2.length(), textPaint);
                } else {
                    floatValue = valueOf.floatValue();
                }
                float f2 = floatValue;
                shouldIncreaseMaxIntrinsic = LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(floatValue, charSequence, textPaint);
                if (shouldIncreaseMaxIntrinsic) {
                    f2 = floatValue + 0.5f;
                }
                return Float.valueOf(f2);
            }
        });
        this.maxIntrinsicWidth$delegate = lazy3;
    }

    @Nullable
    public final BoringLayout.Metrics getBoringMetrics() {
        return (BoringLayout.Metrics) this.boringMetrics$delegate.getValue();
    }

    public final float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }
}
