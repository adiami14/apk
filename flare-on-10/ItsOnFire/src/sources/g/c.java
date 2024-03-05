package g;

import androidx.appcompat.R;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u001e\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020��2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\"\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"", "darkTheme", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "a", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/Colors;", "Landroidx/compose/material/Colors;", "DarkColorPalette", "b", "LightColorPalette", "app_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:g/c.class */
public final class c {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final Colors f421a = ColorsKt.m1249darkColors2qZNXz8$default(g.a.a(), g.a.c(), g.a.d(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final Colors f422b = ColorsKt.m1251lightColors2qZNXz8$default(g.a.b(), g.a.c(), g.a.d(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null);

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:g/c$a.class */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ boolean f423j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f424k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f425l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f426m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            this.f423j = z;
            this.f424k = function2;
            this.f425l = i2;
            this.f426m = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i2) {
            c.a(this.f423j, this.f424k, composer, this.f425l | 1, this.f426m);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if ((r12 & 1) != 0) goto L34;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a(boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
