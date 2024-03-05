package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0018\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n��\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H��ø\u0001��\"\u0014\u0010��\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/KeyMappingKt.class */
public final class KeyMappingKt {
    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m3676isCtrlPressedZmokQxo(((KeyEvent) obj).m3660unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo918mapZmokQxo(@NotNull android.view.KeyEvent event) {
                KeyCommand keyCommand;
                Intrinsics.checkNotNullParameter(event, "event");
                if (KeyEvent_androidKt.m3678isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3676isCtrlPressedZmokQxo(event)) {
                    long m3672getKeyZmokQxo = KeyEvent_androidKt.m3672getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3076equalsimpl0(m3672getKeyZmokQxo, mappedKeys.m943getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m3076equalsimpl0(m3672getKeyZmokQxo, mappedKeys.m944getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m3076equalsimpl0(m3672getKeyZmokQxo, mappedKeys.m945getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else {
                        keyCommand = null;
                        if (Key.m3076equalsimpl0(m3672getKeyZmokQxo, mappedKeys.m942getDirectionDownEK5gGoQ())) {
                            keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                        }
                    }
                } else if (KeyEvent_androidKt.m3676isCtrlPressedZmokQxo(event)) {
                    long m3672getKeyZmokQxo2 = KeyEvent_androidKt.m3672getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3076equalsimpl0(m3672getKeyZmokQxo2, mappedKeys2.m943getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m3076equalsimpl0(m3672getKeyZmokQxo2, mappedKeys2.m944getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m3076equalsimpl0(m3672getKeyZmokQxo2, mappedKeys2.m945getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m3076equalsimpl0(m3672getKeyZmokQxo2, mappedKeys2.m942getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m3076equalsimpl0(m3672getKeyZmokQxo2, mappedKeys2.m947getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m3076equalsimpl0(m3672getKeyZmokQxo2, mappedKeys2.m941getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m3076equalsimpl0(m3672getKeyZmokQxo2, mappedKeys2.m938getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else {
                        keyCommand = null;
                        if (Key.m3076equalsimpl0(m3672getKeyZmokQxo2, mappedKeys2.m937getBackslashEK5gGoQ())) {
                            keyCommand = KeyCommand.DESELECT;
                        }
                    }
                } else {
                    keyCommand = null;
                    if (KeyEvent_androidKt.m3678isShiftPressedZmokQxo(event)) {
                        long m3672getKeyZmokQxo3 = KeyEvent_androidKt.m3672getKeyZmokQxo(event);
                        MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                        if (Key.m3076equalsimpl0(m3672getKeyZmokQxo3, mappedKeys3.m950getMoveHomeEK5gGoQ())) {
                            keyCommand = KeyCommand.SELECT_HOME;
                        } else {
                            keyCommand = null;
                            if (Key.m3076equalsimpl0(m3672getKeyZmokQxo3, mappedKeys3.m949getMoveEndEK5gGoQ())) {
                                keyCommand = KeyCommand.SELECT_END;
                            }
                        }
                    }
                }
                KeyCommand keyCommand2 = keyCommand;
                if (keyCommand == null) {
                    keyCommand2 = KeyMapping.this.mo918mapZmokQxo(event);
                }
                return keyCommand2;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            /* JADX WARN: Code restructure failed: missing block: B:60:0x018c, code lost:
                if (androidx.compose.ui.input.key.Key.m3076equalsimpl0(r0, r0.m948getInsertEK5gGoQ()) != false) goto L21;
             */
            @Override // androidx.compose.foundation.text.KeyMapping
            @org.jetbrains.annotations.Nullable
            /* renamed from: map-ZmokQxo */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public androidx.compose.foundation.text.KeyCommand mo918mapZmokQxo(@org.jetbrains.annotations.NotNull android.view.KeyEvent r6) {
                /*
                    Method dump skipped, instructions count: 669
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1.mo918mapZmokQxo(android.view.KeyEvent):androidx.compose.foundation.text.KeyCommand");
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
