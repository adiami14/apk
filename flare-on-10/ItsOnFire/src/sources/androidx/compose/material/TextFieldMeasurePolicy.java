package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J8\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002J<\u0010\u000f\u001a\u00020\b*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002J\"\u0010\u0012\u001a\u00020\b*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\"\u0010\u0013\u001a\u00020\b*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\bH\u0016J/\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001c\u001a\u00020\b*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\"\u0010\u001d\u001a\u00020\b*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "(ZF)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/TextFieldMeasurePolicy.class */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f2) {
        this.singleLine = z;
        this.animationProgress = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int m1606calculateHeightYbqEFUw;
        for (Object obj5 : list) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.TextFieldId)) {
                int intValue = function2.invoke(obj5, Integer.valueOf(i2)).intValue();
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj), TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
                int intValue2 = intrinsicMeasurable == null ? 0 : function2.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
                int intValue3 = intrinsicMeasurable2 == null ? 0 : function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2)).intValue();
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj3;
                int intValue4 = intrinsicMeasurable3 == null ? 0 : function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2)).intValue();
                Iterator<T> it4 = list.iterator();
                do {
                    obj4 = null;
                    if (!it4.hasNext()) {
                        break;
                    }
                    obj4 = it4.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), TextFieldImplKt.PlaceholderId));
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj4;
                int intValue5 = intrinsicMeasurable4 == null ? 0 : function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2)).intValue();
                m1606calculateHeightYbqEFUw = TextFieldKt.m1606calculateHeightYbqEFUw(intValue, intValue2 > 0, intValue2, intValue4, intValue3, intValue5, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity());
                return m1606calculateHeightYbqEFUw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int m1607calculateWidthVsPV1Ek;
        for (Object obj5 : list) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.TextFieldId)) {
                int intValue = function2.invoke(obj5, Integer.valueOf(i2)).intValue();
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj), TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
                int intValue2 = intrinsicMeasurable == null ? 0 : function2.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
                int intValue3 = intrinsicMeasurable2 == null ? 0 : function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2)).intValue();
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj3;
                int intValue4 = intrinsicMeasurable3 == null ? 0 : function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2)).intValue();
                Iterator<T> it4 = list.iterator();
                do {
                    obj4 = null;
                    if (!it4.hasNext()) {
                        break;
                    }
                    obj4 = it4.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), TextFieldImplKt.PlaceholderId));
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj4;
                m1607calculateWidthVsPV1Ek = TextFieldKt.m1607calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable4 == null ? 0 : function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2)).intValue(), TextFieldImplKt.getZeroConstraints());
                return m1607calculateWidthVsPV1Ek;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i3) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i3) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo89measure3p2s80s(@NotNull final MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
        float f2;
        float f3;
        float f4;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        Object obj4;
        final int m1607calculateWidthVsPV1Ek;
        final int m1606calculateHeightYbqEFUw;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int mo518roundToPx0680j_4 = receiver.mo518roundToPx0680j_4(TextFieldImplKt.getTextFieldPadding());
        f2 = TextFieldKt.FirstBaselineOffset;
        final int mo518roundToPx0680j_42 = receiver.mo518roundToPx0680j_4(f2);
        f3 = TextFieldKt.LastBaselineOffset;
        int mo518roundToPx0680j_43 = receiver.mo518roundToPx0680j_4(f3);
        f4 = TextFieldKt.TextFieldTopPadding;
        final int mo518roundToPx0680j_44 = receiver.mo518roundToPx0680j_4(f4);
        long m4743copyZbe2FdA$default = Constraints.m4743copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        Iterator<T> it = measurables.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), TextFieldImplKt.LeadingId)) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        Placeable mo3910measureBRTryo0 = measurable == null ? null : measurable.mo3910measureBRTryo0(m4743copyZbe2FdA$default);
        int widthOrZero = TextFieldImplKt.widthOrZero(mo3910measureBRTryo0) + 0;
        Iterator<T> it2 = measurables.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), TextFieldImplKt.TrailingId)) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable mo3910measureBRTryo02 = measurable2 == null ? null : measurable2.mo3910measureBRTryo0(ConstraintsKt.m4769offsetNN6EwU$default(m4743copyZbe2FdA$default, -widthOrZero, 0, 2, null));
        int i3 = -mo518roundToPx0680j_43;
        int i4 = -(widthOrZero + TextFieldImplKt.widthOrZero(mo3910measureBRTryo02));
        long m4768offsetNN6EwU = ConstraintsKt.m4768offsetNN6EwU(m4743copyZbe2FdA$default, i4, i3);
        Iterator<T> it3 = measurables.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj3), TextFieldImplKt.LabelId)) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable mo3910measureBRTryo03 = measurable3 == null ? null : measurable3.mo3910measureBRTryo0(m4768offsetNN6EwU);
        if (mo3910measureBRTryo03 == null) {
            i2 = 0;
        } else {
            i2 = mo3910measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (i2 == Integer.MIN_VALUE) {
                i2 = mo3910measureBRTryo03.getHeight();
            }
        }
        final int max = Math.max(i2, mo518roundToPx0680j_42);
        long m4768offsetNN6EwU2 = ConstraintsKt.m4768offsetNN6EwU(Constraints.m4743copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null), i4, mo3910measureBRTryo03 != null ? (i3 - mo518roundToPx0680j_44) - max : (-mo518roundToPx0680j_4) * 2);
        for (Measurable measurable4 : measurables) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.TextFieldId)) {
                final Placeable mo3910measureBRTryo04 = measurable4.mo3910measureBRTryo0(m4768offsetNN6EwU2);
                long m4743copyZbe2FdA$default2 = Constraints.m4743copyZbe2FdA$default(m4768offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                Iterator<T> it4 = measurables.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj4), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                }
                Measurable measurable5 = (Measurable) obj4;
                Placeable mo3910measureBRTryo05 = measurable5 == null ? null : measurable5.mo3910measureBRTryo0(m4743copyZbe2FdA$default2);
                m1607calculateWidthVsPV1Ek = TextFieldKt.m1607calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(mo3910measureBRTryo0), TextFieldImplKt.widthOrZero(mo3910measureBRTryo02), mo3910measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo3910measureBRTryo03), TextFieldImplKt.widthOrZero(mo3910measureBRTryo05), j2);
                m1606calculateHeightYbqEFUw = TextFieldKt.m1606calculateHeightYbqEFUw(mo3910measureBRTryo04.getHeight(), mo3910measureBRTryo03 != null, max, TextFieldImplKt.heightOrZero(mo3910measureBRTryo0), TextFieldImplKt.heightOrZero(mo3910measureBRTryo02), TextFieldImplKt.heightOrZero(mo3910measureBRTryo05), j2, receiver.getDensity());
                final Placeable placeable = mo3910measureBRTryo03;
                final int i5 = i2;
                final Placeable placeable2 = mo3910measureBRTryo05;
                final Placeable placeable3 = mo3910measureBRTryo0;
                final Placeable placeable4 = mo3910measureBRTryo02;
                return MeasureScope.DefaultImpls.layout$default(receiver, m1607calculateWidthVsPV1Ek, m1606calculateHeightYbqEFUw, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
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
                        boolean z;
                        int coerceAtLeast;
                        boolean z2;
                        float f5;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        if (Placeable.this == null) {
                            int i6 = m1607calculateWidthVsPV1Ek;
                            int i7 = m1606calculateHeightYbqEFUw;
                            Placeable placeable5 = mo3910measureBRTryo04;
                            Placeable placeable6 = placeable2;
                            Placeable placeable7 = placeable3;
                            Placeable placeable8 = placeable4;
                            z = this.singleLine;
                            TextFieldKt.placeWithoutLabel(layout, i6, i7, placeable5, placeable6, placeable7, placeable8, z, receiver.getDensity());
                            return;
                        }
                        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mo518roundToPx0680j_42 - i5, 0);
                        int i8 = m1607calculateWidthVsPV1Ek;
                        int i9 = m1606calculateHeightYbqEFUw;
                        Placeable placeable9 = mo3910measureBRTryo04;
                        Placeable placeable10 = Placeable.this;
                        Placeable placeable11 = placeable2;
                        Placeable placeable12 = placeable3;
                        Placeable placeable13 = placeable4;
                        z2 = this.singleLine;
                        int i10 = max;
                        f5 = this.animationProgress;
                        TextFieldKt.placeWithLabel(layout, i8, i9, placeable9, placeable10, placeable11, placeable12, placeable13, z2, coerceAtLeast, mo518roundToPx0680j_44 + i10, f5, receiver.getDensity());
                    }
                }, 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i3) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i3) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }
        });
    }
}
