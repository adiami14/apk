package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��,\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\u001aF\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/draw/PainterModifierKt.class */
public final class PainterModifierKt {
    @NotNull
    public static final Modifier paint(@NotNull Modifier modifier, @NotNull final Painter painter, final boolean z, @NotNull final Alignment alignment, @NotNull final ContentScale contentScale, final float f2, @Nullable final ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        return modifier.then(new PainterModifier(painter, z, alignment, contentScale, f2, colorFilter, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.draw.PainterModifierKt$paint$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("paint");
                inspectorInfo.getProperties().set("painter", Painter.this);
                inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("alignment", alignment);
                inspectorInfo.getProperties().set("contentScale", contentScale);
                inspectorInfo.getProperties().set("alpha", Float.valueOf(f2));
                inspectorInfo.getProperties().set("colorFilter", colorFilter);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i2 & 8) != 0) {
            contentScale = ContentScale.Companion.getInside();
        }
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z, alignment, contentScale, f2, colorFilter);
    }
}
