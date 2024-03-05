package androidx.compose.runtime.internal;

import androidx.appcompat.R;
import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��.\n��\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H��\u001a(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a \u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H��\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H��\u001a\u0016\u0010\u0012\u001a\u00020\f*\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H��\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��¨\u0006\u0015"}, d2 = {"BITS_PER_SLOT", "", "SLOTS_PER_INT", "bitsForSlot", "bits", "slot", "composableLambda", "Landroidx/compose/runtime/internal/ComposableLambda;", "composer", "Landroidx/compose/runtime/Composer;", "key", "tracked", "", "block", "", "composableLambdaInstance", "differentBits", "sameBits", "replacableWith", "Landroidx/compose/runtime/RecomposeScope;", "other", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/internal/ComposableLambdaKt.class */
public final class ComposableLambdaKt {
    private static final int BITS_PER_SLOT = 3;
    private static final int SLOTS_PER_INT = 10;

    public static final int bitsForSlot(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda composableLambda(@NotNull Composer composer, int i2, boolean z, @NotNull Object block) {
        ComposableLambdaImpl composableLambdaImpl;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(i2);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i2, z);
            composer.updateRememberedValue(composableLambdaImpl);
        } else if (rememberedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
        } else {
            composableLambdaImpl = (ComposableLambdaImpl) rememberedValue;
        }
        composableLambdaImpl.update(block);
        composer.endReplaceableGroup();
        return composableLambdaImpl;
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda composableLambdaInstance(int i2, boolean z, @NotNull Object block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i2, z);
        composableLambdaImpl.update(block);
        return composableLambdaImpl;
    }

    public static final int differentBits(int i2) {
        return bitsForSlot(2, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.getAnchor(), ((androidx.compose.runtime.RecomposeScopeImpl) r4).getAnchor()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean replacableWith(@org.jetbrains.annotations.Nullable androidx.compose.runtime.RecomposeScope r3, @org.jetbrains.annotations.NotNull androidx.compose.runtime.RecomposeScope r4) {
        /*
            r0 = r4
            java.lang.String r1 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r3
            if (r0 == 0) goto L45
            r0 = r3
            boolean r0 = r0 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r0 == 0) goto L40
            r0 = r4
            boolean r0 = r0 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r0 == 0) goto L40
            r0 = r3
            androidx.compose.runtime.RecomposeScopeImpl r0 = (androidx.compose.runtime.RecomposeScopeImpl) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0.getValid()
            if (r0 == 0) goto L45
            r0 = r3
            r1 = r4
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L45
            r0 = r5
            androidx.compose.runtime.Anchor r0 = r0.getAnchor()
            r1 = r4
            androidx.compose.runtime.RecomposeScopeImpl r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1
            androidx.compose.runtime.Anchor r1 = r1.getAnchor()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L40
            goto L45
        L40:
            r0 = 0
            r6 = r0
            goto L47
        L45:
            r0 = 1
            r6 = r0
        L47:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.internal.ComposableLambdaKt.replacableWith(androidx.compose.runtime.RecomposeScope, androidx.compose.runtime.RecomposeScope):boolean");
    }

    public static final int sameBits(int i2) {
        return bitsForSlot(1, i2);
    }
}
