package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010%\n\u0002\u0010��\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018�� \u001a2\u00020\u0001:\u0002\u001a\u001bB/\u0012(\b\u0002\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003¢\u0006\u0002\u0010\bJ(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0002\b\u0016H\u0017¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J(\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0010R\u00020��0\u0003X\u0082\u0004¢\u0006\u0002\n��R.\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "savedStates", "", "", "", "", "", "(Ljava/util/Map;)V", "parentSaveableStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getParentSaveableStateRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "setParentSaveableStateRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "registryHolders", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "SaveableStateProvider", "", "key", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "removeState", "saveAll", "Companion", "RegistryHolder", "runtime-saveable_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/saveable/SaveableStateHolderImpl.class */
final class SaveableStateHolderImpl implements SaveableStateHolder {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(new Function2<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Map<Object, Map<String, List<Object>>> invoke(@NotNull SaverScope Saver2, @NotNull SaveableStateHolderImpl it) {
            Map<Object, Map<String, List<Object>>> saveAll;
            Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            saveAll = it.saveAll();
            return saveAll;
        }
    }, new Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final SaveableStateHolderImpl invoke2(@NotNull Map<Object, Map<String, List<Object>>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SaveableStateHolderImpl(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ SaveableStateHolderImpl invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return invoke2((Map<Object, Map<String, List<Object>>>) map);
        }
    });
    @Nullable
    private SaveableStateRegistry parentSaveableStateRegistry;
    @NotNull
    private final Map<Object, RegistryHolder> registryHolders;
    @NotNull
    private final Map<Object, Map<String, List<Object>>> savedStates;

    @Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }

    @Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n��\b\u0086\u0004\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J.\u0010\u0010\u001a\u00020\u00112&\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00140\u0013R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", "key", "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "shouldSave", "", "getShouldSave", "()Z", "setShouldSave", "(Z)V", "saveTo", "", "map", "", "", "", "", "runtime-saveable_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder.class */
    public final class RegistryHolder {
        @NotNull
        private final Object key;
        @NotNull
        private final SaveableStateRegistry registry;
        private boolean shouldSave;
        public final /* synthetic */ SaveableStateHolderImpl this$0;

        public RegistryHolder(@NotNull final SaveableStateHolderImpl this$0, Object key) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(key, "key");
            this.this$0 = this$0;
            this.key = key;
            this.shouldSave = true;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry((Map) this$0.savedStates.get(key), new Function1<Object, Boolean>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$RegistryHolder$registry$1
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SaveableStateRegistry parentSaveableStateRegistry = SaveableStateHolderImpl.this.getParentSaveableStateRegistry();
                    return Boolean.valueOf(parentSaveableStateRegistry == null ? true : parentSaveableStateRegistry.canBeSaved(it));
                }
            });
        }

        @NotNull
        public final Object getKey() {
            return this.key;
        }

        @NotNull
        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void saveTo(@NotNull Map<Object, Map<String, List<Object>>> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            if (this.shouldSave) {
                map.put(this.key, this.registry.performSave());
            }
        }

        public final void setShouldSave(boolean z) {
            this.shouldSave = z;
        }
    }

    public SaveableStateHolderImpl() {
        this(null, 1, null);
    }

    public SaveableStateHolderImpl(@NotNull Map<Object, Map<String, List<Object>>> savedStates) {
        Intrinsics.checkNotNullParameter(savedStates, "savedStates");
        this.savedStates = savedStates;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> mutableMap;
        mutableMap = MapsKt__MapsKt.toMutableMap(this.savedStates);
        for (RegistryHolder registryHolder : this.registryHolders.values()) {
            registryHolder.saveTo(mutableMap);
        }
        return mutableMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(@NotNull final Object key, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-111644091);
        startRestartGroup.startReplaceableGroup(-1530021272);
        startRestartGroup.startReusableGroup(ComposerKt.reuseKey, key);
        startRestartGroup.startReplaceableGroup(1516495192);
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue = startRestartGroup.rememberedValue();
        RegistryHolder registryHolder = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            SaveableStateRegistry parentSaveableStateRegistry = getParentSaveableStateRegistry();
            if (!(parentSaveableStateRegistry == null ? true : parentSaveableStateRegistry.canBeSaved(key))) {
                throw new IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            registryHolder = new RegistryHolder(this, key);
            startRestartGroup.updateRememberedValue(registryHolder);
        }
        startRestartGroup.endReplaceableGroup();
        final RegistryHolder registryHolder2 = (RegistryHolder) registryHolder;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder2.getRegistry())}, content, startRestartGroup, (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Map map;
                Map map2;
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                map = SaveableStateHolderImpl.this.registryHolders;
                boolean containsKey = map.containsKey(key);
                Object obj = key;
                if (!(!containsKey)) {
                    throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
                }
                SaveableStateHolderImpl.this.savedStates.remove(key);
                map2 = SaveableStateHolderImpl.this.registryHolders;
                map2.put(key, registryHolder2);
                final SaveableStateHolderImpl.RegistryHolder registryHolder3 = registryHolder2;
                final SaveableStateHolderImpl saveableStateHolderImpl = SaveableStateHolderImpl.this;
                final Object obj2 = key;
                return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Map map3;
                        SaveableStateHolderImpl.RegistryHolder.this.saveTo(saveableStateHolderImpl.savedStates);
                        map3 = saveableStateHolderImpl.registryHolders;
                        map3.remove(obj2);
                    }
                };
            }
        }, startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReusableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$2
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

            public final void invoke(@Nullable Composer composer2, int i3) {
                SaveableStateHolderImpl.this.SaveableStateProvider(key, content, composer2, i2 | 1);
            }
        });
    }

    @Nullable
    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        RegistryHolder registryHolder = this.registryHolders.get(key);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.savedStates.remove(key);
        }
    }

    public final void setParentSaveableStateRegistry(@Nullable SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }
}
