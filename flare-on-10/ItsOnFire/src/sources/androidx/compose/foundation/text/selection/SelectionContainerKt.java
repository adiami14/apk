package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��*\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010��\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\t\u001aJ\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"DisableSelection", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionContainer", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "onSelectionChange", "Lkotlin/Function1;", "children", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/Selection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/SelectionContainerKt.class */
public final class SelectionContainerKt {
    @Composable
    public static final void DisableSelection(@NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2052695570);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(content) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((2 ^ (i3 & 11)) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null)}, content, startRestartGroup, ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$DisableSelection$1
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

            public final void invoke(@Nullable Composer composer2, int i4) {
                SelectionContainerKt.DisableSelection(content, composer2, i2 | 1);
            }
        });
    }

    @Composable
    public static final void SelectionContainer(@Nullable Modifier modifier, @Nullable final Selection selection, @NotNull final Function1<? super Selection, Unit> onSelectionChange, @NotNull final Function2<? super Composer, ? super Integer, Unit> children, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(onSelectionChange, "onSelectionChange");
        Intrinsics.checkNotNullParameter(children, "children");
        Composer startRestartGroup = composer.startRestartGroup(-525718728);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 = i4 | 48;
        } else {
            i5 = i4;
            if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i5 = i4 | (startRestartGroup.changed(selection) ? 32 : 16);
            }
        }
        if ((i3 & 4) != 0) {
            i6 = i5 | 384;
        } else {
            i6 = i5;
            if ((i2 & 896) == 0) {
                i6 = i5 | (startRestartGroup.changed(onSelectionChange) ? 256 : 128);
            }
        }
        if ((i3 & 8) != 0) {
            i7 = i6 | 3072;
        } else {
            i7 = i6;
            if ((i2 & 7168) == 0) {
                i7 = i6 | (startRestartGroup.changed(children) ? 2048 : 1024);
            }
        }
        if (((i7 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                modifier = Modifier.Companion;
            }
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            SelectionRegistrarImpl selectionRegistrarImpl = rememberedValue;
            if (rememberedValue == companion.getEmpty()) {
                selectionRegistrarImpl = new SelectionRegistrarImpl();
                startRestartGroup.updateRememberedValue(selectionRegistrarImpl);
            }
            startRestartGroup.endReplaceableGroup();
            SelectionRegistrarImpl selectionRegistrarImpl2 = (SelectionRegistrarImpl) selectionRegistrarImpl;
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            SelectionManager selectionManager = rememberedValue2;
            if (rememberedValue2 == companion.getEmpty()) {
                selectionManager = new SelectionManager(selectionRegistrarImpl2);
                startRestartGroup.updateRememberedValue(selectionManager);
            }
            startRestartGroup.endReplaceableGroup();
            final SelectionManager selectionManager2 = (SelectionManager) selectionManager;
            selectionManager2.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            selectionManager2.setClipboardManager((ClipboardManager) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
            selectionManager2.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager2.setOnSelectionChange(onSelectionChange);
            selectionManager2.setSelection(selection);
            selectionManager2.setTouchMode(TouchMode_androidKt.isInTouchMode());
            final Modifier modifier2 = modifier;
            final int i9 = i7;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{SelectionRegistrarKt.getLocalSelectionRegistrar().provides(selectionRegistrarImpl2)}, ComposableLambdaKt.composableLambda(startRestartGroup, -819893315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3
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

                @Composable
                public final void invoke(@Nullable Composer composer2, int i10) {
                    if (((i10 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Modifier then = Modifier.this.then(selectionManager2.getModifier());
                    final Function2<Composer, Integer, Unit> function2 = children;
                    final int i11 = i9;
                    final SelectionManager selectionManager3 = selectionManager2;
                    SimpleLayoutKt.SimpleLayout(then, ComposableLambdaKt.composableLambda(composer2, -819893383, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
                            if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L35;
                         */
                        @androidx.compose.runtime.Composable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14) {
                            /*
                                Method dump skipped, instructions count: 327
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                        }
                    }), composer2, 48, 0);
                }
            }), startRestartGroup, 56);
            EffectsKt.DisposableEffect(selectionManager2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final SelectionManager selectionManager3 = SelectionManager.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            SelectionManager.this.hideSelectionToolbar$foundation_release();
                        }
                    };
                }
            }, startRestartGroup, 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5
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

            public final void invoke(@Nullable Composer composer2, int i10) {
                SelectionContainerKt.SelectionContainer(Modifier.this, selection, onSelectionChange, children, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
        if (r0 == r0.getEmpty()) goto L29;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SelectionContainer(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r9, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, final int r12, final int r13) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: SelectionContainer$lambda-1  reason: not valid java name */
    private static final Selection m1063SelectionContainer$lambda1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }
}
