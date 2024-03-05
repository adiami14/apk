package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��2\n��\n\u0002\u0010\t\n��\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\u001a.\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010��\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a.\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b\u001a4\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a<\u0010\u0012\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0014\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0015\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a9\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019H\u0082\b\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0082\b¨\u0006\u001d"}, d2 = {"estimateAnimationDurationMillis", "", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "roots", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/SpringEstimationKt.class */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(1.0d, 2.0d * d3 * Math.sqrt(d2), d2), d3, d4, d5, d6);
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6, double d7) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(d4, d3, d2), d3 / (Math.sqrt(d2 * d4) * 2.0d), d5, d6, d7);
    }

    public static final long estimateAnimationDurationMillis(float f2, float f3, float f4, float f5, float f6) {
        return estimateAnimationDurationMillis(f2, f3, f4, f5, f6);
    }

    private static final double estimateCriticallyDamped(Pair<ComplexDouble, ComplexDouble> pair, final double d2, double d3, double d4) {
        Function1<Double, Double> function1;
        Function1<Double, Double> function12;
        double d5;
        double d6;
        int i2;
        final double real = pair.getFirst().getReal();
        double d7 = real * d2;
        final double d8 = d3 - d7;
        double log = Math.log(Math.abs(d4 / d2)) / real;
        double estimateCriticallyDamped$t2Iterate = estimateCriticallyDamped$t2Iterate(Math.log(Math.abs(d4 / d8)), real) / real;
        if (!(!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true))) {
            if (!(!((Double.isInfinite(estimateCriticallyDamped$t2Iterate) || Double.isNaN(estimateCriticallyDamped$t2Iterate)) ? false : true))) {
                log = Math.max(log, estimateCriticallyDamped$t2Iterate);
            }
            estimateCriticallyDamped$t2Iterate = log;
        }
        double d9 = (-(d7 + d8)) / (real * d8);
        double d10 = estimateCriticallyDamped$t2Iterate;
        if (!Double.isNaN(d9)) {
            if (d9 <= 0.0d) {
                d10 = estimateCriticallyDamped$t2Iterate;
            } else if (d9 <= 0.0d || (-estimateCriticallyDamped$xInflection(d2, real, d9, d8)) >= d4) {
                d10 = (-(2.0d / real)) - (d2 / d8);
                final double d11 = d4;
                function1 = new Function1<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final Double invoke(double d12) {
                        return Double.valueOf(((d2 + (d8 * d12)) * Math.exp(real * d12)) + d11);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Double invoke(Double d12) {
                        return invoke(d12.doubleValue());
                    }
                };
                function12 = new Function1<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final Double invoke(double d12) {
                        double d13 = d8;
                        double d14 = real;
                        return Double.valueOf(((d13 * ((d14 * d12) + 1)) + (d2 * d14)) * Math.exp(d14 * d12));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Double invoke(Double d12) {
                        return invoke(d12.doubleValue());
                    }
                };
                d5 = Double.MAX_VALUE;
                d6 = d10;
                i2 = 0;
                while (d5 > 0.001d && i2 < 100) {
                    i2++;
                    double doubleValue = d6 - (function1.invoke(Double.valueOf(d6)).doubleValue() / function12.invoke(Double.valueOf(d6)).doubleValue());
                    d5 = Math.abs(d6 - doubleValue);
                    d6 = doubleValue;
                }
                return d6;
            } else {
                d10 = estimateCriticallyDamped$t2Iterate;
                if (d8 < 0.0d) {
                    d10 = estimateCriticallyDamped$t2Iterate;
                    if (d2 > 0.0d) {
                        d10 = 0.0d;
                    }
                }
            }
        }
        d4 = -d4;
        final double d112 = d4;
        function1 = new Function1<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d12) {
                return Double.valueOf(((d2 + (d8 * d12)) * Math.exp(real * d12)) + d112);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d12) {
                return invoke(d12.doubleValue());
            }
        };
        function12 = new Function1<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d12) {
                double d13 = d8;
                double d14 = real;
                return Double.valueOf(((d13 * ((d14 * d12) + 1)) + (d2 * d14)) * Math.exp(d14 * d12));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d12) {
                return invoke(d12.doubleValue());
            }
        };
        d5 = Double.MAX_VALUE;
        d6 = d10;
        i2 = 0;
        while (d5 > 0.001d) {
            i2++;
            double doubleValue2 = d6 - (function1.invoke(Double.valueOf(d6)).doubleValue() / function12.invoke(Double.valueOf(d6)).doubleValue());
            d5 = Math.abs(d6 - doubleValue2);
            d6 = doubleValue2;
        }
        return d6;
    }

    private static final double estimateCriticallyDamped$t2Iterate(double d2, double d3) {
        int i2 = 0;
        double d4 = d2;
        while (true) {
            double d5 = d4;
            if (i2 >= 6) {
                return d5;
            }
            i2++;
            d4 = d2 - Math.log(Math.abs(d5 / d3));
        }
    }

    private static final double estimateCriticallyDamped$xInflection(double d2, double d3, double d4, double d5) {
        double d6 = d3 * d4;
        return (d2 * Math.exp(d6)) + (d5 * d4 * Math.exp(d6));
    }

    private static final long estimateDurationInternal(Pair<ComplexDouble, ComplexDouble> pair, double d2, double d3, double d4, double d5) {
        int i2 = (d4 > 0.0d ? 1 : (d4 == 0.0d ? 0 : -1));
        if (i2 == 0) {
            if (d3 == 0.0d) {
                return 0L;
            }
        }
        double d6 = d3;
        if (i2 < 0) {
            d6 = -d3;
        }
        double abs = Math.abs(d4);
        return (long) ((d2 > 1.0d ? estimateOverDamped(pair, abs, d6, d5) : d2 < 1.0d ? estimateUnderDamped(pair, abs, d6, d5) : estimateCriticallyDamped(pair, abs, d6, d5)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final double estimateOverDamped(kotlin.Pair<androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble> r13, double r14, double r16, double r18) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(kotlin.Pair, double, double, double):double");
    }

    /* renamed from: estimateOverDamped$xInflection-0  reason: not valid java name */
    private static final double m272estimateOverDamped$xInflection0(double d2, double d3, double d4, double d5, double d6) {
        return (d2 * Math.exp(d3 * d4)) + (d5 * Math.exp(d6 * d4));
    }

    private static final double estimateUnderDamped(Pair<ComplexDouble, ComplexDouble> pair, double d2, double d3, double d4) {
        double real = pair.getFirst().getReal();
        double imaginary = (d3 - (real * d2)) / pair.getFirst().getImaginary();
        return Math.log(d4 / Math.sqrt((d2 * d2) + (imaginary * imaginary))) / real;
    }

    private static final boolean isNotFinite(double d2) {
        return !((Double.isInfinite(d2) || Double.isNaN(d2)) ? false : true);
    }

    private static final double iterateNewtonsMethod(double d2, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d2 - (function1.invoke(Double.valueOf(d2)).doubleValue() / function12.invoke(Double.valueOf(d2)).doubleValue());
    }
}
