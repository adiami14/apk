package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��F\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a-\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\t\u001a8\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aR\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u0011H\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0005H��\u001a \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH��\u001a$\u0010\u001f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"DefaultSelectionHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "handlesCrossed", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/runtime/Composer;I)V", "HandlePopup", "position", "Landroidx/compose/ui/geometry/Offset;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "HandlePopup-ULxng0E", "(JLandroidx/compose/foundation/text/selection/HandleReferencePoint;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionHandle", "SelectionHandle-8fL75-g", "(JZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isHandleLtrDirection", "areHandlesCrossed", "isLeft", "createHandleImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "", "drawSelectionHandle", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt.class */
public final class AndroidSelectionHandles_androidKt {
    @Composable
    public static final void DefaultSelectionHandle(@NotNull final Modifier modifier, final boolean z, @NotNull final ResolvedTextDirection direction, final boolean z2, @Nullable Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Composer startRestartGroup = composer.startRestartGroup(-1892866350);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3;
        if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 = i3 | (startRestartGroup.changed(z) ? 32 : 16);
        }
        int i5 = i4;
        if ((i2 & 896) == 0) {
            i5 = i4 | (startRestartGroup.changed(direction) ? 256 : 128);
        }
        int i6 = i5;
        if ((i2 & 7168) == 0) {
            i6 = i5 | (startRestartGroup.changed(z2) ? 2048 : 1024);
        }
        if (((i6 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m728sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), z, direction, z2), startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                AndroidSelectionHandles_androidKt.DefaultSelectionHandle(Modifier.this, z, direction, z2, composer2, i2 | 1);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L37;
     */
    @androidx.compose.runtime.Composable
    /* renamed from: HandlePopup-ULxng0E  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1038HandlePopupULxng0E(final long r13, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.selection.HandleReferencePoint r15, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m1038HandlePopupULxng0E(long, androidx.compose.foundation.text.selection.HandleReferencePoint, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    @Composable
    /* renamed from: SelectionHandle-8fL75-g  reason: not valid java name */
    public static final void m1039SelectionHandle8fL75g(final long j2, final boolean z, @NotNull final ResolvedTextDirection direction, final boolean z2, @NotNull final Modifier modifier, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(1221598133);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3;
        if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 = i3 | (startRestartGroup.changed(z) ? 32 : 16);
        }
        int i5 = i4;
        if ((i2 & 896) == 0) {
            i5 = i4 | (startRestartGroup.changed(direction) ? 256 : 128);
        }
        int i6 = i5;
        if ((i2 & 7168) == 0) {
            i6 = i5 | (startRestartGroup.changed(z2) ? 2048 : 1024);
        }
        int i7 = i6;
        if ((57344 & i2) == 0) {
            i7 = i6 | (startRestartGroup.changed(modifier) ? 16384 : 8192);
        }
        int i8 = i7;
        if ((458752 & i2) == 0) {
            i8 = i7 | (startRestartGroup.changed(function2) ? 131072 : 65536);
        }
        if (((i8 & 374491) ^ 74898) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            final int i9 = i8;
            m1038HandlePopupULxng0E(j2, isLeft(z, direction, z2) ? HandleReferencePoint.TopRight : HandleReferencePoint.TopLeft, ComposableLambdaKt.composableLambda(startRestartGroup, -819892380, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
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
                    if (function2 == null) {
                        composer2.startReplaceableGroup(386443455);
                        Modifier modifier2 = modifier;
                        boolean z3 = z;
                        ResolvedTextDirection resolvedTextDirection = direction;
                        boolean z4 = z2;
                        int i11 = i9;
                        AndroidSelectionHandles_androidKt.DefaultSelectionHandle(modifier2, z3, resolvedTextDirection, z4, composer2, ((i11 >> 12) & 14) | (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 896) | (i11 & 7168));
                    } else {
                        composer2.startReplaceableGroup(386443693);
                        function2.invoke(composer2, Integer.valueOf((i9 >> 15) & 14));
                    }
                    composer2.endReplaceableGroup();
                }
            }), startRestartGroup, (i8 & 14) | 384);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
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
                AndroidSelectionHandles_androidKt.m1039SelectionHandle8fL75g(j2, z, direction, z2, modifier, function2, composer2, i2 | 1);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
        if (r0 > r0.getHeight()) goto L15;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.ImageBitmap createHandleImage(@org.jetbrains.annotations.NotNull androidx.compose.ui.draw.CacheDrawScope r14, float r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.createHandleImage(androidx.compose.ui.draw.CacheDrawScope, float):androidx.compose.ui.graphics.ImageBitmap");
    }

    @NotNull
    public static final Modifier drawSelectionHandle(@NotNull Modifier modifier, final boolean z, @NotNull final ResolvedTextDirection direction, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1183154520);
                final long m1107getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1107getHandleColor0d7_KjU();
                Modifier.Companion companion = Modifier.Companion;
                final boolean z3 = z;
                final ResolvedTextDirection resolvedTextDirection = direction;
                final boolean z4 = z2;
                Modifier then = composed.then(DrawModifierKt.drawWithCache(companion, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        final ImageBitmap createHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, Size.m2239getWidthimpl(drawWithCache.m2077getSizeNHjbRc()) / 2.0f);
                        final ColorFilter m2456tintxETnrds$default = ColorFilter.Companion.m2456tintxETnrds$default(ColorFilter.Companion, m1107getHandleColor0d7_KjU, 0, 2, null);
                        final boolean z5 = z3;
                        final ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
                        final boolean z6 = z4;
                        return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                                boolean isLeft;
                                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                                onDrawWithContent.drawContent();
                                isLeft = AndroidSelectionHandles_androidKt.isLeft(z5, resolvedTextDirection2, z6);
                                if (!isLeft) {
                                    DrawScope.DefaultImpls.m2883drawImagegbVJVH8$default(onDrawWithContent, createHandleImage, 0L, 0.0f, null, m2456tintxETnrds$default, 0, 46, null);
                                    return;
                                }
                                ImageBitmap imageBitmap = createHandleImage;
                                ColorFilter colorFilter = m2456tintxETnrds$default;
                                long mo2840getCenterF1C5BW0 = onDrawWithContent.mo2840getCenterF1C5BW0();
                                DrawContext drawContext = onDrawWithContent.getDrawContext();
                                long mo2847getSizeNHjbRc = drawContext.mo2847getSizeNHjbRc();
                                drawContext.getCanvas().save();
                                drawContext.getTransform().mo2855scale0AR0LA0(-1.0f, 1.0f, mo2840getCenterF1C5BW0);
                                DrawScope.DefaultImpls.m2883drawImagegbVJVH8$default(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo2848setSizeuvyYCjk(mo2847getSizeNHjbRc);
                            }
                        });
                    }
                }));
                composer.endReplaceableGroup();
                return then;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    public static final boolean isHandleLtrDirection(@NotNull ResolvedTextDirection direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return (direction == ResolvedTextDirection.Ltr && !z) || (direction == ResolvedTextDirection.Rtl && z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLeft(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        return z ? isHandleLtrDirection(resolvedTextDirection, z2) : !isHandleLtrDirection(resolvedTextDirection, z2);
    }
}
