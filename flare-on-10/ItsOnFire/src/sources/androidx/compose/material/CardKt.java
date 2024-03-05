package androidx.compose.material;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
@Metadata(d1 = {"��T\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¬\u0001\u0010��\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001af\u0010��\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "border", "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "Card-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/CardKt.class */
public final class CardKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: Card-9VG74zQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1197Card9VG74zQ(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r24, long r25, long r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r29, float r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r31, @org.jetbrains.annotations.Nullable androidx.compose.foundation.Indication r32, boolean r33, @org.jetbrains.annotations.Nullable java.lang.String r34, @org.jetbrains.annotations.Nullable androidx.compose.ui.semantics.Role r35, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 1561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CardKt.m1197Card9VG74zQ(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c  */
    @androidx.compose.runtime.Composable
    /* renamed from: Card-F-jzlyU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1198CardFjzlyU(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r15, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r16, long r17, long r19, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r21, float r22, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CardKt.m1198CardFjzlyU(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
