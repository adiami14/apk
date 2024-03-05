package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��¬\u0001\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n��\n\u0002\u0010\u000e\n��\u001a0\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020-2\u0011\u0010:\u001a\r\u0012\u0004\u0012\u0002060;¢\u0006\u0002\b<H\u0001¢\u0006\u0002\u0010=\u001a\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002\"\u0019\u0010��\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004\"$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018GX\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0004\"\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018GX\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0004\"\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0001¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u0004\"\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0001¢\u0006\b\n��\u001a\u0004\b\u001f\u0010\u0004\"\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0001¢\u0006\b\n��\u001a\u0004\b\"\u0010\u0004\"\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b%\u0010\u0004\"\u0019\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u0001¢\u0006\b\n��\u001a\u0004\b(\u0010\u0004\"\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0001¢\u0006\b\n��\u001a\u0004\b+\u0010\u0004\"\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0001¢\u0006\b\n��\u001a\u0004\b.\u0010\u0004\"\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0001¢\u0006\b\n��\u001a\u0004\b1\u0010\u0004\"\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0001¢\u0006\b\n��\u001a\u0004\b4\u0010\u0004¨\u0006B"}, d2 = {"LocalAccessibilityManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAutofill", "Landroidx/compose/ui/autofill/Autofill;", "getLocalAutofill$annotations", "()V", "getLocalAutofill", "LocalAutofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getLocalAutofillTree$annotations", "getLocalAutofillTree", "LocalClipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getLocalClipboardManager", "LocalDensity", "Landroidx/compose/ui/unit/Density;", "getLocalDensity", "LocalFocusManager", "Landroidx/compose/ui/focus/FocusManager;", "getLocalFocusManager", "LocalFontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLocalFontLoader", "LocalHapticFeedback", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getLocalHapticFeedback", "LocalInputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getLocalInputModeManager", "LocalLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLocalLayoutDirection", "LocalPointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getLocalPointerIconService", "LocalTextInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getLocalTextInputService", "LocalTextToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getLocalTextToolbar", "LocalUriHandler", "Landroidx/compose/ui/platform/UriHandler;", "getLocalUriHandler", "LocalViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getLocalViewConfiguration", "LocalWindowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getLocalWindowInfo", "ProvideCommonCompositionLocals", "", "owner", "Landroidx/compose/ui/node/Owner;", "uriHandler", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "noLocalProvidedFor", "", "name", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/CompositionLocalsKt.class */
public final class CompositionLocalsKt {
    @NotNull
    private static final ProvidableCompositionLocal<AccessibilityManager> LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(new Function0<AccessibilityManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final AccessibilityManager invoke() {
            return null;
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<Autofill> LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(new Function0<Autofill>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Autofill invoke() {
            return null;
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<AutofillTree> LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(new Function0<AutofillTree>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final AutofillTree invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<ClipboardManager> LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(new Function0<ClipboardManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ClipboardManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<Density> LocalDensity = CompositionLocalKt.staticCompositionLocalOf(new Function0<Density>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Density invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalDensity");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<FocusManager> LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(new Function0<FocusManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FocusManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<Font.ResourceLoader> LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(new Function0<Font.ResourceLoader>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Font.ResourceLoader invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<HapticFeedback> LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(new Function0<HapticFeedback>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final HapticFeedback invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<InputModeManager> LocalInputModeManager = CompositionLocalKt.staticCompositionLocalOf(new Function0<InputModeManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final InputModeManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<LayoutDirection> LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(new Function0<LayoutDirection>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LayoutDirection invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<TextInputService> LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(new Function0<TextInputService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final TextInputService invoke() {
            return null;
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<TextToolbar> LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(new Function0<TextToolbar>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TextToolbar invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<UriHandler> LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(new Function0<UriHandler>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final UriHandler invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<ViewConfiguration> LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(new Function0<ViewConfiguration>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewConfiguration invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<WindowInfo> LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(new Function0<WindowInfo>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final WindowInfo invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    });
    @NotNull
    private static final ProvidableCompositionLocal<PointerIconService> LocalPointerIconService = CompositionLocalKt.staticCompositionLocalOf(new Function0<PointerIconService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final PointerIconService invoke() {
            return null;
        }
    });

    @Composable
    @ExperimentalComposeUiApi
    public static final void ProvideCommonCompositionLocals(@NotNull final Owner owner, @NotNull final UriHandler uriHandler, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uriHandler, "uriHandler");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1527607293);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(owner) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3;
        if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 = i3 | (startRestartGroup.changed(uriHandler) ? 32 : 16);
        }
        int i5 = i4;
        if ((i2 & 896) == 0) {
            i5 = i4 | (startRestartGroup.changed(content) ? 256 : 128);
        }
        if (((i5 & 731) ^ 146) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusManager()), LocalFontLoader.provides(owner.getFontLoader()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService())}, content, startRestartGroup, ((i5 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
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

            public final void invoke(@Nullable Composer composer2, int i6) {
                CompositionLocalsKt.ProvideCommonCompositionLocals(Owner.this, uriHandler, content, composer2, i2 | 1);
            }
        });
    }

    @NotNull
    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return LocalAutofill;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return LocalDensity;
    }

    @NotNull
    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return LocalFocusManager;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return LocalFontLoader;
    }

    @NotNull
    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    @NotNull
    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    @NotNull
    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    @NotNull
    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return LocalTextInputService;
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    @NotNull
    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return LocalUriHandler;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    @NotNull
    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
