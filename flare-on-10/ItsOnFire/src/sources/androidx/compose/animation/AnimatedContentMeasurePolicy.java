package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018��2\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentScope;", "(Landroidx/compose/animation/AnimatedContentScope;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentScope;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedContentMeasurePolicy.class */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    @NotNull
    private final AnimatedContentScope<?> rootScope;

    public AnimatedContentMeasurePolicy(@NotNull AnimatedContentScope<?> rootScope) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.rootScope = rootScope;
    }

    @NotNull
    public final AnimatedContentScope<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i2) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$maxIntrinsicHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.maxIntrinsicHeight(i2));
            }
        });
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        return num == null ? 0 : num.intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i2) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$maxIntrinsicWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.maxIntrinsicWidth(i2));
            }
        });
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        return num == null ? 0 : num.intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult mo89measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
        int lastIndex;
        Placeable placeable;
        int lastIndex2;
        Placeable placeable2;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        final Placeable[] placeableArr = new Placeable[size];
        int size2 = measurables.size() - 1;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                int i4 = i3 + 1;
                Measurable measurable = measurables.get(i3);
                Object parentData = measurable.getParentData();
                AnimatedContentScope.ChildData childData = parentData instanceof AnimatedContentScope.ChildData ? (AnimatedContentScope.ChildData) parentData : null;
                if (childData != null && childData.isTarget()) {
                    placeableArr[i3] = measurable.mo3910measureBRTryo0(j2);
                }
                if (i4 > size2) {
                    break;
                }
                i2 = i4;
            }
        }
        int size3 = measurables.size() - 1;
        if (size3 >= 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5;
                int i7 = i6 + 1;
                Measurable measurable2 = measurables.get(i6);
                if (placeableArr[i6] == null) {
                    placeableArr[i6] = measurable2.mo3910measureBRTryo0(j2);
                }
                if (i7 > size3) {
                    break;
                }
                i5 = i7;
            }
        }
        if (size == 0) {
            placeable = null;
        } else {
            Placeable placeable3 = placeableArr[0];
            lastIndex = ArraysKt___ArraysKt.getLastIndex(placeableArr);
            if (lastIndex == 0) {
                placeable = placeable3;
            } else {
                int width = placeable3 == null ? 0 : placeable3.getWidth();
                placeable = placeable3;
                if (1 <= lastIndex) {
                    int i8 = 1;
                    int i9 = width;
                    placeable = placeable3;
                    while (true) {
                        Placeable placeable4 = placeableArr[i8];
                        int width2 = placeable4 == null ? 0 : placeable4.getWidth();
                        int i10 = i9;
                        if (i9 < width2) {
                            placeable = placeable4;
                            i10 = width2;
                        }
                        if (i8 == lastIndex) {
                            break;
                        }
                        i8++;
                        i9 = i10;
                    }
                }
            }
        }
        int width3 = placeable == null ? 0 : placeable.getWidth();
        if (size == 0) {
            placeable2 = null;
        } else {
            Placeable placeable5 = placeableArr[0];
            lastIndex2 = ArraysKt___ArraysKt.getLastIndex(placeableArr);
            if (lastIndex2 == 0) {
                placeable2 = placeable5;
            } else {
                int height = placeable5 == null ? 0 : placeable5.getHeight();
                placeable2 = placeable5;
                if (1 <= lastIndex2) {
                    int i11 = 1;
                    placeable2 = placeable5;
                    int i12 = height;
                    while (true) {
                        int i13 = i12;
                        Placeable placeable6 = placeableArr[i11];
                        int height2 = placeable6 == null ? 0 : placeable6.getHeight();
                        int i14 = i13;
                        if (i13 < height2) {
                            placeable2 = placeable6;
                            i14 = height2;
                        }
                        if (i11 == lastIndex2) {
                            break;
                        }
                        i11++;
                        i12 = i14;
                    }
                }
            }
        }
        int height3 = placeable2 == null ? 0 : placeable2.getHeight();
        this.rootScope.m102setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
        final int i15 = width3;
        final int i16 = height3;
        return MeasureScope.DefaultImpls.layout$default(receiver, width3, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable[] placeableArr2 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i17 = i15;
                int i18 = i16;
                int length = placeableArr2.length;
                int i19 = 0;
                while (i19 < length) {
                    Placeable placeable7 = placeableArr2[i19];
                    i19++;
                    if (placeable7 != null) {
                        long mo2047alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment$animation_release().mo2047alignKFBX0sM(IntSizeKt.IntSize(placeable7.getWidth(), placeable7.getHeight()), IntSizeKt.IntSize(i17, i18), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(layout, placeable7, IntOffset.m4907getXimpl(mo2047alignKFBX0sM), IntOffset.m4908getYimpl(mo2047alignKFBX0sM), 0.0f, 4, null);
                    }
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i2) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$minIntrinsicHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.minIntrinsicHeight(i2));
            }
        });
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        return num == null ? 0 : num.intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i2) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$minIntrinsicWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.minIntrinsicWidth(i2));
            }
        });
        maxOrNull = SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) map);
        Integer num = (Integer) maxOrNull;
        return num == null ? 0 : num.intValue();
    }
}
