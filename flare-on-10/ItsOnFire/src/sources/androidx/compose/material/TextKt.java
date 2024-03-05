package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0088\u0001\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u0017\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/TextKt.class */
public final class TextKt {
    @NotNull
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TextStyle invoke() {
            return TextStyle.Companion.getDefault();
        }
    });

    @Composable
    public static final void ProvideTextStyle(@NotNull final TextStyle value, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1919620829);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3;
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 = i3 | (startRestartGroup.changed(content) ? 32 : 16);
        }
        if (((i4 & 91) ^ 18) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(value))}, content, startRestartGroup, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
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

            public final void invoke(@Nullable Composer composer2, int i5) {
                TextKt.ProvideTextStyle(TextStyle.this, content, composer2, i2 | 1);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /* renamed from: Text--4IGK_g  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1628Text4IGK_g(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.AnnotatedString r29, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r30, long r31, long r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontStyle r35, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontWeight r36, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontFamily r37, long r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextDecoration r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextAlign r41, long r42, int r44, boolean r45, int r46, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r47, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r48, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r49, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1628Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /* renamed from: Text-fLXpl1I  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1629TextfLXpl1I(@org.jetbrains.annotations.NotNull final java.lang.String r29, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r30, long r31, long r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontStyle r35, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontWeight r36, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontFamily r37, long r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextDecoration r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextAlign r41, long r42, int r44, boolean r45, int r46, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r47, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r48, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1629TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }
}
