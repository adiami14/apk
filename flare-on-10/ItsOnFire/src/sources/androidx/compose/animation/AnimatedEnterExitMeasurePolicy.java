package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "scope", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V", "getScope", "()Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedEnterExitMeasurePolicy.class */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    @NotNull
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(@NotNull AnimatedVisibilityScopeImpl scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
    }

    @NotNull
    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i2) {
        Sequence asSequence;
        Sequence map;
        Comparable maxOrNull;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        asSequence = CollectionsKt___CollectionsKt.asSequence(measurables);
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1
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
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1
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
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo89measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
        int collectionSizeOrDefault;
        int lastIndex;
        Object obj;
        int lastIndex2;
        Object obj2;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(measurables, 10);
        final ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Measurable measurable : measurables) {
            arrayList.add(measurable.mo3910measureBRTryo0(j2));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            Object obj3 = arrayList.get(0);
            int width = ((Placeable) obj3).getWidth();
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            obj = obj3;
            if (1 <= lastIndex) {
                int i2 = 1;
                obj = obj3;
                while (true) {
                    Object obj4 = arrayList.get(i2);
                    int width2 = ((Placeable) obj4).getWidth();
                    int i3 = width;
                    if (width < width2) {
                        obj = obj4;
                        i3 = width2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                    width = i3;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable == null ? 0 : placeable.getWidth();
        if (arrayList.isEmpty()) {
            obj2 = null;
        } else {
            Object obj5 = arrayList.get(0);
            int height = ((Placeable) obj5).getHeight();
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            obj2 = obj5;
            if (1 <= lastIndex2) {
                int i4 = 1;
                int i5 = height;
                obj2 = obj5;
                while (true) {
                    Object obj6 = arrayList.get(i4);
                    int height2 = ((Placeable) obj6).getHeight();
                    int i6 = i5;
                    if (i5 < height2) {
                        obj2 = obj6;
                        i6 = height2;
                    }
                    if (i4 == lastIndex2) {
                        break;
                    }
                    i4++;
                    i5 = i6;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        int height3 = placeable2 == null ? 0 : placeable2.getHeight();
        this.scope.getTargetSize$animation_release().setValue(IntSize.m4943boximpl(IntSizeKt.IntSize(width3, height3)));
        return MeasureScope.DefaultImpls.layout$default(receiver, width3, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                List<Placeable> list = arrayList;
                int size = list.size() - 1;
                if (size < 0) {
                    return;
                }
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    int i9 = i8 + 1;
                    Placeable.PlacementScope.place$default(layout, list.get(i8), 0, 0, 0.0f, 4, null);
                    if (i9 > size) {
                        return;
                    }
                    i7 = i9;
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
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1
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
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1
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
